package com.greenaall.notifica.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IParametroSistemaService;

/**
 * Parámetros Notifica: primero ge_parametro_sistema, fallback application.properties.
 * Códigos: 9400=DIR3, 9401=procedimiento SIA, 9402=URL WS.
 */
@Service
public class NotificaConfigService {

	private static final short COD_DIR3 = 9400;
	private static final short COD_PROCEDIMIENTO_SIA = 9401;
	private static final short COD_WS_URL = 9402;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Value("${notifica.cod-dir3:}")
	private String codDir3Default;

	@Value("${notifica.procedimiento-sia:}")
	private String procedimientoSiaDefault;

	@Value("${notifica.ws-url:}")
	private String wsUrlDefault;

	public String getCodDir3() {
		return valorParametro(COD_DIR3, codDir3Default);
	}

	public String getProcedimientoSia() {
		return valorParametro(COD_PROCEDIMIENTO_SIA, procedimientoSiaDefault);
	}

	public String getWsUrl() {
		return valorParametro(COD_WS_URL, wsUrlDefault);
	}

	private String valorParametro(short codigo, String fallback) {
		ParametroSistemaPK pk = new ParametroSistemaPK(Long.valueOf(1L), Long.valueOf(0L), "es",
				Short.valueOf(codigo));
		ParametroSistema param = parametroSistemaService.findById(pk);
		if (param != null && param.getValor() != null && !param.getValor().isBlank()) {
			return param.getValor().trim();
		}
		return fallback != null ? fallback : "";
	}
}
