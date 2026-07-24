package com.greenaall.exception;

public class NoDescripcionException extends RuntimeException {

	private static final long serialVersionUID = 1446652980872923773L;

	public NoDescripcionException() {

        super("Es necesaria la descripción.");
    }
}
