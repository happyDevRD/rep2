package com.greenaall.models.rd.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class RdDocumentoAnexoPK implements Serializable{

	private static final long serialVersionUID = 2408712377976741802L;

    @Column(name = "num_orden")
    private Long numOrden;

    @Column(name = "id_his_docum")
    private Long idHisDocum;

	public RdDocumentoAnexoPK(Long numOrden, Long idHisDocum) {
		super();
		this.numOrden = numOrden;
		this.idHisDocum = idHisDocum;
	}

	public RdDocumentoAnexoPK() {
		super();
	}
}
