package com.greenaall.models.pe.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class PersonaContactoPK implements Serializable {

	private static final long serialVersionUID = -3220127426754310873L;
	
	@Column(name = "id_his_perso")
	private java.lang.Long idHisPerso;
	
	@Column(name = "id_perso")
	private java.lang.Long idPerso;
	
	@Column(name = "num_orden")
	private java.lang.Short numOrden;

	public java.lang.Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(java.lang.Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public java.lang.Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(java.lang.Long idPerso) {
		this.idPerso = idPerso;
	}

	public java.lang.Short getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(java.lang.Short numOrden) {
		this.numOrden = numOrden;
	}

	public PersonaContactoPK() {
		super();
	}
}
