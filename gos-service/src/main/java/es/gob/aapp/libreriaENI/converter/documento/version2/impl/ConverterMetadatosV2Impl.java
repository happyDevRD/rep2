package es.gob.aapp.libreriaENI.converter.documento.version2.impl;


import es.gob.aapp.libreriaENI.converter.documento.version2.ConverterMetadatosV2;
import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.model.eni.v2.documento.metadatos.EnumeracionEstadoElaboracion;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoDocumental;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoEstadoElaboracion;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoMetadatos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


@Service("converterMetadatosV2")
public class ConverterMetadatosV2Impl implements ConverterMetadatosV2 {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterMetadatosV2Impl.class);


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
        	System.err.println("ObjetoDocumentoMetadatos no puede ser nulo");
        	//Assert.notNull(metadatosDocument, "ObjetoDocumentoMetadatos no puede ser nulo");
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
        metadatosEni.setOrigenCiudadanoAdministracion(metadatosDocument.getOrigenCiudadanoAdministracion());
        metadatosEni.setTipoDocumental(TipoDocumental.fromValue(metadatosDocument.getTipoDocumental().value()));
        metadatosEni.setVersionNTI(metadatosDocument.getVersionNTI());
        metadatosEni.getOrgano().addAll(metadatosDocument.getOrgano());

        LOG.debug("[FIN] metadatosDocumentToEni");
        return metadatosEni;
    }

}
