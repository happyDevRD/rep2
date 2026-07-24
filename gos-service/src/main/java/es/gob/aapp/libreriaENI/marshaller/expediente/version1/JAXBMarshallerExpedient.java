package es.gob.aapp.libreriaENI.marshaller.expediente.version1;

import es.gob.aapp.libreriaENI.util.XMLUtils;
import es.gob.aapp.model.eni.v1.expediente.TipoExpediente;
import es.gob.aapp.model.version1.expedienteAdicionales.TipoExpedienteInsideConMAdicionales;
import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.StringWriter;

/**
 * Clase util de transformaciones XML y objetos java para la version 1 del ENI
 * 
 */
public class JAXBMarshallerExpedient {

	private static final String EXPEDIENTE = "expediente";

	public String marshallDataExpedient(Object datos) throws JAXBException {
		StringWriter sw = new StringWriter();
		if (datos instanceof TipoExpediente) {
			JAXBContext context = JAXBContext.newInstance(TipoExpediente.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			JAXBElement<TipoExpediente> jx = new JAXBElement<>(
					new QName(XMLUtils.NAMESPACE_EXPEDIENTE_V1, EXPEDIENTE, "exp"), TipoExpediente.class,
					(TipoExpediente) datos);
			marshaller.marshal(jx, sw);
		}
		if (datos instanceof TipoExpedienteInsideConMAdicionales) {
			JAXBContext context = JAXBContext.newInstance(TipoExpedienteInsideConMAdicionales.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			JAXBElement<TipoExpedienteInsideConMAdicionales> jx = new JAXBElement<>(
					new QName(XMLUtils.NAMESPACE_METADATOSADIC, EXPEDIENTE, "insidews"),
					TipoExpedienteInsideConMAdicionales.class, (TipoExpedienteInsideConMAdicionales) datos);
			marshaller.marshal(jx, sw);
		}
		return sw.toString();
	}

}
