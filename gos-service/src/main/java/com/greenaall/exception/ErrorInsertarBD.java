package com.greenaall.exception;

public class ErrorInsertarBD extends RuntimeException{

	private static final long serialVersionUID = 5728889238140546628L;
	
	public ErrorInsertarBD(String mensaje) {

        super(String.format("Error al insertar en la base de datos: " + mensaje ));
    }

}
