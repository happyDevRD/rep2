package com.greenaall.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

import com.greenaall.gf.dto.Variable;
import com.greenaall.models.ge.entity.ProgramaCalculo;
import com.greenaall.models.gf.entity.ImpuestoConcepto;
import com.greenaall.util.fiscal.GestionFiscalConstantes;

public class Calculo {

	Variables oVariables = null;

	public Calculo() {
		oVariables = new Variables();
	}

	@SuppressWarnings("rawtypes")
	public BigDecimal calculoImporteImpuesto(ImpuestoConcepto oImpConce,
			ProgramaCalculo oProCalcu, Variable[] variables) throws Exception {

		// Tipo de cálculo
		Short shTipoCalculo = oImpConce.getTipCalcu();
		if (shTipoCalculo == null) {
			throw new Exception("Tipo de Cálculo Nulo");
		} else if (GestionFiscalConstantes.TIP_CALCU_CALCULADO.equals(shTipoCalculo)) {
			throw new Exception("Tipo de Cálculo Vacío");
		} else if (GestionFiscalConstantes.TIP_CALCU_FIJO.equals(shTipoCalculo)) {
			return oImpConce.getImpConce();
		} else if (GestionFiscalConstantes.TIP_CALCU_PROGRAMA_CALCULO.equals(shTipoCalculo)) {
			try {
				Object oCompilado = null;
				if (oProCalcu != null) {
					oCompilado = new Ejecutar().compilaPC(new String((byte[]) oProCalcu.getDefProgr()));
				}

				if (oCompilado != null) {
					HashMap oMapa = oVariables.rellenarPrograma(variables);
					Double dResultado = (Double) oCompilado.getClass()
							.getMethod("metodo", new Class[] { HashMap.class })
							.invoke(oCompilado, new Object[] { oMapa });

					if (dResultado == null || Double.isNaN(dResultado.doubleValue())
							|| Double.isInfinite(dResultado.doubleValue())) {
						return new BigDecimal("0.00");
					}

					return new BigDecimal(dResultado.doubleValue()).setScale(2, RoundingMode.HALF_UP);
				}
			} catch (Exception ex) {
				throw new Exception("Error al ejecutar programa de cálculo");
			}
		}

		return new BigDecimal("0.00");
	}

}
