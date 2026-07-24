package com.greenaall.pe.dto;

import java.util.Date;


public class NotificacionDto {
	
	private Long idNotif;
	private Short ejeNotif;
	private Integer numNotif;
	private Date fecNotif;
	private Date fecRecNotif;
	private Long idHisPerso;
	private Long idPerso;
	private PersonaEntidadDto personaEntidad;
	private Short situacion;
	private String desSituacion;
	private Short motNotif;
	private String desMotNotif;
	private Short receptor;
	private String desReceptor;
	private Integer numBop;
	private Short bop;
	private String desBop;
	private Date fecEmiBop;
	private Date fecPubBop;
	private Short notificador;
	private String desNotificador;
	private Short codProvi;
	private String desProvi;
	private Short codMunic;
	private String desMunic;
	private String tipVial;
	private String desVial;
	private Short numInfer;
	private String letInfer;
	private Short numSuper;
	private String bloque;
	private String portal;
	private String escalera;
	private String planta;
	private String puerta;
	private String localidad;
	private String domicilio;
	private Integer codPosta;
	private Date fecArchi;
	private Short ejeExped;
	private String numExped;
	private String observacion;
	private Date fecRegistSalid;
	private Integer numRegisSalid;
	private Date fecEnvio;
	private Short forNotif;
	private Date fecCaduc;
	private Long numEnvioTeu;
	private Long codArchi;
	private Long codArchiAcuse;
	private String usuContr;
	private String numDocum;
	private String desPerEntid;
	private Long idTarea;
	private Long idTramite;
	private Short numTarea;
	private String desTramite;
	private String notificacion;
	private Long idHisRepre;
	private Long idRepre;
	
	public Long getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}
	public Long getIdTramite() {
		return idTramite;
	}
	public void setIdTramite(Long idTramite) {
		this.idTramite = idTramite;
	}
	public Short getNumTarea() {
		return numTarea;
	}
	public void setNumTarea(Short numTarea) {
		this.numTarea = numTarea;
	}
	public String getDesTramite() {
		return desTramite;
	}
	public void setDesTramite(String desTramite) {
		this.desTramite = desTramite;
	}
	public String getNumDocum() {
		return numDocum;
	}
	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}
	public String getDesPerEntid() {
		return desPerEntid;
	}
	public void setDesPerEntid(String desPerEntid) {
		this.desPerEntid = desPerEntid;
	}
	public Long getIdNotif() {
		return idNotif;
	}
	public void setIdNotif(Long idNotif) {
		this.idNotif = idNotif;
	}
	public Short getEjeNotif() {
		return ejeNotif;
	}
	public void setEjeNotif(Short ejeNotif) {
		this.ejeNotif = ejeNotif;
	}
	public Integer getNumNotif() {
		return numNotif;
	}
	public void setNumNotif(Integer numNotif) {
		this.numNotif = numNotif;
	}
	public Date getFecNotif() {
		return fecNotif;
	}
	public void setFecNotif(Date fecNotif) {
		this.fecNotif = fecNotif;
	}
	public Date getFecRecNotif() {
		return fecRecNotif;
	}
	public void setFecRecNotif(Date fecRecNotif) {
		this.fecRecNotif = fecRecNotif;
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
	public PersonaEntidadDto getPersonaEntidad() {
		return personaEntidad;
	}
	public void setPersonaEntidad(PersonaEntidadDto personaEntidad) {
		this.personaEntidad = personaEntidad;
	}
	public Short getSituacion() {
		return situacion;
	}
	public void setSituacion(Short situacion) {
		this.situacion = situacion;
	}
	public Short getMotNotif() {
		return motNotif;
	}
	public void setMotNotif(Short motNotif) {
		this.motNotif = motNotif;
	}
	public Short getReceptor() {
		return receptor;
	}
	public void setReceptor(Short receptor) {
		this.receptor = receptor;
	}
	public Integer getNumBop() {
		return numBop;
	}
	public void setNumBop(Integer numBop) {
		this.numBop = numBop;
	}
	public Short getBop() {
		return bop;
	}
	public void setBop(Short bop) {
		this.bop = bop;
	}
	public Date getFecEmiBop() {
		return fecEmiBop;
	}
	public void setFecEmiBop(Date fecEmiBop) {
		this.fecEmiBop = fecEmiBop;
	}
	public Date getFecPubBop() {
		return fecPubBop;
	}
	public void setFecPubBop(Date fecPubBop) {
		this.fecPubBop = fecPubBop;
	}
	public Short getNotificador() {
		return notificador;
	}
	public void setNotificador(Short notificador) {
		this.notificador = notificador;
	}
	public String getDesNotificador() {
		return desNotificador;
	}
	public void setDesNotificador(String desNotificador) {
		this.desNotificador = desNotificador;
	}
	public Short getCodProvi() {
		return codProvi;
	}
	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}
	public String getDesProvi() {
		return desProvi;
	}
	public void setDesProvi(String desProvi) {
		this.desProvi = desProvi;
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
	public String getTipVial() {
		return tipVial;
	}
	public void setTipVial(String tipVial) {
		this.tipVial = tipVial;
	}
	public String getDesVial() {
		return desVial;
	}
	public void setDesVial(String desVial) {
		this.desVial = desVial;
	}
	public Short getNumInfer() {
		return numInfer;
	}
	public void setNumInfer(Short numInfer) {
		this.numInfer = numInfer;
	}
	public String getLetInfer() {
		return letInfer;
	}
	public void setLetInfer(String letInfer) {
		this.letInfer = letInfer;
	}
	public Short getNumSuper() {
		return numSuper;
	}
	public void setNumSuper(Short numSuper) {
		this.numSuper = numSuper;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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
	public Date getFecArchi() {
		return fecArchi;
	}
	public void setFecArchi(Date fecArchi) {
		this.fecArchi = fecArchi;
	}
	public Short getEjeExped() {
		return ejeExped;
	}
	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}
	public String getNumExped() {
		return numExped;
	}
	public void setNumExped(String numExped) {
		this.numExped = numExped;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Date getFecRegistSalid() {
		return fecRegistSalid;
	}
	public void setFecRegistSalid(Date fecRegistSalid) {
		this.fecRegistSalid = fecRegistSalid;
	}
	public Integer getNumRegisSalid() {
		return numRegisSalid;
	}
	public void setNumRegisSalid(Integer numRegisSalid) {
		this.numRegisSalid = numRegisSalid;
	}
	public Date getFecEnvio() {
		return fecEnvio;
	}
	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}
	public Short getForNotif() {
		return forNotif;
	}
	public void setForNotif(Short forNotif) {
		this.forNotif = forNotif;
	}
	public Date getFecCaduc() {
		return fecCaduc;
	}
	public void setFecCaduc(Date fecCaduc) {
		this.fecCaduc = fecCaduc;
	}
	public Long getNumEnvioTeu() {
		return numEnvioTeu;
	}
	public void setNumEnvioTeu(Long numEnvioTeu) {
		this.numEnvioTeu = numEnvioTeu;
	}
	public Long getCodArchi() {
		return codArchi;
	}
	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}
	public Long getCodArchiAcuse() {
		return codArchiAcuse;
	}
	public void setCodArchiAcuse(Long codArchiAcuse) {
		this.codArchiAcuse = codArchiAcuse;
	}
	public String getUsuContr() {
		return usuContr;
	}
	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}
	public String getDesMotNotif() {
		return desMotNotif;
	}
	public void setDesMotNotif(String desMotNotif) {
		this.desMotNotif = desMotNotif;
	}
	public String getDesSituacion() {
		return desSituacion;
	}
	public void setDesSituacion(String desSituacion) {
		this.desSituacion = desSituacion;
	}
	public String getNotificacion() {
		return notificacion;
	}
	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}
	public Long getIdHisRepre() {
		return idHisRepre;
	}
	public void setIdHisRepre(Long idHisRepre) {
		this.idHisRepre = idHisRepre;
	}
	public Long getIdRepre() {
		return idRepre;
	}
	public void setIdRepre(Long idRepre) {
		this.idRepre = idRepre;
	}
	public String getDesBop() {
		return desBop;
	}
	public void setDesBop(String desBop) {
		this.desBop = desBop;
	}
	public String getDesReceptor() {
		return desReceptor;
	}
	public void setDesReceptor(String desReceptor) {
		this.desReceptor = desReceptor;
	}

}
