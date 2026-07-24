package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoFNMT implements InfoCertificado {
	
	private Map<String,String> propOID;
	
	public InfoCertificadoFNMT(X509Certificate cert, String proyecto){
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}
	
	public String getEntidadCertificadora(){
		return this.getOID("2.5.4.10");
	}
	
	public String getDNI(){
		return this.getOID("1.3.6.1.4.1.5734.1.4");
	}
	
	public String getNombrePersonaFisica(){
		return this.getApellidos() + " " + this.getNombre();
	}
	
	public String getCIF(){
		return this.getOID("1.3.6.1.4.1.5734.1.7");
	}
	
	public String getNombrePersonaJuridica(){
		return this.getOID("1.3.6.1.4.1.5734.1.6");
	}
	
	public String getEmail(){
		return this.getOID("2.5.29.17");
	}

	public String getNombre(){
		return this.getOID("1.3.6.1.4.1.5734.1.1");
	}
	
	public String getApellidos(){
		return this.getPrimerApellido() + " " + this.getSegundoApellido();		
	}
	
	public String getPrimerApellido(){
		return this.getOID("1.3.6.1.4.1.5734.1.2");
	}
	
	public String getSegundoApellido(){
		return this.getOID("1.3.6.1.4.1.5734.1.3");
	}
	
	private String getOID(String OID){
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";		
	}
}
