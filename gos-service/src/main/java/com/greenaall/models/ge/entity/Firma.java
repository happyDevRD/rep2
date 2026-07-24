package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_firma")
public class Firma implements Serializable {

	private static final long serialVersionUID = -6410689329047586451L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_firma")
	private Integer idFirma;

	@Basic(optional = false)
	@Column(name = "orden")
	private Short orden;

	@Basic(optional = false)
	@Column(name = "ind_tipo")
	private Short indTipo;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	@Column(name = "id_cargo")
	private Integer idCargo;

	@Column(name = "id_pro_firma")
	private Integer idProFirma;

	public Firma(Integer idFirma) {
		this.idFirma = idFirma;
	}

	public Firma() {
		super();
	}

	public Integer getIdFirma() {
		return idFirma;
	}

	public void setIdFirma(Integer idFirma) {
		this.idFirma = idFirma;
	}

	public Short getOrden() {
		return orden;
	}

	public void setOrden(Short orden) {
		this.orden = orden;
	}

	public Short getIndTipo() {
		return indTipo;
	}

	public void setIndTipo(Short indTipo) {
		this.indTipo = indTipo;
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

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Integer getIdProFirma() {
		return idProFirma;
	}

	public void setIdProFirma(Integer idProFirma) {
		this.idProFirma = idProFirma;
	}

	public boolean esCompatible(Firma firma) {
		if (firma == null) {
			return false;
		}

		if (idCargo == null ? firma.idCargo != null : !idCargo.equals(firma.idCargo)) {
			return false;
		}

		if (orden == null ? firma.orden != null : !orden.equals(firma.orden)) {
			return false;
		}

		return true;
	}

}
