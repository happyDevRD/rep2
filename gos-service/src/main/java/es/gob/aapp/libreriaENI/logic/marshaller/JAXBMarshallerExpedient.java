package es.gob.aapp.libreriaENI.logic.marshaller;


import es.gob.aapp.libreriaENI.util.EnumeracionExpedienteENI;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerFactoryConfigurationError;


/**
 * Clase util de transformaciones XML y objetos java para la version 1 del ENI
 * 
 */
public class JAXBMarshallerExpedient {

	private JAXBMarshallerExpedient(){}

	private static es.gob.aapp.libreriaENI.marshaller.expediente.version1.JAXBMarshallerExpedient marshallerExpedientV1 =
			new es.gob.aapp.libreriaENI.marshaller.expediente.version1.JAXBMarshallerExpedient();

	private static es.gob.aapp.libreriaENI.marshaller.expediente.version2.JAXBMarshallerExpedient marshallerExpedientV2 =
			new es.gob.aapp.libreriaENI.marshaller.expediente.version2.JAXBMarshallerExpedient();


	/**
	 * Funcionalidad que convierte un Objeto de TipoExpediente en String
	 * @param datos datos
	 * @param versionNTI versionNTI
	 * @return String
	 * @throws JAXBException JAXBException
	 * @throws TransformerFactoryConfigurationError TransformerFactoryConfigurationError
	 */
	public static String marshallDataExpedient(Object datos, String versionNTI) throws JAXBException,
			TransformerFactoryConfigurationError {

		String expedienteENI = null;
		if(EnumeracionExpedienteENI.isEniV1(versionNTI)){

			//Version 1
			expedienteENI = marshallerExpedientV1.marshallDataExpedient(datos);

		}else if(EnumeracionExpedienteENI.isEniV2(versionNTI)){

			//Version 2
			expedienteENI = marshallerExpedientV2.marshallDataExpedient(datos);
		}

		return expedienteENI;
	}

}
