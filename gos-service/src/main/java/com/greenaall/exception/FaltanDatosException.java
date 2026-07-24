package com.greenaall.exception;

public class FaltanDatosException extends RuntimeException {

	private static final long serialVersionUID = 7666007161933526929L;

	public FaltanDatosException() {

        super("Debe rellenar todos los campos obligatorios.");
    }
}
