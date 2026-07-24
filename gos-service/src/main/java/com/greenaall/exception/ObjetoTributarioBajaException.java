package com.greenaall.exception;

public class ObjetoTributarioBajaException extends BusinessException {

	private static final long serialVersionUID = 7379319690174146992L;

	public ObjetoTributarioBajaException() {
        super("El Objeto Tribuario ya está en baja.");
    }
}
