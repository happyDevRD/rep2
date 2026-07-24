package com.greenaall.models.gf.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_impuesto")
public class Impuesto implements Serializable {

	private static final long serialVersionUID = -6689164215327054141L;

	@Id
	@Column(name = "id_impue")
	private Long idImpue;

	@Column(name = "cod_impue")
	private String codImpue;

	@Column(name = "eje_impue")
	private Short ejeImpue;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "des_impue")
	private String desImpue;

	@Column(name = "modulo")
	private Short modulo;

	@Column(name = "pla_recib")
	private String plaRecib;

	@Column(name = "fichero_tx")
	private String ficheroTx;

	@Column(name = "fichero_tx_dipu")
	private String ficheroTxDipu;
	
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

	public String getCodImpue() {
		return codImpue;
	}

	public void setCodImpue(String codImpue) {
		this.codImpue = codImpue;
	}

	public Short getEjeImpue() {
		return ejeImpue;
	}

	public void setEjeImpue(Short ejeImpue) {
		this.ejeImpue = ejeImpue;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getDesImpue() {
		return desImpue;
	}

	public void setDesImpue(String desImpue) {
		this.desImpue = desImpue;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public String getPlaRecib() {
		return plaRecib;
	}

	public void setPlaRecib(String plaRecib) {
		this.plaRecib = plaRecib;
	}

	public String getFicheroTx() {
		return ficheroTx;
	}

	public void setFicheroTx(String ficheroTx) {
		this.ficheroTx = ficheroTx;
	}

	public String getFicheroTxDipu() {
		return ficheroTxDipu;
	}

	public void setFicheroTxDipu(String ficheroTxDipu) {
		this.ficheroTxDipu = ficheroTxDipu;
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

	public Impuesto() {
		super();
	}
}
