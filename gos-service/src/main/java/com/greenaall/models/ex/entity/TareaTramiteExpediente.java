package com.greenaall.models.ex.entity;

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
@Table(name = "ex_tarea_tramite_expediente")
public class TareaTramiteExpediente implements Serializable {

	private static final long serialVersionUID = 7670431898230617520L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic(optional = false)
	@Column(name = "descripcion")
	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_fin")
	private Date fecFin;

	@Basic(optional = false)
	@Column(name = "fec_inicio")
	private Date fecInicio;

	@Column(name = "firmante")
	private String firmante;

	@Column(name = "numero")
	private Short numero;

	@Column(name = "visible")
	private Boolean visible;

	@Column(name = "archivo")
	private Long archivo;

	@Column(name = "tarea_procedimiento")
	private Long tareaProcedimiento;

	@Column(name = "tramite")
	private Long tramite;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "notificacion")
	private Long notificacion;

	@Column(name = "firmado")
	private Short firmado;

	@Column(name = "propuesta_resolucion")
	private Long propuestaResolucion;

	@Column(name = "id_his_docum")
	private Long idHisDocum;

	@Column(name = "id_docum")
	private Long idDocum;

	@Column(name = "tramitador")
	private Long tramitador;

	@Column(name = "tip_anexo")
	private Short tipAnexo;

	@Column(name = "doc_aport")
	private Short docAport;

	@Column(name = "tip_doc_eni")
	private String tipDocEni;

	@Column(name = "documentacion")
	private Short documentacion;
	
	@Column(name = "id_anunc")
	private Long idAnunc;
	
	@Column(name = "accion")
	private Short accion;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
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

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
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

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
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
	
	public Long getIdAnunc() {
		return idAnunc;
	}

	public void setIdAnunc(Long idAnunc) {
		this.idAnunc = idAnunc;
	}

	public Short getAccion() {
		return accion;
	}

	public void setAccion(Short accion) {
		this.accion = accion;
	}

	public TareaTramiteExpediente() {
		super();
	}
}
