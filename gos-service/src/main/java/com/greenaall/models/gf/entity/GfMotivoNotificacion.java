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
@Table(name = "gf_motivo_notificacion")
public class GfMotivoNotificacion implements Serializable {

	private static final long serialVersionUID = 3376305185570977140L;

	@Id
	@Basic(optional = false)
	@Column(name = "mot_notif")
	private Short motNotif;

	@Basic(optional = false)
	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Short getMotNotif() {
		return motNotif;
	}

	public void setMotNotif(Short motNotif) {
		this.motNotif = motNotif;
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

	public GfMotivoNotificacion() {
		super();
	}

}
