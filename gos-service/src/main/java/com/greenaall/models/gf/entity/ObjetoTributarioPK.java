package com.greenaall.models.gf.entity;

import java.io.Serializable;

public class ObjetoTributarioPK implements Serializable {

	private static final long serialVersionUID = 925654326241098069L;
	private Long idHisObjTribu;
	private Long idObjTribu;

	public Long getIdHisObjTribu() {
		return idHisObjTribu;
	}

	public void setIdHisObjTribu(Long idHisObjTribu) {
		this.idHisObjTribu = idHisObjTribu;
	}

	public Long getIdObjTribu() {
		return idObjTribu;
	}

	public void setIdObjTribu(Long idObjTribu) {
		this.idObjTribu = idObjTribu;
	}

	public ObjetoTributarioPK() {
		super();
	}

}
