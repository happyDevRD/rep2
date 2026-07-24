package com.greenaall.models.ad.entity;

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
@Table(name = "ad_cargo")
public class Cargo implements Serializable{

	private static final long serialVersionUID = -5434336487133196295L;
	
	@Id
    @Basic(optional = false)
    @Column(name = "cod_cargo")
    private Short codCargo;
    
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;


    public Cargo(Short codCargo) {
        this.codCargo = codCargo;
    }

	public Cargo() {
		super();
	}

	public Short getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(Short codCargo) {
		this.codCargo = codCargo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
