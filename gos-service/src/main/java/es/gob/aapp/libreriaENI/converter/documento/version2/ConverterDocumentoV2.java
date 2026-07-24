package es.gob.aapp.libreriaENI.converter.documento.version2;


import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.model.eni.v2.documento.TipoDocumento;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;
import java.text.ParseException;


public interface ConverterDocumentoV2 {


    TipoDocumento converterDocumentToENI(ObjetoDocumentoENI objetoDocumentoENI)
            throws DatatypeConfigurationException, ParseException, IOException, DocumentENIValidationException;


    TipoDocumento documentoToEni(ObjetoDocumentoENI objetoDocumentoENI, byte[] bytesContenido)
            throws DocumentConverterException, IOException;


}