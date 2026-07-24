package com.greenaall.pe.util;

import com.greenaall.util.fiscal.GestionFiscalConstantes;

public final class NotificacionSituacionUtil {

	private NotificacionSituacionUtil() {
	}

	public static String descripcionSituacion(Short situacion) {
		if (situacion == null) {
			return "DESCONOCIDO";
		}
		if (GestionFiscalConstantes.NOTIFICACION_GENERADA.equals(situacion)) {
			return "GENERADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_ENVIADA.equals(situacion)) {
			return "ENVIADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_RECEPCIONADA.equals(situacion)) {
			return "RECEPCIONADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_DEVUELTA.equals(situacion)) {
			return "DEVUELTA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_COBRADA.equals(situacion)) {
			return "COBRADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_ANULADA.equals(situacion)) {
			return "ANULADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_NOTIFICA_GENERADA.equals(situacion)) {
			return "NOTIFICA_GENERADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_NOTIFICA_ENVIADA.equals(situacion)) {
			return "NOTIFICA_ENVIADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_CADUCADA.equals(situacion)) {
			return "CADUCADA";
		}
		if (GestionFiscalConstantes.NOTIFICACION_RECHAZADA.equals(situacion)) {
			return "RECHAZADA";
		}
		return "ESTADO_" + situacion;
	}
}
