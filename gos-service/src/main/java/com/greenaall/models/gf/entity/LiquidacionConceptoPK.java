package com.greenaall.models.gf.entity;

import java.io.Serializable;

public class LiquidacionConceptoPK implements Serializable {

	private static final long serialVersionUID = 4351072525470773855L;
	private Long idLiqui;
	private Short ejeConce;
	private String codConce;

	public Long getIdLiqui() {
		return idLiqui;
	}

	public void setIdLiqui(Long idLiqui) {
		this.idLiqui = idLiqui;
	}

	public Short getEjeConce() {
		return ejeConce;
	}

	public void setEjeConce(Short ejeConce) {
		this.ejeConce = ejeConce;
	}

	public String getCodConce() {
		return codConce;
	}

	public void setCodConce(String codConce) {
		this.codConce = codConce;
	}

	public LiquidacionConceptoPK(Long idLiqui, Short ejeConce, String codConce) {
		super();
		this.idLiqui = idLiqui;
		this.ejeConce = ejeConce;
		this.codConce = codConce;
	}

	public LiquidacionConceptoPK() {
		super();
	}

}
