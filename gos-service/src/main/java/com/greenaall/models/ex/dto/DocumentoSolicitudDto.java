package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

public class DocumentoSolicitudDto implements Serializable {
	
	private static final long serialVersionUID = 2500212188507653068L;
	private String descripcion;
	private Long idSolicitud;
	private Date fechaSubida;
	private String nombreArchivo;
	private String ficBas64;
	private String usuContr;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(Long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public Date getFechaSubida() {
		return fechaSubida;
	}
	public void setFechaSubida(Date fechaSubida) {
		this.fechaSubida = fechaSubida;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public String getFicBas64() {
		return ficBas64;
	}
	public void setFicBas64(String ficBas64) {
		this.ficBas64 = ficBas64;
	}
	public String getUsuContr() {
		return usuContr;
	}
	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}
	public DocumentoSolicitudDto() {
		super();
		
	}
	
}
