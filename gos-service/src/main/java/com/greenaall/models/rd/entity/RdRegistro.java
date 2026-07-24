package com.greenaall.models.rd.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(RdRegistroPK.class)
@Table(name = "rd_registro")
public class RdRegistro implements Serializable {

	private static final long serialVersionUID = -7867156965736574588L;
	
	@Id
	@Column(name = "entidad")
	private Short entidad;
	
	@Id
	@Column(name = "cod_regis")
	private String codRegis;

	@Column(name = "des_regis")
	private String desRegis;
	
	@Column(name = "id_org_ubica")
	private Long idOrgUbica;
	
	@Column(name = "dom_codif")
	private boolean domCodif;
	
	@Column(name = "id_his_domic")
	private Long idHisDomic;
	
	@Column(name = "id_domic")
	private Long idDomic;
	
	@Column(name = "cod_provi")
	private Short codProvi;
	
	@Column(name = "cod_munic")
	private Short codMunic;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "cod_posta")
	private Integer codPosta;
	
	@Column(name = "tip_regis")
	private Short tipRegis;
	
	@Column(name = "num_con_entrada")
	private Short numConEntrada;
	
	@Column(name = "num_con_salida")
	private Short numConSalida;
	
	@Column(name = "id_org_eleme")
	private Long idOrgEleme;
	
	@Column(name = "cod_entid")
	private String codEntid;
	
	@Column(name = "sello")
	private String sello;
	
	@Column(name = "eje_rpt")
	private Short ejeRpt;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Short getEntidad() {
		return entidad;
	}

	public void setEntidad(Short entidad) {
		this.entidad = entidad;
	}

	public String getCodRegis() {
		return codRegis;
	}

	public void setCodRegis(String codRegis) {
		this.codRegis = codRegis;
	}

	public String getDesRegis() {
		return desRegis;
	}

	public void setDesRegis(String desRegis) {
		this.desRegis = desRegis;
	}

	public Long getIdOrgUbica() {
		return idOrgUbica;
	}

	public void setIdOrgUbica(Long idOrgUbica) {
		this.idOrgUbica = idOrgUbica;
	}

	public boolean isDomCodif() {
		return domCodif;
	}

	public void setDomCodif(boolean domCodif) {
		this.domCodif = domCodif;
	}

	public Long getIdHisDomic() {
		return idHisDomic;
	}

	public void setIdHisDomic(Long idHisDomic) {
		this.idHisDomic = idHisDomic;
	}

	public Long getIdDomic() {
		return idDomic;
	}

	public void setIdDomic(Long idDomic) {
		this.idDomic = idDomic;
	}

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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(Integer codPosta) {
		this.codPosta = codPosta;
	}

	public Short getTipRegis() {
		return tipRegis;
	}

	public void setTipRegis(Short tipRegis) {
		this.tipRegis = tipRegis;
	}

	public Short getNumConEntrada() {
		return numConEntrada;
	}

	public void setNumConEntrada(Short numConEntrada) {
		this.numConEntrada = numConEntrada;
	}

	public Short getNumConSalida() {
		return numConSalida;
	}

	public void setNumConSalida(Short numConSalida) {
		this.numConSalida = numConSalida;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

	public String getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(String codEntid) {
		this.codEntid = codEntid;
	}

	public String getSello() {
		return sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	public Short getEjeRpt() {
		return ejeRpt;
	}

	public void setEjeRpt(Short ejeRpt) {
		this.ejeRpt = ejeRpt;
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

	public RdRegistro() {
		super();
	}

}
