package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoFNMTFuncionario implements InfoCertificado {

	private X509Certificate cert;
	private Map<String,String> propOID;
	
	public InfoCertificadoFNMTFuncionario(X509Certificate cert, String proyecto){
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
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
	
	public String getDNI(){
		return this.getOID("2.16.724.1.3.5.3.2.4");
	}
	
	public String getNombreCompleto(){
		return this.getApellidos() + " " + this.getNombre();
	}
	
	public String getSerialNumber(){
		return this.getOID("2.16.724.1.3.5.3.2.3");
	}
	
	public String getNombrePersonaJuridica(){
		return this.getOID("2.16.724.1.3.5.3.2.2");
	}
	
	public String getEmail(){
		return this.getOID("2.16.724.1.3.5.3.2.9");
	}

	public String getNombre(){
		return this.getOID("2.16.724.1.3.5.3.2.6");
	}
	
	public String getApellidos(){
		return this.getPrimerApellido() + " " + this.getSegundoApellido();		
	}
	
	public String getPrimerApellido(){
		return this.getOID("2.16.724.1.3.5.3.2.7");
	}
	
	public String getSegundoApellido(){
		return this.getOID("2.16.724.1.3.5.3.2.8");
	}
	
	public String getNombrePersonaFisica() {
		return this.getApellidos() + " " + this.getNombre();
	} 
	
	public String getCIF() {
		return null;
	}
	
	private String getOID(String OID){
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";		
	}
	
}
