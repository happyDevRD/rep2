package com.greenaall.util;

import java.util.HashMap;

import com.greenaall.gf.dto.Variable;
import com.greenaall.util.fiscal.GestionFiscalConstantes;

public class Variables {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HashMap rellenarPrograma(Variable[] variables) {

		HashMap oMapa = new HashMap();
		if (variables != null) {
			for (int i = 0; i < variables.length; i++) {
				
				if (variables[i] != null
						&& variables[i].getCodigo() != null
						&& variables[i].getValor() != null
						&& !GestionFiscalConstantes.CADENA_VACIA
								.equals(variables[i].getCodigo())
						&& !GestionFiscalConstantes.CADENA_VACIA
								.equals(variables[i].getValor())) {

					// Agregamos la variable al mapa
					oMapa
							.put(variables[i].getCodigo(), variables[i]
									.getValor());

				}
			}
		}

		return oMapa;
	}
}
