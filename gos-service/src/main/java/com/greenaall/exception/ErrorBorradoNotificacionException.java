package com.greenaall.exception;

public class ErrorBorradoNotificacionException extends RuntimeException{

	private static final long serialVersionUID = -8922446767706882267L;

	public ErrorBorradoNotificacionException() {

        super("No se pueden borrar notificaciones que no estén en estado generada.");
    }
}
