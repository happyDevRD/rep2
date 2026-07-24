package com.greenaall.exception;

public class NoFicheroPdfException extends RuntimeException{

	private static final long serialVersionUID = -7934345090632702767L;

	public NoFicheroPdfException() {

        super("No se puede firmar un archivo que no sea pdf.");
    }
}
