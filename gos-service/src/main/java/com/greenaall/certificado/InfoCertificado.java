package com.greenaall.certificado;

/**
 * Interfaz de informacion relacionada a un certificado digital.
 * 
 * @author dgarcia
 *
 */
public interface InfoCertificado {
	
	String getPrimerApellido = null;

	public String getEntidadCertificadora();
	
	public String getDNI();
	public String getNombrePersonaFisica();
	public String getNombre();
	public String getApellidos();
	public String getPrimerApellido();
	public String getSegundoApellido();

	public String getCIF();
	public String getNombrePersonaJuridica();
	
	public String getEmail();
	
}
