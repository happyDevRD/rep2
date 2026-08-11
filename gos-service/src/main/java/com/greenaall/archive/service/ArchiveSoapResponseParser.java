package com.greenaall.archive.service;

import org.springframework.stereotype.Service;

import com.greenaall.archive.dto.ArchiveIdentificadorDto;

@Service
public class ArchiveSoapResponseParser {

	public ArchiveSoapParsedResponse parse(String rawXml) {
		ArchiveSoapParsedResponse response = new ArchiveSoapParsedResponse();
		response.setRawXml(rawXml);

		if (rawXml == null || rawXml.isBlank()) {
			response.setFaultString("Respuesta SOAP vacía de ARCHIVE.");
			return response;
		}

		String faultString = extractTag(rawXml, "faultstring");
		if (faultString != null && !faultString.isBlank()) {
			response.setFaultString(faultString);
			return response;
		}

		response.setRetorno(extractTag(rawXml, "retorno"));
		response.setCodigoError(extractTag(rawXml, "codigo"));
		response.setDescripcionError(extractTag(rawXml, "descripcion"));

		int index = 0;
		while (true) {
			String bloque = extractTagOccurrence(rawXml, "identificador", index);
			if (bloque == null) {
				break;
			}
			ArchiveIdentificadorDto identificador = new ArchiveIdentificadorDto();
			identificador.setDirectorio(extractTag(bloque, "directorio"));
			identificador.setIdentificadorExpedienteEni(extractTag(bloque, "identificadorExpedienteENI"));
			response.getIdentificadores().add(identificador);
			index++;
		}

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

	private String extractTagOccurrence(String xml, String tag, int occurrence) {
		String[] patterns = new String[] {
				"<" + tag + ">",
				"<ns2:" + tag + ">",
				"<web:" + tag + ">"
		};

		for (String open : patterns) {
			String close = open.replace("<", "</");
			int fromIndex = 0;
			for (int i = 0; i <= occurrence; i++) {
				int start = xml.indexOf(open, fromIndex);
				if (start < 0) {
					break;
				}
				int end = xml.indexOf(close, start);
				if (end < 0) {
					break;
				}
				if (i == occurrence) {
					return xml.substring(start + open.length(), end);
				}
				fromIndex = end + close.length();
			}
		}

		return null;
	}
}
