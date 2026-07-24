package es.gob.aapp.libreriaENI.converter.documento.version2;


import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoMetadatos;


public interface ConverterMetadatosV2 {

    /**
     * Convierte los metadatos de un Documento al objeto Eni
     * @param metadatosDocument metadatosDocument
     * @return TipoMetadatos
     * @throws DocumentConverterException DocumentConverterException
     */
    TipoMetadatos metadatosDocumentToEni(ObjetoDocumentoMetadatos metadatosDocument)
            throws DocumentConverterException;

}
