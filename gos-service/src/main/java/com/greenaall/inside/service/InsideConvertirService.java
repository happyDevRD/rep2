package com.greenaall.inside.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsideConvertirContextDto;
import com.greenaall.inside.dto.InsideConvertirDocumentoSoapDto;
import com.greenaall.inside.dto.InsideConvertirExpedienteSoapDto;
import com.greenaall.inside.dto.InsideEnvioResultadoDto;
import com.greenaall.inside.dto.InsideMetadatoAdicionalDto;
import com.greenaall.inside.dto.InsideRegistrarEnvioRequest;
import com.greenaall.inside.dto.InsideTareaDocumentoContextDto;
import com.greenaall.inside.mapper.InsideIflowMapper;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.gf.entity.GfEnvioInside;

@Service
public class InsideConvertirService {

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	@Autowired
	private TramiteServiceImpl tramiteService;

	@Autowired
	private InsideConvertirContextService insideConvertirContextService;

	@Autowired
	private InsideSoapEnvelopeBuilder insideSoapEnvelopeBuilder;

	@Autowired
	private InsideSoapClientService insideSoapClientService;

	@Autowired
	private InsideEnvioService insideEnvioService;

	public InsideEnvioResultadoDto enviarConvertirExpediente(Long expedienteId, String usuContr) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			InsideConvertirContextDto context = insideConvertirContextService.cargarContexto(expedienteId);
			if (context.getDocumentos().isEmpty()) {
				return registrarError(expedienteId, null, usuContr, resultado,
						"No hay documentos convertibles en el expediente.", InsideEnvioService.OPERACION_CONVERTIR_EXPEDIENTE);
			}

			InsideConvertirExpedienteSoapDto soapDto = InsideIflowMapper.mapExpedienteToConvertirExpediente(context, true);
			String envelope = insideSoapEnvelopeBuilder.buildConvertirExpedienteAEniConMAdicionalesEnvelope(soapDto);
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeGInsideWs(
					"convertirExpedienteAEniConMAdicionales",
					insideSoapEnvelopeBuilder.buildSoapActionConvertirExpedienteAEniConMAdicionales(),
					envelope);

			return procesarRespuesta(expedienteId, null, usuContr, resultado, soapResponse,
					InsideEnvioService.OPERACION_CONVERTIR_EXPEDIENTE);
		} catch (Exception e) {
			return registrarError(expedienteId, null, usuContr, resultado, e.getMessage(),
					InsideEnvioService.OPERACION_CONVERTIR_EXPEDIENTE);
		}
	}

	public InsideEnvioResultadoDto enviarConvertirDocumentoTarea(Long tareaId, String usuContr) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			TareaTramiteExpediente tarea = tareaTramiteExpedienteService.findById(tareaId);
			if (tarea == null) {
				return registrarError(null, tareaId, usuContr, resultado, "Tarea no encontrada.",
						InsideEnvioService.OPERACION_CONVERTIR_DOCUMENTO);
			}

			Long expedienteId = resolverExpedienteId(tarea);
			if (expedienteId == null) {
				return registrarError(null, tareaId, usuContr, resultado, "No se pudo resolver el expediente de la tarea.",
						InsideEnvioService.OPERACION_CONVERTIR_DOCUMENTO);
			}

			InsideTareaDocumentoContextDto documento = insideConvertirContextService
					.cargarDocumentoTarea(expedienteId, tareaId);
			if (documento == null) {
				return registrarError(expedienteId, tareaId, usuContr, resultado,
						"No se pudo preparar el documento de la tarea.",
						InsideEnvioService.OPERACION_CONVERTIR_DOCUMENTO);
			}

			InsideConvertirContextDto context = insideConvertirContextService.cargarContexto(expedienteId);
			int ejercicio = context.getExpediente().getEjercicio() != null
					? context.getExpediente().getEjercicio().intValue()
					: java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
			InsideConvertirDocumentoSoapDto soapDto = InsideIflowMapper.mapTareaToConvertirDocumento(
					documento, context.getOrganoDir3(), ejercicio, false);
			if (soapDto == null) {
				return registrarError(expedienteId, tareaId, usuContr, resultado,
						"El documento no tiene contenido descargable.",
						InsideEnvioService.OPERACION_CONVERTIR_DOCUMENTO);
			}

			List<InsideMetadatoAdicionalDto> metadatosAdicionales = InsideIflowMapper
					.mapAtributosToMetadatosAdicionales(context.getAtributos());
			soapDto.setMetadatosAdicionales(metadatosAdicionales);

			String envelope = insideSoapEnvelopeBuilder.buildConvertirDocumentoAEniConMAdicionalesEnvelope(soapDto);
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeGInsideWs(
					"convertirDocumentoAEniConMAdicionales",
					insideSoapEnvelopeBuilder.buildSoapActionConvertirDocumentoAEniConMAdicionales(),
					envelope);

			return procesarRespuesta(expedienteId, tareaId, usuContr, resultado, soapResponse,
					InsideEnvioService.OPERACION_CONVERTIR_DOCUMENTO);
		} catch (Exception e) {
			return registrarError(null, tareaId, usuContr, resultado, e.getMessage(),
					InsideEnvioService.OPERACION_CONVERTIR_DOCUMENTO);
		}
	}

	public List<InsideEnvioResultadoDto> enviarConvertirDocumentosExpediente(Long expedienteId, String usuContr) {
		List<InsideEnvioResultadoDto> resultados = new ArrayList<>();

		try {
			InsideConvertirContextDto context = insideConvertirContextService.cargarContexto(expedienteId);
			for (InsideTareaDocumentoContextDto documento : context.getDocumentos()) {
				resultados.add(enviarConvertirDocumentoTarea(documento.getTarea().getId(), usuContr));
			}
		} catch (Exception e) {
			InsideEnvioResultadoDto error = new InsideEnvioResultadoDto();
			error.setExito(false);
			error.setMensajeError(e.getMessage());
			error.setModoDryRun(insideSoapClientService.isModoDryRun());
			resultados.add(error);
		}

		return resultados;
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

	private void registrarExito(Long expedienteId, Long tareaId, String usuContr, InsideEnvioResultadoDto resultado,
			String operacion) {
		if (expedienteId == null) {
			return;
		}

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
