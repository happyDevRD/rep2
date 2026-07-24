package com.greenaall.models.pe.entity;

public class PersonaEntidadPK implements java.io.Serializable {
	
	private static final long serialVersionUID = -2210114924887771093L;
	private Long idHisPerso;
	private Long idPerso;
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
	public PersonaEntidadPK(Long idHisPerso, Long idPerso) {
		super();
		this.idHisPerso = idHisPerso;
		this.idPerso = idPerso;
	}
	public PersonaEntidadPK() {
		super();
	}
}
