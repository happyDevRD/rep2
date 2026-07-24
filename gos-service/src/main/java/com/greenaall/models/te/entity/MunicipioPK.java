package com.greenaall.models.te.entity;

public class MunicipioPK implements java.io.Serializable{

	private static final long serialVersionUID = 2498525506417469413L;
	private Short codProvi;
	private Short codMunic;
	public Short getCodProvi() {
		return codProvi;
	}
	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}
	public Short getCodMunic() {
		return codMunic;
	}
	public void setCodMunic(Short codMunic) {
		this.codMunic = codMunic;
	}
	public MunicipioPK(Short codProvi, Short codMunic) {
		super();
		this.codProvi = codProvi;
		this.codMunic = codMunic;
	}
	public MunicipioPK() {
		super();
	}

}
