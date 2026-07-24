package com.greenaall.certificado;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoCamerfirmaPerFisRepre implements InfoCertificado {

	private X509Certificate cert;
	private Map<String, String> propOID;
	public static String CA_CAMERFIRMA_PRESONA_FISICA_CON_REPRESENTANTE = "CAMERFIRMA_PERSONA_FISICA_CON_REPRESENTANTE";
	
	public InfoCertificadoCamerfirmaPerFisRepre(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}

	public String getEntidadCertificadora() {
		try {
		// Sacamos la entidad emisora.
		String entidadEmisora = "";
		String s2 = cert.getIssuerDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++)
			if (as2[i].contains("O="))
				entidadEmisora = as2[i].replaceAll("O=", "").toUpperCase();

		if ("AC CAMERFIRMA S.A.".equals(entidadEmisora)) {
			String tipo = this.getOID("1.3.6.1.4.1.17326.30.10");
			if ("CERTIFICADO ELECTRONICO CUALIFICADO CORPORATIVO".equals(tipo)){
				return CA_CAMERFIRMA_PRESONA_FISICA_CON_REPRESENTANTE;				
			}
		}

		return null;
		
		} catch(Exception ex) {
			System.out.println(ex);
			return null;
		}

	}
	
	public String getDNI() {
		try {
			String result = "";
			String s2 = cert.getSubjectDN().getName();
			s2 = s2.replaceAll(", ", ",");

			String[] as2 = s2.split(",");

			for (int i = 0; i < as2.length; i++) {
				if (as2[i].contains("CN=")) {
					result = as2[i].replaceAll("CN=", "");
				}
			}
			
			// Caso de certificados de pruebas
			result = result.replace("[SOLO PRUEBAS]", "");
			result = result.replaceAll("\"", "");

			if (StringUtils.isNotBlank(result)) {
				int hasta = result.indexOf(" ");
				result = result.substring(0, hasta);
				return result;
			}

			return null;
			
		} catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}

	public String getNombrePersonaFisica() {
		return this.getApellidos() + " " + this.getNombre();
	}

	public String getCIF() {
		try {
			String result = "";
			String s2 = cert.getSubjectDN().getName();
			s2 = s2.replaceAll(", ", ",");

			String[] as2 = s2.split(",");

			for (int i = 0; i < as2.length; i++) {
				if (as2[i].contains("CN=")) {
					result = as2[i].replaceAll("CN=", "");
				}
			}

			if (StringUtils.isNotBlank(result)) {
				result = result.replaceAll(" ", "");
				int desde = result.indexOf("(C:");
				result = result.substring(desde);
				int hasta = result.indexOf(")"); 
				result = result.substring(0, hasta);
				result = result.replace("(C:", "");
				return result;
			}

			return null;
			
		} catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}

	public String getNombrePersonaJuridica() {
		try {
			String result = "";
			String s2 = cert.getSubjectDN().getName();
			s2 = s2.replaceAll(", ", ",");

			String[] as2 = s2.split(",");

			for (int i = 0; i < as2.length; i++) {
				if (as2[i].contains("O=")) {
					result = as2[i].replaceAll("O=", "");
				}
			}

			if (StringUtils.isNotBlank(result)) {
				// Caso de certificados de pruebas
				result = result.replace("[SOLO PRUEBAS]", "").trim();
				return result;
			}

			return null;
			
		} catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}

	public String getEmail() {
		// Este tipo de certificado no contiene este dato
		return null;
	}

	public String getNombre() {
		String nombre = "";
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++)
			if (as2[i].contains("GIVENNAME="))
				nombre = as2[i].replaceAll("GIVENNAME=", "");

		if (StringUtils.isNotBlank(nombre)) {
			return nombre;
		}

		return null;
	}

	public String getApellidos() {

		String apellidos = "";
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++)
			if (as2[i].contains("SURNAME="))
				apellidos = as2[i].replaceAll("SURNAME=", "");

		if (StringUtils.isNotBlank(apellidos)) {
			return apellidos;
		}

		return null;
	}

	private String getOID(String OID) {
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
	}

	public static X509Certificate loadCertificate(File f)
			throws CertificateException, IOException {
		FileInputStream in = new FileInputStream(f);
		try {
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate c = (X509Certificate) cf.generateCertificate(in);
			c.checkValidity();
			return c;
		} finally {
			in.close();
		}
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
