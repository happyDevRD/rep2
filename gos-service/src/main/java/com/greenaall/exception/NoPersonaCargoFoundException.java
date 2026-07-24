package com.greenaall.exception;

public class NoPersonaCargoFoundException extends RuntimeException {

	private static final long serialVersionUID = -7438091497299298806L;

	public NoPersonaCargoFoundException() {

        super("No existe cargo para el usuario.");
    }
}
