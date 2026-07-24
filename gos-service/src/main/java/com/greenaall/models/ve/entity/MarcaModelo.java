package com.greenaall.models.ve.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ve_marca_modelo")
public class MarcaModelo implements Serializable {

	private static final long serialVersionUID = 6745880519176368982L;

	@Id
	@Column(name = "num_model")
	private Integer numModel;

	@Column(name = "marca")
	private String marca;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "cilindrada")
	private Integer cilindrada;

	@Column(name = "potencia")
	private String potencia;

	@Column(name = "cab_fisca")
	private java.math.BigDecimal cabFisca;

	@Column(name = "plazas")
	private String plazas;

	@Column(name = "peso")
	private java.math.BigDecimal peso;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecContr;

	public Integer getNumModel() {
		return numModel;
	}

	public void setNumModel(Integer numModel) {
		this.numModel = numModel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public java.math.BigDecimal getCabFisca() {
		return cabFisca;
	}

	public void setCabFisca(java.math.BigDecimal cabFisca) {
		this.cabFisca = cabFisca;
	}

	public String getPlazas() {
		return plazas;
	}

	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}

	public java.math.BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(java.math.BigDecimal peso) {
		this.peso = peso;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public java.util.Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(java.util.Date fecContr) {
		this.fecContr = fecContr;
	}

	public MarcaModelo() {
		super();
	}

}
