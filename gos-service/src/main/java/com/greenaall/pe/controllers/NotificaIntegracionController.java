package com.greenaall.pe.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.notifica.dto.NotificaIntegracionResultDto;
import com.greenaall.notifica.service.NotificaIntegracionService;

@RestController
public class NotificaIntegracionController {

	@Autowired
	private NotificaIntegracionService notificaIntegracionService;

	@PostMapping("/notificacion/enviarNotifica/{idNotif}")
	@ResponseStatus(HttpStatus.OK)
	public NotificaIntegracionResultDto enviarNotifica(@PathVariable Long idNotif,
			@RequestBody(required = false) Map<String, String> body) {
		String usuContr = body != null ? body.get("usuContr") : null;
		return notificaIntegracionService.enviarANotifica(idNotif, usuContr);
	}

	@PostMapping("/notificacion/sincronizarNotifica/{idNotif}")
	@ResponseStatus(HttpStatus.OK)
	public NotificaIntegracionResultDto sincronizarNotifica(@PathVariable Long idNotif,
			@RequestBody(required = false) Map<String, String> body) {
		String usuContr = body != null ? body.get("usuContr") : null;
		return notificaIntegracionService.sincronizarConNotifica(idNotif, usuContr);
	}

	@GetMapping("/notificacion/envioNotifica/{idNotif}")
	public GfEnvioNotifica consultarEnvio(@PathVariable Long idNotif) {
		return notificaIntegracionService.consultarEnvioActivo(idNotif);
	}
}
