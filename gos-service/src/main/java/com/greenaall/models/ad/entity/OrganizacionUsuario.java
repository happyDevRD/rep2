package com.greenaall.models.ad.entity;

import java.io.Serializable;
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

/**
 *
 * @author jmmoyano
 */

@Entity
@Table(name = "ad_organizacion_usuario")
public class OrganizacionUsuario implements Serializable {

	private static final long serialVersionUID = 6360561773223657543L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_org_usuar")
	private Long idOrgUsuar;
	@Column(name = "id_org_eleme")
	private Long idOrgEleme;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "cod_cargo")
	private Short codCargo;
	@Basic(optional = false)
	@Column(name = "per_envio")
	private boolean perEnvio;
	@Basic(optional = false)
	@Column(name = "per_recep")
	private boolean perRecep;
	@Basic(optional = false)
	@Column(name = "sol_usuar")
	private Short solUsuar;
	@Basic(optional = false)
	@Column(name = "tra_usuar")
	private Short traUsuar;
	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdOrgUsuar() {
		return idOrgUsuar;
	}

	public void setIdOrgUsuar(Long idOrgUsuar) {
		this.idOrgUsuar = idOrgUsuar;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public boolean isPerEnvio() {
		return perEnvio;
	}

	public void setPerEnvio(boolean perEnvio) {
		this.perEnvio = perEnvio;
	}

	public boolean isPerRecep() {
		return perRecep;
	}

	public void setPerRecep(boolean perRecep) {
		this.perRecep = perRecep;
	}

	public Short getSolUsuar() {
		return solUsuar;
	}

	public void setSolUsuar(Short solUsuar) {
		this.solUsuar = solUsuar;
	}

	public Short getTraUsuar() {
		return traUsuar;
	}

	public void setTraUsuar(Short traUsuar) {
		this.traUsuar = traUsuar;
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
	

	public Short getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(Short codCargo) {
		this.codCargo = codCargo;
	}

	public OrganizacionUsuario() {
		super();
	}
}
