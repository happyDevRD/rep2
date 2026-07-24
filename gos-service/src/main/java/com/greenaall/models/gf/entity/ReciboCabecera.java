package com.greenaall.models.gf.entity;

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
@Table(name = "gf_recibo_cabecera")
@IdClass(ReciboCabeceraPK.class)
public class ReciboCabecera implements Serializable{

	private static final long serialVersionUID = 7889895113225732459L;

	@Id
	@Column(name = "id_his_recib")
	private Long idHisRecib;

	@Id
	@Column(name = "id_recib")
	private Long idRecib;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "mod_perte")
	private Short modPerte;

	@Column(name = "nom_padro")
	private String nomPadro;

	@Column(name = "eje_recib")
	private Short ejeRecib;

	@Column(name = "num_recib")
	private Integer numRecib;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecMovim;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cod_cau_movim")
	private Short codCauMovim;

	@Column(name = "reg_activ")
	private Short regActiv;

	@Column(name = "tip_exacc")
	private Short tipExacc;

	@Column(name = "id_impue")
	private Long idImpue;

	@Column(name = "per_impos")
	private String perImpos;

	@Column(name = "id_his_obj_tribu")
	private Long idHisObjTribu;

	@Column(name = "id_obj_tribu")
	private Long idObjTribu;

	@Column(name = "eje_cargo")
	private java.sql.Date ejeCargo;

	@Column(name = "num_cargo")
	private Integer numCargo;

	@Column(name = "tip_cargo")
	private Short tipCargo;

	@Column(name = "eje_car_ejecu")
	private java.sql.Date ejeCarEjecu;

	@Column(name = "num_car_ejecu")
	private Integer numCarEjecu;

	@Column(name = "tip_car_ejecu")
	private Short tipCarEjecu;

	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Column(name = "id_perso")
	private Long idPerso;

	@Column(name = "mar_notif")
	private Short marNotif;

	@Column(name = "fec_recib")
	private java.sql.Date fecRecib;

	@Column(name = "fec_limit")
	private java.sql.Date fecLimit;

	@Column(name = "fec_data")
	private java.sql.Date fecData;

	@Column(name = "fec_aprem")
	private java.sql.Date fecAprem;

	@Column(name = "fec_anula")
	private java.sql.Date fecAnula;

	@Column(name = "fec_notif")
	private java.sql.Date fecNotif;

	@Column(name = "fec_notif_volun")
	private java.sql.Date fecNotifVolun;

	@Column(name = "fec_cobro")
	private java.sql.Date fecCobro;

	@Column(name = "fec_aplic")
	private java.sql.Date fecAplic;

	@Column(name = "fec_presc")
	private java.sql.Date fecPresc;

	@Column(name = "fec_limit_eje")
	private java.sql.Date fecLimitEje;

	@Column(name = "imp_princ")
	private java.math.BigDecimal impPrinc;

	@Column(name = "imp_recar")
	private java.math.BigDecimal impRecar;

	@Column(name = "imp_inter")
	private java.math.BigDecimal impInter;

	@Column(name = "imp_costa")
	private java.math.BigDecimal impCosta;

	@Column(name = "imp_otros")
	private java.math.BigDecimal impOtros;

	@Column(name = "imp_recib")
	private java.math.BigDecimal impRecib;

	@Column(name = "imp_cobro")
	private java.math.BigDecimal impCobro;

	@Column(name = "imp_fracc")
	private java.math.BigDecimal impFracc;

	@Column(name = "est_recib")
	private Short estRecib;

	@Column(name = "eje_conta")
	private Short ejeConta;

	@Column(name = "id_org_gesti")
	private Long idOrgGesti;

	@Column(name = "id_org_cobro")
	private Long idOrgCobro;

	@Column(name = "id_his_dom_banca")
	private Long idHisDomBanca;

	@Column(name = "id_dom_banca")
	private Long idDomBanca;

	@Column(name = "ref_domic")
	private Integer refDomic;

	@Column(name = "num_remes")
	private Short numRemes;

	@Column(name = "num_remes_pad")
	private Short numRemesPad;

	@Column(name = "tip_cobro")
	private Short tipCobro;

	@Column(name = "impreso")
	private Short impreso;

	@Column(name = "num_rec_real")
	private Integer numRecReal;

	@Column(name = "eje_exped")
	private java.sql.Date ejeExped;

	@Column(name = "num_exped")
	private String numExped;

	@Column(name = "observacion")
	private String observacion;

	@Column(name = "imp_pendi")
	private java.math.BigDecimal impPendi;

	@Column(name = "por_bonif")
	private java.math.BigDecimal porBonif;

	@Column(name = "eje_pase_recau")
	private Short ejePaseRecau;

	@Column(name = "num_pase_recau")
	private Integer numPaseRecau;

	@Column(name = "id_his_fracc")
	private Long idHisFracc;

	@Column(name = "id_fracc")
	private Long idFracc;

	@Column(name = "num_fijo")
	private Long numFijo;

	@Column(name = "id_obj_tarif")
	private Long idObjTarif;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

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

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getModPerte() {
		return modPerte;
	}

	public void setModPerte(Short modPerte) {
		this.modPerte = modPerte;
	}

	public String getNomPadro() {
		return nomPadro;
	}

	public void setNomPadro(String nomPadro) {
		this.nomPadro = nomPadro;
	}

	public Short getEjeRecib() {
		return ejeRecib;
	}

	public void setEjeRecib(Short ejeRecib) {
		this.ejeRecib = ejeRecib;
	}

	public Integer getNumRecib() {
		return numRecib;
	}

	public void setNumRecib(Integer numRecib) {
		this.numRecib = numRecib;
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

	public Short getTipExacc() {
		return tipExacc;
	}

	public void setTipExacc(Short tipExacc) {
		this.tipExacc = tipExacc;
	}

	public Long getIdImpue() {
		return idImpue;
	}

	public void setIdImpue(Long idImpue) {
		this.idImpue = idImpue;
	}

	public String getPerImpos() {
		return perImpos;
	}

	public void setPerImpos(String perImpos) {
		this.perImpos = perImpos;
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

	public java.sql.Date getEjeCargo() {
		return ejeCargo;
	}

	public void setEjeCargo(java.sql.Date ejeCargo) {
		this.ejeCargo = ejeCargo;
	}

	public Integer getNumCargo() {
		return numCargo;
	}

	public void setNumCargo(Integer numCargo) {
		this.numCargo = numCargo;
	}

	public Short getTipCargo() {
		return tipCargo;
	}

	public void setTipCargo(Short tipCargo) {
		this.tipCargo = tipCargo;
	}

	public java.sql.Date getEjeCarEjecu() {
		return ejeCarEjecu;
	}

	public void setEjeCarEjecu(java.sql.Date ejeCarEjecu) {
		this.ejeCarEjecu = ejeCarEjecu;
	}

	public Integer getNumCarEjecu() {
		return numCarEjecu;
	}

	public void setNumCarEjecu(Integer numCarEjecu) {
		this.numCarEjecu = numCarEjecu;
	}

	public Short getTipCarEjecu() {
		return tipCarEjecu;
	}

	public void setTipCarEjecu(Short tipCarEjecu) {
		this.tipCarEjecu = tipCarEjecu;
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

	public Short getMarNotif() {
		return marNotif;
	}

	public void setMarNotif(Short marNotif) {
		this.marNotif = marNotif;
	}

	public java.sql.Date getFecRecib() {
		return fecRecib;
	}

	public void setFecRecib(java.sql.Date fecRecib) {
		this.fecRecib = fecRecib;
	}

	public java.sql.Date getFecLimit() {
		return fecLimit;
	}

	public void setFecLimit(java.sql.Date fecLimit) {
		this.fecLimit = fecLimit;
	}

	public java.sql.Date getFecData() {
		return fecData;
	}

	public void setFecData(java.sql.Date fecData) {
		this.fecData = fecData;
	}

	public java.sql.Date getFecAprem() {
		return fecAprem;
	}

	public void setFecAprem(java.sql.Date fecAprem) {
		this.fecAprem = fecAprem;
	}

	public java.sql.Date getFecAnula() {
		return fecAnula;
	}

	public void setFecAnula(java.sql.Date fecAnula) {
		this.fecAnula = fecAnula;
	}

	public java.sql.Date getFecNotif() {
		return fecNotif;
	}

	public void setFecNotif(java.sql.Date fecNotif) {
		this.fecNotif = fecNotif;
	}

	public java.sql.Date getFecNotifVolun() {
		return fecNotifVolun;
	}

	public void setFecNotifVolun(java.sql.Date fecNotifVolun) {
		this.fecNotifVolun = fecNotifVolun;
	}

	public java.sql.Date getFecCobro() {
		return fecCobro;
	}

	public void setFecCobro(java.sql.Date fecCobro) {
		this.fecCobro = fecCobro;
	}

	public java.sql.Date getFecAplic() {
		return fecAplic;
	}

	public void setFecAplic(java.sql.Date fecAplic) {
		this.fecAplic = fecAplic;
	}

	public java.sql.Date getFecPresc() {
		return fecPresc;
	}

	public void setFecPresc(java.sql.Date fecPresc) {
		this.fecPresc = fecPresc;
	}

	public java.sql.Date getFecLimitEje() {
		return fecLimitEje;
	}

	public void setFecLimitEje(java.sql.Date fecLimitEje) {
		this.fecLimitEje = fecLimitEje;
	}

	public java.math.BigDecimal getImpPrinc() {
		return impPrinc;
	}

	public void setImpPrinc(java.math.BigDecimal impPrinc) {
		this.impPrinc = impPrinc;
	}

	public java.math.BigDecimal getImpRecar() {
		return impRecar;
	}

	public void setImpRecar(java.math.BigDecimal impRecar) {
		this.impRecar = impRecar;
	}

	public java.math.BigDecimal getImpInter() {
		return impInter;
	}

	public void setImpInter(java.math.BigDecimal impInter) {
		this.impInter = impInter;
	}

	public java.math.BigDecimal getImpCosta() {
		return impCosta;
	}

	public void setImpCosta(java.math.BigDecimal impCosta) {
		this.impCosta = impCosta;
	}

	public java.math.BigDecimal getImpOtros() {
		return impOtros;
	}

	public void setImpOtros(java.math.BigDecimal impOtros) {
		this.impOtros = impOtros;
	}

	public java.math.BigDecimal getImpRecib() {
		return impRecib;
	}

	public void setImpRecib(java.math.BigDecimal impRecib) {
		this.impRecib = impRecib;
	}

	public java.math.BigDecimal getImpCobro() {
		return impCobro;
	}

	public void setImpCobro(java.math.BigDecimal impCobro) {
		this.impCobro = impCobro;
	}

	public java.math.BigDecimal getImpFracc() {
		return impFracc;
	}

	public void setImpFracc(java.math.BigDecimal impFracc) {
		this.impFracc = impFracc;
	}

	public Short getEstRecib() {
		return estRecib;
	}

	public void setEstRecib(Short estRecib) {
		this.estRecib = estRecib;
	}

	public Short getEjeConta() {
		return ejeConta;
	}

	public void setEjeConta(Short ejeConta) {
		this.ejeConta = ejeConta;
	}

	public Long getIdOrgGesti() {
		return idOrgGesti;
	}

	public void setIdOrgGesti(Long idOrgGesti) {
		this.idOrgGesti = idOrgGesti;
	}

	public Long getIdOrgCobro() {
		return idOrgCobro;
	}

	public void setIdOrgCobro(Long idOrgCobro) {
		this.idOrgCobro = idOrgCobro;
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

	public Integer getRefDomic() {
		return refDomic;
	}

	public void setRefDomic(Integer refDomic) {
		this.refDomic = refDomic;
	}

	public Short getNumRemes() {
		return numRemes;
	}

	public void setNumRemes(Short numRemes) {
		this.numRemes = numRemes;
	}

	public Short getNumRemesPad() {
		return numRemesPad;
	}

	public void setNumRemesPad(Short numRemesPad) {
		this.numRemesPad = numRemesPad;
	}

	public Short getTipCobro() {
		return tipCobro;
	}

	public void setTipCobro(Short tipCobro) {
		this.tipCobro = tipCobro;
	}

	public Short getImpreso() {
		return impreso;
	}

	public void setImpreso(Short impreso) {
		this.impreso = impreso;
	}

	public Integer getNumRecReal() {
		return numRecReal;
	}

	public void setNumRecReal(Integer numRecReal) {
		this.numRecReal = numRecReal;
	}

	public java.sql.Date getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(java.sql.Date ejeExped) {
		this.ejeExped = ejeExped;
	}

	public String getNumExped() {
		return numExped;
	}

	public void setNumExped(String numExped) {
		this.numExped = numExped;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public java.math.BigDecimal getImpPendi() {
		return impPendi;
	}

	public void setImpPendi(java.math.BigDecimal impPendi) {
		this.impPendi = impPendi;
	}

	public java.math.BigDecimal getPorBonif() {
		return porBonif;
	}

	public void setPorBonif(java.math.BigDecimal porBonif) {
		this.porBonif = porBonif;
	}

	public Short getEjePaseRecau() {
		return ejePaseRecau;
	}

	public void setEjePaseRecau(Short ejePaseRecau) {
		this.ejePaseRecau = ejePaseRecau;
	}

	public Integer getNumPaseRecau() {
		return numPaseRecau;
	}

	public void setNumPaseRecau(Integer numPaseRecau) {
		this.numPaseRecau = numPaseRecau;
	}

	public Long getIdHisFracc() {
		return idHisFracc;
	}

	public void setIdHisFracc(Long idHisFracc) {
		this.idHisFracc = idHisFracc;
	}

	public Long getIdFracc() {
		return idFracc;
	}

	public void setIdFracc(Long idFracc) {
		this.idFracc = idFracc;
	}

	public Long getNumFijo() {
		return numFijo;
	}

	public void setNumFijo(Long numFijo) {
		this.numFijo = numFijo;
	}

	public Long getIdObjTarif() {
		return idObjTarif;
	}

	public void setIdObjTarif(Long idObjTarif) {
		this.idObjTarif = idObjTarif;
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

	public ReciboCabecera() {
		super();
	}

}
