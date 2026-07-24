package com.greenaall.exception;

public class NotificacionExistenteException extends RuntimeException{

	private static final long serialVersionUID = -8444571823676253379L;

	public NotificacionExistenteException() {

        super("La tarea ya tiene una notificación.");
    }
}
