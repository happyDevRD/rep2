package com.greenaall.models.rd.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;

public class RdDocumentoInteresadoPK implements Serializable {

	
	private static final long serialVersionUID = -8908514431804094591L;
	@Basic(optional = false)
	@Column(name = "num_orden")
	private Long numOrden;
	
	@Basic(optional = false)
	@Column(name = "id_his_docum")
	private Long idHisDocum;

	public RdDocumentoInteresadoPK() {
		super();
	}

	public RdDocumentoInteresadoPK(Long numOrden, Long idHisDocum) {
		super();
		this.numOrden = numOrden;
		this.idHisDocum = idHisDocum;
	}
	
}
