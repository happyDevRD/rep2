package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoECCiutadania implements InfoCertificado {

	private X509Certificate cert;
	private Map<String, String> propOID;

	public InfoCertificadoECCiutadania(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}

	public String getEntidadCertificadora() {
		String s = cert.getIssuerDN().getName();
		String[] as = s.split(",");
		String cadena = as[0].trim();

		int desde = cadena.indexOf("=") + 1;

		if (desde > -1) {
			return cadena.substring(desde);
		} else {
			return "";
		}
	}

	public String getDNI() {
		String s = cert.getSubjectDN().getName();
		String[] as = s.split(",");

		String dni = "";

		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("SERIALNUMBER=")) {
				dni = as[i].replaceFirst("SERIALNUMBER=", "");
			}
		}

		if (StringUtils.isNotBlank(dni)) {
			if (dni.indexOf("-") > 0) {
				dni = dni.substring(dni.indexOf("-") + 1);
			}
			return dni.trim();
		} else {
			return null;
		}
	}

	public String getNombrePersonaFisica() {
		String s = cert.getSubjectDN().getName();
		String[] as = s.split(",");

		String nombre = "";

		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("CN=")) {
				nombre = as[i].replaceFirst("CN=", "");
			}
		}

		if (StringUtils.isNotBlank(nombre)) {
			return nombre;
		} else {
			return null;
		}
	}

	public String getCIF() {
		// TODO Pendiente de desarrollar cuando se disponga de un certificado de
		// persona jur�dica de idCAT.
		return null;
	}

	public String getNombrePersonaJuridica() {
		// TODO Pendiente de desarrollar cuando se disponga de un certificado de
		// persona jur�dica de idCAT.
		return null;
	}

	public String getEmail() {
		return this.getOID("2.5.29.17");
	}

	public String getNombre() {
		String s = cert.getSubjectDN().getName();
		String[] as = s.split(",");

		String nombre = "";

		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("GIVENNAME=")) {
				nombre = as[i].replaceFirst("GIVENNAME=", "");
			}
		}

		if (StringUtils.isNotBlank(nombre)) {
			return nombre;
		} else {
			return null;
		}
	}

	public String getApellidos() {
		String s = cert.getSubjectDN().getName();
		String[] as = s.split(",");

		String apellidos = "";

		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("SURNAME=")) {
				apellidos = as[i].replaceFirst("SURNAME=", "");
			}
		}

		if (StringUtils.isNotBlank(apellidos)) {
			return apellidos;
		} else {
			return null;
		}
	}

	private String getOID(String OID) {
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
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
