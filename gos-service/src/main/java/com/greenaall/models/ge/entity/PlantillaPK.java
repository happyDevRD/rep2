package com.greenaall.models.ge.entity;

public class PlantillaPK implements java.io.Serializable {

	private static final long serialVersionUID = -3502456353597292910L;

	private Short modulo;

	private String plantilla;
	
	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}

	public PlantillaPK(Short modulo, java.lang.String plantilla) {
		this.modulo = modulo;
		this.plantilla = plantilla;
	}

	public PlantillaPK() {
	}
}