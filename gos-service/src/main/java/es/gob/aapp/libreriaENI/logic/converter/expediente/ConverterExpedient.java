package es.gob.aapp.libreriaENI.logic.converter.expediente;


import es.gob.aapp.libreriaENI.converter.expediente.version1.impl.ConverterExpedientV1Impl;
import es.gob.aapp.libreriaENI.converter.expediente.version2.impl.ConverterExpedientV2Impl;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.util.EnumeracionExpedienteENI;
import es.gob.aapp.libreriaENI.util.XMLUtils;

import java.io.File;
import java.io.IOException;


/**
 * Parte donde se decide la conversion que se realiza, si en v1 o en v2
 */
@SuppressWarnings("unchecked")
public class ConverterExpedient {

    private ConverterExpedient(){}


    private static ConverterExpedientV1Impl converterExpedienteV1 = new ConverterExpedientV1Impl();
    private static ConverterExpedientV2Impl converterExpedienteV2 = new ConverterExpedientV2Impl();


    /**
     * Funcionalidad para convertir un expediente de ObjetoExpedienteENI al ENI
     * @param expedienteEni expedienteEni
     * @param fileContenido contenido firmado
     * @param valideSign validar si contiene firma
     * @return <T> objeto ENI
     * @throws ConverterException ConverterException
     * @throws IOException IOException
     * @throws ExpedientENIValidationException ExpedientENIValidationException
     */
    public static <T> T expedienteModelToEni(ObjetoExpedienteENI expedienteEni, File fileContenido, boolean valideSign)
            throws ConverterException, IOException, ExpedientENIValidationException {

        // Obtenemos la versionNTI
        String versionNTI = XMLUtils.getVersionNTI(expedienteEni);

        T tipoExpediente = null;
        if(EnumeracionExpedienteENI.isEniV1(versionNTI)){

            //Version 1
            tipoExpediente = (T) converterExpedienteV1.converterExpedienteModelToEni(expedienteEni, fileContenido, valideSign);

        }else if(EnumeracionExpedienteENI.isEniV2(versionNTI)){

            //Version 2
            tipoExpediente = (T) converterExpedienteV2.converterExpedienteModelToEni(expedienteEni, fileContenido, valideSign);
        }

        return tipoExpediente;
    }

}
