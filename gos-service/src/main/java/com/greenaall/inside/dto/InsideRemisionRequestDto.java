package com.greenaall.inside.dto;

public class InsideRemisionRequestDto {

	private Long idExpediente;
	private String idexpEni;
	private String dir3Juzgado;
	private InsideDatosRemisionJusticiaDto datosRemisionJusticia;
	private String usuContr;

	public Long getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Long idExpediente) {
		this.idExpediente = idExpediente;
	}

	public String getIdexpEni() {
		return idexpEni;
	}

	public void setIdexpEni(String idexpEni) {
		this.idexpEni = idexpEni;
	}

	public String getDir3Juzgado() {
		return dir3Juzgado;
	}

	public void setDir3Juzgado(String dir3Juzgado) {
		this.dir3Juzgado = dir3Juzgado;
	}

	public InsideDatosRemisionJusticiaDto getDatosRemisionJusticia() {
		return datosRemisionJusticia;
	}

	public void setDatosRemisionJusticia(InsideDatosRemisionJusticiaDto datosRemisionJusticia) {
		this.datosRemisionJusticia = datosRemisionJusticia;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}
}
