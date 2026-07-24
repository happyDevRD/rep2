package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ad.entity.OrganizacionElemento;

public class ProcedimientoDto implements Serializable {

	private static final long serialVersionUID = 6924809571325306493L;
	private Long id;
	private String descripcion;
	private OrganizacionElemento departamento;
	private String codigoSia;
	private Long idMatProce;
	private String desMateria;
	private Long modalidad;
	private String DesEleme;
	private String siglas;
	private String usuContr;
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

	public OrganizacionElemento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(OrganizacionElemento departamento) {
		this.departamento = departamento;
	}

	public String getCodigoSia() {
		return codigoSia;
	}

	public void setCodigoSia(String codigoSia) {
		this.codigoSia = codigoSia;
	}

	public Long getIdMatProce() {
		return idMatProce;
	}

	public void setIdMatProce(Long idMatProce) {
		this.idMatProce = idMatProce;
	}

	public Long getModalidad() {
		return modalidad;
	}

	public void setModalidad(Long modalidad) {
		this.modalidad = modalidad;
	}

	public String getDesEleme() {
		return DesEleme;
	}

	public void setDesEleme(String desEleme) {
		DesEleme = desEleme;
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

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public String getDesMateria() {
		return desMateria;
	}

	public void setDesMateria(String desMateria) {
		this.desMateria = desMateria;
	}

}
