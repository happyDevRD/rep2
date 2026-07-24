package com.greenaall.notifica.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NotificaIntegracionException;
import com.greenaall.models.gf.dao.EnvioNotificaDao;
import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.service.NotificacionServiceImpl;
import com.greenaall.notifica.client.NotificaClient;
import com.greenaall.notifica.config.NotificaConfigService;
import com.greenaall.notifica.dto.NotificaEnvioResponse;
import com.greenaall.notifica.dto.NotificaEstadoResponse;
import com.greenaall.notifica.dto.NotificaIntegracionResultDto;
import com.greenaall.pe.util.NotificacionSituacionUtil;
import com.greenaall.util.fiscal.GestionFiscalConstantes;

@Service
public class NotificaIntegracionService {

	@Autowired
	private NotificacionServiceImpl notificacionService;

	@Autowired
	private EnvioNotificaDao envioNotificaDao;

	@Autowired
	private NotificaClient notificaClient;

	@Autowired
	private NotificaConfigService notificaConfigService;

	@Autowired
	private NotificaAcuseTareaService notificaAcuseTareaService;

	@Autowired
	private IArchivoService archivoService;

	@Value("${notifica.modo:mock}")
	private String notificaModo;

	@Transactional
	public NotificaIntegracionResultDto enviarANotifica(Long idNotif, String usuContr) {
		Notificacion notificacion = obtenerNotificacion(idNotif);

		if (!GestionFiscalConstantes.NOTIFICACION_GENERADA.equals(notificacion.getSituacion())) {
			throw new NotificaIntegracionException(
					"Solo se puede enviar a Notifica una notificación en estado GENERADA.");
		}

		if (notificacion.getCodArchi() == null) {
			throw new NotificaIntegracionException(
					"La notificación debe tener un documento PDF (codArchi) antes de enviar a Notifica.");
		}

		Archivo archivo = archivoService.findById(notificacion.getCodArchi());
		if (archivo == null) {
			throw new NotificaIntegracionException("No se encontró el archivo PDF asociado a la notificación.");
		}

		Optional<GfEnvioNotifica> envioActivo = envioNotificaDao
				.findFirstByIdNotifAndActivoOrderByFecContrDesc(idNotif, GfEnvioNotifica.ACTIVO_SI);
		if (envioActivo.isPresent()) {
			throw new NotificaIntegracionException("La notificación ya tiene un envío activo en Notifica.");
		}

		String codDir3 = notificaConfigService.getCodDir3();
		String procedimientoSia = notificaConfigService.getProcedimientoSia();
		NotificaEnvioResponse respuesta = notificaClient.enviar(notificacion, codDir3, procedimientoSia);
		Date ahora = new Date();

		notificacion.setSituacion(GestionFiscalConstantes.NOTIFICACION_NOTIFICA_GENERADA);
		notificacion.setForNotif(Notificacion.FORMA_NOTIFICACION_TELEMATICA);
		if (usuContr != null && !usuContr.isBlank()) {
			notificacion.setUsuContr(usuContr);
		}
		notificacionService.save(notificacion);

		GfEnvioNotifica envio = new GfEnvioNotifica();
		envio.setIdNotif(idNotif);
		envio.setIdEnvioExterno(respuesta.getIdEnvioExterno());
		envio.setEstadoNotifica(respuesta.getEstadoNotifica());
		envio.setCodDir3(codDir3);
		envio.setProcedimientoSia(procedimientoSia);
		envio.setFecEnvio(ahora);
		envio.setFecUltSinc(ahora);
		envio.setActivo(GfEnvioNotifica.ACTIVO_SI);
		envio.setUsuContr(usuContr);
		envio.setFecContr(ahora);
		envio = envioNotificaDao.save(envio);

		notificacion.setSituacion(GestionFiscalConstantes.NOTIFICACION_NOTIFICA_ENVIADA);
		notificacion.setFecEnvio(ahora);
		notificacionService.save(notificacion);

		String mensaje = respuesta.getMensaje();
		if (mensaje == null || mensaje.isBlank()) {
			mensaje = "Documento PDF (codArchi=" + notificacion.getCodArchi() + ") enviado a Notifica.";
		}
		return construirResultado(notificacion, envio, mensaje);
	}

	@Transactional
	public NotificaIntegracionResultDto sincronizarConNotifica(Long idNotif, String usuContr) {
		Notificacion notificacion = obtenerNotificacion(idNotif);

		if (!GestionFiscalConstantes.NOTIFICACION_NOTIFICA_ENVIADA.equals(notificacion.getSituacion())
				&& !GestionFiscalConstantes.NOTIFICACION_CADUCADA.equals(notificacion.getSituacion())
				&& !GestionFiscalConstantes.NOTIFICACION_RECHAZADA.equals(notificacion.getSituacion())) {
			throw new NotificaIntegracionException(
					"Solo se puede sincronizar una notificación en estado NOTIFICA_ENVIADA o derivados.");
		}

		GfEnvioNotifica envio = envioNotificaDao
				.findFirstByIdNotifAndActivoOrderByFecContrDesc(idNotif, GfEnvioNotifica.ACTIVO_SI)
				.orElseThrow(() -> new NotificaIntegracionException(
						"No existe un envío activo en Notifica para esta notificación."));

		NotificaEstadoResponse respuesta = notificaClient.consultarEstado(envio);
		Date ahora = new Date();
		envio.setEstadoNotifica(respuesta.getEstadoNotifica());
		envio.setFecUltSinc(ahora);
		if (usuContr != null && !usuContr.isBlank()) {
			envio.setUsuContr(usuContr);
		}

		String mensaje = respuesta.getMensaje();

		if (respuesta.isCaducada()) {
			notificacion.setSituacion(GestionFiscalConstantes.NOTIFICACION_CADUCADA);
			if (usuContr != null && !usuContr.isBlank()) {
				notificacion.setUsuContr(usuContr);
			}
			notificacionService.save(notificacion);
			mensaje = mensaje != null ? mensaje : "Notificación caducada en Notifica.";
		} else if (respuesta.isRechazada()) {
			notificacion.setSituacion(GestionFiscalConstantes.NOTIFICACION_RECHAZADA);
			if (usuContr != null && !usuContr.isBlank()) {
				notificacion.setUsuContr(usuContr);
			}
			notificacionService.save(notificacion);
			mensaje = mensaje != null ? mensaje : "Notificación rechazada en Notifica.";
		} else if (respuesta.isRecepcionada()) {
			envio.setFecRecepcion(respuesta.getFecRecepcion() != null ? respuesta.getFecRecepcion() : ahora);
			envio.setIdAcuseExterno(respuesta.getIdAcuseExterno());

			notificacion.setSituacion(GestionFiscalConstantes.NOTIFICACION_RECEPCIONADA);
			notificacion.setFecRecNotif(envio.getFecRecepcion());
			String acuseRef = respuesta.getIdAcuseExterno() != null ? respuesta.getIdAcuseExterno() : "SIN-ACUSE";
			String observacionAcuse = "[Notifica] Acuse de recibo: " + acuseRef;
			if (notificacion.getObservacion() == null || notificacion.getObservacion().isBlank()) {
				notificacion.setObservacion(observacionAcuse);
			} else if (!notificacion.getObservacion().contains(acuseRef)) {
				notificacion.setObservacion(notificacion.getObservacion() + " | " + observacionAcuse);
			}
			if (usuContr != null && !usuContr.isBlank()) {
				notificacion.setUsuContr(usuContr);
			}

			Long codArchiAcuse = respuesta.getCodArchiAcuse() != null ? respuesta.getCodArchiAcuse()
					: notificacion.getCodArchi();
			notificaAcuseTareaService.registrarAcuseEnTarea(notificacion, acuseRef, codArchiAcuse, usuContr);
			notificacionService.save(notificacion);
			mensaje = "Notificación recepcionada en Notifica. " + observacionAcuse;
		}

		envioNotificaDao.save(envio);
		return construirResultado(notificacion, envio, mensaje);
	}

	@Transactional(readOnly = true)
	public GfEnvioNotifica consultarEnvioActivo(Long idNotif) {
		return envioNotificaDao.findFirstByIdNotifAndActivoOrderByFecContrDesc(idNotif, GfEnvioNotifica.ACTIVO_SI)
				.orElse(null);
	}

	private Notificacion obtenerNotificacion(Long idNotif) {
		Notificacion notificacion = notificacionService.findById(idNotif);
		if (notificacion == null) {
			throw new NotificaIntegracionException("No se encontró la notificación con id " + idNotif);
		}
		return notificacion;
	}

	private NotificaIntegracionResultDto construirResultado(Notificacion notificacion, GfEnvioNotifica envio,
			String mensaje) {
		NotificaIntegracionResultDto dto = new NotificaIntegracionResultDto();
		dto.setIdNotif(notificacion.getIdNotif());
		dto.setSituacion(notificacion.getSituacion());
		dto.setDesSituacion(NotificacionSituacionUtil.descripcionSituacion(notificacion.getSituacion()));
		dto.setIdEnvio(envio.getIdEnvio());
		dto.setIdEnvioExterno(envio.getIdEnvioExterno());
		dto.setEstadoNotifica(envio.getEstadoNotifica());
		dto.setIdAcuseExterno(envio.getIdAcuseExterno());
		dto.setFecEnvio(envio.getFecEnvio());
		dto.setFecRecepcion(envio.getFecRecepcion());
		dto.setMensaje(mensaje);
		dto.setModo(notificaModo);
		return dto;
	}
}
