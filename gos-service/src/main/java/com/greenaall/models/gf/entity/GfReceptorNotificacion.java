package com.greenaall.models.gf.entity;

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
@Table(name = "gf_receptor_notificacion")
public class GfReceptorNotificacion implements Serializable{

	private static final long serialVersionUID = -4944365047015180789L;
	
	@Id
    @Basic(optional = false)
    @Column(name = "receptor")
    private Short receptor;
    
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Short getReceptor() {
		return receptor;
	}

	public void setReceptor(Short receptor) {
		this.receptor = receptor;
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

	public GfReceptorNotificacion() {
		super();
	}
 
}
