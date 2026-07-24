package com.greenaall.models.ge.dto;

import com.greenaall.util.Utiles;

public class CargoEx extends Cargo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4037150558294435272L;

	private String carPlata;

	private PersonaFirmante[] firmantes;
	private PersonaFirmante firmanteDefecto;

	/**
	 * @return the firmanteDefecto
	 */
	public PersonaFirmante getFirmanteDefecto() {
		return firmanteDefecto;
	}

	/**
	 * @param firmanteDefecto
	 *            the firmanteDefecto to set
	 */
	public void setFirmanteDefecto(PersonaFirmante firmanteDefecto) {
		this.firmanteDefecto = firmanteDefecto;
	}

	/**
	 * @return the carPlata
	 */
	public String getCarPlata() {
		return carPlata;
	}

	/**
	 * @param carPlata
	 *            the carPlata to set
	 */
	public void setCarPlata(String carPlata) {
		this.carPlata = carPlata;
	}

	/**
	 * @return the firmantes
	 */
	public PersonaFirmante[] getFirmantes() {
		return firmantes;
	}

	/**
	 * @param firmantes
	 *            the firmantes to set
	 */
	public void setFirmantes(PersonaFirmante[] firmantes) {
		this.firmantes = firmantes;
	}

	/**
	 * @param firmantes
	 *            the firmantes to set
	 */
	public void setFirmantes(PersonaFirmante[] firmantes,
			PersonaFirmante firmanteDefecto) {
		this.firmantes = firmantes;
		this.firmanteDefecto = firmanteDefecto;
	}

	/**
	 * Constructor
	 */
	public CargoEx() {
		super();
	}

	/**
	 * Constructor
	 */
	public CargoEx(PersonaFirmante[] firmantes, PersonaFirmante firmanteDefecto) {
		this();
		this.setFirmantes(firmantes, firmanteDefecto);
	}

	/**
	 * Crea un nuevo {@link CargoEx} a partir de este, descartando los Firmantes
	 * y asignando el Firmante por Defecto seleccionado.
	 * 
	 * @param firmanteDefecto
	 *            Firmante por Defecto seleccionado
	 * @return El nuevo {@link CargoEx}.
	 */
	public CargoEx seleccionar(PersonaFirmante firmanteDefecto) {
		CargoEx nuevoCargoEx = new CargoEx();
		nuevoCargoEx.setCarPlata(getCarPlata());
		nuevoCargoEx.setCodCargo(getCodCargo());
		nuevoCargoEx.setDescripcion(getDescripcion());
		nuevoCargoEx.setFecContr(getFecContr());
		nuevoCargoEx.setUsuContr(getUsuContr());
		nuevoCargoEx.setFirmanteDefecto(firmanteDefecto);

		return nuevoCargoEx;
	}

	public boolean esOrigen(CargoEx cargo) {

		if (!super.equals(cargo)) {
			return false;
		}

		if (carPlata == null ? cargo.carPlata != null : !carPlata
				.equals(cargo.carPlata)) {
			return false;
		}

		if (!Utiles.isArrayNoVacio(firmantes)) {
			return cargo.firmanteDefecto == null;
		}

		if (cargo.firmanteDefecto == null) {
			/* Tiene que haber alguno seleccionado */
			return false;
		}

		if (cargo.firmanteDefecto.equals(firmanteDefecto)) {
			return true;
		}

		for (PersonaFirmante firmante : firmantes) {
			if (cargo.firmanteDefecto.equals(firmante)) {
				return true;
			}
		}

		return false;
	}
}
