package com.greenaall.certificado;

import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;

import jakarta.servlet.http.HttpServletRequest;
import com.greenaall.exception.FlowException;

public class CertificateValidation {
	
	private String error;
	private X509Certificate[] cert;
	private boolean appModeP;
	private String pfv;
	
	/**
	 * Constructor encargado de inicializar la clase {@link CertificateValidation}.
	 * @param request {@link HttpServletRequest}
	 * @throws SedeCmsException 
	 */
	public CertificateValidation(HttpServletRequest request, String proyecto) throws FlowException {

		
		//this.appModeP = Global.APP_MODO_PRODUCCION.equals(conf.getAppMode());
		
		if(!(request.getAttribute("javax.servlet.request.X509Certificate") instanceof X509Certificate[]))
			throw new FlowException("Tipo de certificado incorrecto. No es javax.servlet.request.X509Certificate");
		
		this.cert = (X509Certificate[]) request.getAttribute("javax.servlet.request.X509Certificate");
		
		if(this.cert == null)
			throw new FlowException("El certificado a validar es nulo.");	
		
	}
	
	/**
	 * M�todo encargado de devolver el error controlado (en el caso de que lo
	 * haya) producido durante la validaci�n.
	 * 
	 * Este m�todo solo podr� devolver un valor no nulo, si se invoca despu�s de
	 * realizar la verificaci�n de certificado (isCertificateValid).
	 * 
	 * @return Devuelve la cadena con el error.
	 */
	public String getError(){
		return error;
	}
	
	/**
	 * 
	 * @return
	 * @throws SedeCmsException 
	 */
	public boolean isCertificateValid(String proyecto) throws FlowException {
		
		try {
			
			// Comprobamos la validez del certificado del usuario.
			cert[0].checkValidity();
			
			// Cuando nos encontremos en modo desarrollo o muestra (demo)
			// permitiremos el paso en el siguiete bloque if para que
			// rescate los datos necesarios del certificado.
			if (appModeP || !appModeP) {
				
				// Establecemos los datos necesarios para el login en e-firma.
				// TODO: this.setDatos(cert[0]);
				
				// Comprobamos la existencia de los datos necesarios.
				// Solo podr�n acceder a la aplicaci�n aquellos usuarios juridicos que tengan representante.
				/*
				if (StringUtils.isNotBlank(this.numDocum)
						&& StringUtils.isNotBlank(this.nombrePersonaFisica)) {
					request.getSession(false).setAttribute("USUARIO", this.nombrePersonaFisica);
					request.getSession(false).setAttribute("NUM_DOCUM", this.numDocum);
					request.getSession(false).setAttribute("CERT_SERIAL_NUMBER", cert[0].getSerialNumber());
					String usuContr = this.numDocum;
					
					// Si existen datos de persona jur�dica se almacenan en sesi�n.
					if(StringUtils.isNotBlank(this.cif) && StringUtils.isNotBlank(this.nombrePersonaJuridica)){
						request.getSession(false).setAttribute("CIF", this.cif); 
						request.getSession(false).setAttribute("DES_USUARIO_JURIDICO", this.nombrePersonaJuridica);
						usuContr += "-" + this.cif;
					}
					
					// Creamos una variable de sesi�n donde almacenamos el usuario de control de cambios en BBDD.
					request.getSession(false).setAttribute("USU_CONTR", usuContr);
					
					if(Global.PFV_ARROBAFIRMA_6.equals(pfv)){
						
						request.setAttribute("JVM_MINIMA", p.getProperty("afirma.version.minima.java"));
						
						String jvm_maxima = p.getProperty("afirma.version.maxima.java");
						if(StringUtils.isNotBlank(jvm_maxima))
							request.setAttribute("JVM_MAXIMA", jvm_maxima);
						
						// Parte p�blica del certificado del usuario codificado en base 64.
						// Necesario para detectar autom�ticamente el certificado con el que va a firmar.
						request.getSession(false).setAttribute("CERT_USU_KEY_PUBLIC_B64", Base64.encode(cert[0].getEncoded()));
						
					}else{
						request.setAttribute("JVM_MINIMA", p.getProperty("firma-e.version.minima.java"));
					}
					
					// Se comprueba si se est� accediendo con DNIe. Tanto para el cliente de firma 
					// de @firma 5 como el de firma-e estos tipos de certificados tienen un 
					// tratamiento distinto.
					if("DNIE".equalsIgnoreCase(this.entidadCertificadora)){
						request.getSession(false).setAttribute("DNIe", "true");
					}						
					
					// Si en configuraci�n se indica que debe aparecer el applet de chekeo de la
					// JVM del usuario, se carga la URL del mismo.
					if("1".equals(p.getProperty("efirma.incluir.applet.checkjvm"))){
						String efirmaURL = Util.getURLefirma(request);
						request.setAttribute("URL_APPLET_CHK_JVM", efirmaURL + "/cliente/checkJVM.jar");
						request.setAttribute("URL_APP", Util.getURLefirma(request));
					}
					
					// URL desde donde se podr� descargar la �ltima versi�n de Java
					request.setAttribute("URL_DOWNLOAD_JAVA", p.getProperty("efirma.url.download.java"));
					
				}else{
					// ERROR: Entidad certificadora no v�lida.
					request.setAttribute("ERR_NO_DATOS", "");
					errores.add("error.certificado.CA.no.valida", new ActionMessage("error.certificado.CA.no.valida"));
				}
				
				*/
				
			}else{
				// TODO: ERROR: Su certificado digital no ha superado el proceso de validaci�n.
				error = "Su certificado digital no ha superado el proceso de validaci&oacute;n";
			}
			
		} catch (CertificateExpiredException e) {
			// TODO: ERROR: Su certificado digital se encuentra caducado.
			error = "Su certificado digital se encuentra caducado.";
			
		} catch (CertificateNotYetValidException e) {
			// TODO: ERROR: Su certificado digital aun no es v�lido.
			error = "Su certificado digital aun no es v�lido.";
			
		} catch (Exception e) {
			// TODO: Exception? CA? Error al tratar de verificar la CA.
			error = "No me cuadra este mensaje";
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * M�todo encargado de validar un certificado digital mediante la Plataforma
	 * de Firma/Validaci�n configurada.
	 * 
	 * @param certificado
	 *            Certificado digital a validar
	 * 
	 * @return Devuelve verdadero si el certificado es v�lido o falso en el caso
	 *         contrario.
	 *         
	 * TODO: Este m�todo deber�a devolver el error que indica la PFV explicando el porque? no se ha podido validar el certificado.
	 */
/*	private boolean esValidoCertificado(X509Certificate[] certificados, String proyecto){
		if(Global.PFV_SIGNATURA_E.equals(pfv))
			return ValidarCertificadoByPSIS.isCertificateValid(certificados, proyecto);
		else
			return new ValidarCertificadoByAFirma().isCertificateValid(certificados, proyecto);
		
	}*/
	
	/**
	 * M�todo encargado de establecer los datos del usuario/ciudadano rescatados
	 * del certificado digital. 
	 * 
	 * Tambi�n se intenta normalizar los datos en la medida de lo posible.
	 * 
	 * @param cert Certificado Digital del usuario/ciudadano.
	 */
	/*
	private void setDatos(X509Certificate cert) throws Exception{
		
		InfoCertificado infoCert = new FactoryCertificado().getInfoCertificado(cert);
		
		this.numDocum = StringUtils.isNotBlank(infoCert.getDNI()) ? infoCert.getDNI().toUpperCase() : null;
		this.nombrePersonaFisica = WordUtils.capitalizeFully(infoCert.getNombrePersonaFisica());
		this.entidadCertificadora = infoCert.getEntidadCertificadora();
		this.nombrePersonaJuridica = WordUtils.capitalizeFully(infoCert.getNombrePersonaJuridica());
		this.cif = StringUtils.isNotBlank(infoCert.getCIF()) ? infoCert.getCIF().toUpperCase() : null;
		
	}	
	*/

}
