package com.greenaall.notifica.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.greenaall.exception.NotificaIntegracionException;
import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.notifica.config.NotificaConfigService;
import com.greenaall.notifica.dto.NotificaEnvioResponse;
import com.greenaall.notifica.dto.NotificaEstadoResponse;

/**
 * Cliente real Notifica (PAe/SARA). Requiere certificados y acceso PDP.
 * Configurar notifica.modo=real y parámetros 9400-9402 en ge_parametro_sistema.
 */
@Component
@ConditionalOnProperty(name = "notifica.modo", havingValue = "real")
public class NotificaRealClient implements NotificaClient {

	@Autowired
	private NotificaConfigService notificaConfigService;

	@Override
	public NotificaEnvioResponse enviar(Notificacion notificacion, String codDir3, String procedimientoSia) {
		String wsUrl = notificaConfigService.getWsUrl();
		if (wsUrl == null || wsUrl.isBlank()) {
			throw new NotificaIntegracionException(
					"Integración real: configure notifica.ws-url o parámetro sistema 9402.");
		}
		if (notificacion.getCodArchi() == null) {
			throw new NotificaIntegracionException("Integración real: la notificación debe incluir PDF (codArchi).");
		}
		// Punto de extensión: invocar WS del CTT con certificado cliente SSL
		throw new NotificaIntegracionException(
				"Integración real pendiente de WSDL CTT y certificados SARA. WS URL configurada: " + wsUrl);
	}

	@Override
	public NotificaEstadoResponse consultarEstado(GfEnvioNotifica envio) {
		String wsUrl = notificaConfigService.getWsUrl();
		if (wsUrl == null || wsUrl.isBlank()) {
			throw new NotificaIntegracionException(
					"Integración real: configure notifica.ws-url o parámetro sistema 9402.");
		}
		throw new NotificaIntegracionException(
				"Consulta de estado real pendiente de WSDL CTT. Envío externo: " + envio.getIdEnvioExterno());
	}
}
