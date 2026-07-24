package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_tramite")
public class Tramite implements Serializable {

	private static final long serialVersionUID = 1719628781530042497L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Basic(optional = false)
	@Column(name="descripcion")
    private String descripcion;
	
	@Enumerated(EnumType.STRING)
    @Basic(optional = false)
    private EnumFaseExpediente fase;
	
	@Basic(optional = false)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fec_tramite")
	private Date fecTramite;
	
    @Basic(optional = false)
    @Column(name="numero")
    private Short numero;
    
    @Column(name="expediente")
    private Long expediente;

    @Column(name = "usu_contr")
	private String usuContr;
    
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

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

	public Tramite() {
		super();
	}

}
