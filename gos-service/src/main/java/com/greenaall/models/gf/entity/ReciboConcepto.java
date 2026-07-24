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
@Table(name = "gf_recibo_concepto")
@IdClass(ReciboConceptoPK.class)
public class ReciboConcepto implements Serializable {

	private static final long serialVersionUID = -4528971900224337013L;

	@Id
	@Column(name = "id_his_recib")
	private Long idHisRecib;

	@Id
	@Column(name = "id_recib")
	private Long idRecib;

	@Id
	@Column(name = "eje_conce")
	private Short ejeConce;

	@Id
	@Column(name = "cod_conce")
	private String codConce;

	@Column(name = "imp_conce")
	private java.math.BigDecimal impConce;

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

	public ReciboConcepto() {
		super();
	}

}
