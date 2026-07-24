package com.greenaall.rd.dto;

import java.io.Serializable;
import java.util.Date;

public class RdDocumentoDto implements Serializable {

	private static final long serialVersionUID = 8099459392251550913L;

	private Short ejeRegis;
	private Integer numRegis;
	private Date fecRegis;
	private String extracto;
	private String desTema;
	private String numDocom;
	private String desPerEntid;
	private String dirPosta;
	private int codPosta;
	private String provincia;
	private String municipio;

	public Short getEjeRegis() {
		return ejeRegis;
	}

	public void setEjeRegis(Short ejeRegis) {
		this.ejeRegis = ejeRegis;
	}

	public Integer getNumRegis() {
		return numRegis;
	}

	public void setNumRegis(Integer numRegis) {
		this.numRegis = numRegis;
	}

	public Date getFecRegis() {
		return fecRegis;
	}

	public void setFecRegis(Date fecRegis) {
		this.fecRegis = fecRegis;
	}

	public String getExtracto() {
		return extracto;
	}

	public void setExtracto(String extracto) {
		this.extracto = extracto;
	}

	public String getDesTema() {
		return desTema;
	}

	public void setDesTema(String desTema) {
		this.desTema = desTema;
	}

	public String getNumDocom() {
		return numDocom;
	}

	public void setNumDocom(String numDocom) {
		this.numDocom = numDocom;
	}

	public String getDesPerEntid() {
		return desPerEntid;
	}

	public void setDesPerEntid(String desPerEntid) {
		this.desPerEntid = desPerEntid;
	}

	public String getDirPosta() {
		return dirPosta;
	}

	public void setDirPosta(String dirPosta) {
		this.dirPosta = dirPosta;
	}

	public int getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(int codPosta) {
		this.codPosta = codPosta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

}
