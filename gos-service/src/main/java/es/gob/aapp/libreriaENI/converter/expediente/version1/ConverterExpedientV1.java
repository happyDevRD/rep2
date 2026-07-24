package es.gob.aapp.libreriaENI.converter.expediente.version1;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.model.eni.v1.expediente.TipoExpediente;
import java.io.File;
import java.io.IOException;

public interface ConverterExpedientV1 {


    /**
     * Crea un ObjetoExpedienteENI a partir de un TipoExpediente(Eni) de entrada
     *
     * @param expedienteEni expedienteEni
     * @return ObjetoExpedienteENI
     * @throws ConverterException ConverterException
     */
    ObjetoExpedienteENI converterExpedienteEniToModel(TipoExpediente expedienteEni) throws ConverterException;


    /**
     * Funcionalidad que convierte ObjetoExpedienteENI a TipoExpediente del ENI
     * @param expedienteEni ObjetoExpedienteENI
     * @param fileContenido fichero contenido (opcional)
     * @param valideSign boolean para validar si contiene firma o no
     * @return TipoExpediente
     * @throws ConverterException ConverterException
     * @throws IOException IOException
     * @throws ExpedientENIValidationException ExpedientENIValidationException
     */
    TipoExpediente converterExpedienteModelToEni(ObjetoExpedienteENI expedienteEni, File fileContenido, boolean valideSign)
            throws ConverterException, IOException, ExpedientENIValidationException;

}