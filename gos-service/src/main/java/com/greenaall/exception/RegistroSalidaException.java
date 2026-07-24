package com.greenaall.exception;

public class RegistroSalidaException extends RuntimeException{
	
	private static final long serialVersionUID = 979753441857306821L;

	public RegistroSalidaException() {

        super("El documento ya tiene un registro salida.");
    }

}
