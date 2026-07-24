package com.greenaall.inside.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.greenaall.inside.controllers.InsideSoapDryRunResponseBuilder;

@Service
public class InsideSoapClientService {

	@Value("${inside.soap.inside-ws-url:https://se-e-inside.redsara.es/inside/services/InsideWSService}")
	private String insideWsUrl;

	@Value("${inside.soap.ginside-ws-url:https://se-e-inside.redsara.es/inside/services/GInsideWSService}")
	private String gInsideWsUrl;

	@Value("${inside.soap.punto-remision-ws-url:https://se-e-inside.redsara.es/inside/services/PuntoRemisionWebService}")
	private String puntoRemisionWsUrl;

	@Value("${inside.soap.dry-run:false}")
	private boolean modoDryRun;

	@Autowired
	private InsideSoapResponseParser insideSoapResponseParser;

	@Autowired
	private InsideSoapHttpClientFactory insideSoapHttpClientFactory;

	public InsideSoapParsedResponse invokeInsideWs(String operation, String soapAction, String envelope) throws Exception {
		return invoke(resolveInsideWsUrl(), operation, soapAction, envelope);
	}

	public InsideSoapParsedResponse invokeGInsideWs(String operation, String soapAction, String envelope)
			throws Exception {
		return invoke(resolveGInsideWsUrl(), operation, soapAction, envelope);
	}

	public InsideSoapParsedResponse invokePuntoRemisionWs(String operation, String soapAction, String envelope)
			throws Exception {
		return invoke(resolvePuntoRemisionWsUrl(), operation, soapAction, envelope);
	}

	public InsideSoapParsedResponse invoke(String targetUrl, String operation, String soapAction, String envelope)
			throws Exception {
		String rawXml;
		if (modoDryRun) {
			rawXml = InsideSoapDryRunResponseBuilder.build(operation);
		} else {
			rawXml = postSoap(targetUrl, soapAction, envelope);
		}

		return insideSoapResponseParser.parse(rawXml);
	}

	private String postSoap(String targetUrl, String soapAction, String envelope) throws Exception {
		HttpClient client = insideSoapHttpClientFactory.createClient();

		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
				.uri(URI.create(targetUrl))
				.timeout(Duration.ofMinutes(5))
				.header("Content-Type", "text/xml; charset=utf-8")
				.POST(HttpRequest.BodyPublishers.ofString(envelope));

		if (soapAction != null && !soapAction.isBlank()) {
			requestBuilder.header("SOAPAction", "\"" + soapAction + "\"");
		}

		HttpResponse<String> response = client.send(requestBuilder.build(), HttpResponse.BodyHandlers.ofString());
		if (response.statusCode() >= 400) {
			throw new IllegalStateException("INSIDE respondió con código HTTP " + response.statusCode());
		}

		return response.body();
	}

	public String resolveInsideWsUrl() {
		return insideWsUrl;
	}

	public String resolveGInsideWsUrl() {
		return gInsideWsUrl;
	}

	public String resolvePuntoRemisionWsUrl() {
		return puntoRemisionWsUrl;
	}

	public boolean isModoDryRun() {
		return modoDryRun;
	}
}
