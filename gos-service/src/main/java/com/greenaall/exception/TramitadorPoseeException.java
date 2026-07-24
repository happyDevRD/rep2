package com.greenaall.exception;

public class TramitadorPoseeException extends RuntimeException {

	private static final long serialVersionUID = -4871972542413247535L;

	public TramitadorPoseeException() {

        super("El destinatario ya posee el expediente.");
    }
}
