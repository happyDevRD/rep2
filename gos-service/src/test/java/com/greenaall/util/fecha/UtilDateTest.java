package com.greenaall.util.fecha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class UtilDateTest {

	@Test
	void getDiaYAnno_formateanCorrectamente() {
		Calendar calendar = new GregorianCalendar(2026, Calendar.JULY, 21);
		Date fecha = calendar.getTime();
		assertEquals("21", UtilDate.getDia(fecha));
		assertEquals("2026", UtilDate.getAnno(fecha));
	}

	@Test
	void cadenaToFecha_parseaPatronCorto() throws ParseException {
		Date fecha = UtilDate.CadenaToFechaDiaMesAno("21/07/2026");
		assertEquals("21", UtilDate.getDia(fecha));
		assertEquals("2026", UtilDate.getAnno(fecha));
	}

	@Test
	void cadenaToFecha_rechazaFechaInvalida() {
		assertThrows(ParseException.class, () -> UtilDate.CadenaToFechaDiaMesAno("32/13/2026"));
	}
}
