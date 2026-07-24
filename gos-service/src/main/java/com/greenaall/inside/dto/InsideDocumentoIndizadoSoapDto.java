package com.greenaall.inside.dto;

public class InsideDocumentoIndizadoSoapDto {

	private String identificadorDocumento;
	private String valorHuella;
	private String funcionResumen;
	private String fechaIncorporacionExpediente;
	private String ordenDocumentoExpediente;

	public String getIdentificadorDocumento() {
		return identificadorDocumento;
	}

	public void setIdentificadorDocumento(String identificadorDocumento) {
		this.identificadorDocumento = identificadorDocumento;
	}

	public String getValorHuella() {
		return valorHuella;
	}

	public void setValorHuella(String valorHuella) {
		this.valorHuella = valorHuella;
	}

	public String getFuncionResumen() {
		return funcionResumen;
	}

	public void setFuncionResumen(String funcionResumen) {
		this.funcionResumen = funcionResumen;
	}

	public String getFechaIncorporacionExpediente() {
		return fechaIncorporacionExpediente;
	}

	public void setFechaIncorporacionExpediente(String fechaIncorporacionExpediente) {
		this.fechaIncorporacionExpediente = fechaIncorporacionExpediente;
	}

	public String getOrdenDocumentoExpediente() {
		return ordenDocumentoExpediente;
	}

	public void setOrdenDocumentoExpediente(String ordenDocumentoExpediente) {
		this.ordenDocumentoExpediente = ordenDocumentoExpediente;
	}
}
