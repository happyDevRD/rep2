package com.greenaall.models.ex.dto;

import java.io.Serializable;

import com.greenaall.pe.dto.PersonaEntidadDto;

public class InteresadoDto implements Serializable {

	private static final long serialVersionUID = -6245726900282556677L;
	private Long id;
	private Long idHisPerso;
	private Long idPerso;
	private PersonaEntidadDto perEntid;
	private Long idHisRepre;
	private Long idRepre;
	private Long expediente;
	private Short ejeExped;
	private Integer numExped;
	private short principal;
	private short tipForNotif;
	private String forNotif;
	private String emailNotif;
	private Long idHisDomNotif;
	private Long idDomNotif;
	private String nomInter;
	private String nomRepre;
	private String dirInter;
	private String dirRepre;
	private String numDocumInter;
	private String numDocumRepre;
	private String desProviInter;
	private String desMunicInter;
	private String desProviRepre;
	private String desMunicRepre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public PersonaEntidadDto getPerEntid() {
		return perEntid;
	}
	public void setPerEntid(PersonaEntidadDto perEntid) {
		this.perEntid = perEntid;
	}
	public Long getIdHisRepre() {
		return idHisRepre;
	}
	public void setIdHisRepre(Long idHisRepre) {
		this.idHisRepre = idHisRepre;
	}
	public Long getIdRepre() {
		return idRepre;
	}
	public void setIdRepre(Long idRepre) {
		this.idRepre = idRepre;
	}
	public Long getExpediente() {
		return expediente;
	}
	public void setExpediente(Long expediente) {
		this.expediente = expediente;
	}
	public short getPrincipal() {
		return principal;
	}
	public void setPrincipal(short principal) {
		this.principal = principal;
	}
	public short getTipForNotif() {
		return tipForNotif;
	}
	public void setTipForNotif(short tipForNotif) {
		this.tipForNotif = tipForNotif;
	}
	public String getForNotif() {
		return forNotif;
	}
	public void setForNotif(String forNotif) {
		this.forNotif = forNotif;
	}
	public String getEmailNotif() {
		return emailNotif;
	}
	public void setEmailNotif(String emailNotif) {
		this.emailNotif = emailNotif;
	}
	public Long getIdHisDomNotif() {
		return idHisDomNotif;
	}
	public void setIdHisDomNotif(Long idHisDomNotif) {
		this.idHisDomNotif = idHisDomNotif;
	}
	public Long getIdDomNotif() {
		return idDomNotif;
	}
	public void setIdDomNotif(Long idDomNotif) {
		this.idDomNotif = idDomNotif;
	}
	public Short getEjeExped() {
		return ejeExped;
	}
	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}
	public Integer getNumExped() {
		return numExped;
	}
	public void setNumExped(Integer numExped) {
		this.numExped = numExped;
	}
	public String getNomInter() {
		return nomInter;
	}
	public void setNomInter(String nomInter) {
		this.nomInter = nomInter;
	}
	public String getNomRepre() {
		return nomRepre;
	}
	public void setNomRepre(String nomRepre) {
		this.nomRepre = nomRepre;
	}
	public String getDirInter() {
		return dirInter;
	}
	public void setDirInter(String dirInter) {
		this.dirInter = dirInter;
	}
	
	public String getDirRepre() {
		return dirRepre;
	}
	public void setDirRepre(String dirRepre) {
		this.dirRepre = dirRepre;
	}
	public String getNumDocumInter() {
		return numDocumInter;
	}
	public void setNumDocumInter(String numDocumInter) {
		this.numDocumInter = numDocumInter;
	}
	public String getNumDocumRepre() {
		return numDocumRepre;
	}
	public void setNumDocumRepre(String numDocumRepre) {
		this.numDocumRepre = numDocumRepre;
	}
	public String getDesProviInter() {
		return desProviInter;
	}
	public void setDesProviInter(String desProviInter) {
		this.desProviInter = desProviInter;
	}
	public String getDesMunicInter() {
		return desMunicInter;
	}
	public void setDesMunicInter(String desMunicInter) {
		this.desMunicInter = desMunicInter;
	}
	public String getDesProviRepre() {
		return desProviRepre;
	}
	public void setDesProviRepre(String desProviRepre) {
		this.desProviRepre = desProviRepre;
	}
	public String getDesMunicRepre() {
		return desMunicRepre;
	}
	public void setDesMunicRepre(String desMunicRepre) {
		this.desMunicRepre = desMunicRepre;
	}
	
	

}
