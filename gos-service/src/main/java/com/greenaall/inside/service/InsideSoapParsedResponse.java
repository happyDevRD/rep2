package com.greenaall.inside.service;

public class InsideSoapParsedResponse {

	private String rawXml;
	private String faultString;
	private String codigoRespuesta;
	private String descripcionRespuesta;
	private String identificador;
	private String csv;
	private String codigoEnvioAtea;
	private String estadoRemision;

	public boolean hasFault() {
		return faultString != null && !faultString.isBlank();
	}

	public boolean isSuccess() {
		return !hasFault() && "00".equals(codigoRespuesta);
	}

	public String getRawXml() {
		return rawXml;
	}

	public void setRawXml(String rawXml) {
		this.rawXml = rawXml;
	}

	public String getFaultString() {
		return faultString;
	}

	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}

	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCsv() {
		return csv;
	}

	public void setCsv(String csv) {
		this.csv = csv;
	}

	public String getCodigoEnvioAtea() {
		return codigoEnvioAtea;
	}

	public void setCodigoEnvioAtea(String codigoEnvioAtea) {
		this.codigoEnvioAtea = codigoEnvioAtea;
	}

	public String getEstadoRemision() {
		return estadoRemision;
	}

	public void setEstadoRemision(String estadoRemision) {
		this.estadoRemision = estadoRemision;
	}
}
