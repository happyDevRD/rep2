package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

public class InfoCertificadoFIRMAPROFESIONAL implements InfoCertificado {
	private Map<String, String> propOID;

	private X509Certificate cert;

	public InfoCertificadoFIRMAPROFESIONAL(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}

	public String getEntidadCertificadora() {
		String entidadEmisora = "";
		String s = this.cert.getIssuerDN().getName();
		String[] as = s.split(",");
		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("CN="))
				entidadEmisora = as[i].replaceAll("CN=", "");
		}
		if (StringUtils.isNotBlank(entidadEmisora))
			return entidadEmisora;
		return null;
	}

	public String getNombrePersonaFisica() {
		return getApellidos() + " " + getNombre();
	}

	public String getCIF() {
		String s = this.cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");
		String[] as = s.split(",");
		String cif = "";
		int i;
		for (i = 0; i < as.length; i++) {
			if (as[i].contains("2.5.4.97=")) {
				cif = as[i].replaceFirst("2.5.4.97=", "");
				break;
			}
		}
		if (StringUtils.isBlank(cif))
			for (i = 0; i < as.length; i++) {
				if (as[i].contains("OID.1.3.6.1.4.1.17326.30.3=")) {
					cif = as[i].replaceFirst("OID.1.3.6.1.4.1.17326.30.3=", "");
					break;
				}
			}
		if (StringUtils.isNotBlank(cif)) {
			if (cif.indexOf("-") > 0)
				cif = cif.substring(cif.indexOf("-") + 1);
			return cif;
		}
		return null;
	}

	public String getNombrePersonaJuridica() {
		String s = this.cert.getSubjectDN().getName();
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
		if (StringUtils.isNotBlank(des))
			return des;
		return null;
	}

	public String getEmail() {
		return getOID("2.5.29.17");
	}

	public String getNombre() {
		String nombre = getOID("1.3.6.1.4.1.17326.30.7");
		if (nombre == null || nombre.length() == 0) {
			String s = this.cert.getSubjectDN().getName();
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
		String apellidos = getPrimerApellido() + " " + getSegundoApellido();
		if (apellidos == null || apellidos.trim().length() == 0) {
			String s = this.cert.getSubjectDN().getName();
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
		return getOID("1.3.6.1.4.1.17326.30.8");
	}

	public String getSegundoApellido() {
		return getOID("1.3.6.1.4.1.17326.30.9");
	}

	private String getOID(String OID) {
		String res = this.propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
	}

	public String getDNI() {
		String s = this.cert.getSubjectDN().getName();
		s = s.replaceAll(", ", ",");
		s = s.replaceAll("\"", "");
		String[] as = s.split(",");
		String dni = "";
		for (int i = 0; i < as.length; i++) {
			if (as[i].contains("SERIALNUMBER="))
				dni = as[i].replaceFirst("SERIALNUMBER=", "");
		}
		if (StringUtils.isNotBlank(dni)) {
			if (dni.indexOf("-") > 0)
				dni = dni.substring(dni.indexOf("-") + 1);
			return dni;
		}
		return null;
	}
}
