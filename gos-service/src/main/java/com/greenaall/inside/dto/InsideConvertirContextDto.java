package com.greenaall.inside.dto;

import java.util.ArrayList;
import java.util.List;

import com.greenaall.ge.dto.IndiceENI;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;

public class InsideConvertirContextDto {

	private Expediente expediente;
	private String organoDir3;
	private String clasificacion;
	private List<String> interesados = new ArrayList<>();
	private List<IndiceENI> indiceEni = new ArrayList<>();
	private List<AtributoExpediente> atributos = new ArrayList<>();
	private List<InsideTareaDocumentoContextDto> documentos = new ArrayList<>();

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public String getOrganoDir3() {
		return organoDir3;
	}

	public void setOrganoDir3(String organoDir3) {
		this.organoDir3 = organoDir3;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public List<String> getInteresados() {
		return interesados;
	}

	public void setInteresados(List<String> interesados) {
		this.interesados = interesados;
	}

	public List<IndiceENI> getIndiceEni() {
		return indiceEni;
	}

	public void setIndiceEni(List<IndiceENI> indiceEni) {
		this.indiceEni = indiceEni;
	}

	public List<AtributoExpediente> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<AtributoExpediente> atributos) {
		this.atributos = atributos;
	}

	public List<InsideTareaDocumentoContextDto> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<InsideTareaDocumentoContextDto> documentos) {
		this.documentos = documentos;
	}
}
