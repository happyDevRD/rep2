package com.greenaall.exception;

public class PdfException extends BusinessException {

	private static final long serialVersionUID = 812017597293567267L;

	public PdfException() {
        super("Para finalizar la tarea el archivo debe ser un pdf.");
    }
}
