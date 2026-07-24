package com.greenaall.models.co.entity;

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
@Table(name = "co_jus_gasto")
public class JusGasto implements Serializable {

	private static final long serialVersionUID = -6143348943036562643L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_jus_gasto")
	private Long idJusGasto;

	@Column(name = "id_conta")
	private Long idConta;

	@Column(name = "eje_jus_gasto")
	private Short ejeJusGasto;

	@Column(name = "num_jus_gasto")
	private Integer numJusGasto;

	@Column(name = "id_ope_jus_gasto")
	private Long idOpeJusGasto;

	@Column(name = "ind_tip_docum")
	private Short indTipDocum;

	@Column(name = "num_jus_exter")
	private String numJusExter;

	@Column(name = "fec_jus_exter")
	private java.sql.Date fecJusExter;

	@Column(name = "id_terce")
	private Long idTerce;

	@Column(name = "txt_jus_gasto")
	private String txtJusGasto;

	@Column(name = "ind_iva_deduc")
	private Short indIvaDeduc;

	@Column(name = "ind_area")
	private Short indArea;

	@Column(name = "imp_total")
	private java.math.BigDecimal impTotal;

	@Column(name = "imp_dto")
	private java.math.BigDecimal impDto;

	@Column(name = "imp_iva")
	private java.math.BigDecimal impIva;

	@Column(name = "imp_liqui")
	private java.math.BigDecimal impLiqui;

	@Column(name = "estado")
	private Short estado;

	@Column(name = "id_relac")
	private Long idRelac;

	@Column(name = "id_ope_gener")
	private Long idOpeGener;

	@Column(name = "ind_face")
	private Short indFace;

	@Column(name = "ind413")
	private Short ind413;

	@Column(name = "eje_regis")
	private Short ejeRegis;

	@Column(name = "num_regis")
	private Integer numRegis;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

	public Long getIdJusGasto() {
		return idJusGasto;
	}

	public void setIdJusGasto(Long idJusGasto) {
		this.idJusGasto = idJusGasto;
	}

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public Short getEjeJusGasto() {
		return ejeJusGasto;
	}

	public void setEjeJusGasto(Short ejeJusGasto) {
		this.ejeJusGasto = ejeJusGasto;
	}

	public Integer getNumJusGasto() {
		return numJusGasto;
	}

	public void setNumJusGasto(Integer numJusGasto) {
		this.numJusGasto = numJusGasto;
	}

	public Long getIdOpeJusGasto() {
		return idOpeJusGasto;
	}

	public void setIdOpeJusGasto(Long idOpeJusGasto) {
		this.idOpeJusGasto = idOpeJusGasto;
	}

	public Short getIndTipDocum() {
		return indTipDocum;
	}

	public void setIndTipDocum(Short indTipDocum) {
		this.indTipDocum = indTipDocum;
	}

	public String getNumJusExter() {
		return numJusExter;
	}

	public void setNumJusExter(String numJusExter) {
		this.numJusExter = numJusExter;
	}

	public java.sql.Date getFecJusExter() {
		return fecJusExter;
	}

	public void setFecJusExter(java.sql.Date fecJusExter) {
		this.fecJusExter = fecJusExter;
	}

	public Long getIdTerce() {
		return idTerce;
	}

	public void setIdTerce(Long idTerce) {
		this.idTerce = idTerce;
	}

	public String getTxtJusGasto() {
		return txtJusGasto;
	}

	public void setTxtJusGasto(String txtJusGasto) {
		this.txtJusGasto = txtJusGasto;
	}

	public Short getIndIvaDeduc() {
		return indIvaDeduc;
	}

	public void setIndIvaDeduc(Short indIvaDeduc) {
		this.indIvaDeduc = indIvaDeduc;
	}

	public Short getIndArea() {
		return indArea;
	}

	public void setIndArea(Short indArea) {
		this.indArea = indArea;
	}

	public java.math.BigDecimal getImpTotal() {
		return impTotal;
	}

	public void setImpTotal(java.math.BigDecimal impTotal) {
		this.impTotal = impTotal;
	}

	public java.math.BigDecimal getImpDto() {
		return impDto;
	}

	public void setImpDto(java.math.BigDecimal impDto) {
		this.impDto = impDto;
	}

	public java.math.BigDecimal getImpIva() {
		return impIva;
	}

	public void setImpIva(java.math.BigDecimal impIva) {
		this.impIva = impIva;
	}

	public java.math.BigDecimal getImpLiqui() {
		return impLiqui;
	}

	public void setImpLiqui(java.math.BigDecimal impLiqui) {
		this.impLiqui = impLiqui;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public Long getIdRelac() {
		return idRelac;
	}

	public void setIdRelac(Long idRelac) {
		this.idRelac = idRelac;
	}

	public Long getIdOpeGener() {
		return idOpeGener;
	}

	public void setIdOpeGener(Long idOpeGener) {
		this.idOpeGener = idOpeGener;
	}

	public Short getIndFace() {
		return indFace;
	}

	public void setIndFace(Short indFace) {
		this.indFace = indFace;
	}

	public Short getInd413() {
		return ind413;
	}

	public void setInd413(Short ind413) {
		this.ind413 = ind413;
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

	public JusGasto() {
		super();
	}
	
}
