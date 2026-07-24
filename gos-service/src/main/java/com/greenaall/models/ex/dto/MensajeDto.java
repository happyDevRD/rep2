package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumEstadoMensaje;


public class MensajeDto implements Serializable{

	private static final long serialVersionUID = 7439946817989040005L;
	private Long id;
    private Date fecEnvio;
    private String descripcion;
    private Date fecLectura;
    private Date fecTramitacion;
    private Date fecRechazo;
    private Long remitente; 
    private Long destinatario;
    private EnumEstadoMensaje estado = EnumEstadoMensaje.PENDIENTE;
    private boolean informativo;
    private String descripcionRechazo;
    private Long idExped;
    private String nomRemit;
    private String nomDesti;
    private String usuContr;
    
	public String getNomRemit() {
		return nomRemit;
	}
	public void setNomRemit(String nomRemit) {
		this.nomRemit = nomRemit;
	}
	public String getNomDesti() {
		return nomDesti;
	}
	public void setNomDesti(String nomDesti) {
		this.nomDesti = nomDesti;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecEnvio() {
		return fecEnvio;
	}
	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecLectura() {
		return fecLectura;
	}
	public void setFecLectura(Date fecLectura) {
		this.fecLectura = fecLectura;
	}
	public Date getFecTramitacion() {
		return fecTramitacion;
	}
	public void setFecTramitacion(Date fecTramitacion) {
		this.fecTramitacion = fecTramitacion;
	}
	public Date getFecRechazo() {
		return fecRechazo;
	}
	public void setFecRechazo(Date fecRechazo) {
		this.fecRechazo = fecRechazo;
	}
	public Long getRemitente() {
		return remitente;
	}
	public void setRemitente(Long remitente) {
		this.remitente = remitente;
	}
	public Long getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Long destinatario) {
		this.destinatario = destinatario;
	}
	public EnumEstadoMensaje getEstado() {
		return estado;
	}
	public void setEstado(EnumEstadoMensaje estado) {
		this.estado = estado;
	}
	public boolean isInformativo() {
		return informativo;
	}
	public void setInformativo(boolean informativo) {
		this.informativo = informativo;
	}
	public String getDescripcionRechazo() {
		return descripcionRechazo;
	}
	public void setDescripcionRechazo(String descripcionRechazo) {
		this.descripcionRechazo = descripcionRechazo;
	}
	public Long getIdExped() {
		return idExped;
	}
	public void setIdExped(Long idExped) {
		this.idExped = idExped;
	}
	public String getUsuContr() {
		return usuContr;
	}
	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}
    
    
}
