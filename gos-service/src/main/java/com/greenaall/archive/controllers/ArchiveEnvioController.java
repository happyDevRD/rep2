package com.greenaall.archive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.archive.dto.ArchiveEnvioDto;
import com.greenaall.archive.dto.ArchiveEnvioResultadoDto;
import com.greenaall.archive.service.ArchiveEnvioService;
import com.greenaall.archive.service.ArchiveExpedienteEnvioService;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;

@RestController
@RequestMapping("/archive/envio")
public class ArchiveEnvioController {

	@Autowired
	private ArchiveEnvioService archiveEnvioService;

	@Autowired
	private ArchiveExpedienteEnvioService archiveExpedienteEnvioService;

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@PostMapping("/expediente/{id}/enviar")
	@ResponseStatus(HttpStatus.OK)
	public ArchiveEnvioResultadoDto enviarPreingresoSip(@PathVariable Long id) {
		Expediente expediente = expedienteService.findById(id);
		if (expediente == null) {
			throw new NoDataFoundException();
		}
		return archiveExpedienteEnvioService.enviarPreingresoSIP(id, expediente.getInstructor());
	}

	@GetMapping("/expediente/{idExpediente}")
	public List<ArchiveEnvioDto> listarPorExpediente(@PathVariable Long idExpediente) {
		return archiveEnvioService.listarPorExpediente(idExpediente);
	}

	@GetMapping("/expediente/{idExpediente}/ultimo")
	public ArchiveEnvioDto obtenerUltimo(@PathVariable Long idExpediente) {
		return archiveEnvioService.obtenerUltimoPorExpediente(idExpediente);
	}
}
