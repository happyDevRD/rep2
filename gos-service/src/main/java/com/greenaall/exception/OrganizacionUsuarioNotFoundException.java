package com.greenaall.exception;

public class OrganizacionUsuarioNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1704628615339362838L;

	public OrganizacionUsuarioNotFoundException(String usuario) {

        super(String.format("Organización Usuario no encontrada", usuario));
    }
	
	public OrganizacionUsuarioNotFoundException(Long id) {

        super(String.format("Organización Usuario no encontrada", id));
    }
}
