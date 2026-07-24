package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoCAMERFIRMA2016 implements InfoCertificado{
	
	private Map<String, String> propOID;
	private X509Certificate cert;

	public InfoCertificadoCAMERFIRMA2016(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}
	
	public String getEntidadCertificadora() {
		String entidadEmisora = "";
		String s = cert.getIssuerDN().getName();
		String[] as = s.split(",");

		for (int i = 0; i < as.length; i++)
			if (as[i].contains("CN="))
				entidadEmisora = as[i].replaceAll("CN=", "");

		if (StringUtils.isNotBlank(entidadEmisora))
			return entidadEmisora;

		return null;
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
				break;
			}
		}

		if (StringUtils.isBlank(cif)) {
			for (int i = 0; i < as.length; i++) {
				if (as[i].contains("OID.1.3.6.1.4.1.17326.30.3=")) {
					cif = as[i].replaceFirst("OID.1.3.6.1.4.1.17326.30.3=", "");
					break;
				}
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
				break;
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
		String nombre = this.getOID("1.3.6.1.4.1.17326.30.7");

		if (nombre == null || nombre.length() == 0) {
			String s = cert.getSubjectDN().getName();
			s = s.replaceAll(", ", ",");
			s = s.replaceAll("\"", "");

			String[] as = s.split(",");

			for (int i = 0; i < as.length; i++) {
				if (as[i].contains("GIVENNAME=")) {
					nombre = as[i].replaceFirst("GIVENNAME=", "");
					break;
				}
			}
		}

		return nombre;
	}
	
	public String getApellidos() {
		String apellidos = this.getPrimerApellido() + " "
				+ this.getSegundoApellido();

		if (apellidos == null || apellidos.trim().length() == 0) {
			String s = cert.getSubjectDN().getName();
			s = s.replaceAll(", ", ",");
			s = s.replaceAll("\"", "");

			String[] as = s.split(",");

			for (int i = 0; i < as.length; i++) {
				if (as[i].contains("SURNAME=")) {
					apellidos = as[i].replaceFirst("SURNAME=", "");
					break;
				}
			}
		}

		return apellidos;
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
}
