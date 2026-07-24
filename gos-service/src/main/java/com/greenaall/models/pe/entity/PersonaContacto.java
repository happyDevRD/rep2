package com.greenaall.models.pe.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(PersonaContactoPK.class)
@Table(name = "pe_persona_contacto")
public class PersonaContacto implements Serializable {

	private static final long serialVersionUID = 3966274818873550828L;

	@Id
	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Id
	@Column(name = "id_perso")
	private Long idPerso;
	
	@Id
	@Column(name = "num_orden")
	private Short numOrden;
	
	@Column(name = "tip_conta")
	private Short tipConta;
	
	@Column(name = "dat_conta")
	private String datConta;
	
	@Column(name = "rec_notif")
	private Short recNotif;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public Short getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(Short numOrden) {
		this.numOrden = numOrden;
	}

	public Short getTipConta() {
		return tipConta;
	}

	public void setTipConta(Short tipConta) {
		this.tipConta = tipConta;
	}

	public String getDatConta() {
		return datConta;
	}

	public void setDatConta(String datConta) {
		this.datConta = datConta;
	}

	public Short getRecNotif() {
		return recNotif;
	}

	public void setRecNotif(Short recNotif) {
		this.recNotif = recNotif;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public PersonaContacto() {
		super();
	}
}
