package com.greenaall.models.pe.entity;

import java.io.Serializable;

public class PersonaRepresentantePK implements Serializable {

	private static final long serialVersionUID = -4977739179500083125L;

	private Long idHisPerso;
	private Long idPerso;
	private Long idHisPerRepre;
	private Long idPerRepre;

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

	public Long getIdHisPerRepre() {
		return idHisPerRepre;
	}

	public void setIdHisPerRepre(Long idHisPerRepre) {
		this.idHisPerRepre = idHisPerRepre;
	}

	public Long getIdPerRepre() {
		return idPerRepre;
	}

	public void setIdPerRepre(Long idPerRepre) {
		this.idPerRepre = idPerRepre;
	}

	public PersonaRepresentantePK() {
		super();
	}

}
