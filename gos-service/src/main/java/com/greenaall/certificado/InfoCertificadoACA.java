package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import org.apache.commons.lang.StringUtils;

/**
 * Clase de control de datos de certificados emitidos por CA ACA
 * @author dgarcia
 *
 */
public class InfoCertificadoACA implements InfoCertificado{
	
	private X509Certificate cert;
	public static final String AUTORIDAD_CERTIFICADORA = "AUTORIDAD DE CERTIFICACION DE LA ABOGACIA";
	private static final String CON_REPRESENTANTE_1 = "CON_REPRESENTANTE_1";
	private static final String CON_REPRESENTANTE_2 = "CON_REPRESENTANTE_2";
	private static final String SIN_REPRESENTANTE = "SIN_REPRESENTANTE";
	private String tipoCert;
	
	public InfoCertificadoACA(X509Certificate cert, String proyecto){
		this.cert = cert;
		tipoCert = getTipoCert(cert);
	}
	
	public String getEntidadCertificadora(){
		
		// Sacamos la entidad emisora.
		String entidadEmisora = "";
		String s2 = cert.getIssuerDN().getName();
		s2 = s2.replaceAll(", ", ",");
		
		String[] as2 = s2.split(",");
		
		for(int i=0; i<as2.length; i++) {
			if(as2[i].contains("OU=")) {
				entidadEmisora = as2[i].replaceAll("OU=", "");
			}
		}
		
		if (AUTORIDAD_CERTIFICADORA.equalsIgnoreCase(entidadEmisora)) {
			return AUTORIDAD_CERTIFICADORA;
		}
				
		return null;
		
	}
	
	public String getDNI(){
		String res = null;
		try {
			String cn = this.cert.getSubjectDN().getName();
			cn = cn.substring(cn.indexOf("SERIALNUMBER="));
			cn = cn.replaceFirst("SERIALNUMBER=", "");
			cn = cn.substring(0, cn.indexOf(","));
			res = cn;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}
	
	public String getNombrePersonaFisica(){
		return this.getApellidos() + " " + this.getNombre();
	}
	
	public String getEmail(){
		String res = null;
		try {
			String cn = this.cert.getSubjectDN().getName();
			cn = cn.substring(cn.indexOf("EMAILADDRESS="));
			cn = cn.replaceFirst("EMAILADDRESS=", "");
			cn = cn.substring(0, cn.indexOf(","));
			res = cn;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}

	public String getNombre(){
		String res = null;
		try {
			String cn = this.cert.getSubjectDN().getName();
			cn = cn.substring(cn.indexOf("GIVENNAME="));
			cn = cn.replaceFirst("GIVENNAME=", "");
			cn = cn.substring(0, cn.indexOf(","));
			res = cn;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}
	
	public String getApellidos(){
		String res = "";
		try {
			String apellido1 = getPrimerApellido();
			String apellido2 = getSegundoApellido();
			
			if (StringUtils.isNotBlank(apellido1)) {
				res += apellido1;
			}
			
			if (StringUtils.isNotBlank(apellido2)) {
				res += " " + apellido2;
			}
			
			if (StringUtils.isBlank(res)) {
				res = null;
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}
	
	public String getPrimerApellido(){
		String res = null;
		try {
			String cn = this.cert.getSubjectDN().getName();
			cn = cn.substring(cn.indexOf("SURNAME="));
			cn = cn.replaceFirst("SURNAME=", "");
			cn = cn.substring(0, cn.indexOf(","));
			res = cn;	
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}
	
	public String getSegundoApellido(){
		String res = null;
		try {
			String cn = this.cert.getSubjectDN().getName();
			cn = cn.substring(cn.indexOf("1.3.6.1.4.1.16533.30.1="));
			cn = cn.replaceFirst("1.3.6.1.4.1.16533.30.1=", "");
			int index = cn.indexOf(",");
			if (index > -1) {
				cn = cn.substring(0, index);
			}
			res = cn.trim();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}


	public String getCIF(){

		try {
			
			if (CON_REPRESENTANTE_1.equals(tipoCert)) {

				String cn = getSubjectCN();
				cn = cn.substring(cn.indexOf("R:"));
				cn = cn.replace("R:", "").trim();
				cn = cn.replace(")", "").trim();
				return cn;
				
			} else if (CON_REPRESENTANTE_2.equals(tipoCert)) {

				String cn = this.cert.getSubjectDN().getName();
				cn = cn.substring(cn.indexOf("1.3.6.1.4.1.16533.30.2="));
				cn = cn.replaceFirst("1.3.6.1.4.1.16533.30.2=", "");
				cn = cn.substring(0, cn.indexOf(","));
				return cn;
			}
			
		} catch (Exception ex) {
			System.err.println("ERROR TRATANDO CIF CERTIFICADO UANATACA");
			ex.printStackTrace();
		}

		return null;

	}

	public String getNombrePersonaJuridica(){

		try {
			
			if (CON_REPRESENTANTE_1.equals(tipoCert) || CON_REPRESENTANTE_2.equals(tipoCert)) {

				String subject = cert.getSubjectDN().getName();
				subject = subject.replaceAll(", ", ",");
				String[] as2 = subject.split(",");

				for(int i=0; i<as2.length; i++) {
					if(as2[i].contains("O=")) {
						return as2[i].replaceAll("O=", "");
					}
				}

			} 
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;

	}
	
	private String getTipoCert(X509Certificate cert){
		
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");
		String[] as2 = s2.split(",");
		
		for(int i=0; i<as2.length; i++) {
			if(as2[i].contains("CN=")) {
				String cn = as2[i].replaceAll("CN=", "");
				if (cn.contains("(R:")) {
					return CON_REPRESENTANTE_1;					
				}
			} else if (as2[i].contains("1.3.6.1.4.1.16533.30.2=")) {
				return CON_REPRESENTANTE_2;
			}
		}
		
		return SIN_REPRESENTANTE;
		
	}
	
	private String getSubjectCN() {
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");
		String[] as2 = s2.split(",");
		for(int i=0; i<as2.length; i++) {
			if(as2[i].contains("CN=")) {
				return as2[i].replaceAll("CN=", "");
			}
		}
		return null;
	}

}
