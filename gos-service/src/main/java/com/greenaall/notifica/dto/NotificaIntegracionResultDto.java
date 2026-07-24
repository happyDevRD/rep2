package com.greenaall.notifica.dto;

import java.util.Date;

public class NotificaIntegracionResultDto {

	private Long idNotif;
	private Short situacion;
	private String desSituacion;
	private Long idEnvio;
	private String idEnvioExterno;
	private String estadoNotifica;
	private String idAcuseExterno;
	private String mensaje;
	private Date fecEnvio;
	private Date fecRecepcion;
	private String modo;

	public Long getIdNotif() {
		return idNotif;
	}

	public void setIdNotif(Long idNotif) {
		this.idNotif = idNotif;
	}

	public Short getSituacion() {
		return situacion;
	}

	public void setSituacion(Short situacion) {
		this.situacion = situacion;
	}

	public String getDesSituacion() {
		return desSituacion;
	}

	public void setDesSituacion(String desSituacion) {
		this.desSituacion = desSituacion;
	}

	public Long getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(Long idEnvio) {
		this.idEnvio = idEnvio;
	}

	public String getIdEnvioExterno() {
		return idEnvioExterno;
	}

	public void setIdEnvioExterno(String idEnvioExterno) {
		this.idEnvioExterno = idEnvioExterno;
	}

	public String getEstadoNotifica() {
		return estadoNotifica;
	}

	public void setEstadoNotifica(String estadoNotifica) {
		this.estadoNotifica = estadoNotifica;
	}

	public String getIdAcuseExterno() {
		return idAcuseExterno;
	}

	public void setIdAcuseExterno(String idAcuseExterno) {
		this.idAcuseExterno = idAcuseExterno;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecEnvio() {
		return fecEnvio;
	}

	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}

	public Date getFecRecepcion() {
		return fecRecepcion;
	}

	public void setFecRecepcion(Date fecRecepcion) {
		this.fecRecepcion = fecRecepcion;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}
}
