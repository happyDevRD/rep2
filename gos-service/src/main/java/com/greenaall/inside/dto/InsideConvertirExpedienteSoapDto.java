package com.greenaall.inside.dto;

import java.util.ArrayList;
import java.util.List;

public class InsideConvertirExpedienteSoapDto {

	private String versionNti;
	private String identificador;
	private String organo;
	private String fechaAperturaExpediente;
	private String clasificacion;
	private String estado;
	private List<String> interesados = new ArrayList<>();
	private String fechaIndiceElectronico;
	private List<InsideDocumentoIndizadoSoapDto> documentosIndizados = new ArrayList<>();
	private List<InsideMetadatoAdicionalDto> metadatosAdicionales = new ArrayList<>();

	public String getVersionNti() {
		return versionNti;
	}

	public void setVersionNti(String versionNti) {
		this.versionNti = versionNti;
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

	public String getFechaAperturaExpediente() {
		return fechaAperturaExpediente;
	}

	public void setFechaAperturaExpediente(String fechaAperturaExpediente) {
		this.fechaAperturaExpediente = fechaAperturaExpediente;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<String> getInteresados() {
		return interesados;
	}

	public void setInteresados(List<String> interesados) {
		this.interesados = interesados;
	}

	public String getFechaIndiceElectronico() {
		return fechaIndiceElectronico;
	}

	public void setFechaIndiceElectronico(String fechaIndiceElectronico) {
		this.fechaIndiceElectronico = fechaIndiceElectronico;
	}

	public List<InsideDocumentoIndizadoSoapDto> getDocumentosIndizados() {
		return documentosIndizados;
	}

	public void setDocumentosIndizados(List<InsideDocumentoIndizadoSoapDto> documentosIndizados) {
		this.documentosIndizados = documentosIndizados;
	}

	public List<InsideMetadatoAdicionalDto> getMetadatosAdicionales() {
		return metadatosAdicionales;
	}

	public void setMetadatosAdicionales(List<InsideMetadatoAdicionalDto> metadatosAdicionales) {
		this.metadatosAdicionales = metadatosAdicionales;
	}
}
