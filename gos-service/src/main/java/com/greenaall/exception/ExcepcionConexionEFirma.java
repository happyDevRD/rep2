package com.greenaall.exception;

public class ExcepcionConexionEFirma extends RuntimeException{

	private static final long serialVersionUID = -8733404305272445291L;

	public ExcepcionConexionEFirma() {

        super("No se ha podido conectar con eFirma.");
    }
}
