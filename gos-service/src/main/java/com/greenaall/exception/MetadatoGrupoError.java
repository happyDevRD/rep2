package com.greenaall.exception;

public class MetadatoGrupoError extends RuntimeException {

	private static final long serialVersionUID = 7276275888919831987L;

	public MetadatoGrupoError(String mensaje) {

        super(String.format("Las siglas " + mensaje + " ya están asignadas a otro procedimiento"));
    }
}
