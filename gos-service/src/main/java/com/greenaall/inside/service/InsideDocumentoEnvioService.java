package com.greenaall.inside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsideAltaDocumentoEniSoapDto;
import com.greenaall.inside.dto.InsideEniXmlBase64Dto;
import com.greenaall.inside.dto.InsideEnvioResultadoDto;
import com.greenaall.inside.dto.InsideRegistrarEnvioRequest;
import com.greenaall.inside.dto.InsideTareaDocumentoContextDto;
import com.greenaall.inside.mapper.InsideIflowMapper;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.gf.entity.GfEnvioInside;

@Service
public class InsideDocumentoEnvioService {

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	@Autowired
	private TramiteServiceImpl tramiteService;

	@Autowired
	private InsideEniFileService insideEniFileService;

	@Autowired
	private InsideEnvioService insideEnvioService;

	@Autowired
	private InsideSoapEnvelopeBuilder insideSoapEnvelopeBuilder;

	@Autowired
	private InsideSoapClientService insideSoapClientService;

	@Autowired
	private InsideConvertirContextService insideConvertirContextService;

	public InsideEnvioResultadoDto enviarAltaDocumentoEni(Long tareaId, String usuContr) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			TareaTramiteExpediente tarea = tareaTramiteExpedienteService.findById(tareaId);
			if (tarea == null) {
				return registrarError(null, tareaId, usuContr, resultado, "Tarea no encontrada.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_ENI);
			}

			Long expedienteId = resolverExpedienteId(tarea);
			if (expedienteId == null) {
				return registrarError(null, tareaId, usuContr, resultado,
						"No se pudo resolver el expediente de la tarea.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_ENI);
			}

			InsideTareaDocumentoContextDto documento = insideConvertirContextService
					.cargarDocumentoTarea(expedienteId, tareaId);
			if (documento == null) {
				return registrarError(expedienteId, tareaId, usuContr, resultado,
						"No se pudo preparar el documento de la tarea.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_ENI);
			}

			var context = insideConvertirContextService.cargarContexto(expedienteId);
			int ejercicio = context.getExpediente().getEjercicio() != null
					? context.getExpediente().getEjercicio().intValue()
					: java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
			InsideAltaDocumentoEniSoapDto soapDto = InsideIflowMapper.mapTareaToAltaDocumentoEni(
					documento, context.getOrganoDir3(), ejercicio, false);
			if (soapDto == null) {
				return registrarError(expedienteId, tareaId, usuContr, resultado,
						"El documento no tiene contenido descargable.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_ENI);
			}

			String envelope = insideSoapEnvelopeBuilder.buildAltaDocumentoEniEnvelope(soapDto);
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeInsideWs(
					"altaDocumentoEni",
					insideSoapEnvelopeBuilder.buildSoapActionAltaDocumentoEni(),
					envelope);

			return procesarRespuesta(expedienteId, tareaId, usuContr, resultado, soapResponse,
					InsideEnvioService.OPERACION_ALTA_DOCUMENTO_ENI);
		} catch (Exception e) {
			return registrarError(null, tareaId, usuContr, resultado, e.getMessage(),
					InsideEnvioService.OPERACION_ALTA_DOCUMENTO_ENI);
		}
	}

	public InsideEnvioResultadoDto enviarAltaDocumentoEniXml(Long tareaId, String usuContr) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			TareaTramiteExpediente tarea = tareaTramiteExpedienteService.findById(tareaId);
			if (tarea == null) {
				return registrarError(null, tareaId, usuContr, resultado, "Tarea no encontrada.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_XML);
			}

			if (tarea.getArchivo() == null) {
				return registrarError(null, tareaId, usuContr, resultado,
						"La tarea no tiene documento asociado.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_XML);
			}

			Long expedienteId = resolverExpedienteId(tarea);
			if (expedienteId == null) {
				return registrarError(null, tareaId, usuContr, resultado,
						"No se pudo resolver el expediente de la tarea.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_XML);
			}

			InsideEniXmlBase64Dto documentoXml = insideEniFileService
					.obtenerDocumentoEniXmlBase64(tarea.getArchivo());
			if (!documentoXml.isEncontrado() || documentoXml.getBase64() == null) {
				return registrarError(expedienteId, tareaId, usuContr, resultado,
						documentoXml.getMensaje() != null
								? documentoXml.getMensaje()
								: "No se encontró el XML ENI del documento.",
						InsideEnvioService.OPERACION_ALTA_DOCUMENTO_XML);
			}

			resultado.getAdvertencias().add("Documento XML: " + documentoXml.getNombreArchivo());

			String envelope = insideSoapEnvelopeBuilder
					.buildAltaDocumentoEniXmlEnvelope(documentoXml.getBase64());
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeInsideWs(
					"altaDocumentoEniXml",
					insideSoapEnvelopeBuilder.buildSoapActionAltaDocumentoEniXml(),
					envelope);

			return procesarRespuesta(expedienteId, tareaId, usuContr, resultado, soapResponse,
					InsideEnvioService.OPERACION_ALTA_DOCUMENTO_XML);
		} catch (Exception e) {
			return registrarError(null, tareaId, usuContr, resultado, e.getMessage(),
					InsideEnvioService.OPERACION_ALTA_DOCUMENTO_XML);
		}
	}

	private InsideEnvioResultadoDto procesarRespuesta(
			Long expedienteId,
			Long tareaId,
			String usuContr,
			InsideEnvioResultadoDto resultado,
			InsideSoapParsedResponse soapResponse,
			String operacion) {
		if (soapResponse.hasFault()) {
			return registrarError(expedienteId, tareaId, usuContr, resultado, soapResponse.getFaultString(), operacion);
		}

		if (!soapResponse.isSuccess()) {
			String mensaje = soapResponse.getDescripcionRespuesta() != null
					? soapResponse.getDescripcionRespuesta()
					: "INSIDE devolvió código " + soapResponse.getCodigoRespuesta();
			return registrarError(expedienteId, tareaId, usuContr, resultado, mensaje, operacion);
		}

		resultado.setExito(true);
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());
		resultado.setCodigoRespuesta(soapResponse.getCodigoRespuesta());
		resultado.setDescripcionRespuesta(soapResponse.getDescripcionRespuesta());
		resultado.setIdentificadorEni(soapResponse.getIdentificador());
		resultado.setCsv(soapResponse.getCsv());
		registrarExito(expedienteId, tareaId, usuContr, resultado, operacion);
		return resultado;
	}

	private Long resolverExpedienteId(TareaTramiteExpediente tarea) {
		if (tarea.getTramite() == null) {
			return null;
		}

		Tramite tramite = tramiteService.findById(tarea.getTramite());
		if (tramite == null) {
			return null;
		}

		return tramite.getExpediente();
	}

	private void registrarExito(Long expedienteId, Long tareaId, String usuContr,
			InsideEnvioResultadoDto resultado, String operacion) {
		InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
		request.setIdExpediente(expedienteId);
		request.setIdTarea(tareaId);
		request.setOperacion(operacion);
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
	}

	private InsideEnvioResultadoDto registrarError(Long expedienteId, Long tareaId, String usuContr,
			InsideEnvioResultadoDto resultado, String mensaje, String operacion) {
		resultado.setExito(false);
		resultado.setMensajeError(mensaje);

		if (expedienteId != null) {
			InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
			request.setIdExpediente(expedienteId);
			request.setIdTarea(tareaId);
			request.setOperacion(operacion);
			request.setEstadoEnvio(GfEnvioInside.ESTADO_ERROR);
			request.setMensajeError(mensaje);
			request.setModoDryRun(insideSoapClientService.isModoDryRun());
			request.setUsuContr(usuContr);
			insideEnvioService.registrar(request);
		}

		return resultado;
	}
}
