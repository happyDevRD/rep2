package com.greenaall.models.rd.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
*
* @author jmmoyano
*/

@Entity
@IdClass(RdDocumentoInteresadoPK.class)
@Table(name = "rd_documento_interesado")
public class RdDocumentoInteresado implements Serializable {

	private static final long serialVersionUID = 3469534002575093578L;

	@Id
	@Column(name = "num_orden")
	private Long numOrden;
	
	@Id
	@Column(name = "id_his_docum")
	private Long idHisDocum;
	
	@Column(name = "id_his_inter")
	private Long idHisInter;
	
	@Column(name = "id_inter")
	private Long idInter;
	
	@Column(name = "int_princ")
	private Short intPrinc;
	
	@Column(name = "id_his_otr_perso")
	private Long idHisOtrPerso;
	
	@Column(name = "id_otr_perso")
	private Long idOtrPerso;
	
	@Column(name = "id_his_per_repre")
	private Long idHisPerRepre;
	
	@Column(name = "id_per_repre")
	private Long idPerRepre;
		
	@Column(name = "cod_barra")
	private String codBarra;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(Long numOrden) {
		this.numOrden = numOrden;
	}

	public Long getIdHisDocum() {
		return idHisDocum;
	}

	public void setIdHisDocum(Long idHisDocum) {
		this.idHisDocum = idHisDocum;
	}

	public Long getIdHisInter() {
		return idHisInter;
	}

	public void setIdHisInter(Long idHisInter) {
		this.idHisInter = idHisInter;
	}

	public Long getIdInter() {
		return idInter;
	}

	public void setIdInter(Long idInter) {
		this.idInter = idInter;
	}

	public Short getIntPrinc() {
		return intPrinc;
	}

	public void setIntPrinc(Short intPrinc) {
		this.intPrinc = intPrinc;
	}

	public Long getIdHisOtrPerso() {
		return idHisOtrPerso;
	}

	public void setIdHisOtrPerso(Long idHisOtrPerso) {
		this.idHisOtrPerso = idHisOtrPerso;
	}

	public Long getIdOtrPerso() {
		return idOtrPerso;
	}

	public void setIdOtrPerso(Long idOtrPerso) {
		this.idOtrPerso = idOtrPerso;
	}

	public Long getIdHisPerRepre() {
		return idHisPerRepre;
	}

	public void setIdHisPerRepre(Long idHisPerRepre) {
		this.idHisPerRepre = idHisPerRepre;
	}

	public Long getIdPerRepre() {
		return idPerRepre;
	}

	public void setIdPerRepre(Long idPerRepre) {
		this.idPerRepre = idPerRepre;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
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

	public RdDocumentoInteresado() {
		super();
	}

}
