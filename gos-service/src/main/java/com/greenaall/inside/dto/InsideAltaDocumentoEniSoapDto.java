package com.greenaall.inside.dto;

public class InsideAltaDocumentoEniSoapDto {

	private String valorBinario;
	private String nombreFormato;
	private String versionNti;
	private String identificador;
	private String organo;
	private String fechaCaptura;
	private boolean origenCiudadanoAdministracion;
	private String estadoElaboracion;
	private String tipoDocumental;
	private boolean firmaServidor;

	public String getValorBinario() {
		return valorBinario;
	}

	public void setValorBinario(String valorBinario) {
		this.valorBinario = valorBinario;
	}

	public String getNombreFormato() {
		return nombreFormato;
	}

	public void setNombreFormato(String nombreFormato) {
		this.nombreFormato = nombreFormato;
	}

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

	public String getFechaCaptura() {
		return fechaCaptura;
	}

	public void setFechaCaptura(String fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

	public boolean isOrigenCiudadanoAdministracion() {
		return origenCiudadanoAdministracion;
	}

	public void setOrigenCiudadanoAdministracion(boolean origenCiudadanoAdministracion) {
		this.origenCiudadanoAdministracion = origenCiudadanoAdministracion;
	}

	public String getEstadoElaboracion() {
		return estadoElaboracion;
	}

	public void setEstadoElaboracion(String estadoElaboracion) {
		this.estadoElaboracion = estadoElaboracion;
	}

	public String getTipoDocumental() {
		return tipoDocumental;
	}

	public void setTipoDocumental(String tipoDocumental) {
		this.tipoDocumental = tipoDocumental;
	}

	public boolean isFirmaServidor() {
		return firmaServidor;
	}

	public void setFirmaServidor(boolean firmaServidor) {
		this.firmaServidor = firmaServidor;
	}
}
