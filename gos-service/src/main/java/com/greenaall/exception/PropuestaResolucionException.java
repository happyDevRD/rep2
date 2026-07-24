package com.greenaall.exception;

public class PropuestaResolucionException extends RuntimeException{

	private static final long serialVersionUID = 341771671061149057L;

	public PropuestaResolucionException() {

        super("El documento ya tiene una propuesta de resolución.");
    }
}
