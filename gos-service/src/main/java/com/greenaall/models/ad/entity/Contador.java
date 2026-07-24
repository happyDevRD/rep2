package com.greenaall.models.ad.entity;

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
@IdClass(ContadorPK.class)
@Table(name = "ad_contador")
public class Contador implements Serializable {

	private static final long serialVersionUID = 331272175263903041L;
	
	@Id
	@Column(name = "cod_entid")
	private Short codEntid;
	 
	@Id
	@Column(name = "modulo")
	private Short modulo;
	 
	@Id
	@Column(name = "anno")
	private Short anno;
	 
	@Id
	@Column(name = "num_conta")
	private Short numConta;
	
	@Column(name = "val_conta")
	private Integer valConta;
	
	@Column(name = "des_conta")
	private String desConta;

	@Column(name = "num_dig_conta")
	private Integer numDigConta;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public Short getAnno() {
		return anno;
	}

	public void setAnno(Short anno) {
		this.anno = anno;
	}

	public Short getNumConta() {
		return numConta;
	}

	public void setNumConta(Short numConta) {
		this.numConta = numConta;
	}

	public Integer getValConta() {
		return valConta;
	}

	public void setValConta(Integer valConta) {
		this.valConta = valConta;
	}

	public String getDesConta() {
		return desConta;
	}

	public void setDesConta(String desConta) {
		this.desConta = desConta;
	}

	public Integer getNumDigConta() {
		return numDigConta;
	}

	public void setNumDigConta(Integer numDigConta) {
		this.numDigConta = numDigConta;
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

	public Contador() {
		super();
	}
}
