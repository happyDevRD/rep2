package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_entidad")
public class Entidad implements Serializable{

	private static final long serialVersionUID = 5499861814560830958L;
	
	@Id
    @Column(name = "cod_entid")
    private Short codEntid;
	
    @Column(name = "des_entid")
    private String desEntid;
    
    @Column(name = "cod_provi")
    private Short codProvi;
    
    @Column(name = "cod_munic")
    private Short codMunic;
    
    @Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getDesEntid() {
		return desEntid;
	}

	public void setDesEntid(String desEntid) {
		this.desEntid = desEntid;
	}

	public Short getCodProvi() {
		return codProvi;
	}

	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}

	public Short getCodMunic() {
		return codMunic;
	}

	public void setCodMunic(Short codMunic) {
		this.codMunic = codMunic;
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

	public Entidad() {
		super();
	}
	
}
