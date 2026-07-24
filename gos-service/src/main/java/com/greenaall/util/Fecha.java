package com.greenaall.util;

import java.text.*;
import java.util.*;

import com.greenaall.exception.CtrError;


/**
 * <p>
 * Rutinas genéricas de manejo de fechas.
 * </p>
 * <p>
 * Copyright: 2004 © Greenaall S.L.
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author 7
 * @version 1.0
 */

public class Fecha {
	/* DEFINICIÓN DE ATRIBUTOS */

	private Date fFecha;

	/** Símbolos dependientes del Locale */

	private static final DateFormatSymbols oDatForSymbo = new DateFormatSymbols(
			Locale.getDefault());

	/**
	 * Variable para optimizar el rendimiento de la clase en procesos con
	 * cálculos con fechas.
	 */
	private static final Calendar fCalendario = Calendar.getInstance();


	/** Lista de Fechas Festivas */
	private static Date[] aFestivos = null;

	/**
	 * Cadena de formateo especial para ciertos meses en Catalán (aquellos que
	 * empiezan por vocal)
	 */
	private static final String DES_LAR_FECHA_CAT_BIS = "dd 'd'''MMMM 'de' yyyy";

	/** Locale en catalán */
	private static final Locale LOCALE_CATALAN = Locale.of("es", "ES");

	/**
	 * Carga de los Meses
	 */
	static {
		Fecha.configurarSimbolos();
	}

	/* IMPLEMENTACIÓN DE LOS MÉTODOS */

	/* Métodos Constructores */

	/**
	 * Constructor de la Clase
	 */

	public Fecha() {
	}

	/**
	 * Constructor de la Clase.
	 * 
	 * @param pfFecha
	 *            Valor de la Fecha.
	 */

	public Fecha(Date pfFecha) {
		this();
		this.fFecha = pfFecha;
	}

	/**
	 * Constructor de la Clase.
	 * 
	 * @param piDia
	 *            Día.
	 * @param piMes
	 *            Mes. Tener en cuenta que Enero es el Mes "CERO". Utilizar las
	 *            Constantes definidas en la Clase Calendar como, por ejemplo,
	 *            Calendar.JANUARY.
	 * @param piAño
	 *            Año.
	 */

	public Fecha(int piDia, int piMes, int piAño) {
		this(piDia, piMes, piAño, 0, 0, 0);
	}

	/**
	 * Constructor de la Clase.
	 * 
	 * @param piDia
	 *            Día.
	 * @param piMes
	 *            Mes. Tener en cuenta que Enero es el Mes "CERO". Utilizar las
	 *            Constantes definidas en la Clase Calendar como, por ejemplo,
	 *            Calendar.JANUARY.
	 * @param piAño
	 *            Año.
	 * @param piHora
	 *            Hora.
	 * @param piMinuto
	 *            Minuto.
	 * @param piSegundo
	 *            Segundo.
	 */

	public Fecha(int piDia, int piMes, int piAño, int piHora, int piMinuto,
			int piSegundo) {
		this();
		fCalendario.set(piAño, piMes, piDia, piHora, piMinuto, piSegundo);
		this.fFecha = new Date(fCalendario.getTime().getTime());
	}

	/**
	 * Constructor de la Clase
	 * 
	 * @param psFecha
	 *            Valor de la Fecha en String
	 * @throws CtrError
	 */

	public Fecha(String psFecha) throws CtrError {
		this();

		try {
			this.fFecha = DateFormat.getInstance().parse(psFecha);
		} catch (ParseException e) {
			throw new CtrError(e);
		}
	}

	/**
	 * Método que convierte una Cadena con el Formato DDMMAAAA en una Fecha
	 * 
	 * @param psFecha
	 *            Cadena a convertir
	 * @return true - Si se ha convertido correctamente
	 * @return false - Si ha fallado la conversión
	 */
	public boolean convertirDDMMAAAA(String psFecha) {
		if (psFecha == null || psFecha.length() < 8
				|| !psFecha.matches("\\d{8}.*")) {
			return false;
		}

		SimpleDateFormat fFormatoDMA = Formateador
				.getSimpleDateFormat("ddMMyyyy");

		try {
			this.fFecha = fFormatoDMA.parse(psFecha.substring(0, 8),
					new ParsePosition(0));
		} catch (Exception ex) {
			return false;
		}

		return this.fFecha != null;
	}

	/**
	 * Método que convierte una Cadena con el Formato DDMMAA en una Fecha
	 * 
	 * @param psFecha
	 *            Cadena a convertir
	 * @return true - Si se ha convertido correctamente
	 * @return false - Si ha fallado la conversión
	 */
	public boolean convertirDDMMAA(String psFecha) {
		if (psFecha == null) {
			return false;
		}

		if (psFecha.matches("\\d{2}\\p{Punct}\\d{2}\\p{Punct}\\d{2}")) {
			psFecha = psFecha.substring(0, 2) + psFecha.substring(3, 5)
					+ psFecha.substring(6, 8);
		}

		if (psFecha.length() < 6 || !psFecha.matches("\\d{6}.*")) {
			return false;
		}

		SimpleDateFormat fFormatoDMA = Formateador
				.getSimpleDateFormat("ddMMyy");

		try {
			this.fFecha = fFormatoDMA.parse(psFecha.substring(0, 6),
					new ParsePosition(0));
		} catch (Exception ex) {
			return false;
		}

		return this.fFecha != null;
	}

	/**
	 * Método que recibe una variable de tipo Date y devuelve un String con el
	 * formato AAAAMMDDHHMMSS
	 * 
	 * @param pfFecha
	 *            Fecha a convertir
	 * @return String con el formato mencionado anteriormente
	 */

	public static String convertirAAAAMMDDHHMMSS(Date pfFecha) {
		return Formateador.getValorFormateado(Formateador.SIMPLEDATEFORMAT,
				"yyyyMMddHHmmss", pfFecha);
	}

	/**
	 * Metodo que Convierte una fecha pasada como parametro a un String con el
	 * formato indicado
	 * 
	 * @param pfFecha
	 *            Fecha a convertir
	 * @param psFormatoFecha
	 *            formato valido para a convertir
	 * @return String con la fecha en el formato indicado
	 */
	public static String convertir(Date pfFecha, String psFormatoFecha) {
		return (pfFecha == null || psFormatoFecha == null) ? "" : Formateador
				.getValorFormateado(Formateador.SIMPLEDATEFORMAT,
						psFormatoFecha, pfFecha);
	}

	/**
	 * Metodo que Convierte un String pasado como parametro a un Date con el
	 * formato indicado
	 * 
	 * @param psFecha
	 *            Fecha a convertir
	 * @param psFormatoFecha
	 *            formato valido para a convertir
	 * @return Date con la fecha en el formato indicado
	 */
	public static Date convertir(String psFecha, String psFormatoFecha) {
		return (psFecha == null || psFormatoFecha == null) ? null : Formateador
				.getSimpleDateFormat(psFormatoFecha).parse(psFecha,
						new ParsePosition(0));
	}

	/**
	 * Método que convierte una Cadena en una Fecha
	 * 
	 * @param psFecha
	 *            Cadena a convertir
	 * @param pbDevNulo
	 *            Devuelve el Valor Nulo
	 * @return Fecha Representativa de la Cadena
	 */
	public static Date convertir(String psFecha, boolean pbDevNulo) {
		Fecha oFecha = new Fecha();

		if (oFecha.convertir(psFecha)) {
			return oFecha.obtener();
		}

		return pbDevNulo ? null : new Date();
	}

	/**
	 * Método que convierte una Cadena en una Fecha
	 * 
	 * @param psFecha
	 *            Cadena a convertir
	 * @return true - Si se ha convertido correctamente
	 * @return false - Si ha fallado la conversión
	 */
	public boolean convertir(String psFecha) {
		if (psFecha == null) {
			return false;
		} else {
			if (psFecha.matches("\\d{1,2}\\:\\d{1,2}")) {
				return this.convertir("01/01/1900 " + psFecha + ":00");
			} else if (psFecha.matches("\\d{2}")) {
				return this.convertir("01/01/"
						+ (Integer.parseInt(psFecha) > 70 ? "19" : "20")
						+ psFecha);
			} else if (psFecha.matches("\\d{4}")) {
				return this.convertir("01/01/" + psFecha);
			} else if (psFecha.matches("\\d{14}.*")) {
				return this.convertirAAAAMMDDHHMMSS(psFecha);
			} else if (psFecha.matches("\\d{8}.*")) {
				return this.convertirDDMMAAAA(psFecha);
			} else if (psFecha
					.matches("\\d{4}[\\-/]\\d{2}[\\-/]\\d{2} \\d{2}.\\d{2}.\\d{2}.*")) {
				return this.convertirAAAAMMDDHHMMSS(psFecha.substring(0, 4)
						+ psFecha.substring(5, 7) + psFecha.substring(8, 10)
						+ psFecha.substring(11, 13) + psFecha.substring(14, 16)
						+ psFecha.substring(17, 19));
			} else if (psFecha
					.matches("[0-1]\\d[\\-/][0-3]\\d[\\-/]\\d{4} \\d{2}.\\d{2}.\\d{2}.*")
					&& Integer.parseInt(psFecha.substring(3, 5)) > 12) {
				return this.convertirAAAAMMDDHHMMSS(psFecha.substring(6, 10)
						+ psFecha.substring(0, 2) + psFecha.substring(3, 5)
						+ psFecha.substring(11, 13) + psFecha.substring(14, 16)
						+ psFecha.substring(17, 19));
			} else if (psFecha.matches("\\d{4}[\\-/]\\d{2}[\\-/]\\d{2}.*")) {
				return this.convertirDDMMAAAA(psFecha.substring(8, 10)
						+ psFecha.substring(5, 7) + psFecha.substring(0, 4));
			} else if (psFecha.matches("[0-1]\\d[\\-/][0-3]\\d[\\-/]\\d{4}.*")
					&& Integer.parseInt(psFecha.substring(3, 5)) > 12) {
				return this.convertirDDMMAAAA(psFecha.substring(3, 5)
						+ psFecha.substring(0, 2) + psFecha.substring(6, 10));
			} else if (psFecha.matches("\\d{2}[\\-/]\\d{2}[\\-/]\\d{4}.*")) {
				return this.convertirDDMMAAAA(psFecha.substring(0, 2)
						+ psFecha.substring(3, 5) + psFecha.substring(6, 10));
			} else if (psFecha.matches("\\d{2}[\\-/]\\d{2}[\\-/]\\d{2}.*")) {
				return this.convertirDDMMAA(psFecha.substring(0, 2)
						+ psFecha.substring(3, 5) + psFecha.substring(6, 8));
			}

			return false;
		}
	}

	/**
	 * Método que convierte una Cadena con el Formato AAAAMMDDHHMMSS en una
	 * Fecha
	 * 
	 * @param psFecha
	 *            Cadena a convertir
	 * @return true - Si se ha convertido correctamente
	 * @return false - Si ha fallado la conversión
	 */

	public boolean convertirAAAAMMDDHHMMSS(String psFecha) {
		if (psFecha == null || psFecha.length() < 14
				|| !psFecha.matches("\\d{14}.*")) {
			return false;
		}

		try {
			this.fFecha = Formateador.getSimpleDateFormat("yyyyMMddHHmmss")
					.parse(psFecha.substring(0, 14), new ParsePosition(0));
		} catch (Exception ex) {
			return false;
		}

		return this.fFecha != null;
	}

	/**
	 * Método que devuelve la Fecha
	 * 
	 * @return Fecha
	 */

	public Date obtener() {
		return this.fFecha;
	}

	/**
	 * Devuelve los símbolos dependientes del Locale.
	 * 
	 * @return DateFormatSymbols Símbolos dependientes del Locale.
	 */

	public static DateFormatSymbols getDatForSymbo() {
		return oDatForSymbo;
	}

	/**
	 * Métodos para Formatear Fechas
	 */

	/**
	 * Método que devuelve la Fecha con el Formato por Defecto
	 * 
	 * @param pfFecha
	 *            Fecha a Formatear
	 * @return Devuelve la Fecha Formateada
	 */

	public static String formatear(Date pfFecha) {
		return Formateador.getFechaFormateada(Formateador.FECHA_LARGA, pfFecha);
	}

	/**
	 * Método que aplica a una Fecha un Formato específico
	 * 
	 * @param pfFecha
	 *            Fecha a formatear
	 * @param psFormato
	 *            Formato a aplicar a la Fecha
	 * @return Devuelve la Fecha Formateada
	 */

	public static String formatear(Date pfFecha, String psFormato) {
		return Formateador.getFechaFormateada(psFormato, pfFecha);
	}

	/**
	 * Método que aplica a una Fecha un Formato específico
	 * 
	 * @param pfFecha
	 *            Fecha a formatear
	 * @param psFormato
	 *            Formato a aplicar a la Fecha
	 * @param poLocale
	 *            Locale (Idioma)
	 * @return Devuelve la Fecha Formateada
	 */

	public static String formatear(Date pfFecha, String psFormato,
			Locale poLocale) {
		/*
		 * Si el formato de fecha es largo y el locale es catalán, se debe
		 * controlar que los meses no empiecen por vocal, ya que en ese caso el
		 * formato de la fecha varía
		 */
		if (psFormato.equals(Formateador.DES_FECHA_LARGA)
				&& poLocale.equals(Fecha.LOCALE_CATALAN)) {
			Calendar oCalendar = Calendar.getInstance();
			oCalendar.setTime(pfFecha);
			int iMes = oCalendar.get(Calendar.MONTH);
			/*
			 * Los Meses que empizan por vocales en catalán (Abril, Agosto,
			 * Octubre). NOTA. El mes de Enero corresponde al número 0.
			 */
			if (iMes == 3 || iMes == 7 || iMes == 9) {
				psFormato = Fecha.DES_LAR_FECHA_CAT_BIS;
			}
		}

		return Formateador.getFechaFormateada(psFormato, pfFecha, poLocale);
	}

	/**
	 * Método que devuelve una Fecha truncada a Día
	 * 
	 * @param pfFecha
	 *            Fecha a Truncar
	 * @return Devuelve la Fecha Truncada
	 */

	public static Date truncar(Date pfFecha) {

		if (pfFecha == null) {
			return null;
		}

		fCalendario.setTime(pfFecha);

		// Se limpian los campos no necesarios del calendario

		fCalendario.set(Calendar.HOUR, 0);
		fCalendario.set(Calendar.HOUR_OF_DAY, 0);
		fCalendario.set(Calendar.MINUTE, 0);
		fCalendario.set(Calendar.SECOND, 0);
		fCalendario.set(Calendar.MILLISECOND, 0);

		return fCalendario.getTime();

	}

	/**
	 * Método que indica si un año es Bisiesto
	 * 
	 * @return true - Si el Año es Bisiesto
	 * @return false - Si el Año no es Bisiesto
	 */

	public boolean esBisiesto() {
		return Fecha.esBisiesto(this.fFecha);
	}

	/**
	 * Método que indica si un año es Bisiesto
	 * 
	 * @param pfFecha
	 *            Fecha a comprobar
	 * @return true - Si el Año es Bisiesto
	 * @return false - Si el Año no es Bisiesto
	 */

	public static boolean esBisiesto(Date pfFecha) {
		fCalendario.setTime(pfFecha);
		int iAño = fCalendario.get(Calendar.YEAR);

		if (((iAño % 4) == 0) || ((iAño % 400) == 0)) {
			return true;
		}

		return false;
	}

	/**
	 * Método que devuelve el Número de Día en el Año de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Día del Año de una Fecha determinada (devuelve 0 si la Fecha es
	 *         Nula)
	 */

	public static int devuelveDiaJuliana(Date pfFecha) {
		if (pfFecha != null) {
			return 1 + Fecha.diferenciaFechaDias(
					Fecha.primerDiaDelAno(pfFecha), pfFecha, 2);
		} else {
			return 0;
		}
	}

	/**
	 * Método que devuelve el Día en Número de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Día (en número) de una Fecha determinada (devuelve -1 si la Fecha
	 *         es Nula)
	 */

	public static int devuelveDiaNumero(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			return fCalendario.get(Calendar.DAY_OF_MONTH);
		} else {
			return -1;
		}
	}

	/**
	 * Método que devuelve el Día en Letra de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Día (en letra) de una Fecha determinada (devuelve null si la
	 *         Fecha es Nula)
	 */

	public static String devuelveDiaLetra(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			int iFecha = fCalendario.get(Calendar.DAY_OF_MONTH);
			DecimalFormatText oDecForText = null;
			String sTexto = null;

			try {
				oDecForText = new DecimalFormatText();
				sTexto = oDecForText.obtenerTexto(iFecha, 1);
			} catch (CtrError oError) {
				oError.mensajeInformacion();
			}

			return sTexto;
		} else {
			return null;
		}
	}



	/**
	 * Método que devuelve el Mes en Número de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Mes (en número) de una Fecha determinada (devuelve -1 si la Fecha
	 *         es Nula)
	 */

	public static int devuelveMesNumero(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);

			// Hay que sumar 1 porque los meses van de 0 a 11

			return fCalendario.get(Calendar.MONTH) + 1;
		} else {
			return -1;
		}
	}

	/**
	 * Método que devuelve el Mes en Letra de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Mes (en Letra) de una Fecha determinada (devuelve null si la
	 *         Fecha es Nula)
	 */

	public static String devuelveMesLetra(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);

			// Hay que sumar 1 porque los meses van de 0 a 11

			int iFecha = fCalendario.get(Calendar.MONTH) + 1;
			DecimalFormatText oDecForText = null;
			String sTexto = null;

			try {
				oDecForText = new DecimalFormatText();
				sTexto = oDecForText.obtenerTexto(iFecha, 1);
			} catch (CtrError oError) {
				oError.mensajeInformacion();
			}

			return sTexto;
		} else {
			return null;
		}
	}



	/**
	 * Método que devuelve el Año en Número de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Año (en Número) de una Fecha determinada (devuelve 0 si la Fecha
	 *         es Nula)
	 */

	public static int devuelveAnoNumero(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			return fCalendario.get(Calendar.YEAR);
		} else {
			return 0;
		}
	}

	/**
	 * Método que devuelve el Año en Letra de una Fecha determinada
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return Año (en Letra) de una Fecha determinada (devuelve null si la
	 *         Fecha es Nula)
	 */

	public static String devuelveAnoLetra(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			int iFecha = fCalendario.get(Calendar.YEAR);
			DecimalFormatText oDecForText = null;
			String sTexto = null;

			try {
				oDecForText = new DecimalFormatText();
				sTexto = oDecForText.obtenerTexto(iFecha, 1);
			} catch (CtrError oError) {
				oError.mensajeInformacion();
			}

			return sTexto;
		} else {
			return null;
		}
	}


	/**
	 * Método que indica si una Fecha es Igual a otra
	 * 
	 * @param poFecha
	 *            Fecha a comparar
	 * @return Indicador de si una Fecha es Igual a otra
	 */

	public boolean esIgual(Fecha poFecha) {
		return (this.fFecha.equals(poFecha.fFecha));
	}

	/**
	 * Método que indica si una Fecha es Mayor a otra
	 * 
	 * @param poFecha
	 *            Fecha a comparar
	 * @return Indicador de si una Fecha es Mayor a otra
	 */

	public boolean esMayor(Fecha poFecha) {
		return (this.fFecha.after(poFecha.fFecha));
	}

	/**
	 * Método que indica si una Fecha es Menor a otra
	 * 
	 * @param poFecha
	 *            Fecha a comparar
	 * @return Indicador de si una Fecha es Menor a otra
	 */

	public boolean esMenor(Fecha poFecha) {
		return (this.fFecha.before(poFecha.fFecha));
	}

	/**
	 * Método que indica si una Fecha es Igual a otra.
	 * 
	 * @param poFecha1
	 *            Primera Fecha a comparar.
	 * @param poFecha2
	 *            Segunda Fecha a comparar.
	 * @return Indicador de si una Fecha es Igual a otra.
	 */

	public static boolean esIgual(Date poFecha1, Date poFecha2) {
		return poFecha1.equals(poFecha2);
	}

	/**
	 * Método que indica si una Fecha es Mayor a otra.
	 * 
	 * @param poFecha1
	 *            Primera Fecha a comparar.
	 * @param poFecha2
	 *            Segunda Fecha a comparar.
	 * @return Indicador de si una Fecha es Mayor a otra.
	 */

	public static boolean esMayor(Date poFecha1, Date poFecha2) {
		return poFecha1.after(poFecha2);
	}

	/**
	 * Método que indica si una Fecha es Menor a otra.
	 * 
	 * @param poFecha1
	 *            Primera Fecha a comparar.
	 * @param poFecha2
	 *            Segunda Fecha a comparar.
	 * @return Indicador de si una Fecha es Menor a otra.
	 */

	public static boolean esMenor(Date poFecha1, Date poFecha2) {
		return poFecha1.before(poFecha2);
	}

	/**
	 * Compara a nivel de Días 2 Fechas. Antes se truncaban las fechas. Esta es
	 * la versión más óptima que se ha encontrado.
	 * 
	 * @param pfFec1
	 *            Primera Fecha a Comparar
	 * @param pfFec2
	 *            Segunda Fecha a Comparar
	 * @return Comparación entre Fechas
	 */

	public static int comparaDias(Date pfFec1, Date pfFec2) {
		if (pfFec1 == null && pfFec2 == null) {
			return 0;
		}

		if (pfFec1 != null && pfFec2 == null) {
			return 1;
		}

		if (pfFec1 == null && pfFec2 != null) {
			return -1;
		}

		// Obtenemos de las dos fechas el año, mes y día

		fCalendario.setTime(pfFec1);

		int iAno1 = fCalendario.get(Calendar.YEAR);
		int iMes1 = fCalendario.get(Calendar.MONTH);
		int iDia1 = fCalendario.get(Calendar.DAY_OF_MONTH);

		fCalendario.setTime(pfFec2);

		int iAno2 = fCalendario.get(Calendar.YEAR);
		int iMes2 = fCalendario.get(Calendar.MONTH);
		int iDia2 = fCalendario.get(Calendar.DAY_OF_MONTH);

		// Primero comparamos por años

		if (iAno1 > iAno2) {
			return 1;
		} else if (iAno1 < iAno2) {
			return -1;
		} else {
			// Comparar por meses

			if (iMes1 > iMes2) {
				return 1;
			} else if (iMes1 < iMes2) {
				return -1;
			} else {
				// Comparar por días

				if (iDia1 > iDia2) {
					return 1;
				} else if (iDia1 < iDia2) {
					return -1;
				} else {
					// Las dos fechas son iguales

					return 0;
				}
			}
		}
	}

	/**
	 * Método que indica la Diferencia entre dos Fechas en el Formato
	 * especificado
	 * 
	 * @param poFecha
	 *            Fecha a comparar
	 * @param psFormato
	 *            Indicador de Formato
	 * @return Diferencia de Fechas en el Formato deseado
	 */

	public long diferencia(Fecha poFecha, String psFormato) {
		double dDiferencia;
		long lDivisor;

		if (psFormato == Formateador.SEGUNDOS) {
			lDivisor = 1000;
		} else if (psFormato == Formateador.MINUTOS) {
			lDivisor = 1000 * 60;
		} else if (psFormato == Formateador.HORA) {
			lDivisor = 1000 * 60 * 60;
		} else if (psFormato == Formateador.NUMERO_DIA) {
			lDivisor = 1000 * 60 * 60 * 24;
		} else {
			lDivisor = 0;
		}

		try {
			dDiferencia = (double) ((fFecha.getTime() - poFecha.fFecha
					.getTime()) / lDivisor);
			return (long) dDiferencia;
		} catch (Exception e) {
			// falta gestionar excepcion
			return 0;
		}
	}

	/**
	 * Método que calcula el último Día del Mes.
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Retorna la Fecha con el Último Día del Mes.
	 */

	public static Date ultimoDiaDelMes(Date pfFecha) {
		fCalendario.setTime(pfFecha);
		fCalendario.set(Calendar.DAY_OF_MONTH,
				fCalendario.getActualMaximum(Calendar.DAY_OF_MONTH));
		return fCalendario.getTime();
	}

	/**
	 * Método que calcula el último Día del Mes.
	 * 
	 * @param piMes
	 *            Mes.
	 * @param piAnno Año.
	 * @return Devuelve la Fecha con el último Día del Mes.
	 */

	public static Date ultimoDiaDelMes(int piMes, int piAnno) {
		fCalendario.set(piAnno, piMes, 1, 0, 0, 0);
		fCalendario.set(Calendar.DAY_OF_MONTH,
				fCalendario.getActualMaximum(Calendar.DAY_OF_MONTH));
		return fCalendario.getTime();
	}

	/**
	 * Método que devuelve el Mes en Letra de una Fecha determinada dependiendo
	 * del idioma pasado por parámetro
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @param psIdioma
	 *            Idioma
	 * @return Día (en letra) de una Fecha determinada (devuelve null si la
	 *         Fecha es Nula)
	 */

	public static String devuelveMesEnLetraIdioma(Date pfFecha, String psIdioma) {
		String sMes = null;

		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			int iFecha = fCalendario.get(Calendar.MONTH);

			if (!psIdioma.equalsIgnoreCase("eu")
					&& !psIdioma.equalsIgnoreCase("gl")) {
				DateFormatSymbols oDatFechas = new DateFormatSymbols(Locale.of(psIdioma, "ES"));
				sMes = oDatFechas.getMonths()[iFecha];
			}
		}

		return sMes;
	}

	/**
	 * Método que devuelve el Día de la semana en Letra de una Fecha determinada
	 * dependiendo del idioma pasado por parámetro
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @param psIdioma
	 *            Idioma
	 * @return Día (en letra) de una Fecha determinada (devuelve null si la
	 *         Fecha es Nula)
	 */

	public static String devuelveDiaSemanaEnLetraIdioma(Date pfFecha,
			String psIdioma) {

		String sDiaSeman = null;

		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			int iFecha = fCalendario.get(Calendar.DAY_OF_WEEK);

			if (!psIdioma.equalsIgnoreCase("eu")
					&& !psIdioma.equalsIgnoreCase("gl")) {
				DateFormatSymbols oDatFechas = new DateFormatSymbols(Locale.of(psIdioma, "ES"));
				sDiaSeman = oDatFechas.getWeekdays()[iFecha];
			}
		}

		return sDiaSeman;
	}

	/**
	 * Método que calcula el Número de Días de un Mes.
	 * 
	 * @param pfFecha
	 *            Fecha con la que hay que trabajar.
	 * @return Retorna el Número de Días del Mes.
	 */

	public static int numDiasDelMes(Date pfFecha) {
		fCalendario.setTime(ultimoDiaDelMes(pfFecha));
		return fCalendario.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Método que devuelve la Diferencia de Días entre dos Fechas
	 * 
	 * @param pfFecIni
	 *            Fecha Inicial
	 * @param pfFecFin
	 *            Fecha Final
	 * @param piRedondeo
	 *            Tipo de Redondeo (0-No Redondeo, 1-Parte Entera, 2-Redondear,
	 *            3-Redondear al Alta)
	 * @return Número de Días entre dos Fechas (devuelve -1 si alguna de las
	 *         Fechas es Nula)
	 * @throws CtrError
	 */

	public static int diferenciaFechaDias(Date pfFecIni, Date pfFecFin,
			int piRedondeo) {
		if (pfFecIni != null && pfFecFin != null) {
			double dDiferencia;
			pfFecIni = Fecha.truncar(pfFecIni);
			pfFecFin = Fecha.truncar(pfFecFin);

			/* Si la Fecha final es menor que la fecha inicial */
			/* se retorna -1 */

			if (pfFecIni.after(pfFecFin)) {
				return -1;
			}

			/* Se hacen cáculos pertinentes ya que */
			/* el resultado es en milisegundos */

			dDiferencia = ((double) (pfFecFin.getTime() - pfFecIni.getTime()) / (double) (1000 * 60 * 60 * 24));

			switch (piRedondeo) {
			case 1:
				return (int) dDiferencia;
			case 2:
				return (int) (dDiferencia + 0.5);
			case 3:
				return (int) (dDiferencia + 0.999999);
			}

			return (int) dDiferencia;
		} else {
			return -1;
		}
	}

	/**
	 * Método que devuelve la Diferencia de Días entre dos Fechas
	 * @param pfFecIni Fecha Inicial
	 * @param pfFecFin Fecha Final
	 * @return Número de Días entre dos Fechas
	 */
	public static int diferenciaFechaDias(Date pfFecIni, Date pfFecFin) {

		// si algún parámetro es null devolvemos 0

		if (pfFecIni == null || pfFecFin == null) {

			return 0;

		}

		pfFecIni = setMidnight(pfFecIni); // seteamos la fecha a medianoche
									// (00:00:00.0000)

		pfFecFin = setMidnight(pfFecFin); // seteamos la fecha a medianoche
									// (00:00:00.0000)

		Calendar calendar1 = Calendar.getInstance(); // creamos la instancia del
														// calendario

		Calendar calendar2 = Calendar.getInstance(); // creamos la instancia del
														// calendario

		// comprobamos cuál es mayor para setearlo correctamente

		if (pfFecFin.compareTo(pfFecIni) > 0) {

			calendar1.setTime(pfFecIni);

			calendar2.setTime(pfFecFin);

		} else {

			calendar1.setTime(pfFecFin);

			calendar2.setTime(pfFecIni);

		}

		int days = 0;

		// mientras la fecha del calendario 2 sea mayor que la fecha del
		// calendario 1

		while (calendar1.compareTo(calendar2) < 0) {

			calendar1.add(Calendar.DAY_OF_MONTH, 1); // suma un día al
														// calendario 1

			days++;

		}

		return days;

	}

	private static Date setMidnight(Date date) {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		calendar.set(Calendar.HOUR_OF_DAY, 0);

		calendar.set(Calendar.MINUTE, 0);

		calendar.set(Calendar.SECOND, 0);

		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();

	}


	/**
	 * Calcula el número de años completos entre dos fechas
	 * 
	 * @param pfFechaInicio
	 *            Fecha Inicial
	 * @param pfFechaFin
	 *            Fecha Final
	 * @return Devuelve el número de años enteros entre las dos fechas
	 */
	public static int diferenciaFechaAño(Date pfFechaInicio, Date pfFechaFin) {

		/* Obtiene los años correspondientes a cada fecha */

		int iAñoInicio = Fecha.devuelveAnoNumero(pfFechaInicio);

		// int iAñoFin = Fecha.devuelveAnoNumero(Fecha.sumaDias(pfFechaFin, 1));
		int iAñoFin = Fecha.devuelveAnoNumero(pfFechaFin);

		/* El resultado inicial va a ser la diferencia de los años */

		int iResultado = iAñoFin - iAñoInicio;

		/*
		 * Comprueba los meses y los días de las fechas para comprobar si el
		 * último año ha pasado completo
		 */
		/*
		 * Si el mes de la fecha final es menor que el de la inicial, el último
		 * año no ha pasado completo
		 */
		if (Fecha.devuelveMesNumero(pfFechaFin) < Fecha
				.devuelveMesNumero(pfFechaInicio)) {
			iResultado--;
		}
		/* Si el mes es el mismo, hay que comparar los días */
		else if (Fecha.devuelveMesNumero(pfFechaFin) == Fecha
				.devuelveMesNumero(pfFechaInicio)) {
			/*
			 * Si el día de la fecha final es menor que el de la inicial, el
			 * último año no ha pasado completo
			 */
			if (Fecha.devuelveDiaNumero(pfFechaFin) < Fecha
					.devuelveDiaNumero(pfFechaInicio)) {
				iResultado--;
			}
		}

		/* En el resto de los casos el resultado se mantiene como al principio */

		/* Devuelve el resultado */
		return iResultado;
	}

	/**
	 * Calcula el número de Meses completos entre dos fechas excluyendo 1
	 * extremo
	 * 
	 * @param pfFechaInicio
	 *            Fecha Inicial
	 * @param pfFechaFin
	 *            Fecha Final
	 * @return Devuelve el número de Meses enteros entre las dos fechas
	 */
	public static int diferenciaFechaMeses(Date pfFechaInicio, Date pfFechaFin) {
		int iResultado = (Fecha.devuelveAnoNumero(pfFechaFin)
				- Fecha.devuelveAnoNumero(pfFechaInicio) - 1)
				* 12
				+ Fecha.devuelveMesNumero(pfFechaFin)
				+ 12
				- Fecha.devuelveMesNumero(pfFechaInicio);

		if (Fecha.devuelveDiaNumero(pfFechaFin) < Fecha
				.devuelveDiaNumero(pfFechaInicio)) {
			iResultado--;
		}

		return iResultado;
	}


	/**
	 * Método que dado una Fecha se Cálcula el Número de Trimestre.
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Devuelve el Número de Trimestre.
	 */

	public static int numTrimestre(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			return fCalendario.get(Calendar.MONTH) / 3 + 1;
		} else {
			return -1;
		}
	}

	/**
	 * Método que calcula el Primer Día del Mes.
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Devuelve la Fecha con el Primer Día del Mes.
	 */

	public static Date primerDiaDelMes(Date pfFecha) {
		fCalendario.setTime(pfFecha);
		fCalendario.set(Calendar.DAY_OF_MONTH,
				fCalendario.getActualMinimum(Calendar.DAY_OF_MONTH));

		return fCalendario.getTime();
	}
	
	public static Date primerDiaDelMesSiguiente(Date pfFecha) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.MONTH, 1);
		return fCalendario.getTime();
	}

	/**
	 * Método que calcula el Primer Día del Mes.
	 * 
	 * @param piMes
	 *            Mes.
	 * @param piAnno Año.
	 * @return Devuelve la Fecha con el Primer Día del Mes.
	 */

	public static Date primerDiaDelMes(int piMes, int piAnno) {
		fCalendario.set(piAnno, piMes, 1, 0, 0, 0);
		return fCalendario.getTime();
	}

	/**
	 * Método que calcula el Primer Día del Año.
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Devuelve la Fecha con el Primer Día del Año.
	 */

	public static Date primerDiaDelAno(Date pfFecha) {
		fCalendario.setTime(pfFecha);
		fCalendario.set(fCalendario.get(Calendar.YEAR), Calendar.JANUARY, 1, 0,
				0, 0);
		return fCalendario.getTime();
	}

	/**
	 * Método que calcula el Primer Día del Año.
	 * 
	 * @param piAnno
	 *            Año
	 * @return Devuelve la Fecha con el Primer Día del Año.
	 */

	public static Date primerDiaDelAno(int piAnno) {
		fCalendario.set(piAnno, Calendar.JANUARY, 1, 0, 0, 0);
		return fCalendario.getTime();
	}

	/**
	 * Método que calcula el Ultimo Día del Año.
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Devuelve la Fecha con el Último Día del Año.
	 */

	public static Date ultimoDiaDelAno(Date pfFecha) {
		fCalendario.setTime(pfFecha);
		fCalendario.set(fCalendario.get(Calendar.YEAR), Calendar.DECEMBER, 31,
				23, 59, 59);
		return fCalendario.getTime();
	}

	/**
	 * Método que calcula el Ultimo Día del Año.
	 * 
	 * @param piAno
	 *            Año.
	 * @return Devuelve la Fecha con el Último Día del Año.
	 */
	public static Date ultimoDiaDelAno(int piAno) {
		fCalendario.set(piAno, Calendar.DECEMBER, 31, 23, 59, 59);
		return fCalendario.getTime();
	}

	/**
	 * Método que trunca a día la Fecha
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Devuelve la Fecha truncada a día
	 */

	public static Date primerRangoDia(Date pfFecha) {
		Date fRetorno = null;

		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			fCalendario.set(fCalendario.get(Calendar.YEAR),
					fCalendario.get(Calendar.MONTH),
					fCalendario.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
			fRetorno = fCalendario.getTime();
		}

		return fRetorno;
	}

	/**
	 * Método que trunca a día la Fecha agregándole 23:59:59 para las búsquedas.
	 * 
	 * @param pfFecha
	 *            Fecha.
	 * @return Devuelve la Fecha truncada a día
	 */

	public static Date ultimoRangoDia(Date pfFecha) {
		Date fRetorno = null;

		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			fCalendario.set(fCalendario.get(Calendar.YEAR),
					fCalendario.get(Calendar.MONTH),
					fCalendario.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
			fRetorno = fCalendario.getTime();
		}

		return fRetorno;
	}

	/**
	 * Método que suma a una Fecha un Número de Meses.
	 * 
	 * @param pfFecha
	 *            Fecha a tratar.
	 * @param piNumMeses
	 *            Número de Meses a sumar.
	 * @return Devuelve la Fecha.
	 */

	public static Date sumaMeses(Date pfFecha, int piNumMeses) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.MONTH, piNumMeses);
		return fCalendario.getTime();
	}

	/**
	 * Método que suma a una Fecha un Número de Años.
	 * 
	 * @param pfFecha
	 *            Fecha a tratar.
	 * @param piNumAños
	 *            Número de Años a sumar.
	 * @return Devuelve la Fecha.
	 */

	public static Date sumaAños(Date pfFecha, int piNumAños) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.YEAR, piNumAños);
		return fCalendario.getTime();
	}

	/**
	 * Método que suma a una Fecha un Número de Días.
	 * 
	 * @param pfFecha
	 *            Fecha a tratar.
	 * @param piNumDias
	 *            Número de Días a sumar.
	 * @return Devuelve la Fecha.
	 */

	public static Date sumaDias(Date pfFecha, int piNumDias) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.DATE, piNumDias);
		return fCalendario.getTime();
	}

	/**
	 * Método que suma a una Fecha un Número de Horas.
	 * 
	 * @param pfFecha
	 *            Fecha a tratar.
	 * @param piNumHoras
	 *            Número de Horas a sumar.
	 * @return Devuelve la Fecha.
	 */

	public static Date sumaHoras(Date pfFecha, int piNumHoras) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.HOUR, piNumHoras);
		return fCalendario.getTime();
	}

	/**
	 * Método que suma a una Fecha un Número de Minutos.
	 * 
	 * @param pfFecha
	 *            Fecha a tratar.
	 * @param piNumMinut
	 *            Número de Minutos a sumar.
	 * @return Devuelve la Fecha.
	 */

	public static Date sumaMinutos(Date pfFecha, int piNumMinut) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.MINUTE, piNumMinut);
		return fCalendario.getTime();
	}

	/**
	 * Método que suma a una Fecha un Número de Segundos.
	 * 
	 * @param pfFecha
	 *            Fecha a tratar.
	 * @param piNumSegun
	 *            Número de Segundos a sumar.
	 * @return Devuelve la Fecha.
	 */

	public static Date sumaSegundos(Date pfFecha, int piNumSegun) {
		fCalendario.setTime(pfFecha);
		fCalendario.add(Calendar.SECOND, piNumSegun);
		return fCalendario.getTime();
	}

	/**
	 * Método que realiza la suma de dos fechas
	 * 
	 * @param pfFecPrime
	 *            Fecha a Incrementar
	 * @param pfFecSegun
	 *            Fecha que se le Suma
	 * @return Devuelve una Fecha como resultado de la Suma
	 */

	public static Date metricaFechas(Date pfFecPrime, Date pfFecSegun) {
		return metricaFechas(pfFecPrime, pfFecSegun, "+");
	}

	/**
	 * Método que Suma o Resta dos Fechas
	 * 
	 * @param pfFecPrime
	 *            Fecha a Incrementar o Decrementar
	 * @param pfFecSegun
	 *            Fecha que se debe Sumar o Restar
	 * @param psSigno
	 *            Signo de la Operación: '+' --> Suma, '-' --> Resta
	 * @return Devuelve una Fecha como resultado de la Operación
	 */

	public static Date metricaFechas(Date pfFecPrime, Date pfFecSegun,
			String psSigno) {
		Calendar oCalen1 = Calendar.getInstance();
		Calendar oCalen2 = Calendar.getInstance();
		int i = 1;

		oCalen1.setTime(pfFecPrime);
		oCalen2.setTime(pfFecSegun);

		if (psSigno.equals("+")) {
			i = 1;
		} else if (psSigno.equals("-")) {
			i = -1;
		}

		oCalen1.add(Calendar.SECOND, oCalen2.get(Calendar.SECOND) * i);
		oCalen1.add(Calendar.MINUTE, oCalen2.get(Calendar.MINUTE) * i);
		oCalen1.add(Calendar.HOUR, oCalen2.get(Calendar.HOUR_OF_DAY) * i);
		oCalen1.add(Calendar.DATE, oCalen2.get(Calendar.DATE) * i);

		return oCalen1.getTime();
	}

	/**
	 * Método que calcula el Número de Meses que hay entre dos Fechas
	 * 
	 * @param pfFecIni
	 *            Fecha Inicial
	 * @param pfFecFin
	 *            Fecha Final
	 * @return Número de Meses que hay entre dos Fechas (incluyendo los
	 *         extremos)
	 */

	public static int numMeses(Date pfFecIni, Date pfFecFin) {
		if (pfFecIni != null && pfFecFin != null) {
			double dDiferencia;
			Calendar fIni = Calendar.getInstance();
			Calendar fFin = Calendar.getInstance();

			fIni.setTime(pfFecIni);
			fFin.setTime(Fecha.sumaDias(pfFecFin, 1));

			/* Si la Fecha final es menor que la fecha inicial */
			/* se retorna -1 */

			if (fIni.getTime().after(fFin.getTime())) {
				return -1;
			}

			int iAnoInicio = fIni.get(Calendar.YEAR);
			int iAnoFin = fFin.get(Calendar.YEAR);
			int iMesInicio = fIni.get(Calendar.MONTH);
			int iMesFin = fFin.get(Calendar.MONTH);
			int iDiaInicio = fIni.get(Calendar.DAY_OF_MONTH);
			int iDiaFin = fFin.get(Calendar.DAY_OF_MONTH);
			int iNumAnos;

			/* Comprobar si tienen el mismo año */

			if (iAnoInicio == iAnoFin) {

				/*
				 * Si tienen el mismo año la diferencia de las fechas es la
				 * diferencia de los meses
				 */
				dDiferencia = iMesFin - iMesInicio;

				/*
				 * Si además el día de la fecha de inicio es superior al de la
				 * fecha de fin, el último més no habrá transcurrido completo,
				 * por lo que hay que incrementar la diferencia en 1
				 */

				if (iDiaInicio > iDiaFin) {
					dDiferencia--;
				}

				/* En otro caso el año de fin es superior al de inicio */
			} else {

				/* Calcular el número de años entre dos fechas */

				iNumAnos = iAnoFin - iAnoInicio;

				/*
				 * La diferencia en cuanto a meses es la suma del mes de la
				 * fecha de fin y el resto de meses que quedan desde el mes de
				 * la fecha de inicio hasta fin de año
				 */

				dDiferencia = iMesFin - iMesInicio;

				if (dDiferencia < 0) {
					dDiferencia = (12 - iMesInicio) + iMesFin;
				}

				/*
				 * Si el día del mes de la fecha de inicio es mayor que el de la
				 * fecha de fin, ha transcurrido un mes menos entre las dos
				 * fechas
				 */

				if (iDiaInicio > iDiaFin) {
					dDiferencia--;
				}

				/*
				 * Si el mes de la fecha de inicio es mayor que el de la fecha
				 * de fin, no ha transcurrido el año completo, decrementamos en
				 * 1 la diferencia de años
				 */

				if (iMesInicio > iMesFin) {
					iNumAnos--;
				}

				/*
				 * A la diferencia de meses hay que añadir los años que han
				 * pasado entre dos fechas en meses
				 */

				dDiferencia += 12 * iNumAnos;
			}

			return (int) dDiferencia;
		} else {
			return -1;
		}
	}

	/**
	 * Método que devuelve los Símbolos utilizados para Formatear las Fechas.
	 */

	private static void configurarSimbolos() {
		if (Locale.getDefault().getLanguage().toUpperCase().equals("ES")
				&& Locale.getDefault().getCountry().toUpperCase().equals("ES")) {
			String[] aoMesSymbo = Fecha.oDatForSymbo.getMonths();

			for (int i = 0; i < aoMesSymbo.length; i++) {
				String sMes = aoMesSymbo[i];

				if (sMes.length() > 0) {
					aoMesSymbo[i] = sMes.substring(0, 1).toUpperCase()
							+ sMes.substring(1);
				}
			}

			Fecha.oDatForSymbo.setMonths(aoMesSymbo);
		}
	}

	/**
	 * Método que devuelve true si la fecha que se pasa como parámetro cae en
	 * Sábado
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return true si la fecha cae en Sábado
	 */
	public static boolean esSabado(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			if (fCalendario.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Método que devuelve true si la fecha que se pasa como parámetro cae en
	 * Domingo
	 * 
	 * @param pfFecha
	 *            Fecha a tratar
	 * @return true si la fecha cae en Domingo
	 */
	public static boolean esDomingo(Date pfFecha) {
		if (pfFecha != null) {
			fCalendario.setTime(pfFecha);
			if (fCalendario.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Devuelve si es necesario asignar la Lista de Festividades
	 * 
	 * @return boolean Si es necesario asignar la Lista de Festividades
	 */
	public static boolean asignaFestivos() {
		return aFestivos == null;
	}

	/**
	 * Método que asigna las Festividades
	 * 
	 * @param paFestivos
	 *            Date[] Festividades
	 */
	public static void setFestivos(Date[] paFestivos) {
		aFestivos = paFestivos;
	}

	/**
	 * Devuelve si un día es Hábil
	 * 
	 * @param pfFecha
	 *            Date Fecha
	 * @return boolean Si es Festivos
	 */
	public static boolean esHabil(Date pfFecha) {
		return !esSabado(pfFecha) && !esDomingo(pfFecha) && !esFestivo(pfFecha);
	}

	/**
	 * Devuelve si un día es Festivo
	 * 
	 * @param pfFecha
	 *            Date Fecha
	 * @return boolean Si es Festivo
	 */
	public static boolean esFestivo(Date pfFecha) {
		if (aFestivos == null) {
			throw new RuntimeException("No se han asignado las Festividades.");
		}

		for (int i = 0; i < aFestivos.length; i++) {
			if (comparaDias(pfFecha, aFestivos[i]) == 0) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Devuelve el Mensaje de Diferencia entre 2 fechas
	 * 
	 * @param pfFechaIni
	 *            Date Fecha Inicio
	 * @param pfFechaFin
	 *            Date Fecha Final
	 * @return String Mensaje de Diferencia entre 2 fechas
	 */
	public static String diferenciaFechas(Date pfFechaIni, Date pfFechaFin) {
		String sDiferencia = "";

		if (pfFechaIni == null || pfFechaFin == null) {
			return sDiferencia;
		}

		int iAnos = diferenciaFechaAño(pfFechaIni, sumaDias(pfFechaFin, 1));
		int iMeses = diferenciaFechaMeses(
				pfFechaIni = sumaAños(pfFechaIni, iAnos),
				sumaDias(pfFechaFin, 1));
		int iDias = diferenciaFechaDias(sumaMeses(pfFechaIni, iMeses),
				sumaDias(pfFechaFin, 1), 2);

		if (iAnos != 0) {
			sDiferencia = new StringBuffer(sDiferencia)
					.append(Integer.toString(iAnos))
					.append(" ")
					.append(Math.abs(iAnos) == 1 ? "Año"
							: "Años").toString();
		}

		if (iMeses != 0) {
			if (iAnos != 0 || sDiferencia != null && sDiferencia.length() > 0) {
				if (iDias == 0) {
					sDiferencia = new StringBuffer(sDiferencia).append(" ")
							.append("y").append(" ")
							.toString();
				} else {
					sDiferencia = new StringBuffer(sDiferencia).append(", ")
							.toString();
				}
			}

			sDiferencia = new StringBuffer(sDiferencia)
					.append(Integer.toString(iMeses))
					.append(" ")
					.append(Math.abs(iMeses) == 1 ? "Mes"
							:  "Meses").toString();
		}

		if (iDias != 0) {
			if (iAnos + iMeses != 0 || sDiferencia != null
					&& sDiferencia.length() > 0) {
				sDiferencia = new StringBuffer(sDiferencia).append(" ")
						.append("y").append(" ").toString();
			}

			sDiferencia = new StringBuffer(sDiferencia)
					.append(Integer.toString(iDias))
					.append(" ")
					.append(Math.abs(iDias) == 1 ? "Día"
							: "Días").toString();
		} else if (iDias == 0 && iMeses == 0 && iAnos == 0) {
			// Caso especial de Fechas Iguales
			sDiferencia = new StringBuffer(sDiferencia).append("0 ")
					.append("Días").toString();
		}

		return sDiferencia;
	}
}

