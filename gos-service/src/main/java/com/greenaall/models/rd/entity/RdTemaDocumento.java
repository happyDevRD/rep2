package com.greenaall.models.rd.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "rd_tema_documento")
public class RdTemaDocumento implements Serializable {

	private static final long serialVersionUID = -1408510848156292436L;

	@Id
	@Basic(optional = false)
	@Column(name = "cod_tema")
	private String codTema;
	
	@Basic(optional = false)
	@Column(name = "des_tema")
	private String desTema;
	
	@Column(name = "extracto")
	private String extracto;
	
	@Column(name = "id_org_eleme")
	private Long idOrgEleme;
	
	@Basic(optional = false)
	@Column(name = "ind_activ")
	private boolean indActiv;
	
	@Column(name = "cod_proc")
	private String codProc;
	
	@Column(name = "instructor")
	private String instructor;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public RdTemaDocumento() {
		super();
	}

	public String getCodTema() {
		return codTema;
	}

	public void setCodTema(String codTema) {
		this.codTema = codTema;
	}

	public String getDesTema() {
		return desTema;
	}

	public void setDesTema(String desTema) {
		this.desTema = desTema;
	}

	public String getExtracto() {
		return extracto;
	}

	public void setExtracto(String extracto) {
		this.extracto = extracto;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

	public boolean isIndActiv() {
		return indActiv;
	}

	public void setIndActiv(boolean indActiv) {
		this.indActiv = indActiv;
	}

	public String getCodProc() {
		return codProc;
	}

	public void setCodProc(String codProc) {
		this.codProc = codProc;
	}
	
	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
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
