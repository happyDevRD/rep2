package com.greenaall.models.pe.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author jmmoyano
 */

@Entity
@IdClass(PersonaEntidadPK.class)
@Table(name = "pe_persona_entidad")
public class PersonaEntidad implements Serializable {

	private static final long serialVersionUID = 4048070811588151024L;

	@Id
	@Column(name = "id_perso")
	private Long idPerso;
	@Id
	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Basic(optional = false)
	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMovim;
	@Basic(optional = false)
	@Column(name = "cod_movim")
	private String codMovim;
	@Column(name = "cau_movim")
	private Short cauMovim;
	@Basic(optional = false)
	@Column(name = "reg_activ")
	private boolean regActiv;
	@Basic(optional = false)
	@Column(name = "num_docum")
	private String numDocum;
	@Basic(optional = false)
	@Column(name = "tip_perso")
	private Short tipPerso;
	@Basic(optional = false)
	@Column(name = "niv_acces")
	private short nivAcces;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "particula1")
	private String particula1;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = "particula2")
	private String particula2;
	@Column(name = "apellido2")
	private String apellido2;
	@Column(name = "raz_socia")
	private String razSocia;
	@Column(name = "raz_soc_reduc")
	private String razSocReduc;
	@Basic(optional = false)
	@Column(name = "des_per_entid")
	private String desPerEntid;
	@Basic(optional = false)
	@Column(name = "dom_codif")
	private boolean domCodif;

	// agregado
	@Column(name = "id_his_domic")
	private Long idHisDomic;
	@Column(name = "id_domic")
	private Long idDomic;

	@Column(name = "localidad")
	private String localidad;
	@Column(name = "des_tip_via")
	private String desTipVia;
	@Column(name = "des_via")
	private String desVia;
	@Basic(optional = false)
	@Column(name = "ext_inf_numer")
	private short extInfNumer;
	@Column(name = "ext_inf_letra")
	private String extInfLetra;
	@Basic(optional = false)
	@Column(name = "ext_sup_numer")
	private short extSupNumer;
	@Column(name = "ext_sup_letra")
	private String extSupLetra;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "kilometro")
	private BigDecimal kilometro;
	@Column(name = "bloque")
	private String bloque;
	@Column(name = "portal")
	private String portal;
	@Column(name = "escalera")
	private String escalera;
	@Column(name = "planta")
	private String planta;
	@Column(name = "puerta")
	private String puerta;
	@Column(name = "edificio")
	private String edificio;
	@Column(name = "cod_local")
	private Short codLocal;
	@Basic(optional = false)
	@Column(name = "cod_posta")
	private int codPosta;
	@Column(name = "dir_posta")
	private String dirPosta;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;
	@Column(name = "cod_provi")
	private Short codProvi;
	@Column(name = "cod_munic")
	private Short codMunic;

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

	public Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(Date fecMovim) {
		this.fecMovim = fecMovim;
	}

	public String getCodMovim() {
		return codMovim;
	}

	public void setCodMovim(String codMovim) {
		this.codMovim = codMovim;
	}

	public Short getCauMovim() {
		return cauMovim;
	}

	public void setCauMovim(Short cauMovim) {
		this.cauMovim = cauMovim;
	}

	public boolean isRegActiv() {
		return regActiv;
	}

	public void setRegActiv(boolean regActiv) {
		this.regActiv = regActiv;
	}

	public String getNumDocum() {
		return numDocum;
	}

	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}

	public Short getTipPerso() {
		return tipPerso;
	}

	public void setTipPerso(Short tipPerso) {
		this.tipPerso = tipPerso;
	}

	public short getNivAcces() {
		return nivAcces;
	}

	public void setNivAcces(short nivAcces) {
		this.nivAcces = nivAcces;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getParticula1() {
		return particula1;
	}

	public void setParticula1(String particula1) {
		this.particula1 = particula1;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getParticula2() {
		return particula2;
	}

	public void setParticula2(String particula2) {
		this.particula2 = particula2;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getRazSocia() {
		return razSocia;
	}

	public void setRazSocia(String razSocia) {
		this.razSocia = razSocia;
	}

	public String getRazSocReduc() {
		return razSocReduc;
	}

	public void setRazSocReduc(String razSocReduc) {
		this.razSocReduc = razSocReduc;
	}

	public String getDesPerEntid() {
		return desPerEntid;
	}

	public void setDesPerEntid(String desPerEntid) {
		this.desPerEntid = desPerEntid;
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

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDesTipVia() {
		return desTipVia;
	}

	public void setDesTipVia(String desTipVia) {
		this.desTipVia = desTipVia;
	}

	public String getDesVia() {
		return desVia;
	}

	public void setDesVia(String desVia) {
		this.desVia = desVia;
	}

	public short getExtInfNumer() {
		return extInfNumer;
	}

	public void setExtInfNumer(short extInfNumer) {
		this.extInfNumer = extInfNumer;
	}

	public String getExtInfLetra() {
		return extInfLetra;
	}

	public void setExtInfLetra(String extInfLetra) {
		this.extInfLetra = extInfLetra;
	}

	public short getExtSupNumer() {
		return extSupNumer;
	}

	public void setExtSupNumer(short extSupNumer) {
		this.extSupNumer = extSupNumer;
	}

	public String getExtSupLetra() {
		return extSupLetra;
	}

	public void setExtSupLetra(String extSupLetra) {
		this.extSupLetra = extSupLetra;
	}

	public BigDecimal getKilometro() {
		return kilometro;
	}

	public void setKilometro(BigDecimal kilometro) {
		this.kilometro = kilometro;
	}

	public String getBloque() {
		return bloque;
	}

	public void setBloque(String bloque) {
		this.bloque = bloque;
	}

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}

	public String getEscalera() {
		return escalera;
	}

	public void setEscalera(String escalera) {
		this.escalera = escalera;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Short getCodLocal() {
		return codLocal;
	}

	public void setCodLocal(Short codLocal) {
		this.codLocal = codLocal;
	}

	public int getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(int codPosta) {
		this.codPosta = codPosta;
	}

	public String getDirPosta() {
		return dirPosta;
	}

	public void setDirPosta(String dirPosta) {
		this.dirPosta = dirPosta;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

}
