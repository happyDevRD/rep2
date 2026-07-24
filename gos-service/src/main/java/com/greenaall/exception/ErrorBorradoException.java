package com.greenaall.exception;

public class ErrorBorradoException extends RuntimeException{

	private static final long serialVersionUID = 355259463198435382L;

	public ErrorBorradoException() {

        super("No se ha podido borrar el elemento. Existen elementos dependientes asociados");
    }
}
