package com.greenaall.models.se.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;

public class SeBolsaIntePK implements Serializable {

	private static final long serialVersionUID = -7208265555280381993L;
	@Basic(optional = false)
	@Column(name = "id_his_bolsa")
	private long idHisBolsa;

	@Basic(optional = false)
	@Column(name = "id_his_inter")
	private long idHisInter;

	@Basic(optional = false)
	@Column(name = "id_inter")
	private long idInter;

	public long getIdHisBolsa() {
		return idHisBolsa;
	}

	public void setIdHisBolsa(long idHisBolsa) {
		this.idHisBolsa = idHisBolsa;
	}

	public long getIdHisInter() {
		return idHisInter;
	}

	public void setIdHisInter(long idHisInter) {
		this.idHisInter = idHisInter;
	}

	public long getIdInter() {
		return idInter;
	}

	public void setIdInter(long idInter) {
		this.idInter = idInter;
	}

	public SeBolsaIntePK() {
		super();
	}

	public SeBolsaIntePK(long idHisBolsa, long idHisInter, long idInter) {
		super();
		this.idHisBolsa = idHisBolsa;
		this.idHisInter = idHisInter;
		this.idInter = idInter;
	}
	
	
	
}
