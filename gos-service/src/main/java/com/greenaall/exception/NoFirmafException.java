package com.greenaall.exception;

public class NoFirmafException extends RuntimeException {

	private static final long serialVersionUID = -8004490325683320989L;

	public NoFirmafException() {

        super("Se ha producido un error en el firmado del documento.");
    }
}
