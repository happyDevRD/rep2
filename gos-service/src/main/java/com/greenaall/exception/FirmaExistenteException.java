package com.greenaall.exception;

public class FirmaExistenteException extends RuntimeException{

	private static final long serialVersionUID = 2356362709973327424L;
	public FirmaExistenteException() {

        super("El documento ya tiene una firma.");
    }

}
