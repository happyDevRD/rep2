package com.greenaall.ge.dto;

import java.io.Serializable;
import java.util.Calendar;

public class Peticion implements Serializable {

	private static final long serialVersionUID = 4231379790428868916L;

	/**
	 * Propiedad que almacena las etiquetas que identifican la petición
	 */
	private String tags;

	/**
	 * Propiedad que almacena el DNI de la persona que realiza la petición
	 */
	private String numDocRemit;

	/**
	 * Propiedad que almacena el Nombre completo de la persona que realiza la
	 * petición
	 */
	private String desRemit;

	/**
	 * Datos de la aplicación que invoca a la firma
	 */
	private String aplicacion;

	/**
	 * Colección de emails separados por ; necesaria para la notificación del estado
	 * de la petición
	 */
	private String emailNotif;

	/**
	 * Asunto de la petición
	 */
	private String asunto;

	/**
	 * Texto de la petición
	 */
	private String texto;

	/**
	 * Prioridad de la petición. Tendrá los valores 0 Baja, 1 Media, 2 Alta
	 */
	private byte prioridad;

	/**
	 * Fecha a partir de la que se puede realizar la firma
	 */
	private Calendar fecIniFirma;

	/**
	 * Registro salida para realizar la firma
	 */
	private Short salida;

	/**
	 * Fecha tope para realizar la firma
	 */
	private Calendar fecFinFirma;

	/**
	 * Array de documentos incluidos en la petición de firma
	 */
	private Documento[] documentos;

	/**
	 * Método que devuelve el valor de la aplicación que realiza la petición
	 * 
	 * @return String Aplicación que realiza la petición
	 */
	public String getAplicacion() {
		return aplicacion;
	}

	/**
	 * Método que devuelve el valor del asunto de la petición
	 * 
	 * @return String Asunto de la petición
	 */
	public String getAsunto() {
		return asunto;
	}

	/**
	 * Método que devuelve el Nombre completo de la persona que realiza la petición
	 * 
	 * @return String Nombre completo de la persona que realiza la petición
	 */
	public String getDesRemit() {
		return desRemit;
	}

	/**
	 * Método que devuelve la lista de direcciones de correo en las que realizar las
	 * notificaciones del estado de la petición
	 * 
	 * @return String Lista de direcciones de correo en las que realizar las
	 *         notificaciones del estado de la petición
	 */
	public String getEmailNotif() {
		return emailNotif;
	}

	/**
	 * Método que devuelve la fecha tope hasta la que se puede firmar
	 * 
	 * @return Calendar Fecha tope hasta la que se puede firmar
	 */
	public Calendar getFecFinFirma() {
		return fecFinFirma;
	}

	/**
	 * Método que devuelve la fecha a partir de la que se puede firmar
	 * 
	 * @return Calendar Fecha a partir de la que se puede firmar
	 */
	public Calendar getFecIniFirma() {
		return fecIniFirma;
	}

	/**
	 * Método que devuelve el DNI de la persona que realiza la petición
	 * 
	 * @return String DNI de la persona que realiza la petición
	 */
	public String getNumDocRemit() {
		return numDocRemit;
	}

	/**
	 * Método que devuelve la prioridad de la petición
	 * 
	 * @return byte Prioridad de la petición
	 */
	public byte getPrioridad() {
		return prioridad;
	}

	/**
	 * Método que devuelve las etiquetas identificativas de la petición de firma
	 * 
	 * @return String Etiquetas identificativas de la petición de firma
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * Método que devuelve el texto de la petición de firma
	 * 
	 * @return String Texto de la petición de firma
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Método que devuelve el array de documentos incluidos en la petición de firma
	 * 
	 * @return Documento[] Array de documentos incluidos en la petición de firma
	 */
	public Documento[] getDocumentos() {
		return documentos;
	}

	/**
	 * Método que asigna un valor al text de la petición de firma
	 * 
	 * @param texto String Texto de la petición de firma
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * Método que asigna un valor a las etiquetas identificativas de la petición de
	 * firma
	 * 
	 * @param tags String Etiquetas identificativas de la petición de firma
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * Método que asigna un valor a la prioridad de la petición
	 * 
	 * @param prioridad byte Prioridad de la petición
	 */
	public void setPrioridad(byte prioridad) {
		this.prioridad = prioridad;
	}

	/**
	 * Método que asigna un valor al DNI de la persona que realiza la petición
	 * 
	 * @param numDocRemit String DNI de la persona que realiza la petición
	 */
	public void setNumDocRemit(String numDocRemit) {
		this.numDocRemit = numDocRemit;
	}

	/**
	 * Método que asigna un valor a la fecha a partir de la que se puede firmar
	 * 
	 * @param fecIniFirma Calendar Fecha a partir de la que se puede firmar
	 */
	public void setFecIniFirma(Calendar fecIniFirma) {
		this.fecIniFirma = fecIniFirma;
	}

	/**
	 * Método que asigna un valor a la fecha tope para poder firmar
	 * 
	 * @param fecFinFirma Calendar Fecha tope para poder firmar
	 */
	public void setFecFinFirma(Calendar fecFinFirma) {
		this.fecFinFirma = fecFinFirma;
	}

	/**
	 * Método que asigna un valor a la lista de direcciones de correo a las que
	 * realizar las notificaciones del estado de la petición
	 * 
	 * @param emailNotif String Lista de direcciones de correo a las que realizar
	 *                   las notificaciones del estado de la petición
	 */
	public void setEmailNotif(String emailNotif) {
		this.emailNotif = emailNotif;
	}

	/**
	 * Método que asigna un valor al nombre completo de la persona que realiza la
	 * petición
	 * 
	 * @param desRemit String Nombre completo de la persona que realiza la petición
	 */
	public void setDesRemit(String desRemit) {
		this.desRemit = desRemit;
	}

	/**
	 * Método que asigna un valor al asunto de la petición
	 * 
	 * @param asunto String Asunto de la petición
	 */
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	/**
	 * Método que asigna un valor a la aplicación que invoca la firma
	 * 
	 * @param aplicacion String Aplicación que invoca la firma
	 */
	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}

	/**
	 * Método que asigna un valor al array de documentos incluidos en la petición de
	 * firma
	 * 
	 * @param documentos Documento[] Array de documentos incluidos en la petición de
	 *                   firma
	 */
	public void setDocumentos(Documento[] documentos) {
		this.documentos = documentos;
	}

	public Short getSalida() {
		return salida;
	}

	public void setSalida(Short salida) {
		this.salida = salida;
	}

}
