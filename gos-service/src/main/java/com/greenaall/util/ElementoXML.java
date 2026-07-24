package com.greenaall.util;

import java.text.ParseException;
import com.Ostermiller.util.Base64;
import com.greenaall.exception.CtrError;

public class ElementoXML {
	 private String etiqueta = null;
	  private AtributoXML[] atributos = null;
	  private String texto = null;
	  private static FormatearRegExp oValEtiqu = new FormatearRegExp("[\\p{Lower}|\\p{Upper}|:|_|[ñÑ]|[áéíóúü]|[ÁÉÍÓÚÜ]][\\p{Graph}|[nÑ]| |[áéíóúü]|[ÁÉÍÓÚÜ]]*");  
	  
	  /**
	   * Constructor de clase.
	   * Crea un objeto con la información de un elemento XML
	   * @param etiqueta Nombre de la etiqueta
	   * @param atributos Array de AtributoXML
	   * @param texto Texto de las etiquetas
	   * @throws CtrError "Exception" En caso de que la etiqueta esté vacía
	   */
	  public ElementoXML(String etiqueta, AtributoXML[] atributos,
	      Object valor) throws CtrError {
		  this(etiqueta, atributos, valor, true);
	  }

	  /**
	   * Constructor de clase.
	   * Crea un objeto con la información de un elemento XML
	   * @param etiqueta Nombre de la etiqueta
	   * @param atributos Array de AtributoXML
	   * @param texto Texto de las etiquetas
	   * @param pReemplazarTextoHtml Indica si el texto a troducir entre las etiquetas se reemplazar por el HTML
	   * @throws CtrError "Exception" En caso de que la etiqueta esté vacía
	   */
	  public ElementoXML(String etiqueta, AtributoXML[] atributos,
	      Object valor,  boolean pReemplazarTextoHtml) throws CtrError {
	    /**
	     * Comprobar que el Nombre de la Etiqueta se ajusta a la Especificación
	     * XML 1.0.
	     *
	     * Un nombre [empieza] con una letra, un subrayado o dos puntos,
	     * y [continúa] con letras, dígitos, guiones, rayas, dos puntos o puntos,
	     * denominados de forma global como caracteres de nombre. Los nombres que
	     * empiezan con la cadena "xml", se reservan para la estandarización de
	     * esta o de futuras versiones de esta especificación.
	     *
	     * Resumiendo, no se pueden crear nombres que empiecen con la cadena
	     * "xml", "xMl", "XML" o cualquier otra variante. Las letras, las rayas y
	     * los dos puntos se pueden usar en cualquier parte del nombre. También se
	     * pueden incluir dígitos, guiones y caracteres de punto, pero no se puede
	     * empezar por ninguno de ellos. El resto de caracteres, como algunos
	     * símbolos, y espacios en blanco, no se pueden usar.
	     */

	    if (Utiles.ifNull(etiqueta).trim().equals("")) {
	      throw new CtrError("El Nombre de una Etiqueta XML no puede estar Vacia.");
	    } else if ((etiqueta.length() > 3) ? etiqueta.substring(0,
	        3).toUpperCase().equals("XML") : false) {
	      throw new CtrError("EL Nombre de una Etiqueta XML no puede empezar por XML. \""
	          + etiqueta + "\"");
	    }

	    try {
	      ElementoXML.oValEtiqu.stringToValue(etiqueta);
	    } catch (ParseException pe) {
	      throw new CtrError("El Nombre de la Etiqueta XML \"" + etiqueta + "\" es incorrecta porque no se ajusta a la Especificación XML 1.0.");
	    }

	    this.etiqueta = etiqueta.replaceAll("&", "&amp;").replaceAll("<",
	        "&lt;").replaceAll(">", "&gt;").replaceAll("'",
	        "&apos;").replaceAll("\"", "&quot;");

	    this.atributos = atributos;

	    if (valor instanceof String){

	      String texto = (String) valor;

	      if (texto != null && !texto.trim().equals("")) {
	        
	    	this.texto = texto;        
	        if(pReemplazarTextoHtml){
	        	this.texto = this.texto.replaceAll("&", "&amp;").replaceAll("<",
	                    "&lt;").replaceAll(">", "&gt;").replaceAll("'", "&apos;"); 
	        	 //.replaceAll("\"", "&quot;");
	        }        
	       
	      } else {
	        this.texto = null;
	      }
	    } else if (valor instanceof byte[]){

	      String encoding = Base64.encodeToString((byte[])valor);

	      this.texto = encoding;
	    }
	  }

	  /**
	   * Método que devuelve el atributo etiqueta
	   * @return Valor etiqueta
	   */

	  public String etiqueta() {
	    return etiqueta;
	  }

	  /**
	   * Método que devuelve el atributo atributos
	   * @return atributos
	   */

	  public AtributoXML[] atributos() {
	    return atributos;
	  }

	  /**
	   * Método que devuelve el atributo texto
	   * @return Valor texto
	   */

	  public String texto() {
	    return texto;
	  }

	  // Borrar cuando no hagan falta más pruebas

	  public static void main(String args[]) {
	    String etiqueta = "Óla hóÁláü";

	    try {
	      //ElementoXML.oValEtiqu.stringToValue(etiqueta);
	      ElementoXML.oValEtiqu.stringToValue(etiqueta);
	    } catch (Exception pe) {
	      System.out.println("la Etiqueta '" + etiqueta
	          + "' no se ajusta a el Formato XML");
	      return;
	    }

	    System.out.println("La Etiqueta '" + etiqueta
	        + "' es buena");
	  }

}
