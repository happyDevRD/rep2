package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoCAMERFIRMA implements InfoCertificado {

	private Map<String, String> propOID;
	private X509Certificate cert;

	public InfoCertificadoCAMERFIRMA(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}

	public String getEntidadCertificadora() {
		return this.getOID("2.5.4.10");
	}

	public String getDNI() {
		// Sacamos el DNI.
		String s = cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");

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
			return dni;
		} else {
			return null;
		}
	}

	public String getNombrePersonaFisica() {
		return this.getApellidos() + " " + this.getNombre();
	}

	public String getCIF() {
		// Sacamos el CIF
		String s = cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");

		String[] as = s.split(",");

		String cif = "";

		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("2.5.4.97=")) {
				cif = as[i].replaceFirst("2.5.4.97=", "");
			}
		}

		if (StringUtils.isNotBlank(cif)) {
			if (cif.indexOf("-") > 0) {
				cif = cif.substring(cif.indexOf("-") + 1);
			}
			return cif;
		} else {
			return null;
		}
	}

	public String getNombrePersonaJuridica() {
		// Sacamos la persona jur�dica
		String s = cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");

		String[] as = s.split(",");

		String des = "";

		for (int i = 0; i < as.length; i++) {
			if (as[i].startsWith("O=")) {
				des = as[i].replaceFirst("O=", "");
			}
		}

		if (StringUtils.isNotBlank(des)) {
			return des;
		} else {
			return null;
		}
	}

	public String getEmail() {
		return this.getOID("2.5.29.17");
	}

	public String getNombre() {
		return this.getOID("1.3.6.1.4.1.17326.30.7");
	}

	public String getApellidos() {
		return this.getPrimerApellido() + " " + this.getSegundoApellido();
	}

	public String getPrimerApellido() {
		return this.getOID("1.3.6.1.4.1.17326.30.8");
	}

	public String getSegundoApellido() {
		return this.getOID("1.3.6.1.4.1.17326.30.9");
	}

	private String getOID(String OID) {
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
	}
}
