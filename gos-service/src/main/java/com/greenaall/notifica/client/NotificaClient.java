package com.greenaall.notifica.client;

import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.notifica.dto.NotificaEnvioResponse;
import com.greenaall.notifica.dto.NotificaEstadoResponse;

public interface NotificaClient {

	NotificaEnvioResponse enviar(Notificacion notificacion, String codDir3, String procedimientoSia);

	NotificaEstadoResponse consultarEstado(GfEnvioNotifica envio);
}
