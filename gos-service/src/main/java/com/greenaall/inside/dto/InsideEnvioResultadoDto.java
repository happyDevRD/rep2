package com.greenaall.inside.dto;

import java.util.ArrayList;
import java.util.List;

public class InsideEnvioResultadoDto {

	private boolean exito;
	private String codigoRespuesta;
	private String descripcionRespuesta;
	private String identificadorEni;
	private String csv;
	private boolean modoDryRun;
	private String mensajeError;
	private List<String> advertencias = new ArrayList<>();
	private String codigoEnvioATEA;
	private String estadoRemision;

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

	public String getCsv() {
		return csv;
	}

	public void setCsv(String csv) {
		this.csv = csv;
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

	public String getCodigoEnvioATEA() {
		return codigoEnvioATEA;
	}

	public void setCodigoEnvioATEA(String codigoEnvioATEA) {
		this.codigoEnvioATEA = codigoEnvioATEA;
	}

	public String getEstadoRemision() {
		return estadoRemision;
	}

	public void setEstadoRemision(String estadoRemision) {
		this.estadoRemision = estadoRemision;
	}
}
