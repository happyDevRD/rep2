package com.greenaall.models.se.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(SeBolsaIntePK.class)
@Table(name = "se_bolsa_inte")
public class SeBolsaInte implements Serializable{

	private static final long serialVersionUID = 5318494921771160716L;

	@Id
	@Column(name = "id_his_bolsa")
	private long idHisBolsa;

	@Id
	@Column(name = "id_his_inter")
	private long idHisInter;

	@Id
	@Column(name = "id_inter")
	private long idInter;

    @Column(name = "usu_contr")
    private String usuContr;

    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

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

	public SeBolsaInte() {
		super();
	}
}
