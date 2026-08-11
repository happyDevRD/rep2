package com.greenaall.archive.dto;

import java.util.ArrayList;
import java.util.List;

public class ArchiveEnvioResultadoDto {

	private boolean exito;
	private String codigoRespuesta;
	private String descripcionRespuesta;
	private String identificadorEni;
	private boolean modoDryRun;
	private String mensajeError;
	private List<String> advertencias = new ArrayList<>();

	public boolean isExito() {
		return exito;
	}

	public void setExito(boolean exito) {
		this.exito = exito;
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

	public String getIdentificadorEni() {
		return identificadorEni;
	}

	public void setIdentificadorEni(String identificadorEni) {
		this.identificadorEni = identificadorEni;
	}

	public boolean isModoDryRun() {
		return modoDryRun;
	}

	public void setModoDryRun(boolean modoDryRun) {
		this.modoDryRun = modoDryRun;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public List<String> getAdvertencias() {
		return advertencias;
	}

	public void setAdvertencias(List<String> advertencias) {
		this.advertencias = advertencias;
	}
}
