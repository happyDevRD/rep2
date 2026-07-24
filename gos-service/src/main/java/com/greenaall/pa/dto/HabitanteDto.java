package com.greenaall.pa.dto;

import java.io.Serializable;

public class HabitanteDto implements Serializable {

	private static final long serialVersionUID = 7307456474137639503L;
	private String nombre;
	private String particula1;
	private String apellido1;
	private String particula2;
	private String apellido2;
	private String tipDocum;
	private String numDocum;
	private String domicilio;
	private Short distrito;
	private String seccion;
	private String numHojPadro;
	private Integer numFamil;
	private Integer numOrden;
	private String fecPadro;
	private String fecNacim;
	private String proNacim;
	private String munNacim;
	private String situacion;
	private String fecSituacion;
	private String telefono;
	private String email;
	private String observaciones;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getParticula1() {
		return particula1;
	}

	public void setParticula1(String particula1) {
		this.particula1 = particula1;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getParticula2() {
		return particula2;
	}

	public void setParticula2(String particula2) {
		this.particula2 = particula2;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTipDocum() {
		return tipDocum;
	}

	public void setTipDocum(String tipDocum) {
		this.tipDocum = tipDocum;
	}

	public String getNumDocum() {
		return numDocum;
	}

	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Short getDistrito() {
		return distrito;
	}

	public void setDistrito(Short distrito) {
		this.distrito = distrito;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getNumHojPadro() {
		return numHojPadro;
	}

	public void setNumHojPadro(String numHojPadro) {
		this.numHojPadro = numHojPadro;
	}

	public Integer getNumFamil() {
		return numFamil;
	}

	public void setNumFamil(Integer numFamil) {
		this.numFamil = numFamil;
	}

	public Integer getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(Integer numOrden) {
		this.numOrden = numOrden;
	}

	public String getFecPadro() {
		return fecPadro;
	}

	public void setFecPadro(String fecPadro) {
		this.fecPadro = fecPadro;
	}

	public String getFecNacim() {
		return fecNacim;
	}

	public void setFecNacim(String fecNacim) {
		this.fecNacim = fecNacim;
	}

	public String getProNacim() {
		return proNacim;
	}

	public void setProNacim(String proNacim) {
		this.proNacim = proNacim;
	}

	public String getMunNacim() {
		return munNacim;
	}

	public void setMunNacim(String munNacim) {
		this.munNacim = munNacim;
	}

	public String getSituacion() {
		return situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	public String getFecSituacion() {
		return fecSituacion;
	}

	public void setFecSituacion(String fecSituacion) {
		this.fecSituacion = fecSituacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public HabitanteDto() {
		super();
	}

}
