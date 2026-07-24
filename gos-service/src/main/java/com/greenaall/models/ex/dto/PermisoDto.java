package com.greenaall.models.ex.dto;

public class PermisoDto {

    private Long id;
    private String desProce;
    private String desTareaProce;
    private String usuario;
    private Long idOrgUsuar;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesProce() {
		return desProce;
	}
	public void setDesProce(String desProce) {
		this.desProce = desProce;
	}
	public String getDesTareaProce() {
		return desTareaProce;
	}
	public void setDesTareaProce(String desTareaProce) {
		this.desTareaProce = desTareaProce;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Long getIdOrgUsuar() {
		return idOrgUsuar;
	}
	public void setIdOrgUsuar(Long idOrgUsuar) {
		this.idOrgUsuar = idOrgUsuar;
	}
    
}
