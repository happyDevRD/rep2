package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_documento_solicitud")
public class DocumentoSolicitud implements Serializable {

	private static final long serialVersionUID = -6875700056386500359L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "solicitud")
	private Long solicitud;
	
	@Column(name = "archivo")
	private Long archivo;
	
	@Basic(optional = false)
	private String nombreArchivo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_subida")
	private Date fechaSubida;

	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Long solicitud) {
		this.solicitud = solicitud;
	}

	public Long getArchivo() {
		return archivo;
	}

	public void setArchivo(Long archivo) {
		this.archivo = archivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public Date getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(Date fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
	}

	public DocumentoSolicitud() {
		super();
	}
	
}
