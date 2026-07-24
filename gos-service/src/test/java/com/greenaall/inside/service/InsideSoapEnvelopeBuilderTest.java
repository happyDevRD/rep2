package com.greenaall.inside.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.greenaall.inside.dto.InsideAltaDocumentoEniSoapDto;
import com.greenaall.inside.dto.InsideConvertirExpedienteSoapDto;
import com.greenaall.inside.dto.InsideDocumentoIndizadoSoapDto;
import com.greenaall.inside.mapper.InsideEniConstants;

class InsideSoapEnvelopeBuilderTest {

	private final InsideSoapEnvelopeBuilder builder = new InsideSoapEnvelopeBuilder();

	@Test
	void buildAltaDocumentoEniXmlEnvelope_contieneOperacion() {
		String envelope = builder.buildAltaDocumentoEniXmlEnvelope("QkFTRTY0");
		assertTrue(envelope.contains("altaDocumentoEniXml"));
		assertTrue(envelope.contains("QkFTRTY0"));
	}

	@Test
	void buildAltaDocumentoEniEnvelope_contieneMetadatos() {
		InsideAltaDocumentoEniSoapDto dto = new InsideAltaDocumentoEniSoapDto();
		dto.setValorBinario("QkFTRTY0");
		dto.setNombreFormato("PDF");
		dto.setVersionNti(InsideEniConstants.VERSION_NTI_DOCUMENTO);
		dto.setIdentificador("ES_L12345678_2026_0000001");
		dto.setOrgano("L12345678");
		dto.setFechaCaptura("2026-07-03");
		dto.setOrigenCiudadanoAdministracion(false);
		dto.setEstadoElaboracion(InsideEniConstants.ESTADO_ELABORACION_ORIGINAL);
		dto.setTipoDocumental("TD01");
		dto.setFirmaServidor(false);

		String envelope = builder.buildAltaDocumentoEniEnvelope(dto);
		assertTrue(envelope.contains("altaDocumentoEni"));
		assertTrue(envelope.contains("ValorBinario"));
		assertTrue(envelope.contains("ES_L12345678_2026_0000001"));
	}

	@Test
	void buildConsultaEstadoRemisionEnvelope_contieneCodigoAtea() {
		String envelope = builder.buildConsultaEstadoRemisionEnvelope("ATEA-123");
		assertTrue(envelope.contains("consultaEstadoRemisionAJusticia"));
		assertTrue(envelope.contains("ATEA-123"));
	}

	@Test
	void escapeXml_escapaCaracteresEspeciales() {
		String escaped = builder.escapeXml("a&b<c>\"d'e");
		assertTrue(escaped.contains("&amp;"));
		assertTrue(escaped.contains("&lt;"));
		assertTrue(escaped.contains("&gt;"));
		assertTrue(escaped.contains("&quot;"));
		assertTrue(escaped.contains("&apos;"));
	}

	@Test
	void buildAltaDocumentoEniXmlEnvelope_escapaContenidoPeligroso() {
		String envelope = builder.buildAltaDocumentoEniXmlEnvelope("A&B<C>");
		assertTrue(envelope.contains("A&amp;B&lt;C&gt;"));
		assertTrue(!envelope.contains("A&B<C>"));
	}

	@Test
	void buildConvertirExpedienteAEniConMAdicionalesEnvelope_contieneIndice() {
		InsideConvertirExpedienteSoapDto dto = new InsideConvertirExpedienteSoapDto();
		dto.setVersionNti(InsideEniConstants.VERSION_NTI_EXPEDIENTE);
		dto.setIdentificador("ES_L12345678_2026_EXP_0000001");
		dto.setOrgano("L12345678");
		dto.setFechaAperturaExpediente("2026-01-01");
		dto.setClasificacion("12345");
		dto.setEstado(InsideEniConstants.ESTADO_EXPEDIENTE_CERRADO);
		dto.setFechaIndiceElectronico("2026-07-03");

		var documento = new InsideDocumentoIndizadoSoapDto();
		documento.setIdentificadorDocumento("ES_L12345678_2026_0000001");
		documento.setValorHuella("HUELLA");
		documento.setFuncionResumen(InsideEniConstants.FUNCION_RESUMEN_SHA256);
		documento.setOrdenDocumentoExpediente("0001");
		dto.setDocumentosIndizados(java.util.List.of(documento));

		String envelope = builder.buildConvertirExpedienteAEniConMAdicionalesEnvelope(dto);
		assertTrue(envelope.contains("convertirExpedienteAEniConMAdicionales"));
		assertTrue(envelope.contains("DocumentoIndizado"));
	}
}
