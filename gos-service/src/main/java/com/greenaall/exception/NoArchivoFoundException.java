package com.greenaall.exception;

public class NoArchivoFoundException extends RuntimeException {

	private static final long serialVersionUID = -9028079065572342834L;
	
	public NoArchivoFoundException() {

        super("La tarea no tiene documento.");
    }

}
