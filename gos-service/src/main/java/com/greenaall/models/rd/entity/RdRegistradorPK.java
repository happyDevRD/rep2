package com.greenaall.models.rd.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class RdRegistradorPK implements Serializable{
	
	private static final long serialVersionUID = -1646426764309316085L;

    @Column(name = "cod_entid")
    private Short codEntid;
	
    @Column(name = "cod_regis")
    private String codRegis;
    
    @Column(name = "usuario")
    private String usuario;
    
    
	public short getCodEntid() {
		return codEntid;
	}
	public void setCodEntid(short codEntid) {
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
	public RdRegistradorPK(short codEntid, String codRegis, String usuario) {
		super();
		this.codEntid = codEntid;
		this.codRegis = codRegis;
		this.usuario = usuario;
	}
	public RdRegistradorPK() {
		super();
	}

}
