package es.gob.aapp.libreriaENI.service;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public interface GenerateExpedientENI {

    /**
     * Funcionalidad para generar el expediente ENI
     * @param objetoExpedienteENI objetoExpedienteENI
     * @return InputStream con el expediente ENI
     * @throws ExpedientENIValidationException ExpedientENIValidationException
     * @throws IOException IOException
     * @throws JAXBException JAXBException
     * @throws ConverterException ConverterException
     */
    InputStream generateENI(ObjetoExpedienteENI objetoExpedienteENI)
            throws IOException, JAXBException, ConverterException, ExpedientENIValidationException;


    /**
     * Funcionalidad para generar el expediente ENI
     * @param objetoExpedienteENI objetoExpedienteENI
     * @return File con el expediente ENI
     * @throws ExpedientENIValidationException ExpedientENIValidationException
     * @throws IOException IOException
     * @throws JAXBException JAXBException
     * @throws ConverterException ConverterException
     */
    File generateENIToFile(ObjetoExpedienteENI objetoExpedienteENI)
            throws IOException, JAXBException, ConverterException, ExpedientENIValidationException;


    /**
     * Funcionalidad para generar el indice del expediente
     * @param objetoExpedienteENI objetoExpedienteENI
     * @return String con el indice del expediente o null si existe algun error de validacion
     * @throws ExpedientENIValidationException ExpedientENIValidationException
     * @throws IOException IOException
     * @throws ConverterException ConverterException
     * @throws JAXBException JAXBException
     */
    String getIndiceExpediente(ObjetoExpedienteENI objetoExpedienteENI) throws ExpedientENIValidationException, IOException, ConverterException, JAXBException;

}
