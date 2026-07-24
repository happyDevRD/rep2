package com.greenaall.exception;

public class UsuarioFecVenPassNoValidoException extends RuntimeException {

	private static final long serialVersionUID = 1238663118772148888L;

	public UsuarioFecVenPassNoValidoException(String usuario) {

        super(String.format("Usuario con fecha pass vencida", usuario));
    }
}
