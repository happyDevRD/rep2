package com.greenaall.exception;

public class ErrorEnvioEmail extends RuntimeException{

	private static final long serialVersionUID = 5576032888328760605L;

	public ErrorEnvioEmail() {

        super("Se ha producido un error en el envío de correo.");
    }
}
