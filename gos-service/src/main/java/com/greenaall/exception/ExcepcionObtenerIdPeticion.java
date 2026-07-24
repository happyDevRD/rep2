package com.greenaall.exception;

public class ExcepcionObtenerIdPeticion  extends RuntimeException{

	private static final long serialVersionUID = -2775884552753910532L;

	public ExcepcionObtenerIdPeticion() {

        super("El archivo no tiene petición de firmado.");
    }
}
