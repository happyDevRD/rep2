package com.greenaall.models.ge.entity;

public class ParametroSistemaPK implements java.io.Serializable {
	
	private static final long serialVersionUID = 2809979340163425266L;

	private Long codEntid;
	private Long anno;
	private String idioma;
	private Short numValor;
	
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
	public ParametroSistemaPK(Long codEntid, Long anno, String idioma, Short numValor) {
		super();
		this.codEntid = codEntid;
		this.anno = anno;
		this.idioma = idioma;
		this.numValor = numValor;
	}
	public ParametroSistemaPK() {
		super();
	}
	
	
}
