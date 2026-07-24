package com.greenaall.inside.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.inside.dto.InsideEnvioDto;
import com.greenaall.inside.dto.InsidePendientesResumenDto;
import com.greenaall.inside.dto.InsideRegistrarEnvioRequest;
import com.greenaall.inside.service.InsideEnvioService;
import com.greenaall.inside.service.InsidePendientesService;

@RestController
@RequestMapping("/inside/envio")
public class InsideEnvioController {

	@Autowired
	private InsideEnvioService insideEnvioService;

	@Autowired
	private InsidePendientesService insidePendientesService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public InsideEnvioDto registrar(@RequestBody InsideRegistrarEnvioRequest request) {
		return insideEnvioService.registrar(request);
	}

	@GetMapping("/expediente/{idExpediente}")
	public List<InsideEnvioDto> listarPorExpediente(@PathVariable Long idExpediente) {
		return insideEnvioService.listarPorExpediente(idExpediente);
	}

	@GetMapping("/expediente/{idExpediente}/ultimo")
	public InsideEnvioDto obtenerUltimo(@PathVariable Long idExpediente) {
		return insideEnvioService.obtenerUltimoPorExpediente(idExpediente);
	}

	@GetMapping("/pendientes/{tramitador}/resumen")
	public InsidePendientesResumenDto obtenerResumenPendientes(@PathVariable String tramitador) {
		return insidePendientesService.obtenerResumenPorTramitador(tramitador);
	}

	@GetMapping("/pendientes/{tramitador}/ids")
	public List<Long> listarIdsPendientes(@PathVariable String tramitador) {
		return insidePendientesService.listarIdsPendientesPorTramitador(tramitador);
	}
}
