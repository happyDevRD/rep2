package com.greenaall.ge.dto;

import java.io.Serializable;

public class Firmante implements Serializable {

	private static final long serialVersionUID = -5705648406477312176L;

	/**
	 * DNI del firmante
	 */
	private String numDocFirm;

	/**
	 * Nombre completo del firmante
	 */
	private String desFirm;

	/**
	 * DNI del sustituto de firma
	 */
	private String numDocFirmSust;

	/**
	 * Nombre completo del sustituto de firma
	 */
	private String desFirmSust;

	/**
	 * Código de la entidad
	 */
	private short codEntid;

	/**
	 * Método que devuelve el DNI del firmante
	 * 
	 * @return String DNI del firmante
	 */
	public String getNumDocFirm() {
		return numDocFirm;
	}

	/**
	 * Método que devuelve el nombre completo del firmante
	 * 
	 * @return String Nombre completo del firmante
	 */
	public String getDesFirm() {
		return desFirm;
	}

	/**
	 * Método que devuelve el DNI del sustituto de la firma
	 * 
	 * @return String DNI del sustituto
	 */
	public String getNumDocFirmSust() {
		return numDocFirmSust;
	}

	/**
	 * Método que devuelve el nombre completo del sustituto
	 * 
	 * @return String Nombre completo del sustituto
	 */
	public String getDesFirmSust() {
		return desFirmSust;
	}

	/**
	 * Método que devuelve el código de la entidad
	 * 
	 * @return short Código de la entidad
	 */
	public short getCodEntid() {
		return codEntid;
	}

	/**
	 * Método que asigna un valor al DNI del firmante
	 * 
	 * @param numDocFirm String DNI del firmante
	 */
	public void setNumDocFirm(String numDocFirm) {
		this.numDocFirm = numDocFirm;
	}

	/**
	 * Método que asigna un valor al nombre completo del firmante
	 * 
	 * @param desFirm String Nombre completo del firmante
	 */
	public void setDesFirm(String desFirm) {
		this.desFirm = desFirm;
	}

	/**
	 * Método que asigna un valor al DNI del sustituto
	 * 
	 * @param numDocFirmSust String DNI del sustituto
	 */
	public void setNumDocFirmSust(String numDocFirmSust) {
		this.numDocFirmSust = numDocFirmSust;
	}

	/**
	 * Método que asigna un valor al nombre completo del sustituto
	 * 
	 * @param desFirmSust String Nombre completo del sustituto
	 */
	public void setDesFirmSust(String desFirmSust) {
		this.desFirmSust = desFirmSust;
	}

	/**
	 * Método que asigna un valor al código de la entidad
	 * 
	 * @param codEntid short Código de la entidad
	 */
	public void setCodEntid(short codEntid) {
		this.codEntid = codEntid;
	}
}
