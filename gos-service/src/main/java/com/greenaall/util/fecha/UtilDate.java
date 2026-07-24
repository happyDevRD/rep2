package com.greenaall.util.fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UtilDate {

	public synchronized static String getDia(Date dFecha) {
		SimpleDateFormat oForFecha = new SimpleDateFormat("dd");
		return oForFecha.format(dFecha);
	}

	public synchronized static String getAnno(Date dFecha) {
		SimpleDateFormat oForFecha = new SimpleDateFormat("yyyy");
		return oForFecha.format(dFecha);
	}

	public synchronized static String getFechaCorta(String time) throws Exception {
		Long lTime = Long.valueOf(time);
		Date dFecha = new Date(lTime);
		return getFechaCorta(dFecha);
	}

	public synchronized static String getFechaCorta(java.util.Date dFecha) throws Exception {
		String sResul = "";
		if (dFecha != null) {
			try {
				SimpleDateFormat oForFecha = new SimpleDateFormat("dd/MM/yyyy");
				sResul = oForFecha.format(dFecha);
			} catch (Exception e) {
				throw new Exception(e.getClass() + " : " + e.getMessage());
			}
		}
		return sResul;
	}

	public synchronized static Date CadenaToFechaDiaMesAno(String cFecha) throws ParseException {
		String cPatron = "dd/MM/yyyy";
		SimpleDateFormat oSimpleDateFormat = new SimpleDateFormat(cPatron);
		oSimpleDateFormat.setLenient(false);
		return oSimpleDateFormat.parse(cFecha);
	}

	public synchronized static Date cadenaToFecha(String cFecha) throws ParseException {
		return UtilDate.cadenaToFecha(cFecha, "dd/MM/yyyy HH:mm:ss");
	}

	public synchronized static Date cadenaToFecha(String cFecha, String patron) throws ParseException {
		SimpleDateFormat oSimpleDateFormat = new SimpleDateFormat(patron);
		oSimpleDateFormat.setLenient(false);
		return oSimpleDateFormat.parse(cFecha);
	}

	public synchronized static String getFechaHora(java.util.Date fecha) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return sdf.format(fecha);
	}

	public synchronized static String getHora(Date dFecha) {
		SimpleDateFormat oForFecha = new SimpleDateFormat("HH:mm:ss");
		return oForFecha.format(dFecha);
	}

	public synchronized static Date convertZuluDateToLocalDate(String zuluDate, String format) throws Exception {
		SimpleDateFormat dateFormatGmt = new SimpleDateFormat(format);
		dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		return dateFormatGmt.parse(zuluDate);
	}

	public static synchronized Date cadenaToFechaDateHTML(String cFecha) throws Exception {
		Date fecha;
		try {
			fecha = cadenaToFecha(cFecha, "dd/MM/yyyy");
		} catch (ParseException ex) {
			fecha = cadenaToFecha(cFecha, "yyyy-MM-dd");
		}
		return fecha;
	}
}
