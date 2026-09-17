package com.greenaall.archive.service;

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

import com.greenaall.archive.dto.ArchiveEnvioDto;
import com.greenaall.archive.dto.ArchiveRegistrarEnvioRequest;
import com.greenaall.models.gf.dao.EnvioArchiveDao;
import com.greenaall.models.gf.entity.GfEnvioArchive;

@Service
public class ArchiveEnvioService {

	private static final Logger log = LoggerFactory.getLogger(ArchiveEnvioService.class);

	public static final String OPERACION_GENERAR_Y_PREINGRESAR_SIP = "generarYPreingresarSIPIdentificadores";

	@Autowired
	private EnvioArchiveDao envioArchiveDao;

	@Value("${archive.soap.dry-run:false}")
	private boolean modoDryRun;

	public ArchiveEnvioDto registrar(ArchiveRegistrarEnvioRequest request) {
		GfEnvioArchive envio = new GfEnvioArchive();
		envio.setIdExpediente(request.getIdExpediente());
		envio.setOperacion(request.getOperacion());
		envio.setEstadoEnvio(resolveEstado(request));
		envio.setCodigoRespuesta(request.getCodigoRespuesta());
		envio.setDescripcionRespuesta(request.getDescripcionRespuesta());
		envio.setIdentificadorEni(request.getIdentificadorEni());
		envio.setCsv(request.getCsv());
		envio.setMensajeError(request.getMensajeError());
		envio.setModoDryRun(resolveDryRun(request.getModoDryRun()));
		envio.setActivo(GfEnvioArchive.ACTIVO_SI);
		envio.setUsuContr(request.getUsuContr());
		envio.setFecEnvio(new Date());
		envio.setFecContr(new Date());

		try {
			return toDto(envioArchiveDao.save(envio));
		} catch (DataAccessException ex) {
			// Tabla ausente u otro fallo SQL: no tumbar el flujo ARCHIVE (demo dry-run).
			log.warn("No se pudo persistir gf_envio_archive (¿tabla creada?). operacion={} expediente={}: {}",
					request.getOperacion(), request.getIdExpediente(), ex.getMostSpecificCause().getMessage());
			return toDto(envio);
		}
	}

	public ArchiveEnvioDto registrarPendienteCierreExpediente(Long idExpediente, String usuContr) {
		ArchiveRegistrarEnvioRequest request = new ArchiveRegistrarEnvioRequest();
		request.setIdExpediente(idExpediente);
		request.setOperacion(OPERACION_GENERAR_Y_PREINGRESAR_SIP);
		request.setEstadoEnvio(GfEnvioArchive.ESTADO_PENDIENTE);
		request.setModoDryRun(modoDryRun);
		request.setUsuContr(usuContr);
		return registrar(request);
	}

	public List<ArchiveEnvioDto> listarPorExpediente(Long idExpediente) {
		try {
			return envioArchiveDao
					.findByIdExpedienteAndActivoOrderByFecContrDescIdEnvioDesc(idExpediente, GfEnvioArchive.ACTIVO_SI)
					.stream()
					.map(this::toDto)
					.collect(Collectors.toList());
		} catch (DataAccessException ex) {
			log.warn("No se pudo listar gf_envio_archive para expediente {}: {}",
					idExpediente, ex.getMostSpecificCause().getMessage());
			return Collections.emptyList();
		}
	}

	public String obtenerEstadoResumen(Long idExpediente) {
		try {
			return envioArchiveDao
					.findFirstByIdExpedienteAndActivoOrderByFecContrDescIdEnvioDesc(idExpediente,
							GfEnvioArchive.ACTIVO_SI)
					.map(GfEnvioArchive::getEstadoEnvio)
					.orElse("");
		} catch (DataAccessException ex) {
			log.warn("No se pudo leer estado ARCHIVE de expediente {}: {}",
					idExpediente, ex.getMostSpecificCause().getMessage());
			return "";
		}
	}

	public ArchiveEnvioDto obtenerUltimoPorExpediente(Long idExpediente) {
		try {
			return envioArchiveDao
					.findFirstByIdExpedienteAndActivoOrderByFecContrDescIdEnvioDesc(idExpediente,
							GfEnvioArchive.ACTIVO_SI)
					.map(this::toDto)
					.orElse(null);
		} catch (DataAccessException ex) {
			log.warn("No se pudo leer último envío ARCHIVE de expediente {}: {}",
					idExpediente, ex.getMostSpecificCause().getMessage());
			return null;
		}
	}

	private String resolveEstado(ArchiveRegistrarEnvioRequest request) {
		if (request.getEstadoEnvio() != null && !request.getEstadoEnvio().isBlank()) {
			return request.getEstadoEnvio();
		}

		if (request.getMensajeError() != null && !request.getMensajeError().isBlank()) {
			return GfEnvioArchive.ESTADO_ERROR;
		}

		if (Boolean.TRUE.equals(request.getModoDryRun()) || modoDryRun) {
			return GfEnvioArchive.ESTADO_SIMULADO;
		}

		return GfEnvioArchive.ESTADO_ENVIADO;
	}

	private String resolveDryRun(Boolean requestDryRun) {
		boolean activo = Boolean.TRUE.equals(requestDryRun) || modoDryRun;
		return activo ? GfEnvioArchive.DRY_RUN_SI : GfEnvioArchive.DRY_RUN_NO;
	}

	private ArchiveEnvioDto toDto(GfEnvioArchive envio) {
		ArchiveEnvioDto dto = new ArchiveEnvioDto();
		dto.setIdEnvio(envio.getIdEnvio());
		dto.setIdExpediente(envio.getIdExpediente());
		dto.setOperacion(envio.getOperacion());
		dto.setEstadoEnvio(envio.getEstadoEnvio());
		dto.setCodigoRespuesta(envio.getCodigoRespuesta());
		dto.setDescripcionRespuesta(envio.getDescripcionRespuesta());
		dto.setIdentificadorEni(envio.getIdentificadorEni());
		dto.setCsv(envio.getCsv());
		dto.setModoDryRun(GfEnvioArchive.DRY_RUN_SI.equals(envio.getModoDryRun()));
		dto.setMensajeError(envio.getMensajeError());
		dto.setFecEnvio(envio.getFecEnvio());
		dto.setFecContr(envio.getFecContr());
		return dto;
	}
}
