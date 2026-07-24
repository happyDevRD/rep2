package com.greenaall.inside.controllers;

public final class InsideSoapDryRunResponseBuilder {

	private InsideSoapDryRunResponseBuilder() {
	}

	public static String build(String operation) {
		long timestamp = System.currentTimeMillis();
		String identificador = "MOCK-INSIDE-" + operation + "-" + timestamp;
		String csv = "MOCK-CSV-" + timestamp;
		String codigoAtea = "MOCK-ATEA-" + timestamp;
		String responseElement = capitalize(operation) + "Response";

		String extraFields = "";
		if ("remisionAJusticia".equals(operation) || "consultaEstadoRemisionAJusticia".equals(operation)) {
			extraFields = "<codigoEnvioATEA>" + codigoAtea + "</codigoEnvioATEA>"
					+ "<estadoRemision>ENVIADO_SIMULADO</estadoRemision>";
		}

		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "<soap:Body>"
				+ "<ns2:" + responseElement + " xmlns:ns2=\"https://sede.administracion.gob.es/ws/inside/v1\">"
				+ "<codigoRespuesta>00</codigoRespuesta>"
				+ "<descripcionRespuesta>Operación simulada (dry-run) — sin acceso a REDSARA</descripcionRespuesta>"
				+ "<identificador>" + identificador + "</identificador>"
				+ "<csv>" + csv + "</csv>"
				+ extraFields
				+ "</ns2:" + responseElement + ">"
				+ "</soap:Body>"
				+ "</soap:Envelope>";
	}

	private static String capitalize(String value) {
		if (value == null || value.isBlank()) {
			return "Inside";
		}
		return value.substring(0, 1).toUpperCase() + value.substring(1);
	}
}
