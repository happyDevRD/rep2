package com.greenaall.models.gf.entity;

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
@IdClass(TipoObjetoTributarioPK.class)
@Table(name = "gf_tipo_objeto_tributario")
public class TipoObjetoTributario implements Serializable {

	private static final long serialVersionUID = 7149697831573255067L;

	@Id
	@Column(name = "id_his_tip_obj_tribu")
	private Long idHisTipObjTribu;

	@Id
	@Column(name = "id_tip_obj_tribu")
	private Long idTipObjTribu;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "cod_tip_obj_tribu")
	private String codTipObjTribu;

	@Column(name = "des_tip_obj_tribu")
	private String desTipObjTribu;

	@Column(name = "id_grupo")
	private Long idGrupo;

	@Column(name = "reservado")
	private Short reservado;

	@Column(name = "modulo")
	private Short modulo;

	@Column(name = "tipo")
	private Short tipo;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecMovim;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cod_cau_movim")
	private Short codCauMovim;

	@Column(name = "reg_activ")
	private Short regActiv;

	@Column(name = "id_tarif")
	private Long idTarif;

	@Column(name = "id_impue")
	private Long idImpue;

	@Column(name = "control_val_calle")
	private Short controlValCalle;

	@Column(name = "vis_web")
	private Short visWeb;

	@Column(name = "proc_sia")
	private Integer procSia;

	@Column(name = "info")
	private String info;

	@Column(name = "fec_ini_web")
	private java.sql.Date fecIniWeb;

	@Column(name = "fec_fin_web")
	private java.sql.Date fecFinWeb;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdHisTipObjTribu() {
		return idHisTipObjTribu;
	}

	public void setIdHisTipObjTribu(Long idHisTipObjTribu) {
		this.idHisTipObjTribu = idHisTipObjTribu;
	}

	public Long getIdTipObjTribu() {
		return idTipObjTribu;
	}

	public void setIdTipObjTribu(Long idTipObjTribu) {
		this.idTipObjTribu = idTipObjTribu;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getCodTipObjTribu() {
		return codTipObjTribu;
	}

	public void setCodTipObjTribu(String codTipObjTribu) {
		this.codTipObjTribu = codTipObjTribu;
	}

	public String getDesTipObjTribu() {
		return desTipObjTribu;
	}

	public void setDesTipObjTribu(String desTipObjTribu) {
		this.desTipObjTribu = desTipObjTribu;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Short getReservado() {
		return reservado;
	}

	public void setReservado(Short reservado) {
		this.reservado = reservado;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public Short getTipo() {
		return tipo;
	}

	public void setTipo(Short tipo) {
		this.tipo = tipo;
	}

	public java.util.Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(java.util.Date fecMovim) {
		this.fecMovim = fecMovim;
	}

	public String getCodMovim() {
		return codMovim;
	}

	public void setCodMovim(String codMovim) {
		this.codMovim = codMovim;
	}

	public Short getCodCauMovim() {
		return codCauMovim;
	}

	public void setCodCauMovim(Short codCauMovim) {
		this.codCauMovim = codCauMovim;
	}

	public Short getRegActiv() {
		return regActiv;
	}

	public void setRegActiv(Short regActiv) {
		this.regActiv = regActiv;
	}

	public Long getIdTarif() {
		return idTarif;
	}

	public void setIdTarif(Long idTarif) {
		this.idTarif = idTarif;
	}

	public Long getIdImpue() {
		return idImpue;
	}

	public void setIdImpue(Long idImpue) {
		this.idImpue = idImpue;
	}

	public Short getControlValCalle() {
		return controlValCalle;
	}

	public void setControlValCalle(Short controlValCalle) {
		this.controlValCalle = controlValCalle;
	}

	public Short getVisWeb() {
		return visWeb;
	}

	public void setVisWeb(Short visWeb) {
		this.visWeb = visWeb;
	}

	public Integer getProcSia() {
		return procSia;
	}

	public void setProcSia(Integer procSia) {
		this.procSia = procSia;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public java.sql.Date getFecIniWeb() {
		return fecIniWeb;
	}

	public void setFecIniWeb(java.sql.Date fecIniWeb) {
		this.fecIniWeb = fecIniWeb;
	}

	public java.sql.Date getFecFinWeb() {
		return fecFinWeb;
	}

	public void setFecFinWeb(java.sql.Date fecFinWeb) {
		this.fecFinWeb = fecFinWeb;
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

	public TipoObjetoTributario() {
		super();
	}

}
