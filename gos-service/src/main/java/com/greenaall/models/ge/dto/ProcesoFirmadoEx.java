package com.greenaall.models.ge.dto;

import java.util.Arrays;

import com.greenaall.util.Utiles;

public class ProcesoFirmadoEx extends ProcesoFirmadoRc {

	private static final long serialVersionUID = 584384645110546839L;
	private FirmaEx[] firmas;

	/**
	 * @return the firmas
	 */
	public FirmaEx[] getFirmas() {
		return firmas;
	}

	/**
	 * @param firmas
	 *            the firmas to set
	 */
	public void setFirmas(FirmaEx[] firmas) {
		this.firmas = firmas;
	}

	/**
	 * Constructor por defecto.
	 */
	public ProcesoFirmadoEx() {
	}

	/**
	 * Constructor.
	 * 
	 * @param firmas
	 */
	public ProcesoFirmadoEx(FirmaEx[] firmas) {
		this.firmas = firmas;
	}

	@Override
	public int hashCode() {
		final int prime = 29;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(firmas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ProcesoFirmadoEx))
			return false;
		final ProcesoFirmadoEx other = (ProcesoFirmadoEx) obj;
		if (!Arrays.equals(firmas, other.firmas))
			return false;
		return true;
	}

	/**
	 * Comprueba si un ProcesoFirmadoEx especificado procede de la selección de
	 * firmantes de este ProcesoFirmadoEx.
	 * 
	 * @param procesoSeleccionado
	 * @return
	 */
	public boolean esOrigen(ProcesoFirmadoEx procesoSeleccionado) {

		if (!super.equals(procesoSeleccionado)) {
			return false;
		}

		if (!Utiles.isArrayNoVacio(firmas)) {
			return (!Utiles.isArrayNoVacio(procesoSeleccionado.firmas));
		}

		if (firmas.length != procesoSeleccionado.firmas.length) {
			return false;
		}

		for (int i = 0; i < firmas.length; i++) {
			if (firmas[i] == null && procesoSeleccionado.firmas[i] != null) {
				return false;
			} else if (!firmas[i].esOrigen(procesoSeleccionado.firmas[i])) {
				return false;
			}
		}

		return true;
	}

	public boolean esCompatible(ProcesoFirmadoEx proFirma) {
		if (proFirma == null) {
			return false;
		}

		if (!Utiles.isArrayNoVacio(firmas)) {
			return !Utiles.isArrayNoVacio(proFirma.firmas);
		}

		if (firmas.length != proFirma.firmas.length) {
			return false;
		}

		for (int i = 0; i < firmas.length; i++) {
			if (firmas[i] == null ? proFirma.firmas[i] != null : !firmas[i]
					.esCompatible(proFirma.firmas[i])) {
				return false;
			}
		}

		return true;
	}
}