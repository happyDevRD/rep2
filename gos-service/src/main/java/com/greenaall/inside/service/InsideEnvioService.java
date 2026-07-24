package com.greenaall.inside.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsideEnvioDto;
import com.greenaall.inside.dto.InsideRegistrarEnvioRequest;
import com.greenaall.models.gf.dao.EnvioInsideDao;
import com.greenaall.models.gf.entity.GfEnvioInside;

@Service
public class InsideEnvioService {

	private static final Logger log = LoggerFactory.getLogger(InsideEnvioService.class);

	public static final String OPERACION_ALTA_EXPEDIENTE_XML = "altaExpedienteEniXml";
	public static final String OPERACION_ALTA_DOCUMENTO_XML = "altaDocumentoEniXml";
	public static final String OPERACION_ALTA_DOCUMENTO_ENI = "altaDocumentoEni";
	public static final String OPERACION_REMISION_JUSTICIA = "remisionAJusticia";
	public static final String OPERACION_CONSULTA_REMISION = "consultaEstadoRemisionAJusticia";
	public static final String OPERACION_CONVERTIR_EXPEDIENTE = "convertirExpedienteAEniConMAdicionales";
	public static final String OPERACION_CONVERTIR_DOCUMENTO = "convertirDocumentoAEniConMAdicionales";

	@Autowired
	private EnvioInsideDao envioInsideDao;

	@Value("${inside.soap.dry-run:false}")
	private boolean modoDryRun;

	public InsideEnvioDto registrar(InsideRegistrarEnvioRequest request) {
		GfEnvioInside envio = new GfEnvioInside();
		envio.setIdExpediente(request.getIdExpediente());
		envio.setIdTarea(request.getIdTarea());
		envio.setOperacion(request.getOperacion());
		envio.setEstadoEnvio(resolveEstado(request));
		envio.setCodigoRespuesta(request.getCodigoRespuesta());
		envio.setDescripcionRespuesta(request.getDescripcionRespuesta());
		envio.setIdentificadorEni(request.getIdentificadorEni());
		envio.setCsv(request.getCsv());
		envio.setCodigoEnvioAtea(request.getCodigoEnvioAtea());
		envio.setMensajeError(request.getMensajeError());
		envio.setModoDryRun(resolveDryRun(request.getModoDryRun()));
		envio.setActivo(GfEnvioInside.ACTIVO_SI);
		envio.setUsuContr(request.getUsuContr());
		envio.setFecEnvio(new Date());
		envio.setFecContr(new Date());

		try {
			return toDto(envioInsideDao.save(envio));
		} catch (DataAccessException ex) {
			// Tabla ausente u otro fallo SQL: no tumbar el flujo INSIDE (demo dry-run).
			log.warn("No se pudo persistir gf_envio_inside (¿tabla creada?). operacion={} expediente={}: {}",
					request.getOperacion(), request.getIdExpediente(), ex.getMostSpecificCause().getMessage());
			return toDto(envio);
		}
	}

	public InsideEnvioDto registrarPendienteCierreExpediente(Long idExpediente, String usuContr) {
		InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
		request.setIdExpediente(idExpediente);
		request.setOperacion(OPERACION_ALTA_EXPEDIENTE_XML);
		request.setEstadoEnvio(GfEnvioInside.ESTADO_PENDIENTE);
		request.setModoDryRun(modoDryRun);
		request.setUsuContr(usuContr);
		return registrar(request);
	}

	public List<InsideEnvioDto> listarPorExpediente(Long idExpediente) {
		try {
			return envioInsideDao
					.findByIdExpedienteAndActivoOrderByFecContrDesc(idExpediente, GfEnvioInside.ACTIVO_SI)
					.stream()
					.map(this::toDto)
					.collect(Collectors.toList());
		} catch (DataAccessException ex) {
			log.warn("No se pudo listar gf_envio_inside para expediente {}: {}",
					idExpediente, ex.getMostSpecificCause().getMessage());
			return Collections.emptyList();
		}
	}

	public String obtenerEstadoResumen(Long idExpediente) {
		try {
			return envioInsideDao
					.findFirstByIdExpedienteAndActivoOrderByFecContrDesc(idExpediente, GfEnvioInside.ACTIVO_SI)
					.map(GfEnvioInside::getEstadoEnvio)
					.orElse("");
		} catch (DataAccessException ex) {
			log.warn("No se pudo leer estado INSIDE de expediente {}: {}",
					idExpediente, ex.getMostSpecificCause().getMessage());
			return "";
		}
	}

	public InsideEnvioDto obtenerUltimoPorExpediente(Long idExpediente) {
		try {
			return envioInsideDao
					.findFirstByIdExpedienteAndActivoOrderByFecContrDesc(idExpediente, GfEnvioInside.ACTIVO_SI)
					.map(this::toDto)
					.orElse(null);
		} catch (DataAccessException ex) {
			log.warn("No se pudo leer último envío INSIDE de expediente {}: {}",
					idExpediente, ex.getMostSpecificCause().getMessage());
			return null;
		}
	}

	private String resolveEstado(InsideRegistrarEnvioRequest request) {
		if (request.getEstadoEnvio() != null && !request.getEstadoEnvio().isBlank()) {
			return request.getEstadoEnvio();
		}

		if (request.getMensajeError() != null && !request.getMensajeError().isBlank()) {
			return GfEnvioInside.ESTADO_ERROR;
		}

		if (Boolean.TRUE.equals(request.getModoDryRun()) || modoDryRun) {
			return GfEnvioInside.ESTADO_SIMULADO;
		}

		return GfEnvioInside.ESTADO_ENVIADO;
	}

	private String resolveDryRun(Boolean requestDryRun) {
		boolean activo = Boolean.TRUE.equals(requestDryRun) || modoDryRun;
		return activo ? GfEnvioInside.DRY_RUN_SI : GfEnvioInside.DRY_RUN_NO;
	}

	private InsideEnvioDto toDto(GfEnvioInside envio) {
		InsideEnvioDto dto = new InsideEnvioDto();
		dto.setIdEnvio(envio.getIdEnvio());
		dto.setIdExpediente(envio.getIdExpediente());
		dto.setIdTarea(envio.getIdTarea());
		dto.setOperacion(envio.getOperacion());
		dto.setEstadoEnvio(envio.getEstadoEnvio());
		dto.setCodigoRespuesta(envio.getCodigoRespuesta());
		dto.setDescripcionRespuesta(envio.getDescripcionRespuesta());
		dto.setIdentificadorEni(envio.getIdentificadorEni());
		dto.setCsv(envio.getCsv());
		dto.setCodigoEnvioAtea(envio.getCodigoEnvioAtea());
		dto.setModoDryRun(GfEnvioInside.DRY_RUN_SI.equals(envio.getModoDryRun()));
		dto.setMensajeError(envio.getMensajeError());
		dto.setFecEnvio(envio.getFecEnvio());
		dto.setFecContr(envio.getFecContr());
		return dto;
	}
}
