package com.greenaall.ge.dto;

import java.io.Serializable;
 
public class ArchivoDto implements Serializable {
	
	private static final long serialVersionUID = 5482234211660010980L;
	private String sFichero64;
	private String sNomFiche;
	private Short ejeExped;
	private Integer numExped;
	private String usuContr;
	
	public String getsFichero64() {
		return sFichero64;
	}
	public void setsFichero64(String sFichero64) {
		this.sFichero64 = sFichero64;
	}
	public String getsNomFiche() {
		return sNomFiche;
	}
	public void setsNomFiche(String sNomFiche) {
		this.sNomFiche = sNomFiche;
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
	public String getUsuContr() {
		return usuContr;
	}
	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}


}
