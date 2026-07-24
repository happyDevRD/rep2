package com.greenaall.models.ge.dto;

import com.greenaall.models.ge.entity.Firma;

public class FirmaEx extends Firma {

	private static final long serialVersionUID = -2627273696671257311L;
	private CargoEx cargo;

	/**
	 * @return the cargos
	 */
	public CargoEx getCargo() {
		return cargo;
	}

	/**
	 * @param cargos
	 *            the cargos to set
	 */
	public void setCargo(CargoEx cargo) {
		this.cargo = cargo;
	}

	/**
	 * @param cargos
	 */
	public FirmaEx(CargoEx cargo) {
		this.cargo = cargo;
	}

	public boolean esOrigen(FirmaEx firma) {

		if (!super.equals(firma)) {
			return false;
		}

		if (cargo == null) {
			return (firma.cargo == null);
		}

		return cargo.esOrigen(firma.cargo);
	}

	@Override
	public String toString() {
		return this.getOrden() + ". " + this.getCargo().getDescripcion() + (this.getIndTipo() != null
				&& this.getIndTipo().equals(
						Short.valueOf("1")) ? " (VISTO BUENO)" : "");
	}

	public FirmaEx() {
		super();
	}
	
	
}
