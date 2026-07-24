package com.greenaall.notifica.client;

import java.util.Date;
import java.util.UUID;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.notifica.dto.NotificaEnvioResponse;
import com.greenaall.notifica.dto.NotificaEstadoResponse;

@Component
@ConditionalOnProperty(name = "notifica.modo", havingValue = "mock", matchIfMissing = true)
public class NotificaMockClient implements NotificaClient {

	@Override
	public NotificaEnvioResponse enviar(Notificacion notificacion, String codDir3, String procedimientoSia) {
		NotificaEnvioResponse response = new NotificaEnvioResponse();
		response.setIdEnvioExterno("MOCK-" + UUID.randomUUID());
		response.setEstadoNotifica(GfEnvioNotifica.ESTADO_ENVIADA);
		String pdfRef = notificacion.getCodArchi() != null ? "codArchi=" + notificacion.getCodArchi() : "sin PDF";
		response.setMensaje("Envío simulado a Notifica (modo mock). Notificación "
				+ notificacion.getEjeNotif() + "/" + notificacion.getNumNotif() + ". Documento: " + pdfRef
				+ ". DIR3=" + codDir3 + ", SIA=" + procedimientoSia);
		return response;
	}

	@Override
	public NotificaEstadoResponse consultarEstado(GfEnvioNotifica envio) {
		NotificaEstadoResponse response = new NotificaEstadoResponse();
		String estadoActual = envio.getEstadoNotifica();

		if (GfEnvioNotifica.ESTADO_ENVIADA.equals(estadoActual)) {
			response.setEstadoNotifica(GfEnvioNotifica.ESTADO_PUESTA_DISPOSICION);
			response.setRecepcionada(false);
			response.setMensaje("Sincronización mock: notificación puesta a disposición en DEHú.");
			return response;
		}

		if (GfEnvioNotifica.ESTADO_PUESTA_DISPOSICION.equals(estadoActual)) {
			if (envio.getMensajeError() != null && envio.getMensajeError().contains("MOCK_CADUCAR")) {
				response.setEstadoNotifica(GfEnvioNotifica.ESTADO_CADUCADA);
				response.setCaducada(true);
				response.setMensaje("Sincronización mock: notificación caducada.");
				return response;
			}
			if (envio.getMensajeError() != null && envio.getMensajeError().contains("MOCK_RECHAZAR")) {
				response.setEstadoNotifica(GfEnvioNotifica.ESTADO_RECHAZADA);
				response.setRechazada(true);
				response.setMensaje("Sincronización mock: notificación rechazada.");
				return response;
			}
			response.setEstadoNotifica(GfEnvioNotifica.ESTADO_RECEPCIONADA);
			response.setRecepcionada(true);
			response.setFecRecepcion(new Date());
			response.setIdAcuseExterno("ACUSE-MOCK-" + envio.getIdEnvioExterno());
			response.setMensaje("Sincronización mock: notificación recepcionada. Acuse generado.");
			return response;
		}

		response.setEstadoNotifica(estadoActual);
		response.setRecepcionada(GfEnvioNotifica.ESTADO_RECEPCIONADA.equals(estadoActual));
		response.setCaducada(GfEnvioNotifica.ESTADO_CADUCADA.equals(estadoActual));
		response.setRechazada(GfEnvioNotifica.ESTADO_RECHAZADA.equals(estadoActual));
		response.setMensaje("Sin cambios de estado en Notifica (mock).");
		return response;
	}
}
