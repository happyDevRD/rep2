package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
 * Clase de control de datos de certificados emitidos por CA UANATACA
 * @author dgarcia
 *
 */
public class InfoCertificadoUANATACA implements InfoCertificado{
	
	private Map<String,String> propOID;
	private X509Certificate cert;
	public static final String AC_UANATACA = "UANATACA CA1 2016";
	private static final String CON_REPRESENTANTE_1 = "CON_REPRESENTANTE_1";
	private static final String CON_REPRESENTANTE_2 = "CON_REPRESENTANTE_2";
	private static final String SIN_REPRESENTANTE = "SIN_REPRESENTANTE";
	private String tipoCert;
	
	public InfoCertificadoUANATACA(X509Certificate cert, String proyecto){
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
		tipoCert = getTipoCert(cert);
	}
	
	public String getEntidadCertificadora(){
		
		// Sacamos la entidad emisora.
		String entidadEmisora = "";
		String s2 = cert.getIssuerDN().getName();
		s2 = s2.replaceAll(", ", ",");
		
		String[] as2 = s2.split(",");
		
		for(int i=0; i<as2.length; i++) {
			if(as2[i].contains("CN=")) {
				entidadEmisora = as2[i].replaceAll("CN=", "");
			}
		}
		
		if (AC_UANATACA.equalsIgnoreCase(entidadEmisora)) {
			return AC_UANATACA;
		}
				
		return null;
		
	}
	
	public String getDNI(){
		String res = null;
		try {
			// CN=Test Nombre Apellido 1 Apellido 2, SERIALNUMBER=IDCES-99999999R, 
			// GIVENNAME=Test Nombre, SURNAME=Apellido 1 Apellido 2, C=ES
			String cn = this.cert.getSubjectDN().getName();
			cn = cn.substring(cn.indexOf("SERIALNUMBER="));
			cn = cn.replaceFirst("SERIALNUMBER=", "");
			cn = cn.substring(cn.indexOf("-"), cn.indexOf(","));
			cn = cn.replaceFirst("-", "");
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
		return this.getOID("2.5.29.17");
	}
	
	public String getNombre(){
		String res = null;
		try {
			// CN=Test Nombre Apellido 1 Apellido 2, SERIALNUMBER=IDCES-99999999R, 
			// GIVENNAME=Test Nombre, SURNAME=Apellido 1 Apellido 2, C=ES
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
		String res = null;
		try {
			// CN=Test Nombre Apellido 1 Apellido 2, SERIALNUMBER=IDCES-99999999R, 
			// GIVENNAME=Test Nombre, SURNAME=Apellido 1 Apellido 2, C=ES
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

	public String getCIF(){

		try {
			
			if (CON_REPRESENTANTE_1.equals(tipoCert)) {

				// CN=99999999R Test Nombre Apellido 1 Apellido 2 (R: A66721499)
				String cn = getSubjectCN();
				cn = cn.substring(cn.indexOf("R:"));
				cn = cn.replace("R:", "").trim();
				cn = cn.replace(")", "").trim();
				return cn;
				
			} else if (CON_REPRESENTANTE_2.equals(tipoCert)) {

				// CN=Test Nombre Apellido 1 Apellido 2 / A66721499
				String cn = getSubjectCN();
				cn = cn.substring(cn.indexOf("/"));
				cn = cn.replace("/", "").trim();
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

				// OID.2.5.4.13=Descripci�n, OID.2.5.4.97=VATES-A66721499, 
				// CN=99999999R Test Nombre Apellido 1 Apellido 2 (R: A66721499), 
				// SERIALNUMBER=IDCES-99999999R, GIVENNAME=Test Nombre, 
				// SURNAME=Apellido 1 Apellido 2, T=6, OU=Unidad Organizativa 1, 
				// O=Nombre de la Organizaci�n, C=ES

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
			System.err.println("ERROR TRATANDO NOMBRE PERSONA JURIDICA CERTIFICADO UANATACA");
			ex.printStackTrace();
		}

		return null;

	}
	
	private String getOID(String OID){
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";		
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
				} else if (cn.contains("/ Num:")) {
					return SIN_REPRESENTANTE;
				} else if (cn.contains("/")) {
					return CON_REPRESENTANTE_2;
				}
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
