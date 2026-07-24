package com.greenaall.certificado;

import java.security.cert.X509Certificate;

public class InfoCertificadoIdCat implements InfoCertificado{
	
	private X509Certificate cert;
	
	public InfoCertificadoIdCat(X509Certificate cert){
		this.cert = cert;
	}
	
	public String getEntidadCertificadora(){
		String s = cert.getIssuerDN().getName();
		String[] as = s.split(",");
		String cadena = as[0].trim();
		
		int desde = cadena.indexOf("=") + 1;
		
		if(desde > -1){
			return cadena.substring(desde);	
		}else{
			return "";
		}
	}
	
	public String getDNI() {
		String s = cert.getSubjectDN().getName();
		String[] as = s.split(",");
		String cadena = as[1].trim();

		int desde = cadena.indexOf("=") + 1;
		
		if(desde > -1){
			return cadena.substring(desde);			
		}else{
			return "";
		}
	}

	public String getNombrePersonaFisica() {
		String s = cert.getSubjectDN().getName();
		String[] as = s.split(",");
		String cadena = as[0].trim();

		int desde = cadena.indexOf("=") + 1;			

		if(desde > -1){
			return cadena.substring(desde);			
		}else{
			return "";
		}
	}

	public String getCIF() {
		// TODO Pendiente de desarrollar cuando se disponga de un certificado de persona jur�dica de idCAT.
		return null;
	}

	public String getNombrePersonaJuridica() {
		// TODO Pendiente de desarrollar cuando se disponga de un certificado de persona jur�dica de idCAT.
		return null;
	}

	public String getEmail() {
		// TODO Pendiente de desarrollar cuando se disponga de un certificado de persona jur�dica de idCAT.
		return null;
	}

	// TODO: Pendiente de desarrollar DNI-e getNombre.
	public String getNombre() {
		return null;
	}

	// TODO: Pendiente de desarrollar DNI-e getApellidos.
	public String getApellidos() {
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
