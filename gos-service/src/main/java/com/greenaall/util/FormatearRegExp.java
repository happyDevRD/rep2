package com.greenaall.util;

import java.text.*;
import java.util.regex.*;
import javax.swing.text.*;

public class FormatearRegExp extends DefaultFormatter {

	private static final long serialVersionUID = 6858874030922556549L;
	/** Objeto Patrón utilizado para Formatear */

	  private Pattern oPatron;

	  /**
	   * Constructor por Defecto
	   */

	  public FormatearRegExp() {
	    super();
	  }

	  /**
	   * Constructor la cual se le indica el Patrón a utilizar para Formatear.
	   * @param psPatron Especifica la Expresión Regular que se usará para
	   * determinar si el Valor es Válido.
	   * @throws PatternSyntaxException Excepción que se lanza cuando el Patrón
	   * indicado es incorrecto
	   */

	  public FormatearRegExp(String psPatron) throws PatternSyntaxException {
	    this();
	    this.setPatron(psPatron);
	  }

	  /**
	   * Método que crea una Expresión Regular Basada en AbstractFormatter.
	   * @param poPatron Especifica la Expresión Regular que se usará para
	   * determinar si el Valor es Válido.
	   */

	  public FormatearRegExp(Pattern poPatron) {
	    this();
	    this.setPatron(poPatron);
	  }

	  /**
	   * Método que asigna el Patrón que se usará para determinar si el Valor es
	   * Válido.
	   * @param poPatron Especifica la Expresión Regular que se usará para determinar
	   * si el Valor es Válido.
	   */

	  public void setPatron(Pattern poPatron) {
	    this.oPatron = poPatron;
	  }

	  /**
	   * Método que devuelve el Patrón utilizado para Formatear.
	   * @return Objeto Padrón utilizado para Formatear.
	   */

	  public Pattern getPatron() {
	    return this.oPatron;
	  }

	  /**
	   * Método que asigna el Patrón que se utilizará para Formatear.
	   * @param psPatron Patrón a utilizar para Formatear.
	   * @throws PatternSyntaxException Excepción que se lanza cuando el Patrón
	   * indicado es incorrecto
	   */

	  public void setPatron(String psPatron) throws PatternSyntaxException {
	    if (!Utiles.ifNull(psPatron).equals("")) {
	      this.setPatron(Pattern.compile(psPatron));
	    }
	  }

	  /**
	   * Método que devuelve la Cadena que se pasa por Parámetros Formateada en un
	   * Objeto. Algunos Formateadores pueden devolver null.
	   * @param psTexto Texto a Convertir.
	   * @return Object Objeto en Representación del Texto.
	   * @throws ParseException Excepción devuelta si existe algún Error en la
	   * Conversión.
	   */

	  public Object stringToValue(String psTexto) throws ParseException {
	    if (this.oPatron != null) {
	      Matcher oMatcher = this.oPatron.matcher(psTexto);

	      if (oMatcher.matches()) {
	        return super.stringToValue(psTexto);
	      }

	      throw new ParseException("Error en stringToValue", 0);
	    }

	    return psTexto;
	  }
}
