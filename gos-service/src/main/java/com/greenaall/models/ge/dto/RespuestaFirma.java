package com.greenaall.models.ge.dto;

import java.util.Date;

public class RespuestaFirma implements java.io.Serializable {

	private static final long serialVersionUID = 161547179881868328L;
	/**
	 * Propiedad que almacena la fecha en la que se realiza la firma
	 */
	private Date fecFirma;

	/**
	 * Propiedad que almacena el identificador de la transacción
	 */
	private String idTransaccion;

	/**
	 * Propiedad que almacena el contenido del documento PDF firmado con el pie de
	 * firma codificado en base 64
	 */
	private String pdfInformeB64;

	/**
	 * Propiedad que almacena el P7S correspondiente a la firma realizada
	 */
	private String firmaB64;

	/**
	 * Propiedad que almacena la plataforma de firma digital.
	 */
	public String pfd;

	/**
	 * Propiedad que almacena el PDF firmado. Incluye la firma utilizando el campo
	 * firma disponible para todos los PDF's.
	 */
	public String pdfFirmadoB64;

	/**
	 * Propiedad que almacena la propiedad CSV de la firma.
	 */
	private String csv;

	/**
	 * Método que devuelve la fecha en la que se realiza la firma
	 * 
	 * @return Fecha en la que se realiza la firma
	 */
	public Date getFecFirma() {
		return fecFirma;
	}

	/**
	 * Método que asigna un valor a la fecha en la que se realiza la firma
	 * 
	 * @param fecFirma Fecha en la que se realiza la firma
	 */
	public void setFecFirma(Date fecFirma) {
		this.fecFirma = fecFirma;
	}

	/**
	 * Método que devuelve el identificador de la transacción
	 * 
	 * @return Identificador de la transacción
	 */
	public String getIdTransaccion() {
		return idTransaccion;
	}

	/**
	 * Método que asigna un valor al identificador de la transacción
	 * 
	 * @param idTransaccion Identificador de la transacción
	 */
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	/**
	 * Método que devuelve el contenido del documento PDF firmado con el pie de
	 * firma, codificado en base 64
	 * 
	 * @return Contenido del documento PDF firmado en base 64
	 */
	public String getPdfInformeB64() {
		return pdfInformeB64;
	}

	/**
	 * Método que asigna un valor al contenido del documento PDF firmado codificado
	 * en base 64
	 * 
	 * @param pdfInformeB64 Contenido del documento PDF firmado en base 64
	 */
	public void setPdfInformeB64(String pdfInformeB64) {
		this.pdfInformeB64 = pdfInformeB64;
	}

	/**
	 * Método que devuelve el P7S correspondiente a la firma realizada codificado en
	 * base 64
	 * 
	 * @return P7S de la firma en base 64
	 */
	public String getFirmaB64() {
		return firmaB64;
	}

	/**
	 * Método que asigna un valor al P7S de la firma realizada, codificado en base
	 * 64
	 * 
	 * @param firmaB64 P7S de la firma en base 64
	 */
	public void setFirmaB64(String firmaB64) {
		this.firmaB64 = firmaB64;
	}

	/**
	 * Método que devuelve la plataforma de firma digital con la que se ha realizado
	 * la correspondiente firma.
	 * 
	 * @return Plataforma de Firma Digital.
	 */
	public String getPfd() {
		return pfd;
	}

	/**
	 * Método que asigna la plataforma de firma digital con la que realizará la
	 * firma.
	 * 
	 * @param pfd Plataforma de Firma Digital
	 */
	public void setPfd(String pfd) {
		this.pfd = pfd;
	}

	/**
	 * Método que devuelve el documento PDF firmado. Incluye la firma utilizando el
	 * campo firma disponible para todos los PDF's.
	 * 
	 * @return Documento PDF firmado.
	 */
	public String getPdfFirmadoB64() {
		return pdfFirmadoB64;
	}

	/**
	 * Método que asigna el documento PDF firmado. Incluye la firma utilizando el
	 * campo firma disponible para todos los PDF's.
	 * 
	 * @param pdfFirmadoB64 Documento PDF firmado.
	 */
	public void setPdfFirmadoB64(String pdfFirmadoB64) {
		this.pdfFirmadoB64 = pdfFirmadoB64;
	}

	public String getCsv() {
		return csv;
	}

	public void setCsv(String csv) {
		this.csv = csv;
	}

}
