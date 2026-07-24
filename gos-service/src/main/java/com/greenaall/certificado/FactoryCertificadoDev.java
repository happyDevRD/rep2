package com.greenaall.certificado;

import java.io.File;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class FactoryCertificadoDev {

	public static void main(String[] args) throws Exception {

		FactoryCertificadoDev fc = new FactoryCertificadoDev();
		List<String> ficheros = new ArrayList<String>();
		ficheros.add("/home/greenaall/Escritorio/CERTIFICADOS/bewor/REPnubeEIDAS.cer");
		ficheros.add("/home/greenaall/Escritorio/CERTIFICADOS/bewor/REPnubePJ.cer");
		ficheros.add("/home/greenaall/Escritorio/CERTIFICADOS/bewor/REPnubeESPJ.cer");
		ficheros.add("/home/greenaall/Escritorio/CERTIFICADOS/bewor/PFnubeBT.cer");

		for (String sFile : ficheros) {
			try {
				fc.printCertificado(sFile);	
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public void printCertificado(String sFile) throws Exception {
		File file = new File(sFile);
		
		X509Certificate cer = InfoCertificadoBewor.loadCertificate(file);
		InfoCertificado info = new FactoryCertificado().getInfoCertificado(cer, "NO_PRINT");
		
		System.out.println("FICHERO:               [" + file.getName() +"]");
		System.out.println("ENTIDAD CERTIFICADORA: [" + info.getEntidadCertificadora() + "]");
		System.out.println("DNI                  : [" + info.getDNI() + "]");
		System.out.println("NOMBRE PERSONA FISICA: [" + info.getNombrePersonaFisica() + "]");
		System.out.println("APELLIDOS PER FISICA : [" + info.getApellidos() + "]");
		System.out.println("NOMBRE               : [" + info.getNombre() + "]");
		System.out.println("CIF                  : [" + info.getCIF() + "]");
		System.out.println("RAZON SOCIAL         : [" + info.getNombrePersonaJuridica() + "]");
		System.out.println("EMAIL                : [" + info.getEmail() + "]");
	}
	
}
