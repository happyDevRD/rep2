package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;
import com.greenaall.models.ad.entity.OrganizacionElemento;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_procedimiento")
public class Procedimiento implements Serializable {

	private static final long serialVersionUID = -736820419754832649L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name= "descripcion")
	@Basic(optional = false)
	private String descripcion;
	// @Basic(optional = false)
	@JoinColumn(name = "departamento", referencedColumnName = "id_org_eleme")
	@ManyToOne(optional = false)
	private OrganizacionElemento departamento;
	@Basic(optional = false)
	// @Column(name = "codigo_sia")
	private String codigoSia;
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "procedimiento")
	private List<Expediente> expedientesAsociados;*/
	
	@Column(name = "id_mat_proce")
	private Long idMatProce;
	
	@Column(name = "modalidad")
	private Long modalidad;
	
	@Column(name = "info")
	private String info;
	
	@Column(name = "siglas")
	private String siglas;
	
	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;
	
	public Procedimiento(Long id) {
		this.id = id;
	}

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

	public OrganizacionElemento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(OrganizacionElemento departamento) {
		this.departamento = departamento;
	}

	public String getCodigoSia() {
		return codigoSia;
	}

	public void setCodigoSia(String codigoSia) {
		this.codigoSia = codigoSia;
	}

/*	public List<Expediente> getExpedientesAsociados() {
		return expedientesAsociados;
	}

	public void setExpedientesAsociados(List<Expediente> expedientesAsociados) {
		this.expedientesAsociados = expedientesAsociados;
	}*/

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

	public Long getIdMatProce() {
		return idMatProce;
	}

	public void setIdMatProce(Long idMatProce) {
		this.idMatProce = idMatProce;
	}

	public Long getModalidad() {
		return modalidad;
	}

	public void setModalidad(Long modalidad) {
		this.modalidad = modalidad;
	}

	public Procedimiento() {
		super();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	
	
	
}
