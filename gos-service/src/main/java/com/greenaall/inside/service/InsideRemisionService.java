package com.greenaall.inside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsideConsultaRemisionRequestDto;
import com.greenaall.inside.dto.InsideEnvioResultadoDto;
import com.greenaall.inside.dto.InsideRegistrarEnvioRequest;
import com.greenaall.inside.dto.InsideRemisionRequestDto;
import com.greenaall.models.gf.entity.GfEnvioInside;

@Service
public class InsideRemisionService {

	@Autowired
	private InsideSoapEnvelopeBuilder insideSoapEnvelopeBuilder;

	@Autowired
	private InsideSoapClientService insideSoapClientService;

	@Autowired
	private InsideEnvioService insideEnvioService;

	public InsideEnvioResultadoDto enviarRemisionAJusticia(InsideRemisionRequestDto request) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			validarRemision(request);

			String envelope = insideSoapEnvelopeBuilder.buildRemisionAJusticiaEnvelope(request);
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeInsideWs(
					"remisionAJusticia",
					insideSoapEnvelopeBuilder.buildSoapActionRemisionAJusticia(),
					envelope);

			return procesarRespuesta(
					request.getIdExpediente(),
					InsideEnvioService.OPERACION_REMISION_JUSTICIA,
					request.getUsuContr(),
					resultado,
					soapResponse);
		} catch (Exception e) {
			return registrarError(
					request.getIdExpediente(),
					InsideEnvioService.OPERACION_REMISION_JUSTICIA,
					request.getUsuContr(),
					resultado,
					e.getMessage());
		}
	}

	public InsideEnvioResultadoDto consultarEstadoRemision(InsideConsultaRemisionRequestDto request) {
		InsideEnvioResultadoDto resultado = new InsideEnvioResultadoDto();
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());

		try {
			if (request.getCodigoEnvioATEA() == null || request.getCodigoEnvioATEA().isBlank()) {
				return registrarError(
						request.getIdExpediente(),
						InsideEnvioService.OPERACION_CONSULTA_REMISION,
						request.getUsuContr(),
						resultado,
						"El código de envío ATEA es obligatorio.");
			}

			String envelope = insideSoapEnvelopeBuilder
					.buildConsultaEstadoRemisionEnvelope(request.getCodigoEnvioATEA());
			InsideSoapParsedResponse soapResponse = insideSoapClientService.invokeInsideWs(
					"consultaEstadoRemisionAJusticia",
					insideSoapEnvelopeBuilder.buildSoapActionConsultaEstadoRemision(),
					envelope);

			return procesarRespuesta(
					request.getIdExpediente(),
					InsideEnvioService.OPERACION_CONSULTA_REMISION,
					request.getUsuContr(),
					resultado,
					soapResponse);
		} catch (Exception e) {
			return registrarError(
					request.getIdExpediente(),
					InsideEnvioService.OPERACION_CONSULTA_REMISION,
					request.getUsuContr(),
					resultado,
					e.getMessage());
		}
	}

	private void validarRemision(InsideRemisionRequestDto request) {
		if (request.getIdexpEni() == null || request.getIdexpEni().isBlank()) {
			throw new IllegalArgumentException("El identificador ENI del expediente es obligatorio.");
		}

		if (request.getDir3Juzgado() == null || request.getDir3Juzgado().isBlank()) {
			throw new IllegalArgumentException("El DIR3 del juzgado es obligatorio.");
		}

		if (request.getDatosRemisionJusticia() == null) {
			throw new IllegalArgumentException("Los datos de remisión son obligatorios.");
		}

		if (request.getDatosRemisionJusticia().getDir3Remitente() == null
				|| request.getDatosRemisionJusticia().getDir3Remitente().isBlank()) {
			throw new IllegalArgumentException("El DIR3 remitente es obligatorio.");
		}

		if (request.getDatosRemisionJusticia().getNig() == null
				|| request.getDatosRemisionJusticia().getNig().isBlank()) {
			throw new IllegalArgumentException("El NIG es obligatorio.");
		}
	}

	private InsideEnvioResultadoDto procesarRespuesta(
			Long idExpediente,
			String operacion,
			String usuContr,
			InsideEnvioResultadoDto resultado,
			InsideSoapParsedResponse soapResponse) {
		if (soapResponse.hasFault()) {
			return registrarError(idExpediente, operacion, usuContr, resultado, soapResponse.getFaultString());
		}

		if (!soapResponse.isSuccess()) {
			String mensaje = soapResponse.getDescripcionRespuesta() != null
					? soapResponse.getDescripcionRespuesta()
					: "INSIDE devolvió código " + soapResponse.getCodigoRespuesta();
			return registrarError(idExpediente, operacion, usuContr, resultado, mensaje);
		}

		resultado.setExito(true);
		resultado.setModoDryRun(insideSoapClientService.isModoDryRun());
		resultado.setCodigoRespuesta(soapResponse.getCodigoRespuesta());
		resultado.setDescripcionRespuesta(soapResponse.getDescripcionRespuesta());
		resultado.setIdentificadorEni(soapResponse.getIdentificador());
		resultado.setCsv(soapResponse.getCsv());
		resultado.setCodigoEnvioATEA(soapResponse.getCodigoEnvioAtea());
		resultado.setEstadoRemision(soapResponse.getEstadoRemision());
		registrarExito(idExpediente, operacion, usuContr, resultado);
		return resultado;
	}

	private void registrarExito(Long idExpediente, String operacion, String usuContr,
			InsideEnvioResultadoDto resultado) {
		if (idExpediente == null) {
			return;
		}

		InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
		request.setIdExpediente(idExpediente);
		request.setOperacion(operacion);
		request.setEstadoEnvio(insideSoapClientService.isModoDryRun()
				? GfEnvioInside.ESTADO_SIMULADO
				: GfEnvioInside.ESTADO_ENVIADO);
		request.setCodigoRespuesta(resultado.getCodigoRespuesta());
		request.setDescripcionRespuesta(resultado.getDescripcionRespuesta());
		request.setIdentificadorEni(resultado.getIdentificadorEni());
		request.setCsv(resultado.getCsv());
		request.setCodigoEnvioAtea(resultado.getCodigoEnvioATEA());
		request.setModoDryRun(insideSoapClientService.isModoDryRun());
		request.setUsuContr(usuContr);
		insideEnvioService.registrar(request);
	}

	private InsideEnvioResultadoDto registrarError(Long idExpediente, String operacion, String usuContr,
			InsideEnvioResultadoDto resultado, String mensaje) {
		resultado.setExito(false);
		resultado.setMensajeError(mensaje);

		if (idExpediente != null) {
			InsideRegistrarEnvioRequest request = new InsideRegistrarEnvioRequest();
			request.setIdExpediente(idExpediente);
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
