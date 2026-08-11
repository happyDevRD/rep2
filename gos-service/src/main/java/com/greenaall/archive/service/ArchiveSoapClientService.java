package com.greenaall.archive.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.greenaall.archive.controllers.ArchiveSoapDryRunResponseBuilder;

@Service
public class ArchiveSoapClientService {

	@Value("${archive.soap.ws-url:https://se-archive.redsara.es/archive/services/soap/ArchiveMtomSecurityWebService}")
	private String archiveWsUrl;

	@Value("${archive.soap.dry-run:false}")
	private boolean modoDryRun;

	@Autowired
	private ArchiveSoapResponseParser archiveSoapResponseParser;

	@Autowired
	private ArchiveSoapHttpClientFactory archiveSoapHttpClientFactory;

	public ArchiveSoapParsedResponse invoke(String operation, String soapAction, String envelope,
			String identificadorDryRun) throws Exception {
		String rawXml;
		if (modoDryRun) {
			rawXml = ArchiveSoapDryRunResponseBuilder.build(operation, identificadorDryRun);
		} else {
			rawXml = postSoap(archiveWsUrl, soapAction, envelope);
		}

		return archiveSoapResponseParser.parse(rawXml);
	}

	private String postSoap(String targetUrl, String soapAction, String envelope) throws Exception {
		HttpClient client = archiveSoapHttpClientFactory.createClient();

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
			throw new IllegalStateException("ARCHIVE respondió con código HTTP " + response.statusCode());
		}

		return response.body();
	}

	public String resolveArchiveWsUrl() {
		return archiveWsUrl;
	}

	public boolean isModoDryRun() {
		return modoDryRun;
	}
}
