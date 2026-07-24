package com.greenaall.inside.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.inside.dto.InsideConsultaRemisionRequestDto;
import com.greenaall.inside.dto.InsideEnvioResultadoDto;
import com.greenaall.inside.dto.InsideRemisionRequestDto;
import com.greenaall.inside.service.InsideRemisionService;

@RestController
@RequestMapping("/inside/remision")
public class InsideRemisionController {

	@Autowired
	private InsideRemisionService insideRemisionService;

	@PostMapping("/enviar")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto enviarRemision(@RequestBody InsideRemisionRequestDto request) {
		return insideRemisionService.enviarRemisionAJusticia(request);
	}

	@PostMapping("/consultar-estado")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto consultarEstado(@RequestBody InsideConsultaRemisionRequestDto request) {
		return insideRemisionService.consultarEstadoRemision(request);
	}
}
