package com.greenaall.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * <p>
 * Clase que se utiliza para aplicar Máscaras o formateos a objetos. En un
 * principio NO se puede instanciar un objeto de esta clase, hay que acceder a
 * los métodos estáticos provistos para ello.
 * </p>
 * <p>
 * Copyright: 2004 © Greenaall S.L.
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author 13
 * @version 1.0
 */

public class Formateador {
	/** Array con los distintos formateadores de la aplicación */

	@SuppressWarnings("rawtypes")
	private static Map mapFormateadores = new HashMap();

	// Declaración de Constantes para la Propiedad Tipo de Formateador.

	/** Constante que indica que no se desea utilizar ningún Formateador */

	public static final byte SIN_FORMATEADOR = 0;

	/**
	 * Constante que indica que el Formateador a utilizar tiene que ser del Tipo
	 * DecimalFormat.
	 */

	public static final byte DECIMALFORMAT = 1;

	/**
	 * Constante que indica que el Formateador a utilizar tiene que ser del Tipo
	 * SimpleDateFormat.
	 */

	public static final byte SIMPLEDATEFORMAT = 2;

	/** Formateador del Tipo SimpleDateFormat */

	private SimpleDateFormat oSimpleDateFormat;

	/** Formateador del Tipo DecimalFormat */

	private DecimalFormat oDecimalFormat;

	// Definición de Formateadores Comunes

	/** Formato de Fecha "yyyyMMdd" */

	public static final String FECHA_AAAAMMDD = "yyyyMMdd";

	/** Formato de Fecha "dd/MM/yyyy HH:mm:ss" */

	public static final String FECHA_LARGA = "dd/MM/yyyy HH:mm:ss";

	/** Formato de Fecha "dd/MM/yyyy" */

	public static final String FECHA_CORTA = "dd/MM/yyyy";

	/** Formato de Fecha "yyyy-MM-dd" */

	public static final String FECHA_CORTA_SQLDATE = "yyyy-MM-dd";

	/** Formato de Fecha "dd 'de' MMMM 'de' yyyy" */

	public static final String DES_FECHA_LARGA = "dd 'de' MMMM 'de' yyyy";

	/** Formato de Fecha "dd" */

	public static final String NUMERO_DIA = "dd";

	/** Formato de Fecha "MM" */

	public static final String NUMERO_MES = "MM";

	/** Formato de Fecha "EEEE" */

	public static final String LETRA_DIA = "EEEE";

	/** Formato de Fecha "E" */

	public static final String LETRA_DIA_CORTA = "E";

	/** Formato de Fecha "MMMM" */

	public static final String LETRA_MES = "MMMM";

	/** Formato de Fecha "MMMM yyyy" */

	public static final String LETRA_MES_NUMERO_AÑO = "MMMM yyyy";

	/** Formato de Fecha "MMM" */

	public static final String LETRA_MES_CORTA = "MMM";

	/** Formato de Fecha "yyyy" */

	public static final String AÑO = "yyyy";

	/** Formato de Fecha "yy" */

	public static final String AÑO_CORTO = "yy";

	/** Formato de Fecha "HH:mm:ss" */

	public static final String HORA_LARGA = "HH:mm:ss";

	/** Formato de Fecha "HH:mm" */

	public static final String HORA_CORTA = "HH:mm";

	/** Formato de Fecha "HH" */

	public static final String HORA = "HH";

	/** Formato de Fecha "mm" */

	public static final String MINUTOS = "mm";

	/** Formato de Fecha "ss" */

	public static final String SEGUNDOS = "ss";

	/** Formato de Fecha "w" */

	public static final String NUMERO_SEMANA_AÑO = "w";

	/** Formato de Fecha "W" */

	public static final String NUMERO_SEMANA_MES = "W";

	/** Formato de Fecha "D" */

	public static final String NUMERO_DIA_AÑO = "D";

	/** Formato de Fecha "F" */

	public static final String NUMERO_DIA_SEMANA_MES = "F";

	/** Formato de Fecha "S" */

	public static final String MILISEGUNDOS = "S";

	/** Formato de Fecha "dd MMMM yyyy" */

	public static final String DIA_MES_AÑO_RESUMIDO = Formateador.NUMERO_DIA + " " + Formateador.LETRA_MES + " "
			+ Formateador.AÑO;

	/** Formato para Campos Importe */

	public static final String IMPORTE = "###,###,###,##0.00";

	/** Formato para Campos Precio */

	public static final String PRECIO = "##,###,##0.000000";

	/** Formato para Campos Porcentaje */

	public static final String PORCENTAJE = "##0.000";

	/** Formato para Campos Numéricos con 6 enteros y 3 decimales */

	public static final String DECIMAL_6_3 = "###,##0.000";

	/** Formato para Campos Numéricos con 3 enteros y 2 decimales */

	public static final String DECIMAL_3_2 = "##0.00";

	/** Formato para Campos Numéricos con 3 enteros y 6 decimales */

	public static final String DECIMAL_3_6 = "##0.000000";

	/** Formato para Campos Numéricos con 3 enteros y 12 decimales */

	public static final String DECIMAL_3_12 = "##0,000000000000";

	/** Formato para Campos Numéricos con 6 enteros y 4 decimales */

	public static final String DECIMAL_6_4 = "###,##0.0000";

	/** Formato para Campos Numéricos con 9 enteros y 3 decimales */

	public static final String DECIMAL_9_3 = "###,###,##0.000";

	/** Formato para distancias kilométricas */
	public static final String FORMATO_KILOMETRO = "0.0";

	/** Formato para Códigos de Cuenta Bancaria */
	public static final String FORMATO_COD_CUENTA = "0000000000";

	/** Array que almacena los Formatos Numéricos */

	public static String[] aNumero = new String[31];

	/**
	 * Constructor al cual se le indica el Tipo de Formateador a utilizar, la
	 * Máscara con la que formatear y la Localidad.
	 * 
	 * @param pbyTipForma Tipo de Formateador a utilizar.
	 * @param psMascara   Máscara a aplicar.
	 * @param poLocalidad Localidad.
	 */

	protected Formateador(byte pbyTipForma, String psMascara, Locale poLocalidad) {
		// Controlar si se ha indicado una Máscara

		if (!Utiles.ifNull(psMascara).equals("")) {
			if (pbyTipForma == Formateador.SIMPLEDATEFORMAT) {
				// Si la localidad no es la por defecto se crea con esa localidad,
				// sino cogemos los símbolos estáticos de la clase Fecha

				if (poLocalidad != null && poLocalidad != Locale.getDefault()) {
					oSimpleDateFormat = new SimpleDateFormat(psMascara, poLocalidad);
				} else {
					oSimpleDateFormat = new SimpleDateFormat(psMascara, Fecha.getDatForSymbo());
				}
			} else if (pbyTipForma == Formateador.DECIMALFORMAT) {
				oDecimalFormat = (DecimalFormat) NumberFormat.getInstance(poLocalidad);
				oDecimalFormat.applyPattern(psMascara);
			}
		}
	}

	/**
	 * Devuelve un formateador a partir de su máscara o formato.
	 * 
	 * @param pbyTipForma Tipo de Formateador a utilizar.
	 * @param psFormato   Máscara o formato.
	 * @param poLocalidad Localidad.
	 * @return Formateador.
	 */

	@SuppressWarnings("unchecked")
	public static Formateador getFormateador(byte pbyTipForma, String psFormato, Locale poLocalidad) {
		Formateador oFormateador = null;
		String sClave = psFormato + "_";

		/*
		 * Se tiene que guardar el formateador distinguiendo también por el idioma. El
		 * idioma por defecto es el español
		 */
		if (poLocalidad != null) {
			sClave += poLocalidad.getLanguage();
		} else {
			sClave += "es";
		}

		if (!mapFormateadores.containsKey(sClave)) {
			oFormateador = new Formateador(pbyTipForma, psFormato, poLocalidad);
			mapFormateadores.put(sClave, oFormateador);
		} else {
			oFormateador = (Formateador) mapFormateadores.get(sClave);
		}

		return oFormateador;
	}

	/**
	 * Devuelve un formateador a partir de su máscara o formato.
	 * 
	 * @param pbyTipForma Tipo de Formateador a utilizar.
	 * @param psFormato   Máscara o formato.
	 * @return Formateador.
	 */

	public static Formateador getFormateador(byte pbyTipForma, String psFormato) {
		return Formateador.getFormateador(pbyTipForma, psFormato, Locale.getDefault());
	}

	/**
	 * Devuelve un valor formateado a partir de su máscara o formato.
	 * 
	 * @param pbyTipForma Tipo de Formateador a utilizar.
	 * @param psFormato   Máscara o formato.
	 * @param poLocalidad Localidad.
	 * @param poDato      Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String getValorFormateado(byte pbyTipForma, String psFormato, Locale poLocalidad, Object poDato) {
		return Formateador.getFormateador(pbyTipForma, psFormato, poLocalidad).formatear(poDato);
	}

	/**
	 * Devuelve un valor formateado a partir de su máscara o formato.
	 * 
	 * @param pbyTipForma Tipo de Formateador a utilizar.
	 * @param psFormato   Máscara o formato.
	 * @param poDato      Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String getValorFormateado(byte pbyTipForma, String psFormato, Object poDato) {
		return Formateador.getFormateador(pbyTipForma, psFormato).formatear(poDato);
	}

	/**
	 * Devuelve una fecha formateada a partir de su máscara o formato.
	 * 
	 * @param psFormato Máscara o formato.
	 * @param poDato    Fecha a formatear.
	 * @return Fecha formateada.
	 */

	public static String getFechaFormateada(String psFormato, Object poDato) {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, psFormato).formatear(poDato);
	}

	/**
	 * Devuelve una fecha formateada a partir de su máscara o formato.
	 * 
	 * @param psFormato Máscara o formato.
	 * @param poDato    Fecha a formatear.
	 * @param poLocale  Locale (Idioma)
	 * @return Fecha formateada.
	 */

	public static String getFechaFormateada(String psFormato, Object poDato, Locale poLocale) {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, psFormato, poLocale).formatear(poDato);
	}

	/**
	 * Devuelve un número formateado a partir de su máscara o formato.
	 * 
	 * @param psFormato Máscara o formato.
	 * @param poDato    Número a formatear.
	 * @return Número formateado.
	 */

	public static String getNumeroFormateado(String psFormato, Object poDato) {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, psFormato).formatear(poDato);
	}

	/**
	 * Devuelve el SimpleDateFomat de un formateador a partir de su máscara o
	 * formato.
	 * 
	 * @param psFormato   Máscara o formato.
	 * @param poLocalidad Localidad.
	 * @return Dato Objeto SimpleDateFomat de un formateador.
	 */

	public static SimpleDateFormat getSimpleDateFormat(String psFormato, Locale poLocalidad) {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, psFormato, poLocalidad).oSimpleDateFormat;
	}

	/**
	 * Devuelve el SimpleDateFomat de un formateador a partir de su máscara o
	 * formato.
	 * 
	 * @param psFormato Máscara o formato.
	 * @return Dato Objeto SimpleDateFomat de un formateador.
	 */

	public static SimpleDateFormat getSimpleDateFormat(String psFormato) {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, psFormato,
				Locale.getDefault()).oSimpleDateFormat;
	}

	/**
	 * Devuelve el DecimalFormat de un formateador a partir de su máscara o formato.
	 * 
	 * @param psFormato Máscara o formato.
	 * @return Dato Objeto DecimalFormat de un formateador.
	 */

	public static DecimalFormat getDecimalFormat(String psFormato) {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, psFormato, Locale.getDefault()).oDecimalFormat;
	}

	/**
	 * Devuelve el Formateador para Campos Importe.
	 * 
	 * @return Formateador para Campos Importe.
	 */

	public static Formateador getForImpor() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, "###,###,###,##0.00");
	}

	/**
	 * Devuelve el Formateador para Campos Precio.
	 * 
	 * @return Formateador para Campos Precio.
	 */

	public static Formateador getForPrecio() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, "##,###,##0.000000");
	}

	/**
	 * Devuelve el Formateador para Campos Porcentaje.
	 * 
	 * @return Formateador para Campos Porcentaje.
	 */

	public static Formateador getForPorce() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, "##0.000");
	}

	/**
	 * Devuelve el Formateador para Campos Numéricos con 6 enteros y 3 decimales.
	 * 
	 * @return Formateador para Campos Numéricos con 6 enteros y 3 decimales.
	 */

	public static Formateador getForDec6_3() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, DECIMAL_6_3);
	}

	/**
	 * Devuelve el Formateador para Campos Numéricos con 3 enteros y 2 decimales.
	 * 
	 * @return Formateador para Campos Numéricos con 3 enteros y 2 decimales.
	 */

	public static Formateador getForDec3_2() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, DECIMAL_3_2);
	}

	/**
	 * Devuelve el Formateador para Campos Numéricos con 3 enteros y 6 decimales.
	 * 
	 * @return Formateador para Campos Numéricos con 3 enteros y 6 decimales.
	 */

	public static Formateador getForDec3_6() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, DECIMAL_3_6);
	}

	/**
	 * Devuelve el Formateador para Campos Numéricos con 3 enteros y 12 decimales.
	 * 
	 * @return Formateador para Campos Numéricos con 3 enteros y 12 decimales.
	 */

	public static Formateador getForDec3_12() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, DECIMAL_3_12);
	}

	/**
	 * Devuelve el Formateador para Campos Numéricos con 6 enteros y 4 decimales.
	 * 
	 * @return Formateador para Campos Numéricos con 6 enteros y 4 decimales.
	 */

	public static Formateador getForDec6_4() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, DECIMAL_6_4);
	}

	/**
	 * Devuelve el Formateador para Campos Numéricos con 9 enteros y 3 decimales.
	 * 
	 * @return Formateador para Campos Numéricos con 9 enteros y 3 decimales.
	 */

	public static Formateador getForDec9_3() {
		return Formateador.getFormateador(Formateador.DECIMALFORMAT, DECIMAL_9_3);
	}

	/**
	 * Devuelve el Formateador para Campos Fecha con el Formato: Día/Mes/Año
	 * Hora:Minutos:Segundos
	 * 
	 * @return Formateador para Campos Fecha con el Formato: Día/Mes/Año
	 *         Hora:Minutos:Segundos
	 */

	public static Formateador getForFecLarga() {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, Formateador.FECHA_LARGA);
	}

	/**
	 * Devuelve el Formateador para Campos Fecha con el Formato: Día/Mes/Año
	 * 
	 * @return Formateador para Campos Fecha con el Formato: Día/Mes/Año
	 */

	public static Formateador getForFecCorta() {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, Formateador.FECHA_CORTA);
	}

	/**
	 * Devuelve el Formateador para Campos Fecha con el Formato: Día/Mes/Año
	 * 
	 * @return Formateador para Campos Fecha con el Formato: Día/Mes/Año
	 */

	public static Formateador getForFecCortaSqlDate() {
		return Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, Formateador.FECHA_CORTA_SQLDATE);
	}

	/**
	 * Método que devuelve el Dato formateado.
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public String formatear(Object poDato) {
		String sDatForma = "";

		if (poDato == null) {
			poDato = "";
		}

		if (this.oSimpleDateFormat != null) {
			if (!poDato.toString().equals("")) {
				sDatForma = oSimpleDateFormat.format(poDato);
			}
		} else if (this.oDecimalFormat != null) {
			if (poDato.equals("")) {
				sDatForma = poDato.toString();
			} else {
				sDatForma = oDecimalFormat.format(poDato);
			}
		} else {
			sDatForma = poDato.toString();
		}

		return sDatForma;
	}

	/**
	 * Método que formatea Campos Importe.
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String importe(Object poDato) {
		return getForImpor().formatear(poDato);
	}

	/**
	 * Método que formatea Campos Precio.
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String precio(Object poDato) {
		return getForPrecio().formatear(poDato);
	}

	/**
	 * Método que formatea Campos Porcentaje.
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String porcentaje(Object poDato) {
		return getForPorce().formatear(poDato);
	}

	/**
	 * Método que formatea Campos con 6 enteros y 3 decimales
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */
	public static String decimal6_3(Object poDato) {
		return getForDec6_3().formatear(poDato);
	}

	/**
	 * Método que formatea Campos con 3 enteros y 6 decimales
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */
	public static String decimal3_6(Object poDato) {
		return getForDec3_6().formatear(poDato);
	}

	/**
	 * Método que formatea Campos con 3 enteros y 12 decimales
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */
	public static String decimal3_12(Object poDato) {
		return getForDec3_12().formatear(poDato);
	}

	/**
	 * Método que formatea Campos con 3 enteros y 2 decimales
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */
	public static String decimal3_2(Object poDato) {
		return getForDec3_2().formatear(poDato);
	}

	/**
	 * Método que formatea Campos con 6 enteros y 4 decimales
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */
	public static String decimal6_4(Object poDato) {
		return getForDec6_4().formatear(poDato);
	}

	/**
	 * Método que formatea Campos con 9 enteros y 3 decimales
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */
	public static String decimal9_3(Object poDato) {
		return getForDec9_3().formatear(poDato);
	}

	/**
	 * Método que formatea Campos Fecha Larga con el Formato: dd/MM/yyyy HH:mm:ss
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String fechaLarga(Object poDato) {
		return getForFecLarga().formatear(poDato);
	}

	/**
	 * Método que formatea Campos Fecha Corta con el Formato: dd/MM/yyyy
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String fechaCorta(Object poDato) {
		return getForFecCorta().formatear(poDato);
	}

	/**
	 * Método que formatea Campos Fecha Corta con el Formato: dd/MM/yyyy
	 * 
	 * @param poDato Dato a formatear.
	 * @return Dato formateado.
	 */

	public static String fechaCortaSqlDate(Object poDato) {
		return getForFecCortaSqlDate().formatear(poDato);
	}

	/**
	 * Elimina los signos de puntuación del importe
	 * 
	 * @param poImporte Importe a formatear
	 * @return Importe formateado
	 */

	public static String quitarSignosPuntuacion(BigDecimal poImporte) {

		String sResultado = "";

		sResultado = poImporte.abs().toString();
		int iPos = sResultado.indexOf(".");

		// se elimina el separador decimal, si lo tiene

		if (iPos >= 0) {
			sResultado = sResultado.substring(0, iPos) + sResultado.substring(iPos + 1, sResultado.length());
		}

		return sResultado;
	}

	/**
	 * Parsea la cadena de texto para producir una fecha.
	 * 
	 * @param psCadena Cadena a parsear.
	 * @return Fecha que representa la cadena.
	 * @throws ParseException Si la cadena especificada no puede ser parseada.
	 */

	public Date parse(String psCadena) throws ParseException {
		return this.oSimpleDateFormat.parse(psCadena);
	}

	/**
	 * Normaliza la cadena con caracteres ASCII basicos y mantiene la ñ
	 * 
	 * @param psCadena Cadena a normalizar.
	 * @return Cadena normalizada.
	 */

	public static String normaliza(String psCadena) {
		String normalized = Normalizer.normalize(psCadena, Normalizer.Form.NFD);
		// Nos quedamos unicamente con los caracteres ASCII
		return normalized.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
	}

	public static String numero(Object poDato, boolean pbForNulo, int piLong) {
		if (pbForNulo && poDato == null) {
			return "0";
		} else {
			return numero(poDato, piLong);
		}
	}

	public static String numero(Object poDato, int piLong) {
		return getForNumero(piLong).formatear(poDato);
	}

	public static Formateador getForNumero(int piLong) {
		if (aNumero[piLong] == null) {
			aNumero[piLong] = Cadena.repiteCadena('0', piLong);
		}

		return Formateador.getFormateador(Formateador.DECIMALFORMAT, aNumero[piLong]);
	}
}
