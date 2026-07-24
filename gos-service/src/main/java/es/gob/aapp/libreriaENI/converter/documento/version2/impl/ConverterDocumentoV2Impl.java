package es.gob.aapp.libreriaENI.converter.documento.version2.impl;


import es.gob.aapp.libreriaENI.converter.documento.version2.ConverterDocumentoV2;
import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.contenido.TipoDocumentoReferenciaExterna;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.valide.ValideDocumentENI;
import es.gob.aapp.model.eni.v2.documento.MetadatoAdicional;
import es.gob.aapp.model.eni.v2.documento.TipoDocumento;
import es.gob.aapp.model.eni.v2.documento.TipoMetadatosAdicionales;
import es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido;
import es.gob.aapp.model.eni.v2.documento.contenido.TipoReferenciaExterna;
import es.gob.aapp.model.eni.v2.documento.metadatos.EnumeracionEstadoElaboracion;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoDocumental;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoEstadoElaboracion;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoMetadatos;
import es.gob.aapp.model.eni.v2.firma.Firmas;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;


@Service("converterDocumentoV2")
public class ConverterDocumentoV2Impl implements ConverterDocumentoV2 {

    private static final Logger LOG = LoggerFactory.getLogger(ConverterDocumentoV2Impl.class);

    private ConverterContenidoV2Impl converterContenidoV2 = new ConverterContenidoV2Impl();

    @Override
    public TipoDocumento converterDocumentToENI(ObjetoDocumentoENI objetoDocumentoENI)
            throws DatatypeConfigurationException, IOException, DocumentENIValidationException {

        LOG.debug("[INI] converterDocumentToENI");

        // Antes de convertir, validamos que el documento sea correcto
        ValideDocumentENI.validaDocumentENI(objetoDocumentoENI);

        // Convertirmos el Documento
        TipoDocumento tipoDocumento = new TipoDocumento();

        // Obtenemos la Firma
        tipoDocumento.setFirmas( new ConverterFirmaV2Impl().converterFirma(objetoDocumentoENI) );
        tipoDocumento.setId( objetoDocumentoENI.getMetadatos().getIdentificadorDocumento() );

        // Obtenemos los Metadatos
        tipoDocumento.setMetadatos(getMetadatosENI(objetoDocumentoENI.getMetadatos()));

        // Obtenemos los Metadatos Adicionales
        if(CollectionUtils.isNotEmpty(objetoDocumentoENI.getMetadatos().getMetadatosAdicionales())){

            // Si conteniene Metadatos Adicionales
            tipoDocumento.setMetadatosAdicionales(getMetadatosAdicENI(objetoDocumentoENI));

        }

        // Finalmente, obtenemos el contenido
        TipoContenido tipoContenido = new TipoContenido();
        tipoContenido.setId("CONTENIDO_DOCUMENTO");

        // Nombre formato del Contenido
        tipoContenido.setNombreFormato(objetoDocumentoENI.getContenidoDocumento().getNombreFormato());

        // Contenido, se puede dar el caso que no contenga el valor Binario pero sí, la referencia Externa
        if(objetoDocumentoENI.getContenidoDocumento().getContenido() != null){
            tipoContenido.setValorBinario( IOUtils.toByteArray(objetoDocumentoENI.getContenidoDocumento().getContenido()) );
        }else{

            // Copio las propiedades
            TipoReferenciaExterna tipoReferenciaExterna = copyPropertiesReferenciaExterna( objetoDocumentoENI.getContenidoDocumento().getTipoDocumentoReferenciaExterna() );
            tipoContenido.setReferenciaExterna(tipoReferenciaExterna);

        }
        tipoDocumento.setContenido(tipoContenido);

        LOG.debug("[FIN] converterDocumentToENI");
        return tipoDocumento;
    }


    @Override
    public TipoDocumento documentoToEni(ObjetoDocumentoENI objetoDocumentoENI, byte[] bytesContenido) throws DocumentConverterException, IOException {

        LOG.debug("[INI] documentoToEni");

        TipoDocumento documentoEni = new TipoDocumento();

        //comprobamos si contiene firma Manifest
        if (objetoDocumentoENI.getFirmas() != null) {
            for (FirmaENI firmaDocument : objetoDocumentoENI.getFirmas()) {
                if (!firmaDocument.getEnumeracionDocumentoTipoFirma().equals(EnumeracionDocumentoTipoFirma.TF_07)) {
                    bytesContenido = null;
                }
            }
        }

        TipoContenido contenidoEni = converterContenidoV2.contenidoDocumentToEni(objetoDocumentoENI.getContenidoDocumento(), bytesContenido);
        documentoEni.setContenido(contenidoEni);

        Firmas firmasEni = new Firmas();

        // Documento Firmado
        if (objetoDocumentoENI.getFirmas() != null) {
            firmasEni = new ConverterFirmaV2Impl().firmasDocumentToEni(objetoDocumentoENI.getFirmas());
        }

        documentoEni.setFirmas(firmasEni);
        documentoEni.setId(objetoDocumentoENI.getMetadatos().getIdentificadorDocumento());
        documentoEni.setMetadatos(new ConverterMetadatosV2Impl().metadatosDocumentToEni(objetoDocumentoENI.getMetadatos()));

        LOG.debug("[FIN] documentoToEni");
        return documentoEni;
    }



    private TipoMetadatos getMetadatosENI(ObjetoDocumentoMetadatos objetoDocumentoMetadatos) throws DatatypeConfigurationException {

        LOG.debug("[INI] getMetadatosENI");

        TipoMetadatos tipoMetadatos = new TipoMetadatos();

        tipoMetadatos.setId(objetoDocumentoMetadatos.getIdentificadorDocumento() + "_METADATOS");
        tipoMetadatos.setIdentificador(objetoDocumentoMetadatos.getIdentificadorDocumento());

        // Para la versión NTI
        tipoMetadatos.setVersionNTI(objetoDocumentoMetadatos.getVersionNTI());

        // Para Origen Ciudadano
        tipoMetadatos.setOrigenCiudadanoAdministracion( objetoDocumentoMetadatos.getOrigenCiudadanoAdministracion());

        // Para los órganos
        tipoMetadatos.getOrgano().addAll(objetoDocumentoMetadatos.getOrgano());

        // Para el Estado Elaboración
        TipoEstadoElaboracion tipoEstadoElaboracion = new TipoEstadoElaboracion();
        tipoEstadoElaboracion.setValorEstadoElaboracion(
                EnumeracionEstadoElaboracion.fromValue(objetoDocumentoMetadatos.getEstadoElaboracion().getValorEstadoElaboracion().value()));
        tipoMetadatos.setEstadoElaboracion(tipoEstadoElaboracion);

        // Para el Tipo Documental
        tipoMetadatos.setTipoDocumental(TipoDocumental.fromValue(objetoDocumentoMetadatos.getTipoDocumental().value()));

        // Para la Fecha
        XMLGregorianCalendar xmlGregCal = DatatypeFactory
                                .newInstance()
                                .newXMLGregorianCalendar( objetoDocumentoMetadatos.getFechaCaptura() );

        tipoMetadatos.setFechaCaptura(xmlGregCal);

        LOG.debug("[FIN] getMetadatosENI");
        return tipoMetadatos;
    }


    private TipoMetadatosAdicionales getMetadatosAdicENI(ObjetoDocumentoENI objetoDocumentoENI) {

        LOG.debug("[INI] getMetadatosAdicENI");

        TipoMetadatosAdicionales tipoMetadatosAdicionales = new TipoMetadatosAdicionales();
        for(ObjetoMetadatoAdicional objetoMetadatoAdicional : objetoDocumentoENI.getMetadatos().getMetadatosAdicionales()){

            MetadatoAdicional metadatoAdicional = new MetadatoAdicional();
            metadatoAdicional.setNombre(objetoMetadatoAdicional.getNombre());
            metadatoAdicional.setTipo(objetoMetadatoAdicional.getTipo());
            metadatoAdicional.setValor(objetoMetadatoAdicional.getValor());

            tipoMetadatosAdicionales.getMetadatoAdicional().add(metadatoAdicional);
        }

        LOG.debug("[FIN] getMetadatosAdicENI");
        return tipoMetadatosAdicionales;
    }

    private TipoReferenciaExterna copyPropertiesReferenciaExterna(TipoDocumentoReferenciaExterna tipoDocumentoReferenciaExterna){

        // Copio las propiedades
        TipoReferenciaExterna tipoReferenciaExterna = new TipoReferenciaExterna();
        BeanUtils.copyProperties(tipoDocumentoReferenciaExterna, tipoReferenciaExterna);

        return tipoReferenciaExterna;
    }

}