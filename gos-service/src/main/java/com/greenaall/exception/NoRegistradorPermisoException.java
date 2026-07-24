package com.greenaall.exception;

public class NoRegistradorPermisoException extends RuntimeException{

	private static final long serialVersionUID = -5529488329393336037L;

	public NoRegistradorPermisoException() {

		super("El registrador no tiene permiso para insertar.");
    }
}
