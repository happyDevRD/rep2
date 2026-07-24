package com.greenaall.inside.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsidePendientesResumenDto;
import com.greenaall.models.ex.dto.ExpedienteDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramitadorServiceImpl;
import com.greenaall.models.gf.entity.GfEnvioInside;

@Service
public class InsidePendientesService {

	@Autowired
	private TramitadorServiceImpl tramitadorService;

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private InsideEnvioService insideEnvioService;

	public boolean esPendienteInside(Expediente expediente) {
		if (expediente == null || expediente.getId() == null) {
			return false;
		}

		if (!EnumEstadoExpediente.CERRADO.equals(expediente.getEstado())
				&& !EnumEstadoExpediente.ARCHIVADO.equals(expediente.getEstado())) {
			return false;
		}

		if (expediente.getArchivo() == null) {
			return false;
		}

		String estadoInside = insideEnvioService.obtenerEstadoResumen(expediente.getId());
		if (estadoInside == null || estadoInside.isBlank()) {
			return true;
		}

		return GfEnvioInside.ESTADO_PENDIENTE.equals(estadoInside)
				|| GfEnvioInside.ESTADO_ERROR.equals(estadoInside);
	}

	public List<Long> listarIdsPendientesPorTramitador(String tramitador) {
		List<Long> idsTramitador = tramitadorService.findByExpedientUsuario(tramitador);
		List<Long> pendientes = new ArrayList<>();

		if (idsTramitador == null) {
			return pendientes;
		}

		for (Long expedienteId : idsTramitador) {
			Expediente expediente = expedienteService.findById(expedienteId);
			if (esPendienteInside(expediente)) {
				pendientes.add(expedienteId);
			}
		}

		return pendientes;
	}

	public InsidePendientesResumenDto obtenerResumenPorTramitador(String tramitador) {
		InsidePendientesResumenDto resumen = new InsidePendientesResumenDto();
		List<Long> idsTramitador = tramitadorService.findByExpedientUsuario(tramitador);

		if (idsTramitador == null) {
			return resumen;
		}

		int pendientes = 0;
		int errores = 0;

		for (Long expedienteId : idsTramitador) {
			Expediente expediente = expedienteService.findById(expedienteId);
			if (!esPendienteInside(expediente)) {
				continue;
			}

			String estadoInside = insideEnvioService.obtenerEstadoResumen(expedienteId);
			if (GfEnvioInside.ESTADO_ERROR.equals(estadoInside)) {
				errores++;
			} else {
				pendientes++;
			}
		}

		resumen.setTotalPendientes(pendientes);
		resumen.setTotalError(errores);
		return resumen;
	}

	public List<ExpedienteDto> filtrarExpedientesPendientes(List<ExpedienteDto> expedientes) {
		List<ExpedienteDto> filtrados = new ArrayList<>();

		for (ExpedienteDto expedienteDto : expedientes) {
			if (expedienteDto.getId() == null) {
				continue;
			}

			Expediente expediente = expedienteService.findById(expedienteDto.getId());
			if (esPendienteInside(expediente)) {
				filtrados.add(expedienteDto);
			}
		}

		return filtrados;
	}
}
