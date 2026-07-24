package com.greenaall.models.ge.entity;

public class UsuarioValorPk implements java.io.Serializable {

	private static final long serialVersionUID = -8915661904713902822L;
	
	private String usuario;
	private Short numValor;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Short getNumValor() {
		return numValor;
	}
	public void setNumValor(Short numValor) {
		this.numValor = numValor;
	}
	public UsuarioValorPk() {
		super();
	}
}
