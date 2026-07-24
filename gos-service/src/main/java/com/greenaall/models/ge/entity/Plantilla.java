package com.greenaall.models.ge.entity;

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
@Table(name = "ge_plantilla")
@IdClass(PlantillaPK.class)
public class Plantilla implements Serializable{

	private static final long serialVersionUID = 8676209641632090950L;

	@Id
	@Column(name="modulo")
	private Short modulo;
	
	@Id
	@Column(name="plantilla")
	private String plantilla;
	
    @Basic(optional = false)
	@Column(name = "des_plant")
    private String desPlant;
    @Basic(optional = false)
    @Column(name = "men_impre")
    private String menImpre;
    @Basic(optional = false)
    @Column(name = "tip_plant")
    private short tipPlant;
    @Basic(optional = false)
    @Column(name = "tip_docum")
    private short tipDocum;
    @Basic(optional = false)
    @Column(name = "ind_reser")
    private short indReser;
    @Column(name = "pla_enlac")
    private String plaEnlac;
    @Basic(optional = false)
    @Column(name = "ind_princ")
    private boolean indPrinc;
    @Basic(optional = false)
    @Column(name = "num_copia")
    private short numCopia;
    @Basic(optional = false)
    @Column(name = "num_ele_multi")
    private short numEleMulti;
    @Basic(optional = false)
    @Column(name = "e_firma")
    private short eFirma;
    @Column(name = "fir_desat")
    private Short firDesat;
    @Column(name = "tip_doc_eni")
    private String tipDocEni;
    @Column(name = "usu_contr")
    private String usuContr;
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Plantilla() {
		super();
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}

	public String getDesPlant() {
		return desPlant;
	}

	public void setDesPlant(String desPlant) {
		this.desPlant = desPlant;
	}

	public String getMenImpre() {
		return menImpre;
	}

	public void setMenImpre(String menImpre) {
		this.menImpre = menImpre;
	}

	public short getTipPlant() {
		return tipPlant;
	}

	public void setTipPlant(short tipPlant) {
		this.tipPlant = tipPlant;
	}

	public short getTipDocum() {
		return tipDocum;
	}

	public void setTipDocum(short tipDocum) {
		this.tipDocum = tipDocum;
	}

	public short getIndReser() {
		return indReser;
	}

	public void setIndReser(short indReser) {
		this.indReser = indReser;
	}

	public String getPlaEnlac() {
		return plaEnlac;
	}

	public void setPlaEnlac(String plaEnlac) {
		this.plaEnlac = plaEnlac;
	}

	public boolean isIndPrinc() {
		return indPrinc;
	}

	public void setIndPrinc(boolean indPrinc) {
		this.indPrinc = indPrinc;
	}

	public short getNumCopia() {
		return numCopia;
	}

	public void setNumCopia(short numCopia) {
		this.numCopia = numCopia;
	}

	public short getNumEleMulti() {
		return numEleMulti;
	}

	public void setNumEleMulti(short numEleMulti) {
		this.numEleMulti = numEleMulti;
	}

	public short geteFirma() {
		return eFirma;
	}

	public void seteFirma(short eFirma) {
		this.eFirma = eFirma;
	}

	public Short getFirDesat() {
		return firDesat;
	}

	public void setFirDesat(Short firDesat) {
		this.firDesat = firDesat;
	}

	public String getTipDocEni() {
		return tipDocEni;
	}

	public void setTipDocEni(String tipDocEni) {
		this.tipDocEni = tipDocEni;
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
	
}
