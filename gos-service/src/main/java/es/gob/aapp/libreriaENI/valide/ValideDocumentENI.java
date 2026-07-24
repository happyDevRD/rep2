package es.gob.aapp.libreriaENI.valide;


import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoENI;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Clase que valida el documentENI que recibimos
 */
public class ValideDocumentENI {

    private ValideDocumentENI(){}

    private static final Logger LOG = LoggerFactory.getLogger(ValideDocumentENI.class);

    private static final String ESTADO_ELABORACION_OTROS = "EE99";

    /**
     * Funcionalidad para validar el objeto objetoDocumentoENI
     * @param objetoDocumentoENI objetoDocumentoENI
     * @throws DocumentENIValidationException exception
     */
    public static void validaDocumentENI(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException {

        LOG.debug("[INI] validaDocumentENI");

        // Obtenemos los metadatos
        ObjetoDocumentoMetadatos metadatos = objetoDocumentoENI.getMetadatos();

        if(metadatos == null){
            LOG.error("El documento ENI debe contener metadatos.");
            throw new DocumentENIValidationException("El documento ENI debe contener metadatos.");
        }

        // Validamos el identificador
        if(StringUtils.isEmpty( metadatos.getIdentificadorDocumento() )){
           LOG.error("El Identificador del documento es obligatorio.");
           throw new DocumentENIValidationException("El Identificador del documento es obligatorio.");
        }

        // Validamos la versionNTI
        EnumeracionDocumentoENI versionNti;
        if(StringUtils.isEmpty( metadatos.getVersionNTI() )){

            LOG.error("La Versión NTI del documento es obligatorio.");
            throw new DocumentENIValidationException("La Versión NTI del documento es obligatorio.");
        } else{

            try {
                versionNti = EnumeracionDocumentoENI.fromValue(metadatos.getVersionNTI());
            }catch(IllegalArgumentException e){
                throw new DocumentENIValidationException("La Versión NTI no es correcta.");
            }
        }

        // Validamos que exista el fichero del contenido o referencia externa
        if( versionNti.value().equals(EnumeracionDocumentoENI.ENI_V1.value())
                    && objetoDocumentoENI.getContenidoDocumento().getContenido() == null ){

            LOG.error("El contenido del documento es obligatorio.");
            throw new DocumentENIValidationException("El contenido del documento es obligatorio.");
        }else{

            // Es la version2, nos puedes llegar el contenido o la referenciaExterna
            if(objetoDocumentoENI.getContenidoDocumento().getContenido() == null
                    && objetoDocumentoENI.getContenidoDocumento().getTipoDocumentoReferenciaExterna() == null){

                LOG.error("El contenido del documento o Referencia Externa es obligatorio.");
                throw new DocumentENIValidationException("El contenido del documento o Referencia Externa es obligatorio.");
            }

        }

        // Nombre de formato del contenido
        if(StringUtils.isEmpty( objetoDocumentoENI.getContenidoDocumento().getNombreFormato() )){
           LOG.error("El Formato del contenido es obligatorio.");
           throw new DocumentENIValidationException("El Formato del contenido es obligatorio.");
        }

        // Validamos los organos
        if(CollectionUtils.isEmpty(metadatos.getOrgano())){
           LOG.error("Debe de contener como mínimo un organo en el documento.");
           throw new DocumentENIValidationException("Debe de contener como mínimo un organo en el documento.");
        }

        // Validamos la fecha captura
        if(metadatos.getFechaCaptura() == null){
           LOG.error("La Fecha Captura del documento es obligatorio.");
           throw new DocumentENIValidationException("La Fecha Captura del documento es obligatorio.");
        }

        // Validamos el Tipo Documental
        if(metadatos.getTipoDocumental() == null){
           LOG.error("El Tipo Documental del documento es obligatorio.");
           throw new DocumentENIValidationException("El Tipo Documental del documento es obligatorio.");
        }

        // Validamos el Estado Elaboracion
        if(metadatos.getEstadoElaboracion() == null
                || metadatos.getEstadoElaboracion().getValorEstadoElaboracion() == null){
           LOG.error("El Estado Elaboracion del documento es obligatorio.");
           throw new DocumentENIValidationException("El Estado Elaboracion del documento es obligatorio.");
        }

        // Validamos el tipo Firma
        validaFirma(objetoDocumentoENI);

        LOG.debug("[FIN] validaDocumentENI");
    }

    /**
     * Funcionalidad que valida que al menos el objetoDocumentoENI tenga una firma y
     * además, el Tipo Firma esté relleno.
     * @param objetoDocumentoENI objetoDocumentoENI
     * @throws DocumentENIValidationException expection
     */
    private static void validaFirma(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException {

        if(CollectionUtils.isEmpty(objetoDocumentoENI.getFirmas())){

            LOG.error("Al menos debe de tener una firma el documento.");
            throw new DocumentENIValidationException("Al menos debe de tener una firma el documento.");

        }else{

            for(FirmaENI firmaENI : objetoDocumentoENI.getFirmas()){

                if(firmaENI.getEnumeracionDocumentoTipoFirma() == null ){
                    LOG.error("El Tipo Firma del documento es obligatorio.");
                    throw new DocumentENIValidationException("El Tipo Firma del documento es obligatorio.");
                }
            }
        }
    }


    /**
     * Funcionalidad para validar el contenido cuando se intenta generar un documento ENI sin firmar.
     * @param objetoDocumentoENI objetoDocumentoENI
     * @throws DocumentENIValidationException exception
     */
    public static void validaSinFirmarENI(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException {

        if(! objetoDocumentoENI.getMetadatos().getEstadoElaboracion().getValorEstadoElaboracion().value().equals(ESTADO_ELABORACION_OTROS) ){
            LOG.error("Debe elegir el Estado Elaboracion Otros (" +
                    ESTADO_ELABORACION_OTROS + ") para guardar un documento sin Firmar");
            throw new DocumentENIValidationException("Debe elegir el Estado Elaboracion Otros (" +
                    ESTADO_ELABORACION_OTROS + ") para guardar un documento sin Firmar");

        }
    }

    /**
     * Funcionalidad para validar el contenido cuando se intenta generar un documento ENI con firma CSV
     * @param objetoDocumentoENI objetoDocumentoENI
     * @throws DocumentENIValidationException exception
     */
    public static void validaFirmaCSVENI(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException {

        for(FirmaENI firmaENI : objetoDocumentoENI.getFirmas()){

            if(StringUtils.isEmpty(firmaENI.getCsv()) || StringUtils.isEmpty(firmaENI.getRegulacionCsv())){
                LOG.error("El CSV y Regulación CSV del documento es obligatorio " +
                        "para guardar un documento con firma CSV");
                throw new DocumentENIValidationException("El CSV y Regulacion CSV del documento es obligatorio " +
                        "para guardar un documento con firma CSV");

            }

        }
    }

    /**
     * Funcionalidad para validar el contenido cuando se intenta generar un documento ENI con firma TF07
     * @param objetoDocumentoENI objetoDocumentoENI
     * @throws DocumentENIValidationException exception
     */
    public static void validaFirmaTF07ENI(ObjetoDocumentoENI objetoDocumentoENI) throws DocumentENIValidationException {

        // Debe existir el contenido de la firma
        for(FirmaENI firmaENI : objetoDocumentoENI.getFirmas()){

            if(firmaENI.getFirma() == null){
                LOG.error("El contenido de la firma del documento es obligatorio " +
                        "para guardar un documento con firma TF07");
                throw new DocumentENIValidationException("El contenido de la firma del documento es obligatorio " +
                        "para guardar un documento con firma TF07");
            }
        }

    }

}
