package com.greenaall.exception;

public class UsuarioPassNoValidoException extends RuntimeException {

	private static final long serialVersionUID = 2125224714670066635L;
	public UsuarioPassNoValidoException(String usuario) {

        super(String.format("La contraseña no coincide", usuario));
    }
}
