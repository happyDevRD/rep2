package com.greenaall.models.pe.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class PersonaCargoPK implements Serializable{
	
	private static final long serialVersionUID = 8862748228180440414L;

	@Column(name = "id_his_perso")
	private Long idHisPerso;
	
	@Column(name = "id_perso")
	private Long idPerso;
	
	@Column(name = "tip_cargo")
	private Short tipCargo;

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public Short getTipCargo() {
		return tipCargo;
	}

	public void setTipCargo(Short tipCargo) {
		this.tipCargo = tipCargo;
	}

}
