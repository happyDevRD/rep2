package es.gob.aapp.libreriaENI.service;


import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface GenerateDocumentENI {

    /**
     * Funcionalidad para generar el documento ENI
     * @param objetoDocumentoENI objetoDocumentoENI
     * @return InputStream con el documento ENI
     * @throws DocumentENIValidationException DocumentENIValidationException
     * @throws DatatypeConfigurationException DatatypeConfigurationException
     * @throws IOException IOException
     * @throws JAXBException JAXBException
     */
    InputStream generateENI(ObjetoDocumentoENI objetoDocumentoENI)
            throws DocumentENIValidationException, DatatypeConfigurationException, IOException, JAXBException;


    /**
     * Funcionalidad para generar el documento ENI
     * @param objetoDocumentoENI objetoDocumentoENI
     * @return File con el documento ENI
     * @throws DocumentENIValidationException DocumentENIValidationException
     * @throws DatatypeConfigurationException DatatypeConfigurationException
     * @throws IOException IOException
     * @throws JAXBException JAXBException
     */
    File generateENIToFile(ObjetoDocumentoENI objetoDocumentoENI)
            throws DocumentENIValidationException, DatatypeConfigurationException, IOException, JAXBException;


}
