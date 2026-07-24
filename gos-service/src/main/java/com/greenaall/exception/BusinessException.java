package com.greenaall.exception;

import org.springframework.http.HttpStatus;

/**
 * Excepción base para errores de negocio que deben traducirse en una
 * respuesta HTTP concreta. Sustituye progresivamente a las numerosas
 * excepciones puntuales gestionadas antes una a una en
 * {@link ControllerAdvisor}, cada una con su propio {@code @ExceptionHandler}
 * casi idéntico.
 *
 * <p>Las subclases solo necesitan indicar el mensaje y, opcionalmente, el
 * {@link HttpStatus} (por defecto {@code FORBIDDEN}, que es el que usaban la
 * gran mayoría de excepciones de negocio existentes) y un código interno.
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final HttpStatus status;
	private final String code;

	public BusinessException(String message) {
		this(message, HttpStatus.FORBIDDEN, null);
	}

	public BusinessException(String message, HttpStatus status) {
		this(message, status, null);
	}

	public BusinessException(String message, HttpStatus status, String code) {
		super(message);
		this.status = status != null ? status : HttpStatus.FORBIDDEN;
		this.code = code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getCode() {
		return code;
	}
}
