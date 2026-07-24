package com.greenaall.exception;

public class FormatoDocumentoNoSoportado extends RuntimeException {

	private static final long serialVersionUID = -5072798092343121439L;

	public FormatoDocumentoNoSoportado() {

        super("El formado de documento debe ser docx u odt.");
    }
}
