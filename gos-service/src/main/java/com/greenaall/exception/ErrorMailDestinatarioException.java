package com.greenaall.exception;

public class ErrorMailDestinatarioException extends RuntimeException {

	private static final long serialVersionUID = 3387910254546547090L;

	public ErrorMailDestinatarioException() {

        super("No se puede mandar un mensaje a sí mismo.");
    }
}
