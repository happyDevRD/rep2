package com.greenaall.models.pe.entity;

import java.io.Serializable;

public class DomiciliacionBancariaPK implements Serializable {

	private static final long serialVersionUID = -366975496407326584L;
	private java.lang.Long idHisDomBanca;
	private java.lang.Long idDomBanca;

	public java.lang.Long getIdHisDomBanca() {
		return idHisDomBanca;
	}

	public void setIdHisDomBanca(java.lang.Long idHisDomBanca) {
		this.idHisDomBanca = idHisDomBanca;
	}

	public java.lang.Long getIdDomBanca() {
		return idDomBanca;
	}

	public void setIdDomBanca(java.lang.Long idDomBanca) {
		this.idDomBanca = idDomBanca;
	}

	public DomiciliacionBancariaPK(Long idHisDomBanca, Long idDomBanca) {
		super();
		this.idHisDomBanca = idHisDomBanca;
		this.idDomBanca = idDomBanca;
	}

	public DomiciliacionBancariaPK() {
		super();
	}

}
