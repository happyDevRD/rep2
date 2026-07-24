package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;
import com.greenaall.pe.dto.PersonaEntidadDto;

public class SolicitudDto implements Serializable {

	private static final long serialVersionUID = -2583304176014389924L;
	private Long id;
	private Date fecInicio;
	private Short ejercicio;
	private Integer numero;
	private Long idDocum;
	private Long idHisDocum;
	private String ejeNumRegis;
	private String asuRegis;
	private Long idPerso;
	private Long idHisPerso;
	private PersonaEntidadDto personaEntidad;
	private Long idRepre;
	private Long idHisRepre;
	private EnumEstadoSolicitud estado = EnumEstadoSolicitud.PENDIENTE;
	private String asunto;
	private Long departamento;
	private String usuario;
	private Long idExpediente;
	private Expediente expediente;
	private String motivoRechazo;
	private String nomRepre;
	private String dirRepre;
	private String usuContr;
	private Date fecContr;
	private short forNotif;

	public String getNomRepre() {
		return nomRepre;
	}

	public void setNomRepre(String nomRepre) {
		this.nomRepre = nomRepre;
	}

	public String getMotivoRechazo() {
		return motivoRechazo;
	}

	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
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

	public Long getIdRepre() {
		return idRepre;
	}

	public void setIdRepre(Long idRepre) {
		this.idRepre = idRepre;
	}

	public Long getIdHisRepre() {
		return idHisRepre;
	}

	public void setIdHisRepre(Long idHisRepre) {
		this.idHisRepre = idHisRepre;
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

	public Long getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Long idExpediente) {
		this.idExpediente = idExpediente;
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

	public PersonaEntidadDto getPersonaEntidad() {
		return personaEntidad;
	}

	public void setPersonaEntidad(PersonaEntidadDto personaEntidad) {
		this.personaEntidad = personaEntidad;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public String getEjeNumRegis() {
		return ejeNumRegis;
	}

	public void setEjeNumRegis(String ejeNumRegis) {
		this.ejeNumRegis = ejeNumRegis;
	}

	public String getAsuRegis() {
		return asuRegis;
	}

	public void setAsuRegis(String asuRegis) {
		this.asuRegis = asuRegis;
	}

	public String getDirRepre() {
		return dirRepre;
	}

	public void setDirRepre(String dirRepre) {
		this.dirRepre = dirRepre;
	}

	public short getForNotif() {
		return forNotif;
	}

	public void setForNotif(short forNotif) {
		this.forNotif = forNotif;
	}

}
