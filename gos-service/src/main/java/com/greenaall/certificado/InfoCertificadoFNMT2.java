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
public class InfoCertificadoFNMT2 implements InfoCertificado {

	private Map<String,String> propOID;
	private X509Certificate cert;

	public InfoCertificadoFNMT2(X509Certificate cert, String proyecto) {
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
		return this.getOID("1.3.6.1.4.1.5734.1.4");
	}

	public String getNombrePersonaFisica() {
		return this.getApellidos() + " " + this.getNombre();
	}

	public String getCIF() {
		// A 01/03/2015 seg�n la FNMT no emiten certificados de este tipo para
		// personas juridicas.
		return null;
	}

	public String getNombrePersonaJuridica() {
		// A 01/03/2015 seg�n la FNMT no emiten certificados de este tipo para
		// personas juridicas.
		return null;
	}

	public String getEmail() {
		// TODO: Revisar rescate de email cuando se pruebe con un certificado
		// con email registrado.
		return this.getOID("1.3.6.1.5.5.7.3.4");
	}

	public String getNombre() {
		return this.getOID("1.3.6.1.4.1.5734.1.1");
	}

	public String getApellidos() {
		return this.getPrimerApellido() + " " + this.getSegundoApellido();
	}

	public String getPrimerApellido() {
		return this.getOID("1.3.6.1.4.1.5734.1.2");
	}

	public String getSegundoApellido() {
		return this.getOID("1.3.6.1.4.1.5734.1.3");
	}

	private String getOID(String OID) {
		String res = propOID.get(OID);
		return StringUtils.isNotBlank(res) ? res : "";
	}
}
