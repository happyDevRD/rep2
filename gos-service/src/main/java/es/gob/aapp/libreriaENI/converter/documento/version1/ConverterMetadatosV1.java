package es.gob.aapp.libreriaENI.converter.documento.version1;


import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoMetadatos;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;
import java.util.List;


public interface ConverterMetadatosV1 {

    /**
     * Convierte los metadatos de un Documento al objeto Eni
     * @param metadatosDocument metadatosDocument
     * @return TipoMetadatos
     * @throws DocumentConverterException DocumentConverterException
     */
    TipoMetadatos metadatosDocumentToEni(ObjetoDocumentoMetadatos metadatosDocument)
            throws DocumentConverterException;


    /**
     * Convierte los metadatos Adicionales V1 a un mensaje
     * MetadatosAdicionales modelo
     * @param metadatosAdicionales metadatosAdicionales
     * @return TipoMetadatosAdicionales
     */
    TipoMetadatosAdicionales metadatosAdicionalesDocumentToXml(List<ObjetoMetadatoAdicional> metadatosAdicionales);

}
