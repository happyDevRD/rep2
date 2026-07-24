package com.greenaall.exception;

public class ExcepcionArchivoExistente extends BusinessException {

	private static final long serialVersionUID = 8167127355981955431L;

	public ExcepcionArchivoExistente() {
        super("El archivo ya existe en el servidor.");
    }
}
