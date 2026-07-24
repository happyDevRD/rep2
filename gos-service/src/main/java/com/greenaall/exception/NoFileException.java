package com.greenaall.exception;

public class NoFileException extends RuntimeException {

	private static final long serialVersionUID = 2083732662738009021L;

	public NoFileException() {

        super("No existe el archivo.");
    }
}
