package com.greenaall.exception;

public class OrganizacionElementoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6596338854872432977L;

	public OrganizacionElementoNotFoundException(Long id) {

        super(String.format("Organización no encontrada", id));
    }
}
