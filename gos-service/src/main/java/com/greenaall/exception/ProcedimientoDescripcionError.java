package com.greenaall.exception;

public class ProcedimientoDescripcionError extends BusinessException {

	private static final long serialVersionUID = -7539998384083175909L;

	public ProcedimientoDescripcionError() {
        super("Ya existe un procedimiento con esa descripción.");
    }
}
