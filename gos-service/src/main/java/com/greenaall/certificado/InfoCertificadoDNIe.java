package com.greenaall.certificado;

import java.security.cert.X509Certificate;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoDNIe implements InfoCertificado{
	
	private X509Certificate cert;
	
	public InfoCertificadoDNIe(X509Certificate cert){
		this.cert = cert;
	}
	
	public String getDNI(){
		// Sacamos el DNI.
		String s = cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");
		
		String[] as = s.split(",");
		
		String dni = "";
		
		for(int i=0; i<as.length; i++){
			if(as[i].contains("SERIALNUMBER=")){
				dni = as[i].replaceFirst("SERIALNUMBER=", "");
			}
		}
		
		if(StringUtils.isNotBlank(dni)){
			return dni;
		}else{
			return null;
		}
	}
	
	public String getNombrePersonaFisica(){
		
		// Sacamos el nombre completo.
		String s = cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");
		
		String[] as = s.split(",");
		
		String apellidos = "";
		String nombre = "";
		
		for(int i=0; i<as.length; i++){
			if(as[i].contains("CN=")){
				apellidos = as[i].replaceFirst("CN=", "");
			}
			
			if(as[i].contains("GIVENNAME=")){
				nombre = as[i].replaceFirst("GIVENNAME=", "");
			}
		}
		
		String nombreCompleto = nombre + " " + apellidos;		
		
		if(StringUtils.isNotBlank(nombreCompleto)){
			return nombreCompleto;
		}else{
			return null;
		}
	}
	
	public String getEntidadCertificadora(){
		// Sacamos la entidad emisora.
		String entidadEmisora = "";
		String s2 = cert.getIssuerDN().getName();
		s2 = s2.replaceAll(", ", ",");
		
		String[] as2 = s2.split(",");
		
		for(int i=0; i<as2.length; i++){
			if(as2[i].contains("OU=")){
				entidadEmisora = as2[i].replaceAll("OU=", "");
			}
		}		
		
		if(StringUtils.isNotBlank(entidadEmisora)){
			return entidadEmisora;
		}else{
			return null;
		}
	}

	public String getCIF() {
		// Este tipo de certificados nunca va a conterner este dato.
		return null;
	}

	public String getNombrePersonaJuridica() {
		// Este tipo de certificados nunca va a conterner este dato.
		return null;
	}

	public String getEmail() {
		// TODO Pendiente de desarrollo rescatar e-mail DNI-e.
		return null;
	}
	
	// TODO: Pendiente de desarrollar DNI-e getNombre.
	public String getNombre() {
		return null;
	}

	// TODO: Pendiente de desarrollar DNI-e getApellidos.
	public String getApellidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrimerApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSegundoApellido() {
		// TODO Auto-generated method stub
		return null;
	}

}
