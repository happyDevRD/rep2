package com.greenaall.models.ge.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "ge_usuario_valor")
@IdClass(UsuarioValorPk.class)
public class UsuarioValor implements Serializable {

	private static final long serialVersionUID = 1061105472038847020L;
	
	@Id
	@Column(name="usuario")
	private String usuario;
	
	@Id
	@Column(name="num_valor")
	private Short numValor;

	@Column(name="des_valor")
	private String desValor;

	@Column(name="valor")
	private String valor;

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

	public String getDesValor() {
		return desValor;
	}

	public void setDesValor(String desValor) {
		this.desValor = desValor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public UsuarioValor() {
		super();
	}
}
