package es.gob.aapp.libreriaENI.valide;


import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.util.EnumeracionExpedienteENI;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Clase que valida el expediente ENI que recibimos
 */
public class ValideExpedientENI {

    private ValideExpedientENI(){}

    private static final Logger LOG = LoggerFactory.getLogger(ValideExpedientENI.class);


    /**
     * Funcionalidad para validar el objeto objetoExpedienteENI
     * @param objetoExpedienteENI objetoExpedienteENI
     * @param valideSign boolean para validar si contiene firma o no
     * @throws ExpedientENIValidationException exception
     */
    public static void validaExpedientENI(ObjetoExpedienteENI objetoExpedienteENI, boolean valideSign)
            throws ExpedientENIValidationException {

        LOG.debug("[INI] validaExpedientENI");

        // Validamos el indice
        if(objetoExpedienteENI.getIndice() == null){
            LOG.error("El expediente ENI debe contener indice.");
            throw new ExpedientENIValidationException("El expediente ENI debe contener indice.");
        }

        // Obtenemos los metadatos
        ObjetoExpedienteMetadatos metadatos = objetoExpedienteENI.getMetadatos();

        if(metadatos == null){
            LOG.error("El expediente ENI debe contener metadatos.");
            throw new ExpedientENIValidationException("El expediente ENI debe contener metadatos.");
        }

        // Validamos el identificador
        if(StringUtils.isEmpty( metadatos.getIdentificadorExpediente() )){
           LOG.error("El Identificador del expediente es obligatorio.");
           throw new ExpedientENIValidationException("El Identificador del expediente es obligatorio.");
        }

        // Validamos la versionNTI
        if(StringUtils.isEmpty( metadatos.getVersionNTI() )){
            LOG.error("La Versión NTI del expediente es obligatorio.");
            throw new ExpedientENIValidationException("La Versión NTI del expediente es obligatorio.");
        } else{
            try {
                EnumeracionExpedienteENI.fromValue(metadatos.getVersionNTI());
            }catch(IllegalArgumentException e){
                throw new ExpedientENIValidationException("La Versión NTI no es correcta.");
            }
        }

        // Validamos los organos
        if(CollectionUtils.isEmpty(metadatos.getOrgano())){
           LOG.error("Debe de contener como mínimo un organo en el expediente.");
           throw new ExpedientENIValidationException("Debe de contener como mínimo un organo en el expediente.");
        }

        // Validamos la fecha captura
        if(metadatos.getFechaAperturaExpediente() == null){
           LOG.error("La Fecha Apertura del expediente es obligatorio.");
           throw new ExpedientENIValidationException("La Fecha Apertura del expediente es obligatorio.");
        }

        // Validamos la Clasificacion
        if(metadatos.getClasificacion() == null){
            LOG.error("La Clasificacion o Codigo Procedimiento del expediente es obligatorio.");
            throw new ExpedientENIValidationException("La Clasificacion o Codigo Procedimiento del expediente es obligatorio.");
        }

        // Validamos el Estado
        if(metadatos.getEstado() == null){
           LOG.error("El Estado del expediente es obligatorio.");
           throw new ExpedientENIValidationException("El Estado del expediente es obligatorio.");
        }

        // Validamos el tipo Firma
        if (valideSign && CollectionUtils.isEmpty(objetoExpedienteENI.getIndice().getFirmas())) {
            LOG.error("Debe estar firmado el expediente.");
            throw new ExpedientENIValidationException("Debe estar firmado el expediente.");
        }


        LOG.debug("[FIN] validaExpedientENI");
    }

}
