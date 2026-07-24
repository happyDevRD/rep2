package es.gob.aapp.libreriaENI.util.file;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import es.gob.aapp.model.version1.metadatosAdicionales.MetadatoAdicional;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Handler para parsear un XML de documentos
 * 
 */
public class HandlerDocument extends DefaultHandler {

	private StringBuilder value;
	private TipoMetadatosAdicionales metadatosAdicionales;
	private MetadatoAdicional metadatoAdicional;

	/**
	 * Parse de documento
	 * 
	 * @param is
	 *            inputStream
	 */
	public HandlerDocument(InputStream is) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		SAXParser parser;
		parser = factory.newSAXParser();
		parser.parse(is, this);
	}

	/**
	 * Crea el objeto documento
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {
		value = new StringBuilder();
		String[] elements = qName.split(":");
		String element = elements[elements.length - 1];
		if (element.equals("metadatosAdicionales")) {
			metadatosAdicionales = new TipoMetadatosAdicionales();
		}
		if (element.equals("MetadatoAdicional")) {
			metadatoAdicional = new MetadatoAdicional();
			metadatoAdicional.setNombre(attributes.getValue("nombre"));
			metadatoAdicional.setTipo(attributes.getValue("tipo"));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		String[] elements = qName.split(":");
		String element = elements[elements.length - 1];
		if (element.equals("valor")) {
			metadatoAdicional.setValor(value.toString());
		}
		if (element.equals("MetadatoAdicional")) {
			metadatosAdicionales.getMetadatoAdicional().add(metadatoAdicional);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		if (length == 0)
			return;
		int end = (start + length) - 1;
		while (ch[start] <= '\u0020') {
			if (start == end)
				return;
			start++;
			length--;
		}
		while (ch[end] <= '\u0020') {
			if (end == start)
				return;
			length--;
			end--;
		}
		value.append(ch, start, length);
	}

	public TipoMetadatosAdicionales getMetadatosAdicionales() {
		return metadatosAdicionales;
	}

}
