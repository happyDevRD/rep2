package com.greenaall.ge.archivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.ErrorEnvioEmail;
import com.greenaall.exception.ExcepcionDocumentoEnEfirma;
import com.greenaall.exception.ExcepcionSolicitudFirmado;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.ge.dto.Peticion;
import com.greenaall.ge.dto.PeticionFirmaRespuesta;
import com.greenaall.ge.firma.ConectorEFirma;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.ge.dto.ArchivoEx;
import com.greenaall.models.ge.dto.CargoEx;
import com.greenaall.models.ge.dto.DatosFirma;
import com.greenaall.models.ge.dto.DatosFirmaDto;
import com.greenaall.models.ge.dto.FirmaEx;
import com.greenaall.models.ge.dto.PersonaFirmante;
import com.greenaall.models.ge.dto.ProcesoFirmadoEx;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.CargoFirma;
import com.greenaall.models.ge.entity.CargoPersona;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.entity.PeticionFirma;
import com.greenaall.models.ge.entity.PeticionFirmante;
import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.models.ge.entity.Firma;
import com.greenaall.models.ge.service.CargoFirmaServiceImpl;
import com.greenaall.models.ge.service.CargoPersonaServiceImpl;
import com.greenaall.models.ge.service.FirmaServiceImpl;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.ge.service.IUsuarioService;
import com.greenaall.models.ge.service.PeticionFirmaServiceImpl;
import com.greenaall.models.ge.service.PeticionFirmanteServiceImpl;
import com.greenaall.models.ge.service.ProcesoFirmadoServiceImpl;
import com.greenaall.models.pe.entity.PersonaContacto;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaContactoServiceImpl;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.util.Cadena;
import com.greenaall.util.ConvertirPDF;
import com.greenaall.util.Fecha;
import com.greenaall.util.Formateador;
import com.greenaall.util.Utiles;

/**
 * Casos de uso de orquestación extraídos de {@code ArchivoController}: envío
 * de documentos a firma electrónica (eFirma) y construcción de las etiquetas
 * de fusión de plantillas.
 */
@Service
public class ArchivoApplicationService {

	@Autowired
	private IArchivoService archivoService;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;

	@Autowired
	private TramiteServiceImpl serviceTramite;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private ProcesoFirmadoServiceImpl serviceProcesoFirmado;

	@Autowired
	private TareaProcedimientoServiceImpl serviceTareaProcedimietno;

	@Autowired
	private FirmaServiceImpl serviceFirma;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private CargoFirmaServiceImpl serviceCargoFirma;

	@Autowired
	private CargoPersonaServiceImpl serviceCargoPersona;

	@Autowired
	private PeticionFirmaServiceImpl servicePeticionFirma;

	@Autowired
	private PeticionFirmanteServiceImpl servicePeticionFirmante;

	@Autowired
	private PersonaContactoServiceImpl servicePersonaContacto;

	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private ProcedimientoServiceImpl serviceProcedimiento;

	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;

	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;

	/**
	 * Orquesta el envío de un documento a firma electrónica atendida: valida
	 * el proceso de firma configurado, prepara los firmantes y el documento
	 * (convirtiendo/fusionando plantillas si procede), lo envía al conector
	 * de eFirma, notifica por correo a los firmantes con correo corporativo y
	 * deja constancia en el histórico de la tarea.
	 */
	public PeticionFirma envioEFirma(DatosFirmaDto datosFirmaDto, String usuario, Long idTarea) throws Exception {

		String[] aCorreoCorporativo = null;
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionSolicitudFirmado();
		}

		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		Archivo oArchivoBuscar = archivoService.findById(oTareaTramiteExpediente.getArchivo());
		if (oArchivoBuscar != null && oArchivoBuscar.getIdPeticion() != null) {
			throw new ExcepcionDocumentoEnEfirma(oArchivoBuscar.getIdPeticion().toString());
		}

		Tramite oTramiteExpediente = serviceTramite.findById(oTareaTramiteExpediente.getTramite());
		Expediente oExpediente = serviceExpediente.findById(oTramiteExpediente.getExpediente());
		TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimietno
				.findById(oTareaTramiteExpediente.getTareaProcedimiento());
		if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
			System.err.println("La tarea del procedimiento no tiene proceso firmado");
			throw new ExcepcionSolicitudFirmado();
		}

		ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
		if (oProcesoFirmado == null) {
			System.err.println("No existe proceso firmado");
			throw new ExcepcionSolicitudFirmado();
		}

		if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
			System.err.println("Es firma desatendida");
			throw new ExcepcionSolicitudFirmado();
		}

		List<Firma> aFirma = serviceFirma.findByIdProFirma(oProcesoFirmado.getIdProFirma());

		if (aFirma == null || aFirma.isEmpty()) {
			System.err.println("No existe firma");
			throw new ExcepcionSolicitudFirmado();
		}

		DatosFirma oDatosFirma = new DatosFirma();
		oDatosFirma.setAsunto(datosFirmaDto.getAsunto());
		oDatosFirma.setTexto(datosFirmaDto.getTexto());
		oDatosFirma.setFecFin(Fecha.sumaMeses(new Date(), 1));
		oDatosFirma.setFecInicio(new Date());

		if (datosFirmaDto.getPrioridad().equals(Short.valueOf((short) 0))) {
			oDatosFirma.setPrioridad(Byte.valueOf((byte) 0));
		} else if (datosFirmaDto.getPrioridad().equals(Short.valueOf((short) 1))) {
			oDatosFirma.setPrioridad(Byte.valueOf((byte) 1));
		} else if (datosFirmaDto.getPrioridad().equals(Short.valueOf((short) 2))) {
			oDatosFirma.setPrioridad(Byte.valueOf((byte) 2));
		} else {
			oDatosFirma.setPrioridad(Byte.valueOf((byte) 1));
		}

		Usuario oUsuario = usuarioService.findById(usuario);

		if (oUsuario.getIdHisPerso() == null) {
			System.err.println("El usuario no tiene DNI");
			throw new ExcepcionSolicitudFirmado();
		}

		PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
		oPersonaEntidadPK.setIdHisPerso(oUsuario.getIdHisPerso());
		oPersonaEntidadPK.setIdPerso(oUsuario.getIdPerso());
		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);

		if (oPersonaEntidad == null) {
			System.err.println("No existe la persona");
			throw new ExcepcionSolicitudFirmado();
		}

		Peticion peticion = new Peticion();
		peticion.setNumDocRemit(oPersonaEntidad.getNumDocum());
		peticion.setDesRemit(oPersonaEntidad.getDesPerEntid());
		peticion.setAsunto(datosFirmaDto.getAsunto());
		peticion.setTexto(datosFirmaDto.getTexto());
		peticion.setAplicacion("iflow");
		if (oDatosFirma.getFecInicio() != null) {
			Calendar fecIni = Calendar.getInstance();
			fecIni.setTime(oDatosFirma.getFecInicio());
			peticion.setFecIniFirma(fecIni);
		}

		peticion.setTags("ejeExped=" + oExpediente.getEjercicio().toString() + "&" + "numExped="
				+ oExpediente.getNumero().toString() + "&" + "idExped=" + oExpediente.getId().toString() + "&"
				+ "idProce=" + oExpediente.getProcedimiento().toString() + "&" + "idTarExped="
				+ oTareaTramiteExpediente.getId().toString());
		if (oDatosFirma.getFecFin() != null) {
			Calendar fecFin = Calendar.getInstance();
			fecFin.setTime(oDatosFirma.getFecFin());
			peticion.setFecFinFirma(fecFin);
		}

		if (oProcesoFirmado.getSalida() != null) {
			peticion.setSalida(oProcesoFirmado.getSalida());
		} else {
			peticion.setSalida(Short.valueOf((short) 0));
		}
		peticion.setPrioridad(oDatosFirma.getPrioridad());

		String referencia = Utiles.extraerIniciales(oPersonaEntidad);
		oDatosFirma.setReferencia(referencia);

		FirmaEx[] aFirmaEx = new FirmaEx[aFirma.size()];
		Set<String> listaEmailsContacto = new LinkedHashSet<String>();
		aCorreoCorporativo = new String[aFirma.size()];

		for (int i = 0; i < aFirma.size(); i++) {
			FirmaEx oFirmaEx = new FirmaEx();
			CargoFirma oCargoFirma = serviceCargoFirma.findById(aFirma.get(i).getIdCargo());

			if (oCargoFirma == null) {
				System.err.println("No hay cargo firmante para la firma");
				throw new ExcepcionSolicitudFirmado();
			}

			List<CargoPersona> aCargoPersona = serviceCargoPersona
					.findByIdCargo(Integer.valueOf((oCargoFirma.getCodCargo())));

			if (aCargoPersona == null) {
				System.err.println("No hay cargo persona para el cargo firmante para la firma");
				throw new ExcepcionSolicitudFirmado();
			}

			PersonaFirmante firmanteDefecto = new PersonaFirmante();

			if (aCargoPersona.get(0).getSuplencia().equals(Short.valueOf((short) 0))
					&& aCargoPersona.get(0).getIdHisTitular() != null) {
				PersonaEntidadPK oPersonaEntidadTituPK = new PersonaEntidadPK();
				oPersonaEntidadTituPK.setIdHisPerso(aCargoPersona.get(0).getIdHisTitular());
				oPersonaEntidadTituPK.setIdPerso(aCargoPersona.get(0).getIdTitular());
				PersonaEntidad oPersonaEntidadTitu = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
				firmanteDefecto.setDesPerso(oPersonaEntidadTitu.getDesPerEntid());
				firmanteDefecto.setNumDocum(oPersonaEntidadTitu.getNumDocum());
				firmanteDefecto.setIdHisPerso(aCargoPersona.get(0).getIdHisTitular());
				firmanteDefecto.setIdPerso(aCargoPersona.get(0).getIdTitular());
			} else if (aCargoPersona.get(0).getSuplencia().equals(Short.valueOf((short) 1))
					&& aCargoPersona.get(0).getIdHisSuple() != null) {
				PersonaEntidadPK oPersonaEntidadSuplePK = new PersonaEntidadPK();
				oPersonaEntidadSuplePK.setIdHisPerso(aCargoPersona.get(0).getIdHisSuple());
				oPersonaEntidadSuplePK.setIdPerso(aCargoPersona.get(0).getIdSuple());
				PersonaEntidad oPersonaEntidadSuple = servicePersonaEntidad.findById(oPersonaEntidadSuplePK);
				firmanteDefecto.setDesPerso(oPersonaEntidadSuple.getDesPerEntid());
				firmanteDefecto.setNumDocum(oPersonaEntidadSuple.getNumDocum());
				firmanteDefecto.setIdHisPerso(aCargoPersona.get(0).getIdHisSuple());
				firmanteDefecto.setIdPerso(aCargoPersona.get(0).getIdSuple());
			}

			CargoEx nuevoCargoEx = new CargoEx();
			nuevoCargoEx.setCarPlata(oCargoFirma.getCarPlata());
			nuevoCargoEx.setCodCargo(oCargoFirma.getCodCargo());
			nuevoCargoEx.setDescripcion(oCargoFirma.getCarPlata());
			nuevoCargoEx.setFecContr(new Date());
			nuevoCargoEx.setUsuContr(usuario);
			nuevoCargoEx.setFirmanteDefecto(firmanteDefecto);

			oFirmaEx.setCargo(nuevoCargoEx);
			oFirmaEx.setFecContr(new Date());
			oFirmaEx.setIdCargo(null);
			oFirmaEx.setIdFirma(null);
			oFirmaEx.setIdProFirma(null);
			oFirmaEx.setIndTipo(null);
			oFirmaEx.setOrden(aFirma.get(i).getOrden());
			oFirmaEx.setUsuContr(usuario);

			List<PersonaContacto> emailsContacto = servicePersonaContacto
					.findByIdHisPersoAndIdPerso(firmanteDefecto.getIdHisPerso(), firmanteDefecto.getIdPerso());
			if (emailsContacto != null) {
				for (int h = 0; h < emailsContacto.size(); h++) {
					if (Short.valueOf((short) 1).equals(emailsContacto.get(h).getRecNotif())
							&& emailsContacto.get(h).getDatConta() != null) {
						listaEmailsContacto.add(emailsContacto.get(h).getDatConta().trim().toLowerCase());
					}
					if (emailsContacto.get(h).getTipConta() != null
							&& emailsContacto.get(h).getTipConta().equals(Short.valueOf((short) 7))
							&& emailsContacto.get(h).getDatConta() != null) {
						aCorreoCorporativo[i] = emailsContacto.get(h).getDatConta();
					}
				}
			}
			aFirmaEx[i] = oFirmaEx;
		}

		ProcesoFirmadoEx oProcesoFirmadoEx = new ProcesoFirmadoEx();
		oProcesoFirmadoEx.setActivo(oProcesoFirmado.getActivo());
		oProcesoFirmadoEx.setCodEntid(oProcesoFirmado.getCodEntid());
		oProcesoFirmadoEx.setConDesat(oProcesoFirmado.getCodEntid());
		oProcesoFirmadoEx.setDescripcionCircuito(oProcesoFirmado.getDescripcionCircuito());
		oProcesoFirmadoEx.setDesPlant(oProcesoFirmado.getPlantilla());
		oProcesoFirmadoEx.setFecContr(new Date());
		oProcesoFirmadoEx.setFirmas(aFirmaEx);
		oProcesoFirmadoEx.setIdProFirma(oProcesoFirmado.getIdProFirma());
		oProcesoFirmadoEx.setModulo(oProcesoFirmado.getModulo());
		oProcesoFirmadoEx.setPlantilla(oProcesoFirmado.getPlantilla());
		oProcesoFirmadoEx.setTipFirma(oProcesoFirmado.getTipFirma());
		oProcesoFirmadoEx.setTipPlant(Short.valueOf((short) 4));
		oProcesoFirmadoEx.setUsuContr(usuario);

		ArchivoEx archivosPeticion = new ArchivoEx();
		Archivo oArchviBus = null;
		Archivo oArchivo = archivoService.findById(oTareaTramiteExpediente.getArchivo());

		if (oArchivo == null) {
			System.err.println("No existe el archivo en ge_archivo");
			throw new ExcepcionSolicitudFirmado();
		}

		String extension = Utiles.getExtension(oArchivo.getDesDocum());
		String ruta = null;
		Boolean fusion = null;
		Etiquetas oEtiquetas = getEtiquetas(usuario, oArchivo);
		if (extension.equals(".docx") || extension.equals(".odt") || extension.equals(".doc")
				|| extension.equals(".sxw")) {
			if (extension.equals(".docx") || extension.equals(".doc")) {
				fusion = ArchivoValide.fusionDocumentoDOC(oArchivo.getDesArchiFlow(), oEtiquetas);
				if (!fusion) {
					System.err.println("Se ha producido un error en la fusión ODF");
				}
			}
			if (extension.equals(".odt") || extension.equals(".sxw")) {
				ParametroSistemaPK oParametroSistema2Pk = new ParametroSistemaPK(Long.valueOf((long) 1),
						Long.valueOf((long) 0), "es", Short.valueOf((short) 9307));
				ParametroSistema oParametroSistema2 = parametroSistemaService.findById(oParametroSistema2Pk);
				fusion = ArchivoValide.fusionDocumentoODT(oArchivo.getDesArchiFlow(), oEtiquetas,
						oParametroSistema2.getValor());
				if (!fusion) {
					System.err.println("Se ha producido un error en la fusión ODF");
				}
			}
			ruta = ConvertirPDF.convertirPDF(oArchivo.getDesArchiFlow(), extension);
			Archivo oArchivoNuevo = new Archivo();
			if (oArchivo.getHuella() != null) {
				oArchivoNuevo.setHuella(oArchivo.getHuella());
			}
			oArchivoNuevo.setTipFiche(Short.valueOf((short) 4));
			if (oArchivo.getRefGesDocum() != null) {
				oArchivoNuevo.setRefGesDocum(oArchivo.getRefGesDocum());
			}

			File file = new File(ruta);

			byte[] fileContent;
			try {
				fileContent = Files.readAllBytes(file.toPath());
				oArchivoNuevo.setArcExpd(fileContent);
			} catch (IOException e) {
				e.printStackTrace();
			}

			oArchivoNuevo.setModulo(Short.valueOf((short) 22));
			oArchivoNuevo.setDesArchi(ruta);
			oArchivoNuevo.setDesArchiFlow(ruta);
			oArchivoNuevo.setTipFiche(Short.valueOf((short) 1));
			oArchivoNuevo.setCodProgr(Long.valueOf((long) 0));
			oArchivoNuevo.setDesDocum(file.getName());
			oArchivoNuevo.setFecGenera(new Date());
			oArchivoNuevo.setTipDocum(Long.valueOf((long) 1));
			oArchivoNuevo.setEstado(Short.valueOf((short) 1));
			oArchivoNuevo.setCodEntid(Short.valueOf((short) 1));
			oArchivoNuevo.setFecContr(new Date());
			oArchivoNuevo.setTipFiche(Short.valueOf((short) 4));
			archivoService.save(oArchivoNuevo);

			oArchviBus = archivoService.findByDesArchi(ruta);
			oTareaTramiteExpediente.setArchivo(oArchviBus.getCodArchi());
			serviceTareaTramiteExpediente.save(oTareaTramiteExpediente);

			archivosPeticion.setCodArchi(oArchviBus.getCodArchi());
			archivosPeticion.setCodEntid(oArchviBus.getCodEntid());
			archivosPeticion.setDesArchiFlow(oArchviBus.getDesArchiFlow());
			archivosPeticion.setIdArchivoPeticion(Long.valueOf((long) 1));
			archivosPeticion.setFicheroReferido(new File(oArchviBus.getDesArchiFlow()));
			archivosPeticion.setEstado(null);
			archivosPeticion.setPlantilla(oProcesoFirmado.getPlantilla());
		} else {
			archivosPeticion.setCodArchi(oArchivo.getCodArchi());
			archivosPeticion.setCodEntid(oArchivo.getCodEntid());
			archivosPeticion.setDesArchiFlow(oArchivo.getDesArchiFlow());
			archivosPeticion.setIdArchivoPeticion(Long.valueOf((long) 1));
			archivosPeticion.setFicheroReferido(new File(oArchivo.getDesArchiFlow()));
			archivosPeticion.setEstado(null);
			archivosPeticion.setPlantilla(oProcesoFirmado.getPlantilla());
		}

		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());
		ArchivoEx[] aArchivoEx = new ArchivoEx[1];
		aArchivoEx[0] = archivosPeticion;

		PeticionFirmaRespuesta respuesta = oConectorEF.firmadoAtendido(oDatosFirma, aFirmaEx, aArchivoEx, oUsuario,
				peticion, oPersonaEntidad.getCodMunic(), listaEmailsContacto);

		if (aCorreoCorporativo != null && aCorreoCorporativo.length > 0 && aCorreoCorporativo[0] != null) {
			enviarAvisoFirmaCorreoCorporativo(aCorreoCorporativo, oUsuario, oExpediente);
		}

		PeticionFirma oPeticionFirma = new PeticionFirma();
		oPeticionFirma.setAsunto(respuesta.getAsunto());
		oPeticionFirma.setCodEntid(respuesta.getCodEntid());
		oPeticionFirma.setEstado(respuesta.getEstado());
		oPeticionFirma.setFecContr(new Date());
		oPeticionFirma.setFecEstado(respuesta.getFecEstado());
		oPeticionFirma.setFecFin(respuesta.getFecFin());
		oPeticionFirma.setFecInicio(respuesta.getFecInicio());
		oPeticionFirma.setFecPeticion(respuesta.getFecPeticion());
		oPeticionFirma.setIdPetPlata(respuesta.getIdPetPlata());
		oPeticionFirma.setObservaciones(respuesta.getObservaciones());
		oPeticionFirma.setPeticionario(respuesta.getPeticionario());
		oPeticionFirma.setPlataforma(respuesta.getPlataforma());
		oPeticionFirma.setReferencia(respuesta.getReferencia());
		oPeticionFirma.setTipFirma(respuesta.getTipFirma());
		oPeticionFirma.setUsuContr(usuario);

		PeticionFirma peticionInsertada = servicePeticionFirma.save(oPeticionFirma);

		if (extension.equals(".doc") || extension.equals(".docx") || extension.equals(".odt")
				|| extension.equals(".sxw")) {
			oArchviBus.setIdPeticion(peticionInsertada.getIdPeticion());
			oArchviBus.setEstado(Archivo.PENDIENTE_FIRMA);
			oArchviBus.setFecEstado(new Date());
			oArchviBus.setHuella(peticionInsertada.getReferencia());
			archivoService.save(oArchviBus);
		} else {
			oArchivo.setIdPeticion(peticionInsertada.getIdPeticion());
			oArchivo.setEstado(Archivo.PENDIENTE_FIRMA);
			oArchivo.setFecEstado(new Date());
			oArchivo.setHuella(peticionInsertada.getReferencia());
			archivoService.save(oArchivo);
		}

		if (respuesta.getEstFirmantes() != null) {
			for (int i = 0; i < aFirmaEx.length; i++) {
				PersonaFirmante personaFirmante = aFirmaEx[i].getCargo().getFirmanteDefecto();
				PeticionFirmante firmante = new PeticionFirmante();
				firmante.setNumOrden(aFirmaEx[i].getOrden());
				firmante.setIdentificador(personaFirmante.getNumDocum());
				firmante.setDesFirmante(personaFirmante.getDesPerso());

				firmante.setEstado(respuesta.getEstFirmantes());
				firmante.setFecEstado(new Date());

				firmante.setIdPeticion(peticionInsertada.getIdPeticion());
				servicePeticionFirmante.save(firmante);
			}
		}

		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();

		if (oTareaTramiteExpediente.getArchivo() != null) {
			oTareaHistorio.setCodArchi(oTareaTramiteExpediente.getArchivo());
		}

		oTareaHistorio.setDesIndic("Envío a firma, petición: " + peticionInsertada.getIdPeticion().toString());
		oTareaHistorio.setDesTarea(oTareaTramiteExpediente.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTareaTramiteExpediente.getFecInicio());
		oTareaHistorio.setTarea(oTareaTramiteExpediente.getId());
		oTareaHistorio.setUsuario(oTareaTramiteExpediente.getUsuario());
		oTareaHistorio.setUsuContr(oTareaTramiteExpediente.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);

		return peticionInsertada;
	}

	private void enviarAvisoFirmaCorreoCorporativo(String[] aCorreoCorporativo, Usuario oUsuario,
			Expediente oExpediente) {
		String sServidor = getValParam(Short.valueOf((short) 51), "51");
		String sRemitente = getValParam(Short.valueOf((short) 52), "52");
		String sUsuario = getValParam(Short.valueOf((short) 53), "53");
		String sPass = getValParam(Short.valueOf((short) 54), "54");
		String sPuerto = getValParam(Short.valueOf((short) 254), "254");
		String sTarttls = getValParam(Short.valueOf((short) 9273), "9273");
		String sAuth = getValParam(Short.valueOf((short) 9274), "9274");
		String sSocket = getValParam(Short.valueOf((short) 9275), "9275");

		for (int i = 0; i < aCorreoCorporativo.length; i++) {
			String sAsunto = "Aviso de petición de firma del usuario: " + oUsuario.getUsuario();
			String sCuerpo = "Por el presente correo se le informa que tiene una petición de firma pendiente del usuario: "
					+ oUsuario.getUsuario() + ", referente al expediente: " + oExpediente.getEjercicio().toString()
					+ "/" + oExpediente.getNumero().toString() + "\n";
			if (aCorreoCorporativo[i] != null) {
				boolean envioMail = Utiles.EMail(aCorreoCorporativo[i], sAsunto, sCuerpo, sPuerto, sServidor,
						sRemitente, sUsuario, sPass, sTarttls, sAuth, sSocket);
				if (!envioMail) {
					System.err.println("Error en el envío del correo.");
				}
			}
		}
	}

	private String getValParam(Short numValor, String numeroParametroLog) {
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
				"es", numValor);
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
		if (oParametroSistema == null) {
			System.err.println("Falta el parámetro del sistema número " + numeroParametroLog);
			throw new ErrorEnvioEmail();
		}
		return oParametroSistema.getValor();
	}

	/**
	 * Construye el conjunto de etiquetas usadas para fusionar plantillas de
	 * documentos (cabeceras institucionales, datos del expediente, atributos
	 * dinámicos e interesado/representante).
	 */
	public Etiquetas getEtiquetas(String usuario, Archivo oArchivo) {

		Etiquetas oEtiquetas = new Etiquetas();
		Locale oLocale = Locale.of("es", "ES");

		oEtiquetas.setNomAyto(getValParam(Short.valueOf((short) 19)));
		oEtiquetas.setCiudad(getValParam(Short.valueOf((short) 20)));
		oEtiquetas.setCpAyto(getValParam(Short.valueOf((short) 36)));
		oEtiquetas.setDomAyto(getValParam(Short.valueOf((short) 47)));
		oEtiquetas.setTtoAyto(getValParam(Short.valueOf((short) 21)));
		oEtiquetas.setNomAlcal(getValParam(Short.valueOf((short) 22)));
		oEtiquetas.setNomSecre(getValParam(Short.valueOf((short) 23)));
		oEtiquetas.setNomIntev(getValParam(Short.valueOf((short) 24)));
		oEtiquetas.setNomTesor(getValParam(Short.valueOf((short) 25)));
		oEtiquetas.setFirma01(getValParam(Short.valueOf((short) 26)));
		oEtiquetas.setFirma02(getValParam(Short.valueOf((short) 27)));
		oEtiquetas.setFirma03(getValParam(Short.valueOf((short) 28)));
		oEtiquetas.setFirma04(getValParam(Short.valueOf((short) 29)));
		oEtiquetas.setFirma05(getValParam(Short.valueOf((short) 264)));
		oEtiquetas.setFirma06(getValParam(Short.valueOf((short) 275)));

		oEtiquetas.setFecEmisi(Fecha.formatear(new Date(), Formateador.FECHA_CORTA, oLocale));
		oEtiquetas.setDiaEmisi(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_DIA, oLocale), 2, true, true));
		oEtiquetas.setDiaSemEmisi(Fecha.formatear(new Date(), Formateador.LETRA_DIA, oLocale));
		oEtiquetas.setMesEmisi(Fecha.formatear(new Date(), Formateador.LETRA_MES, oLocale));
		oEtiquetas.setAnoEmisi(Cadena.padCadena(Fecha.formatear(new Date(), Formateador.AÑO, oLocale), 4, true, true));

		oEtiquetas.setFecha(Fecha.formatear(new Date(), Formateador.FECHA_CORTA, oLocale));
		oEtiquetas.setFecDiaNumer(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_DIA, oLocale), 2, true, true));
		oEtiquetas.setFecMesNumer(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_MES, oLocale), 2, true, true));
		oEtiquetas
				.setFecAnoNumer(Cadena.padCadena(Fecha.formatear(new Date(), Formateador.AÑO, oLocale), 4, true, true));

		oEtiquetas.setFecAnoDosDigit(Fecha.formatear(new Date(), Formateador.AÑO_CORTO, oLocale));
		oEtiquetas.setFecDiaLetra(Fecha.formatear(new Date(), Formateador.LETRA_DIA, oLocale));
		oEtiquetas.setFecMesLetra(Fecha.formatear(new Date(), Formateador.LETRA_MES, oLocale));

		oEtiquetas.setUsuario("gos");

		if (oArchivo.getRefGesDocum() != null && isLong(oArchivo.getRefGesDocum())) {
			String sIdTarea = oArchivo.getRefGesDocum();
			Long idTarea = Long.parseLong(sIdTarea);
			TareaTramiteExpediente oTarea = serviceTareaTramiteExpediente.findById(idTarea);
			oEtiquetas.setDesTarea(oTarea.getDescripcion());
			if (oTarea != null) {
				oEtiquetas.setDesTarea(oTarea.getDescripcion());
				Tramite oTramte = serviceTramite.findById(oTarea.getTramite());
				if (oTramte != null) {
					Expediente oExpediente = serviceExpediente.findById(oTramte.getExpediente());
					if (oExpediente != null) {
						asignarAtributosDinamicos(oEtiquetas, oExpediente);

						Procedimiento oProcedimiento = serviceProcedimiento.findById(oExpediente.getProcedimiento());
						if (oProcedimiento != null) {
							oEtiquetas.setDesProce(oProcedimiento.getDescripcion());
							oEtiquetas.setDepartamento(oProcedimiento.getDepartamento().getDesEleme());
						}
						oEtiquetas.setEjeExped(oExpediente.getEjercicio().toString());
						oEtiquetas.setNumExped(oExpediente.getNumero().toString());
						oEtiquetas.setDesExped(oExpediente.getTitulo());
						asignarDatosInteresadoYRepresentante(oEtiquetas, oExpediente);
					}
				}
			}
		}

		return oEtiquetas;
	}

	private void asignarDatosInteresadoYRepresentante(Etiquetas oEtiquetas, Expediente oExpediente) {
		PersonaEntidadPK oPersonaEntidadTituPK = new PersonaEntidadPK();
		oPersonaEntidadTituPK.setIdHisPerso(oExpediente.getIdHisPerso());
		oPersonaEntidadTituPK.setIdPerso(oExpediente.getIdPerso());
		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
		if (oPersonaEntidad != null) {
			oEtiquetas.setNomInter(oPersonaEntidad.getDesPerEntid());
			oEtiquetas.setNumDocInter(oPersonaEntidad.getNumDocum());
			oEtiquetas.setDomInter(oPersonaEntidad.getDirPosta());
			oEtiquetas.setCopInter(String.valueOf(oPersonaEntidad.getCodPosta()));
			if (oPersonaEntidad.getCodProvi() != null && oPersonaEntidad.getCodProvi() > 0) {
				Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
				Provincia oProvincia = serviceProvincia.findById(codProvi);
				if (oProvincia != null) {
					oEtiquetas.setProInter(oProvincia.getDesProvi());
				}
				if (oPersonaEntidad.getCodMunic() != null && oPersonaEntidad.getCodMunic() > 0) {
					MunicipioPK oMunicipioPK = new MunicipioPK();
					oMunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
					oMunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
					Municipio oMunicipio = serviceMuncipio.findById(oMunicipioPK);
					if (oMunicipio != null) {
						oEtiquetas.setMunInter(oMunicipio.getDesMunic());
					}
				}
			}
		}
		if (oExpediente.getIdHisRepre() != null && oExpediente.getIdRepre() != null) {
			PersonaEntidadPK oPersonaEntidadReprePK = new PersonaEntidadPK();
			oPersonaEntidadReprePK.setIdHisPerso(oExpediente.getIdHisRepre());
			oPersonaEntidadReprePK.setIdPerso(oExpediente.getIdRepre());
			PersonaEntidad oPersonaEntidadRepre = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
			if (oPersonaEntidadRepre != null) {
				oEtiquetas.setNomInter(oPersonaEntidadRepre.getDesPerEntid());
				oEtiquetas.setNumDocInter(oPersonaEntidadRepre.getNumDocum());
				oEtiquetas.setDomInter(oPersonaEntidadRepre.getDirPosta());
				oEtiquetas.setCopInter(String.valueOf(oPersonaEntidadRepre.getCodPosta()));
				if (oPersonaEntidadRepre.getCodProvi() != null && oPersonaEntidadRepre.getCodProvi() > 0) {
					Long codProvi = Long.valueOf(oPersonaEntidadRepre.getCodProvi());
					Provincia oProvincia = serviceProvincia.findById(codProvi);
					if (oProvincia != null) {
						oEtiquetas.setProInter(oProvincia.getDesProvi());
					}
					if (oPersonaEntidad.getCodMunic() != null && oPersonaEntidad.getCodMunic() > 0) {
						MunicipioPK oMunicipioPK = new MunicipioPK();
						oMunicipioPK.setCodProvi(oPersonaEntidadRepre.getCodProvi());
						oMunicipioPK.setCodMunic(oPersonaEntidadRepre.getCodMunic());
						Municipio oMunicipio = serviceMuncipio.findById(oMunicipioPK);
						if (oMunicipio != null) {
							oEtiquetas.setMunInter(oMunicipio.getDesMunic());
						}
					}
				}
			}
		}
	}

	private void asignarAtributosDinamicos(Etiquetas oEtiquetas, Expediente oExpediente) {
		List<AtributoExpediente> aAtributos = atributoExpedienteService.findByIdExped(oExpediente.getId());
		if (aAtributos == null || aAtributos.isEmpty()) {
			return;
		}
		int limite = Math.min(aAtributos.size(), 10);
		for (int i = 0; i < limite; i++) {
			String etiqueta = aAtributos.get(i).getEtiGruAtrib();
			String valor = aAtributos.get(i).getValor();
			switch (i) {
			case 0:
				oEtiquetas.setEtiAtr01(etiqueta);
				oEtiquetas.setValAtr01(valor);
				break;
			case 1:
				oEtiquetas.setEtiAtr02(etiqueta);
				oEtiquetas.setValAtr02(valor);
				break;
			case 2:
				oEtiquetas.setEtiAtr03(etiqueta);
				oEtiquetas.setValAtr03(valor);
				break;
			case 3:
				oEtiquetas.setEtiAtr04(etiqueta);
				oEtiquetas.setValAtr04(valor);
				break;
			case 4:
				oEtiquetas.setEtiAtr05(etiqueta);
				oEtiquetas.setValAtr05(valor);
				break;
			case 5:
				oEtiquetas.setEtiAtr06(etiqueta);
				oEtiquetas.setValAtr06(valor);
				break;
			case 6:
				oEtiquetas.setEtiAtr07(etiqueta);
				oEtiquetas.setValAtr07(valor);
				break;
			case 7:
				oEtiquetas.setEtiAtr08(etiqueta);
				oEtiquetas.setValAtr08(valor);
				break;
			case 8:
				oEtiquetas.setEtiAtr09(etiqueta);
				oEtiquetas.setValAtr09(valor);
				break;
			case 9:
				oEtiquetas.setEtiAtr10(etiqueta);
				oEtiquetas.setValAtr10(valor);
				break;
			default:
				break;
			}
		}
	}

	public String getValParam(Short numValor) {

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) numValor));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema != null && oParametroSistema.getValor() != null) {
			return oParametroSistema.getValor();
		}

		return null;
	}

	public boolean isLong(String numero) {
		try {
			Long.parseLong(numero);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
