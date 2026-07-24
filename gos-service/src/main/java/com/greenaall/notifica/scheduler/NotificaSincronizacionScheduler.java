package com.greenaall.notifica.scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.greenaall.models.gf.dao.EnvioNotificaDao;
import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.notifica.service.NotificaIntegracionService;

@Component
@ConditionalOnProperty(name = "notifica.sync-scheduled", havingValue = "true")
public class NotificaSincronizacionScheduler {

	@Autowired
	private EnvioNotificaDao envioNotificaDao;

	@Autowired
	private NotificaIntegracionService notificaIntegracionService;

	@Value("${notifica.sync-usuario:SISTEMA}")
	private String usuarioSistema;

	@Scheduled(fixedDelayString = "${notifica.sync-interval-ms:300000}")
	public void sincronizarEnviosPendientes() {
		List<GfEnvioNotifica> envios = envioNotificaDao.findByEstadoNotificaAndActivo(
				GfEnvioNotifica.ESTADO_ENVIADA, GfEnvioNotifica.ACTIVO_SI);
		envios.addAll(envioNotificaDao.findByEstadoNotificaAndActivo(
				GfEnvioNotifica.ESTADO_PUESTA_DISPOSICION, GfEnvioNotifica.ACTIVO_SI));

		for (GfEnvioNotifica envio : envios) {
			try {
				notificaIntegracionService.sincronizarConNotifica(envio.getIdNotif(), usuarioSistema);
			} catch (Exception ex) {
				// Evitar que un fallo detenga el resto de sincronizaciones programadas
			}
		}
	}
}
