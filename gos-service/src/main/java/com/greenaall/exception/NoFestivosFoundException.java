package com.greenaall.exception;

public class NoFestivosFoundException extends RuntimeException{

	private static final long serialVersionUID = 2268863136939813618L;
	
	public NoFestivosFoundException() {

        super("No hay definido festivos para el año en curso.");
    }

}
