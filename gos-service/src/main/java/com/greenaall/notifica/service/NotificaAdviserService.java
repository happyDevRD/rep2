package com.greenaall.notifica.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.NotificaIntegracionException;
import com.greenaall.models.gf.dao.EnvioNotificaDao;
import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.notifica.dto.NotificaIntegracionResultDto;

@Service
public class NotificaAdviserService {

	@Autowired
	private EnvioNotificaDao envioNotificaDao;

	@Autowired
	private NotificaIntegracionService notificaIntegracionService;

	public NotificaIntegracionResultDto procesarCallback(Map<String, String> payload) {
		if (payload == null || payload.isEmpty()) {
			throw new NotificaIntegracionException("Payload Adviser vacío.");
		}

		String idEnvioExterno = payload.get("idEnvioExterno");
		if (idEnvioExterno == null) {
			idEnvioExterno = payload.get("idEnvio");
		}
		if (idEnvioExterno == null || idEnvioExterno.isBlank()) {
			throw new NotificaIntegracionException("Falta idEnvioExterno en callback Adviser.");
		}

		GfEnvioNotifica envio = envioNotificaDao.findFirstByIdEnvioExternoAndActivo(idEnvioExterno,
				GfEnvioNotifica.ACTIVO_SI);
		if (envio == null) {
			throw new NotificaIntegracionException(
					"No se encontró envío activo para idEnvioExterno=" + idEnvioExterno);
		}

		String nuevoEstado = payload.get("estadoNotifica");
		if (nuevoEstado != null && !nuevoEstado.isBlank()) {
			envio.setEstadoNotifica(nuevoEstado);
			envioNotificaDao.save(envio);
		}

		String usuContr = payload.get("usuContr");
		return notificaIntegracionService.sincronizarConNotifica(envio.getIdNotif(), usuContr);
	}
}
