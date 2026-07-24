package com.greenaall.notifica.dto;

public class NotificaEnvioResponse {

	private String idEnvioExterno;
	private String estadoNotifica;
	private String mensaje;

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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
