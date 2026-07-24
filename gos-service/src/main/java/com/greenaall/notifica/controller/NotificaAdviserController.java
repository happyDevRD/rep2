package com.greenaall.notifica.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.notifica.dto.NotificaIntegracionResultDto;
import com.greenaall.notifica.service.NotificaAdviserService;

/**
 * Endpoint Adviser para callbacks de estado de Notifica (PAe).
 * En producción debe exponerse con dominio público y SSL.
 */
@RestController
public class NotificaAdviserController {

	@Autowired
	private NotificaAdviserService notificaAdviserService;

	@PostMapping("/notifica/adviser")
	@ResponseStatus(HttpStatus.OK)
	public NotificaIntegracionResultDto recibirCallback(@RequestBody Map<String, String> payload) {
		return notificaAdviserService.procesarCallback(payload);
	}
}
