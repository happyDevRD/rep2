package com.greenaall.inside.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.greenaall.inside.dto.InsideMetadatoAdicionalDto;
import com.greenaall.inside.dto.InsideTareaDocumentoContextDto;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;

class InsideIflowMapperTest {

	@Test
	void buildIdentificadorExpedienteEni_normalizaOrgano() {
		String identificador = InsideIflowMapper.buildIdentificadorExpedienteEni("ES_L12345678", 2026, 42);
		assertEquals("ES_L12345678_2026_EXP_0000042", identificador);
	}

	@Test
	void mapDocumentacionToEstadoElaboracion_devuelveOriginalParaUno() {
		assertEquals(InsideEniConstants.ESTADO_ELABORACION_ORIGINAL,
				InsideIflowMapper.mapDocumentacionToEstadoElaboracion((short) 1, "TD01"));
	}

	@Test
	void mapDocumentacionToEstadoElaboracion_devuelveOtrosParaTd99() {
		assertEquals(InsideEniConstants.ESTADO_ELABORACION_OTROS,
				InsideIflowMapper.mapDocumentacionToEstadoElaboracion((short) 1, "TD99"));
	}

	@Test
	void mapEstadoExpediente_cerradoMapeaAE02() {
		assertEquals(InsideEniConstants.ESTADO_EXPEDIENTE_CERRADO,
				InsideIflowMapper.mapEstadoExpediente(EnumEstadoExpediente.CERRADO));
	}

	@Test
	void mapAtributosToMetadatosAdicionales_ignoraVacios() {
		AtributoExpediente valido = new AtributoExpediente();
		valido.setEtiGruAtrib("campo1");
		valido.setValor("valor1");

		AtributoExpediente vacio = new AtributoExpediente();
		vacio.setEtiGruAtrib("campo2");
		vacio.setValor("");

		List<InsideMetadatoAdicionalDto> metadatos = InsideIflowMapper
				.mapAtributosToMetadatosAdicionales(List.of(valido, vacio));

		assertEquals(1, metadatos.size());
		assertEquals("campo1", metadatos.get(0).getNombre());
	}

	@Test
	void mapTareaToConvertirDocumento_requiereContenidoBase64() {
		InsideTareaDocumentoContextDto contexto = new InsideTareaDocumentoContextDto();
		contexto.setTarea(crearTarea());
		contexto.setOrden(1);

		assertEquals(null, InsideIflowMapper.mapTareaToConvertirDocumento(contexto, "L12345678", 2026, false));
	}

	@Test
	void mapTareaToConvertirDocumento_generaIdentificadorYMetadatos() {
		InsideTareaDocumentoContextDto contexto = new InsideTareaDocumentoContextDto();
		contexto.setTarea(crearTarea());
		contexto.setOrden(3);
		contexto.setContenidoBase64("QkFTRTY0");

		var dto = InsideIflowMapper.mapTareaToConvertirDocumento(contexto, "L12345678", 2026, false);

		assertEquals("QkFTRTY0", dto.getContenido());
		assertEquals("ES_L12345678_2026_0000003", dto.getIdentificador());
		assertEquals("TD01", dto.getTipoDocumental());
		assertFalse(dto.isFirmar());
	}

	@Test
	void mapTareaToAltaDocumentoEni_incluyeNombreFormatoPdf() {
		InsideTareaDocumentoContextDto contexto = new InsideTareaDocumentoContextDto();
		contexto.setTarea(crearTarea());
		contexto.setOrden(1);
		contexto.setContenidoBase64("QkFTRTY0");

		var dto = InsideIflowMapper.mapTareaToAltaDocumentoEni(contexto, "L12345678", 2026, false);

		assertEquals("PDF", dto.getNombreFormato());
		assertTrue(dto.getValorBinario().length() > 0);
	}

	private TareaTramiteExpediente crearTarea() {
		TareaTramiteExpediente tarea = new TareaTramiteExpediente();
		tarea.setId(10L);
		tarea.setArchivo(99L);
		tarea.setTramite(5L);
		tarea.setNumero((short) 2);
		tarea.setFecInicio(new Date());
		tarea.setFecFin(new Date());
		tarea.setDocAport((short) 0);
		tarea.setDocumentacion((short) 1);
		tarea.setTipDocEni("TD01");
		return tarea;
	}
}
