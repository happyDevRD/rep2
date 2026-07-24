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
@IdClass(RdRegistradorPK.class)
@Table(name = "rd_registrador")
public class RdRegistrador implements Serializable {

	private static final long serialVersionUID = 1501880869994035217L;

	@Id
	@Column(name = "cod_entid")
    private Short codEntid;
	
	@Id
    @Column(name = "cod_regis")
    private String codRegis;
    
	@Id
    @Column(name = "usuario")
    private String usuario;
	
	@Column(name = "id_regis")
	private Long idRegis;
	
	@Column(name = "id_his_regis")
	private Long idHisRegis;
	
	@Column(name = "tip_doc_defec")
	private short tipDocDefec;

	@Column(name = "defecto")
	private Short defecto;
	
	@Column(name = "sup_regis")
	private Short supRegis;
	
	@Column(name = "usu_notif")
	private Short usuNotif;
	
	@Column(name = "ind_inser")
	private Short indInser;
	
	@Column(name = "ind_modif")
	private Short indModif;
	
	@Column(name = "ind_borra")
	private Short indBorra;

	@Column(name = "ind_lista")
	private Short indLista;

	@Column(name = "ind_consu")
	private Short indConsu;
	
	@Column(name = "ind_inter")
	private Short indInter;

	@Column(name = "ind_acept")
	private Short indAcept;
	
	@Column(name = "ind_recha")
	private Short indRecha;
	
	@Column(name = "ind_fil_depar")
	private Short indFilDepar;
	
	@Column(name = "vis_inser")
	private Short visInser;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getCodRegis() {
		return codRegis;
	}

	public void setCodRegis(String codRegis) {
		this.codRegis = codRegis;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Long getIdRegis() {
		return idRegis;
	}

	public void setIdRegis(Long idRegis) {
		this.idRegis = idRegis;
	}

	public Long getIdHisRegis() {
		return idHisRegis;
	}

	public void setIdHisRegis(Long idHisRegis) {
		this.idHisRegis = idHisRegis;
	}

	public short getTipDocDefec() {
		return tipDocDefec;
	}

	public void setTipDocDefec(short tipDocDefec) {
		this.tipDocDefec = tipDocDefec;
	}

	public Short getDefecto() {
		return defecto;
	}

	public void setDefecto(Short defecto) {
		this.defecto = defecto;
	}

	public Short getSupRegis() {
		return supRegis;
	}

	public void setSupRegis(Short supRegis) {
		this.supRegis = supRegis;
	}

	public Short getUsuNotif() {
		return usuNotif;
	}

	public void setUsuNotif(Short usuNotif) {
		this.usuNotif = usuNotif;
	}

	public Short getIndInser() {
		return indInser;
	}

	public void setIndInser(Short indInser) {
		this.indInser = indInser;
	}

	public Short getIndModif() {
		return indModif;
	}

	public void setIndModif(Short indModif) {
		this.indModif = indModif;
	}

	public Short getIndBorra() {
		return indBorra;
	}

	public void setIndBorra(Short indBorra) {
		this.indBorra = indBorra;
	}

	public Short getIndLista() {
		return indLista;
	}

	public void setIndLista(Short indLista) {
		this.indLista = indLista;
	}

	public Short getIndConsu() {
		return indConsu;
	}

	public void setIndConsu(Short indConsu) {
		this.indConsu = indConsu;
	}

	public Short getIndInter() {
		return indInter;
	}

	public void setIndInter(Short indInter) {
		this.indInter = indInter;
	}

	public Short getIndAcept() {
		return indAcept;
	}

	public void setIndAcept(Short indAcept) {
		this.indAcept = indAcept;
	}

	public Short getIndRecha() {
		return indRecha;
	}

	public void setIndRecha(Short indRecha) {
		this.indRecha = indRecha;
	}

	public Short getIndFilDepar() {
		return indFilDepar;
	}

	public void setIndFilDepar(Short indFilDepar) {
		this.indFilDepar = indFilDepar;
	}

	public Short getVisInser() {
		return visInser;
	}

	public void setVisInser(Short visInser) {
		this.visInser = visInser;
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

	public RdRegistrador() {
		super();
	}

}
