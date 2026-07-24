package com.greenaall.exception;

public class NoFechaFinException extends RuntimeException {

	private static final long serialVersionUID = 7347429931504258374L;

	public NoFechaFinException() {

        super("No se ha podido cerrar el expediente. Existen tareas sin finalizar.");
    }
}
