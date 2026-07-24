package com.greenaall.certificado;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
 * Clase de control de datos de certificados emitidos por la nueva CA de la
 * FNMT. V�lido para certificados emitidos a partir del 03/2015.
 * 
 * @author dgarcia
 * 
 */
public class InfoCertificadoBewor implements InfoCertificado {

	public static final String AUTORIDAD_CERTIFICADORA = "BEWOR TECH CA1";
	private Map<String,String> propOID;
	private X509Certificate cert;

	public InfoCertificadoBewor(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
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

	public String getEntidadCertificadora() {

		// Sacamos la entidad emisora.
		String entidadEmisora = "";
		String s2 = cert.getIssuerDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++)
			if (as2[i].contains("CN="))
				entidadEmisora = as2[i].replaceAll("CN=", "");

		if (StringUtils.isNotBlank(entidadEmisora))
			return entidadEmisora;

		return null;

	}

	public String getSerialNumber() {
		return cert.getSerialNumber().toString();
	}

	public String getDNI() {
		
		String dni = "";
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++) {
			if (as2[i].contains("SERIALNUMBER=")) {
				dni = as2[i].replaceAll("SERIALNUMBER=IDCES-", "");
			}
		}

		if (StringUtils.isNotBlank(dni)){
			return dni;
		}

		return null;
		
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

			if (StringUtils.isNotBlank(result) && result.contains("(R:")) {
				result = result.replaceAll(" ", "");
				int desde = result.indexOf("(R:");
				result = result.substring(desde);
				int hasta = result.indexOf(")"); 
				result = result.substring(0, hasta);
				result = result.replace("(R:", "");
				return result;
			}

			return null;
			
		} catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
		
	}

	public String getNombrePersonaJuridica() {
		String ret = "";
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++) {
			if (as2[i].contains("O=")) {
				ret = as2[i].replaceAll("O=", "");
			}
		}

		if (StringUtils.isNotBlank(ret)){
			return ret;
		}

		return null;
	}

	public String getEmail() {
		// A fecha del 01.03.2022 este dato no se encuentra el certificado.
		return null;
	}

	public String getNombre() {
		
		String ret = "";
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++) {
			if (as2[i].contains("GIVENNAME=")) {
				ret = as2[i].replaceAll("GIVENNAME=", "");
			}
		}

		if (StringUtils.isNotBlank(ret)){
			return ret;
		}

		return null;
		
	}

	public String getApellidos() {
		String ret = "";
		String s2 = cert.getSubjectDN().getName();
		s2 = s2.replaceAll(", ", ",");

		String[] as2 = s2.split(",");

		for (int i = 0; i < as2.length; i++) {
			if (as2[i].contains("SURNAME=")) {
				ret = as2[i].replaceAll("SURNAME=", "");
			}
		}

		if (StringUtils.isNotBlank(ret)){
			return ret;
		}

		return null;
	}

	public String getPrimerApellido() {
		// A fecha del 01.03.2022 este dato no se encuentra el certificado.
		return null;
	}

	public String getSegundoApellido() {
		// A fecha del 01.03.2022 este dato no se encuentra el certificado.
		return null;
	}

	private String getOID(String OID) {
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
	}
}
