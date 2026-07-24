package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;

public class TramiteDto implements Serializable {

	private static final long serialVersionUID = -1264179894453017521L;
	private Long id;
	private String descripcion;

	private EnumFaseExpediente fase = EnumFaseExpediente.INICIO;

	private Date fecTramite;

	private Short numero;

	private Long expediente;
	private Short ejeExped;
	private Integer numExped;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EnumFaseExpediente getFase() {
		return fase;
	}

	public void setFase(EnumFaseExpediente fase) {
		this.fase = fase;
	}

	public Date getFecTramite() {
		return fecTramite;
	}

	public void setFecTramite(Date fecTramite) {
		this.fecTramite = fecTramite;
	}

	public Short getNumero() {
		return numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	public Long getExpediente() {
		return expediente;
	}

	public void setExpediente(Long expediente) {
		this.expediente = expediente;
	}

	public Short getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}

	public Integer getNumExped() {
		return numExped;
	}

	public void setNumExped(Integer numExped) {
		this.numExped = numExped;
	}

	public TramiteDto() {
		super();
	}

}
