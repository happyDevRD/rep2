package com.greenaall.models.te.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(DomicilioPK.class)
@Table(name = "te_domicilio")
public class Domicilio implements Serializable {

	private static final long serialVersionUID = -3430156383193727127L;

	@Id
	@Column(name = "id_his_domic")
	private Long idHisDomic;

	@Id
	@Column(name = "id_domic")
	private Long idDomic;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMovim;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cau_movim")
	private Short cauMovim;

	@Column(name = "reg_activ")
	private boolean regActiv;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "dom_norma")
	private Short domNorma;

	@Column(name = "id_his_tramo")
	private Long idHisTramo;

	@Column(name = "id_tramo")
	private Long idTramo;

	@Column(name = "id_his_via")
	private Long idHisVia;

	@Column(name = "id_via")
	private Long idVia;

	@Column(name = "id_his_psvia")
	private Long idHisPsvia;

	@Column(name = "id_psvia")
	private Long idPsvia;

	@Column(name = "ext_inf_numer")
	private Short extInfNumer;

	@Column(name = "ext_inf_letra")
	private String extInfLetra;

	@Column(name = "ext_sup_numer")
	private Short extSupNumer;

	@Column(name = "ext_sup_letra")
	private String extSupLetra;

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

	@Column(name = "cod_posta")
	private Integer codPosta;

	@Column(name = "tip_local")
	private String tipLocal;

	@Column(name = "cod_act_estab")
	private Short codActEstab;

	@Column(name = "inf_adici")
	private String infAdici;

	@Column(name = "ref_catas")
	private String refCatas;

	@Column(name = "dir_posta")
	private String dirPosta;

	@Column(name = "cod_local")
	private Short codLocal;

	@Column(name = "ind_tip_local")
	private String indTipLocal;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

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

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getDomNorma() {
		return domNorma;
	}

	public void setDomNorma(Short domNorma) {
		this.domNorma = domNorma;
	}

	public Long getIdHisTramo() {
		return idHisTramo;
	}

	public void setIdHisTramo(Long idHisTramo) {
		this.idHisTramo = idHisTramo;
	}

	public Long getIdTramo() {
		return idTramo;
	}

	public void setIdTramo(Long idTramo) {
		this.idTramo = idTramo;
	}

	public Long getIdHisVia() {
		return idHisVia;
	}

	public void setIdHisVia(Long idHisVia) {
		this.idHisVia = idHisVia;
	}

	public Long getIdVia() {
		return idVia;
	}

	public void setIdVia(Long idVia) {
		this.idVia = idVia;
	}

	public Long getIdHisPsvia() {
		return idHisPsvia;
	}

	public void setIdHisPsvia(Long idHisPsvia) {
		this.idHisPsvia = idHisPsvia;
	}

	public Long getIdPsvia() {
		return idPsvia;
	}

	public void setIdPsvia(Long idPsvia) {
		this.idPsvia = idPsvia;
	}

	public Short getExtInfNumer() {
		return extInfNumer;
	}

	public void setExtInfNumer(Short extInfNumer) {
		this.extInfNumer = extInfNumer;
	}

	public String getExtInfLetra() {
		return extInfLetra;
	}

	public void setExtInfLetra(String extInfLetra) {
		this.extInfLetra = extInfLetra;
	}

	public Short getExtSupNumer() {
		return extSupNumer;
	}

	public void setExtSupNumer(Short extSupNumer) {
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

	public Integer getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(Integer codPosta) {
		this.codPosta = codPosta;
	}

	public String getTipLocal() {
		return tipLocal;
	}

	public void setTipLocal(String tipLocal) {
		this.tipLocal = tipLocal;
	}

	public Short getCodActEstab() {
		return codActEstab;
	}

	public void setCodActEstab(Short codActEstab) {
		this.codActEstab = codActEstab;
	}

	public String getInfAdici() {
		return infAdici;
	}

	public void setInfAdici(String infAdici) {
		this.infAdici = infAdici;
	}

	public String getRefCatas() {
		return refCatas;
	}

	public void setRefCatas(String refCatas) {
		this.refCatas = refCatas;
	}

	public String getDirPosta() {
		return dirPosta;
	}

	public void setDirPosta(String dirPosta) {
		this.dirPosta = dirPosta;
	}

	public Short getCodLocal() {
		return codLocal;
	}

	public void setCodLocal(Short codLocal) {
		this.codLocal = codLocal;
	}

	public String getIndTipLocal() {
		return indTipLocal;
	}

	public void setIndTipLocal(String indTipLocal) {
		this.indTipLocal = indTipLocal;
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

	public Domicilio() {
		super();
	}

}
