package com.greenaall.models.ge.dto;

import java.io.Serializable;

public class MetadatoGrupoAtributoDto implements Serializable {

	private static final long serialVersionUID = 7802128886636944880L;
	private String etiGruAtrib;
	private Long idAtrib;
	private Long idGrupo;
	private String desGruAtrib;
	private Short requerido;
	private String valInici;
	private String valMinim;
	private String valMaxim;
	private String tipo;
	private Short longitud;
	private String Usuario;
	private String valor;

	public String getEtiGruAtrib() {
		return etiGruAtrib;
	}

	public void setEtiGruAtrib(String etiGruAtrib) {
		this.etiGruAtrib = etiGruAtrib;
	}

	public Long getIdAtrib() {
		return idAtrib;
	}

	public void setIdAtrib(Long idAtrib) {
		this.idAtrib = idAtrib;
	}

	public String getDesGruAtrib() {
		return desGruAtrib;
	}

	public void setDesGruAtrib(String desGruAtrib) {
		this.desGruAtrib = desGruAtrib;
	}

	public Short getRequerido() {
		return requerido;
	}

	public void setRequerido(Short requerido) {
		this.requerido = requerido;
	}

	public String getValInici() {
		return valInici;
	}

	public void setValInici(String valInici) {
		this.valInici = valInici;
	}

	public String getValMinim() {
		return valMinim;
	}

	public void setValMinim(String valMinim) {
		this.valMinim = valMinim;
	}

	public String getValMaxim() {
		return valMaxim;
	}

	public void setValMaxim(String valMaxim) {
		this.valMaxim = valMaxim;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Short getLongitud() {
		return longitud;
	}

	public void setLongitud(Short longitud) {
		this.longitud = longitud;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
