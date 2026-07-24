package com.greenaall.pa.dto;

import java.io.Serializable;
import java.util.Date;

public class HabitanteBajaDto implements Serializable {

	private static final long serialVersionUID = -552955364479783645L;
	private Short tipBaja;
	private Date fecMovim;
	private Date fecReal;
	private Short paiProDesti;
	private Short proProDesti;
	private Short munProDesti;

	public Short getTipBaja() {
		return tipBaja;
	}

	public void setTipBaja(Short tipBaja) {
		this.tipBaja = tipBaja;
	}

	public Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(Date fecMovim) {
		this.fecMovim = fecMovim;
	}

	public Date getFecReal() {
		return fecReal;
	}

	public void setFecReal(Date fecReal) {
		this.fecReal = fecReal;
	}

	public Short getPaiProDesti() {
		return paiProDesti;
	}

	public void setPaiProDesti(Short paiProDesti) {
		this.paiProDesti = paiProDesti;
	}

	public Short getProProDesti() {
		return proProDesti;
	}

	public void setProProDesti(Short proProDesti) {
		this.proProDesti = proProDesti;
	}

	public Short getMunProDesti() {
		return munProDesti;
	}

	public void setMunProDesti(Short munProDesti) {
		this.munProDesti = munProDesti;
	}

}
