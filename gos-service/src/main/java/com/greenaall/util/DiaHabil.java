package com.greenaall.util;

import java.util.Date;
import java.util.List;

import com.greenaall.exception.CtrError;
import com.greenaall.models.ge.entity.DiaFestivo;

public class DiaHabil {

	public DiaHabil() {
		super();
	}

	/**
	 * Devuelve Fecha Hábil teniendo en cuenta el Número de Días Hábiles que debe
	 * contener la Fecha que se pasa como Parámetro
	 * 
	 * @param poFecha    Date
	 * @param pbAnterior boolean
	 * @param piNumDias  int
	 * @param pbEsSabado boolean
	 * @return Date
	 */

	public static Date dameFechaHabil(Date poFecha, boolean pbAnterior, int piNumDias, boolean pbEsSabado,
			List<DiaFestivo> aoDiaFesti) {
		if (poFecha == null) {
			return null;
		}

		int iCont = 0;
		Date fFecha = null;

		while (piNumDias > 0) {
			iCont++;
			fFecha = Fecha.sumaDias(poFecha, pbAnterior ? -iCont : iCont);

			if (esDiaHabil(fFecha, aoDiaFesti) || (pbEsSabado && Fecha.esSabado(fFecha) && !Fecha.esFestivo(fFecha))) {
				piNumDias--;
			}
		}

		return fFecha;
	}

	/**
	 * Devuelve un boolean indicando si la fecha pasada como parámetro corresponde a
	 * un día hábil o no.
	 *
	 * @param poFecha Fecha
	 * @return Boolean
	 * @throws CtrError
	 */
	public static boolean esDiaHabil(Date poFecha, List<DiaFestivo> aoDiaFesti) {

		boolean bEsDiaHabil = poFecha != null;
		bEsDiaHabil &= !Fecha.esSabado(poFecha) && !Fecha.esDomingo(poFecha);

		if (bEsDiaHabil) {

			Date[] aFechas = new Date[aoDiaFesti.size()];

			for (int i = 0; i < aoDiaFesti.size(); i++) {
				aFechas[i] = aoDiaFesti.get(i).getFecFesti();
			}
			Fecha.setFestivos(aFechas);
		}

		if (bEsDiaHabil && !Fecha.asignaFestivos()) {
			bEsDiaHabil &= !Fecha.esFestivo(poFecha);
		}

		return bEsDiaHabil;
	}

	public Date getProximoDiaHabil(Date poFecha, List<DiaFestivo> aoDiaFesti) {

		int iNumDias = 1;

		/* Si el día es hábil devolverlo */

		if (esDiaHabil(poFecha, aoDiaFesti)) {
			return poFecha;
		} else {

			/*
			 * Si no se trata de un día hábil, comprobar si es sábado, para sumar 2 días
			 */

			if (Fecha.esSabado(poFecha)) {
				iNumDias = 2;
			}
			poFecha = Fecha.sumaDias(poFecha, iNumDias);
		}
		return getProximoDiaHabil(poFecha, aoDiaFesti);
	}

	public boolean esDiaHabil(Date poFecha, DiaFestivo[] aoDiaFesti) {
		boolean bEsDiaHabil = poFecha != null;
		bEsDiaHabil &= !Fecha.esSabado(poFecha) && !Fecha.esDomingo(poFecha);

		if (bEsDiaHabil && Fecha.asignaFestivos()) {

			Date[] aFechas = new Date[aoDiaFesti != null ? aoDiaFesti.length : 0];

			if (aoDiaFesti != null && aoDiaFesti.length > 0) {
				for (int i = 0; i < aoDiaFesti.length; i++) {
					aFechas[i] = ((DiaFestivo) aoDiaFesti[i]).getFecFesti();
				}
			}

			Fecha.setFestivos(aFechas);
		}

		if (bEsDiaHabil && !Fecha.asignaFestivos()) {
			bEsDiaHabil &= !Fecha.esFestivo(poFecha);
		}

		return bEsDiaHabil;
	}

	public Date dameFechaHabil(Date poFecha, boolean pbAnterior, int piNumDias, boolean pbEsSabado, DiaFestivo[] aoDiaFesti) {
		if (poFecha == null) {
			return null;
		}

		int iCont = 0;
		Date fFecha = null;

		while (piNumDias > 0) {
			iCont++;
			fFecha = Fecha.sumaDias(poFecha, pbAnterior ? -iCont : iCont);

			if (esDiaHabil(fFecha, aoDiaFesti) || (pbEsSabado && Fecha.esSabado(fFecha) && !Fecha.esFestivo(fFecha))) {
				piNumDias--;
			}
		}

		return fFecha;
	}
}
