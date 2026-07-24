package com.greenaall.inside.service;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.greenaall.ge.dto.MetadatosENI;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;

@Service
public class InsideMetadatosEniService {

	@Autowired
	private IArchivoService archivoService;

	@Autowired
	private InsideEniFileService insideEniFileService;

	public MetadatosENI obtenerMetadatosPorArchivo(Long codArchi) throws Exception {
		Archivo archivo = archivoService.findById(codArchi);
		if (archivo == null || archivo.getDesArchiFlow() == null) {
			return null;
		}

		String rutaXml = insideEniFileService.resolverRutaXmlEni(archivo.getDesArchiFlow());
		if (rutaXml == null) {
			return null;
		}

		File file = new File(rutaXml);
		if (!file.exists()) {
			return null;
		}

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(file);
		document.getDocumentElement().normalize();

		NodeList metadatosNodes = document.getElementsByTagNameNS("*", "metadatos");
		if (metadatosNodes.getLength() == 0) {
			metadatosNodes = document.getElementsByTagName("ns2:metadatos");
		}

		if (metadatosNodes.getLength() == 0) {
			return null;
		}

		Element metadatosElement = (Element) metadatosNodes.item(0);
		MetadatosENI metadatos = new MetadatosENI();
		metadatos.setVersionNTI(readTag(metadatosElement, "VersionNTI"));
		metadatos.setIdentificador(readTag(metadatosElement, "Identificador"));
		metadatos.setOrgano(readTag(metadatosElement, "Organo"));
		metadatos.setFecCaptura(readTag(metadatosElement, "FechaCaptura"));
		metadatos.setTipDocum(readTag(metadatosElement, "TipoDocumental"));
		return metadatos;
	}

	private String readTag(Element parent, String tag) {
		NodeList nodes = parent.getElementsByTagNameNS("*", tag);
		if (nodes.getLength() == 0) {
			nodes = parent.getElementsByTagName("ns2:" + tag);
		}
		if (nodes.getLength() == 0) {
			return null;
		}

		Node node = nodes.item(0);
		return node != null ? node.getTextContent() : null;
	}
}
