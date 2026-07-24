package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.entity.enums.EnumFormaAperturaExpediente;
import com.greenaall.pe.dto.PersonaEntidadDto;

public class ExpedienteDto implements Serializable {

	private static final long serialVersionUID = 4009657579389926888L;
	public static final Short FORMA_NOTIFICACION_PAPEL = Short.valueOf("0"); // correo postal
	public static final Short FORMA_NOTIFICACION_TELEMATICA = Short.valueOf("1"); // email

	private Long id;
	private Short ejercicio;
	private EnumEstadoExpediente estado = EnumEstadoExpediente.ABIERTO;
	private EnumFaseExpediente fase = EnumFaseExpediente.INICIO;
	private Date fecArchivo;
	private Date fecCancelacion;
	private Date fecFin;
	private Date fecInicio;
	private EnumFormaAperturaExpediente formaApertura = EnumFormaAperturaExpediente.INSTANCIA;
	private Integer numero;
	private String titulo;
	private Long departamento;
	private String instructor;
	private Long idProc;
	private Long idSolic;
	private PersonaEntidadDto personaEntidad;
	private Procedimiento procedimiento;
	private Solicitud solicitud;
	private Short forNotif;
	private String email;
	private String nomRepre;
	private Long idPerso;
	private Long idHisPerso;
	private Long idRepre;
	private Long idDocum;
	private Long idHisDocum;
	private Long archivo;
	private String numRegis;
	private String usuContr;
	private String forNotifTexto;
	private String serieDocumental;
	private String insideEstado;

	public String getInsideEstado() {
		return insideEstado;
	}

	public void setInsideEstado(String insideEstado) {
		this.insideEstado = insideEstado;
	}

	public String getForNotifTexto() {
		return forNotifTexto;
	}

	public void setForNotifTexto(String forNotifTexto) {
		this.forNotifTexto = forNotifTexto;
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

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
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

	private Long idHisRepre;

	public String getNomRepre() {
		return nomRepre;
	}

	public void setNomRepre(String nomRepre) {
		this.nomRepre = nomRepre;
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

	public Long getIdProc() {
		return idProc;
	}

	public void setIdProc(Long idProc) {
		this.idProc = idProc;
	}

	public Long getIdSolic() {
		return idSolic;
	}

	public void setIdSolic(Long idSolic) {
		this.idSolic = idSolic;
	}

	public PersonaEntidadDto getPersonaEntidad() {
		return personaEntidad;
	}

	public void setPersonaEntidad(PersonaEntidadDto personaEntidad) {
		this.personaEntidad = personaEntidad;
	}

	public Procedimiento getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public Short getForNotif() {
		return forNotif;
	}

	public void setForNotif(Short forNotif) {
		this.forNotif = forNotif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumRegis() {
		return numRegis;
	}

	public void setNumRegis(String numRegis) {
		this.numRegis = numRegis;
	}

	public Long getArchivo() {
		return archivo;
	}

	public void setArchivo(Long archivo) {
		this.archivo = archivo;
	}

	public String getSerieDocumental() {
		return serieDocumental;
	}

	public void setSerieDocumental(String serieDocumental) {
		this.serieDocumental = serieDocumental;
	}
}
