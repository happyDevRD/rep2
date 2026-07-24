package com.greenaall.util;

import java.io.File;
import org.jodconverter.core.office.OfficeException;
import org.jodconverter.core.office.OfficeUtils;
import org.jodconverter.local.JodConverter;
import org.jodconverter.local.office.LocalOfficeManager;

public abstract class ConvertirPDF  {
	
	public static String convertirPDF(String ruta, String extension) {		

			File initialFile = new File(ruta);
			String sFileName = Utiles.getNombreFicheroSinExtension(ruta);
			String rutaArchvio = initialFile.getParent() + File.separator + sFileName + ".pdf" ;
			File output = new File(rutaArchvio);

			final LocalOfficeManager officeManager = LocalOfficeManager.install();
			try {		    
			    try {
			    	officeManager.start();
					JodConverter.convert(initialFile).to(output).execute();
				} catch (OfficeException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
			} finally {
			    OfficeUtils.stopQuietly(officeManager);
			}
				
			return rutaArchvio;	
	}
}
