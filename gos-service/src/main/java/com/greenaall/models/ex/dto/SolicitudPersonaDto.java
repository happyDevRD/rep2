package com.greenaall.models.ex.dto;

import java.math.BigDecimal;
import java.util.Date;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;

public class SolicitudPersonaDto {

	private Long id;
	private Date fecInicio;
	private Short ejercicio;
	private Integer numero;
	private Long idDocum;
	private Long idHisDocum;
	private Long idPerso;
	private Long idHisPerso;
	private Long idRepre;
	private Long idHisRepre;
	private EnumEstadoSolicitud estado;
	private String asunto;
	private String motivoRechazo;
	private Long departamento;
	private String usuario;
	private Long expediente;

	private Date fecMovim;
	private String codMovim;
	private Short cauMovim;
	private boolean regActiv;
	private String numDocum;
	private Short tipPerso;
	private short nivAcces;
	private String nombre;
	private String particula1;
	private String apellido1;
	private String particula2;
	private String apellido2;
	private String razSocia;
	private String razSocReduc;
	private String desPerEntid;
	private boolean domCodif;
	private Long idHisDomic;
	private Long idDomic;
	private String localidad;
	private String desTipVia;
	private String desVia;
	private short extInfNumer;
	private String extInfLetra;
	private short extSupNumer;
	private String extSupLetra;
	private BigDecimal kilometro;
	private String bloque;
	private String portal;
	private String escalera;
	private String planta;
	private String puerta;
	private String edificio;
	private Short codLocal;
	private int codPosta;
	private String dirPosta;
	private String observaciones;
	private Short codProvi;
	private Short codMunic;

	private Date fecMovimRepre;
	private String codMovimRepre;
	private Short cauMovimRepre;
	private boolean regActivRepre;
	private String numDocumRepre;
	private Short tipPersoRepre;
	private short nivAccesRepre;
	private String nombreRepre;
	private String particula1Repre;
	private String apellido1Repre;
	private String particula2Repre;
	private String apellido2Repre;
	private String razSociaRepre;
	private String razSocReducRepre;
	private String desPerEntidRepre;
	private boolean domCodifRepre;
	private Long idHisDomicRepre;
	private Long idDomicRepre;
	private String localidadRepre;
	private String desTipViaRepre;
	private String desViaRepre;
	private short extInfNumerRepre;
	private String extInfLetraRepre;
	private short extSupNumerRepre;
	private String extSupLetraRepre;
	private BigDecimal kilometroRepre;
	private String bloqueRepre;
	private String portalRepre;
	private String escaleraRepre;
	private String plantaRepre;
	private String puertaRepre;
	private String edificioRepre;
	private Short codLocalRepre;
	private int codPostaRepre;
	private String dirPostaRepre;
	private String observacionesRepre;
	private Short codProviRepre;
	private Short codMunicRepre;
	private String usuContr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecInicio() {
		return fecInicio;
	}

	public void setFecInicio(Date fecInicio) {
		this.fecInicio = fecInicio;
	}

	public Short getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Short ejercicio) {
		this.ejercicio = ejercicio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public EnumEstadoSolicitud getEstado() {
		return estado;
	}

	public void setEstado(EnumEstadoSolicitud estado) {
		this.estado = estado;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMotivoRechazo() {
		return motivoRechazo;
	}

	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
	}

	public Long getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Long departamento) {
		this.departamento = departamento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Long getExpediente() {
		return expediente;
	}

	public void setExpediente(Long expediente) {
		this.expediente = expediente;
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

	public Date getFecMovimRepre() {
		return fecMovimRepre;
	}

	public void setFecMovimRepre(Date fecMovimRepre) {
		this.fecMovimRepre = fecMovimRepre;
	}

	public String getCodMovimRepre() {
		return codMovimRepre;
	}

	public void setCodMovimRepre(String codMovimRepre) {
		this.codMovimRepre = codMovimRepre;
	}

	public Short getCauMovimRepre() {
		return cauMovimRepre;
	}

	public void setCauMovimRepre(Short cauMovimRepre) {
		this.cauMovimRepre = cauMovimRepre;
	}

	public boolean isRegActivRepre() {
		return regActivRepre;
	}

	public void setRegActivRepre(boolean regActivRepre) {
		this.regActivRepre = regActivRepre;
	}

	public String getNumDocumRepre() {
		return numDocumRepre;
	}

	public void setNumDocumRepre(String numDocumRepre) {
		this.numDocumRepre = numDocumRepre;
	}

	public Short getTipPersoRepre() {
		return tipPersoRepre;
	}

	public void setTipPersoRepre(Short tipPersoRepre) {
		this.tipPersoRepre = tipPersoRepre;
	}

	public short getNivAccesRepre() {
		return nivAccesRepre;
	}

	public void setNivAccesRepre(short nivAccesRepre) {
		this.nivAccesRepre = nivAccesRepre;
	}

	public String getNombreRepre() {
		return nombreRepre;
	}

	public void setNombreRepre(String nombreRepre) {
		this.nombreRepre = nombreRepre;
	}

	public String getParticula1Repre() {
		return particula1Repre;
	}

	public void setParticula1Repre(String particula1Repre) {
		this.particula1Repre = particula1Repre;
	}

	public String getApellido1Repre() {
		return apellido1Repre;
	}

	public void setApellido1Repre(String apellido1Repre) {
		this.apellido1Repre = apellido1Repre;
	}

	public String getParticula2Repre() {
		return particula2Repre;
	}

	public void setParticula2Repre(String particula2Repre) {
		this.particula2Repre = particula2Repre;
	}

	public String getApellido2Repre() {
		return apellido2Repre;
	}

	public void setApellido2Repre(String apellido2Repre) {
		this.apellido2Repre = apellido2Repre;
	}

	public String getRazSociaRepre() {
		return razSociaRepre;
	}

	public void setRazSociaRepre(String razSociaRepre) {
		this.razSociaRepre = razSociaRepre;
	}

	public String getRazSocReducRepre() {
		return razSocReducRepre;
	}

	public void setRazSocReducRepre(String razSocReducRepre) {
		this.razSocReducRepre = razSocReducRepre;
	}

	public String getDesPerEntidRepre() {
		return desPerEntidRepre;
	}

	public void setDesPerEntidRepre(String desPerEntidRepre) {
		this.desPerEntidRepre = desPerEntidRepre;
	}

	public boolean isDomCodifRepre() {
		return domCodifRepre;
	}

	public void setDomCodifRepre(boolean domCodifRepre) {
		this.domCodifRepre = domCodifRepre;
	}

	public Long getIdHisDomicRepre() {
		return idHisDomicRepre;
	}

	public void setIdHisDomicRepre(Long idHisDomicRepre) {
		this.idHisDomicRepre = idHisDomicRepre;
	}

	public Long getIdDomicRepre() {
		return idDomicRepre;
	}

	public void setIdDomicRepre(Long idDomicRepre) {
		this.idDomicRepre = idDomicRepre;
	}

	public String getLocalidadRepre() {
		return localidadRepre;
	}

	public void setLocalidadRepre(String localidadRepre) {
		this.localidadRepre = localidadRepre;
	}

	public String getDesTipViaRepre() {
		return desTipViaRepre;
	}

	public void setDesTipViaRepre(String desTipViaRepre) {
		this.desTipViaRepre = desTipViaRepre;
	}

	public String getDesViaRepre() {
		return desViaRepre;
	}

	public void setDesViaRepre(String desViaRepre) {
		this.desViaRepre = desViaRepre;
	}

	public short getExtInfNumerRepre() {
		return extInfNumerRepre;
	}

	public void setExtInfNumerRepre(short extInfNumerRepre) {
		this.extInfNumerRepre = extInfNumerRepre;
	}

	public String getExtInfLetraRepre() {
		return extInfLetraRepre;
	}

	public void setExtInfLetraRepre(String extInfLetraRepre) {
		this.extInfLetraRepre = extInfLetraRepre;
	}

	public short getExtSupNumerRepre() {
		return extSupNumerRepre;
	}

	public void setExtSupNumerRepre(short extSupNumerRepre) {
		this.extSupNumerRepre = extSupNumerRepre;
	}

	public String getExtSupLetraRepre() {
		return extSupLetraRepre;
	}

	public void setExtSupLetraRepre(String extSupLetraRepre) {
		this.extSupLetraRepre = extSupLetraRepre;
	}

	public BigDecimal getKilometroRepre() {
		return kilometroRepre;
	}

	public void setKilometroRepre(BigDecimal kilometroRepre) {
		this.kilometroRepre = kilometroRepre;
	}

	public String getBloqueRepre() {
		return bloqueRepre;
	}

	public void setBloqueRepre(String bloqueRepre) {
		this.bloqueRepre = bloqueRepre;
	}

	public String getPortalRepre() {
		return portalRepre;
	}

	public void setPortalRepre(String portalRepre) {
		this.portalRepre = portalRepre;
	}

	public String getEscaleraRepre() {
		return escaleraRepre;
	}

	public void setEscaleraRepre(String escaleraRepre) {
		this.escaleraRepre = escaleraRepre;
	}

	public String getPlantaRepre() {
		return plantaRepre;
	}

	public void setPlantaRepre(String plantaRepre) {
		this.plantaRepre = plantaRepre;
	}

	public String getPuertaRepre() {
		return puertaRepre;
	}

	public void setPuertaRepre(String puertaRepre) {
		this.puertaRepre = puertaRepre;
	}

	public String getEdificioRepre() {
		return edificioRepre;
	}

	public void setEdificioRepre(String edificioRepre) {
		this.edificioRepre = edificioRepre;
	}

	public Short getCodLocalRepre() {
		return codLocalRepre;
	}

	public void setCodLocalRepre(Short codLocalRepre) {
		this.codLocalRepre = codLocalRepre;
	}

	public int getCodPostaRepre() {
		return codPostaRepre;
	}

	public void setCodPostaRepre(int codPostaRepre) {
		this.codPostaRepre = codPostaRepre;
	}

	public String getDirPostaRepre() {
		return dirPostaRepre;
	}

	public void setDirPostaRepre(String dirPostaRepre) {
		this.dirPostaRepre = dirPostaRepre;
	}

	public String getObservacionesRepre() {
		return observacionesRepre;
	}

	public void setObservacionesRepre(String observacionesRepre) {
		this.observacionesRepre = observacionesRepre;
	}

	public Short getCodProviRepre() {
		return codProviRepre;
	}

	public void setCodProviRepre(Short codProviRepre) {
		this.codProviRepre = codProviRepre;
	}

	public Short getCodMunicRepre() {
		return codMunicRepre;
	}

	public void setCodMunicRepre(Short codMunicRepre) {
		this.codMunicRepre = codMunicRepre;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

}
