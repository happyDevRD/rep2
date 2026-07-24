package com.greenaall.inside.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsideEniXmlBase64Dto;
import com.greenaall.inside.dto.InsideEnvioResultadoDto;
import com.greenaall.inside.dto.InsideRegistrarEnvioRequest;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.gf.entity.GfEnvioInside;

@Service
public class InsideExpedienteEnvioService {

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private TramiteServiceImpl tramiteService;

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	@Autowired
	private InsideEniFileService insideEniFileService;

	@Autowired
	private InsideEnvioService insideEnvioService;

	@Autowired
	private InsideSoapEnvelopeBuilder insideSoapEnvelopeBuilder;

	@Autowired
	private InsideSoapClientService insideSoapClientService;

	public InsideEnvioResultadoDto enviarAltaExpedienteEniXml(Long expedienteId, String usuContr) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			Expediente expediente = expedienteService.findById(expedienteId);
			if (expediente == null) {
				return registrarError(expedienteId, usuContr, resultado, "Expediente no encontrado.");
			}

			if (!EnumEstadoExpediente.CERRADO.equals(expediente.getEstado())
					&& !EnumEstadoExpediente.ARCHIVADO.equals(expediente.getEstado())) {
				return registrarError(expedienteId, usuContr, resultado,
						"El expediente debe estar cerrado o archivado para el envío INSIDE.");
			}

			// Demo sin REDSARA / sin XML ENI en disco: simular alta completa.
			if (insideSoapClientService.isModoDryRun()) {
				return enviarAltaExpedienteEniXmlDryRun(expedienteId, usuContr, resultado);
			}

			InsideEniXmlBase64Dto expedienteXml = insideEniFileService.obtenerExpedienteEniXmlBase64(expedienteId);
			if (!expedienteXml.isEncontrado() || expedienteXml.getBase64() == null) {
				return registrarError(expedienteId, usuContr, resultado,
						expedienteXml.getMensaje() != null
								? expedienteXml.getMensaje()
								: "No se encontró el XML ENI del expediente.");
			}

			List<TareaTramiteExpediente> tareas = listarTareasFinalizadasConDocumento(expedienteId);
			if (tareas.isEmpty()) {
				return registrarError(expedienteId, usuContr, resultado,
						"No hay documentos finalizados para el alta ENI XML.");
			}

			List<InsideEniXmlBase64Dto> documentosXml = new ArrayList<>();
			for (TareaTramiteExpediente tarea : tareas) {
				InsideEniXmlBase64Dto documentoXml = insideEniFileService
						.obtenerDocumentoEniXmlBase64(tarea.getArchivo());
				if (!documentoXml.isEncontrado() || documentoXml.getBase64() == null) {
					return registrarError(expedienteId, usuContr, resultado,
							"El documento de la tarea " + tarea.getId() + " no tiene XML ENI en disco.");
				}
				documentosXml.add(documentoXml);
			}

			resultado.getAdvertencias().add("Expediente XML: " + expedienteXml.getNombreArchivo());
			resultado.getAdvertencias().add("Documentos ENI preparados: " + documentosXml.size());

			List<String> documentosBase64 = documentosXml.stream()
					.map(InsideEniXmlBase64Dto::getBase64)
					.toList();
			String envelope = insideSoapEnvelopeBuilder.buildAltaExpedienteEniXmlEnvelope(
					expedienteXml.getBase64(),
					documentosBase64);
			String soapAction = insideSoapEnvelopeBuilder.buildSoapActionAltaExpedienteEniXml();
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeInsideWs(
					"altaExpedienteEniXml",
					soapAction,
					envelope);

			if (soapResponse.hasFault()) {
				return registrarError(expedienteId, usuContr, resultado, soapResponse.getFaultString());
			}

			if (!soapResponse.isSuccess()) {
				String mensaje = soapResponse.getDescripcionRespuesta() != null
						? soapResponse.getDescripcionRespuesta()
						: "INSIDE devolvió código " + soapResponse.getCodigoRespuesta();
				return registrarError(expedienteId, usuContr, resultado, mensaje);
			}

			resultado.setExito(true);
			resultado.setModoDryRun(insideSoapClientService.isModoDryRun());
			resultado.setCodigoRespuesta(soapResponse.getCodigoRespuesta());
			resultado.setDescripcionRespuesta(soapResponse.getDescripcionRespuesta());
			resultado.setIdentificadorEni(soapResponse.getIdentificador());
			resultado.setCsv(soapResponse.getCsv());
			registrarExito(expedienteId, usuContr, resultado);
			return resultado;
		} catch (Exception e) {
			return registrarError(expedienteId, usuContr, resultado, e.getMessage());
		}
	}

	private List<TareaTramiteExpediente> listarTareasFinalizadasConDocumento(Long expedienteId) {
		List<TareaTramiteExpediente> resultado = new ArrayList<>();
		List<Tramite> tramites = tramiteService.findByExpediente(expedienteId);
		if (tramites == null) {
			return resultado;
		}

		for (Tramite tramite : tramites) {
			List<TareaTramiteExpediente> tareas = tareaTramiteExpedienteService.findByTramite(tramite.getId());
			if (tareas == null) {
				continue;
			}
			for (TareaTramiteExpediente tarea : tareas) {
				if (tarea.getArchivo() != null && tarea.getFecFin() != null) {
					resultado.add(tarea);
				}
			}
		}

		return resultado;
	}

	private InsideEnvioResultadoDto enviarAltaExpedienteEniXmlDryRun(Long expedienteId, String usuContr,
			InsideEnvioResultadoDto resultado) throws Exception {
		String soapAction = insideSoapEnvelopeBuilder.buildSoapActionAltaExpedienteEniXml();
		InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeInsideWs(
				"altaExpedienteEniXml",
				soapAction,
				"<dryRun/>");

		resultado.setExito(true);
		resultado.setModoDryRun(true);
		resultado.setCodigoRespuesta(soapResponse.getCodigoRespuesta() != null
				? soapResponse.getCodigoRespuesta()
				: "0");
		resultado.setDescripcionRespuesta(soapResponse.getDescripcionRespuesta() != null
				? soapResponse.getDescripcionRespuesta()
				: "Operación simulada (dry-run) — sin acceso a REDSARA");
		resultado.setIdentificadorEni(soapResponse.getIdentificador() != null
				? soapResponse.getIdentificador()
				: "ENI-SIM-" + expedienteId);
		resultado.setCsv(soapResponse.getCsv() != null ? soapResponse.getCsv() : "CSV-SIM-" + expedienteId);
		resultado.getAdvertencias().add("Modo simulación: no se leyeron XML ENI de disco.");
		registrarExito(expedienteId, usuContr, resultado);
		return resultado;
	}

	private InsideEnvioResultadoDto registrarExito(Long expedienteId, String usuContr,
			InsideEnvioResultadoDto resultado) {
		InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
		request.setIdExpediente(expedienteId);
		request.setOperacion(InsideEnvioService.OPERACION_ALTA_EXPEDIENTE_XML);
		request.setEstadoEnvio(insideSoapClientService.isModoDryRun()
				? GfEnvioInside.ESTADO_SIMULADO
				: GfEnvioInside.ESTADO_ENVIADO);
		request.setCodigoRespuesta(resultado.getCodigoRespuesta());
		request.setDescripcionRespuesta(resultado.getDescripcionRespuesta());
		request.setIdentificadorEni(resultado.getIdentificadorEni());
		request.setCsv(resultado.getCsv());
		request.setModoDryRun(insideSoapClientService.isModoDryRun());
		request.setUsuContr(usuContr);
		insideEnvioService.registrar(request);
		return resultado;
	}

	private InsideEnvioResultadoDto registrarError(Long expedienteId, String usuContr,
			InsideEnvioResultadoDto resultado, String mensaje) {
		resultado.setExito(false);
		resultado.setMensajeError(mensaje);

		InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
		request.setIdExpediente(expedienteId);
		request.setOperacion(InsideEnvioService.OPERACION_ALTA_EXPEDIENTE_XML);
		request.setEstadoEnvio(GfEnvioInside.ESTADO_ERROR);
		request.setMensajeError(mensaje);
		request.setModoDryRun(insideSoapClientService.isModoDryRun());
		request.setUsuContr(usuContr);
		insideEnvioService.registrar(request);
		return resultado;
	}
}
