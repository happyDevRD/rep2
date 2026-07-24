package es.gob.aapp.libreriaENI.logic.converter.documento;


import es.gob.aapp.libreriaENI.converter.documento.version1.impl.ConverterDocumentoV1Impl;
import es.gob.aapp.libreriaENI.converter.documento.version2.impl.ConverterDocumentoV2Impl;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoENI;
import es.gob.aapp.libreriaENI.util.XMLUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;


/**
 * Parte donde se decide la conversion que se realiza, si en v1 o en v2
 */
@SuppressWarnings("unchecked")
public class ConverterDocumento {

    private ConverterDocumento(){}


    private static ConverterDocumentoV1Impl converterDocumentoV1 = new ConverterDocumentoV1Impl();
    private static ConverterDocumentoV2Impl converterDocumentoV2 = new ConverterDocumentoV2Impl();


    public static <T> T converterDocumentToENI(ObjetoDocumentoENI objetoDocumentoENI)
            throws DatatypeConfigurationException, IOException, DocumentENIValidationException {

        // Obtenemos la versionNTI
        String versionNTI = XMLUtils.getVersionNTI(objetoDocumentoENI);

        T tipoDocumentoInsideConMAdicionales = null;
        if(EnumeracionDocumentoENI.isEniV1(versionNTI)){

            // Version 1
            tipoDocumentoInsideConMAdicionales = (T) converterDocumentoV1.converterDocumentToENI(
                    objetoDocumentoENI);

        }else if(EnumeracionDocumentoENI.isEniV2(versionNTI)){

            // Version 2
            tipoDocumentoInsideConMAdicionales = (T) converterDocumentoV2.converterDocumentToENI(
                    objetoDocumentoENI);

        }

        return tipoDocumentoInsideConMAdicionales;
    }

}