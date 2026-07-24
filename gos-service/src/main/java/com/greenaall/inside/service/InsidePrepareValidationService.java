package com.greenaall.inside.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.inside.dto.InsideValidacionDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;

@Service
public class InsidePrepareValidationService {

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private TramiteServiceImpl tramiteService;

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	@Value("${inside.soap.dry-run:false}")
	private boolean modoDryRun;

	public InsideValidacionDto validarExpediente(Long id) {
		Expediente expediente = expedienteService.findById(id);
		if (expediente == null) {
			throw new NoDataFoundException();
		}

		InsideValidacionDto validacion = new InsideValidacionDto();
		validacion.setModoDryRun(modoDryRun);
		validacion.setExpedienteCerrado(
				EnumEstadoExpediente.CERRADO.equals(expediente.getEstado())
						|| EnumEstadoExpediente.ARCHIVADO.equals(expediente.getEstado()));

		List<String> errores = new ArrayList<>();
		List<String> advertencias = new ArrayList<>();
		int documentosConvertibles = 0;
		int documentosFinalizados = 0;

		List<Tramite> tramites = tramiteService.findByExpediente(id);
		if (tramites != null) {
			for (Tramite tramite : tramites) {
				List<TareaTramiteExpediente> tareas = tareaTramiteExpedienteService.findByTramite(tramite.getId());
				if (tareas == null) {
					continue;
				}

				for (TareaTramiteExpediente tarea : tareas) {
					if (tarea.getArchivo() == null) {
						continue;
					}

					documentosConvertibles++;
					if (tarea.getFecFin() != null) {
						documentosFinalizados++;
					} else {
						advertencias.add("La tarea " + tarea.getId() + " tiene documento pero no fecha de fin.");
					}
				}
			}
		}

		validacion.setDocumentosConvertibles(documentosConvertibles);
		validacion.setDocumentosFinalizados(documentosFinalizados);

		if (documentosConvertibles == 0) {
			errores.add("No hay tareas con documento asociado en el expediente.");
		}

		if (expediente.getEjercicio() == null || expediente.getNumero() == null) {
			errores.add("El expediente no tiene ejercicio o número asignado.");
		}

		validacion.setErrores(errores);
		validacion.setAdvertencias(advertencias);
		validacion.setValido(errores.isEmpty());
		return validacion;
	}
}
