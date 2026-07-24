package es.gob.aapp.libreriaENI.converter.documento.version1;


import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido;
import java.io.File;
import java.io.IOException;


public interface ConverterContenidoV1 {


    TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido objetoDocumentoContenido, byte[] bytesContenido)
            throws IOException;

    TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido objetoDocumentoContenido, File fileContenido)
            throws IOException;
}
