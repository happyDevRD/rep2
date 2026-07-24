package com.greenaall.util;

import java.text.ParseException;
import java.util.Date;

public class Cadena {
	public static final int RELLENAR_IZQUIERDA = 1;
	public static final int RELLENAR_DERECHA = 2;
	public static String[] aCadena = new String[12];

	private StringBuffer sValor;

	/**
	 * Inicialización de Cadena con un valor Inicial
	 */
	public Cadena() {
		this.sValor = new StringBuffer();
	}

	/**
	 * Inicialización de Cadena con un valor Inicial (String)
	 *
	 * @param psCadInici Valor de la Cadena Inicial
	 */
	public Cadena(String psCadInici) {
		this.sValor = new StringBuffer(psCadInici == null ? "" : psCadInici);
	}

	/**
	 * Inicialización de Cadena a una tamaño Inicial
	 *
	 * @param piTamanno tamaño Inicial de la Cadena
	 */
	public Cadena(int piTamanno) {
		this.sValor = new StringBuffer(piTamanno);
	}

	/**
	 * Método que añade String a la Cadena
	 *
	 * @param psCadena Valor a añadir a la Cadena
	 * @return Cadena modificada
	 */
	public Cadena añadir(String psCadena) {
		this.sValor.append(psCadena);
		return this;
	}

	/**
	 * Método que añade un objeto Cadena a la Cadena
	 *
	 * @param poCadena Objeto Cadena
	 * @return Cadena modificada
	 */
	public Cadena añadir(Cadena poCadena) {
		this.sValor.append(poCadena.sValor);
		return this;
	}

	/**
	 * Método que añade String a la Cadena con AND
	 *
	 * @param psCadena Valor a añadir a la Cadena
	 * @return Cadena modificada
	 */
	public Cadena añadirAndSql(String psCadena) {
		if (this.sValor.length() == 0) {
			this.añadir(" " + psCadena);
		} else {
			this.añadir(" and " + psCadena);
		}

		return this;
	}

	/**
	 * Método que añade String a la Cadena con OR
	 *
	 * @param psCadena Valor a añadir a la Cadena
	 * @return Cadena modificada
	 */
	public Cadena añadirOrSql(String psCadena) {
		if (this.sValor.equals("")) {
			this.añadir(psCadena);
		} else {
			this.añadir(" or " + psCadena);
		}

		return this;
	}

	/**
	 * Método que añade un int a la Cadena
	 *
	 * @param piNumero Número a añadir
	 */
	public void añadir(int piNumero) {
		this.sValor = this.sValor.append(piNumero);
	}


	/**
	 * Método que borra un rango de caracteres
	 *
	 * @param piPosInici Posición de Inicio de la Cadena a borrar
	 * @param piPosFinal Posición Final de la Cadena a borrar
	 */
	public void borrarRango(int piPosInici, int piPosFinal) {
		this.sValor.delete(piPosInici, piPosFinal);
	}

	/**
	 * Método que busca una String dentro del objeto Cadena
	 *
	 * @param psCadena   Cadena a buscar
	 * @param piPosicion Posición de Inicio de la Búsqueda
	 * @return Posición de comienzo de la Cadena buscada
	 */
	public int buscaRango(String psCadena, int piPosicion) {
		return this.sValor.indexOf(psCadena, piPosicion);
	}

	/**
	 * Método que devuelve la Capacidad actual de la Cadena
	 *
	 * @return Capacidad de la Cadena
	 */
	public int capacidad() {
		return this.sValor.capacity();
	}


	/**
	 * Método que devuelve el carácter de una posición dada
	 *
	 * @param piNumero Posición del carácter a devolver
	 * @return carácter correspondiente a la posición indicada
	 */
	public char extraerCaracter(int piNumero) {
		return this.sValor.charAt(piNumero);
	}

	/**
	 * Método que devuelve un rango de caracteres de una Cadena
	 *
	 * @param piPosicion Posición de Inicio de la Cadena a devolver
	 * @param piLongitud Longitud de la Cadena a devolver
	 * @return Rango de caracteres de una Cadena
	 */
	public Cadena extraerCadena(int piPosicion, int piLongitud) {
		Cadena oCadena = new Cadena();
		String sCadena;

		sCadena = this.sValor.substring(piPosicion, piPosicion + piLongitud);
		oCadena.sValor.append(sCadena);
		return oCadena;
	}

	/**
	 * Método que devuelve un rango de caracteres en un String
	 *
	 * @param piPosicion Posición de Inicio del String a devolver
	 * @param piLongitud Longitud del String a devolver
	 * @return Rango de caracteres de un String
	 */
	public String extraerString(int piPosicion, int piLongitud) {
		return this.sValor.substring(piPosicion, piPosicion + piLongitud);
	}

	/**
	 * Método que inicializa la Cadena
	 */
	public void inicializar() {
		this.sValor = new StringBuffer();
	}

	/**
	 * Método que inserta un objeto String en la posición indicada de la Cadena
	 *
	 * @param psCadena Objeto Cadena
	 * @param piPosic  Posición
	 * @return Cadena modificada
	 */
	public Cadena insertar(int piPosic, String psCadena) {
		this.sValor.insert(piPosic, psCadena);
		return this;
	}

	/**
	 * Método que formatea una Cadena a una Longitud establecida
	 *
	 * @param psCadena Cadena a Texto a Formatear.
	 * @param piAncho  Longitud de Formateo
	 * @return sOutCadena Cadena de Texto Formateada.
	 */
	public static String justificaCadena(String psCadena, int piAncho) {
		String sAuxCadena = "";
		String sOutCadena = "";
		char cCar;
		int iLong;
		int iCont;
		psCadena = Utiles.ifNull(psCadena, "");

		iLong = psCadena.length();
		iCont = 0;

		for (int iIndice = 0; iIndice < iLong; iIndice++) {
			cCar = psCadena.charAt(iIndice);

			if (cCar == ' ') {
				cCar = ' ';
			}

			if (cCar == '\n') {
				iCont = 0;
				sOutCadena = sOutCadena + sAuxCadena + "\n";
				sAuxCadena = "";
			} else if (iCont == (piAncho + 1)) {
				sOutCadena = sOutCadena + "\n";
				iCont = 0;
				sAuxCadena = sAuxCadena + cCar;
			} else if (cCar == ' ' || cCar == '.' || cCar == ';' || cCar == ',' || cCar == ':') {
				sOutCadena = sOutCadena + sAuxCadena + cCar;
				sAuxCadena = "";
			} else {
				sAuxCadena = sAuxCadena + cCar;

			}
			iCont++;
		}

		sOutCadena = sOutCadena + sAuxCadena;
		return sOutCadena;
	}

	/**
	 * Método que devuelve la Longitud de una Cadena
	 *
	 * @return Longitud de la Cadena
	 */
	public int longitud() {
		return this.sValor.length();
	}

	/**
	 * Método que elimina los espacios en blanco de la parte izquierda de la cadena
	 *
	 * @param psCadena Cadena a tratar
	 * @return Cadena modificada
	 */
	public static String lTrim(String psCadena) {
		psCadena = Utiles.ifNull(psCadena, "");
		String sSalida = "";
		char cCar;
		int iPos = 0;
		int iLong = 0;

		iLong = psCadena.length();
		iPos = iLong;

		for (int i = 0; i < iLong; i++) {
			cCar = psCadena.charAt(i);

			if (cCar != ' ') {
				iPos = i;
				break;
			}
		}

		sSalida = psCadena.substring(iPos);
		return sSalida;
	}

	/**
	 * Método que busca el Número de apariciones de un carácter en una Cadena
	 *
	 * @param psCadena   Cadena a Tratar.
	 * @param psCaracter Carácter a buscar
	 * @return iNumIncid Número de Incidencias del carácter.
	 */
	public static int numIncidCadena(String psCadena, String psCaracter) {
		int iPos = -1;
		int iNumIncid = 0;
		psCadena = Utiles.ifNull(psCadena, "");
		psCaracter = Utiles.ifNull(psCaracter, "");

		for (int iCont = 0; iCont < psCadena.length(); iCont++) {
			iPos = psCadena.indexOf(psCaracter, iCont);

			if (iPos != -1) {
				iNumIncid++;
				iCont = iPos;

			}
		}

		return iNumIncid;
	}

	/**
	 * Método que rellena con el carácter vacío una cadena hasta la Longitud Máxima
	 * especificada
	 *
	 * @param psCadena Cadena a rellenar
	 * @param piLong   piLong Longitud Máxima de la Cadena
	 * @return Cadena modificada
	 */
	public static String padCadena(String psCadena, int piLong) {
		return padCadena(psCadena, piLong, ' ', 0);
	}

	/**
	 * Método que rellena con el carácter 0 una cadena hasta la Longitud Máxima
	 * especificada
	 *
	 * @param psCadena Cadena a rellenar
	 * @param piLong   piLong Longitud Máxima de la Cadena
	 * @return Cadena modificada
	 */
	public static String formatearNum(String psCadena) {
		return padCadena(psCadena, 12, '0');
	}

	/**
	 * Método que rellena con el carácter vacío una cadena hasta la Longitud Máxima
	 * especificada
	 *
	 * @param psCadena   Cadena a rellenar
	 * @param piLong     piLong Longitud Máxima de la Cadena
	 * @param pbNumerico Si se trata de un Campo Numérico
	 * @param pbCero     Si necesita de algún valor para formatear
	 * @return Cadena modificada
	 */
	public static String padCadena(String psCadena, int piLong, boolean pbNumerico, boolean pbCero) {
		if (pbNumerico && (!pbCero || Utiles.ifNull(psCadena).length() > 0 && psCadena.matches("\\d+"))) {
			return padCadena(Utiles.ifNull(psCadena), piLong, '0', 1).substring(0, piLong);
		} else {
			return padCadena(Utiles.ifNull(psCadena), piLong, ' ', 2).substring(0, piLong);
		}
	}

	/**
	 * Método que rellena con el carácter especificado una cadena hasta la Longitud
	 * Máxima especificada
	 *
	 * @param psCadena Cadena a rellenar
	 * @param piLong   piLong Longitud Máxima de la Cadena
	 * @param pcCar    Carácter de relleno a emplear
	 * @return Cadena modificada
	 */
	public static String padCadena(String psCadena, int piLong, char pcCar) {
		return padCadena(psCadena, piLong, pcCar, 0);
	}

	/**
	 * Método que rellena con el carácter especificado una cadena en la dirección
	 * indicada (derecha o izquierda) hasta la Longitud Máxima especificada
	 *
	 * @param psCadena Cadena a rellenar
	 * @param piLong   Longitud Máxima de la Cadena
	 * @param pcCar    Carácter de relleno a emplear
	 * @param piDirec  Dirección de relleno (1->Izq, 2->Der)
	 * @return Cadena modificada
	 */
	public static String padCadena(String psCadena, int piLong, char pcCar, int piDirec) {
		String sRelleno;
		int j;
		psCadena = Utiles.ifNull(psCadena, "");

		j = psCadena.length();

		if (piLong > 0 && ((piLong - j) > 0)) {
			if (piDirec != 1 && piDirec != 2) {
				piDirec = 1;
			}

			sRelleno = "";

			for (int i = 0; i < (piLong - j); i++) {
				if (pcCar == ' ') {
					sRelleno = sRelleno + ' ';
				} else {
					sRelleno = sRelleno + pcCar;
				}
			}

			if (piDirec == 1) {
				psCadena = sRelleno + psCadena;
			} else if (piDirec == 2) {
				psCadena = psCadena + sRelleno;
			}
		}

		if (psCadena.length() > piLong) {
			return psCadena.substring(0, piLong);
		} else {
			return psCadena;
		}
	}

	/**
	 * Método que parte la Cadena en String separados por un carácter
	 *
	 * @param psExpRegul Expresión regular utilizada para partir
	 * @return array de String
	 */
	public String[] partirCadena(String psExpRegul) {
		String sCadena;

		sCadena = new String(this.sValor);
		return sCadena.split(psExpRegul);
	}

	/**
	 * Método que prepara la Cadena para la ejecución SQL (Se escapan caracteres
	 * como: "[", "]", "'". Si no se encuentra un carácter "%", se añade uno al
	 * final)
	 *
	 * @param psCadena Cadena a tratar
	 * @return Cadena modificada
	 */
	public static String preparaCadena(String psCadena) {
		psCadena = psCadena.replaceAll("\\[", "\\\\[");
		psCadena = psCadena.replaceAll("\\]", "\\\\]");
		psCadena = psCadena.replaceAll("'", "\\\\'");

		if (!psCadena.matches(".*%.*")) {
			psCadena = psCadena.replaceAll("$", "%");
		}

		return psCadena;
	}

	/**
	 * Función que recibe una cadena y que devuelve esa misma cadena tras eliminarle
	 * toda vocal acentuada
	 * 
	 * @param psCadena String
	 * @return String
	 */
	public static String eliminarTildes(String psCadena) {

		// Convierte el string en un array para poder trabajar con el

		char Cadena[] = psCadena.toCharArray();

		/**
		 * Busca posicion a posicion del vector vocales con cualquier tipo de acento
		 * para posteriormente elimiar el acento
		 */

		for (int cont = 0; cont < psCadena.length(); cont++) {
			if (Cadena[cont] == 'á' || Cadena[cont] == 'à' || Cadena[cont] == 'ä' || Cadena[cont] == 'â') {
				Cadena[cont] = 'a';
			} else if (Cadena[cont] == 'é' || Cadena[cont] == 'è' || Cadena[cont] == 'ë' || Cadena[cont] == 'ê') {
				Cadena[cont] = 'e';
			} else if (Cadena[cont] == 'í' || Cadena[cont] == 'ì' || Cadena[cont] == 'ï' || Cadena[cont] == 'î') {
				Cadena[cont] = 'i';
			} else if (Cadena[cont] == 'ó' || Cadena[cont] == 'ò' || Cadena[cont] == 'ö' || Cadena[cont] == 'ô') {
				Cadena[cont] = 'o';
			} else if (Cadena[cont] == 'ú' || Cadena[cont] == 'ù' || Cadena[cont] == 'ü' || Cadena[cont] == 'û') {
				Cadena[cont] = 'u';
			} else if (Cadena[cont] == 'Á' || Cadena[cont] == 'À' || Cadena[cont] == 'Ä' || Cadena[cont] == 'Â') {
				Cadena[cont] = 'A';
			} else if (Cadena[cont] == 'É' || Cadena[cont] == 'È' || Cadena[cont] == 'Ë' || Cadena[cont] == 'Ê') {
				Cadena[cont] = 'E';
			} else if (Cadena[cont] == 'Í' || Cadena[cont] == 'Ì' || Cadena[cont] == 'Ï' || Cadena[cont] == 'Î') {
				Cadena[cont] = 'I';
			} else if (Cadena[cont] == 'Ó' || Cadena[cont] == 'Ò' || Cadena[cont] == 'Ö' || Cadena[cont] == 'Ô') {
				Cadena[cont] = 'O';
			} else if (Cadena[cont] == 'Ú' || Cadena[cont] == 'Ù' || Cadena[cont] == 'Ü' || Cadena[cont] == 'Û') {
				Cadena[cont] = 'U';
			}
		}

		/**
		 * Devuelve la cadena despues de haberle eliminado los caracteres extraños y
		 * haber quitado los acentos en las vocales
		 */

		return new String(Cadena);
	}

	/**
	 * Método que repite una Cadena el Número de veces que se le indique
	 *
	 * @param psCadena   Cadena a repetir
	 * @param piLongitud Número de veces que se repite la Cadena
	 * @return Cadena modificada
	 */
	public static String repiteCadena(String psCadena, int piLongitud) {
		StringBuffer oBuf = new StringBuffer();

		if (piLongitud < 0) {
			piLongitud = 0;
		}

		for (int i = 0; i < piLongitud; i++) {
			oBuf.append(psCadena);
		}

		return oBuf.toString();
	}

	/**
	 * Método que repite un Caracter el Número de veces que se le indique
	 *
	 * @param pCar       Caracter a repetir
	 * @param piLongitud Número de veces que se repite el caracter
	 * @return String Cadena modificada
	 */
	public static String repiteCadena(char pCar, int piLongitud) {
		StringBuffer oBuf = new StringBuffer();

		if (piLongitud < 0) {
			piLongitud = 0;
		}

		for (int i = 0; i < piLongitud; i++) {
			oBuf.append(pCar);
		}

		return oBuf.toString();
	}

	/**
	 * Método que realiza la sustitución de Caracteres en Mensajes
	 *
	 * @param psCadena Cadena a tratar
	 * @return Cadena modificada
	 */
	public static String sustituirCodigos(String psCadena) {
		psCadena = psCadena.replaceAll("\\\r", "\n");
		psCadena = psCadena.replaceAll("\\\n", "\n");
		psCadena = psCadena.replaceAll("\\\t", "\t");
		psCadena = psCadena.replaceAll("\\\f", "\f");

		return psCadena;
	}

	/**
	 * Método que devuelve el valor de un String
	 *
	 * @return Valor de un String
	 */
	public String toString() {
		return this.sValor.toString();
	}

	/**
	 * Método que trunca la Cadena desde la Posición Inicial hasta el Final
	 *
	 * @param piPosicion Posición desde la que se truncará
	 */
	public void truncarDerecha(int piPosicion) {
		if (this.longitud() > 0) {
			this.borrarRango(piPosicion, this.longitud());
		}
	}

	/**
	 * Método que trunca la Cadena hasta la Posición Final indicada
	 *
	 * @param piPosicion Posición hasta la que se truncará
	 */
	public void truncarIzquierda(int piPosicion) {
		if (this.longitud() > 0) {
			this.borrarRango(1, piPosicion);
		}
	}

	/**
	 * Método que recibe una cadena con el formato AAAAMMDDHHMMSS y devuelve un tipo
	 * Date
	 *
	 * @param cFecha Cadena fecha de entrada
	 * @return Date
	 */
	public static Date CadenaAAAAMMDDHHMMSSToFecha(String cFecha) {
		Date dFecha = null;
		String sFecha = cFecha.substring(6, 8) + "/" + cFecha.substring(4, 6) + "/" + cFecha.substring(0, 4) + " "
				+ cFecha.substring(8, 10) + ":" + cFecha.substring(10, 12) + ":" + cFecha.substring(12, 14);

		try {
			dFecha = Formateador.getFormateador(Formateador.SIMPLEDATEFORMAT, "dd/MM/yyyy HH:mm:ss").parse(sFecha);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}

		return dFecha;
	}

	/**
	 * Método que compara 2 Direcciones
	 * 
	 * @param psDireccion1 String Dirección 1
	 * @param psDireccion2 String Dirección 2
	 * @return int Comparación
	 */
	public static int comparaDireccion(String psDireccion1, String psDireccion2) {
		if (psDireccion1 == null && psDireccion2 == null) {
			return 0;
		} else if (psDireccion1 == null) {
			return 1;
		} else if (psDireccion2 == null) {
			return -1;
		}

		return soloLetrasYDigitos(psDireccion1).replaceAll("[\\s0\\p{Punct}[^\\p{Alnum}]]", "").trim()
				.compareToIgnoreCase(
						soloLetrasYDigitos(psDireccion2).replaceAll("[\\s0\\p{Punct}[^\\p{Alnum}]]", "").trim());
	}

	/**
	 * Método que compara 2 Nombres
	 * 
	 * @param psNombre1 String Nombre 1
	 * @param psNombre2 String Nombre 2
	 * @return int Comparación
	 */
	public static int comparaNombre(String psNombre1, String psNombre2) {
		if (psNombre1 == null && psNombre2 == null) {
			return 0;
		} else if (psNombre1 == null) {
			return 1;
		} else if (psNombre2 == null) {
			return -1;
		}

		return soloLetrasYDigitos(psNombre1).replaceAll("  ", " ").trim()
				.compareToIgnoreCase(soloLetrasYDigitos(psNombre2).replaceAll("  ", " ").trim());
	}


	/**
	 * Método que devuelve la Matrícula Formateada
	 * 
	 * @param psMatricula String Matrícula Sin Formatear
	 * @return String Matrícula Formateada
	 */
	public static String getMatriculaFormateada(String psMatricula) {
		if (psMatricula == null) {
			return "";
		}

		return Cadena.soloLetrasYDigitos(psMatricula.toUpperCase());
	}

	/**
	 * Método que devuelve la Matrícula Sin Formatear
	 * 
	 * @param psMatricula String Matrícula Formateada
	 * @return String Matrícula Sin Formatear
	 */
	public static String getMatriculaSinFormatear(String psMatricula) {
		if (psMatricula == null) {
			return "";
		}

		if (psMatricula.matches("\\d{1,4}\\p{Alpha}{3}")) {
			for (int i = 0; psMatricula != null && i < psMatricula.length(); i++) {
				if (!(psMatricula.charAt(i) >= '0' && psMatricula.charAt(i) <= '9')) {
					return psMatricula.substring(0, i) + "-" + psMatricula.substring(i);
				}
			}
		} else if (psMatricula.matches("\\p{Alpha}{1,2}\\d{1,4}\\p{Alpha}{0,2}")) {
			String sMatricula = "";

			for (int i = 0; psMatricula != null && i < psMatricula.length(); i++) {
				if (psMatricula.charAt(i) >= '0' && psMatricula.charAt(i) <= '9') {
					if (sMatricula.matches("\\p{Alpha}+")) {
						sMatricula = sMatricula.concat("-").concat(psMatricula.substring(i, i + 1));
					} else {
						sMatricula = sMatricula.concat(psMatricula.substring(i, i + 1));
					}
				} else {
					if (sMatricula.matches("\\p{Alpha}+-\\d+")) {
						sMatricula = sMatricula.concat("-").concat(psMatricula.substring(i, i + 1));
					} else {
						sMatricula = sMatricula.concat(psMatricula.substring(i, i + 1));
					}
				}
			}

			return sMatricula;
		}

		return psMatricula;
	}

	/**
	 * Método que comprueba que la cadena dada está formada únicamente por dígitos
	 * del 0 al 9 y por letras de la a-z, A-Z
	 * 
	 * @param psCadena String Cadena a verificar
	 * @return String Cadena Tratada
	 */
	public static String soloLetrasYDigitos(String psCadena) {
		String sCadenaAux = "";

		/*
		 * for (int i = 0; i < iLongitud; i++) { if (psCadena.substring(i,
		 * i+1).matches("\\p{Alnum}")) { sCadenaAux =
		 * sCadenaAux.concat(psCadena.substring(i, i+1)); } }
		 */

		for (int i = 0; psCadena != null && i < psCadena.length(); i++) {
			if ((psCadena.charAt(i) >= '0' && psCadena.charAt(i) <= '9')
					|| (psCadena.charAt(i) >= 'a' && psCadena.charAt(i) <= 'z')
					|| (psCadena.charAt(i) >= 'A' && psCadena.charAt(i) <= 'Z')) {
				sCadenaAux = sCadenaAux.concat(psCadena.substring(i, i + 1));
			}
		}

		return sCadenaAux.toUpperCase();
	}
}
