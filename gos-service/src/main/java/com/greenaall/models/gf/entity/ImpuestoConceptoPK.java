package com.greenaall.models.gf.entity;

import java.io.Serializable;

public class ImpuestoConceptoPK implements Serializable {

	private static final long serialVersionUID = -7529348359999486948L;
	private Long idImpue;
	private String codConce;

	public Long getIdImpue() {
		return idImpue;
	}

	public void setIdImpue(Long idImpue) {
		this.idImpue = idImpue;
	}

	public String getCodConce() {
		return codConce;
	}

	public void setCodConce(String codConce) {
		this.codConce = codConce;
	}

	public ImpuestoConceptoPK(Long idImpue, String codConce) {
		super();
		this.idImpue = idImpue;
		this.codConce = codConce;
	}

	public ImpuestoConceptoPK() {
		super();
	}

}
