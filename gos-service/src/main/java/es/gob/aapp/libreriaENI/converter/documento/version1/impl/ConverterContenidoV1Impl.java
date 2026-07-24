package es.gob.aapp.libreriaENI.converter.documento.version1.impl;


import es.gob.aapp.libreriaENI.converter.documento.ConverterContenidoGeneric;
import es.gob.aapp.libreriaENI.converter.documento.version1.ConverterContenidoV1;
import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;


@Service("ConverterContenidoV1")
public class ConverterContenidoV1Impl extends ConverterContenidoGeneric implements ConverterContenidoV1 {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterContenidoV1Impl.class);

    @Override
    public TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido objetoDocumentoContenido, byte[] bytesContenido) throws IOException {

        LOG.debug("[INI] contenidoDocumentToEni");

        TipoContenido contenido = new TipoContenido();

        if (bytesContenido == null) {
            extraerContenidoFirma(objetoDocumentoContenido, contenido);
        } else {
            contenido.setValorBinario(bytesContenido);
            contenido.setId(objetoDocumentoContenido.getReferencia());
            contenido.setNombreFormato(objetoDocumentoContenido.getNombreFormato());
        }

        LOG.debug("[FIN] contenidoDocumentToEni");
        return contenido;
    }


    @Override
    public TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido objetoDocumentoContenido, File fileContenido) throws IOException {

        LOG.debug("[INI] contenidoDocumentToEni");

        TipoContenido contenido = new TipoContenido();

        if (fileContenido == null || !fileContenido.exists()) {
            extraerContenidoFirma(objetoDocumentoContenido, contenido);
        } else {
            contenido.setValorBinario(FileUtils.readFileToByteArray(fileContenido));
            contenido.setId(objetoDocumentoContenido.getReferencia());
            contenido.setNombreFormato(objetoDocumentoContenido.getNombreFormato());
        }

        LOG.debug("[FIN] contenidoDocumentToEni");
        return contenido;
    }


    private void extraerContenidoFirma(ObjetoDocumentoContenido objetoDocumentoContenido, TipoContenido contenido) throws IOException {

        LOG.debug("[INI] extraerContenidoFirma");

        if (objetoDocumentoContenido.getContenido() != null) {
            contenido.setValorBinario( IOUtils.toByteArray(objetoDocumentoContenido.getContenido()) );
        } else if (objetoDocumentoContenido.getReferencia() != null) {
            contenido.setReferenciaFichero(objetoDocumentoContenido.getReferencia());
        }

        contenido.setId(objetoDocumentoContenido.getIdentificadorEnDocumento());
        contenido.setNombreFormato(objetoDocumentoContenido.getNombreFormato());

        LOG.debug("[FIN] extraerContenidoFirma");
    }
}
