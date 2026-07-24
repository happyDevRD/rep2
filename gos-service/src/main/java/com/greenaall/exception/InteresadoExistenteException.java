package com.greenaall.exception;

public class InteresadoExistenteException extends RuntimeException{

	private static final long serialVersionUID = 4854824797141932014L;

	public InteresadoExistenteException() {

        super("El interesado ya existe.");
    }
}
