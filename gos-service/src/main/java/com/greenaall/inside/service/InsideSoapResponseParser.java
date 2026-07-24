package com.greenaall.inside.service;

import org.springframework.stereotype.Service;

@Service
public class InsideSoapResponseParser {

	public InsideSoapParsedResponse parse(String rawXml) {
		InsideSoapParsedResponse response = new InsideSoapParsedResponse();
		response.setRawXml(rawXml);

		if (rawXml == null || rawXml.isBlank()) {
			response.setFaultString("Respuesta SOAP vacía de INSIDE.");
			return response;
		}

		String faultString = extractTag(rawXml, "faultstring");
		if (faultString != null && !faultString.isBlank()) {
			response.setFaultString(faultString);
			return response;
		}

		response.setCodigoRespuesta(extractTag(rawXml, "codigoRespuesta"));
		response.setDescripcionRespuesta(extractTag(rawXml, "descripcionRespuesta"));
		response.setIdentificador(extractTag(rawXml, "identificador"));
		response.setCsv(extractTag(rawXml, "csv"));
		response.setCodigoEnvioAtea(extractTag(rawXml, "codigoEnvioATEA"));
		response.setEstadoRemision(extractTag(rawXml, "estadoRemision"));
		return response;
	}

	private String extractTag(String xml, String tag) {
		String[] patterns = new String[] {
				"<" + tag + ">",
				"<ns2:" + tag + ">",
				"<web:" + tag + ">"
		};

		for (String open : patterns) {
			String close = open.replace("<", "</");
			int start = xml.indexOf(open);
			int end = xml.indexOf(close);
			if (start >= 0 && end > start) {
				return xml.substring(start + open.length(), end).trim();
			}
		}

		return null;
	}
}
