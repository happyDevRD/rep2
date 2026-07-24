package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1647554602747508460L;

	@Id
	@Basic(optional = false)
	@Column(name = "usuario")
	private String usuario;
	@Basic(optional = false)
	@Column(name = "num_usuar", unique = true)
	private short numUsuar;
	@Column(name = "des_usuario")
	private String desUsuario;
	@Column(name = "id_his_perso")
	private Long idHisPerso;
	@Column(name = "id_perso")
	private Long idPerso;
	@Column(name = "cod_entid")
	private Short codEntid;
	@Basic(optional = false)
	@Column(name = "niv_acces")
	private short nivAcces;
	@Basic(optional = false)
	@Column(name = "dat_confi")
	private boolean datConfi;
	@Basic(optional = false)
	@Column(name = "act_audit")
	private boolean actAudit;
	@Basic(optional = false)
	@Column(name = "ambito")
	private short ambito;
	@Column(name = "fec_ven_usuar")
	@Temporal(TemporalType.DATE)
	private Date fecVenUsuar;
	@Column(name = "password")
	private String password;
	@Column(name = "fec_ven_passw")
	@Temporal(TemporalType.DATE)
	private Date fecVenPassw;
	@Basic(optional = false)
	@Column(name = "bloqueo")
	private Short bloqueo;
	@Column(name = "fec_bloqu")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecBloqu;
	@Column(name = "cod_grupo")
	private Short codGrupo;
	@Column(name = "cambio_pas")
	private Short cambioPas;
	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public short getNumUsuar() {
		return numUsuar;
	}

	public void setNumUsuar(short numUsuar) {
		this.numUsuar = numUsuar;
	}

	public String getDesUsuario() {
		return desUsuario;
	}

	public void setDesUsuario(String desUsuario) {
		this.desUsuario = desUsuario;
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

	public short getNivAcces() {
		return nivAcces;
	}

	public void setNivAcces(short nivAcces) {
		this.nivAcces = nivAcces;
	}

	public boolean isDatConfi() {
		return datConfi;
	}

	public void setDatConfi(boolean datConfi) {
		this.datConfi = datConfi;
	}

	public boolean isActAudit() {
		return actAudit;
	}

	public void setActAudit(boolean actAudit) {
		this.actAudit = actAudit;
	}

	public short getAmbito() {
		return ambito;
	}

	public void setAmbito(short ambito) {
		this.ambito = ambito;
	}

	public Date getFecVenUsuar() {
		return fecVenUsuar;
	}

	public void setFecVenUsuar(Date fecVenUsuar) {
		this.fecVenUsuar = fecVenUsuar;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFecVenPassw() {
		return fecVenPassw;
	}

	public void setFecVenPassw(Date fecVenPassw) {
		this.fecVenPassw = fecVenPassw;
	}

	public Short getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(Short bloqueo) {
		this.bloqueo = bloqueo;
	}

	public Date getFecBloqu() {
		return fecBloqu;
	}

	public void setFecBloqu(Date fecBloqu) {
		this.fecBloqu = fecBloqu;
	}

	public Short getCodGrupo() {
		return codGrupo;
	}

	public void setCodGrupo(Short codGrupo) {
		this.codGrupo = codGrupo;
	}

	public Short getCambioPas() {
		return cambioPas;
	}

	public void setCambioPas(Short cambioPas) {
		this.cambioPas = cambioPas;
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

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

}
