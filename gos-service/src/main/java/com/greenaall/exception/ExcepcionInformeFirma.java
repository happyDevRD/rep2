package com.greenaall.exception;

public class ExcepcionInformeFirma extends RuntimeException{
	
	private static final long serialVersionUID = -3800925749384631132L;

	public ExcepcionInformeFirma() {

        super("Se ha producido un error al obtener el informe de firma.");
    }

}
