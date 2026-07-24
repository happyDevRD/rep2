package com.greenaall.util;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;
import java.util.Vector;
import org.xml.sax.Attributes;
import java.util.Stack;

public class FicheroParseXML extends DefaultHandler {
	protected Vector oResultado = null;
	  protected Stack oNodo = new Stack();

	  /**
	   * Método que trata el comienzo del documento XML.
	   *  (Este método el lanzado durante el parse del documento)
	   * @throws SAXException
	   */

	  public void startDocument() throws SAXException {
	  }

	  /**
	   * Método que trata el final del documento XML.
	   *  (Este método el lanzado durante el parse del documento)
	   * @throws SAXException
	   */

	  public void endDocument() throws SAXException {
	  }

	  /**
	   * Método que trata el comienzo de un elemento del documento XML.
	   *  (Este método el lanzado durante el parse del documento)
	   * @throws SAXException
	   */

	  public void startElement(String namespaceURI,
	      String lName, // local name
	      String qName, // qualified name
	      Attributes attrs) throws SAXException {
	    Vector oNodoObjeto = null;
	    String sNombre = lName.equals("") ? qName : lName; // nombre del elemento

	    if (this.oResultado == null) {
	      this.oNodo.push(this.oResultado = new Vector());
	    }

	    if (this.oNodo.empty()) {
	      this.oNodo.push(this.oResultado);

	      if (this.oResultado.size() > 0) {
	        for (int i = oResultado.size() - 1; i >= 0; i--) {
	          if (this.oResultado.elementAt(i)instanceof Vector) {
	            this.oNodo.push((Vector)this.oResultado.elementAt(i));
	            for (int j = oResultado.size() - 1; j >= 0; j--) {
	              if (((Vector)this.oResultado.elementAt(i)).elementAt(j)instanceof
	                  Vector) {
	                this.oNodo.push((Vector) ((Vector)this.oResultado.elementAt(
	                    i)).
	                    elementAt(j));
	                break;
	              }
	              break;
	            }
	          }
	        }
	      }
	    }

	    if ("OBJETO".equals(sNombre)) {
	      this.oResultado.add(oNodoObjeto = new Vector());

	      for (int i = 0; i < attrs.getLength(); i++) {
	        ((Vector) oResultado.elementAt(oResultado.size() - 1)).
	            add(attrs.getValue("atributo" + i));
	      }

	      // ( (Vector) oResultado.elementAt(oResultado.size() - 1)).add(
	      //    oNodoObjeto = new Vector());
	      this.oNodo.push(oNodoObjeto);
	    }

	    if ("VECTOR".equals(sNombre)) {
	      ((Vector)this.oNodo.peek()).add(oNodoObjeto = new Vector());
	      this.oNodo.push(oNodoObjeto);
	    }

	    if ("ELEMENTO".equals(sNombre) && attrs.getLength() >= 2) {
	      Object oObjeto = null;
	      String sTipo = attrs.getValue("tipo");
	      String sValor = attrs.getValue("valor");

	      if (!sTipo.equals("null")) {
	        if (sValor.equals("null")) {
	          sValor = "";
	        }

	        try {
	          oObjeto = Class.forName(attrs.getValue("tipo")).
	              getConstructor(new Class[] {
	              (new java.lang.String()).
	              getClass()}).newInstance(
	              new Object[] {
	              sValor});

	        } catch (Exception e) {
	          System.out.println("Excepcion en startElement:");
	          System.out.println(e);
	        }
	      }
	      ((Vector)this.oNodo.peek()).add(oObjeto);
	    }
	  }

	  /**
	   * Método que trata el final de un elemento del documento XML.
	   *  (Este método el lanzado durante el parse del documento)
	   * @throws SAXException
	   */

	  public void endElement(String namespaceURI,
	      String sName, // simple name
	      String qName // qualified name
	      ) throws SAXException {
	    String sNombre = sName.equals("") ? qName : sName; // nombre del elemento

	    if ("VECTOR".equals(sNombre) || "OBJETO".equals(sNombre)) {
	      this.oNodo.pop();
	    }
	  }

	  /**
	   * Método que trata el contenido de un elemento del documento XML.
	   *  (Este método el lanzado durante el parse del documento)
	   * @throws SAXException
	   */

	  public void characters(char buf[], int offset, int len) throws
	      SAXException {
	    String sCadena = new String(buf, offset, len);
	    try {
	    	System.out.println(sCadena);
	    } catch (Exception e) {
	    	System.out.println("Excepcion en characters:");
	    	System.out.println(e);
	    }
	  }
}
