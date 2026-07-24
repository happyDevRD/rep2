package es.gob.aapp.libreriaENI.converter.documento.version1.impl;


import es.gob.aapp.libreriaENI.converter.documento.version1.ConverterMetadatosV1;
import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.model.eni.v1.documento.metadatos.EnumeracionEstadoElaboracion;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoDocumental;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoEstadoElaboracion;
import es.gob.aapp.model.eni.v1.documento.metadatos.TipoMetadatos;
import es.gob.aapp.model.version1.metadatosAdicionales.MetadatoAdicional;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;


@Service("ConverterMetadatosV1")
public class ConverterMetadatosV1Impl implements ConverterMetadatosV1 {

    private static final Logger LOG = LoggerFactory.getLogger(ConverterMetadatosV1Impl.class);


    /**
     * Convierte los metadatos de un Documento al objeto Eni
     * @param metadatosDocument metadatosDocument
     * @return TipoMetadatos
     * @throws DocumentConverterException DocumentConverterException
     */
    @Override
    public TipoMetadatos metadatosDocumentToEni(ObjetoDocumentoMetadatos metadatosDocument) throws DocumentConverterException {

        LOG.debug("[INI] metadatosDocumentToEni");
        if(metadatosDocument == null) {
        	//Assert.notNull(metadatosDocument, "ObjetoDocumentoMetadatos no puede ser nulo");
        	System.err.println("ObjetoDocumentoMetadatos no puede ser nulo");
        }
        
        TipoMetadatos metadatosEni = new TipoMetadatos();
        TipoEstadoElaboracion estadoElaboracion = new TipoEstadoElaboracion();
        if(metadatosDocument.getEstadoElaboracion() != null){
            estadoElaboracion.setValorEstadoElaboracion(EnumeracionEstadoElaboracion.fromValue(metadatosDocument.getEstadoElaboracion().getValorEstadoElaboracion().value()));
            estadoElaboracion.setIdentificadorDocumentoOrigen(metadatosDocument.getEstadoElaboracion().getIdentificadorDocumentoOrigen());
        }
        metadatosEni.setEstadoElaboracion(estadoElaboracion);

        try {
            XMLGregorianCalendar xmlGregCal = DatatypeFactory
                                            .newInstance()
                                            .newXMLGregorianCalendar( metadatosDocument.getFechaCaptura() );
            metadatosEni.setFechaCaptura(xmlGregCal);
        } catch (DatatypeConfigurationException e) {
            throw new DocumentConverterException("Error al convertir la fecha de captura", e, false);
        }
        metadatosEni.setIdentificador(metadatosDocument.getIdentificadorDocumento());
        metadatosEni.setId("DOC_" + metadatosDocument.getIdentificadorDocumento() + "_METADATOS");
        metadatosEni.setOrigenCiudadanoAdministracion( metadatosDocument.getOrigenCiudadanoAdministracion());
        metadatosEni.setTipoDocumental(TipoDocumental.fromValue(metadatosDocument.getTipoDocumental().value()));
        metadatosEni.setVersionNTI(metadatosDocument.getVersionNTI());
        metadatosEni.getOrgano().addAll(metadatosDocument.getOrgano());

        LOG.debug("[FIN] metadatosDocumentToEni");
        return metadatosEni;
    }


    /**
     * Convierte los metadatos Adicionales V1 a un mensaje
     * MetadatosAdicionales modelo
     * @param metadatosAdicionales metadatosAdicionales
     * @return TipoMetadatosAdicionales
     */
    @Override
    public TipoMetadatosAdicionales metadatosAdicionalesDocumentToXml(List<ObjetoMetadatoAdicional> metadatosAdicionales) {

        LOG.debug("[INI] metadatosAdicionalesDocumentToXml");

        TipoMetadatosAdicionales metadatosAdicionalesXml = null;
        if(CollectionUtils.isNotEmpty(metadatosAdicionales)){

            metadatosAdicionalesXml = new TipoMetadatosAdicionales();
            for (ObjetoMetadatoAdicional metadatoAdicional : metadatosAdicionales) {
                metadatosAdicionalesXml.getMetadatoAdicional().add(metadatoDocumentToXml(metadatoAdicional));
            }

        }

        LOG.debug("[FIN] metadatosAdicionalesDocumentToXml");
        return metadatosAdicionalesXml;
    }


    /*
     * Convierte un metadatoAdicional del modelo a un
     * mensaje MetadatoAdicional
     * @param metadatoAdicional
     * @return
     */
    private MetadatoAdicional metadatoDocumentToXml(ObjetoMetadatoAdicional metadatoAdicional) {
        MetadatoAdicional metadatoAdicionalXml = new MetadatoAdicional();
        metadatoAdicionalXml.setNombre(metadatoAdicional.getNombre());
        if(metadatoAdicional.getTipo()!=null)
            metadatoAdicionalXml.setTipo(metadatoAdicional.getTipo());
        else{
            metadatoAdicionalXml.setTipo("string");
        }
        metadatoAdicionalXml.setValor(metadatoAdicional.getValor());
        return metadatoAdicionalXml;
    }

}
