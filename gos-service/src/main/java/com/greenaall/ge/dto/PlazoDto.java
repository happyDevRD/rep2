package com.greenaall.ge.dto;

import java.io.Serializable;

public class PlazoDto implements Serializable{

	private static final long serialVersionUID = -7933556378288646405L;
	private String color;
	private String fecha;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
