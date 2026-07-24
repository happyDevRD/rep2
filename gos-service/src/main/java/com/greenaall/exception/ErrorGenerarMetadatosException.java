package com.greenaall.exception;

public class ErrorGenerarMetadatosException extends RuntimeException {
	
	private static final long serialVersionUID = -8785161758945446096L;

	public ErrorGenerarMetadatosException() {

        super("Error al generar la información de los metadatos ENI.");
    }

}
