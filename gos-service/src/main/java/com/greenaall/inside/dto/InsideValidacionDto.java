package com.greenaall.inside.dto;

import java.util.ArrayList;
import java.util.List;

public class InsideValidacionDto {

	private boolean valido;
	private boolean expedienteCerrado;
	private int documentosConvertibles;
	private int documentosFinalizados;
	private boolean modoDryRun;
	private List<String> errores = new ArrayList<>();
	private List<String> advertencias = new ArrayList<>();

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public boolean isExpedienteCerrado() {
		return expedienteCerrado;
	}

	public void setExpedienteCerrado(boolean expedienteCerrado) {
		this.expedienteCerrado = expedienteCerrado;
	}

	public int getDocumentosConvertibles() {
		return documentosConvertibles;
	}

	public void setDocumentosConvertibles(int documentosConvertibles) {
		this.documentosConvertibles = documentosConvertibles;
	}

	public int getDocumentosFinalizados() {
		return documentosFinalizados;
	}

	public void setDocumentosFinalizados(int documentosFinalizados) {
		this.documentosFinalizados = documentosFinalizados;
	}

	public boolean isModoDryRun() {
		return modoDryRun;
	}

	public void setModoDryRun(boolean modoDryRun) {
		this.modoDryRun = modoDryRun;
	}

	public List<String> getErrores() {
		return errores;
	}

	public void setErrores(List<String> errores) {
		this.errores = errores;
	}

	public List<String> getAdvertencias() {
		return advertencias;
	}

	public void setAdvertencias(List<String> advertencias) {
		this.advertencias = advertencias;
	}
}
