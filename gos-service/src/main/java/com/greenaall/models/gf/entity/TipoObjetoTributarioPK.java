package com.greenaall.models.gf.entity;

import java.io.Serializable;

public class TipoObjetoTributarioPK implements Serializable {

	private static final long serialVersionUID = -8290445763193535453L;
	private Long idHisTipObjTribu;
	private Long idTipObjTribu;

	public Long getIdHisTipObjTribu() {
		return idHisTipObjTribu;
	}

	public void setIdHisTipObjTribu(Long idHisTipObjTribu) {
		this.idHisTipObjTribu = idHisTipObjTribu;
	}

	public Long getIdTipObjTribu() {
		return idTipObjTribu;
	}

	public void setIdTipObjTribu(Long idTipObjTribu) {
		this.idTipObjTribu = idTipObjTribu;
	}

	public TipoObjetoTributarioPK(Long idHisTipObjTribu, Long idTipObjTribu) {
		super();
		this.idHisTipObjTribu = idHisTipObjTribu;
		this.idTipObjTribu = idTipObjTribu;
	}

	public TipoObjetoTributarioPK() {
		super();

	}

}
