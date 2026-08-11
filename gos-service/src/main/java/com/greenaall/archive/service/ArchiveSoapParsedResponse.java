package com.greenaall.archive.service;

import java.util.ArrayList;
import java.util.List;

import com.greenaall.archive.dto.ArchiveIdentificadorDto;

public class ArchiveSoapParsedResponse {

	private String rawXml;
	private String faultString;
	private String retorno;
	private String codigoError;
	private String descripcionError;
	private final List<ArchiveIdentificadorDto> identificadores = new ArrayList<>();

	public boolean hasFault() {
		return faultString != null && !faultString.isBlank();
	}

	public boolean hasErrorArchive() {
		return codigoError != null && !codigoError.isBlank();
	}

	public boolean isSuccess() {
		return !hasFault() && !hasErrorArchive() && retorno != null && !retorno.isBlank();
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

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

	public List<ArchiveIdentificadorDto> getIdentificadores() {
		return identificadores;
	}

	public String getPrimerIdentificadorEni() {
		return identificadores.isEmpty() ? null : identificadores.get(0).getIdentificadorExpedienteEni();
	}
}
