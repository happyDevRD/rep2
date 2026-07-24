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
@IdClass(ImpuestoConceptoPK.class)
@Table(name = "gf_impuesto_concepto")
public class ImpuestoConcepto implements Serializable {

	private static final long serialVersionUID = 6247556492074619541L;

	@Id
	@Column(name = "id_impue")
	private Long idImpue;

	@Id
	@Column(name = "cod_conce")
	private String codConce;

	@Column(name = "tip_calcu")
	private Short tipCalcu;

	@Column(name = "imp_conce")
	private java.math.BigDecimal impConce;

	@Column(name = "for_calcu")
	private String forCalcu;

	@Column(name = "pro_calcu")
	private String proCalcu;

	@Column(name = "recargo")
	private Short recargo;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdImpue() {
		return idImpue;
	}

	public void setIdImpue(Long idImpue) {
		this.idImpue = idImpue;
	}

	public String getCodConce() {
		return codConce;
	}

	public void setCodConce(String codConce) {
		this.codConce = codConce;
	}

	public Short getTipCalcu() {
		return tipCalcu;
	}

	public void setTipCalcu(Short tipCalcu) {
		this.tipCalcu = tipCalcu;
	}

	public java.math.BigDecimal getImpConce() {
		return impConce;
	}

	public void setImpConce(java.math.BigDecimal impConce) {
		this.impConce = impConce;
	}

	public String getForCalcu() {
		return forCalcu;
	}

	public void setForCalcu(String forCalcu) {
		this.forCalcu = forCalcu;
	}

	public String getProCalcu() {
		return proCalcu;
	}

	public void setProCalcu(String proCalcu) {
		this.proCalcu = proCalcu;
	}

	public Short getRecargo() {
		return recargo;
	}

	public void setRecargo(Short recargo) {
		this.recargo = recargo;
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

	public ImpuestoConcepto() {
		super();
	}

}
