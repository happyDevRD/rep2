package es.gob.aapp.libreriaENI.logic.marshaller;


import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import java.io.File;
import java.io.IOException;


/**
 * Clase util de transformaciones XML y objetos java para la version 1 del ENI
 * 
 */
public class JAXBMarshallerDocument {

	private JAXBMarshallerDocument(){}

	private static es.gob.aapp.libreriaENI.marshaller.documento.version1.JAXBMarshallerDocument marshallerDocumentV1 =
			new es.gob.aapp.libreriaENI.marshaller.documento.version1.JAXBMarshallerDocument();


	public static File marshallDataDocument(String key, Object doc, String nameSpace, String localPart, String prefix)
			throws JAXBException, FactoryConfigurationError, IOException {

		return marshallerDocumentV1.marshallDataDocument(key, doc, nameSpace, localPart, prefix);

	}

}
