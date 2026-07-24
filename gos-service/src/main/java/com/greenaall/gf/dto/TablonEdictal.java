package com.greenaall.gf.dto;

import java.io.Serializable;

public class TablonEdictal implements Serializable {

	private static final long serialVersionUID = -3403385025351417948L;
	private Long idEteu;
	private Short codEntid;
	private Integer expedicion;
	private java.util.Date fecGener;
	private java.util.Date fecSolic;
	private java.util.Date fecFirma;
	private String descripcion;
	private String codDir3;
	private String desDir3;
	private String url;
	private String email;
	private Short forPubli;
	private Boolean datPerso;
	private Boolean incLgt;
	private Boolean texPlura;
	private Short indMater;
	private String procedimiento;
	private Long idModel;
	private Integer numBoe;
	private java.util.Date fecPublic;
	private String pobFirma;
	private String firmante;
	private String usuContr;
	private java.util.Date fecContr;

	public Long getIdEteu() {
		return idEteu;
	}

	public void setIdEteu(Long idEteu) {
		this.idEteu = idEteu;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Integer getExpedicion() {
		return expedicion;
	}

	public void setExpedicion(Integer expedicion) {
		this.expedicion = expedicion;
	}

	public java.util.Date getFecGener() {
		return fecGener;
	}

	public void setFecGener(java.util.Date fecGener) {
		this.fecGener = fecGener;
	}

	public java.util.Date getFecSolic() {
		return fecSolic;
	}

	public void setFecSolic(java.util.Date fecSolic) {
		this.fecSolic = fecSolic;
	}

	public java.util.Date getFecFirma() {
		return fecFirma;
	}

	public void setFecFirma(java.util.Date fecFirma) {
		this.fecFirma = fecFirma;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodDir3() {
		return codDir3;
	}

	public void setCodDir3(String codDir3) {
		this.codDir3 = codDir3;
	}

	public String getDesDir3() {
		return desDir3;
	}

	public void setDesDir3(String desDir3) {
		this.desDir3 = desDir3;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getForPubli() {
		return forPubli;
	}

	public void setForPubli(Short forPubli) {
		this.forPubli = forPubli;
	}

	public Boolean getDatPerso() {
		return datPerso;
	}

	public void setDatPerso(Boolean datPerso) {
		this.datPerso = datPerso;
	}

	public Boolean getIncLgt() {
		return incLgt;
	}

	public void setIncLgt(Boolean incLgt) {
		this.incLgt = incLgt;
	}

	public Boolean getTexPlura() {
		return texPlura;
	}

	public void setTexPlura(Boolean texPlura) {
		this.texPlura = texPlura;
	}

	public Short getIndMater() {
		return indMater;
	}

	public void setIndMater(Short indMater) {
		this.indMater = indMater;
	}

	public String getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}

	public Long getIdModel() {
		return idModel;
	}

	public void setIdModel(Long idModel) {
		this.idModel = idModel;
	}

	public Integer getNumBoe() {
		return numBoe;
	}

	public void setNumBoe(Integer numBoe) {
		this.numBoe = numBoe;
	}

	public java.util.Date getFecPublic() {
		return fecPublic;
	}

	public void setFecPublic(java.sql.Date fecPublic) {
		this.fecPublic = fecPublic;
	}

	public String getPobFirma() {
		return pobFirma;
	}

	public void setPobFirma(String pobFirma) {
		this.pobFirma = pobFirma;
	}

	public String getFirmante() {
		return firmante;
	}

	public void setFirmante(String firmante) {
		this.firmante = firmante;
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

}
