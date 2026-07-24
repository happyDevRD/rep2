package com.greenaall.exception;

public class NoInstructorFoundException extends RuntimeException{

	private static final long serialVersionUID = -5780588857917229348L;

	public NoInstructorFoundException() {

        super("No se puede iniciar la tramitación, no existe instructor.");
    }
}
