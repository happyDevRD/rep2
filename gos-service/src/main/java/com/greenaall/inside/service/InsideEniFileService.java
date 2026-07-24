package com.greenaall.inside.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.inside.dto.InsideEniXmlBase64Dto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.util.Utiles;

@Service
public class InsideEniFileService {

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private IArchivoService archivoService;

	public InsideEniXmlBase64Dto obtenerExpedienteEniXmlBase64(Long expedienteId) throws Exception {
		Expediente expediente = expedienteService.findById(expedienteId);
		if (expediente == null) {
			throw new NoDataFoundException();
		}

		if (expediente.getArchivo() == null) {
			return noEncontrado("El expediente no tiene archivo de visualización ENI generado.");
		}

		Archivo archivoVisualizacion = archivoService.findById(expediente.getArchivo());
		if (archivoVisualizacion == null || archivoVisualizacion.getDesArchi() == null) {
			return noEncontrado("No se localizó el archivo de visualización del expediente.");
		}

		String identificador = expediente.getEjercicio().toString() + expediente.getNumero().toString();
		File visualizacion = new File(archivoVisualizacion.getDesArchi());
		File expedienteXml = new File(visualizacion.getParent(), identificador + ".xml");
		return leerArchivoComoBase64(expedienteXml);
	}

	public InsideEniXmlBase64Dto obtenerDocumentoEniXmlBase64(Long codArchi) throws Exception {
		Archivo archivo = archivoService.findById(codArchi);
		if (archivo == null) {
			throw new NoDataFoundException();
		}

		String rutaXml = resolverRutaXmlEni(archivo.getDesArchiFlow());
		if (rutaXml == null) {
			return noEncontrado("El tipo de archivo no tiene XML ENI asociado.");
		}

		return leerArchivoComoBase64(new File(rutaXml));
	}

	public String resolverRutaXmlEni(String rutaArchivoFlow) {
		if (rutaArchivoFlow == null) {
			return null;
		}

		String extension = Utiles.getExtension(rutaArchivoFlow);
		if (".pdf".equals(extension)) {
			return rutaArchivoFlow.replace(".pdf", ".xml");
		}
		if (".doc".equals(extension)) {
			return rutaArchivoFlow.replace(".doc", ".xml");
		}
		if (".docx".equals(extension)) {
			return rutaArchivoFlow.replace(".docx", ".xml");
		}
		if (".xml".equals(extension)) {
			return rutaArchivoFlow;
		}

		return null;
	}

	public String obtenerContenidoArchivoBase64(Long codArchi) throws Exception {
		Archivo archivo = archivoService.findById(codArchi);
		if (archivo == null || archivo.getDesArchiFlow() == null) {
			return null;
		}

		File file = new File(archivo.getDesArchiFlow());
		if (!file.exists()) {
			return null;
		}

		try (FileInputStream fis = new FileInputStream(file)) {
			return Base64.getEncoder().encodeToString(fis.readAllBytes());
		}
	}

	private InsideEniXmlBase64Dto noEncontrado(String mensaje) {
		InsideEniXmlBase64Dto respuesta = new InsideEniXmlBase64Dto();
		respuesta.setEncontrado(false);
		respuesta.setMensaje(mensaje);
		return respuesta;
	}

	private InsideEniXmlBase64Dto leerArchivoComoBase64(File file) throws Exception {
		InsideEniXmlBase64Dto respuesta = new InsideEniXmlBase64Dto();
		if (!file.exists()) {
			respuesta.setEncontrado(false);
			respuesta.setMensaje("No se encontró el fichero ENI: " + file.getName());
			return respuesta;
		}

		try (FileInputStream fis = new FileInputStream(file)) {
			byte[] bytes = fis.readAllBytes();
			respuesta.setBase64(Base64.getEncoder().encodeToString(bytes));
			respuesta.setNombreArchivo(file.getName());
			respuesta.setEncontrado(true);
			return respuesta;
		}
	}
}
