package com.greenaall.util;

import java.io.File;
import java.io.IOException;

public class Fichero {
	
	private File oFichero = null;

	public static String dameExtension(String psNomFic) {
	    String ext = null;
	    int i = psNomFic.lastIndexOf('.');

	    if (i > 0 && i < psNomFic.length() - 1) {
	      ext = psNomFic.substring(i + 1).toLowerCase();
	    }
	    return ext;
	}
	
	public static File dameFicheroTemporal(String psSufijo) throws IOException {
	    return dameFicheroTemporal(psSufijo, true);
	}
	
	public static File dameFicheroTemporal(String psSufijo,  boolean pbBorrado) throws IOException {
	    File oDirectorio = dameDirectorioTemporal();
	    File oFichero;

	    oFichero = File.createTempFile("tp0", psSufijo, oDirectorio);

	    if (pbBorrado) {
	      oFichero.deleteOnExit();
	    }

	    return oFichero;
	 }
	 
	 public static File dameDirectorioTemporal() {
		    return new File(GestionPropiedades.getTemp());
	 }
	 
	 
	 public Fichero(String psNomFic, boolean pbCrear) throws IOException {
	    this.oFichero = crearFichero(psNomFic);

	    // Si existe se borra

	    if (this.existe() == true) {
	      this.borrar();
	    }

	    // Se crea el fichero vacio

	    this.nuevoFichero();
	}
	 
	private static File crearFichero(String psNomFic) {
		 return new File(psNomFic);
	}
	
	public boolean existe() {
	    return this.oFichero.exists();
	}
	
	public void borrar() {
	    this.oFichero.delete();
	}
	
	public File getFile() {
	    return this.oFichero;
	}
	
	public void nuevoFichero() throws IOException {
	    if (this.existe() == true) {
	      return;
	    }
	
	    if (!this.oFichero.getParentFile().exists()) {
	      this.oFichero.getParentFile().mkdirs();
	    }
	
	    this.oFichero.createNewFile();
   }
}
