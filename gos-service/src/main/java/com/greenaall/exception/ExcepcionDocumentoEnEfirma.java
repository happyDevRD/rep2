package com.greenaall.exception;

public class ExcepcionDocumentoEnEfirma extends RuntimeException{


	private static final long serialVersionUID = -9071272661432956535L;

	public ExcepcionDocumentoEnEfirma(String mensaje) {

        super(String.format("El documento ya se ha enviado al portafirma, Id Petición: " + mensaje ));
    }
}
