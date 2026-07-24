package com.greenaall.pa.dto;

public interface ProtegibleLOPD {
	public static final Integer DATOS_PROTEGIDOS = Integer.valueOf(1);
	public static final Short BLOQUEO_LOPD = Short.valueOf("1");
	public static final Short ACCESO_DATOS_RESTRINGIDOS = Short.valueOf("1");
	public static final Short NO_ACCESO_DATOS_RESTRINGIDOS = Short.valueOf("0");

	/**
	 * Devuelve si los datos estan protegidos por LOPD
	 * 
	 * @return
	 */
	public boolean isDatosProtegidos();
}
