package com.greenaall.models.se.entity;

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
@Table(name = "se_tablon_anuncios")
public class SeTablonAnuncios implements Serializable {
	
	private static final long serialVersionUID = 302777819191550423L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_anunc")
    private Long idAnunc;
	
	@Basic(optional = false)
    @Column(name = "cod_entid")
    private Short codEntid;

	@Column(name = "id_org_eleme")
    private Long idOrgEleme;
	
	@Column(name = "tip_anunc")
    private Short tipAnunc;
	
	@Column(name = "des_anunc")
    private String desAnunc;
	
	@Column(name = "fec_desde")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecDesde;
	
	@Column(name = "fec_hasta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecHasta;
	
	@Column(name = "cod_archi")
    private Long codArchi;
	
	@Column(name = "eje_exped")
    private Short ejeExped;
	
	@Column(name = "num_exped")
    private long numExped;
	
	@Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Long getIdAnunc() {
		return idAnunc;
	}

	public void setIdAnunc(Long idAnunc) {
		this.idAnunc = idAnunc;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

	public Short getTipAnunc() {
		return tipAnunc;
	}

	public void setTipAnunc(Short tipAnunc) {
		this.tipAnunc = tipAnunc;
	}

	public String getDesAnunc() {
		return desAnunc;
	}

	public void setDesAnunc(String desAnunc) {
		this.desAnunc = desAnunc;
	}

	public Date getFecDesde() {
		return fecDesde;
	}

	public void setFecDesde(Date fecDesde) {
		this.fecDesde = fecDesde;
	}

	public Date getFecHasta() {
		return fecHasta;
	}

	public void setFecHasta(Date fecHasta) {
		this.fecHasta = fecHasta;
	}

	public Long getCodArchi() {
		return codArchi;
	}

	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}

	public Short getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}

	public long getNumExped() {
		return numExped;
	}

	public void setNumExped(long numExped) {
		this.numExped = numExped;
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

	public SeTablonAnuncios() {
		super();
	}
    
}
