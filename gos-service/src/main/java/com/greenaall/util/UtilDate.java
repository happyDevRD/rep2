package com.greenaall.util;

import java.text.ParseException;
import java.util.Date;

/**
 * @deprecated Usar {@link com.greenaall.util.fecha.UtilDate}.
 * Shim de compatibilidad mientras se migran imports.
 */
@Deprecated
public final class UtilDate {

	private UtilDate() {
	}

	public static String getDia(Date dFecha) {
		return com.greenaall.util.fecha.UtilDate.getDia(dFecha);
	}

	public static String getAnno(Date dFecha) {
		return com.greenaall.util.fecha.UtilDate.getAnno(dFecha);
	}

	public static String getFechaCorta(String time) throws Exception {
		return com.greenaall.util.fecha.UtilDate.getFechaCorta(time);
	}

	public static String getFechaCorta(Date dFecha) throws Exception {
		return com.greenaall.util.fecha.UtilDate.getFechaCorta(dFecha);
	}

	public static Date CadenaToFechaDiaMesAno(String cFecha) throws ParseException {
		return com.greenaall.util.fecha.UtilDate.CadenaToFechaDiaMesAno(cFecha);
	}

	public static Date cadenaToFecha(String cFecha) throws ParseException {
		return com.greenaall.util.fecha.UtilDate.cadenaToFecha(cFecha);
	}

	public static Date cadenaToFecha(String cFecha, String patron) throws ParseException {
		return com.greenaall.util.fecha.UtilDate.cadenaToFecha(cFecha, patron);
	}

	public static String getFechaHora(Date fecha) throws Exception {
		return com.greenaall.util.fecha.UtilDate.getFechaHora(fecha);
	}

	public static String getHora(Date dFecha) {
		return com.greenaall.util.fecha.UtilDate.getHora(dFecha);
	}

	public static Date convertZuluDateToLocalDate(String zuluDate, String format) throws Exception {
		return com.greenaall.util.fecha.UtilDate.convertZuluDateToLocalDate(zuluDate, format);
	}

	public static Date cadenaToFechaDateHTML(String cFecha) throws Exception {
		return com.greenaall.util.fecha.UtilDate.cadenaToFechaDateHTML(cFecha);
	}
}
