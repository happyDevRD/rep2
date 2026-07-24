package es.gob.aapp.libreriaENI.converter.documento.version2;


import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido;

import java.io.File;
import java.io.IOException;


public interface ConverterContenidoV2 {


    TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido contenidoDocumento, byte[] bytesContenido)
            throws IOException;


    TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido contenidoDocumento, File fileContenido)
            throws IOException;

}
