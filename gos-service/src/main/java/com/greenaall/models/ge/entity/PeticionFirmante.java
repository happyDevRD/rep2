package com.greenaall.models.ge.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(PeticionFirmantePK.class)
@Table(name = "ge_peticion_firmante")
public class PeticionFirmante implements Serializable {

	private static final long serialVersionUID = 1707307007848809344L;
	
	@Id
	@Column(name = "id_Peticion")
	private Long idPeticion;
	
	@Id
	@Column(name = "identificador")
	private String identificador;
	
	@Id
	@Column(name = "num_orden")
	private Short numOrden;
	
	@Column(name = "des_firmante")
	private String desFirmante;

	@Column(name = "estado")
	private Short estado;

	@Column(name = "fec_estado")
	private java.util.Date fecEstado;

	@Column(name = "cau_rechazo")
	private String cauRechazo;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fec_contr")
	private java.util.Date fecContr;

	public Long getIdPeticion() {
		return idPeticion;
	}

	public void setIdPeticion(Long idPeticion) {
		this.idPeticion = idPeticion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Short getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(Short numOrden) {
		this.numOrden = numOrden;
	}

	public String getDesFirmante() {
		return desFirmante;
	}

	public void setDesFirmante(String desFirmante) {
		this.desFirmante = desFirmante;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public java.util.Date getFecEstado() {
		return fecEstado;
	}

	public void setFecEstado(java.util.Date fecEstado) {
		this.fecEstado = fecEstado;
	}

	public String getCauRechazo() {
		return cauRechazo;
	}

	public void setCauRechazo(String cauRechazo) {
		this.cauRechazo = cauRechazo;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public java.util.Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(java.util.Date fecContr) {
		this.fecContr = fecContr;
	}

	public PeticionFirmante() {
		super();
	}
}
