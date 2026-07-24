package com.greenaall.exception;

public class MetadatoGrupoAtribError extends RuntimeException {

	private static final long serialVersionUID = -8315655113923866136L;

	public MetadatoGrupoAtribError(String mensaje) {

		super(String.format("La etiqueta " + mensaje + " ya están asignadas a otro atributo"));
	}
}
