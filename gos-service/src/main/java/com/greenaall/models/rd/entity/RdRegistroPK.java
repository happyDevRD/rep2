package com.greenaall.models.rd.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class RdRegistroPK implements Serializable{

	private static final long serialVersionUID = 147023603719548410L;
	
	@Id
	@Column(name = "cod_regis")
	private String codRegis;
	
	@Id
	@Column(name = "entidad")
	private Short entidad;

	public String getCodRegis() {
		return codRegis;
	}

	public void setCodRegis(String codRegis) {
		this.codRegis = codRegis;
	}

	public Short getEntidad() {
		return entidad;
	}

	public void setEntidad(Short entidad) {
		this.entidad = entidad;
	}

	public RdRegistroPK(String codRegis, Short entidad) {
		super();
		this.codRegis = codRegis;
		this.entidad = entidad;
	}

	public RdRegistroPK() {
		super();
	}
	
}
