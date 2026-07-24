package com.greenaall.gf.dto;

public class Variable implements java.io.Serializable {

	private static final long serialVersionUID = -1836734045599482917L;

	// Código de variable Obligatorio
	private String codigo;

	// Descripción autoexplicativa de la variable (será visible por la
	// ciudadanía) Obligatorio
	private String descripcion;

	// Valor de la variable Opcional
	private String valor;

	// Tipo de Campo (String, Date, Integer, etc) Obligatorio
	private String tipoValor;

	// Indicador de obligatoriedad de ser informada Obligatorio
	private String obligatorio;

	// Valor Mínimo Opcional
	private String minimo;

	// Valor Máximo Opcional
	private String maximo;

	/**
	 * Constructor del objeto
	 */
	public Variable() {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipoValor() {
		return tipoValor;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	public String getObligatorio() {
		return obligatorio;
	}

	public void setObligatorio(String obligatorio) {
		this.obligatorio = obligatorio;
	}

	public String getMinimo() {
		return minimo;
	}

	public void setMinimo(String minimo) {
		this.minimo = minimo;
	}

	public String getMaximo() {
		return maximo;
	}

	public void setMaximo(String maximo) {
		this.maximo = maximo;
	}

	/**
	 * Determina is esta variable es de obligatorio que tenga el valor especificado
	 * 
	 * @return
	 */
	public boolean isObligatorio() {
		return this.getObligatorio() != null
				&& this.getObligatorio().equalsIgnoreCase("true");
	}
}
