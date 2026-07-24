package com.greenaall.inside.dto;

public class InsideEniXmlBase64Dto {

	private String base64;
	private String nombreArchivo;
	private boolean encontrado;
	private String mensaje;

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public boolean isEncontrado() {
		return encontrado;
	}

	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
