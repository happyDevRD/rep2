package es.gob.aapp.libreriaENI.service.impl;

import es.gob.aapp.libreriaENI.logic.converter.documento.ConverterDocumento;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.logic.marshaller.JAXBMarshallerDocument;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.service.GenerateDocumentENI;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoENI;
import es.gob.aapp.libreriaENI.util.XMLUtils;
import es.gob.aapp.libreriaENI.util.file.TemporaryFileInputStream;
import es.gob.aapp.model.version1.documentoAdicionales.TipoDocumentoInsideConMAdicionales;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


@Service
public class GenerateDocumentENIImpl implements GenerateDocumentENI {


    private static final Logger LOG = LoggerFactory.getLogger(GenerateDocumentENIImpl.class);

    private static final String NAMESPACE_DOCUMENTO_ELEC_V1 = EnumeracionDocumentoENI.ENI_V1.value();
    private static final String NAMESPACE_DOCUMENTO_ELEC_V2 = EnumeracionDocumentoENI.ENI_V2.value();
    private static final String NAMESPACE_WEBSERVICE = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService";
    private static final String DOCUMENTO = "documento";


    @Override
    public InputStream generateENI(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException, DatatypeConfigurationException, IOException, JAXBException {

        LOG.debug("[INI] generateENI");

        EnumeracionDocumentoENI versionENI;
        try {
            versionENI = EnumeracionDocumentoENI.fromValue( XMLUtils.getVersionNTI(objetoDocumentoENI) );
        }catch(IllegalArgumentException e){
            throw new DocumentENIValidationException("La Versión NTI del documento es obligatorio.");
        }

        File ficheroENI = null;
        switch(versionENI) {

            case ENI_V1:

                LOG.info("Se genera el ENI de la versión 1");
                ficheroENI = generateENIV1(objetoDocumentoENI);

                break;

            case ENI_V2:

                LOG.info("Se genera el ENI de la versión 2");
                ficheroENI = generateENIV2(objetoDocumentoENI);

                break;

                default:
                    LOG.error("No hay versión ENI");

        }

        // 2. Convertimos el contenido en inputStream
        LOG.debug("[FIN] generateENI");
        return new TemporaryFileInputStream(ficheroENI);
    }

    @Override
    public File generateENIToFile(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException, DatatypeConfigurationException, IOException, JAXBException {

        LOG.debug("[INI] generateENIToFIle");

        EnumeracionDocumentoENI versionENI;
        try {
            versionENI = EnumeracionDocumentoENI.fromValue( XMLUtils.getVersionNTI(objetoDocumentoENI) );
        }catch(IllegalArgumentException e){
            throw new DocumentENIValidationException("La Versión NTI del documento es obligatorio.");
        }

        File ficheroENI = null;
        switch(versionENI) {

            case ENI_V1:

                LOG.info("Se genera el ENI de la versión 1");
                ficheroENI = generateENIV1(objetoDocumentoENI);

                break;

            case ENI_V2:

                LOG.info("Se genera el ENI de la versión 2");
                ficheroENI = generateENIV2(objetoDocumentoENI);

                break;

            default:
                LOG.error("No hay versión ENI");

        }

        LOG.debug("[FIN] generateENIToFIle");
        return ficheroENI;
    }


    private File generateENIV1(ObjetoDocumentoENI objetoDocumentoENI) throws JAXBException, IOException, DatatypeConfigurationException, DocumentENIValidationException {

        // 1. Convertimos el documento a TipoDocumentoInsideConMAdicionales
        TipoDocumentoInsideConMAdicionales tipoDocumentoInsideConMAdicionales =
                ConverterDocumento.converterDocumentToENI(objetoDocumentoENI);

        TipoMetadatosAdicionales tipoMetadatosAdicionales = tipoDocumentoInsideConMAdicionales.getMetadatosAdicionales();
        if(tipoMetadatosAdicionales != null && CollectionUtils.isNotEmpty(tipoMetadatosAdicionales.getMetadatoAdicional())) {

            // Con Metadatos Adicionales
            return JAXBMarshallerDocument.marshallDataDocument(
                    objetoDocumentoENI.getMetadatos().getIdentificadorDocumento(),
                    tipoDocumentoInsideConMAdicionales,
                    NAMESPACE_WEBSERVICE, DOCUMENTO, "insidews");
        }else{

            // Sin Metadatos Adicionales
            return JAXBMarshallerDocument.marshallDataDocument(
                    objetoDocumentoENI.getMetadatos().getIdentificadorDocumento(),
                    tipoDocumentoInsideConMAdicionales.getDocumento(),
                    NAMESPACE_DOCUMENTO_ELEC_V1, DOCUMENTO, "enidoc");
        }

    }


    private File generateENIV2(ObjetoDocumentoENI objetoDocumentoENI) throws JAXBException, IOException, DatatypeConfigurationException, DocumentENIValidationException {

        // 1. Convertimos el documento a TipoDocumento
        es.gob.aapp.model.eni.v2.documento.TipoDocumento tipoDocumento
                = ConverterDocumento.converterDocumentToENI(objetoDocumentoENI);

        return JAXBMarshallerDocument.marshallDataDocument(tipoDocumento.getMetadatos().getIdentificador(),
                tipoDocumento, NAMESPACE_DOCUMENTO_ELEC_V2, DOCUMENTO, "enidoc" );

    }

}
