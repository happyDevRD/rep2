package com.greenaall.util;

import com.greenaall.exception.CtrError;

public class AtributoXML {
	private String nombreAtr = null;
	  private String valorAtr = null;
	  private String nombreAtr2 = null;
	  private String valorAtr2 = null;

	  /**
	   * Constructor de clase.
	   * Crea un objeto con la información de un elemento XML
	   * @param nombreAtr Nombre del atributo
	   * @param valorAtr Valor del atributo
	   * @throws CtrError En caso de que la etiqueta esté vacía
	   */

	  public AtributoXML(String nombreAtr, String valorAtr) throws CtrError {
	    if (nombreAtr != null && !nombreAtr.trim().equals("")
	        && valorAtr != null && !valorAtr.trim().equals("")) {

	      this.nombreAtr = nombreAtr.replaceAll("&", "&amp;")
	          .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
	          .replaceAll("'", "&apos;").replaceAll("\"", "&quot;");

	      this.valorAtr = valorAtr.replaceAll("&", "&amp;")
	          .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
	          .replaceAll("'", "&apos;").replaceAll("\"", "&quot;");
	    }
	    else {
	      throw new CtrError("Los campos del atributo XML no pueden ser vacíos");
	    }
	  }
	  
	  public AtributoXML(String nombreAtr, String valorAtr, String nombreAtr2, String valorAtr2) throws CtrError {
		    if (nombreAtr != null && !nombreAtr.trim().equals("")
		        && valorAtr != null && !valorAtr.trim().equals("")) {

		      this.nombreAtr = nombreAtr.replaceAll("&", "&amp;")
		          .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
		          .replaceAll("'", "&apos;").replaceAll("\"", "&quot;");

		      this.valorAtr = valorAtr.replaceAll("&", "&amp;")
		          .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
		          .replaceAll("'", "&apos;").replaceAll("\"", "&quot;");
		    }
		    else {
		      throw new CtrError("Los campos del atributo XML no pueden ser vacíos");
		    }
		    
		    if (nombreAtr2 != null && !nombreAtr2.trim().equals("")
			        && valorAtr2 != null && !valorAtr2.trim().equals("")) {

			      this.nombreAtr2 = nombreAtr2.replaceAll("&", "&amp;")
			          .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
			          .replaceAll("'", "&apos;").replaceAll("\"", "&quot;");

			      this.valorAtr2 = valorAtr2.replaceAll("&", "&amp;")
			          .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
			          .replaceAll("'", "&apos;").replaceAll("\"", "&quot;");
			    }
			    else {
			      throw new CtrError("Los campos del atributo XML no pueden ser vacíos");
		    }
		  }

	  /**
	   * Método que devuelve el atributo nombreAtr
	   * @return Atributo nombreAtr
	   */

	  public String nombreAtr() {
	    return nombreAtr;
	  }
	  
	  public String nombreAtr2() {
		    return nombreAtr2;
		  }

	  /**
	   * Método que devuelve el atributo valorAtr
	   * @return Atributo valorAtr
	   */

	  public String valorAtr() {
	    return valorAtr;
	  }
	  
	  public String valorAtr2() {
		    return valorAtr2;
	  }
}
