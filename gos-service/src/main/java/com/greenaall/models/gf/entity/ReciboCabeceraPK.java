package com.greenaall.models.gf.entity;

import java.io.Serializable;

public class ReciboCabeceraPK implements Serializable {

	private static final long serialVersionUID = 6473578890584547979L;
	private Long idHisRecib;
	private Long idRecib;

	public ReciboCabeceraPK(final Long idHisRecib, final Long idRecib) {
		this.idHisRecib = idHisRecib;
		this.idRecib = idRecib;
	}

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

	public ReciboCabeceraPK() {
		super();
	}
	
	

}
