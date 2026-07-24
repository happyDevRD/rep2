package com.greenaall.exception;

public class NoDataFoundException extends RuntimeException{

	private static final long serialVersionUID = -5028875360121789678L;
	
	public NoDataFoundException() {

        super("No se han encontrado datos.");
    }

}
