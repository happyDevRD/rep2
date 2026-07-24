package com.greenaall.inside.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greenaall.inside.dto.InsideAltaDocumentoEniSoapDto;
import com.greenaall.inside.dto.InsideConvertirDocumentoSoapDto;
import com.greenaall.inside.dto.InsideConvertirExpedienteSoapDto;
import com.greenaall.inside.dto.InsideDatosRemisionJusticiaDto;
import com.greenaall.inside.dto.InsideDocumentoIndizadoSoapDto;
import com.greenaall.inside.dto.InsideMetadatoAdicionalDto;
import com.greenaall.inside.dto.InsideRemisionRequestDto;

@Service
public class InsideSoapEnvelopeBuilder {

	private static final String SOAP_ENV_NS = "http://schemas.xmlsoap.org/soap/envelope/";
	private static final String WEB_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService";
	private static final String EXP_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/expediente-e/expedienteEniFileConDocumentos";
	private static final String DOC_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/documento-e/documentoEniFile";
	private static final String DOC_CONT_NS = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido";
	private static final String DOC_MET_ENI_NS = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos";
	private static final String REM_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/remisionNube";
	private static final String WEB_FILES_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebServiceFiles";
	private static final String DOC_CONV_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/documento-e/conversion";
	private static final String DOC_MET_NS = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos";
	private static final String EXP_CONV_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/expediente-e/conversion";
	private static final String MET_ADIC_NS = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/metadatosAdicionales";

	public String buildAltaExpedienteEniXmlEnvelope(String expedienteEniBytes, List<String> documentosEniBytes) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_NS).append("\"");
		envelope.append(" xmlns:exp=\"").append(EXP_NS).append("\"");
		envelope.append(" xmlns:doc=\"").append(DOC_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:altaExpedienteEniXml><exp:expedienteEniFile>");
		envelope.append("<exp:expedienteEniBytes>").append(escapeXml(expedienteEniBytes)).append("</exp:expedienteEniBytes>");

		for (String documentoEniBytes : documentosEniBytes) {
			envelope.append("<exp:documentosEniFile>");
			envelope.append("<doc:documentoEniBytes>").append(escapeXml(documentoEniBytes)).append("</doc:documentoEniBytes>");
			envelope.append("</exp:documentosEniFile>");
		}

		envelope.append("</exp:expedienteEniFile></web:altaExpedienteEniXml>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionAltaExpedienteEniXml() {
		return WEB_NS + "/altaExpedienteEniXml";
	}

	public String buildAltaDocumentoEniXmlEnvelope(String documentoEniBytes) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_NS).append("\"");
		envelope.append(" xmlns:doc=\"").append(DOC_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:altaDocumentoEniXml><documentoEniFile>");
		envelope.append("<doc:documentoEniBytes>").append(escapeXml(documentoEniBytes)).append("</doc:documentoEniBytes>");
		envelope.append("</documentoEniFile></web:altaDocumentoEniXml>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionAltaDocumentoEniXml() {
		return WEB_NS + "/altaDocumentoEniXml";
	}

	public String buildAltaDocumentoEniEnvelope(InsideAltaDocumentoEniSoapDto dto) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_NS).append("\"");
		envelope.append(" xmlns:con=\"").append(DOC_CONT_NS).append("\"");
		envelope.append(" xmlns:met=\"").append(DOC_MET_ENI_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:altaDocumentoEni><documento>");
		envelope.append("<con:contenido>");
		envelope.append("<con:ValorBinario>").append(escapeXml(dto.getValorBinario())).append("</con:ValorBinario>");
		envelope.append("<con:NombreFormato>").append(escapeXml(dto.getNombreFormato()))
				.append("</con:NombreFormato>");
		envelope.append("</con:contenido>");
		envelope.append("<met:metadatos>");
		envelope.append("<met:VersionNTI>").append(escapeXml(dto.getVersionNti())).append("</met:VersionNTI>");
		envelope.append("<met:Identificador>").append(escapeXml(dto.getIdentificador())).append("</met:Identificador>");
		envelope.append("<met:Organo>").append(escapeXml(dto.getOrgano())).append("</met:Organo>");
		envelope.append("<met:FechaCaptura>").append(escapeXml(dto.getFechaCaptura())).append("</met:FechaCaptura>");
		envelope.append("<met:OrigenCiudadanoAdministracion>").append(dto.isOrigenCiudadanoAdministracion())
				.append("</met:OrigenCiudadanoAdministracion>");
		envelope.append("<met:EstadoElaboracion>");
		envelope.append("<met:ValorEstadoElaboracion>").append(escapeXml(dto.getEstadoElaboracion()))
				.append("</met:ValorEstadoElaboracion>");
		envelope.append("</met:EstadoElaboracion>");
		envelope.append("<met:TipoDocumental>").append(escapeXml(dto.getTipoDocumental()))
				.append("</met:TipoDocumental>");
		envelope.append("</met:metadatos>");
		envelope.append("</documento>");
		envelope.append("<firmaServidor>").append(dto.isFirmaServidor()).append("</firmaServidor>");
		envelope.append("</web:altaDocumentoEni>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionAltaDocumentoEni() {
		return WEB_NS + "/altaDocumentoEni";
	}

	public String buildRemisionAJusticiaEnvelope(InsideRemisionRequestDto request) {
		InsideDatosRemisionJusticiaDto datos = request.getDatosRemisionJusticia();
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_NS).append("\"");
		envelope.append(" xmlns:rem=\"").append(REM_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:remisionAJusticia><peticionRemisionAJusticiaType>");
		envelope.append("<rem:idexp_eni>").append(escapeXml(request.getIdexpEni())).append("</rem:idexp_eni>");
		envelope.append("<rem:dir3Juzgado>").append(escapeXml(request.getDir3Juzgado())).append("</rem:dir3Juzgado>");
		envelope.append("<rem:datosRemisionJusticia>");
		envelope.append("<rem:dir3Remitente>").append(escapeXml(datos.getDir3Remitente()))
				.append("</rem:dir3Remitente>");
		envelope.append("<rem:nig>").append(escapeXml(datos.getNig())).append("</rem:nig>");
		envelope.append("<rem:claseProcedimiento>").append(escapeXml(datos.getClaseProcedimiento()))
				.append("</rem:claseProcedimiento>");
		envelope.append("<rem:anyoProcedimiento>").append(escapeXml(datos.getAnyoProcedimiento()))
				.append("</rem:anyoProcedimiento>");
		envelope.append("<rem:numeroProcedimiento>").append(escapeXml(datos.getNumeroProcedimiento()))
				.append("</rem:numeroProcedimiento>");

		if (datos.getDescripcion() != null && !datos.getDescripcion().isBlank()) {
			envelope.append("<rem:descripcion>").append(escapeXml(datos.getDescripcion()))
					.append("</rem:descripcion>");
		}

		envelope.append("</rem:datosRemisionJusticia>");
		envelope.append("</peticionRemisionAJusticiaType></web:remisionAJusticia>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionRemisionAJusticia() {
		return WEB_NS + "/remisionAJusticia";
	}

	public String buildConsultaEstadoRemisionEnvelope(String codigoEnvioATEA) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:consultaEstadoRemisionAJusticia>");
		envelope.append("<codigoEnvioATEA>").append(escapeXml(codigoEnvioATEA)).append("</codigoEnvioATEA>");
		envelope.append("</web:consultaEstadoRemisionAJusticia>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionConsultaEstadoRemision() {
		return WEB_NS + "/consultaEstadoRemisionAJusticia";
	}

	public String buildConvertirDocumentoAEniConMAdicionalesEnvelope(InsideConvertirDocumentoSoapDto dto) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_FILES_NS).append("\"");
		envelope.append(" xmlns:con=\"").append(DOC_CONV_NS).append("\"");
		envelope.append(" xmlns:met=\"").append(DOC_MET_NS).append("\"");
		envelope.append(" xmlns:met1=\"").append(MET_ADIC_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:convertirDocumentoAEniConMAdicionales><documento>");
		envelope.append("<con:contenido>").append(escapeXml(dto.getContenido())).append("</con:contenido>");
		envelope.append("<con:contenidoId>").append(escapeXml(dto.getContenidoId())).append("</con:contenidoId>");
		envelope.append("<con:firmadoConCertificado>").append(dto.isFirmadoConCertificado())
				.append("</con:firmadoConCertificado>");
		appendMetadatosDocumentoEni(envelope, dto, "con");
		envelope.append("</documento>");
		appendMetadatosAdicionales(envelope, dto.getMetadatosAdicionales(), "met1");
		envelope.append("<firmar>").append(dto.isFirmar()).append("</firmar>");
		envelope.append("</web:convertirDocumentoAEniConMAdicionales>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionConvertirDocumentoAEniConMAdicionales() {
		return WEB_FILES_NS + "/convertirDocumentoAEniConMAdicionales";
	}

	public String buildConvertirExpedienteAEniConMAdicionalesEnvelope(InsideConvertirExpedienteSoapDto dto) {
		StringBuilder envelope = new StringBuilder();
		envelope.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		envelope.append("<soapenv:Envelope xmlns:soapenv=\"").append(SOAP_ENV_NS).append("\"");
		envelope.append(" xmlns:web=\"").append(WEB_FILES_NS).append("\"");
		envelope.append(" xmlns:con=\"").append(EXP_CONV_NS).append("\"");
		envelope.append(" xmlns:met=\"").append(MET_ADIC_NS).append("\">");
		envelope.append("<soapenv:Header/><soapenv:Body>");
		envelope.append("<web:convertirExpedienteAEniConMAdicionales><expediente>");
		appendMetadatosExpedienteEni(envelope, dto, "con");
		envelope.append("<con:Indice>");
		envelope.append("<con:FechaIndiceElectronico>").append(escapeXml(dto.getFechaIndiceElectronico()))
				.append("</con:FechaIndiceElectronico>");
		for (InsideDocumentoIndizadoSoapDto documento : dto.getDocumentosIndizados()) {
			envelope.append("<con:DocumentoIndizado>");
			envelope.append("<con:IdentificadorDocumento>").append(escapeXml(documento.getIdentificadorDocumento()))
					.append("</con:IdentificadorDocumento>");
			envelope.append("<con:ValorHuella>").append(escapeXml(documento.getValorHuella()))
					.append("</con:ValorHuella>");
			envelope.append("<con:FuncionResumen>").append(escapeXml(documento.getFuncionResumen()))
					.append("</con:FuncionResumen>");
			if (documento.getFechaIncorporacionExpediente() != null) {
				envelope.append("<con:FechaIncorporacionExpediente>")
						.append(escapeXml(documento.getFechaIncorporacionExpediente()))
						.append("</con:FechaIncorporacionExpediente>");
			}
			if (documento.getOrdenDocumentoExpediente() != null) {
				envelope.append("<con:OrdenDocumentoExpediente>")
						.append(escapeXml(documento.getOrdenDocumentoExpediente()))
						.append("</con:OrdenDocumentoExpediente>");
			}
			envelope.append("</con:DocumentoIndizado>");
		}
		envelope.append("</con:Indice>");
		envelope.append("<con:OpcionesVisualizacion>");
		envelope.append("<con:EstamparImagen>false</con:EstamparImagen>");
		envelope.append("<con:EstamparNombreOrganismo>false</con:EstamparNombreOrganismo>");
		envelope.append("<con:EstamparPie>false</con:EstamparPie>");
		envelope.append("<con:TextoPie>false</con:TextoPie>");
		envelope.append("</con:OpcionesVisualizacion>");
		envelope.append("</expediente>");
		appendMetadatosAdicionales(envelope, dto.getMetadatosAdicionales(), "met");
		envelope.append("</web:convertirExpedienteAEniConMAdicionales>");
		envelope.append("</soapenv:Body></soapenv:Envelope>");
		return envelope.toString();
	}

	public String buildSoapActionConvertirExpedienteAEniConMAdicionales() {
		return WEB_FILES_NS + "/convertirExpedienteAEniConMAdicionales";
	}

	private void appendMetadatosDocumentoEni(StringBuilder envelope, InsideConvertirDocumentoSoapDto dto,
			String prefix) {
		envelope.append("<").append(prefix).append(":metadatosEni>");
		envelope.append("<").append(prefix).append(":VersionNTI>").append(escapeXml(dto.getVersionNti()))
				.append("</").append(prefix).append(":VersionNTI>");
		envelope.append("<").append(prefix).append(":Identificador>").append(escapeXml(dto.getIdentificador()))
				.append("</").append(prefix).append(":Identificador>");
		envelope.append("<").append(prefix).append(":Organo>").append(escapeXml(dto.getOrgano()))
				.append("</").append(prefix).append(":Organo>");
		envelope.append("<").append(prefix).append(":FechaCaptura>").append(escapeXml(dto.getFechaCaptura()))
				.append("</").append(prefix).append(":FechaCaptura>");
		envelope.append("<").append(prefix).append(":OrigenCiudadanoAdministracion>")
				.append(dto.isOrigenCiudadanoAdministracion()).append("</")
				.append(prefix).append(":OrigenCiudadanoAdministracion>");
		envelope.append("<").append(prefix).append(":EstadoElaboracion>");
		envelope.append("<met:ValorEstadoElaboracion>").append(escapeXml(dto.getEstadoElaboracion()))
				.append("</met:ValorEstadoElaboracion>");
		envelope.append("</").append(prefix).append(":EstadoElaboracion>");
		envelope.append("<").append(prefix).append(":TipoDocumental>").append(escapeXml(dto.getTipoDocumental()))
				.append("</").append(prefix).append(":TipoDocumental>");
		envelope.append("</").append(prefix).append(":metadatosEni>");
	}

	private void appendMetadatosExpedienteEni(StringBuilder envelope, InsideConvertirExpedienteSoapDto dto,
			String prefix) {
		envelope.append("<").append(prefix).append(":metadatosEni>");
		envelope.append("<").append(prefix).append(":VersionNTI>").append(escapeXml(dto.getVersionNti()))
				.append("</").append(prefix).append(":VersionNTI>");
		envelope.append("<").append(prefix).append(":Identificador>").append(escapeXml(dto.getIdentificador()))
				.append("</").append(prefix).append(":Identificador>");
		envelope.append("<").append(prefix).append(":Organo>").append(escapeXml(dto.getOrgano()))
				.append("</").append(prefix).append(":Organo>");
		envelope.append("<").append(prefix).append(":FechaAperturaExpediente>")
				.append(escapeXml(dto.getFechaAperturaExpediente())).append("</")
				.append(prefix).append(":FechaAperturaExpediente>");
		envelope.append("<").append(prefix).append(":Clasificacion>").append(escapeXml(dto.getClasificacion()))
				.append("</").append(prefix).append(":Clasificacion>");
		envelope.append("<").append(prefix).append(":Estado>").append(escapeXml(dto.getEstado()))
				.append("</").append(prefix).append(":Estado>");
		for (String interesado : dto.getInteresados()) {
			envelope.append("<").append(prefix).append(":Interesado>").append(escapeXml(interesado))
					.append("</").append(prefix).append(":Interesado>");
		}
		envelope.append("</").append(prefix).append(":metadatosEni>");
	}

	private void appendMetadatosAdicionales(StringBuilder envelope, List<InsideMetadatoAdicionalDto> metadatos,
			String prefix) {
		if (metadatos == null || metadatos.isEmpty()) {
			return;
		}

		envelope.append("<metadatosAdicionales>");
		for (InsideMetadatoAdicionalDto metadato : metadatos) {
			envelope.append("<").append(prefix).append(":MetadatoAdicional tipo=\"")
					.append(escapeXml(metadato.getTipo())).append("\" nombre=\"")
					.append(escapeXml(metadato.getNombre())).append("\">");
			envelope.append("<").append(prefix).append(":valor>").append(escapeXml(metadato.getValor()))
					.append("</").append(prefix).append(":valor>");
			envelope.append("</").append(prefix).append(":MetadatoAdicional>");
		}
		envelope.append("</metadatosAdicionales>");
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
