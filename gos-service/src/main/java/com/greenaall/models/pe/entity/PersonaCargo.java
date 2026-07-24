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
@IdClass(PersonaCargoPK.class)
@Table(name = "pe_persona_cargo")
public class PersonaCargo implements Serializable {
	

	private static final long serialVersionUID = 6775029700314709107L;
	
	@Id
	@Column(name = "id_his_perso")
	private Long idHisPerso;
	
	@Id
	@Column(name = "id_perso")
	private Long idPerso;
	
	@Id
	@Column(name = "tip_cargo")
	private Short tipCargo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "usu_contr")
    private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public Short getTipCargo() {
		return tipCargo;
	}

	public void setTipCargo(Short tipCargo) {
		this.tipCargo = tipCargo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public PersonaCargo() {
		super();
	}

}
