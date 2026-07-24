package com.greenaall.exception;

public class PersonaRepresentateNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -3216582433399013972L;

	public PersonaRepresentateNotFoundException() {

        super(String.format("No existen representates"));
    }

}
