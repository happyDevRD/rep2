package com.greenaall.exception;

public class HabintanteBajaException extends BusinessException {

	private static final long serialVersionUID = 1671999562340896722L;

	public HabintanteBajaException() {
        super("El habitante ya está en baja.");
    }
}
