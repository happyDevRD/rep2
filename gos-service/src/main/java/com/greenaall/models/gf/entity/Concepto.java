package com.greenaall.models.gf.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_concepto")
public class Concepto implements Serializable {

	private static final long serialVersionUID = -91774165616570851L;

	@Id
	@Column(name = "cod_conce")
	private String codConce;

	@Column(name = "des_conce")
	private String desConce;

	@Column(name = "ind_iva")
	private Short indIva;

	@Column(name = "tip_conce")
	private Short tipConce;

	@Column(name = "cla_conce")
	private Short claConce;

	@Column(name = "cod_con_csb60")
	private Short codConCsb60;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public String getCodConce() {
		return codConce;
	}

	public void setCodConce(String codConce) {
		this.codConce = codConce;
	}

	public String getDesConce() {
		return desConce;
	}

	public void setDesConce(String desConce) {
		this.desConce = desConce;
	}

	public Short getIndIva() {
		return indIva;
	}

	public void setIndIva(Short indIva) {
		this.indIva = indIva;
	}

	public Short getTipConce() {
		return tipConce;
	}

	public void setTipConce(Short tipConce) {
		this.tipConce = tipConce;
	}

	public Short getClaConce() {
		return claConce;
	}

	public void setClaConce(Short claConce) {
		this.claConce = claConce;
	}

	public Short getCodConCsb60() {
		return codConCsb60;
	}

	public void setCodConCsb60(Short codConCsb60) {
		this.codConCsb60 = codConCsb60;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
	}

	public Concepto() {
		super();
	}
}
