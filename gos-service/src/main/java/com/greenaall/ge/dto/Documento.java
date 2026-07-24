package com.greenaall.ge.dto;

import java.io.Serializable;

public class Documento implements Serializable {
	
	private static final long serialVersionUID = 2372428921918904465L;

	/**
	 * Etiquetas identificativas del documento
	 */
	private String tags;

	/**
	 * Nombre del documento con extensión
	 */
	private String desDoc;

	/**
	 * Ruta del directorio de usuario
	 */
	private String ecm;

	/**
	 * Contenido del documento en Base 64
	 */
	private String docEnBase64;

	/**
	 * Descripción del documento
	 */
	private String texto;

	/**
	 * Indicador de si el documento tiene más de un firmante. Posibles valores: 0
	 * No, 1 Si, 2 Si_Ordenada
	 */
	private byte multifirma;

	/**
	 * Array de firmantes del documento
	 */
	private Firmante[] firmantes;

	/**
	 * Método que devuelve el nombre del documento con extensión
	 * 
	 * @return String Nombre del documento con extensión
	 */
	public String getDesDoc() {
		return desDoc;
	}

	/**
	 * Método que devuelve el contenido del documento codificado en base 64
	 * 
	 * @return String Contenido del documento en base 64
	 */
	public String getDocEnBase64() {
		return docEnBase64;
	}

	/**
	 * Método que devuelve los datos del el gestor documental
	 * 
	 * @return String Datos del gestor documental
	 */
	public String getEcm() {
		return ecm;
	}

	/**
	 * Método que devuelve el indicador de si el documento tiene más de un firmante
	 * 
	 * @return byte Indicador de si el documento tiene más de un firmante
	 */
	public byte getMultifirma() {
		return multifirma;
	}

	/**
	 * Método que devuelve las etiquetas identificativas del documento
	 * 
	 * @return String Etiquetas identificativas del documento
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * Método que devuelve la descripción del documento
	 * 
	 * @return String Descripción del documento
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Método que devuelve el array de firmantes de un documento
	 * 
	 * @return Firmante[] Array de firmantes de un documento
	 */
	public Firmante[] getFirmantes() {
		return firmantes;
	}

	/**
	 * Método que asigna un valor al nombre del documento con la extensión
	 * 
	 * @param desDoc String Nombre del documento con al extensión
	 */
	public void setDesDoc(String desDoc) {
		this.desDoc = desDoc;
	}

	/**
	 * Método que asigna un valor al contenido del documento en base 64
	 * 
	 * @param docEnBase64 String Contenido del documento en base 64
	 */
	public void setDocEnBase64(String docEnBase64) {
		this.docEnBase64 = docEnBase64;
	}

	/**
	 * Método que asigna un valor a los datos del gestor documental
	 * 
	 * @param ecm String Datos del gestor documental
	 */
	public void setEcm(String ecm) {
		this.ecm = ecm;
	}

	/**
	 * Método que asigna un valor al indicador de que el documento tiene más de un
	 * firmante
	 * 
	 * @param multifirma byte Indicador de que el documento tiene más de un firmante
	 */
	public void setMultifirma(byte multifirma) {
		this.multifirma = multifirma;
	}

	/**
	 * Método que asigna un valor a las etiquetas identificativas del documento
	 * 
	 * @param tags String Etiquetas identificativas del documento
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * Método que asigna un valor a la descripción del documento
	 * 
	 * @param texto String Descripción del documento
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * Método que asigna un valor al array de firmantes de un documento
	 * 
	 * @param firmantes Firmante[] Array de firmantes de un documento
	 */
	public void setFirmantes(Firmante[] firmantes) {
		this.firmantes = firmantes;
	}
}
