package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumEstadoMensaje;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_mensaje")
public class Mensaje implements Serializable{

	private static final long serialVersionUID = -7147335058501303987L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Basic(optional = false)
    @Column(name="fec_envio")
    private Date fecEnvio;
    
    @Basic(optional = false)
    @Column(name="descripcion")
    private String descripcion;
    
    @Basic
    @Column(name="fec_lectura")
    private Date fecLectura;
    
    @Basic
    @Column(name="fec_tramitacion")
    private Date fecTramitacion;
    
    @Basic
    @Column(name="fec_rechazo")
    private Date fecRechazo;
    
    @Column(name = "remitente")
    private Long remitente; 
    
    @Column(name = "destinatario")
    private Long destinatario;
    
    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    @Column(name="estado")
    private EnumEstadoMensaje estado = EnumEstadoMensaje.PENDIENTE;
    
    @Basic(optional = false)
    @Column(name = "informativo")
    private boolean informativo;
    
    @Column(name = "descripcion_rechazo")
    private String descripcionRechazo;
    
    @Column(name = "id_exped")
    private Long idExped;
    
    @Column(name = "usu_contr")
	private String usuContr;
    
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getId() {
		return id;
	}

	public Long getIdExped() {
		return idExped;
	}

	public void setIdExped(Long idExped) {
		this.idExped = idExped;
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

	public Mensaje() {
		super();
	}
	
}
