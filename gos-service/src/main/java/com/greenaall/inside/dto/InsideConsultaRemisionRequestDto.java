package com.greenaall.inside.dto;

public class InsideConsultaRemisionRequestDto {

	private Long idExpediente;
	private String codigoEnvioATEA;
	private String usuContr;

	public Long getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Long idExpediente) {
		this.idExpediente = idExpediente;
	}

	public String getCodigoEnvioATEA() {
		return codigoEnvioATEA;
	}

	public void setCodigoEnvioATEA(String codigoEnvioATEA) {
		this.codigoEnvioATEA = codigoEnvioATEA;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}
}
