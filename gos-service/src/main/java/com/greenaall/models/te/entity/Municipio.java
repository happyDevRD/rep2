package com.greenaall.models.te.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "te_municipio")
@IdClass(MunicipioPK.class)
public class Municipio implements Serializable {

	private static final long serialVersionUID = 8154490373948803018L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "cod_provi")
	private Short codProvi;
	
	@Id
	@Basic(optional = false)
	@Column(name = "cod_munic")
	private Short codMunic;
		
	@Basic(optional = false)
	@Column(name = "des_munic")
	private String desMunic;
	@Basic(optional = false)
	@Column(name = "num_hab_tot")
	private int numHabTot;
	@Basic(optional = false)
	@Column(name = "num_hab_hom")
	private int numHabHom;
	@Basic(optional = false)
	@Column(name = "num_hab_muj")
	private int numHabMuj;
	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;
	
	public Short getCodProvi() {
		return codProvi;
	}
	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}
	public Short getCodMunic() {
		return codMunic;
	}
	public void setCodMunic(Short codMunic) {
		this.codMunic = codMunic;
	}
	public String getDesMunic() {
		return desMunic;
	}
	public void setDesMunic(String desMunic) {
		this.desMunic = desMunic;
	}
	public int getNumHabTot() {
		return numHabTot;
	}
	public void setNumHabTot(int numHabTot) {
		this.numHabTot = numHabTot;
	}
	public int getNumHabHom() {
		return numHabHom;
	}
	public void setNumHabHom(int numHabHom) {
		this.numHabHom = numHabHom;
	}
	public int getNumHabMuj() {
		return numHabMuj;
	}
	public void setNumHabMuj(int numHabMuj) {
		this.numHabMuj = numHabMuj;
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
