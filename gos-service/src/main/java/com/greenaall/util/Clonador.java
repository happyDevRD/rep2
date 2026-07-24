package com.greenaall.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clona un Objeto Serializable. Internamente el objeto es transformado
 * en bytes y se crea un Objeto nuevo a partir del resultado de dicha
 * transformación, de esta forma se pueden clonar objetos complejos compuestos
 * por otros objetos.
 *
 * Esta clase no debe usarse para clonar listas o arrays de objetos, ya que el
 * proceso de transformación de los Objetos en bytes agotaría la memoria y
 * provocaría una exepción del tipo OutOfMemoryError.
 *
 * <p>Título: Clonador </p>
 * <p>Descripción: </p>
 * <p>Copyright: 2004 © Greenaall S.L.  </p>
 * <p>Company: </p>
 * @author 17
 * @version 1.0
 */

public abstract class Clonador {

  /**
   * Efectua una "copia profunda" del Objeto, es decir se pueden clonar objetos
   * complejos compuestos por otros objetos.
   *
   * @param oldObj Objeto a clonar
   * @return Clon del Objeto
   */
  public static Object deepCopy(Object oldObj) {
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;

    try {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      oos = new ObjectOutputStream(bos);

      // Se serializa y pasa el objeto
      oos.writeObject(oldObj);
      oos.flush();
      ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bin);

      // se retorna el nuevo objeto
      return ois.readObject();
    }
    catch(Exception e) {
      throw new UnsupportedOperationException(e.getMessage());
    }
    finally {
      try {
        oos.close();
        ois.close();
      } catch (IOException ex) {
        throw new UnsupportedOperationException(ex.getMessage());
      }
    }
  }
}