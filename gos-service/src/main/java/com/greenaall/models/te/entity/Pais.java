package com.greenaall.models.te.entity;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "te_pais")
public class Pais implements Serializable{

	private static final long serialVersionUID = 8518576684998152453L;

	@Id
	@Column(name = "cod_pais")
	private Short codPais;
	
	@Column(name = "des_pais")
	private String desPais;
	
	@Column(name = "sig_larga")
	private String sigLarga;
	
	@Column(name = "sig_corta")
	private String sigCorta;
	
	@Column(name = "uni_europ")
	private Short uniEurop;
	
	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Short getCodPais() {
		return codPais;
	}

	public void setCodPais(Short codPais) {
		this.codPais = codPais;
	}

	public String getDesPais() {
		return desPais;
	}

	public void setDesPais(String desPais) {
		this.desPais = desPais;
	}

	public String getSigLarga() {
		return sigLarga;
	}

	public void setSigLarga(String sigLarga) {
		this.sigLarga = sigLarga;
	}

	public String getSigCorta() {
		return sigCorta;
	}

	public void setSigCorta(String sigCorta) {
		this.sigCorta = sigCorta;
	}

	public Short getUniEurop() {
		return uniEurop;
	}

	public void setUniEurop(Short uniEurop) {
		this.uniEurop = uniEurop;
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

	public Pais() {
		super();
	}
	
	
}
