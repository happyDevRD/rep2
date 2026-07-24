package com.greenaall.certificado;

import java.security.cert.X509Certificate;

import com.greenaall.exception.FlowException;

/**
 * 
 * @author dgarcia
 * 
 */

public class FactoryCertificado {

	/**
	 * Devuelve la informaci�n del certificado digital.
	 * 
	 * @param cert
	 *            Certificado digital del cual se desea obtener la informaci�n
	 * 
	 * @return {@link InfoCertificado}
	 * 
	 * @throws Exception
	 */
	public InfoCertificado getInfoCertificado(X509Certificate cert,
			String proyecto) throws FlowException {

		InfoCertificadoFNMT fnmt = new InfoCertificadoFNMT(cert, proyecto);
		InfoCertificadoFNMT2 fnmt2 = new InfoCertificadoFNMT2(cert, proyecto);
		InfoCertificadoIdCat idCat = new InfoCertificadoIdCat(cert);
		InfoCertificadoDNIe dnie = new InfoCertificadoDNIe(cert);
		InfoCertificadoTCat tCat = new InfoCertificadoTCat(cert, proyecto);
		InfoCertificadoECCiutadania ecCiutadania = new InfoCertificadoECCiutadania(cert, proyecto);
		InfoCertificadoFNMTFuncionario fnmtFun = new InfoCertificadoFNMTFuncionario(cert, proyecto);
		InfoCertificadoCAMERFIRMA camerfirma = new InfoCertificadoCAMERFIRMA(cert, proyecto);
		InfoCertificadoCAMERFIRMA2003 camerfirma2003 = new InfoCertificadoCAMERFIRMA2003(cert, proyecto);
		InfoCertificadoCAMERFIRMA2016 camerfirma2016 = new InfoCertificadoCAMERFIRMA2016(cert, proyecto);
		InfoCertificadoCamerfirmaCiudadano camerfirmaCiu = new InfoCertificadoCamerfirmaCiudadano(cert, proyecto);
		InfoCertificadoCamerfirmaPerFisRepre camerfirmaPFRepre = new InfoCertificadoCamerfirmaPerFisRepre(cert, proyecto);
		InfoCertificadoVinCAsignFisicaRepresentante vinCaSignPFRepre = new InfoCertificadoVinCAsignFisicaRepresentante(cert, proyecto);
		//InfoCertificadoVinCAsignEmpleadoAlto vinCaSignEmpAlt = new InfoCertificadoVinCAsignEmpleadoAlto(cert, proyecto);
		//InfoCertificadoVinCAsignEmpleadoMedio vinCaSignEmpMed = new InfoCertificadoVinCAsignEmpleadoMedio(cert, proyecto);
		InfoCertificadoUANATACA uanataca = new InfoCertificadoUANATACA(cert, proyecto);
		InfoCertificadoFIRMAPROFESIONAL firmaProfesional = new InfoCertificadoFIRMAPROFESIONAL(cert, proyecto);
		InfoCertificadoACA aca = new InfoCertificadoACA(cert, proyecto);
		InfoCertificadoBewor bewor = new InfoCertificadoBewor(cert, proyecto);
		
		if ("FNMT".equalsIgnoreCase(fnmt.getEntidadCertificadora())) {
			return fnmt;

		} else if ("AC FNMT Usuarios".equalsIgnoreCase(fnmt2.getEntidadCertificadora())) {
			return fnmt2;

		} else if ("AC Administraci�n P�blica".equalsIgnoreCase(fnmtFun.getEntidadCertificadora())) {
			return fnmtFun;

		} else if ("EC-IDCat".equalsIgnoreCase(idCat.getEntidadCertificadora())) {
			return idCat;
			
		} else if (InfoCertificadoCamerfirmaCiudadano.CA_CAMERFIRMA_CIUDADANO.equalsIgnoreCase(camerfirmaCiu.getEntidadCertificadora())) {
			return camerfirmaCiu;
			
		} else if (InfoCertificadoCamerfirmaPerFisRepre.CA_CAMERFIRMA_PRESONA_FISICA_CON_REPRESENTANTE.equalsIgnoreCase(camerfirmaPFRepre.getEntidadCertificadora())) {
			return camerfirmaPFRepre;
			
		} else if (InfoCertificadoVinCAsignFisicaRepresentante.CA_VINCASIGN_PERSONA_FISICA_CON_REPRESENTANTE.equalsIgnoreCase(vinCaSignPFRepre.getEntidadCertificadora())) {
			return vinCaSignPFRepre;		

		} else if ("EC-Ciutadania".equalsIgnoreCase(ecCiutadania.getEntidadCertificadora())) {
			return ecCiutadania;

		} else if ("DNIE".equalsIgnoreCase(dnie.getEntidadCertificadora())) {
			return dnie;

		} else if ("PREPRODUCCIO EC-AL".equalsIgnoreCase(tCat.getEntidadCertificadora())
				|| "EC-AL".equalsIgnoreCase(tCat.getEntidadCertificadora())
				|| "EC-SectorPublic".equalsIgnoreCase(tCat.getEntidadCertificadora())) {
			return tCat;

		} else if ("AC CAMERFIRMA S.A.".equalsIgnoreCase(camerfirma.getEntidadCertificadora())) {
			return camerfirma;
			
		} else if ("AC Camerfirma Certificados Camerales".equalsIgnoreCase(camerfirma2003.getEntidadCertificadora()) 
				|| "RACER".equalsIgnoreCase(camerfirma2003.getEntidadCertificadora()) 
				|| "AC Representaci�n".equalsIgnoreCase(camerfirma2003.getEntidadCertificadora())) {
			
			return camerfirma2003;

		} else if("AC CAMERFIRMA FOR LEGAL PERSONS - 2016".equalsIgnoreCase(camerfirma2016.getEntidadCertificadora())
				|| "AC CAMERFIRMA FOR NATURAL PERSONS - 2016".equalsIgnoreCase(camerfirma2016.getEntidadCertificadora())) {
			return camerfirma2016;
			
		} else if (InfoCertificadoUANATACA.AC_UANATACA.equalsIgnoreCase(uanataca.getEntidadCertificadora())) {
			return uanataca;
			
		} else if ("AC Firmaprofesional - CUALIFICADOS".equalsIgnoreCase(firmaProfesional.getEntidadCertificadora())) {
			return firmaProfesional;
			
		} else if (InfoCertificadoACA.AUTORIDAD_CERTIFICADORA.equalsIgnoreCase(aca.getEntidadCertificadora())) {
			return aca;
			
		} else if (InfoCertificadoBewor.AUTORIDAD_CERTIFICADORA.equalsIgnoreCase(bewor.getEntidadCertificadora())) {
			return bewor;

		}else{

			// TODO: Multi-idioma. Esta excepci�n se le va ha mostrar al
			// usuario.
			throw new FlowException(
					"No se ha podido recuperar la informaci�n del certificado digital "
							+ "debido a que este pertenece a una entidad certificadora no controlada "
							+ "por la aplicaci�n.");
		}

	}

}
