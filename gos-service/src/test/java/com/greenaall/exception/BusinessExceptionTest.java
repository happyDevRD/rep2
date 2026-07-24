package com.greenaall.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class BusinessExceptionTest {

	@Test
	void constructorSimple_usaForbiddenPorDefecto() {
		BusinessException ex = new BusinessException("error de negocio");
		assertEquals("error de negocio", ex.getMessage());
		assertEquals(HttpStatus.FORBIDDEN, ex.getStatus());
		assertNull(ex.getCode());
	}

	@Test
	void constructorConStatus_respetaStatus() {
		BusinessException ex = new BusinessException("conflicto", HttpStatus.CONFLICT);
		assertEquals(HttpStatus.CONFLICT, ex.getStatus());
	}

	@Test
	void constructorCompleto_guardaCodigo() {
		BusinessException ex = new BusinessException("no encontrado", HttpStatus.NOT_FOUND, "EXP-404");
		assertEquals(HttpStatus.NOT_FOUND, ex.getStatus());
		assertEquals("EXP-404", ex.getCode());
	}
}
