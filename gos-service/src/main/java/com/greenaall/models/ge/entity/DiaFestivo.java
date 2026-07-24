package com.greenaall.models.ge.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(DiaFestivoPK.class)
@Table(name = "ge_dia_festivo")
public class DiaFestivo implements Serializable {

	private static final long serialVersionUID = -6741547076467044532L;
	
	@Id
	@Column(name = "cod_entid")
	private Short codEntid;
	
	@Id
	@Column(name = "fec_festi")
	private java.sql.Date fecFesti;
	
	@Column(name = "ind_tip_festi")
	private Short indTipFesti;
	
	@Column(name = "des_festi")
	private String desFesti;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fec_contr")
	private java.util.Date fecContr;

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public java.sql.Date getFecFesti() {
		return fecFesti;
	}

	public void setFecFesti(java.sql.Date fecFesti) {
		this.fecFesti = fecFesti;
	}

	public Short getIndTipFesti() {
		return indTipFesti;
	}

	public void setIndTipFesti(Short indTipFesti) {
		this.indTipFesti = indTipFesti;
	}

	public String getDesFesti() {
		return desFesti;
	}

	public void setDesFesti(String desFesti) {
		this.desFesti = desFesti;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public java.util.Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(java.util.Date fecContr) {
		this.fecContr = fecContr;
	}

	public DiaFestivo() {
		super();
	}

}
