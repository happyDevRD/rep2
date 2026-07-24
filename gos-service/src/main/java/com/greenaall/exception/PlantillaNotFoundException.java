package com.greenaall.exception;

public class PlantillaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4404101869285365397L;

	public PlantillaNotFoundException(String plantilla) {

        super(String.format("La plantilla no ha sido encontrada", plantilla));
    }
}
