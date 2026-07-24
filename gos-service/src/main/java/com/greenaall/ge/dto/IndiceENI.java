package com.greenaall.ge.dto;

import java.io.Serializable;

public class IndiceENI implements Serializable {

	private static final long serialVersionUID = 1L;
	private String total;
	private String archivo;
	private String nombre;
	private String huella;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHuella() {
		return huella;
	}

	public void setHuella(String huella) {
		this.huella = huella;
	}

}
