package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumEstadoTramitacion;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_tramitador")
public class Tramitador implements Serializable {

	private static final long serialVersionUID = 9095289566390940933L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="fec_asignacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecAsignacion;
	
	@Column(name="expediente")
	private Long expediente;
	
	@Column(name="usuario")
	private String usuario;
	
	@Enumerated(EnumType.STRING)
    @Basic(optional = false)
	@Column(name="estado_tramitacion")
	private EnumEstadoTramitacion estadoTramitacion  = EnumEstadoTramitacion.PENDIENTE;
	
	@Column(name = "posesion")
	private Short posesion;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecAsignacion() {
		return fecAsignacion;
	}

	public void setFecAsignacion(Date fecAsignacion) {
		this.fecAsignacion = fecAsignacion;
	}

	public Long getExpediente() {
		return expediente;
	}

	public void setExpediente(Long expediente) {
		this.expediente = expediente;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public EnumEstadoTramitacion getEstadoTramitacion() {
		return estadoTramitacion;
	}

	public void setEstadoTramitacion(EnumEstadoTramitacion estadoTramitacion) {
		this.estadoTramitacion = estadoTramitacion;
	}

	public Short getPosesion() {
		return posesion;
	}

	public void setPosesion(Short posesion) {
		this.posesion = posesion;
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

	public Tramitador() {
		super();
	}
	
}
