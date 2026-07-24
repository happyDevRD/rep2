package com.greenaall.exception;

public class ExcepcionInfDocumentacionEFirma extends RuntimeException{

	private static final long serialVersionUID = 2886066160718065721L;

	public ExcepcionInfDocumentacionEFirma() {

        super("No se ha podido obtener la información del documento con eFirma.");
    }
}
