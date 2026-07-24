package com.greenaall.models.pe.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "pe_notificacion")
public class Notificacion implements Serializable {

	private static final long serialVersionUID = -9149672543059080236L;
	public static final Short SITUACION_GENERADA = Short.valueOf("1");
	public static final Short SITUACION_ENVIADA = Short.valueOf("2");
	public static final Short SITUACION_RECEPCIONADA = Short.valueOf("3");
	public static final Short SITUACION_DEVUELTA = Short.valueOf("4");
	public static final Short SITUACION_COBRADA = Short.valueOf("5");
	public static final Short SITUACION_ANULADA = Short.valueOf("6");

	public static final Short BOP_NA = Short.valueOf("0");
	public static final Short BOP_ENVIADO = Short.valueOf("1");
	public static final Short BOP_PUBLICADO = Short.valueOf("2");

	public static final Short FORMA_NOTIFICACION_PAPEL = Short.valueOf("4");
	public static final Short FORMA_NOTIFICACION_TELEMATICA = Short.valueOf("5");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_notif")
    private Long idNotif;
    
    @Column(name = "cod_entid")
    private Short codEntid;
    
    @Basic(optional = false)
    @Column(name = "eje_notif")
    private Short ejeNotif;
    
    @Basic(optional = false)
    @Column(name = "num_notif")
    private Integer numNotif;
    
    @Basic(optional = false)
    @Column(name = "fec_notif")
    @Temporal(TemporalType.DATE)
    private Date fecNotif;
    
    @Column(name = "fec_rec_notif")
    @Temporal(TemporalType.DATE)
    private Date fecRecNotif;
    
    @Column(name = "correo")
    private Integer correo;
    
    @Column(name = "id_his_perso")
    private Long idHisPerso;
    
    @Column(name = "id_perso")
    private Long idPerso;
    
    @Basic(optional = false)
    @Column(name = "situacion")
    private Short situacion;
    
    @Column(name = "mot_notif")
    private Short motNotif;
    
    @Column(name = "receptor")
    private Short receptor;
    
    @Column(name = "num_bop")
    private Integer numBop;
    
    @Basic(optional = false)
    @Column(name = "imp_costa")
    private BigDecimal impCosta;
    
    @Basic(optional = false)
    @Column(name = "tot_deuda")
    private BigDecimal totDeuda;
    
    @Basic(optional = false)
    @Column(name = "bop")
    private Short bop;
     
    @Column(name = "fec_emi_bop")
    @Temporal(TemporalType.DATE)
    private Date fecEmiBop;
    
    @Column(name = "fec_pub_bop")
    @Temporal(TemporalType.DATE)
    private Date fecPubBop;
    
    @Column(name = "notificador")
    private Short notificador;
    
    @Column(name = "cod_provi")
    private Short codProvi;
    
    @Column(name = "cod_munic")
    private Short codMunic;
    
    @Column(name = "tip_vial")
    private String tipVial;
    
    @Column(name = "des_vial")
    private String desVial;
    
    @Column(name = "num_infer")
    private Short numInfer;
    
    @Column(name = "let_infer")
    private String letInfer;
    
    @Column(name = "num_super")
    private Short numSuper;
    
    @Column(name = "let_super")
    private String letSuper;
    
    @Column(name = "kilometro")
    private Short kilometro;
    
    @Column(name = "hectometro")
    private Short hectometro;
    
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
    
    @Column(name = "localidad")
    private String localidad;
    
    @Column(name = "domicilio")
    private String domicilio;
    
    @Column(name = "cod_posta")
    private Integer codPosta;
    
    @Column(name = "fec_archi")
    @Temporal(TemporalType.DATE)
    private Date fecArchi;
    
    @Column(name = "eje_exped")
    private Short ejeExped;
    
    @Column(name = "num_exped")
    private String numExped;
    
    @Column(name = "observacion")
    private String observacion;
    
    @Column(name = "id_tip_notif")
    private Integer idTipNotif;
    
    @Column(name = "fec_regist_salid")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegistSalid;
    
    @Column(name = "num_regis_salid")
    private Integer numRegisSalid;
    
    @Column(name = "eje_remes")
    private Short ejeRemes;
    
    @Column(name = "num_remes")
    private Short numRemes;
    
    @Column(name = "num_envio")
    private Integer numEnvio;
    
    @Column(name = "fec_envio")
    @Temporal(TemporalType.DATE)
    private Date fecEnvio;
    
    @Column(name = "cod_evento")
    private String codEvento;
    
    @Basic(optional = false)
    @Column(name = "for_notif")
    private Short forNotif;
    
    @Column(name = "fec_caduc")
    @Temporal(TemporalType.DATE)
    private Date fecCaduc;
    
    @Column(name = "num_envio_teu")
    private Long numEnvioTeu;

    @Column(name = "cod_archi")
    private Long codArchi;

    @Column(name = "cod_archi_acuse")
    private Long codArchiAcuse;
    
    @Column(name = "modulo")
    private Short modulo;

    @Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Long getIdNotif() {
		return idNotif;
	}

	public void setIdNotif(Long idNotif) {
		this.idNotif = idNotif;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
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

	public Integer getCorreo() {
		return correo;
	}

	public void setCorreo(Integer correo) {
		this.correo = correo;
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

	public BigDecimal getImpCosta() {
		return impCosta;
	}

	public void setImpCosta(BigDecimal impCosta) {
		this.impCosta = impCosta;
	}

	public BigDecimal getTotDeuda() {
		return totDeuda;
	}

	public void setTotDeuda(BigDecimal totDeuda) {
		this.totDeuda = totDeuda;
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

	public String getLetSuper() {
		return letSuper;
	}

	public void setLetSuper(String letSuper) {
		this.letSuper = letSuper;
	}

	public Short getKilometro() {
		return kilometro;
	}

	public void setKilometro(Short kilometro) {
		this.kilometro = kilometro;
	}

	public Short getHectometro() {
		return hectometro;
	}

	public void setHectometro(Short hectometro) {
		this.hectometro = hectometro;
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

	public Integer getIdTipNotif() {
		return idTipNotif;
	}

	public void setIdTipNotif(Integer idTipNotif) {
		this.idTipNotif = idTipNotif;
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

	public Short getEjeRemes() {
		return ejeRemes;
	}

	public void setEjeRemes(Short ejeRemes) {
		this.ejeRemes = ejeRemes;
	}

	public Short getNumRemes() {
		return numRemes;
	}

	public void setNumRemes(Short numRemes) {
		this.numRemes = numRemes;
	}

	public Integer getNumEnvio() {
		return numEnvio;
	}

	public void setNumEnvio(Integer numEnvio) {
		this.numEnvio = numEnvio;
	}

	public Date getFecEnvio() {
		return fecEnvio;
	}

	public void setFecEnvio(Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}

	public String getCodEvento() {
		return codEvento;
	}

	public void setCodEvento(String codEvento) {
		this.codEvento = codEvento;
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

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public Notificacion() {
		super();
	}
	
	
}
