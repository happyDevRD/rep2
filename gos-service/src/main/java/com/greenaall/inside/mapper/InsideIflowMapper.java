package com.greenaall.inside.mapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.greenaall.ge.dto.IndiceENI;
import com.greenaall.ge.dto.MetadatosENI;
import com.greenaall.inside.dto.InsideAltaDocumentoEniSoapDto;
import com.greenaall.inside.dto.InsideConvertirContextDto;
import com.greenaall.inside.dto.InsideConvertirDocumentoSoapDto;
import com.greenaall.inside.dto.InsideConvertirExpedienteSoapDto;
import com.greenaall.inside.dto.InsideDocumentoIndizadoSoapDto;
import com.greenaall.inside.dto.InsideMetadatoAdicionalDto;
import com.greenaall.inside.dto.InsideTareaDocumentoContextDto;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;

public final class InsideIflowMapper {

	private InsideIflowMapper() {
	}

	public static String normalizarOrganoDir3(String organo) {
		if (organo == null) {
			return "";
		}
		return organo.replaceFirst("(?i)^ES_", "").trim();
	}

	public static String buildIdentificadorExpedienteEni(String organo, int ejercicio, int numero) {
		return "ES_" + normalizarOrganoDir3(organo) + "_" + ejercicio + "_EXP_" + padSecuencia(numero, 7);
	}

	public static String buildIdentificadorDocumentoEni(String organo, int ejercicio, int secuencia) {
		return "ES_" + normalizarOrganoDir3(organo) + "_" + ejercicio + "_" + padSecuencia(secuencia, 7);
	}

	public static String mapEstadoExpediente(EnumEstadoExpediente estado) {
		if (estado == null) {
			return InsideEniConstants.ESTADO_EXPEDIENTE_ABIERTO;
		}

		return switch (estado) {
			case CERRADO, ARCHIVADO, CANCELADO -> InsideEniConstants.ESTADO_EXPEDIENTE_CERRADO;
			default -> InsideEniConstants.ESTADO_EXPEDIENTE_ABIERTO;
		};
	}

	public static String mapDocumentacionToEstadoElaboracion(Short documentacion, String tipDocEni) {
		if (documentacion == null || "TD99".equals(tipDocEni)) {
			return InsideEniConstants.ESTADO_ELABORACION_OTROS;
		}

		int valor = documentacion.intValue();
		if (valor == 1) {
			return InsideEniConstants.ESTADO_ELABORACION_ORIGINAL;
		}
		if (valor == 2 || valor == 3) {
			return InsideEniConstants.ESTADO_ELABORACION_COPIA;
		}

		return InsideEniConstants.ESTADO_ELABORACION_OTROS;
	}

	public static boolean mapOrigenCiudadano(Short docAport) {
		return docAport != null && docAport == 1;
	}

	public static String mapTipoDocumental(String tipDocEni) {
		if (tipDocEni == null || tipDocEni.isBlank() || "TD99".equals(tipDocEni)) {
			return InsideEniConstants.TIPO_DOCUMENTAL_DEFAULT;
		}
		return tipDocEni.replace("_", "");
	}

	public static String formatFechaEniDateTime(Date fecha) {
		if (fecha == null) {
			return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT).format(new Date());
		}
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT).format(fecha);
	}

	public static String formatFechaEniDate(Date fecha) {
		String iso = formatFechaEniDateTime(fecha);
		return iso.substring(0, 10);
	}

	public static List<InsideMetadatoAdicionalDto> mapAtributosToMetadatosAdicionales(
			List<AtributoExpediente> atributos) {
		List<InsideMetadatoAdicionalDto> metadatos = new ArrayList<>();
		if (atributos == null) {
			return metadatos;
		}

		for (AtributoExpediente atributo : atributos) {
			if (atributo.getEtiGruAtrib() == null || atributo.getValor() == null || atributo.getValor().isBlank()) {
				continue;
			}
			InsideMetadatoAdicionalDto metadato = new InsideMetadatoAdicionalDto();
			metadato.setTipo("string");
			metadato.setNombre(atributo.getEtiGruAtrib());
			metadato.setValor(atributo.getValor());
			metadatos.add(metadato);
		}

		return metadatos;
	}

	public static InsideConvertirDocumentoSoapDto mapTareaToConvertirDocumento(
			InsideTareaDocumentoContextDto contexto,
			String organoDir3,
			int ejercicio,
			boolean firmar) {
		if (contexto.getContenidoBase64() == null || contexto.getContenidoBase64().isBlank()) {
			return null;
		}

		TareaTramiteExpediente tarea = contexto.getTarea();
		MetadatosENI metadatos = contexto.getMetadatos();
		String organo = normalizarOrganoDir3(organoDir3);
		String identificador = metadatos != null && metadatos.getIdentificador() != null
				? metadatos.getIdentificador()
				: buildIdentificadorDocumentoEni(organo, ejercicio, contexto.getOrden());

		InsideConvertirDocumentoSoapDto dto = new InsideConvertirDocumentoSoapDto();
		dto.setContenido(contexto.getContenidoBase64());
		dto.setContenidoId(identificador);
		dto.setFirmadoConCertificado(false);
		dto.setVersionNti(InsideEniConstants.VERSION_NTI_DOCUMENTO);
		dto.setIdentificador(identificador);
		dto.setOrgano(organo);
		dto.setFechaCaptura(metadatos != null && metadatos.getFecCaptura() != null
				? metadatos.getFecCaptura()
				: formatFechaEniDateTime(tarea.getFecFin() != null ? tarea.getFecFin() : tarea.getFecInicio()));
		dto.setOrigenCiudadanoAdministracion(mapOrigenCiudadano(tarea.getDocAport()));
		dto.setEstadoElaboracion(mapDocumentacionToEstadoElaboracion(tarea.getDocumentacion(), tarea.getTipDocEni()));
		dto.setTipoDocumental(mapTipoDocumental(tarea.getTipDocEni()));
		dto.setFirmar(firmar);
		return dto;
	}

	public static InsideAltaDocumentoEniSoapDto mapTareaToAltaDocumentoEni(
			InsideTareaDocumentoContextDto contexto,
			String organoDir3,
			int ejercicio,
			boolean firmarServidor) {
		InsideConvertirDocumentoSoapDto base = mapTareaToConvertirDocumento(contexto, organoDir3, ejercicio, firmarServidor);
		if (base == null) {
			return null;
		}

		InsideAltaDocumentoEniSoapDto dto = new InsideAltaDocumentoEniSoapDto();
		dto.setValorBinario(base.getContenido());
		dto.setNombreFormato(resolverNombreFormato(contexto));
		dto.setVersionNti(base.getVersionNti());
		dto.setIdentificador(base.getIdentificador());
		dto.setOrgano(base.getOrgano());
		dto.setFechaCaptura(base.getFechaCaptura());
		dto.setOrigenCiudadanoAdministracion(base.isOrigenCiudadanoAdministracion());
		dto.setEstadoElaboracion(base.getEstadoElaboracion());
		dto.setTipoDocumental(base.getTipoDocumental());
		dto.setFirmaServidor(firmarServidor);
		return dto;
	}

	private static String resolverNombreFormato(InsideTareaDocumentoContextDto contexto) {
		if (contexto.getMetadatos() != null && contexto.getMetadatos().getTipDocum() != null) {
			String tipDocum = contexto.getMetadatos().getTipDocum();
			if (tipDocum.toUpperCase(Locale.ROOT).contains("PDF")) {
				return "PDF";
			}
		}
		return "PDF";
	}

	public static InsideConvertirExpedienteSoapDto mapExpedienteToConvertirExpediente(
			InsideConvertirContextDto context,
			boolean incluirMetadatosAdicionales) {
		Expediente expediente = context.getExpediente();
		String organo = normalizarOrganoDir3(context.getOrganoDir3());
		int ejercicio = expediente.getEjercicio() != null
				? expediente.getEjercicio().intValue()
				: java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int numero = expediente.getNumero() != null ? expediente.getNumero() : 0;
		String identificador = buildIdentificadorExpedienteEni(organo, ejercicio, numero);
		String clasificacion = context.getClasificacion() != null && !context.getClasificacion().isBlank()
				? context.getClasificacion()
				: String.valueOf(expediente.getProcedimiento() != null ? expediente.getProcedimiento() : "");

		InsideConvertirExpedienteSoapDto dto = new InsideConvertirExpedienteSoapDto();
		dto.setVersionNti(InsideEniConstants.VERSION_NTI_EXPEDIENTE);
		dto.setIdentificador(identificador);
		dto.setOrgano(organo);
		dto.setFechaAperturaExpediente(formatFechaEniDate(expediente.getFecInicio()));
		dto.setClasificacion(clasificacion);
		dto.setEstado(mapEstadoExpediente(expediente.getEstado()));
		dto.setInteresados(new ArrayList<>(new LinkedHashSet<>(context.getInteresados())));
		dto.setFechaIndiceElectronico(formatFechaEniDate(
				expediente.getFecFin() != null ? expediente.getFecFin() : new Date()));

		List<InsideDocumentoIndizadoSoapDto> documentosIndizados = new ArrayList<>();
		int index = 0;
		for (InsideTareaDocumentoContextDto documento : context.getDocumentos()) {
			index++;
			InsideDocumentoIndizadoSoapDto indizado = new InsideDocumentoIndizadoSoapDto();
			MetadatosENI metadatos = documento.getMetadatos();
			IndiceENI indice = documento.getIndice();
			indizado.setIdentificadorDocumento(metadatos != null && metadatos.getIdentificador() != null
					? metadatos.getIdentificador()
					: buildIdentificadorDocumentoEni(organo, ejercicio, documento.getOrden()));
			indizado.setValorHuella(indice != null && indice.getHuella() != null ? indice.getHuella() : "");
			indizado.setFuncionResumen(InsideEniConstants.FUNCION_RESUMEN_SHA256);
			TareaTramiteExpediente tarea = documento.getTarea();
			indizado.setFechaIncorporacionExpediente(formatFechaEniDate(
					tarea.getFecFin() != null ? tarea.getFecFin() : tarea.getFecInicio()));
			indizado.setOrdenDocumentoExpediente(padSecuencia(index, 4));
			documentosIndizados.add(indizado);
		}
		dto.setDocumentosIndizados(documentosIndizados);

		if (incluirMetadatosAdicionales) {
			dto.setMetadatosAdicionales(mapAtributosToMetadatosAdicionales(context.getAtributos()));
		}

		return dto;
	}

	public static List<TareaTramiteExpediente> ordenarTareasConDocumento(List<TareaTramiteExpediente> tareas) {
		List<TareaTramiteExpediente> filtradas = new ArrayList<>();
		for (TareaTramiteExpediente tarea : tareas) {
			if (tarea.getArchivo() != null) {
				filtradas.add(tarea);
			}
		}

		filtradas.sort(Comparator
				.comparing((TareaTramiteExpediente t) -> t.getTramite() != null ? t.getTramite() : 0L)
				.thenComparing(t -> t.getNumero() != null ? t.getNumero() : 0)
				.thenComparing(t -> t.getFecInicio() != null ? t.getFecInicio() : new Date(0)));

		return filtradas;
	}

	private static String padSecuencia(int valor, int longitud) {
		return String.format(Locale.ROOT, "%0" + longitud + "d", valor);
	}
}
