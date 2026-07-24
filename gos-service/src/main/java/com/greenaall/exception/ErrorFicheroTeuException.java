package com.greenaall.exception;

public class ErrorFicheroTeuException extends RuntimeException {

	private static final long serialVersionUID = 4357953183449860868L;

	public ErrorFicheroTeuException() {

        super("Se ha producido un error generando el fichero TEU.");
    }
	
}
