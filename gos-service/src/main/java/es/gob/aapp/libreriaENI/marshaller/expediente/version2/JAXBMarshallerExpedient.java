package es.gob.aapp.libreriaENI.marshaller.expediente.version2;

import es.gob.aapp.libreriaENI.util.XMLUtils;
import es.gob.aapp.model.eni.v2.expediente.TipoExpediente;
import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.StringWriter;

/**
 * Clase util de transformaciones XML y objetos java para la version 2 del ENI
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
					new QName(XMLUtils.NAMESPACE_EXPEDIENTE_V2, EXPEDIENTE, "exp"), TipoExpediente.class,
					(TipoExpediente) datos);
			marshaller.marshal(jx, sw);
		}

		return sw.toString();
	}


}
