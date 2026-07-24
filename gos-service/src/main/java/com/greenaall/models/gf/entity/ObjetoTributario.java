package com.greenaall.models.gf.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(ObjetoTributarioPK.class)
@Table(name = "gf_objeto_tributario")
public class ObjetoTributario implements Serializable {

	private static final long serialVersionUID = -3170805911606008943L;

	@Id
	@Column(name = "id_his_obj_tribu")
	private Long idHisObjTribu;

	@Id
	@Column(name = "id_obj_tribu")
	private Long idObjTribu;

	@Column(name = "des_obj_tribu")
	private String desObjTribu;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "id_his_tip_obj_tribu")
	private Long idHisTipObjTribu;

	@Column(name = "id_tip_obj_tribu")
	private Long idTipObjTribu;

	@Column(name = "num_obj_tribu")
	private Long numObjTribu;

	@Column(name = "id_his_suj_pasiv")
	private Long idHisSujPasiv;

	@Column(name = "id_suj_pasiv")
	private Long idSujPasiv;

	@Column(name = "id_his_otro")
	private Long idHisOtro;

	@Column(name = "id_otro")
	private Long idOtro;

	@Column(name = "fec_alta")
	private java.sql.Date fecAlta;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecMovim;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cod_cau_movim")
	private Short codCauMovim;

	@Column(name = "reg_activ")
	private Short regActiv;

	@Column(name = "id_his_domic")
	private Long idHisDomic;

	@Column(name = "id_domic")
	private Long idDomic;

	@Column(name = "id_his_dom_banca")
	private Long idHisDomBanca;

	@Column(name = "id_dom_banca")
	private Long idDomBanca;

	@Column(name = "ref_domic")
	private Long refDomic;

	@Column(name = "id_his_dom_notif")
	private Long idHisDomNotif;

	@Column(name = "id_dom_notif")
	private Long idDomNotif;

	@Column(name = "tar_perso")
	private Short tarPerso;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "num_bonif")
	private String numBonif;

	@Column(name = "por_bonif")
	private BigDecimal porBonif;

	@Column(name = "eje_regis")
	private Short ejeRegis;

	@Column(name = "num_regis")
	private Integer numRegis;

	@Column(name = "fec_regis")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecRegis;

	@Column(name = "ref_catas")
	private String refCatas;

	@Column(name = "ind_activ")
	private String indActiv;

	@Column(name = "cla_objet")
	private String claObjet;

	@Column(name = "id_tar_objet")
	private Long idTarObjet;

	@Column(name = "cod_provi")
	private Short codProvi;

	@Column(name = "cod_munic")
	private Short codMunic;

	@Column(name = "tip_via")
	private String tipVia;

	@Column(name = "des_via")
	private String desVia;

	@Column(name = "num_via")
	private Integer numVia;

	@Column(name = "res_direc")
	private String resDirec;

	@Column(name = "localidad")
	private String localidad;

	@Column(name = "cod_posta")
	private Integer codPosta;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdHisObjTribu() {
		return idHisObjTribu;
	}

	public void setIdHisObjTribu(Long idHisObjTribu) {
		this.idHisObjTribu = idHisObjTribu;
	}

	public Long getIdObjTribu() {
		return idObjTribu;
	}

	public void setIdObjTribu(Long idObjTribu) {
		this.idObjTribu = idObjTribu;
	}

	public String getDesObjTribu() {
		return desObjTribu;
	}

	public void setDesObjTribu(String desObjTribu) {
		this.desObjTribu = desObjTribu;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Long getIdHisTipObjTribu() {
		return idHisTipObjTribu;
	}

	public void setIdHisTipObjTribu(Long idHisTipObjTribu) {
		this.idHisTipObjTribu = idHisTipObjTribu;
	}

	public Long getIdTipObjTribu() {
		return idTipObjTribu;
	}

	public void setIdTipObjTribu(Long idTipObjTribu) {
		this.idTipObjTribu = idTipObjTribu;
	}

	public Long getNumObjTribu() {
		return numObjTribu;
	}

	public void setNumObjTribu(Long numObjTribu) {
		this.numObjTribu = numObjTribu;
	}

	public Long getIdHisSujPasiv() {
		return idHisSujPasiv;
	}

	public void setIdHisSujPasiv(Long idHisSujPasiv) {
		this.idHisSujPasiv = idHisSujPasiv;
	}

	public Long getIdSujPasiv() {
		return idSujPasiv;
	}

	public void setIdSujPasiv(Long idSujPasiv) {
		this.idSujPasiv = idSujPasiv;
	}

	public Long getIdHisOtro() {
		return idHisOtro;
	}

	public void setIdHisOtro(Long idHisOtro) {
		this.idHisOtro = idHisOtro;
	}

	public Long getIdOtro() {
		return idOtro;
	}

	public void setIdOtro(Long idOtro) {
		this.idOtro = idOtro;
	}

	public java.sql.Date getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(java.sql.Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	public java.util.Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(java.util.Date fecMovim) {
		this.fecMovim = fecMovim;
	}

	public String getCodMovim() {
		return codMovim;
	}

	public void setCodMovim(String codMovim) {
		this.codMovim = codMovim;
	}

	public Short getCodCauMovim() {
		return codCauMovim;
	}

	public void setCodCauMovim(Short codCauMovim) {
		this.codCauMovim = codCauMovim;
	}

	public Short getRegActiv() {
		return regActiv;
	}

	public void setRegActiv(Short regActiv) {
		this.regActiv = regActiv;
	}

	public Long getIdHisDomic() {
		return idHisDomic;
	}

	public void setIdHisDomic(Long idHisDomic) {
		this.idHisDomic = idHisDomic;
	}

	public Long getIdDomic() {
		return idDomic;
	}

	public void setIdDomic(Long idDomic) {
		this.idDomic = idDomic;
	}

	public Long getIdHisDomBanca() {
		return idHisDomBanca;
	}

	public void setIdHisDomBanca(Long idHisDomBanca) {
		this.idHisDomBanca = idHisDomBanca;
	}

	public Long getIdDomBanca() {
		return idDomBanca;
	}

	public void setIdDomBanca(Long idDomBanca) {
		this.idDomBanca = idDomBanca;
	}

	public Long getRefDomic() {
		return refDomic;
	}

	public void setRefDomic(Long refDomic) {
		this.refDomic = refDomic;
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

	public Short getTarPerso() {
		return tarPerso;
	}

	public void setTarPerso(Short tarPerso) {
		this.tarPerso = tarPerso;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getNumBonif() {
		return numBonif;
	}

	public void setNumBonif(String numBonif) {
		this.numBonif = numBonif;
	}

	public BigDecimal getPorBonif() {
		return porBonif;
	}

	public void setPorBonif(BigDecimal porBonif) {
		this.porBonif = porBonif;
	}

	public Short getEjeRegis() {
		return ejeRegis;
	}

	public void setEjeRegis(Short ejeRegis) {
		this.ejeRegis = ejeRegis;
	}

	public Integer getNumRegis() {
		return numRegis;
	}

	public void setNumRegis(Integer numRegis) {
		this.numRegis = numRegis;
	}

	public java.util.Date getFecRegis() {
		return fecRegis;
	}

	public void setFecRegis(java.util.Date fecRegis) {
		this.fecRegis = fecRegis;
	}

	public String getRefCatas() {
		return refCatas;
	}

	public void setRefCatas(String refCatas) {
		this.refCatas = refCatas;
	}

	public String getIndActiv() {
		return indActiv;
	}

	public void setIndActiv(String indActiv) {
		this.indActiv = indActiv;
	}

	public String getClaObjet() {
		return claObjet;
	}

	public void setClaObjet(String claObjet) {
		this.claObjet = claObjet;
	}

	public Long getIdTarObjet() {
		return idTarObjet;
	}

	public void setIdTarObjet(Long idTarObjet) {
		this.idTarObjet = idTarObjet;
	}

	public Short getCodProvi() {
		return codProvi;
	}

	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}

	public Short getCodMunic() {
		return codMunic;
	}

	public void setCodMunic(Short codMunic) {
		this.codMunic = codMunic;
	}

	public String getTipVia() {
		return tipVia;
	}

	public void setTipVia(String tipVia) {
		this.tipVia = tipVia;
	}

	public String getDesVia() {
		return desVia;
	}

	public void setDesVia(String desVia) {
		this.desVia = desVia;
	}

	public Integer getNumVia() {
		return numVia;
	}

	public void setNumVia(Integer numVia) {
		this.numVia = numVia;
	}

	public String getResDirec() {
		return resDirec;
	}

	public void setResDirec(String resDirec) {
		this.resDirec = resDirec;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(Integer codPosta) {
		this.codPosta = codPosta;
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

	public ObjetoTributario() {
		super();
	}

}
