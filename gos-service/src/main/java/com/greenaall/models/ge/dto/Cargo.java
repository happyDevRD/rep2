package com.greenaall.models.ge.dto;

import java.io.Serializable;
import java.util.Date;

public class Cargo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4971483681723997621L;

	/**
	 * This attribute maps to the column cod_cargo in the ad_cargo table.
	 */
	private Short codCargo;

	/**
	 * This attribute maps to the column descripcion in the ad_cargo table.
	 */
	private String descripcion;

	/**
	 * This attribute maps to the column usu_contr in the ad_cargo table.
	 */
	private String usuContr;

	/**
	 * This attribute maps to the column fec_contr in the ad_cargo table.
	 */
	private Date fecContr;

	/**
	 * Sets the value of codCargo
	 */
	public void setCodCargo(Short codCargo) {
		this.codCargo = codCargo;
	}

	/**
	 * Gets the value of codCargo
	 */
	public Short getCodCargo() {
		return codCargo;
	}

	/**
	 * Sets the value of descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the value of descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the value of usuContr
	 */
	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	/**
	 * Gets the value of usuContr
	 */
	public String getUsuContr() {
		return usuContr;
	}

	/**
	 * Sets the value of fecContr
	 */
	public void setFecContr(java.util.Date fecContr) {
		this.fecContr = (fecContr == null) ? null : new java.util.Date(
				fecContr.getTime());
	}

	/**
	 * Gets the value of fecContr
	 */
	public Date getFecContr() {
		return fecContr;
	}

	/**
	 * Método 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	@Override
	public boolean equals(Object _other) {
		if (_other == null) {
			return false;
		}

		if (_other == this) {
			return true;
		}

		if (!(_other instanceof Cargo)) {
			return false;
		}

		final Cargo _cast = (Cargo) _other;

		if (codCargo == null ? _cast.codCargo != codCargo : !codCargo
				.equals(_cast.codCargo)) {
			return false;
		}

		if (descripcion == null ? _cast.descripcion != descripcion
				: !descripcion.equals(_cast.descripcion)) {
			return false;
		}

		if (usuContr == null ? _cast.usuContr != usuContr : !usuContr
				.equals(_cast.usuContr)) {
			return false;
		}

		if (fecContr == null ? _cast.fecContr != fecContr : !fecContr
				.equals(_cast.fecContr)) {
			return false;
		}

		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	@Override
	public int hashCode() {
		int _hashCode = 0;
		if (codCargo != null) {
			_hashCode = 29 * _hashCode + codCargo.hashCode();
		}

		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}

		if (usuContr != null) {
			_hashCode = 29 * _hashCode + usuContr.hashCode();
		}

		if (fecContr != null) {
			_hashCode = 29 * _hashCode + fecContr.hashCode();
		}

		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("es.greenaall.gos.ad.dto.Cargo: ");
		ret.append("codCargo='" + codCargo + "'");
		ret.append(", descripcion='" + descripcion + "'");
		ret.append(", usuContr='" + usuContr + "'");
		ret.append(", fecContr='" + fecContr + "'");
		return ret.toString();
	}
}
