package com.greenaall.exception;

public class UsuarioNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1154093647135209979L;

	public UsuarioNotFoundException(String usuario) {

        super(String.format("El usuario no ha sido encontrado", usuario));
    }

}
