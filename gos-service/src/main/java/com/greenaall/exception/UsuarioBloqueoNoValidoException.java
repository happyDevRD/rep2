package com.greenaall.exception;

public class UsuarioBloqueoNoValidoException extends RuntimeException {

	private static final long serialVersionUID = -4618205967314601946L;

	public UsuarioBloqueoNoValidoException(String usuario) {

        super(String.format("Usuario bloqueado", usuario));
    }
}
