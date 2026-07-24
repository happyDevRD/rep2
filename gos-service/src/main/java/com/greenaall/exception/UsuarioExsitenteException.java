package com.greenaall.exception;

public class UsuarioExsitenteException extends RuntimeException{
	
	private static final long serialVersionUID = 3505160070756606850L;

	public UsuarioExsitenteException() {

        super("Error, el usuario ya existe.");
    }
}
