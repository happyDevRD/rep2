package com.greenaall.ge.dto;

public class DatosFirmante implements java.io.Serializable {

	private static final long serialVersionUID = -7589634635951381923L;
	/**
	 * Propiedad que almacena el número de documento del firmante
	 */
	private String numDocum;

	/**
	 * Propiedad que almacena el nombre completo del firmante
	 */
	private String nombreCompleto;

	/**
	 * Método que devuelve el número de documento del firmante
	 * 
	 * @return Número de documento del firmante
	 */
	public String getNumDocum() {
		return numDocum;
	}

	/**
	 * Método que asigna un valor al número de documento del firmante
	 * 
	 * @param numDocum Número de documento del firmante
	 */
	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}

	/**
	 * Método que devuelve el nombre completo del firmante
	 * 
	 * @return Nombre completo del firmante
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * Método que asigna un valor al nombre completo del firmante
	 * 
	 * @param nombreCompleto Nombre completo del firmante
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
}
