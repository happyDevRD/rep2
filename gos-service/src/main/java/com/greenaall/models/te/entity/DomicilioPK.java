package com.greenaall.models.te.entity;

public class DomicilioPK implements java.io.Serializable {

	private static final long serialVersionUID = 4313612392612068021L;
	private Long idHisDomic;
	private Long idDomic;

	public Long getIdHisDomic() {
		return idHisDomic;
	}

	public void setIdHisDomic(Long idHisDomic) {
		this.idHisDomic = idHisDomic;
	}

	public Long getIdDomic() {
		return idDomic;
	}

	public void setIdDomic(Long idDomic) {
		this.idDomic = idDomic;
	}

	public DomicilioPK(Long idHisDomic, Long idDomic) {
		super();
		this.idHisDomic = idHisDomic;
		this.idDomic = idDomic;
	}

	public DomicilioPK() {
		super();
	}

}
