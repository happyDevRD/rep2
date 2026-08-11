package com.greenaall.archive.service;

import org.springframework.stereotype.Service;

import com.greenaall.archive.dto.ArchiveGenerarSipRequestDto;

@Service
public class ArchiveSoapEnvelopeBuilder {

	private static final String SOAP_ENV_NS = "http://schemas.xmlsoap.org/soap/envelope/";
	// Namespace provisional: la documentación en texto no incluye el WSDL con los
	// namespaces exactos. Confirmar contra el WSDL real de Servicios Estables antes
	// del primer envío no-dry-run.
	private static final String WEB_NS = "https://se-archive.redsara.es/archive/services/soap";

	public String buildGenerarYPreingresarSIPIdentificadoresEnvelope(String idAplicacion,
			ArchiveGenerarSipRequestDto request) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:generarYPreingresarSIPIdentificadores>");

		if (idAplicacion != null && !idAplicacion.isBlank()) {
			envelope.append("<aplication>");
			envelope.append("<idaplicacion>").append(escapeXml(idAplicacion)).append("</idaplicacion>");
			envelope.append("</aplication>");
		}

		envelope.append("<sipRequest>");
		envelope.append("<identificadorArchivoDestino>")
				.append(escapeXml(request.getIdentificadorArchivoDestino()))
				.append("</identificadorArchivoDestino>");

		envelope.append("<filesToConvert>");
		envelope.append("<valorBinario>").append(request.getZipBase64()).append("</valorBinario>");
		envelope.append("<mime>").append(escapeXml(request.getMime())).append("</mime>");
		envelope.append("<huellaDigital>").append(escapeXml(request.getHuellaDigital())).append("</huellaDigital>");
		envelope.append("<algoritmoHuella>").append(escapeXml(request.getAlgoritmoHuella()))
				.append("</algoritmoHuella>");
		envelope.append("</filesToConvert>");

		envelope.append("<metadataEni>");
		envelope.append("<metadataExpedient>");
		envelope.append("<clasificacion>").append(escapeXml(request.getClasificacion())).append("</clasificacion>");
		envelope.append("<fechaApertura>").append(escapeXml(request.getFechaApertura())).append("</fechaApertura>");
		envelope.append("<fechaFin>").append(escapeXml(request.getFechaFin())).append("</fechaFin>");
		envelope.append("<organo>").append(escapeXml(request.getOrganoExpediente())).append("</organo>");
		envelope.append("<interesado>").append(escapeXml(request.getInteresado())).append("</interesado>");
		envelope.append("</metadataExpedient>");
		envelope.append("<metadataDocument>");
		envelope.append("<origen>").append(escapeXml(request.getOrigen())).append("</origen>");
		envelope.append("<estadoElaboracion>").append(escapeXml(request.getEstadoElaboracion()))
				.append("</estadoElaboracion>");
		envelope.append("<tipoDocumental>").append(escapeXml(request.getTipoDocumental())).append("</tipoDocumental>");
		envelope.append("<organo>").append(escapeXml(request.getOrganoDocumento())).append("</organo>");
		envelope.append("<fechaCaptura>").append(escapeXml(request.getFechaCaptura())).append("</fechaCaptura>");
		envelope.append("</metadataDocument>");
		envelope.append("</metadataEni>");

		envelope.append("</sipRequest>");
		envelope.append("</web:generarYPreingresarSIPIdentificadores>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionGenerarYPreingresarSIPIdentificadores() {
		return WEB_NS + "/generarYPreingresarSIPIdentificadores";
	}

	String escapeXml(String value) {
		if (value == null) {
			return "";
		}

		return value
				.replace("&", "&amp;")
				.replace("<", "&lt;")
				.replace(">", "&gt;")
				.replace("\"", "&quot;")
				.replace("'", "&apos;");
	}
}
