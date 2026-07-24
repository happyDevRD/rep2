package com.greenaall.models.gf.entity;

import java.io.Serializable;

public class ReciboConceptoPK implements Serializable {

	private static final long serialVersionUID = 4354504023173797521L;
	private Long idHisRecib;
	private Long idRecib;
	private Short ejeConce;
	private String codConce;

	public Long getIdHisRecib() {
		return idHisRecib;
	}

	public void setIdHisRecib(Long idHisRecib) {
		this.idHisRecib = idHisRecib;
	}

	public Long getIdRecib() {
		return idRecib;
	}

	public void setIdRecib(Long idRecib) {
		this.idRecib = idRecib;
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

	public ReciboConceptoPK() {
		super();
	}

}
