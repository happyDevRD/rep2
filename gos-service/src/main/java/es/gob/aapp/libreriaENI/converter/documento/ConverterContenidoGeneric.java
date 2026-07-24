package es.gob.aapp.libreriaENI.converter.documento;


import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.libreriaENI.model.documento.contenido.TipoDocumentoReferenciaExterna;
import es.gob.aapp.libreriaENI.util.ConverterUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.io.ByteArrayInputStream;
import java.io.File;


public class ConverterContenidoGeneric {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterContenidoGeneric.class);


    /**
     * Convierte el objeto que nos llega por parámetro que será TipoContenido (versión1 o versión2 del ENI)
     * en ObjetoDocumentoContenido
     * @param contenidoEni Object (TipoContenido versión1 o versión2 del ENI)
     * @return ObjetoDocumentoContenido
     */
    public ObjetoDocumentoContenido contenidoEniToDocument(Object contenidoEni) {

        LOG.debug("[INI] contenidoEniToDocument");

        // Rellenamos los campos genéricos de ambas versiones que tienen campos comunes
        ObjetoDocumentoContenido contenidoDocumento = getInfoGeneric(contenidoEni);

        // Como el campo "ReferenciaExterna" solo se encuentra en v2, en su caso, se rellena
        if(contenidoDocumento != null && contenidoEni instanceof es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido){

            // Realizamos el cast para la version 2
            es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido contenidoEniV2 =
                    castTipoContenidoToV2(contenidoEni);

            if (contenidoEniV2.getReferenciaExterna() != null) {

                TipoDocumentoReferenciaExterna referenciaExterna = new TipoDocumentoReferenciaExterna();
                referenciaExterna.setFuncionResumen(contenidoEniV2.getReferenciaExterna().getFuncionResumen());
                referenciaExterna.setValorHuella(contenidoEniV2.getReferenciaExterna().getValorHuella());
                referenciaExterna.setReferencia(contenidoEniV2.getReferenciaExterna().getReferencia());
                contenidoDocumento.setTipoDocumentoReferenciaExterna(referenciaExterna);

            }
        }

        LOG.debug("[FIN] contenidoEniToDocument");
        return contenidoDocumento;
    }


    /*
     * Obtenemos la información de la versión1 del ENI
     * @param contenidoEni
     * @return
     */
    private ObjetoDocumentoContenido getInfoGeneric(Object contenidoEni){

        ObjetoDocumentoContenido contenidoDocumento = null;
        if(contenidoEni instanceof es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido
            || contenidoEni instanceof es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido){

            contenidoDocumento = new ObjetoDocumentoContenido();

            // Realizo un casting de la V1
            es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido contenidoEniV1 =
                    castTipoContenidoToV1(contenidoEni);

            // Obtenemos el nombreFormato
            contenidoDocumento.setNombreFormato(contenidoEniV1.getNombreFormato());

            // Obtenemos el contenido
            if (contenidoEniV1.getDatosXML() != null) {
                contenidoDocumento.setContenido( new ByteArrayInputStream(
                        ConverterUtils.objectXMLToString(contenidoEniV1.getDatosXML()).getBytes() ));
                contenidoDocumento.setMime("application/xml");
                contenidoDocumento.setIdentificadorEnDocumento(contenidoEniV1.getId());
            } else if (contenidoEniV1.getValorBinario() != null) {
                contenidoDocumento.setContenido(new ByteArrayInputStream( contenidoEniV1.getValorBinario() ));
                contenidoDocumento.setMime(ConverterUtils.getMimeByNombreFormato(contenidoEniV1.getNombreFormato()));
                contenidoDocumento.setIdentificadorEnDocumento(StringUtils.isNotEmpty(contenidoEniV1.getId()) ? contenidoEniV1.getId() : "CONTENIDO_DOCUMENTO");
            } else if (contenidoEniV1.getReferenciaFichero() != null) {
                contenidoDocumento.setReferencia(contenidoEniV1.getReferenciaFichero());
                File contenido = new File(contenidoEniV1.getReferenciaFichero());
                if (contenido.exists()) {
                    contenidoDocumento.setMime(ConverterUtils.getMimeByNombreFormato(contenido.getAbsolutePath().substring(
                            contenido.getAbsolutePath().length() - 3, contenido.getAbsolutePath().length())));
                } else {
                    contenidoDocumento.setMime(ConverterUtils.getMimeByNombreFormato(contenidoEniV1.getNombreFormato()));
                }
                contenidoDocumento.setIdentificadorEnDocumento(contenidoEniV1.getId());
            }

        }

        return contenidoDocumento;
    }


    private es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido castTipoContenidoToV1(Object tipoContenido) {

        es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido tipoContenidoV1 =
                new es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido();

        if(tipoContenido instanceof  es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido){

            // Entonces es de la v2
            // Copia de propiedades
            BeanUtils.copyProperties(tipoContenido, tipoContenidoV1);

        }else{

            // Entonces es de la v1
            tipoContenidoV1 = (es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido) tipoContenido;

        }

        return tipoContenidoV1;
    }

    private es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido castTipoContenidoToV2(Object tipoContenido) {

        es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido tipoContenidoV2 =
                new es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido();

        if(tipoContenido instanceof  es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido){

            // Entonces es de la v1
            // Copia de propiedades
            BeanUtils.copyProperties(tipoContenido, tipoContenidoV2);

        }else{

            // Entonces es de la v2
            tipoContenidoV2 = (es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido) tipoContenido;

        }

        return tipoContenidoV2;
    }
}
