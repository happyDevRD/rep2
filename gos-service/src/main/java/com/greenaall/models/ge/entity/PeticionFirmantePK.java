package com.greenaall.models.ge.entity;

import java.io.Serializable;

public class PeticionFirmantePK implements Serializable {

	private static final long serialVersionUID = 7953634695742905204L;
	private Long idPeticion;
	private String identificador;
	private Short numOrden;
	public Long getIdPeticion() {
		return idPeticion;
	}
	public void setIdPeticion(Long idPeticion) {
		this.idPeticion = idPeticion;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Short getNumOrden() {
		return numOrden;
	}
	public void setNumOrden(Short numOrden) {
		this.numOrden = numOrden;
	}
	public PeticionFirmantePK() {
		super();
	}
}
