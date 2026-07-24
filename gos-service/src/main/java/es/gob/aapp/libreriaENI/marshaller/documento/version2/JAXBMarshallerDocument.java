package es.gob.aapp.libreriaENI.marshaller.documento.version2;


import es.gob.aapp.libreriaENI.marshaller.documento.JAXBMarshallerDocumentGeneric;
import es.gob.aapp.libreriaENI.util.XMLUtils;
import es.gob.aapp.model.eni.v2.documento.TipoDocumento;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.ByteArrayInputStream;
import java.io.IOException;


/**
 * Clase util de transformaciones XML y objetos java para la version 2 del ENI
 * 
 */
public class JAXBMarshallerDocument extends JAXBMarshallerDocumentGeneric {


	public TipoDocumento unmarshallDataDocument(byte[] data) throws JAXBException, ParserConfigurationException, SAXException,
			IOException, TransformerFactoryConfigurationError, TransformerException {

		Node nodoAdicionales = XMLUtils.getNode(data, "ns7:metadatosAdicionales");
		if (nodoAdicionales != null) {
			byte[] nodoEniString = XMLUtils.documentoAdicionalToEni(data);

			JAXBContext jc = JAXBContext.newInstance(TipoDocumento.class.getPackage().getName());

			Unmarshaller unmarshaller = jc.createUnmarshaller(); //
			JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(nodoEniString));
			return (TipoDocumento) element.getValue();
		}else{
			JAXBContext jc = JAXBContext.newInstance(TipoDocumento.class.getPackage().getName());

			Unmarshaller unmarshaller = jc.createUnmarshaller(); //
			JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(data));
			return (TipoDocumento) element.getValue();
		}

	}

}
