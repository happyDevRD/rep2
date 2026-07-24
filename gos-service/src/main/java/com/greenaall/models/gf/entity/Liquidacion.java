package com.greenaall.models.gf.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_liquidacion")
public class Liquidacion implements Serializable {

	private static final long serialVersionUID = 7711517875265317940L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_liqui")
	private Long idLiqui;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "eje_liqui")
	private Short ejeLiqui;

	@Column(name = "num_liqui")
	private String numLiqui;

	@Column(name = "fec_liqui")
	private java.sql.Date fecLiqui;

	@Column(name = "tip_liqui")
	private Short tipLiqui;

	@Column(name = "mod_perte")
	private Short modPerte;

	@Column(name = "id_impue")
	private Long idImpue;

	@Column(name = "mot_liqui")
	private Short motLiqui;

	@Column(name = "cod_org_aprob")
	private Short codOrgAprob;

	@Column(name = "id_notif")
	private Long idNotif;

	@Column(name = "id_exped")
	private Long idExped;

	@Column(name = "eje_exped")
	private Short ejeExped;

	@Column(name = "num_exped")
	private String numExped;

	@Column(name = "id_his_recib")
	private Long idHisRecib;

	@Column(name = "id_recib")
	private Long idRecib;

	@Column(name = "id_autol")
	private Long idAutol;

	@Column(name = "num_bonif")
	private String numBonif;

	@Column(name = "por_bonif")
	private java.math.BigDecimal porBonif;

	@Column(name = "fec_bonif")
	private java.sql.Date fecBonif;

	@Column(name = "org_bonif")
	private String orgBonif;

	@Column(name = "fun_bonif")
	private String funBonif;

	@Column(name = "id_his_obj_tribu")
	private Long idHisObjTribu;

	@Column(name = "id_obj_tribu")
	private Long idObjTribu;

	@Column(name = "id_his_propi")
	private Long idHisPropi;

	@Column(name = "id_propi")
	private Long idPropi;

	@Column(name = "id_his_rep_propi")
	private Long idHisRepPropi;

	@Column(name = "id_rep_propi")
	private Long idRepPropi;

	@Column(name = "raz_rep_propi")
	private String razRepPropi;

	@Column(name = "cuo_autol")
	private java.math.BigDecimal cuoAutol;

	@Column(name = "imp_bon_autol")
	private java.math.BigDecimal impBonAutol;

	@Column(name = "cuo_liqui")
	private java.math.BigDecimal cuoLiqui;

	@Column(name = "imp_bon_liqui")
	private java.math.BigDecimal impBonLiqui;

	@Column(name = "imp_sanci")
	private java.math.BigDecimal impSanci;

	@Column(name = "des_sanci")
	private String desSanci;

	@Column(name = "imp_vario")
	private java.math.BigDecimal impVario;

	@Column(name = "des_vario")
	private String desVario;

	@Column(name = "int_demor")
	private java.math.BigDecimal intDemor;

	@Column(name = "des_int_demor")
	private String desIntDemor;

	@Column(name = "tot_liqui")
	private java.math.BigDecimal totLiqui;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Liquidacion() {
		super();
	}

	public Long getIdLiqui() {
		return idLiqui;
	}

	public void setIdLiqui(Long idLiqui) {
		this.idLiqui = idLiqui;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getEjeLiqui() {
		return ejeLiqui;
	}

	public void setEjeLiqui(Short ejeLiqui) {
		this.ejeLiqui = ejeLiqui;
	}

	public String getNumLiqui() {
		return numLiqui;
	}

	public void setNumLiqui(String numLiqui) {
		this.numLiqui = numLiqui;
	}

	public java.sql.Date getFecLiqui() {
		return fecLiqui;
	}

	public void setFecLiqui(java.sql.Date fecLiqui) {
		this.fecLiqui = fecLiqui;
	}

	public Short getTipLiqui() {
		return tipLiqui;
	}

	public void setTipLiqui(Short tipLiqui) {
		this.tipLiqui = tipLiqui;
	}

	public Short getModPerte() {
		return modPerte;
	}

	public void setModPerte(Short modPerte) {
		this.modPerte = modPerte;
	}

	public Long getIdImpue() {
		return idImpue;
	}

	public void setIdImpue(Long idImpue) {
		this.idImpue = idImpue;
	}

	public Short getMotLiqui() {
		return motLiqui;
	}

	public void setMotLiqui(Short motLiqui) {
		this.motLiqui = motLiqui;
	}

	public Short getCodOrgAprob() {
		return codOrgAprob;
	}

	public void setCodOrgAprob(Short codOrgAprob) {
		this.codOrgAprob = codOrgAprob;
	}

	public Long getIdNotif() {
		return idNotif;
	}

	public void setIdNotif(Long idNotif) {
		this.idNotif = idNotif;
	}

	public Long getIdExped() {
		return idExped;
	}

	public void setIdExped(Long idExped) {
		this.idExped = idExped;
	}

	public Short getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}

	public String getNumExped() {
		return numExped;
	}

	public void setNumExped(String numExped) {
		this.numExped = numExped;
	}

	public Long getIdHisRecib() {
		return idHisRecib;
	}

	public void setIdHisRecib(Long idHisRecib) {
		this.idHisRecib = idHisRecib;
	}

	public Long getIdRecib() {
		return idRecib;
	}

	public void setIdRecib(Long idRecib) {
		this.idRecib = idRecib;
	}

	public Long getIdAutol() {
		return idAutol;
	}

	public void setIdAutol(Long idAutol) {
		this.idAutol = idAutol;
	}

	public String getNumBonif() {
		return numBonif;
	}

	public void setNumBonif(String numBonif) {
		this.numBonif = numBonif;
	}

	public java.math.BigDecimal getPorBonif() {
		return porBonif;
	}

	public void setPorBonif(java.math.BigDecimal porBonif) {
		this.porBonif = porBonif;
	}

	public java.sql.Date getFecBonif() {
		return fecBonif;
	}

	public void setFecBonif(java.sql.Date fecBonif) {
		this.fecBonif = fecBonif;
	}

	public String getOrgBonif() {
		return orgBonif;
	}

	public void setOrgBonif(String orgBonif) {
		this.orgBonif = orgBonif;
	}

	public String getFunBonif() {
		return funBonif;
	}

	public void setFunBonif(String funBonif) {
		this.funBonif = funBonif;
	}

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

	public Long getIdHisPropi() {
		return idHisPropi;
	}

	public void setIdHisPropi(Long idHisPropi) {
		this.idHisPropi = idHisPropi;
	}

	public Long getIdPropi() {
		return idPropi;
	}

	public void setIdPropi(Long idPropi) {
		this.idPropi = idPropi;
	}

	public Long getIdHisRepPropi() {
		return idHisRepPropi;
	}

	public void setIdHisRepPropi(Long idHisRepPropi) {
		this.idHisRepPropi = idHisRepPropi;
	}

	public Long getIdRepPropi() {
		return idRepPropi;
	}

	public void setIdRepPropi(Long idRepPropi) {
		this.idRepPropi = idRepPropi;
	}

	public String getRazRepPropi() {
		return razRepPropi;
	}

	public void setRazRepPropi(String razRepPropi) {
		this.razRepPropi = razRepPropi;
	}

	public java.math.BigDecimal getCuoAutol() {
		return cuoAutol;
	}

	public void setCuoAutol(java.math.BigDecimal cuoAutol) {
		this.cuoAutol = cuoAutol;
	}

	public java.math.BigDecimal getImpBonAutol() {
		return impBonAutol;
	}

	public void setImpBonAutol(java.math.BigDecimal impBonAutol) {
		this.impBonAutol = impBonAutol;
	}

	public java.math.BigDecimal getCuoLiqui() {
		return cuoLiqui;
	}

	public void setCuoLiqui(java.math.BigDecimal cuoLiqui) {
		this.cuoLiqui = cuoLiqui;
	}

	public java.math.BigDecimal getImpBonLiqui() {
		return impBonLiqui;
	}

	public void setImpBonLiqui(java.math.BigDecimal impBonLiqui) {
		this.impBonLiqui = impBonLiqui;
	}

	public java.math.BigDecimal getImpSanci() {
		return impSanci;
	}

	public void setImpSanci(java.math.BigDecimal impSanci) {
		this.impSanci = impSanci;
	}

	public String getDesSanci() {
		return desSanci;
	}

	public void setDesSanci(String desSanci) {
		this.desSanci = desSanci;
	}

	public java.math.BigDecimal getImpVario() {
		return impVario;
	}

	public void setImpVario(java.math.BigDecimal impVario) {
		this.impVario = impVario;
	}

	public String getDesVario() {
		return desVario;
	}

	public void setDesVario(String desVario) {
		this.desVario = desVario;
	}

	public java.math.BigDecimal getIntDemor() {
		return intDemor;
	}

	public void setIntDemor(java.math.BigDecimal intDemor) {
		this.intDemor = intDemor;
	}

	public String getDesIntDemor() {
		return desIntDemor;
	}

	public void setDesIntDemor(String desIntDemor) {
		this.desIntDemor = desIntDemor;
	}

	public java.math.BigDecimal getTotLiqui() {
		return totLiqui;
	}

	public void setTotLiqui(java.math.BigDecimal totLiqui) {
		this.totLiqui = totLiqui;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
	};

}
