package com.greenaall.util;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.Vector;

import javax.xml.parsers.SAXParserFactory;

import com.greenaall.exception.CtrError;

public class FicheroXML {

	  protected FileOutputStream oFile = null;
	  protected BufferedOutputStream bufferStream = null;
	  public ByteArrayOutputStream stream = null;
	  protected Stack etiquetas = new Stack();
	  protected String LINE_SEPARATOR = "\n";
	  protected String tabuladores = "";
	  
	  // Codificación
	  private String encoding;

//	      System.getProperties().getProperty("line.separator");
	  protected String TAB = "\t";

	  /**
	   * Método que crea el bufferedstream.
	   * @param stream Stream de byte sobre el que se escribe el fichero
	   */

	  protected void asignaStream(ByteArrayOutputStream stream) {
	    this.stream = stream;
	    bufferStream = new BufferedOutputStream(stream, 2048);
	  }

	  /**
	   * Constructor de clase.
	   * Crea un objeto inicializado con una cabecera standar
	   * Por defecto el character set es iso88591
	   * @param poFile Fichero sobre el que se genera la estructura XML
	   * @throws CtrError
	   */

	  public FicheroXML(FileOutputStream poFile) throws CtrError {
	    oFile = poFile;
	    this.asignaStream(new ByteArrayOutputStream());
	    this.insertaCabecera();
	  }
	  
	  /**
	   * Constructor de clase.
	   * Crea un objeto inicializado con una cabecera standar
	   * Por defecto el character set es iso88591
	   * @param poFile Fichero sobre el que se genera la estructura XML
	   * @throws CtrError
	   */

	  public FicheroXML(FileOutputStream poFile, String pEncoding) throws CtrError {
	    oFile = poFile;
	    this.asignaStream(new ByteArrayOutputStream());
	    this.setEncoding(pEncoding);
	    this.insertaCabecera();
	  }

	  /**
	   * Método que vuelca al Fichero lo que se lleva del Fichero XML.
	   * @throws CtrError Se ha producido un Error.
	   */

	  public void flush() throws CtrError {
	    try {
	      bufferStream.flush();
	      oFile.write(stream.toByteArray());
	      asignaStream(new ByteArrayOutputStream());
	    } catch (IOException oIOExcep) {
	      throw new CtrError("Error de Entrada / Salida al volcar al Fichero XML lo que se lleva procesado.");
	    }
	  }

	  /**
	   * Método que inserta la cabecera inicial del fichero.
	   * @throws CtrError
	   */

	  private void insertaCabecera() throws CtrError {
	    try {
	    	
	    	String sEncoding = this.getEncoding();
	    	if(sEncoding == null || sEncoding.equals("")){
	    		sEncoding = "ISO-8859-1";
	    	}
	    	if(sEncoding.equals("Cp1252")) {
	    		sEncoding = "ISO-8859-1";
	    	}
	    	
	    	/*if (System.getProperty("os.name").equalsIgnoreCase("linux")) {
	    		sEncoding = "UTF-8";
	    	}*/
	    	
	      bufferStream.write(("<?xml version=\"1.0\" encoding=\""
	          + sEncoding + "\" ?>"
	          + LINE_SEPARATOR).getBytes());
	      
	    } catch (IOException ex) {
	      throw new CtrError(ex);
	    }
	  }

	  /**
	   * Método que inserta un ElementoXML en la estructura del fichero.
	   * @param elementoXML Objeto ElementoXML que representa un elemento del
	   * fichero
	   * @throws CtrError Se ha producido un Error.
	   */

	  public void insertarElemento(ElementoXML elementoXML) throws CtrError {
	    try {
	      this.etiquetas.push(elementoXML.etiqueta());

	      bufferStream.write((tabuladores + "<" + elementoXML.etiqueta()).getBytes());

	      AtributoXML[] att = elementoXML.atributos();

	      if (att != null) {
	        for (int i = 0; i < att.length; i++) {
	          bufferStream.write((" " + att[i].nombreAtr() + "=\""
	              + att[i].valorAtr() + "\"").getBytes());
	        }
	      }

	      // Se cierra la llave del nombre del campo

	      bufferStream.write(">".getBytes());

	      if (elementoXML.texto() != null && !"".equals(elementoXML.texto())) {
	        bufferStream.write(elementoXML.texto().getBytes());
	      } else {
	        bufferStream.write(this.LINE_SEPARATOR.getBytes());
	        tabuladores = tabuladores + this.TAB;
	      }
	    } catch (IOException oIOExcep) {
	      throw new CtrError("Se ha producido un Error al Insertar un Elemento en el Fichero XML.");
	    }
	  }
	  
	  public void insertarElemento2(ElementoXML elementoXML) throws CtrError {
		    try {
		      this.etiquetas.push(elementoXML.etiqueta());

		      bufferStream.write((tabuladores + "<" + elementoXML.etiqueta()).getBytes());

		      AtributoXML[] att = elementoXML.atributos();

		      if (att != null) {
		        for (int i = 0; i < att.length; i++) {
		          bufferStream.write((" " + att[i].nombreAtr() + "=\""
		              + att[i].valorAtr() + "\"").getBytes());
		        }
		      }

		      // Se cierra la llave del nombre del campo
		      bufferStream.write("/>".getBytes());
		      bufferStream.write(this.LINE_SEPARATOR.getBytes());
		    
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al Insertar un Elemento en el Fichero XML.");
		    }
		  }
	  
	  public void insertarElemento3(ElementoXML elementoXML) throws CtrError {
		    try {
		      this.etiquetas.push(elementoXML.etiqueta());

		      bufferStream.write((tabuladores + "<" + elementoXML.etiqueta()).getBytes());

		      AtributoXML[] att = elementoXML.atributos();

		      if (att != null) {
		        for (int i = 0; i < att.length; i++) {
		          bufferStream.write((" " + att[i].nombreAtr() + "=\""
		              + att[i].valorAtr() + "\"").getBytes());
		          bufferStream.write((" " + att[i].nombreAtr2() + "=\""
			              + att[i].valorAtr2() + "\"").getBytes());
		        }
		      }

		      // Se cierra la llave del nombre del campo
		      bufferStream.write(">".getBytes());
		      bufferStream.write(this.LINE_SEPARATOR.getBytes());
		    
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al Insertar un Elemento en el Fichero XML.");
		    }
		  }

	  /**
	   * Método que realiza el cierre del actual elemento en la estructura XML.
	   * @throws CtrError Se ha producido un Error.
	   */

	  public void terminarElemento() throws CtrError {
	    this.terminarElemento(null);
	  }
	  
	  public void terminarElemento2() throws CtrError {
		    this.terminarElemento2(null);
	  }
	  
	  public void terminarElemento3() throws CtrError {
		    this.terminarElemento3(null);
	  }
	  
	  public void terminarElemento4() throws CtrError {
		    this.terminarElemento4(null);
	  }
	  
	  public void terminarElemento5() throws CtrError {
		    this.terminarElemento5(null);
	  }
	  
	  public void terminarElemento6() throws CtrError {
		    this.terminarElemento6(null);
	  }
	  
	  public void terminarElemento7() throws CtrError {
		    this.terminarElemento7(null);
	  }
	  
	  public void terminarElemento8() throws CtrError {
		    this.terminarElemento8(null);
	  }
	  
	  public void terminarElemento9() throws CtrError {
		    this.terminarElemento9(null);
	}

	  /**
	   * Método que realiza el cierre del actual Elemento en la Estructura XML.
	   * @param elementoXML Objeto ElementoXML que representa un Elemento del
	   * Fichero.
	   * @throws CtrError Se ha producido un Error.
	   */
	  private void terminarElemento(ElementoXML elementoXML) throws CtrError {
	    try {
	      if (elementoXML != null && elementoXML.texto() != null
	          && !"".equals(elementoXML.texto())) {
	        bufferStream.write(("</" + (String)this.etiquetas.pop() + ">"
	            + LINE_SEPARATOR).getBytes());
	      } else {
	        tabuladores = tabuladores.replaceFirst(this.TAB, "");
	        bufferStream.write((tabuladores + "</" + (String)this.etiquetas.pop()
	            + ">" + LINE_SEPARATOR).getBytes());
	      }
	    } catch (IOException oIOExcep) {
	      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
	    }
	  }
	  
	  private void terminarElemento2(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</colgroup>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento3(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</table>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento4(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</texto>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento5(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</contenido>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento6(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</anuncio>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento7(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</anuncios>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento8(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "</envio>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	  }
	  
	  private void terminarElemento9(ElementoXML elementoXML) throws CtrError { //solo para fichero TEU
		    try {
		    	//tabuladores = tabuladores.replaceFirst(this.TAB, "");
		        bufferStream.write((tabuladores + "<col/>" + LINE_SEPARATOR).getBytes());
		        if (!etiquetas.empty()) {
		        	this.etiquetas.pop();
		        }
		    } catch (IOException oIOExcep) {
		      throw new CtrError("Se ha producido un Error al terminar de insertar un Elemento en el Fichero XML.");
		    }
	 }

	  /**
	   * Método que inserta y termina un ElementoXML en la Estructura del Fichero.
	   * @param elementoXML Objeto ElementoXML que representa un Elemento del
	   * Fichero.
	   * @throws CtrError Se ha producido un Error.
	   */

	  public void insertarElementoHoja(ElementoXML elementoXML) throws CtrError {
	    this.insertarElemento(elementoXML);
	    this.terminarElemento(elementoXML);
	  }
	  
	  /**
	   * Método que inserta y termina un ElementoXML en la Estructura del Fichero.
	   * @param elementoXML Objeto ElementoXML que representa un Elemento del
	   * Fichero.
	   * @throws CtrError Se ha producido un Error.
	   */

	  public void insertarElementoHoja2(ElementoXML elementoXML) throws CtrError {
	    this.insertarElemento2(elementoXML);
	  }

	  /**
	   * Método que comprueba si la Estructura XML es correcta y que termina de
	   * Escribir la Estructura XML en el Fichero.
	   * @throws CtrError Devuelve una excepcion si la estructura XML no es
	   * correcta o si se produce un Error de Entrada / Salida
	   */

	  public void finFicheroXML() throws CtrError {
	    // Volcar al Fichero lo que se lleva del Fichero XML.

	    this.flush();

	    // Cerrar Fichero

	    try {
	      this.oFile.close();
	    } catch (IOException oIOExcep) {
	      throw new CtrError("Error de Entrada / Salida al intentar cerrar el Fichero XML.");
	    }

	    // Comprobar Estructura XML

	    if (!etiquetas.empty()) {
	      throw new CtrError("La Estructura del Fichero XML no es correcta.");
	    }
	  }

	  /**
	   * Método que realiza la lectura de un Fichero XML y rellena un Vector
	   * @param psPathFichero Path del Fichero a Leer
	   * @throws CtrError Devuelve una excepcion si la estructura XML no es
	   * correcta
	   * @return Vector con el Fichero
	   */

	  public static Vector leerFichero(String psPathFichero) throws CtrError {
	    FicheroParseXML oParse = new FicheroParseXML();

	    try {
	      SAXParserFactory.newInstance().newSAXParser().parse(new FileInputStream(new
	          File(psPathFichero)), oParse);
	    } catch (Exception ex) {
	      throw new CtrError("Error de Entrada Salida", ex);
	    }

	    return oParse.oResultado;
	  }

	  /**
	   * Método que realiza la escritura de un Fichero XML
	   * La estructura del Vector es un conjunto de Vectores donde cada Vector
	   * tiene unos elementos String de identificación y
	   * un Vector de datos simples si el parametro pbEsObjeto vale true
	   * @param psPathFichero Path del Fichero a Escribir
	   * @param poVector Vector de Elementos a Escribir
	   * @param pbEsObjeto Si se trata de un Vector de Objetos
	   * @throws CtrError Devuelve una excepcion si la estructura XML no es
	   * correcta
	   */

	  public static void escribirFichero(String psPathFichero, Vector poVector,
	      boolean pbEsObjeto) throws CtrError {
	    try {
	      FileOutputStream oFichero = new FileOutputStream(psPathFichero);
	      FicheroXML oParse = new FicheroXML(oFichero);

	      if (poVector != null && pbEsObjeto) {
	        oParse.insertarElemento(new ElementoXML("INICIO", new AtributoXML[] {},
	            ""));

	        for (int i = 0; i < poVector.size(); i++) {
	          if (poVector.elementAt(i) instanceof Vector) {
	            Vector oAtributos = new Vector();

	            for (int j = 0;
	                 ((Vector) poVector.elementAt(i)) != null
	                 && j < ((Vector) poVector.elementAt(i)).size(); j++) {
	              if (((Vector) poVector.elementAt(i)).elementAt(j) instanceof
	                  Vector) {
	                AtributoXML[] aoAtributo = new AtributoXML[oAtributos.size()];

	                for (int l = 0; l < oAtributos.size(); l++) {
	                  aoAtributo[l] = (AtributoXML) oAtributos.elementAt(l);
	                }

	                oParse.insertarElemento(new ElementoXML("OBJETO", aoAtributo,
	                    ""));
	                oAtributos.clear();

	                while (j < ((Vector) poVector.elementAt(i)).size()) {
	                  FicheroXML.insertarElemento(oParse,
	                      ((Vector) poVector.elementAt(i)).elementAt(j++));
	                }

	                oParse.terminarElemento();
	              } else {
	                oAtributos.add(new AtributoXML("atributo" + j,
	                    ((Vector) poVector.elementAt(i)).elementAt(j).toString()));
	              }
	            }
	          }
	        }
	        oParse.terminarElemento();
	      } else if (poVector != null && !pbEsObjeto) {
	        FicheroXML.insertarElemento(oParse, poVector);
	      }

	      oParse.finFicheroXML();
	    } catch (Exception ex) {
	      throw new CtrError("Error de Entrada / Salida", ex);
	    }
	  }

	  /**
	   * Método que realiza la escritura de un Elemento a un Fichero XML
	   * @param poParse Fichero XML
	   * @param poElemento Elemento a Escribir
	   * @throws Exception Devuelve una excepcion si la estructura XML no es
	   * correcta
	   */

	  private static void insertarElemento(FicheroXML poParse,
	      Object poElemento) throws CtrError {
	    if (poElemento == null) {
	      poParse.insertarElemento(new ElementoXML("ELEMENTO", new AtributoXML[] {
	          new AtributoXML("tipo", "null"), new AtributoXML("valor", "null")},
	          ""));

	      poParse.terminarElemento();
	    } else if (poElemento instanceof Vector) {
	      poParse.insertarElemento(new ElementoXML("VECTOR", new AtributoXML[] {
	          new AtributoXML("tipo", poElemento.getClass().getName()),
	          new AtributoXML("valor",
	          poElemento.toString() + " " + ((Vector) poElemento).size()
	          + " elementos")}, ""));

	      for (int i = 0; i < ((Vector) poElemento).size(); i++) {
	        FicheroXML.insertarElemento(poParse, ((Vector) poElemento).elementAt(i));
	      }

	      poParse.terminarElemento();
	    } else {
	      String sValor = poElemento.toString();
	      if (sValor.equals("")) {
	        sValor = "null";
	      }

	      poParse.insertarElemento(new ElementoXML("ELEMENTO", new AtributoXML[] {
	          new AtributoXML("tipo", poElemento.getClass().getName()),
	          new AtributoXML("valor", sValor)}, ""));

	      poParse.terminarElemento();
	    }
	  }

		/**
		 * Obtiene el valor indicado en la codificación
		 * 
		 * @return
		 */
		public String getEncoding() {
			return encoding;
		}

		/**
		 * Indica la codificación
		 * 
		 * @param encoding
		 */
		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}
		
		/**
		 * Método que realiza ls sustitucion de una cadena
		 * @param cadOrigen Cadena origen
		 * @param cadFinal Cadena final
		 * @throws Exception Devuelve una excepcion si no es posible el reemplazo
		 */
	  
		public void sustituir(String cadOrigen, String cadFinal) throws CtrError {
		    
		    try {
		    this.bufferStream.flush();
		    String contenido = this.stream.toString();
		    ByteArrayOutputStream out = new ByteArrayOutputStream();
		    out.write(contenido.replace(cadOrigen, cadFinal).getBytes());
		    out.flush();
		    
		    stream = out;
		    
		    this.bufferStream = new BufferedOutputStream(out);
		    this.bufferStream.flush();
		    } catch (Exception e) {
			throw new CtrError("Error al sustituir cadena", e);
		    }
		    
		}
}
