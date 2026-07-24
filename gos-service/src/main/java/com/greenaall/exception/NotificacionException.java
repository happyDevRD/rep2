package com.greenaall.exception;

public class NotificacionException extends RuntimeException{
	
	private static final long serialVersionUID = 7306966464595356082L;

	public NotificacionException() {

        super("El documento ya tiene notificación.");
    }

}
