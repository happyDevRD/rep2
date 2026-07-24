package com.greenaall.models.ge.entity;

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
@IdClass(ParametroSistemaPK.class)
@Table(name = "ge_parametro_sistema")
public class ParametroSistema implements Serializable {

	private static final long serialVersionUID = 8361622032183095114L;
	
	@Id
	@Column(name = "cod_entid")
	private Long codEntid;
	
	@Id
	@Column(name = "anno")
	private Long anno;
	
	@Id
	@Column(name = "idioma")
	private String idioma;
	
	@Id
	@Column(name = "num_valor")
	private Short numValor;
	
	@Column(name = "des_valor")
	private String desValor;
	
	@Column(name = "valor")
	private String valor;
	
	@Column(name = "modulo")
	private Short modulo;
	
	@Column(name = "tab_valid")
	private String tabValid;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Long codEntid) {
		this.codEntid = codEntid;
	}

	public Long getAnno() {
		return anno;
	}

	public void setAnno(Long anno) {
		this.anno = anno;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public String getTabValid() {
		return tabValid;
	}

	public void setTabValid(String tabValid) {
		this.tabValid = tabValid;
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

	public ParametroSistema() {
		super();
	}
}
