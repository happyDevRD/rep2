package com.greenaall.notifica.dto;

import java.util.Date;

public class NotificaEstadoResponse {

	private String estadoNotifica;
	private String idAcuseExterno;
	private Long codArchiAcuse;
	private Date fecRecepcion;
	private String mensaje;
	private boolean recepcionada;
	private boolean caducada;
	private boolean rechazada;

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

	public Long getCodArchiAcuse() {
		return codArchiAcuse;
	}

	public void setCodArchiAcuse(Long codArchiAcuse) {
		this.codArchiAcuse = codArchiAcuse;
	}

	public Date getFecRecepcion() {
		return fecRecepcion;
	}

	public void setFecRecepcion(Date fecRecepcion) {
		this.fecRecepcion = fecRecepcion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isRecepcionada() {
		return recepcionada;
	}

	public void setRecepcionada(boolean recepcionada) {
		this.recepcionada = recepcionada;
	}

	public boolean isCaducada() {
		return caducada;
	}

	public void setCaducada(boolean caducada) {
		this.caducada = caducada;
	}

	public boolean isRechazada() {
		return rechazada;
	}

	public void setRechazada(boolean rechazada) {
		this.rechazada = rechazada;
	}
}
