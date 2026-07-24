package com.greenaall.models.co.entity;

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
@IdClass(CoContadorPK.class)
@Table(name = "co_contador")
public class CoContador implements Serializable {

	private static final long serialVersionUID = 5572560383229256398L;

	@Id
	@Column(name = "id_conta")
	private Long idConta;

	@Id
	@Column(name = "num_conta")
	private Short numConta;

	@Id
	@Column(name = "eje_conta")
	private Short ejeConta;

	@Column(name = "des_conta")
	private String desConta;

	@Column(name = "num_dig_conta")
	private Short numDigConta;

	@Column(name = "val_conta")
	private Long valConta;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public Short getNumConta() {
		return numConta;
	}

	public void setNumConta(Short numConta) {
		this.numConta = numConta;
	}

	public Short getEjeConta() {
		return ejeConta;
	}

	public void setEjeConta(Short ejeConta) {
		this.ejeConta = ejeConta;
	}

	public String getDesConta() {
		return desConta;
	}

	public void setDesConta(String desConta) {
		this.desConta = desConta;
	}

	public Short getNumDigConta() {
		return numDigConta;
	}

	public void setNumDigConta(Short numDigConta) {
		this.numDigConta = numDigConta;
	}

	public Long getValConta() {
		return valConta;
	}

	public void setValConta(Long valConta) {
		this.valConta = valConta;
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

	public CoContador() {
		super();
	}
	
}
