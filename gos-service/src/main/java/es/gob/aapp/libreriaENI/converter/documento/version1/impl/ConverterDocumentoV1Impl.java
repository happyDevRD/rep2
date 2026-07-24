package es.gob.aapp.libreriaENI.converter.documento.version1.impl;

import es.gob.aapp.libreriaENI.converter.documento.version1.ConverterDocumentoV1;
import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.valide.ValideDocumentENI;
import es.gob.aapp.model.version1.documentoAdicionales.TipoDocumentoInsideConMAdicionales;
import es.gob.aapp.model.eni.v1.documento.TipoDocumento;
import es.gob.aapp.model.eni.v1.documento.contenido.TipoContenido;
import es.gob.aapp.model.eni.v1.documento.metadatos.EnumeracionEstadoElaboracion;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoDocumental;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoEstadoElaboracion;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoMetadatos;
import es.gob.aapp.model.eni.v1.firma.Firmas;
import es.gob.aapp.model.version1.metadatosAdicionales.MetadatoAdicional;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.IOException;

@Service("ConverterDocumentoV1")
public class ConverterDocumentoV1Impl implements ConverterDocumentoV1 {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterDocumentoV1Impl.class);


    @Override
    public TipoDocumentoInsideConMAdicionales converterDocumentToENI(ObjetoDocumentoENI objetoDocumentoENI)
            throws DatatypeConfigurationException, IOException, DocumentENIValidationException {

        LOG.debug("[INI] converterDocumentToENI");

        // Antes de convertir, validamos que el documento sea correcto
        ValideDocumentENI.validaDocumentENI(objetoDocumentoENI);

        // Convertirmos el Documento
        TipoDocumentoInsideConMAdicionales tipoDocumentoInsideConMAdicionales = new TipoDocumentoInsideConMAdicionales();
        TipoDocumento tipoDocumento = new TipoDocumento();

        // Obtenemos la Firma
        tipoDocumento.setFirmas( new ConverterFirmaV1Impl().converterFirma(objetoDocumentoENI) );
        tipoDocumento.setId( objetoDocumentoENI.getMetadatos().getIdentificadorDocumento() );

        // Obtenemos los Metadatos
        tipoDocumento.setMetadatos(getMetadatosENI(objetoDocumentoENI.getMetadatos()));

        // Cargamos el Tipo Documento
        tipoDocumentoInsideConMAdicionales.setDocumento(tipoDocumento);

        // Obtenemos los Metadatos Adicionales
        if(CollectionUtils.isNotEmpty(objetoDocumentoENI.getMetadatos().getMetadatosAdicionales())){

            // Si conteniene Metadatos Adicionales
            tipoDocumentoInsideConMAdicionales.setMetadatosAdicionales( getMetadatosAdicENI(objetoDocumentoENI) );
        }

        // Finalmente, obtenemos el contenido
        TipoContenido tipoContenido = new TipoContenido();
        tipoContenido.setId("CONTENIDO_DOCUMENTO");

        // Nombre formato del Contenido
        tipoContenido.setNombreFormato(objetoDocumentoENI.getContenidoDocumento().getNombreFormato());

        // Contenido
        tipoContenido.setValorBinario( IOUtils.toByteArray(objetoDocumentoENI.getContenidoDocumento().getContenido()) );
        tipoDocumento.setContenido(tipoContenido);

        LOG.debug("[FIN] converterDocumentToENI");
        return tipoDocumentoInsideConMAdicionales;
    }

    @Override
    public TipoDocumentoInsideConMAdicionales documentoToConMAdicionales(ObjetoDocumentoENI documentoENI, byte[] bytesContenido) throws DocumentConverterException, IOException {

        LOG.debug("[INI] documentoToConMAdicionales");

        TipoDocumentoInsideConMAdicionales documentoConMAdicionales = new TipoDocumentoInsideConMAdicionales();
        documentoConMAdicionales.setDocumento(documentoToEni(documentoENI, bytesContenido));
        documentoConMAdicionales.setMetadatosAdicionales(new ConverterMetadatosV1Impl()
                .metadatosAdicionalesDocumentToXml(documentoENI.getMetadatos().getMetadatosAdicionales()));

        LOG.debug("[FIN] documentoToConMAdicionales");
        return documentoConMAdicionales;
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

        TipoContenido contenidoEni = new ConverterContenidoV1Impl().contenidoDocumentToEni(objetoDocumentoENI.getContenidoDocumento(), bytesContenido);
        documentoEni.setContenido(contenidoEni);

        Firmas firmasEni = new Firmas();

        // Documento Firmado
        if (objetoDocumentoENI.getFirmas() != null) {
            firmasEni = new ConverterFirmaV1Impl().firmasDocumentToEni(objetoDocumentoENI.getFirmas());
        }

        documentoEni.setFirmas(firmasEni);
        documentoEni.setId(objetoDocumentoENI.getMetadatos().getIdentificadorDocumento());
        documentoEni.setMetadatos(new ConverterMetadatosV1Impl().metadatosDocumentToEni(objetoDocumentoENI.getMetadatos()));

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
        tipoMetadatos.setFechaCaptura(
                DatatypeFactory.newInstance().newXMLGregorianCalendar(objetoDocumentoMetadatos.getFechaCaptura()));

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

}