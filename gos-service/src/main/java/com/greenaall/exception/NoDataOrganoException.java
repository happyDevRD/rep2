package com.greenaall.exception;

public class NoDataOrganoException extends RuntimeException {
	
	private static final long serialVersionUID = -4329161012320240781L;

	public NoDataOrganoException() {

        super("El elemento de organización no tiene relleno el campo órgano");
    }

}
