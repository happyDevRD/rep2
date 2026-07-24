package com.greenaall.exception;

public class NoCertificadoFoundException extends RuntimeException {

	private static final long serialVersionUID = 7884746348563382347L;

	public NoCertificadoFoundException() {

        super("No existe certificado digital para el usuario firmante");
    }
}
