package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

public class TareaTramiteExpedienteDto implements Serializable {

	private static final long serialVersionUID = 2417215123297643902L;

	private Long id;
	private String descripcion;
	private Date fecFin;
	private Date fecInicio;
	private String firmante;
	private Short numero;
	private boolean visible;
	private Long archivo;
	private Long tareaProcedimiento;
	private Long tramite;
	private String usuario;
	private Long notificacion;
	private Short firmado;
	private Long propuestaResolucion;
	private Long idHisDocum;
	private Long idDocum;
	private Long tramitador;
	private String usuContr;
	private String numRegis;
	private String color;
	private String fecPlazo;
	private Short tipAnexo;
	private Short docAport;
	private String tipDocEni;
	private Short documentacion;
	private String nombreArchivo;
	private String ejeNumNotif;
	private Long idAnunc;
	private String desTramite;
	private Date FecFinPlazo;
	private Short ejeExped;
	private Integer numExped;
	private String titulo;
	private Short accion;

	public String getEjeNumNotif() {
		return ejeNumNotif;
	}

	public void setEjeNumNotif(String ejeNumNotif) {
		this.ejeNumNotif = ejeNumNotif;
	}

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

	public Date getFecFin() {
		return fecFin;
	}

	public void setFecFin(Date fecFin) {
		this.fecFin = fecFin;
	}

	public Date getFecInicio() {
		return fecInicio;
	}

	public void setFecInicio(Date fecInicio) {
		this.fecInicio = fecInicio;
	}

	public String getFirmante() {
		return firmante;
	}

	public void setFirmante(String firmante) {
		this.firmante = firmante;
	}

	public Short getNumero() {
		return numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	public boolean getVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Long getArchivo() {
		return archivo;
	}

	public void setArchivo(Long archivo) {
		this.archivo = archivo;
	}

	public Long getTareaProcedimiento() {
		return tareaProcedimiento;
	}

	public void setTareaProcedimiento(Long tareaProcedimiento) {
		this.tareaProcedimiento = tareaProcedimiento;
	}

	public Long getTramite() {
		return tramite;
	}

	public void setTramite(Long tramite) {
		this.tramite = tramite;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Long getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Long notificacion) {
		this.notificacion = notificacion;
	}

	public Short getFirmado() {
		return firmado;
	}

	public void setFirmado(Short firmado) {
		this.firmado = firmado;
	}

	public Long getPropuestaResolucion() {
		return propuestaResolucion;
	}

	public void setPropuestaResolucion(Long propuestaResolucion) {
		this.propuestaResolucion = propuestaResolucion;
	}

	public Long getIdHisDocum() {
		return idHisDocum;
	}

	public void setIdHisDocum(Long idHisDocum) {
		this.idHisDocum = idHisDocum;
	}

	public Long getIdDocum() {
		return idDocum;
	}

	public void setIdDocum(Long idDocum) {
		this.idDocum = idDocum;
	}

	public Long getTramitador() {
		return tramitador;
	}

	public void setTramitador(Long tramitador) {
		this.tramitador = tramitador;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public String getNumRegis() {
		return numRegis;
	}

	public void setNumRegis(String numRegis) {
		this.numRegis = numRegis;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFecPlazo() {
		return fecPlazo;
	}

	public void setFecPlazo(String fecPlazo) {
		this.fecPlazo = fecPlazo;
	}

	public Short getTipAnexo() {
		return tipAnexo;
	}

	public void setTipAnexo(Short tipAnexo) {
		this.tipAnexo = tipAnexo;
	}

	public Short getDocAport() {
		return docAport;
	}

	public void setDocAport(Short docAport) {
		this.docAport = docAport;
	}

	public String getTipDocEni() {
		return tipDocEni;
	}

	public void setTipDocEni(String tipDocEni) {
		this.tipDocEni = tipDocEni;
	}

	public Short getDocumentacion() {
		return documentacion;
	}

	public void setDocumentacion(Short documentacion) {
		this.documentacion = documentacion;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public Long getIdAnunc() {
		return idAnunc;
	}

	public void setIdAnunc(Long idAnunc) {
		this.idAnunc = idAnunc;
	}

	public String getDesTramite() {
		return desTramite;
	}

	public void setDesTramite(String desTramite) {
		this.desTramite = desTramite;
	}

	public Date getFecFinPlazo() {
		return FecFinPlazo;
	}

	public void setFecFinPlazo(Date fecFinPlazo) {
		FecFinPlazo = fecFinPlazo;
	}

	public Short getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}

	public Integer getNumExped() {
		return numExped;
	}

	public void setNumExped(Integer numExped) {
		this.numExped = numExped;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Short getAccion() {
		return accion;
	}

	public void setAccion(Short accion) {
		this.accion = accion;
	}

}
