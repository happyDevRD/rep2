package com.greenaall.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.greenaall.exception.CtrError;

public abstract class ProcesoFicheroXML {
	
	private FicheroXML oFicXML;
	private Fichero oFichero;

	public FicheroXML getFicheroXML() {
	    return this.oFicXML;
	}
	
	private void setFicheroXML(FicheroXML poFicXML) {
	    this.oFicXML = poFicXML;
	}
	
	@SuppressWarnings("static-access")
	public String crearFichero() throws CtrError {
	    try {
	      String ruta = oFichero.dameFicheroTemporal(".xml").getAbsolutePath();
	      this.oFichero = new Fichero(ruta, true);
	     

	      FileOutputStream oFilOutStrea;

	      try {
	        oFilOutStrea = new FileOutputStream(this.oFichero.getFile());
	      } catch (FileNotFoundException oFilNotFouExcep) {
	        throw new CtrError("No se ha encontrado el Fichero: ");
	      }

	      this.setFicheroXML(new FicheroXML(oFilOutStrea, "UTF-8"));
	      return ruta;
	    } catch (Exception oException) {
	      new CtrError(oException);
	    }
		return null;
	  }
}
