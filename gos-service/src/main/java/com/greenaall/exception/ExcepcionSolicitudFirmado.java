package com.greenaall.exception;

public class ExcepcionSolicitudFirmado extends RuntimeException{

	private static final long serialVersionUID = -1615125711050287394L;

	public ExcepcionSolicitudFirmado() {

        super("No se ha podido enviar el documento a eFirma.");
    }
}
