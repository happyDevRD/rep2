package com.greenaall.models.te.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "te_provincia")
public class Provincia implements Serializable {

	private static final long serialVersionUID = -661313484555122643L;
	
	@Id
    @Basic(optional = false)
    @Column(name = "cod_provi")
    private Short codProvi;
    @Basic(optional = false)
    @Column(name = "des_provi")
    private String desProvi;
    @Column(name = "usu_contr")
    private String usuContr;
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;
    
	public Short getCodProvi() {
		return codProvi;
	}
	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}
	public String getDesProvi() {
		return desProvi;
	}
	public void setDesProvi(String desProvi) {
		this.desProvi = desProvi;
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
