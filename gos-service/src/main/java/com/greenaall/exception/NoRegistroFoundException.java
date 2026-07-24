package com.greenaall.exception;

public class NoRegistroFoundException extends RuntimeException {

	private static final long serialVersionUID = 4062283241537246109L;

	public NoRegistroFoundException() {

		super("No se han encontrado registro principal en esta entidad.");
    }

}
