package com.greenaall.archive.controllers;

public final class ArchiveSoapDryRunResponseBuilder {

	private ArchiveSoapDryRunResponseBuilder() {
	}

	public static String build(String operation, String identificador) {
		long timestamp = System.currentTimeMillis();
		String identificadorEni = "MOCK-ARCHIVE-ENI-" + timestamp;
		String responseElement = capitalize(operation) + "Response";

		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "<soap:Body>"
				+ "<ns2:" + responseElement + " xmlns:ns2=\"https://se-archive.redsara.es/archive/services/soap\">"
				+ "<retorno>OK</retorno>"
				+ "<identificadores>"
				+ "<identificador>"
				+ "<directorio>" + identificador + "</directorio>"
				+ "<identificadorExpedienteENI>" + identificadorEni + "</identificadorExpedienteENI>"
				+ "</identificador>"
				+ "</identificadores>"
				+ "</ns2:" + responseElement + ">"
				+ "</soap:Body>"
				+ "</soap:Envelope>";
	}

	private static String capitalize(String value) {
		if (value == null || value.isBlank()) {
			return "Archive";
		}
		return value.substring(0, 1).toUpperCase() + value.substring(1);
	}
}
