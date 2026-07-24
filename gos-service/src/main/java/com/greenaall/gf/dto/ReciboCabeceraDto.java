package com.greenaall.gf.dto;

import java.io.Serializable;

public class ReciboCabeceraDto implements Serializable {

	private static final long serialVersionUID = 4428220852900389200L;
	private Long idHisRecib;
	private Long idRecib;
	private Short codEntid;
	private Short modPerte;
	private String nomPadro;
	private Short ejeRecib;
	private Integer numRecib;
	private java.sql.Date fecRecib;
	private java.math.BigDecimal impPrinc;
	private java.math.BigDecimal impRecar;
	private java.math.BigDecimal impInter;
	private java.math.BigDecimal impCosta;
	private java.math.BigDecimal impOtros;
	private java.math.BigDecimal impRecib;
	private java.math.BigDecimal impCobro;
	private String desImpue;

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

	public java.sql.Date getFecRecib() {
		return fecRecib;
	}

	public void setFecRecib(java.sql.Date fecRecib) {
		this.fecRecib = fecRecib;
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

	public String getDesImpue() {
		return desImpue;
	}

	public void setDesImpue(String desImpue) {
		this.desImpue = desImpue;
	}

}
