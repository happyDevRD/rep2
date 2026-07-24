package com.greenaall.inside.controllers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inside/soap")
public class InsideProxyController {

	private static final String SERVICE_INSIDE_WS = "insideWs";
	private static final String SERVICE_GINSIDE_WS = "gInsideWs";
	private static final String SERVICE_PUNTO_REMISION_WS = "puntoRemisionWs";

	@Value("${inside.soap.inside-ws-url:https://se-e-inside.redsara.es/inside/services/InsideWSService}")
	private String insideWsUrl;

	@Value("${inside.soap.ginside-ws-url:https://se-e-inside.redsara.es/inside/services/GInsideWSService}")
	private String gInsideWsUrl;

	@Value("${inside.soap.punto-remision-ws-url:https://se-e-inside.redsara.es/inside/services/PuntoRemisionWebService}")
	private String puntoRemisionWsUrl;

	@Value("${inside.soap.dry-run:false}")
	private boolean dryRun;

	@PostMapping(
		value = "/{serviceType}",
		consumes = MediaType.TEXT_XML_VALUE,
		produces = MediaType.TEXT_XML_VALUE
	)
	public ResponseEntity<String> invokeSoap(
			@PathVariable String serviceType,
			@RequestHeader(value = "SOAPAction", required = false) String soapAction,
			@RequestBody String envelope) throws Exception {

		if (dryRun) {
			String operation = resolveOperation(soapAction, envelope);
			return ResponseEntity.ok(InsideSoapDryRunResponseBuilder.build(operation));
		}

		String targetUrl = resolveTargetUrl(serviceType);
		HttpClient client = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(30))
				.build();

		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
				.uri(URI.create(targetUrl))
				.timeout(Duration.ofMinutes(5))
				.header("Content-Type", "text/xml; charset=utf-8")
				.POST(HttpRequest.BodyPublishers.ofString(envelope));

		if (soapAction != null && !soapAction.isBlank()) {
			requestBuilder.header("SOAPAction", soapAction);
		}

		HttpResponse<String> response = client.send(requestBuilder.build(), HttpResponse.BodyHandlers.ofString());
		return ResponseEntity.status(response.statusCode()).body(response.body());
	}

	@PostMapping("/health")
	public ResponseEntity<String> health() {
		return ResponseEntity.ok("INSIDE proxy operativo");
	}

	private String resolveTargetUrl(String serviceType) {
		return switch (serviceType) {
			case SERVICE_GINSIDE_WS -> gInsideWsUrl;
			case SERVICE_PUNTO_REMISION_WS -> puntoRemisionWsUrl;
			case SERVICE_INSIDE_WS -> insideWsUrl;
			default -> throw new IllegalArgumentException("Servicio INSIDE no soportado: " + serviceType);
		};
	}

	private String resolveOperation(String soapAction, String envelope) {
		if (soapAction != null && !soapAction.isBlank()) {
			String normalized = soapAction.replace("\"", "").trim();
			int lastSlash = normalized.lastIndexOf('/');
			if (lastSlash >= 0 && lastSlash < normalized.length() - 1) {
				return normalized.substring(lastSlash + 1);
			}
		}

		int bodyStart = envelope.indexOf(":Body>");
		if (bodyStart < 0) {
			return "inside";
		}

		int tagStart = envelope.indexOf('<', bodyStart + 6);
		if (tagStart < 0) {
			return "inside";
		}

		int tagEnd = envelope.indexOf('>', tagStart);
		if (tagEnd < 0) {
			return "inside";
		}

		String tag = envelope.substring(tagStart + 1, tagEnd);
		int colon = tag.indexOf(':');
		if (colon >= 0) {
			tag = tag.substring(colon + 1);
		}

		return tag;
	}
}
