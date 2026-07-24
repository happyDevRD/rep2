package com.greenaall.util;

import java.text.*;
import java.util.*;

import com.greenaall.exception.CtrError;

/**
 * <code>DecimalFormatText</code> es una subclase de <code>DecimalFormat</code>
 * que habilita la expresión textual en múltiples idiomas de un número.
 * <p>
 * Es útil para indicar Importes, Fechas, etc. siempre que sea requerida
 * una expresión textual.
 * @author sin atribuir
 * @version 1.0
 */

public class DecimalFormatText extends DecimalFormat {

  private static final long serialVersionUID = -8958106419853977024L;
/* Atributos */
  private Locale oLocal;
  private static String[][] asTexto = new String[6][10];
  private int aiNumArray[] = new int[12];
  private String sTexto;
  private String sIdioma = "es";
  boolean aSignif[] = null;


  /**
   * Método que recupera el Texto del Número asociado.
   *
   * @param poNumero Número a convertir a letra
   * @param piGenero Indicador de Género (1 - Masculino Fin de Frase,
   * 2 - Masculino No Fin de Frase, 3 - Femenino)
   * @throws CtrError
   * @return Expresión textual asociada al Número
   */
  public String obtenerTexto(double poNumero, int piGenero) throws CtrError {
    /* Declaración de Variables Locales */
    long centimos = 0;
    long numero = 0;
    boolean bHayCentimos = false;
    int ILONG = 12;

    /* Inicialización de Variables Globles */
    sTexto = "";

    /* Control de Error en Argumentos */

    if (piGenero < 1 || piGenero > 3) {
      sTexto = sTexto.concat("ERROR GENERO");
      return sTexto;
    }
    
    /* Control Signo Negativo */
    
    if (poNumero < (double) 0.0){
	sTexto = sTexto.concat("- ");
	poNumero = poNumero * -1; 
    }

    /* Control existencia de Céntimos (EURO) */

    if ((poNumero - (long) poNumero) > (double) 0.0) {
      centimos = (long) ((double) 100.0 * (poNumero - (long) poNumero)
          + (double) 0.5);
    }
    numero = (long) poNumero;

    /* Bucle (opcional) caso existencia de Céntimos */

    do {
      /* Asignación Interruptor de Céntimos */
      if (centimos > 0) {
        bHayCentimos = true;
      } else {
        bHayCentimos = false;
      }

      /* Asignación del Número y Relleno con 0 por la Izquierda */
      /* Se elimina posible punto decimal al final de "digito"  */

      /* Asignación a Matriz Numérica y de Dígitos Significativos */

      aSignif = new boolean[ILONG];

      byte aByte[] = Long.toString(numero).getBytes();

      for (int i = 0; i < ILONG - aByte.length; i++) {
        aiNumArray[i] = 0;
        aSignif[i] = false;
      }

      for (int i = 0; i < aByte.length; i++) {
        aiNumArray[ILONG - aByte.length + i] = (int) (aByte[i] - "0".getBytes()[0]);
        if (aiNumArray[ILONG - aByte.length + i] != 0
            || (i > 0 && aSignif[ILONG - aByte.length + i - 1])) {
          aSignif[ILONG - aByte.length + i] = true;
        }
      }

      /* Bucle Principal */

      int i = 0;

      while (i < ILONG) {
        if (aSignif[i] && aiNumArray[i] != 0) {
          if ((i + 3) % 3 == 0) {
            if (this.sIdioma.equals("eu")) {
              CNL_Centenas_eu(i);
            } else {
              CNL_Centenas(i, piGenero);
            }
          } else if ((i + 2) % 3 == 0) {
            if (this.sIdioma.equals("eu")) {
              CNL_Decenas_eu(i);
            } else {
              CNL_Decenas(i);
            }
          } else if ((i + 1) % 3 == 0) {
            if (this.sIdioma.equals("eu")) {
              CNL_Unidades_eu(i);
            } else {
              CNL_Unidades(i, piGenero, bHayCentimos);
            }
          } else {
            i = ILONG;
          }
        }

        if ((i == 2 || i == 8) &&
            (aiNumArray[i] != 0 || aiNumArray[i - 1] != 0 || aiNumArray[i - 2] != 0)) {
          sTexto = sTexto.concat(asTexto[5][0] + " ");
        }

        if (i == 5 && aSignif[i]) {
          if (!aSignif[4] && aiNumArray[5] == 1) {
            sTexto = sTexto.concat(asTexto[5][1] + " ");
          } else {
            sTexto = sTexto.concat(asTexto[5][2] + " ");
          }
        }

        if ((i + 1) == ILONG) {
          if (sTexto.length() == 0) {
            sTexto = asTexto[5][3] + " ";
          }
        }

        i++;
      }

      /* Añade Céntimos si procede (EUROS) */

      if (centimos > 0) {
        sTexto = sTexto.concat(asTexto[5][7] + " ");
        numero = centimos;
        centimos = 0;
      }

    } while (bHayCentimos);

    /* Elimina Blancos innecesarios (SÓLO CATALÁN) */
    if (this.sIdioma.equals("ca")) {
      CNL_EliminaBlancos();
    }

    return sTexto;
  }

  /**
   * Método encargado de generar las decenas (válido para los idiomas español,
   * catalán y gallego).
   *
   * @param i posición dentro del número
   * @param piGenero Indicador de Género (1 - Masculino Fin de Frase,
   * 2 - Masculino No Fin de Frase, 3 - Femenino)
   * @param bHayCentimos Indica si hay céntimos o no. (Euros)
   */
  private void CNL_Unidades(int i, int piGenero, boolean bHayCentimos) {
    if (aiNumArray[i - 1] == 1 || (aiNumArray[i] == 1 && aiNumArray[i - 1] == 0 &&
        aiNumArray[i - 2] == 0 && (i == 2 || i == 8))) {
      return;
    }

    if ((i <= 5 || (i == 8 && piGenero < 3)) && aiNumArray[i] == 1) {
      sTexto = sTexto.concat(asTexto[0][9] + " ");
    } else if (i == 11 && aiNumArray[i] == 1 && piGenero < 3 && bHayCentimos) {
      sTexto = sTexto.concat(asTexto[5][5] + " ");
    } else if (i == 11 && aiNumArray[i] == 1 && piGenero == 2 && !bHayCentimos) {
      sTexto = sTexto.concat(asTexto[0][9] + " ");
    } else if (i == 11 && aiNumArray[i] == 1 && piGenero == 1 && !bHayCentimos) {
      sTexto = sTexto.concat(asTexto[5][5] + " ");
    } else {
      sTexto = sTexto.concat(asTexto[0][aiNumArray[i] - 1] + " ");
    }
  }

  /**
   * Método que se encarga de generar las unidades en Euskera.
   *
   * @param i posición dentro del número
   */
  private void CNL_Unidades_eu(int i) {
    // Si las decenas son 0 y las unidades son distintas del dígito 0
    if (aSignif[i -1] && (i - 1) == 10 && aiNumArray[i - 1] == 0 && aiNumArray[i] != 0) {
      sTexto = sTexto.concat(asTexto[5][4] + " ");
    }

    if (aiNumArray[i - 1] % 2 == 0) {
      sTexto = sTexto.concat(asTexto[0][aiNumArray[i] - 1] + " ");
    } else {
      sTexto = sTexto.concat(asTexto[1][aiNumArray[i] - 1] + " ");
    }
  }

  /**
   * Método encargado de generar las decenas (válido para los idiomas español,
   * catalán y gallego).
   *
   * @param i posición dentro del número
   */
  private void CNL_Decenas(int i) {
    if (aiNumArray[i + 1] == 0) {
      sTexto = sTexto.concat(asTexto[2][aiNumArray[i] - 1] + " ");
    } else if (aiNumArray[i] == 1) {
      sTexto = sTexto.concat(asTexto[1][aiNumArray[i + 1] - 1] + " ");
    } else if (aiNumArray[i] == 2) {
      sTexto = sTexto.concat(asTexto[2][9]);
    } else {
      sTexto = sTexto.concat(asTexto[2][aiNumArray[i] - 1] + " ");
      sTexto = sTexto.concat(asTexto[5][4] + " ");
    }
  }

  /**
   * Método que se encarga de generar las decenas en Euskera
   * @param i posición dentro del número
   */
  private void CNL_Decenas_eu(int i) {
    // Si las centenas son 0. Se añade el "TA". Si las centenas son distintas
    // de 0 pero estamos en la posición 9 (Centenas) también se añade el "TA"
    if ((aiNumArray[i - 1] == 0 && aSignif[i -1]) ||
        (aiNumArray[i - 1] != 0 && aSignif[i -1] && (i - 1) == 9)) {
      sTexto = sTexto.concat(asTexto[5][4] + " ");
    }

    if (aiNumArray[i] == 1 && aiNumArray[i + 1] != 0) {
      return;
    }

    // Si las unidades son 0
    if (aiNumArray[i + 1] == 0) {
      // Si las decenas par con unidades 0
      if (aiNumArray[i] % 2 == 0) {
        sTexto = sTexto.concat(asTexto[2][aiNumArray[i] - 1] + " ");
      } else {// Si las decenas son impar con unidades 0
        // Si las decenas son distintas de 1
        if (aiNumArray[i] != 1) {
          sTexto = sTexto.concat(asTexto[2][aiNumArray[i] - 1] + ' ');
          sTexto = sTexto.concat(asTexto[2][0] + ' ');
        } else {

          sTexto = sTexto.concat(asTexto[2][aiNumArray[i] - 1] + ' ');
        }
      }

    } else if (aiNumArray[i] % 2 == 0) {
      // Si las decenas son par
      sTexto = sTexto.concat(asTexto[2][aiNumArray[i]] + ' ');
      sTexto = sTexto.concat(asTexto[5][4] + ' ');

    } else {
      // Si las decenas son impar
      sTexto = sTexto.concat(asTexto[2][aiNumArray[i] - 1] + ' ');
      sTexto = sTexto.concat(asTexto[5][4] + ' ');
    }
  }

  /**
   * Método encargado de generar las decenas (válido para los idiomas español,
   * catalán y gallego).
   *
   * @param i posición dentro del número
   * @param piGenero Indicador de Género (1 - Masculino Fin de Frase,
   * 2 - Masculino No Fin de Frase, 3 - Femenino)
   */
  private void CNL_Centenas(int i, int piGenero) {
    int i2 = (i > 5 ? 3 : 4);

    if (aiNumArray[i] == 1) {
      if ((aiNumArray[i + 1] != 0 || aiNumArray[i + 2] != 0)) {
        // CIENTO
        sTexto = sTexto.concat(asTexto[i2][9] + " ");
      } else {
        // CIEN
        sTexto = sTexto.concat(asTexto[i2][0] + " ");
      }
    } else {
      if (piGenero < 3) {
        // MASCULINO
        sTexto = sTexto.concat(asTexto[4][aiNumArray[i] - 1] + " ");
      } else {
        // FEMENINO
        sTexto = sTexto.concat(asTexto[i2][aiNumArray[i] - 1] + " ");
      }
    }
  }

  /**
   * Método que se encarga de generar las centenas en Euskera.
   *
   * @param i posición dentro del número
   */
  private void CNL_Centenas_eu(int i) {
    sTexto = sTexto.concat(asTexto[4][aiNumArray[i] - 1] + " ");

//    if (aiNumArray[i + 1] != 0 || aiNumArray[i + 2] != 0) {
//      sTexto = sTexto.concat(asTexto[5][4] + " ");
//    }
  }

  /**
   * Elimina espacios en blanco. (SOLO PARA CATALÁN)
   */
  private void CNL_EliminaBlancos() {
    sTexto = sTexto.replaceAll(" - ", "-");
  }

}

