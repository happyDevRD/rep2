package com.greenaall.ge.dto;

import java.io.Serializable;

public class MetadatosENI implements Serializable{

	private static final long serialVersionUID = 6723792516461782162L;
	
	private String versionNTI;
	private String identificador;
	private String organo;
	private String fecCaptura;
	private String origen;
	private String estado;
	private String tipDocum;
	public String getVersionNTI() {
		return versionNTI;
	}
	public void setVersionNTI(String versionNTI) {
		this.versionNTI = versionNTI;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getOrgano() {
		return organo;
	}
	public void setOrgano(String organo) {
		this.organo = organo;
	}
	public String getFecCaptura() {
		return fecCaptura;
	}
	public void setFecCaptura(String fecCaptura) {
		this.fecCaptura = fecCaptura;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipDocum() {
		return tipDocum;
	}
	public void setTipDocum(String tipDocum) {
		this.tipDocum = tipDocum;
	}
	
}
