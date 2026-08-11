package com.greenaall.archive.dto;

import java.util.Date;

public class ArchiveEnvioDto {

	private Long idEnvio;
	private Long idExpediente;
	private String operacion;
	private String estadoEnvio;
	private String codigoRespuesta;
	private String descripcionRespuesta;
	private String identificadorEni;
	private String csv;
	private boolean modoDryRun;
	private String mensajeError;
	private Date fecEnvio;
	private Date fecContr;

	public Long getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(Long idEnvio) {
		this.idEnvio = idEnvio;
	}

	public Long getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Long idExpediente) {
		this.idExpediente = idExpediente;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getEstadoEnvio() {
		return estadoEnvio;
	}

	public void setEstadoEnvio(String estadoEnvio) {
		this.estadoEnvio = estadoEnvio;
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

	public Date getFecEnvio() {
		return fecEnvio;
	}

	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
	}
}
