package com.greenaall.util;

import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.cert.X509CertificateHolder;
import org.springframework.security.core.context.SecurityContextHolder;

import com.greenaall.certificado.FactoryCertificado;
import com.greenaall.certificado.InfoCertificado;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginCertificado {

	private static HttpServletRequest request;

	public synchronized static String ejecutar(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		// Inicializacion de los parametros necesarios.
		String proyecto = "autoliquidaciones";
		String apellido1 = null;
		String apellido2 = null;

		request = httpServletRequest;

		X509Certificate[] cert = (X509Certificate[]) request.getAttribute("jakarta.servlet.request.X509Certificate");
		X509Certificate[] cert2 = (X509Certificate[]) request.getAttribute("javax.servlet.request.X509Certificate");
		if (cert != null && cert[0] instanceof X509Certificate){
		    
			try {
			    
				cert[0].checkValidity();
				checkExpirationCertificated(request, cert[0]);

				InfoCertificado infoCert = new FactoryCertificado().getInfoCertificado(cert[0], proyecto);

				String numDocumPF = StringUtils.isNotBlank(infoCert.getDNI()) ? infoCert.getDNI().toUpperCase().trim()
						: null;
				String numDocumPJ = StringUtils.isNotBlank(infoCert.getCIF()) ? infoCert.getCIF().toUpperCase() : null;
				String nombre = WordUtils.capitalizeFully(infoCert.getNombre());
				String apellidos = WordUtils.capitalizeFully(infoCert.getApellidos());
				String nombreCompleto = WordUtils.capitalizeFully(infoCert.getNombrePersonaFisica());
				String desPerJur = WordUtils.capitalizeFully(infoCert.getNombrePersonaJuridica());
				String tipDocum = null;
				if (infoCert.getPrimerApellido() != null) {
					apellido1 = WordUtils.capitalizeFully(infoCert.getPrimerApellido());
				}
				if (infoCert.getSegundoApellido() != null) {
					apellido2 = WordUtils.capitalizeFully(infoCert.getSegundoApellido());
					;
				}

				if (numDocumPF != null && !numDocumPF.equals("")) {
					request.setAttribute("numDocumPF", numDocumPF);
					tipDocum = "DNI";
					request.setAttribute("tipDocumPF", tipDocum);
				}

				if (numDocumPJ != null && !numDocumPJ.equals("")) {
					request.setAttribute("numDocumPJ", numDocumPJ);
					tipDocum = "CIF";
					request.setAttribute("tipDocumPJ", tipDocum);
				}

				if (nombre != null) {
					request.setAttribute("nombre", nombre);
				}

				if (apellidos != null) {
					request.setAttribute("apellidos", apellidos);
				}

				if (apellido1 != null) {
					request.setAttribute("apellido1", apellido1);
				}

				if (apellido2 != null) {
					request.setAttribute("apellido2", apellido2);
				}

				if (nombreCompleto != null) {
					request.setAttribute("nombreCompleto", nombreCompleto);
				}

				if (desPerJur != null && !desPerJur.equals("")) {
					request.setAttribute("desPerJur", desPerJur);
				}

				if (nombreCompleto != null) {
					request.setAttribute("nombreCompleto", nombreCompleto);
				}
 
				if(numDocumPJ != null) {
					return numDocumPJ;
				}
				
				if (numDocumPF != null) {
					return numDocumPF;
				}
				return null;
			} catch (CertificateExpiredException e) {
				e.printStackTrace();
			} catch (CertificateNotYetValidException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return "ERROR";
		}
		return null;

	}

	private static void checkExpirationCertificated(HttpServletRequest request, X509Certificate cert) throws Exception {

		Integer iPlazoMsgCertificado = 30;

		try {

			if (iPlazoMsgCertificado != null) {

				// Se comprueba que en la fecha actual más el plazo de
				// visualización de aviso el certificado es
				// válido. En caso contrario,
				// saltará una excepción y se enviará a la página el
				// correspondiente mensaje.
				Calendar calControl = Calendar.getInstance();
				calControl.setTime(new java.util.Date());
				calControl.add(Calendar.DATE, iPlazoMsgCertificado);
				java.util.Date controlDate = new java.util.Date(calControl.getTimeInMillis());
				cert.checkValidity(controlDate);
			}

		} catch (CertificateExpiredException cee) {

			// Se ha detectado que la fecha de hoy se encuentra dentro del plazo
			// de control de expiración del certificado digital por lo que se
			// procederá a
			// indicarlo con el correspondiente mensaje.

			// Se rescata la fecha de expiración del certificado String
			String sExpirationDate = cee.getMessage().replace("NotAfter:", "").trim();
			sExpirationDate = sExpirationDate.replace("CEST", "");
			sExpirationDate = sExpirationDate.replace("CET", "");
			SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
			java.util.Date dExpirationDate = sdf.parse(sExpirationDate);

			// Se calcula la fecha a partir de la cual se mostrará el mensaje de
			// aviso
			Calendar cDateMsg = Calendar.getInstance();
			cDateMsg.setTime(dExpirationDate);
			cDateMsg.add(Calendar.DATE, -iPlazoMsgCertificado);
			java.util.Date dateMsg = new java.util.Date(cDateMsg.getTimeInMillis());

			java.util.Date today = new java.util.Date();

			if (today.after(dateMsg)) {
				request.getSession(false).setAttribute("EXPIRATION_DATE_CERTIFICATE",
						UtilDate.getFechaCorta(dExpirationDate));
			}
		}
	}
}
