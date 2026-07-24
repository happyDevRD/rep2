package com.greenaall.models.ge.entity;

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
@Table(name = "ge_certificado")
public class Certificado implements Serializable{

	private static final long serialVersionUID = -6406688856825905417L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_certificado")
    private Long idCertificado;
	
	 @Column(name = "cod_entid")
	 private Short codEntid;
	 
	 @Column(name = "descripcion")
	 private String descripcion;
	 
	 @Column(name = "id_his_perso")
	 private Long idHisPerso;
	 
	 @Column(name = "id_perso")
	 private Long idPerso;
	 
	 @Column(name = "certificado")
	 private String certificado;
	 
	 @Column(name = "password")
	 private String password;
	 
	 @Column(name = "usu_contr")
	 private String usuContr;
	    
	 @Column(name = "fec_contr")
	 @Temporal(TemporalType.TIMESTAMP)
	 private Date fecContr;

	public Long getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(Long idCertificado) {
		this.idCertificado = idCertificado;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Certificado() {
		super();
	}
}
