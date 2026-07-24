package com.greenaall.inside.dto;

import com.greenaall.ge.dto.IndiceENI;
import com.greenaall.ge.dto.MetadatosENI;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;

public class InsideTareaDocumentoContextDto {

	private TareaTramiteExpediente tarea;
	private int orden;
	private MetadatosENI metadatos;
	private IndiceENI indice;
	private String contenidoBase64;

	public TareaTramiteExpediente getTarea() {
		return tarea;
	}

	public void setTarea(TareaTramiteExpediente tarea) {
		this.tarea = tarea;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public MetadatosENI getMetadatos() {
		return metadatos;
	}

	public void setMetadatos(MetadatosENI metadatos) {
		this.metadatos = metadatos;
	}

	public IndiceENI getIndice() {
		return indice;
	}

	public void setIndice(IndiceENI indice) {
		this.indice = indice;
	}

	public String getContenidoBase64() {
		return contenidoBase64;
	}

	public void setContenidoBase64(String contenidoBase64) {
		this.contenidoBase64 = contenidoBase64;
	}
}
