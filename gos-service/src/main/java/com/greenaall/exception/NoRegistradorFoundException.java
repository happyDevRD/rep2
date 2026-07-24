package com.greenaall.exception;

public class NoRegistradorFoundException extends RuntimeException {

	private static final long serialVersionUID = 8234403407578714L;

	public NoRegistradorFoundException() {

		super("El usuario no es registrador.");
    }
}
