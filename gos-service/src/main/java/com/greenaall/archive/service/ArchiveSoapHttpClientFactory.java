package com.greenaall.archive.service;

import java.io.FileInputStream;
import java.net.http.HttpClient;
import java.security.KeyStore;
import java.time.Duration;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ArchiveSoapHttpClientFactory {

	@Value("${archive.soap.mtls.enabled:false}")
	private boolean mtlsEnabled;

	@Value("${archive.soap.mtls.keystore-path:}")
	private String keystorePath;

	@Value("${archive.soap.mtls.keystore-password:}")
	private String keystorePassword;

	@Value("${archive.soap.mtls.keystore-type:PKCS12}")
	private String keystoreType;

	@Value("${archive.soap.mtls.truststore-path:}")
	private String truststorePath;

	@Value("${archive.soap.mtls.truststore-password:}")
	private String truststorePassword;

	@Value("${archive.soap.mtls.truststore-type:PKCS12}")
	private String truststoreType;

	public HttpClient createClient() throws Exception {
		HttpClient.Builder builder = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(30));

		if (mtlsEnabled) {
			builder.sslContext(buildSslContext());
		}

		return builder.build();
	}

	public boolean isMtlsEnabled() {
		return mtlsEnabled;
	}

	private SSLContext buildSslContext() throws Exception {
		if (keystorePath == null || keystorePath.isBlank()) {
			throw new IllegalStateException(
					"archive.soap.mtls.enabled=true requiere archive.soap.mtls.keystore-path");
		}

		KeyStore keyStore = KeyStore.getInstance(keystoreType);
		try (FileInputStream keyStoreStream = new FileInputStream(keystorePath)) {
			char[] password = keystorePassword != null ? keystorePassword.toCharArray() : new char[0];
			keyStore.load(keyStoreStream, password);
		}

		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		char[] keyPassword = keystorePassword != null ? keystorePassword.toCharArray() : new char[0];
		keyManagerFactory.init(keyStore, keyPassword);

		TrustManagerFactory trustManagerFactory = TrustManagerFactory
				.getInstance(TrustManagerFactory.getDefaultAlgorithm());

		if (truststorePath != null && !truststorePath.isBlank()) {
			KeyStore trustStore = KeyStore.getInstance(truststoreType);
			try (FileInputStream trustStoreStream = new FileInputStream(truststorePath)) {
				char[] trustPassword = truststorePassword != null ? truststorePassword.toCharArray() : new char[0];
				trustStore.load(trustStoreStream, trustPassword);
			}
			trustManagerFactory.init(trustStore);
		} else {
			trustManagerFactory.init((KeyStore) null);
		}

		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), null);
		return sslContext;
	}
}
