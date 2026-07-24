package es.gob.aapp.libreriaENI.marshaller.documento;



import es.gob.aapp.libreriaENI.util.file.DataFile;
import es.gob.aapp.model.version1.documentoAdicionales.TipoDocumentoInsideConMAdicionales;
import es.gob.aapp.model.eni.v1.documento.TipoDocumento;
import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import java.io.File;
import java.io.IOException;


/**
 * Clase util de transformaciones XML y objetos java para la version 1 del ENI
 * 
 */
public class JAXBMarshallerDocumentGeneric {

	protected JAXBMarshallerDocumentGeneric(){}

	private static final String CDATA = "<![CDATA[";


	public File marshallDataDocument(String key, Object doc, String nameSpace, String localPart, String prefix)
			throws JAXBException, FactoryConfigurationError, IOException {

		JAXBContext context = JAXBContext.newInstance(doc.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);

		// se crea un fichero temporal para formar el ENI
		File fileMarshall = DataFile.createTempFile(key);

		if(doc instanceof es.gob.aapp.model.eni.v1.documento.TipoDocumento){

			// Si es TipoDocumento V1
			if (((TipoDocumento) doc).getContenido() != null
					&& ((TipoDocumento) doc).getContenido().getDatosXML() != null) {

				Object data = ((TipoDocumento) doc).getContenido().getDatosXML();
				if ( data instanceof String && !String.valueOf(data).startsWith(CDATA) ) {

					// Validamos que no tenga ya un CDATA
					StringBuilder tmpBuild = new StringBuilder(CDATA);
					tmpBuild.append(data);
					tmpBuild.append("]]>");
					((TipoDocumento) doc).getContenido().setDatosXML(tmpBuild.toString());
				}
			}

			JAXBElement<TipoDocumento> jx = new JAXBElement<>(new QName(nameSpace, localPart, prefix),
					TipoDocumento.class, (TipoDocumento) doc);
			marshaller.marshal(jx, fileMarshall);

		}else if(doc instanceof TipoDocumentoInsideConMAdicionales){

			// Si es TipoDocumentoInsideConMAdicionales V1
			if (((TipoDocumentoInsideConMAdicionales) doc).getDocumento().getContenido() != null
					&& ((TipoDocumentoInsideConMAdicionales) doc).getDocumento().getContenido().getDatosXML() != null) {
				Object data = ((TipoDocumentoInsideConMAdicionales) doc).getDocumento().getContenido().getDatosXML();
				if (data instanceof String) {
					StringBuilder tmpBuild = new StringBuilder(CDATA);
					tmpBuild.append(data);
					tmpBuild.append("]]>");
					((TipoDocumentoInsideConMAdicionales) doc).getDocumento().getContenido()
							.setDatosXML(tmpBuild.toString());
				}
			}
			JAXBElement<TipoDocumentoInsideConMAdicionales> jx = new JAXBElement<>(
					new QName(nameSpace, localPart, prefix), TipoDocumentoInsideConMAdicionales.class,
					(TipoDocumentoInsideConMAdicionales) doc);
			marshaller.marshal(jx, fileMarshall);


		}else if(doc instanceof es.gob.aapp.model.eni.v2.documento.TipoDocumento){

			// Si es TipoDocumento V2
			if(((es.gob.aapp.model.eni.v2.documento.TipoDocumento) doc).getContenido() != null
					&& ((es.gob.aapp.model.eni.v2.documento.TipoDocumento) doc).getContenido().getDatosXML() != null) {

				Object data = ((es.gob.aapp.model.eni.v2.documento.TipoDocumento) doc).getContenido().getDatosXML();
				if (data instanceof String && !String.valueOf(data).startsWith(CDATA)) {

					// Validamos que no tenga ya un CDATA
					StringBuilder tmpBuild = new StringBuilder(CDATA);
					tmpBuild.append(data);
					tmpBuild.append("]]>");
					((es.gob.aapp.model.eni.v2.documento.TipoDocumento) doc).getContenido().setDatosXML(tmpBuild.toString());

				}
			}
			JAXBElement<es.gob.aapp.model.eni.v2.documento.TipoDocumento> jx = new JAXBElement<>(new QName(nameSpace, localPart, prefix),
					es.gob.aapp.model.eni.v2.documento.TipoDocumento.class, (es.gob.aapp.model.eni.v2.documento.TipoDocumento) doc);
			marshaller.marshal(jx, fileMarshall);

		}

		return fileMarshall;
	}

}
