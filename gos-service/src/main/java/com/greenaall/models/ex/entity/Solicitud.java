package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;
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
@Table(name = "ex_solicitud")
public class Solicitud implements Serializable {

	private static final long serialVersionUID = -5304584859972529212L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	@Basic(optional = false)
	private Date fecInicio;
	@Basic(optional = false)
	private Short ejercicio;
	@Basic(optional = false)
	private Integer numero;
	
	@Column(name = "id_docum")
	private Long idDocum;
	
	@Column(name = "id_his_docum")
	private Long idHisDocum;

	
	@Column(name = "id_perso")
	private Long idPerso;
	
	@Column(name = "id_his_perso")
	private Long idHisPerso;
	
	
	@Column(name = "id_repre")
	private Long idRepre;
	
	@Column(name = "id_his_repre")
	private Long idHisRepre;

	@Enumerated(EnumType.STRING)
	@Basic(optional = false)
	private EnumEstadoSolicitud estado;

	@Basic(optional = false)
	private String asunto;
	
	@Column(name = "motivo_rechazo")
	private String motivoRechazo;
	
	@Column(name = "departamento")
	private Long departamento;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "expediente")
	private Long expediente;

	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Solicitud(Long idSolicitud) {
		this.id = idSolicitud;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecInicio() {
		return fecInicio;
	}

	public void setFecInicio(Date fecInicio) {
		this.fecInicio = fecInicio;
	}

	public Short getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Short ejercicio) {
		this.ejercicio = ejercicio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	

	public Long getIdHisRepre() {
		return idHisRepre;
	}

	public void setIdHisRepre(Long idHisRepre) {
		this.idHisRepre = idHisRepre;
	}

	public Long getIdRepre() {
		return idRepre;
	}

	public void setIdRepre(Long idRepre) {
		this.idRepre = idRepre;
	}

	

	public EnumEstadoSolicitud getEstado() {
		return estado;
	}

	public void setEstado(EnumEstadoSolicitud estado) {
		this.estado = estado;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
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
	

	public Long getIdDocum() {
		return idDocum;
	}

	public void setIdDocum(Long idDocum) {
		this.idDocum = idDocum;
	}

	public Long getIdHisDocum() {
		return idHisDocum;
	}

	public void setIdHisDocum(Long idHisDocum) {
		this.idHisDocum = idHisDocum;
	}

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Long departamento) {
		this.departamento = departamento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Long getExpediente() {
		return expediente;
	}

	public void setExpediente(Long expediente) {
		this.expediente = expediente;
	}

	
	public String getMotivoRechazo() {
		return motivoRechazo;
	}

	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
	}

	public Solicitud() {
		super();
	}
	
	
}
