package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.entity.enums.EnumFormaAperturaExpediente;
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
@Table(name = "ex_expediente")
public class Expediente implements Serializable {

	private static final long serialVersionUID = -8654424451182477485L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Basic(optional = false)
	@Column(name = "ejercicio")
	private Short ejercicio;

	@Enumerated(EnumType.STRING)
	@Basic(optional = false)
	@Column(name = "estado")
	private EnumEstadoExpediente estado;

	@Enumerated(EnumType.STRING)
	@Basic(optional = false)
	@Column(name = "fase")
	private EnumFaseExpediente fase;;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_archivo")
	private Date fecArchivo;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_cancelacion")
	private Date fecCancelacion;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_fin")
	private Date fecFin;

	@Temporal(TemporalType.DATE)
	@Basic(optional = false)
	@Column(name = "fec_inicio")
	private Date fecInicio;

	@Enumerated(EnumType.STRING)
	@Basic(optional = false)
	@Column(name = "forma_apertura")
	private EnumFormaAperturaExpediente formaApertura;

	@Basic(optional = false)
	@Column(name = "numero")
	private Integer numero;

	@Basic(optional = false)
	@Column(name = "titulo")
	private String titulo;

	@Column(name = "departamento")
	private Long departamento;

	@Column(name = "instructor")
	private String instructor;

	@Column(name = "procedimiento")
	private Long procedimiento;

	@Column(name = "solicitud")
	private Long solicitud;

	@Column(name = "id_perso")
	private Long idPerso;

	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Column(name = "id_repre")
	private Long idRepre;

	@Column(name = "id_his_repre")
	private Long idHisRepre;

	@Column(name = "id_docum")
	private Long idDocum;

	@Column(name = "id_his_docum")
	private Long idHisDocum;

	@Column(name = "archivo")
	private Long archivo;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

	/** Solo se usan al crear el expediente (preferencia de notificación del interesado); no se persisten en ex_expediente. */
	@jakarta.persistence.Transient
	private String email;

	@jakarta.persistence.Transient
	private Short forNotif;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getForNotif() {
		return forNotif;
	}

	public void setForNotif(Short forNotif) {
		this.forNotif = forNotif;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Short ejercicio) {
		this.ejercicio = ejercicio;
	}

	public EnumEstadoExpediente getEstado() {
		return estado;
	}

	public void setEstado(EnumEstadoExpediente estado) {
		this.estado = estado;
	}

	public EnumFaseExpediente getFase() {
		return fase;
	}

	public void setFase(EnumFaseExpediente fase) {
		this.fase = fase;
	}

	public Date getFecArchivo() {
		return fecArchivo;
	}

	public void setFecArchivo(Date fecArchivo) {
		this.fecArchivo = fecArchivo;
	}

	public Date getFecCancelacion() {
		return fecCancelacion;
	}

	public void setFecCancelacion(Date fecCancelacion) {
		this.fecCancelacion = fecCancelacion;
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

	public EnumFormaAperturaExpediente getFormaApertura() {
		return formaApertura;
	}

	public void setFormaApertura(EnumFormaAperturaExpediente formaApertura) {
		this.formaApertura = formaApertura;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Long departamento) {
		this.departamento = departamento;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Long getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Long procedimiento) {
		this.procedimiento = procedimiento;
	}

	public Long getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Long solicitud) {
		this.solicitud = solicitud;
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
	
	public Long getArchivo() {
		return archivo;
	}

	public void setArchivo(Long archivo) {
		this.archivo = archivo;
	}

	public Expediente() {
		super();
	}

}
