package com.greenaall.exception;

public class ExcepcionNoExisteParametroSistema extends RuntimeException{

	private static final long serialVersionUID = -6368423217090925131L;

	public ExcepcionNoExisteParametroSistema(String parametro) {

        super("No existe el parámetro del sistema: " + parametro);
    }
}
