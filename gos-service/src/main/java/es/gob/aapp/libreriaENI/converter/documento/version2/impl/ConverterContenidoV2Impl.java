package es.gob.aapp.libreriaENI.converter.documento.version2.impl;


import es.gob.aapp.libreriaENI.converter.documento.ConverterContenidoGeneric;
import es.gob.aapp.libreriaENI.converter.documento.version2.ConverterContenidoV2;
import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.libreriaENI.model.documento.contenido.TipoDocumentoReferenciaExterna;
import es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido;
import es.gob.aapp.model.eni.v2.documento.contenido.TipoReferenciaExterna;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;


@Service("converterContenidoV2")
public class ConverterContenidoV2Impl extends ConverterContenidoGeneric implements ConverterContenidoV2 {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterContenidoV2Impl.class);


    @Override
    public TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido contenidoDocumento, byte[] bytesContenido) throws IOException {

        LOG.debug("[INI] contenidoDocumentToEni");

        TipoContenido contenido = new TipoContenido();

        if (bytesContenido == null) {
            contenido = extraerContenidoFirma(contenidoDocumento);
        } else {
            contenido.setValorBinario(bytesContenido);
            contenido.setReferenciaExterna(
                    convertRefExtToTipoDocRefExt(contenidoDocumento.getTipoDocumentoReferenciaExterna()) );
            contenido.setId(contenidoDocumento.getReferencia());
            contenido.setNombreFormato(contenidoDocumento.getNombreFormato());
        }

        LOG.debug("[FIN] contenidoDocumentToEni");
        return contenido;
    }


    @Override
    public TipoContenido contenidoDocumentToEni(ObjetoDocumentoContenido contenidoDocumento, File fileContenido) throws IOException {

        LOG.debug("[INI] contenidoDocumentToEni");

        TipoContenido contenido = new TipoContenido();

        if (fileContenido == null || !fileContenido.exists()) {
            extraerContenidoFirma(contenidoDocumento, contenido);
        }else{
            contenido.setValorBinario(FileUtils.readFileToByteArray(fileContenido));
            contenido.setReferenciaExterna(
                    convertRefExtToTipoDocRefExt(contenidoDocumento.getTipoDocumentoReferenciaExterna()) );
            contenido.setId(contenidoDocumento.getReferencia());
            contenido.setNombreFormato(contenidoDocumento.getNombreFormato());
        }

        LOG.debug("[FIN] contenidoDocumentToEni");
        return contenido;
    }


    private TipoContenido extraerContenidoFirma(ObjetoDocumentoContenido objetoDocumentoContenido) throws IOException {

        LOG.debug("[INI] extraerContenidoFirma");

        TipoContenido contenido = new TipoContenido();

        if (objetoDocumentoContenido.getContenido() != null) {
            contenido.setValorBinario( IOUtils.toByteArray(objetoDocumentoContenido.getContenido()) );
        } else if (objetoDocumentoContenido.getReferencia() != null) {
            contenido.setReferenciaFichero(objetoDocumentoContenido.getReferencia());
        }else if(objetoDocumentoContenido.getTipoDocumentoReferenciaExterna() != null){
            contenido.setReferenciaExterna(
                    convertRefExtToTipoDocRefExt(objetoDocumentoContenido.getTipoDocumentoReferenciaExterna()) );
        }

        contenido.setId(objetoDocumentoContenido.getIdentificadorEnDocumento());
        contenido.setNombreFormato(objetoDocumentoContenido.getNombreFormato());

        LOG.debug("[FIN] extraerContenidoFirma");
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

    private TipoReferenciaExterna convertRefExtToTipoDocRefExt(TipoDocumentoReferenciaExterna tipoDocumentoReferenciaExterna){

        TipoReferenciaExterna tipoReferciaExterna = new TipoReferenciaExterna();

        BeanUtils.copyProperties(tipoDocumentoReferenciaExterna, tipoReferciaExterna);
        return tipoReferciaExterna;
    }

}