package com.greenaall.models.pe.entity;

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
@IdClass(DomiciliacionBancariaPK.class)
@Table(name = "pe_domiciliacion_bancaria")
public class DomiciliacionBancaria implements Serializable {

	private static final long serialVersionUID = 741074051052290364L;

	@Id
	@Column(name = "id_his_dom_banca")
	private Long idHisDomBanca;

	@Id
	@Column(name = "id_dom_banca")
	private Long idDomBanca;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMovim;

	@Column(name = "reg_activ")
	private Short regActiv;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cau_movim")
	private Short cauMovim;

	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Column(name = "id_perso")
	private Long idPerso;

	@Column(name = "tip_cuent")
	private Short tipCuent;

	@Column(name = "des_dom_banca")
	private String desDomBanca;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "cod_sucur")
	private Short codSucur;

	@Column(name = "dig_contr")
	private Short digContr;

	@Column(name = "cod_cuent")
	private BigDecimal codCuent;

	@Column(name = "iban")
	private String iban;

	@Column(name = "bic")
	private String bic;

	@Column(name = "id_his_titul")
	private Long idHisTitul;

	@Column(name = "id_titul")
	private Long idTitul;

	@Column(name = "cod_exclu")
	private Short codExclu;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "ref_domic")
	private Long refDomic;

	@Column(name = "eje_orden")
	private Integer ejeOrden;

	@Column(name = "num_orden")
	private Integer numOrden;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

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

	public Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(Date fecMovim) {
		this.fecMovim = fecMovim;
	}

	public Short getRegActiv() {
		return regActiv;
	}

	public void setRegActiv(Short regActiv) {
		this.regActiv = regActiv;
	}

	public String getCodMovim() {
		return codMovim;
	}

	public void setCodMovim(String codMovim) {
		this.codMovim = codMovim;
	}

	public Short getCauMovim() {
		return cauMovim;
	}

	public void setCauMovim(Short cauMovim) {
		this.cauMovim = cauMovim;
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

	public Short getTipCuent() {
		return tipCuent;
	}

	public void setTipCuent(Short tipCuent) {
		this.tipCuent = tipCuent;
	}

	public String getDesDomBanca() {
		return desDomBanca;
	}

	public void setDesDomBanca(String desDomBanca) {
		this.desDomBanca = desDomBanca;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getCodSucur() {
		return codSucur;
	}

	public void setCodSucur(Short codSucur) {
		this.codSucur = codSucur;
	}

	public Short getDigContr() {
		return digContr;
	}

	public void setDigContr(Short digContr) {
		this.digContr = digContr;
	}

	public BigDecimal getCodCuent() {
		return codCuent;
	}

	public void setCodCuent(BigDecimal codCuent) {
		this.codCuent = codCuent;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public Long getIdHisTitul() {
		return idHisTitul;
	}

	public void setIdHisTitul(Long idHisTitul) {
		this.idHisTitul = idHisTitul;
	}

	public Long getIdTitul() {
		return idTitul;
	}

	public void setIdTitul(Long idTitul) {
		this.idTitul = idTitul;
	}

	public Short getCodExclu() {
		return codExclu;
	}

	public void setCodExclu(Short codExclu) {
		this.codExclu = codExclu;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getRefDomic() {
		return refDomic;
	}

	public void setRefDomic(Long refDomic) {
		this.refDomic = refDomic;
	}

	public Integer getEjeOrden() {
		return ejeOrden;
	}

	public void setEjeOrden(Integer ejeOrden) {
		this.ejeOrden = ejeOrden;
	}

	public Integer getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(Integer numOrden) {
		this.numOrden = numOrden;
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

	public DomiciliacionBancaria() {
		super();
	}

}
