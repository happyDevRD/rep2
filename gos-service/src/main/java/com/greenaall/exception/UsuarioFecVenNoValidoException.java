package com.greenaall.exception;

public class UsuarioFecVenNoValidoException extends RuntimeException {

	private static final long serialVersionUID = -5726690799064537263L;

	public UsuarioFecVenNoValidoException(String usuario) {

        super(String.format("Usuario con fecha vencida", usuario));
    }
}
