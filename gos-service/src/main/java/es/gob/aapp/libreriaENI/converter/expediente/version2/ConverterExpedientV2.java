package es.gob.aapp.libreriaENI.converter.expediente.version2;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.model.eni.v2.expediente.TipoExpediente;
import java.io.File;
import java.io.IOException;

public interface ConverterExpedientV2 {


    /**
     * Crea un TipoExpediente a partir de un ObjetoExpedienteENI model de entrada
     * @param expedienteEni expedienteEni
     * @param fileContenido fileContenido (opcional)
     * @param valideSign boolean para validar si contiene firma o no
     * @return TipoExpediente
     * @throws ConverterException ConverterException
     * @throws IOException IOException
     * @throws ExpedientENIValidationException ExpedientENIValidationException
     */
    TipoExpediente converterExpedienteModelToEni(ObjetoExpedienteENI expedienteEni, File fileContenido, boolean valideSign)
            throws ConverterException, IOException, ExpedientENIValidationException;

}