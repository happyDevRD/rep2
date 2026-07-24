package com.greenaall.models.ge.dto;

import java.io.Serializable;

public class PersonaFirmante implements Serializable {

	private static final long serialVersionUID = 3248010870409645733L;

	private String numDocum;

	private String desPerso;

	private Long idHisPerso;

	private Long idPerso;
	
	private String cargo;

	/**
	 * @return the numDocum
	 */
	public String getNumDocum() {
		return numDocum;
	}

	/**
	 * @param numDocum
	 *            the numDocum to set
	 */
	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}

	/**
	 * @return the desPerso
	 */
	public String getDesPerso() {
		return desPerso;
	}

	/**
	 * @param desPerso
	 *            the desPerso to set
	 */
	public void setDesPerso(String desPerso) {
		this.desPerso = desPerso;
	}

	public final Long getIdHisPerso() {
		return idHisPerso;
	}

	public final void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public final Long getIdPerso() {
		return idPerso;
	}

	public final void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	/**
	 * 
	 */
	public PersonaFirmante() {
	}

	/**
	 * Método 'equals' Compara el Objeto
	 * 
	 * @param _other
	 *            Objeto a Comparar
	 * @return boolean Si son iguales
	 */
	@Override
	public boolean equals(Object _other) {
		if (_other == null) {
			return false;
		}

		if (_other == this) {
			return true;
		}

		if (!(_other instanceof PersonaFirmante)) {
			return false;
		}

		final PersonaFirmante _cast = (PersonaFirmante) _other;
		if (numDocum == null ? _cast.numDocum != null : !numDocum
				.equals(_cast.numDocum)) {
			return false;
		}

		if (desPerso == null ? _cast.desPerso != null : !desPerso
				.equals(_cast.desPerso)) {
			return false;
		}

		if (idHisPerso == null ? _cast.idHisPerso != null : !idHisPerso
				.equals(_cast.idHisPerso)) {
			return false;
		}

		if (idPerso == null ? _cast.idPerso != null : !idPerso
				.equals(_cast.idPerso)) {
			return false;
		}

		return true;
	}

	/**
	 * Método 'hashCode'
	 * 
	 * @return int HashCode
	 */
	@Override
	public int hashCode() {
		int _hashCode = 0;

		if (numDocum != null) {
			_hashCode = 29 * _hashCode + numDocum.hashCode();
		}

		if (desPerso != null) {
			_hashCode = 29 * _hashCode + desPerso.hashCode();
		}

		if (idHisPerso != null) {
			_hashCode = 29 * _hashCode + idHisPerso.hashCode();
		}

		if (idPerso != null) {
			_hashCode = 29 * _hashCode + idPerso.hashCode();
		}

		return _hashCode;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
	
}