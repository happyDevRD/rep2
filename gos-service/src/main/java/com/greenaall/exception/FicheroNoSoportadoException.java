package com.greenaall.exception;

public class FicheroNoSoportadoException extends RuntimeException {

	private static final long serialVersionUID = -5297874876451870496L;

	public FicheroNoSoportadoException() {

        super("No se puede generar documento ENI de ese tipo de fichero.");
    }
}
