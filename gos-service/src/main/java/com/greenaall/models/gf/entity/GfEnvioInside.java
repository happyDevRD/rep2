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
@Table(name = "gf_envio_inside")
public class GfEnvioInside implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String ACTIVO_SI = "S";
	public static final String ACTIVO_NO = "N";

	public static final String ESTADO_PENDIENTE = "PENDIENTE";
	public static final String ESTADO_ENVIADO = "ENVIADO";
	public static final String ESTADO_ERROR = "ERROR";
	public static final String ESTADO_SIMULADO = "SIMULADO";

	public static final String DRY_RUN_SI = "S";
	public static final String DRY_RUN_NO = "N";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_envio")
	private Long idEnvio;

	@Column(name = "id_expediente")
	private Long idExpediente;

	@Column(name = "id_tarea")
	private Long idTarea;

	@Column(name = "operacion")
	private String operacion;

	@Column(name = "estado_envio")
	private String estadoEnvio;

	@Column(name = "codigo_respuesta")
	private String codigoRespuesta;

	@Column(name = "descripcion_respuesta")
	private String descripcionRespuesta;

	@Column(name = "identificador_eni")
	private String identificadorEni;

	@Column(name = "csv")
	private String csv;

	@Column(name = "codigo_envio_atea")
	private String codigoEnvioAtea;

	@Column(name = "modo_dry_run")
	private String modoDryRun;

	@Column(name = "mensaje_error")
	private String mensajeError;

	@Column(name = "activo")
	private String activo;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_envio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecEnvio;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(Long idEnvio) {
		this.idEnvio = idEnvio;
	}

	public Long getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Long idExpediente) {
		this.idExpediente = idExpediente;
	}

	public Long getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getEstadoEnvio() {
		return estadoEnvio;
	}

	public void setEstadoEnvio(String estadoEnvio) {
		this.estadoEnvio = estadoEnvio;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}

	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}

	public String getIdentificadorEni() {
		return identificadorEni;
	}

	public void setIdentificadorEni(String identificadorEni) {
		this.identificadorEni = identificadorEni;
	}

	public String getCsv() {
		return csv;
	}

	public void setCsv(String csv) {
		this.csv = csv;
	}

	public String getCodigoEnvioAtea() {
		return codigoEnvioAtea;
	}

	public void setCodigoEnvioAtea(String codigoEnvioAtea) {
		this.codigoEnvioAtea = codigoEnvioAtea;
	}

	public String getModoDryRun() {
		return modoDryRun;
	}

	public void setModoDryRun(String modoDryRun) {
		this.modoDryRun = modoDryRun;
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

	public Date getFecEnvio() {
		return fecEnvio;
	}

	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
	}
}
