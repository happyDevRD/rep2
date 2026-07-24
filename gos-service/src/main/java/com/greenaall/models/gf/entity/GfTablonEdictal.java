package com.greenaall.models.gf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_tablon_edictal")
public class GfTablonEdictal implements Serializable{

	private static final long serialVersionUID = -5862919372566752146L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_eteu")
	private Long idEteu;
	
	@Column(name = "cod_entid")
	private Short codEntid;
	
	@Column(name = "expedicion")
	private Integer expedicion;
	
	@Column(name = "fec_gener")
    @Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecGener;
	
	@Column(name = "fec_solic")
    @Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecSolic;
	
	@Column(name = "fec_firma")
    @Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecFirma;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "cod_dir3")
	private String codDir3;
	
	@Column(name = "des_dir3")
	private String desDir3;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "for_publi")
	private Short forPubli;
	
	@Column(name = "dat_perso")
	private Boolean datPerso;
	
	@Column(name = "inc_lgt")
	private Boolean incLgt;
	
	@Column(name = "tex_plura")
	private Boolean texPlura;
	
	@Column(name = "ind_mater")
	private Short indMater;
	
	@Column(name = "procedimiento")
	private String procedimiento;
	
	@Column(name = "id_model")
	private Long idModel;
	
	@Column(name = "num_boe")
	private Integer numBoe;
	
	@Column(name = "fec_public")
    @Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecPublic;
	
	@Column(name = "pob_firma")
	private String pobFirma;
	
	@Column(name = "firmante")
	private String firmante;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
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

	public void setFecPublic(java.util.Date fecPublic) {
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

	public GfTablonEdictal() {
	}
	
}
