package com.greenaall.exception;

public class PropuestaExistenteException extends RuntimeException{

	private static final long serialVersionUID = 7826261627343097149L;

	public PropuestaExistenteException() {

        super("La tarea ya tiene una propuesta de resolución.");
    }
}
