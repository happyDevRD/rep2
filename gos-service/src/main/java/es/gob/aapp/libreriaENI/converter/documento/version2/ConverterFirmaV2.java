package es.gob.aapp.libreriaENI.converter.documento.version2;


import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.firma.*;
import es.gob.aapp.model.eni.v2.firma.Firmas;
import java.io.IOException;
import java.util.List;


public interface ConverterFirmaV2 {


    /**
     * Convierte las firmas del Objeto en Firmas del ENI V2
     * @param firmas listado de firmas
     * @return Firmas
     */
    Firmas firmasDocumentToEni(List<FirmaENI> firmas) throws DocumentConverterException;


    /**
     * Convierte en objetoDocumentoENI en Firmas del ENI V2
     * @param objetoDocumentoENI objetoDocumentoENI
     * @return Firmas
     * @throws IOException IOException
     * @throws DocumentENIValidationException DocumentENIValidationException
     */
    Firmas converterFirma(ObjetoDocumentoENI objetoDocumentoENI)
            throws IOException, DocumentENIValidationException;


}
