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
@Table(name = "co_tercero")
public class Tercero implements Serializable {

	private static final long serialVersionUID = 4695957567834830931L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terce")
	private Long idTerce;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Column(name = "id_perso")
	private Long idPerso;

	@Column(name = "cod_tip_terce")
	private Short codTipTerce;

	@Column(name = "cod_sec_insti")
	private Short codSecInsti;

	@Column(name = "cod_tip_pago")
	private Short codTipPago;

	@Column(name = "cod_for_pago")
	private Short codForPago;

	@Column(name = "ind_reten")
	private Short indReten;

	@Column(name = "por_reten")
	private java.math.BigDecimal porReten;

	@Column(name = "cod_cla_perce")
	private String codClaPerce;

	@Column(name = "ind_ret_pago")
	private Short indRetPago;

	@Column(name = "ind_ter_exter")
	private Short indTerExter;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

	public Long getIdTerce() {
		return idTerce;
	}

	public void setIdTerce(Long idTerce) {
		this.idTerce = idTerce;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
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

	public Short getCodTipTerce() {
		return codTipTerce;
	}

	public void setCodTipTerce(Short codTipTerce) {
		this.codTipTerce = codTipTerce;
	}

	public Short getCodSecInsti() {
		return codSecInsti;
	}

	public void setCodSecInsti(Short codSecInsti) {
		this.codSecInsti = codSecInsti;
	}

	public Short getCodTipPago() {
		return codTipPago;
	}

	public void setCodTipPago(Short codTipPago) {
		this.codTipPago = codTipPago;
	}

	public Short getCodForPago() {
		return codForPago;
	}

	public void setCodForPago(Short codForPago) {
		this.codForPago = codForPago;
	}

	public Short getIndReten() {
		return indReten;
	}

	public void setIndReten(Short indReten) {
		this.indReten = indReten;
	}

	public java.math.BigDecimal getPorReten() {
		return porReten;
	}

	public void setPorReten(java.math.BigDecimal porReten) {
		this.porReten = porReten;
	}

	public String getCodClaPerce() {
		return codClaPerce;
	}

	public void setCodClaPerce(String codClaPerce) {
		this.codClaPerce = codClaPerce;
	}

	public Short getIndRetPago() {
		return indRetPago;
	}

	public void setIndRetPago(Short indRetPago) {
		this.indRetPago = indRetPago;
	}

	public Short getIndTerExter() {
		return indTerExter;
	}

	public void setIndTerExter(Short indTerExter) {
		this.indTerExter = indTerExter;
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
	}

	public Tercero() {
		super();
	}
	
}
