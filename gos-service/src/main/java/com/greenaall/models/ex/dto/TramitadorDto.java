package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumEstadoTramitacion;

public class TramitadorDto implements Serializable{

	private static final long serialVersionUID = 1757209257288027302L;
	private Long id;
	private Date fecAsignacion;
	private Long expediente;
	private Short ejeExped;
	private Integer numExped;
	private Short posesion;
	private String usuario;
	private EnumEstadoTramitacion estadoTramitacion  = EnumEstadoTramitacion.PENDIENTE;
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
	public Short getEjeExped() {
		return ejeExped;
	}
	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}
	public Integer getNumExped() {
		return numExped;
	}
	public void setNumExped(Integer numExped) {
		this.numExped = numExped;
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
	
}
