package com.greenaall.models.rd.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(RdDocumentoAnexoPK.class)
@Table(name = "rd_documento_anexo")
public class RdDocumentoAnexo implements Serializable{

	private static final long serialVersionUID = -4622711830382674470L;

	@Id
	@Column(name = "num_orden")
	private Long numOrden;
	
	@Id
	@Column(name = "id_his_docum")
	private Long idHisDocum;
	
    @Column(name = "tip_anexo")
    private Short tipAnexo;
    
    @Column(name = "fec_anexo")
    @Temporal(TemporalType.DATE)
    private Date fecAnexo;
    
    @Column(name = "cod_archi")
	private Long codArchi;
    
    @Basic(optional = false)
    @Column(name = "doc_aport")
    private Short docAport;
    
    @Column(name = "des_docum")
    private String desDocum;
    
    @Column(name = "id_org_ele_ubica")
   	private Long idOrgEleUbica;
    
    @Column(name = "obs_anexo")
    private String obsAnexo;
    
    @Column(name = "tip_doc_eni")
    private String tipDocEni;
    
    @Column(name = "rdb_doc1")
    private Short rdbDoc1;
    
    @Column(name = "rdb_doc2")
    private Short rdbDoc2;
    
    @Column(name = "rdb_doc3")
    private Short rdbDoc3;
    
    @Column(name = "fir_insc")
    private Short firInsc;
    
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

	public Short getTipAnexo() {
		return tipAnexo;
	}

	public void setTipAnexo(Short tipAnexo) {
		this.tipAnexo = tipAnexo;
	}

	public Date getFecAnexo() {
		return fecAnexo;
	}

	public void setFecAnexo(Date fecAnexo) {
		this.fecAnexo = fecAnexo;
	}

	public Long getCodArchi() {
		return codArchi;
	}

	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}

	public Short getDocAport() {
		return docAport;
	}

	public void setDocAport(Short docAport) {
		this.docAport = docAport;
	}

	public String getDesDocum() {
		return desDocum;
	}

	public void setDesDocum(String desDocum) {
		this.desDocum = desDocum;
	}

	public Long getIdOrgEleUbica() {
		return idOrgEleUbica;
	}

	public void setIdOrgEleUbica(Long idOrgEleUbica) {
		this.idOrgEleUbica = idOrgEleUbica;
	}

	public String getObsAnexo() {
		return obsAnexo;
	}

	public void setObsAnexo(String obsAnexo) {
		this.obsAnexo = obsAnexo;
	}

	public String getTipDocEni() {
		return tipDocEni;
	}

	public void setTipDocEni(String tipDocEni) {
		this.tipDocEni = tipDocEni;
	}

	public Short getRdbDoc1() {
		return rdbDoc1;
	}

	public void setRdbDoc1(Short rdbDoc1) {
		this.rdbDoc1 = rdbDoc1;
	}

	public Short getRdbDoc2() {
		return rdbDoc2;
	}

	public void setRdbDoc2(Short rdbDoc2) {
		this.rdbDoc2 = rdbDoc2;
	}

	public Short getRdbDoc3() {
		return rdbDoc3;
	}

	public void setRdbDoc3(Short rdbDoc3) {
		this.rdbDoc3 = rdbDoc3;
	}

	public Short getFirInsc() {
		return firInsc;
	}

	public void setFirInsc(Short firInsc) {
		this.firInsc = firInsc;
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

	public RdDocumentoAnexo() {
		super();
	}    
}
