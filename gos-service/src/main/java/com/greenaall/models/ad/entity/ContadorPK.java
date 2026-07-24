package com.greenaall.models.ad.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class ContadorPK implements Serializable{

	private static final long serialVersionUID = 4542357757455995677L;
	
	 @Column(name = "cod_entid")
	 private Short codEntid;
	 
	 @Column(name = "modulo")
	 private Short modulo;
	 
	 @Column(name = "anno")
	 private Short anno;
	 
	 @Column(name = "num_conta")
	 private Short numConta;

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

	public ContadorPK(Short codEntid, Short modulo, Short anno, Short numConta) {
		super();
		this.codEntid = codEntid;
		this.modulo = modulo;
		this.anno = anno;
		this.numConta = numConta;
	}

	public ContadorPK() {
		super();
	} 
}
