package com.greenaall.inside.dto;

import java.util.ArrayList;
import java.util.List;

public class InsideConvertirDocumentoSoapDto {

	private String contenido;
	private String contenidoId;
	private boolean firmadoConCertificado;
	private String versionNti;
	private String identificador;
	private String organo;
	private String fechaCaptura;
	private boolean origenCiudadanoAdministracion;
	private String estadoElaboracion;
	private String tipoDocumental;
	private boolean firmar;
	private List<InsideMetadatoAdicionalDto> metadatosAdicionales = new ArrayList<>();

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getContenidoId() {
		return contenidoId;
	}

	public void setContenidoId(String contenidoId) {
		this.contenidoId = contenidoId;
	}

	public boolean isFirmadoConCertificado() {
		return firmadoConCertificado;
	}

	public void setFirmadoConCertificado(boolean firmadoConCertificado) {
		this.firmadoConCertificado = firmadoConCertificado;
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

	public boolean isFirmar() {
		return firmar;
	}

	public void setFirmar(boolean firmar) {
		this.firmar = firmar;
	}

	public List<InsideMetadatoAdicionalDto> getMetadatosAdicionales() {
		return metadatosAdicionales;
	}

	public void setMetadatosAdicionales(List<InsideMetadatoAdicionalDto> metadatosAdicionales) {
		this.metadatosAdicionales = metadatosAdicionales;
	}
}
