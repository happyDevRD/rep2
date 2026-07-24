package com.greenaall.models.gf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_tarifa")
public class GfTarifa implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarif")
	private Long idTarif;
	
	@Column(name = "cod_tarif")
	private String codTarif;
	
	@Column(name = "cod_entid")
	private Short codEntid;
	
	@Column(name = "fec_inici")
    @Temporal(TemporalType.DATE)
	private java.sql.Date fecInici;
	
	@Column(name = "fec_final")
    @Temporal(TemporalType.DATE)
	private java.sql.Date fecFinal;
	
	@Column(name = "des_tarif")
	private String desTarif;
	
	@Column(name = "id_grupo")
	private Long idGrupo;
	
	@Column(name = "id_proce")
	private Long idProce;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
    @Temporal(TemporalType.DATE)
	private java.util.Date fecContr;

	public Long getIdTarif() {
		return idTarif;
	}

	public void setIdTarif(Long idTarif) {
		this.idTarif = idTarif;
	}

	public String getCodTarif() {
		return codTarif;
	}

	public void setCodTarif(String codTarif) {
		this.codTarif = codTarif;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public java.sql.Date getFecInici() {
		return fecInici;
	}

	public void setFecInici(java.sql.Date fecInici) {
		this.fecInici = fecInici;
	}

	public java.sql.Date getFecFinal() {
		return fecFinal;
	}

	public void setFecFinal(java.sql.Date fecFinal) {
		this.fecFinal = fecFinal;
	}

	public String getDesTarif() {
		return desTarif;
	}

	public void setDesTarif(String desTarif) {
		this.desTarif = desTarif;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Long getIdProce() {
		return idProce;
	}

	public void setIdProce(Long idProce) {
		this.idProce = idProce;
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

	public GfTarifa() {
		super();
	}
	
}
