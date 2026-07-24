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
 * Handler para expedientes con origen Archive
 * 
 */
public class HandlerExpedienteArchive extends DefaultHandler {

	private StringBuilder value;
	private String anterior = "";
	private TipoMetadatosAdicionales metadatosAdicionales;
	private MetadatoAdicional metadatoAdicional;

	/**
	 * Parse de documento
	 * 
	 * @param is inputStream
	 * @throws SAXException SAXException
	 * @throws ParserConfigurationException ParserConfigurationException
	 * @throws IOException IOException
	 */
	public HandlerExpedienteArchive(InputStream is) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		SAXParser parser;
		parser = factory.newSAXParser();
		parser.parse(is, this);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {
		value = new StringBuilder();
		String[] elements = qName.split(":");
		String element = elements[elements.length - 1];
		if (element.equals("metadatosAdicionales")) {
			metadatosAdicionales = new TipoMetadatosAdicionales();
		} else if (element.equals("valor")) {
			metadatoAdicional = new MetadatoAdicional();
			metadatoAdicional.setNombre(anterior);
			metadatoAdicional.setTipo("string");
		} else {
			anterior = element;
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) {
		String[] elements = qName.split(":");
		String element = elements[elements.length - 1];
		if (element.equals("valor")) {
			metadatoAdicional.setValor(value.toString());
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
