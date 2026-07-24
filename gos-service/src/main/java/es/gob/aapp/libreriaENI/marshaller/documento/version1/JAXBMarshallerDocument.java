package es.gob.aapp.libreriaENI.marshaller.documento.version1;


import es.gob.aapp.libreriaENI.marshaller.documento.JAXBMarshallerDocumentGeneric;
import es.gob.aapp.libreriaENI.util.XMLUtils;
import es.gob.aapp.model.eni.v1.documento.TipoDocumento;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.ByteArrayInputStream;
import java.io.IOException;


/**
 * Clase util de transformaciones XML y objetos java para la version 1 del ENI
 * 
 */
public class JAXBMarshallerDocument extends JAXBMarshallerDocumentGeneric {


	public TipoDocumento unmarshallDataDocument(byte[] data) throws JAXBException, ParserConfigurationException,
			IOException, TransformerFactoryConfigurationError, TransformerException, SAXException {

		Node nodoAdicionales = XMLUtils.getNode(data, "ns7:metadatosAdicionales");
		JAXBContext jc = JAXBContext.newInstance(TipoDocumento.class.getPackage().getName());
		if (nodoAdicionales != null) {
			byte[] nodoEniString = XMLUtils.documentoAdicionalToEni(data);

			Unmarshaller unmarshaller = jc.createUnmarshaller(); //
			JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(nodoEniString));
			return (TipoDocumento) element.getValue();
		}else{
			Unmarshaller unmarshaller = jc.createUnmarshaller(); //
			JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(data));
			return (TipoDocumento) element.getValue();
		}

	}

}
