package com.greenaall.models.ge.entity;

import java.io.Serializable;

public class UsuarioContexto implements Serializable {

	private static final long serialVersionUID = -6910127340469980196L;
	private String usuario;
	private String departamento;
	private Long idOrgEleme;
	private Short solUsuar;
	private Short traUsuar;
	private Short nivAcces;
	private Long idOrgUsuar;
	private int codigo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Long getIdOrgUsuar() {
		return idOrgUsuar;
	}

	public void setIdOrgUsuar(Long idOrgUsuar) {
		this.idOrgUsuar = idOrgUsuar;
	}

	public Short getNivAcces() {
		return nivAcces;
	}

	public void setNivAcces(Short nivAcces) {
		this.nivAcces = nivAcces;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	private String token;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

}
