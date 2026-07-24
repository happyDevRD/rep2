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
@IdClass(LiquidacionConceptoPK.class)
@Table(name = "gf_liquidacion_concepto")
public class LiquidacionConcepto implements Serializable {

	private static final long serialVersionUID = 6145395068765949879L;

	@Id
	@Column(name = "id_liqui")
	private Long idLiqui;

	@Id
	@Column(name = "eje_conce")
	private Short ejeConce;

	@Id
	@Column(name = "cod_conce")
	private String codConce;

	@Column(name = "imp_conce")
	private java.math.BigDecimal impConce;

	@Column(name = "id_tip_iva")
	private Short idTipIva;

	@Column(name = "cod_con_iva")
	private String codConIva;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdLiqui() {
		return idLiqui;
	}

	public void setIdLiqui(Long idLiqui) {
		this.idLiqui = idLiqui;
	}

	public Short getEjeConce() {
		return ejeConce;
	}

	public void setEjeConce(Short ejeConce) {
		this.ejeConce = ejeConce;
	}

	public String getCodConce() {
		return codConce;
	}

	public void setCodConce(String codConce) {
		this.codConce = codConce;
	}

	public java.math.BigDecimal getImpConce() {
		return impConce;
	}

	public void setImpConce(java.math.BigDecimal impConce) {
		this.impConce = impConce;
	}

	public Short getIdTipIva() {
		return idTipIva;
	}

	public void setIdTipIva(Short idTipIva) {
		this.idTipIva = idTipIva;
	}

	public String getCodConIva() {
		return codConIva;
	}

	public void setCodConIva(String codConIva) {
		this.codConIva = codConIva;
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

	public LiquidacionConcepto() {
		super();
	}
}
