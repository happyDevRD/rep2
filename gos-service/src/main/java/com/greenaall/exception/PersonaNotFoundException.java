package com.greenaall.exception;

public class PersonaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4767711246047807033L;
	public PersonaNotFoundException(String numDocum) {

        super(String.format("La persona no ha sido encontrada", numDocum));
    }

}
