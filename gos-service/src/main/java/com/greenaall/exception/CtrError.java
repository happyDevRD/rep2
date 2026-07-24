package com.greenaall.exception;

import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

import com.greenaall.util.Utiles;

public class CtrError extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Constante que identifica el error: No existe el registro antes de operar
	 * con él. Por ejemplo al borrar.
	 */

	public final static short NO_EXISTE_REGISTRO = 1;

	/**
	 * Constante que identifica el error: Yo existe el registro antes de operar
	 * con él. Por ejemplo al insertar.
	 */

	public final static short YA_EXISTE_REGISTRO = 2;

	/**
	 * Constante que identifica el error: Error por regla de integridad
	 * referencial.
	 */

	public final static short EXISTE_CLAVE_EXTERNA = 3;

	/**
	 * Constante que identifica el error: No se han recuperado datos con las
	 * condiciones introducidas en la búsqueda.
	 */

	public final static short NO_HAY_DATOS = 4;

	/**
	 * Constante que identifica el error: Yo existe el indice antes de operar
	 * con él. Por ejemplo al insertar.
	 */

	public static final short YA_EXISTE_INDICE = 5;

	/**
	 * Constante que identifica el error: Error por no existencia de valor de la
	 * clave externa.
	 */

	public final static short NO_EXISTE_CLAVE_EXTERNA = 6;

	/**
	 * Constante que identifica el error: Error por Solapamiento de Tramos.
	 */

	public final static short SOLAPAMIENTO_TRAMOS = 7;

	/**
	 * Constante que identifica el error: La referencia cruzada no existe y el
	 * usuario ha cancelado su inserción.
	 */

	public final static short REF_CRUZADA_INEXISTENTE = 8;

	/**
	 * Constante que identifica el error: La Fecha de Movimiento NO es Correcta.
	 */

	public static final short FECHA_MOVIMIENTO_INCORRECTA = 9;

	/**
	 * Constante que identifica el error: No se puede realizar un Movimiento
	 * porque no está en el Estado Correcto. Por ejemplo, se intenta dar de Baja
	 * a un Registro que ya está de Baja.
	 */

	public static final short MOVIMIENTO_INCORRECTO = 10;

	/**
	 * Constante que identifica el error: El Movimiento no Existe.
	 */

	public static final short NO_EXISTE_MOVIMIENTO = 11;

	/**
	 * Constante que identifica el error: Se han realizado cambios en el
	 * Movimiento.
	 */

	public static final short MOVIMIENTO_HA_CAMBIADO = 12;

	/**
	 * Constante que identifica el error: No se puede realizar la Operación.
	 */

	public static final short OPERACION_NO_VALIDA = 13;

	/**
	 * Constante que identifica el error: La Fecha de Movimiento NO es Correcta.
	 * Para Movimientos que no están activos.
	 */

	public static final short FECHA_MOVIMIENTO_INACTIVO_INCORRECTA = 14;

	/**
	 * Constante que identifica el error: No se puede realizar un Movimiento
	 * porque no está en el Estado Correcto. Por ejemplo, se intenta realizar un
	 * Movimiento de Baja a un Movimiento que ya es una Baja. Para Movimientos
	 * que no están activos.
	 */

	public static final short MOVIMIENTO_INACTIVO_INCORRECTO = 15;

	/**
	 * Constante que identifica el error: Fecha Incorrecta.
	 */

	public static final short FECHA_INCORRECTA = 16;

	/**
	 * Constante que identifica el error: La Fecha de Finalización NO es
	 * Correcta.
	 */

	public static final short FECHA_FINALIZACION_INCORRECTA = 17;

	/**
	 * Constante que identifica el error: El Proceso ha sido Cancelado.
	 */

	public final static short PROCESO_CANCELADO = 18;

	/**
	 * Constante que identifica el error: El usuario ya existe en el calendario.
	 */

	public final static short USUARIO_EN_CALENDARIO = 19;

	/**
	 * Constante que identifica el error: El usuario ya existe en el motor de
	 * procedimientos Gestiona
	 */

	public final static short USUARIO_EN_GESTIONA = 20;

	/**
	 * Constante que identifica el error: Problemas en la gestión de usuarios de
	 * gestiona
	 */

	public final static short ERROR_GESTION_USUARIOS_GESTIONA = 21;

	/**
	 * Constante que identifica el error: Problemas de interbloque entre
	 * transaccciones
	 */

	public final static short INTERBLOQUEO_TRANSACCIONES = 22;

	/**
	 * Constante que indica el error: Error al realizar una operación con un
	 * registro usado en otra tabla (Violación de FK).
	 */
	public final static short ERROR_OPERACION_CON_FK = 23;

	/**
	 * Constante que indica el error: Plantilla no firmable en multientidad.
	 */
	public final static short PLANTILLA_NO_FIRMABLE_MULTIENTIDAD = 24;

	/**
	 * Constante que indica el error: Usuario ya validado en el sistema
	 */
	public final static short USUARIO_YA_CONECTADO = 25;

	protected Exception oException;
	protected String sFraseSql = "";
	protected short shTipoExcepcion = 0;
	protected String sMensaje = "";
	protected String sLinea = "";
	protected String sError = "";
	protected String sErrorLog = "";
	protected StackTraceElement[] aTrace;
	public boolean bSoloMensaje = false;

	protected Object oDto;

	/**
	 * Constructor por Defecto
	 */

	public CtrError() {
	}

	/**
	 * Constructor para Excepciones de Usuario
	 * 
	 * @param pshError
	 *            Código de Error a crear
	 */

	public CtrError(short pshError) {
		this.shTipoExcepcion = pshError;
		bSoloMensaje = true;
	}

	/**
	 * Constructor para Excepciones de Usuario
	 * 
	 * @param psMensaje
	 *            Mensaje que se va a mostrar
	 * @param pshError
	 *            Código de Error a crear
	 */

	public CtrError(String psMensaje, short pshError) {
		this.shTipoExcepcion = pshError;
		bSoloMensaje = true;
		sMensaje = psMensaje;
		oException = null;
		trataExcepcion();
	}

	/**
	 * Constructor que loguea el Mensaje que se le pasa como Parámetro
	 * 
	 * @param psMensaje
	 *            Mensaje que se va a mostrar
	 */

	public CtrError(String psMensaje) {
		sMensaje = psMensaje;
		oException = null;
		bSoloMensaje = true;
		trataExcepcion();
	}

	/**
	 * Constructor
	 * 
	 * @param poException
	 *            Objeto Exception
	 */

	public CtrError(Exception poException) {
		this(null, poException);
	}

	/**
	 * Constructor de la clase.
	 * 
	 * @param psMenError
	 *            Mensaje de Error.
	 * @param poException
	 *            Objeto Exception.
	 */

	public CtrError(String psMenError, Exception poException) {
		super(psMenError, poException);
		this.oException = poException;
		this.sMensaje = psMenError;
		this.trataExcepcion();
		this.cargarTrace(poException);
	}

	/**
	 * @deprecated Constructor de la clase.
	 * @param psLineaError
	 *            Línea de Error.
	 * @param psMenError
	 *            Mensaje de Error.
	 * @param poe
	 *            Objeto Exception.
	 */

	public CtrError(String psLineaError, String psMenError, Exception poe) {
		this(psMenError, poe);
		this.cargarTrace(poe);
	}

	/**
	 * Marca la Fecha Hora de la Excepción
	 */
	public void marcaFechaHora() {
		log("[" + dameFechaHora() + "]");
	}

	/**
	 * Método que devuelve la Fecha y la Hora
	 * 
	 * @return Fecha y Hora
	 */

	public Date dameFechaHora() {
		Date fHoraLog = new Date();
		return fHoraLog;
	}

	/**
	 * Método 'setMessage'
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.sMensaje = message;
	}

	/**
	 * Método que loguea un mensaje
	 * 
	 * @param psMensaje
	 *            Mensaje
	 */

	public void log(String psMensaje) {
		if (!bSoloMensaje) {
			System.err.println("\n" + psMensaje + "\n");

			if (aTrace != null) {
				for (int i = 0; i < aTrace.length; i++) {
					System.err.println(aTrace[i].toString());
				}
			}
		}
	}

	/**
	 * Método que asigna el dto que se ha encontrado (generalmente al buscar por
	 * PK o por AK´s).
	 * 
	 * @param poDto
	 *            Object
	 */
	public void setDtoEncontrado(Object poDto) {
		this.oDto = poDto;
	}

	/**
	 * Método que devuelve el dto que se ha encontrado (generalmente al buscar
	 * por PK o por AK´s).
	 * 
	 * @return Object
	 */
	public Object getDtoEncontrado() {
		return this.oDto;
	}

	/**
	 * Método que asigna el error
	 * 
	 * @param psError
	 *            String Cadena de Error
	 */
	public void setError(String psError) {
		this.sError = Utiles.ifNull(psError, "");
	}

	/**
	 * Método que devuelve la Cadena de Error
	 * 
	 * @return String Cadena de Error
	 */
	public String getError() {
		return Utiles.ifNull(this.sError, "");
	}

	/**
	 * Método que loguea un Mensaje
	 * 
	 * @param psMensaje
	 *            Mensaje
	 */

	public void logAviso(String psMensaje) {
		log(psMensaje);
	}

	/**
	 * Método que loguea una Excepcion
	 */

	public void logException() {
		sErrorLog = "-------------------- EXCEPCION------------------" + "\n"
				+ "[" + dameFechaHora() + "]" + "\n" + sLinea + "\n"
				+ "Mensaje: " + sMensaje + "\n"
				+ "------------------------------------------------" + "\n";
		log(sErrorLog);
	}

	/**
	 * Método que trata la Excepción
	 */

	@SuppressWarnings({ "rawtypes", "unused" })
	public void trataExcepcion() {
		if (oException == null) {
			logAviso(sMensaje);
		} else {
			Class clase = oException.getClass();
			SQLException oEsql = new SQLException();
		}
	}

	/**
	 * Devuelve el Mensaje de la Excepción
	 * 
	 * @return String Mensaje
	 */
	public String getMessage() {
		if (sMensaje != null && sMensaje.length() > 0) {
			return sMensaje;
		}

		return super.getMessage();
	}

	/**
	 * Método que obtiene el atributo linea
	 * 
	 * @return Atributo linea
	 */

	public String getLinea() {
		return this.sLinea;
	}

	/**
	 * Método que obtiene el atributo exception
	 * 
	 * @return Atributo exception
	 */

	public Exception getException() {
		return this.oException;
	}

	/**
	 * Método que obtiene el atributo tipo de excepción
	 * 
	 * @return TipoExcepcion
	 */

	public short getTipoExcepcion() {
		return this.shTipoExcepcion;
	}

	/**
	 * Método que asigna el atributo tipo de excepción
	 * 
	 * @param pshTipoExcepcion
	 *            Tipo Excepción
	 */

	public void setTipoExcepcion(short pshTipoExcepcion) {
		shTipoExcepcion = pshTipoExcepcion;
	}

	/**
	 * Obtiene Información del Error y del Trace
	 * 
	 * @param poExcepcion
	 *            Excepción producida
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void cargarTrace(Exception poExcepcion) {
		Vector oTrace = new Vector();

		for (int i = 0; i < poExcepcion.getStackTrace().length; i++) {
			if (poExcepcion.getStackTrace()[i].toString().indexOf("greenaall") >= 0) {
				oTrace.add(poExcepcion.getStackTrace()[i]);
			}
		}
		aTrace = new StackTraceElement[oTrace.size()];
		oTrace.toArray(aTrace);

		// Mensaje de Error

		if (!this.getError().equals("")) {
			this.setError("Error: " + poExcepcion.getMessage());
		}

		// Línea del Error
		if (aTrace.length > 0) {
			sLinea = aTrace[0].getClassName() + "!" + aTrace[0].getMethodName()
					+ "!" + Integer.toString(aTrace[0].getLineNumber());
		}
	}

	/**
	 * Método que monta el Mensaje de Información.
	 * 
	 * @param piPosiciones
	 *            Número de Posiciones del Error
	 * @return Mensaje de Información.
	 */

	public String mensajeInformacion(int piPosiciones) {
		String sMenInfor = "";

		// Si no se ha indicado un Mensaje para la Excepción se busca la
		// Excepción
		// Origen que la Causó para obtener su Mensaje.

		if (!Utiles.ifNull(sMensaje).equals("")) {
			sMenInfor = sMensaje + "\n\n";
		} else {
			Throwable oCauOrige = this.getCause();

			if (oCauOrige != null) {
				while (oCauOrige.getCause() != null) {
					oCauOrige = oCauOrige.getCause();
				}

				if (!Utiles.ifNull(oCauOrige.getMessage()).equals("")) {
					sMenInfor = oCauOrige.getMessage() + "\n\n";
				}
			}
		}

		if (Utiles.ifNull(sMensaje).equals("")) {
			if (!bSoloMensaje) {
				if (!Utiles.ifNull(sLinea).equals("")) {
					sMenInfor += sLinea + "\n";
				}

				if (!Utiles.ifNull(this.getError()).equals("")) {
					sMenInfor += this.getError() + "\n";
				}
			}
		}

		return (piPosiciones > 0 && sMenInfor.length() > piPosiciones) ? sMenInfor
				.substring(0, piPosiciones)
				+ "..."
				: sMenInfor;
	}

	/**
	 * Método que monta el Mensaje de Información.
	 * 
	 * @return Mensaje de Información.
	 */

	public String mensajeInformacion() {
		return mensajeInformacion(1000);
	}

	/**
	 * Método que monta el Mensaje de Log.
	 * 
	 * @return Mensaje de Log.
	 */

	public String mensajeLog() {
		return sErrorLog;
	}

	/**
	 * Localiza un posible CtrError.
	 * 
	 * @param poe
	 *            Excepcion
	 * @return CtrError
	 */

	public static CtrError getCtrError(Exception poe) {
		Throwable oTh = poe.getCause();

		if (poe != null) {
			if (poe instanceof CtrError) {
				return (CtrError) poe;
			}
		}

		while (oTh != null) {
			String sClase = oTh.getClass().getName();

			if (sClase.equals("es.greenaall.util.comun.excepciones.CtrError")) {
				return (CtrError) oTh;
			}

			oTh = oTh.getCause();
		}

		return null;
	}

	/**
	 * Método que escribe la traza de error
	 * 
	 * @param poFichero
	 *            Fichero donde Generar
	 */

	public void generarTrazas(PrintStream poFichero) {
		poFichero.println(dameFechaHora());

		if (sMensaje != null && !sMensaje.equals("")) {
			poFichero.println(sMensaje);
		}

		if (!sLinea.equals("")) {
			poFichero.println(sLinea);
		}

		if (!this.getError().equals("")) {
			poFichero.println(this.getError());
		}

		if (aTrace != null) {
			for (int i = 0; i < aTrace.length; i++) {
				poFichero.println(aTrace[i].toString());
			}
		}

		poFichero.println(this);
	}
}
