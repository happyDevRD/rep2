package com.greenaall.archive.service;

import java.io.File;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.greenaall.archive.dto.ArchiveEnvioResultadoDto;
import com.greenaall.archive.dto.ArchiveGenerarSipRequestDto;
import com.greenaall.archive.dto.ArchiveRegistrarEnvioRequest;
import com.greenaall.inside.mapper.InsideIflowMapper;
import com.greenaall.models.ad.entity.OrganizacionElemento;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.OrganizacionElementoServiceImpl;
import com.greenaall.models.ad.service.OrganizacionUsuarioServiceImpl;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.gf.entity.GfEnvioArchive;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;

@Service
public class ArchiveExpedienteEnvioService {

	private static final Logger log = LoggerFactory.getLogger(ArchiveExpedienteEnvioService.class);

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private IArchivoService archivoService;

	@Autowired
	private InteresadoServiceImpl interesadoService;

	@Autowired
	private PersonaEntidadServiceImpl personaEntidadService;

	@Autowired
	private OrganizacionUsuarioServiceImpl organizacionUsuarioService;

	@Autowired
	private OrganizacionElementoServiceImpl organizacionElementoService;

	@Autowired
	private ArchiveEnvioService archiveEnvioService;

	@Autowired
	private ArchiveSoapEnvelopeBuilder archiveSoapEnvelopeBuilder;

	@Autowired
	private ArchiveSoapClientService archiveSoapClientService;

	@Value("${archive.soap.id-aplicacion:}")
	private String idAplicacion;

	@Value("${archive.soap.centro-archivo:}")
	private String centroArchivo;

	@Value("${archive.soap.metadata.clasificacion-default:}")
	private String clasificacionDefault;

	@Value("${archive.soap.metadata.origen-default:Administracion}")
	private String origenDefault;

	@Value("${archive.soap.metadata.estado-elaboracion-default:EE01}")
	private String estadoElaboracionDefault;

	@Value("${archive.soap.metadata.tipo-documental-default:TD99}")
	private String tipoDocumentalDefault;

	/**
	 * Variante asíncrona para el hook de cierre de expediente: evita que la
	 * petición HTTP de cierre quede bloqueada esperando la respuesta de ARCHIVE.
	 */
	@Async
	public void enviarPreingresoSIPAsync(Long expedienteId, String usuContr) {
		enviarPreingresoSIP(expedienteId, usuContr);
	}

	public ArchiveEnvioResultadoDto enviarPreingresoSIP(Long expedienteId, String usuContr) {
		ArchiveEnvioResultadoDto resultado = new ArchiveEnvioResultadoDto();
		resultado.setModoDryRun(archiveSoapClientService.isModoDryRun());

		try {
			Expediente expediente = expedienteService.findById(expedienteId);
			if (expediente == null) {
				return registrarError(expedienteId, usuContr, resultado, "Expediente no encontrado.");
			}

			if (!EnumEstadoExpediente.CERRADO.equals(expediente.getEstado())
					&& !EnumEstadoExpediente.ARCHIVADO.equals(expediente.getEstado())) {
				return registrarError(expedienteId, usuContr, resultado,
						"El expediente debe estar cerrado para el preingreso en ARCHIVE.");
			}

			String estadoPrevio = archiveEnvioService.obtenerEstadoResumen(expedienteId);
			if (GfEnvioArchive.ESTADO_ENVIADO.equals(estadoPrevio) || GfEnvioArchive.ESTADO_SIMULADO.equals(estadoPrevio)) {
				return registrarError(expedienteId, usuContr, resultado,
						"El expediente ya fue enviado a ARCHIVE anteriormente.");
			}

			String identificador = expediente.getEjercicio().toString() + expediente.getNumero().toString();

			if (archiveSoapClientService.isModoDryRun()) {
				ArchiveEnvioResultadoDto resultadoDryRun = enviarPreingresoSipDryRun(expediente, usuContr,
						identificador, resultado);
				marcarArchivadoSinPropagarError(expediente);
				return resultadoDryRun;
			}

			File zipSip = resolveZipSip(expediente);
			if (zipSip == null || !zipSip.exists()) {
				return registrarError(expedienteId, usuContr, resultado,
						"No se encontró el fichero SIP (.zip) generado en el cierre del expediente.");
			}

			byte[] zipBytes = Files.readAllBytes(zipSip.toPath());
			String zipBase64 = Base64.getEncoder().encodeToString(zipBytes);
			String huella = calcularHuellaMD5(zipBytes);
			String organo = resolveOrgano(expediente);

			ArchiveGenerarSipRequestDto request = new ArchiveGenerarSipRequestDto();
			request.setIdentificadorArchivoDestino(centroArchivo);
			request.setZipBase64(zipBase64);
			request.setHuellaDigital(huella);
			request.setClasificacion(expediente.getSerieDocumental() != null && !expediente.getSerieDocumental().isBlank()
					? expediente.getSerieDocumental()
					: clasificacionDefault);
			request.setFechaApertura(formatearFecha(expediente.getFecInicio()));
			request.setFechaFin(formatearFecha(expediente.getFecFin()));
			request.setOrganoExpediente(organo);
			request.setInteresado(resolveInteresados(expediente));
			request.setOrigen(origenDefault);
			request.setEstadoElaboracion(estadoElaboracionDefault);
			request.setTipoDocumental(tipoDocumentalDefault);
			request.setOrganoDocumento(organo);
			request.setFechaCaptura(formatearFecha(new Date()));

			String envelope = archiveSoapEnvelopeBuilder.buildGenerarYPreingresarSIPIdentificadoresEnvelope(
					idAplicacion, request);
			String soapAction = archiveSoapEnvelopeBuilder.buildSoapActionGenerarYPreingresarSIPIdentificadores();
			ArchiveSoapParsedResponse soapResponse = archiveSoapClientService.invoke(
					ArchiveEnvioService.OPERACION_GENERAR_Y_PREINGRESAR_SIP, soapAction, envelope, identificador);

			if (soapResponse.hasFault()) {
				return registrarError(expedienteId, usuContr, resultado, soapResponse.getFaultString());
			}

			if (soapResponse.hasErrorArchive()) {
				return registrarError(expedienteId, usuContr, resultado, soapResponse.getDescripcionError());
			}

			if (!soapResponse.isSuccess()) {
				return registrarError(expedienteId, usuContr, resultado,
						"ARCHIVE no devolvió confirmación de preingreso.");
			}

			resultado.setExito(true);
			resultado.setCodigoRespuesta(soapResponse.getRetorno());
			resultado.setIdentificadorEni(soapResponse.getPrimerIdentificadorEni());
			// El parser solo captura un tag genérico <descripcion>, reutilizado aquí:
			// ARCHIVE lo rellena tanto en fallos como en confirmaciones de éxito.
			resultado.setDescripcionRespuesta(soapResponse.getDescripcionError());
			registrarExito(expedienteId, usuContr, resultado);
			marcarArchivadoSinPropagarError(expediente);

			return resultado;
		} catch (Exception e) {
			log.error("Fallo en preingreso ARCHIVE para expediente {}", expedienteId, e);
			String mensaje = e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName();
			return registrarError(expedienteId, usuContr, resultado, mensaje);
		}
	}

	/**
	 * El envío SOAP a ARCHIVE ya tuvo éxito y quedó registrado en gf_envio_archive
	 * antes de esta llamada: un fallo aquí no debe reportarse como fallo del envío
	 * ni disparar un reintento que duplique el preingreso en RedSARA.
	 */
	private void marcarArchivadoSinPropagarError(Expediente expediente) {
		try {
			expediente.setEstado(EnumEstadoExpediente.ARCHIVADO);
			expediente.setFecContr(new Date());
			expedienteService.save(expediente);
		} catch (Exception e) {
			log.error("Preingreso ARCHIVE del expediente {} confirmado pero no se pudo marcar ARCHIVADO localmente",
					expediente.getId(), e);
		}
	}

	private ArchiveEnvioResultadoDto enviarPreingresoSipDryRun(Expediente expediente, String usuContr,
			String identificador, ArchiveEnvioResultadoDto resultado) throws Exception {
		String soapAction = archiveSoapEnvelopeBuilder.buildSoapActionGenerarYPreingresarSIPIdentificadores();
		ArchiveSoapParsedResponse soapResponse = archiveSoapClientService.invoke(
				ArchiveEnvioService.OPERACION_GENERAR_Y_PREINGRESAR_SIP, soapAction, "<dryRun/>", identificador);

		resultado.setExito(true);
		resultado.setModoDryRun(true);
		resultado.setCodigoRespuesta(soapResponse.getRetorno() != null ? soapResponse.getRetorno() : "OK");
		resultado.setIdentificadorEni(soapResponse.getPrimerIdentificadorEni() != null
				? soapResponse.getPrimerIdentificadorEni()
				: "ENI-ARCHIVE-SIM-" + expediente.getId());
		resultado.getAdvertencias().add("Modo simulación: no se leyó el SIP de disco ni se llamó a ARCHIVE.");
		registrarExito(expediente.getId(), usuContr, resultado);
		return resultado;
	}

	private File resolveZipSip(Expediente expediente) {
		if (expediente.getArchivo() == null) {
			return null;
		}

		Archivo archivoVisualizacion = archivoService.findById(expediente.getArchivo());
		if (archivoVisualizacion == null || archivoVisualizacion.getDesArchi() == null) {
			return null;
		}

		String identificador = expediente.getEjercicio().toString() + expediente.getNumero().toString();
		File visualizacion = new File(archivoVisualizacion.getDesArchi());
		return new File(visualizacion.getParent(), identificador + ".zip");
	}

	private String resolveOrgano(Expediente expediente) {
		String organo = "L99999999";
		List<OrganizacionUsuario> organizacionUsuarios = organizacionUsuarioService
				.findByUsuario2(expediente.getInstructor());
		if (organizacionUsuarios != null && !organizacionUsuarios.isEmpty()) {
			OrganizacionElemento organizacionElemento = organizacionElementoService
					.findById(organizacionUsuarios.get(0).getIdOrgEleme());
			if (organizacionElemento != null && organizacionElemento.getOrgano() != null) {
				organo = organizacionElemento.getOrgano();
			}
		}
		return organo;
	}

	private String resolveInteresados(Expediente expediente) {
		List<Interesado> interesados = interesadoService.findByExpediente(expediente.getId());
		List<String> documentos = new ArrayList<>();
		if (interesados != null) {
			for (Interesado interesado : interesados) {
				PersonaEntidadPK personaEntidadPK = new PersonaEntidadPK();
				personaEntidadPK.setIdHisPerso(interesado.getIdHisPerso());
				personaEntidadPK.setIdPerso(interesado.getIdPerso());
				PersonaEntidad personaEntidad = personaEntidadService.findById(personaEntidadPK);
				if (personaEntidad != null && personaEntidad.getNumDocum() != null) {
					documentos.add(personaEntidad.getNumDocum());
				}
			}
		}
		return String.join("; ", documentos);
	}

	private String calcularHuellaMD5(byte[] contenido) throws Exception {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] hash = digest.digest(contenido);
		StringBuilder hex = new StringBuilder();
		for (byte b : hash) {
			hex.append(String.format("%02x", b));
		}
		return hex.toString();
	}

	private String formatearFecha(Date fecha) {
		if (fecha == null) {
			return "";
		}
		return InsideIflowMapper.formatFechaEniDate(fecha);
	}

	private ArchiveEnvioResultadoDto registrarExito(Long expedienteId, String usuContr,
			ArchiveEnvioResultadoDto resultado) {
		ArchiveRegistrarEnvioRequest request = new ArchiveRegistrarEnvioRequest();
		request.setIdExpediente(expedienteId);
		request.setOperacion(ArchiveEnvioService.OPERACION_GENERAR_Y_PREINGRESAR_SIP);
		request.setEstadoEnvio(archiveSoapClientService.isModoDryRun()
				? GfEnvioArchive.ESTADO_SIMULADO
				: GfEnvioArchive.ESTADO_ENVIADO);
		request.setCodigoRespuesta(resultado.getCodigoRespuesta());
		request.setDescripcionRespuesta(resultado.getDescripcionRespuesta());
		request.setIdentificadorEni(resultado.getIdentificadorEni());
		request.setModoDryRun(archiveSoapClientService.isModoDryRun());
		request.setUsuContr(usuContr);
		archiveEnvioService.registrar(request);
		return resultado;
	}

	private ArchiveEnvioResultadoDto registrarError(Long expedienteId, String usuContr,
			ArchiveEnvioResultadoDto resultado, String mensaje) {
		resultado.setExito(false);
		resultado.setMensajeError(mensaje);

		ArchiveRegistrarEnvioRequest request = new ArchiveRegistrarEnvioRequest();
		request.setIdExpediente(expedienteId);
		request.setOperacion(ArchiveEnvioService.OPERACION_GENERAR_Y_PREINGRESAR_SIP);
		request.setEstadoEnvio(GfEnvioArchive.ESTADO_ERROR);
		request.setMensajeError(mensaje);
		request.setModoDryRun(archiveSoapClientService.isModoDryRun());
		request.setUsuContr(usuContr);
		archiveEnvioService.registrar(request);
		return resultado;
	}
}
