package es.gob.aapp.libreriaENI.converter.documento.version1;


import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.model.eni.v1.documento.TipoDocumento;
import es.gob.aapp.model.version1.documentoAdicionales.TipoDocumentoInsideConMAdicionales;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;
import java.text.ParseException;

public interface ConverterDocumentoV1 {


    TipoDocumentoInsideConMAdicionales converterDocumentToENI(ObjetoDocumentoENI objetoDocumentoENI)
            throws DatatypeConfigurationException, ParseException, IOException, DocumentENIValidationException;


    TipoDocumentoInsideConMAdicionales documentoToConMAdicionales(ObjetoDocumentoENI documentoENI, byte[] bytesContenido)
            throws DocumentConverterException, IOException;


    TipoDocumento documentoToEni(ObjetoDocumentoENI objetoDocumentoENI, byte[] bytesContenido)
            throws DocumentConverterException, IOException;


}