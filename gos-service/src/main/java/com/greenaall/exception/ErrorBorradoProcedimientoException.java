package com.greenaall.exception;

public class ErrorBorradoProcedimientoException extends RuntimeException{

	private static final long serialVersionUID = 355259463198435382L;
	public ErrorBorradoProcedimientoException() {

        super("No se ha podido borrar el procedimiento. Existen expedientes asociados");
    }

}
