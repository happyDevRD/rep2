package com.greenaall.models.pe.entity;

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
@IdClass(PersonaRepresentantePK.class)
@Table(name = "pe_persona_representante")
public class PersonaRepresentante implements Serializable {

	private static final long serialVersionUID = -2155450911081854104L;

	@Id
	@Column(name = "id_perso")
	private Long idPerso;
	@Id
	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Id
	@Column(name = "id_per_repre")
	private Long idPerRepre;
	
	@Id
	@Column(name = "id_his_per_repre")
	private Long idHisPerRepre;
	
	@Column(name = "fec_limit")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecLimit;

	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "tip_apodera")
	private Short tipApodera;
	
	@Column(name = "est_apodera")
	private Short estApodera;
	
	@Column(name = "fec_ini")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecIni;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getIdPerRepre() {
		return idPerRepre;
	}

	public void setIdPerRepre(Long idPerRepre) {
		this.idPerRepre = idPerRepre;
	}

	public Long getIdHisPerRepre() {
		return idHisPerRepre;
	}

	public void setIdHisPerRepre(Long idHisPerRepre) {
		this.idHisPerRepre = idHisPerRepre;
	}

	public Date getFecLimit() {
		return fecLimit;
	}

	public void setFecLimit(Date fecLimit) {
		this.fecLimit = fecLimit;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Short getTipApodera() {
		return tipApodera;
	}

	public void setTipApodera(Short tipApodera) {
		this.tipApodera = tipApodera;
	}

	public Short getEstApodera() {
		return estApodera;
	}

	public void setEstApodera(Short estApodera) {
		this.estApodera = estApodera;
	}

	public Date getFecIni() {
		return fecIni;
	}

	public void setFecIni(Date fecIni) {
		this.fecIni = fecIni;
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

	public PersonaRepresentante() {
		super();
	}

}
