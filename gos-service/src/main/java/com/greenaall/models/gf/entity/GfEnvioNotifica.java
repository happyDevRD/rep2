package com.greenaall.models.gf.entity;

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
@Table(name = "gf_envio_notifica")
public class GfEnvioNotifica implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String ACTIVO_SI = "S";
	public static final String ACTIVO_NO = "N";

	public static final String ESTADO_ENVIADA = "ENVIADA";
	public static final String ESTADO_PUESTA_DISPOSICION = "PUESTA_DISPOSICION";
	public static final String ESTADO_RECEPCIONADA = "RECEPCIONADA";
	public static final String ESTADO_CADUCADA = "CADUCADA";
	public static final String ESTADO_RECHAZADA = "RECHAZADA";
	public static final String ESTADO_ERROR = "ERROR";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_envio")
	private Long idEnvio;

	@Column(name = "id_notif")
	private Long idNotif;

	@Column(name = "id_envio_externo")
	private String idEnvioExterno;

	@Column(name = "estado_notifica")
	private String estadoNotifica;

	@Column(name = "cod_dir3")
	private String codDir3;

	@Column(name = "procedimiento_sia")
	private String procedimientoSia;

	@Column(name = "fec_envio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecEnvio;

	@Column(name = "fec_ult_sinc")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecUltSinc;

	@Column(name = "fec_recepcion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecRecepcion;

	@Column(name = "id_acuse_externo")
	private String idAcuseExterno;

	@Column(name = "mensaje_error")
	private String mensajeError;

	@Column(name = "activo")
	private String activo;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(Long idEnvio) {
		this.idEnvio = idEnvio;
	}

	public Long getIdNotif() {
		return idNotif;
	}

	public void setIdNotif(Long idNotif) {
		this.idNotif = idNotif;
	}

	public String getIdEnvioExterno() {
		return idEnvioExterno;
	}

	public void setIdEnvioExterno(String idEnvioExterno) {
		this.idEnvioExterno = idEnvioExterno;
	}

	public String getEstadoNotifica() {
		return estadoNotifica;
	}

	public void setEstadoNotifica(String estadoNotifica) {
		this.estadoNotifica = estadoNotifica;
	}

	public String getCodDir3() {
		return codDir3;
	}

	public void setCodDir3(String codDir3) {
		this.codDir3 = codDir3;
	}

	public String getProcedimientoSia() {
		return procedimientoSia;
	}

	public void setProcedimientoSia(String procedimientoSia) {
		this.procedimientoSia = procedimientoSia;
	}

	public Date getFecEnvio() {
		return fecEnvio;
	}

	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}

	public Date getFecUltSinc() {
		return fecUltSinc;
	}

	public void setFecUltSinc(Date fecUltSinc) {
		this.fecUltSinc = fecUltSinc;
	}

	public Date getFecRecepcion() {
		return fecRecepcion;
	}

	public void setFecRecepcion(Date fecRecepcion) {
		this.fecRecepcion = fecRecepcion;
	}

	public String getIdAcuseExterno() {
		return idAcuseExterno;
	}

	public void setIdAcuseExterno(String idAcuseExterno) {
		this.idAcuseExterno = idAcuseExterno;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
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
}
