package com.greenaall.exception;

public class NoDNIUsuarioFoundException extends RuntimeException {

	private static final long serialVersionUID = 6542854308002877923L;

	public NoDNIUsuarioFoundException() {

        super("El usuario no tiene el campo DNI relleno.");
    }
}
