package com.greenaall.certificado;

import java.security.cert.X509Certificate;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class InfoCertificadoTCat implements InfoCertificado {

	private X509Certificate cert;
	private Map<String, String> propOID;

	public InfoCertificadoTCat(X509Certificate cert, String proyecto) {
		this.cert = cert;
		CertificateUtil cu = new CertificateUtil();
		this.propOID = cu.readPropertiesOid(cert, proyecto);
	}

	public String getDNI() {
		return this.getOID("2.16.724.1.3.5.3.2.4");
	}

	/**
	 * Devuelve el nombre completo del ciudadano del certificado digital.
	 * Ejemplo: Lorena Soria Garc�a
	 * 
	 * @return
	 */
	public String getNombrePersonaFisica() {
		return getNombre() + " " + getApellidos();
	}

	/**
	 * Devuelve la entidad certificadora. Ejemplo: EC-IDcat
	 * 
	 * @return
	 */
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

	/**
	 * Devuelve el nombre del ciudadano del certificado digital. Ejemplo: Lorena
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.getOID("2.16.724.1.3.5.3.2.6");
	}

	/**
	 * Devuelve los apellidos del ciudadano del certificado digital. Ejemplo:
	 * Soria Garcia
	 * 
	 * @return
	 */
	public String getApellidos() {
		return getPrimerApellido() + " " + getSegundoApellido();
	}

	public String getEmail() {
		return this.getOID("2.5.29.17");
	}

	public String getPrimerApellido() {
		return this.getOID("2.16.724.1.3.5.3.2.7");
	}

	public String getSegundoApellido() {
		return this.getOID("2.16.724.1.3.5.3.2.8");
	}

	public String getCIF() {
		return this.getOID("2.16.724.1.3.5.3.2.3");
	}

	public String getNombrePersonaJuridica() {
		return this.getOID("2.16.724.1.3.5.3.2.2");
	}

	private String getOID(String OID) {
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
	}
}
