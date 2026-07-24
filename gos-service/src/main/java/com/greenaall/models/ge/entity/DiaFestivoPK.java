package com.greenaall.models.ge.entity;

import java.sql.Date;

public class DiaFestivoPK implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Short codEntid;
	private java.sql.Date fecFesti;

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public DiaFestivoPK(Short codEntid, Date fecFesti) {
		super();
		this.codEntid = codEntid;
		this.fecFesti = fecFesti;
	}

	public java.sql.Date getFecFesti() {
		return fecFesti;
	}

	public void setFecFesti(java.sql.Date fecFesti) {
		this.fecFesti = fecFesti;
	}

	public DiaFestivoPK() {
		super();
	}

}
