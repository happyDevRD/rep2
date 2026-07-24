package com.greenaall.models.ge.dto;

import java.io.Serializable;

public class DatosFirmaDto implements Serializable {
	
	private static final long serialVersionUID = -6222524558424333806L;
	private String asunto;
	private String texto;
	private Short prioridad;
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Short getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(Short prioridad) {
		this.prioridad = prioridad;
	}
	
	

}
