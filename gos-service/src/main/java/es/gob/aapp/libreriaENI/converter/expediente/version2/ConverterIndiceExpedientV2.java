package es.gob.aapp.libreriaENI.converter.expediente.version2;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndice;
import es.gob.aapp.model.eni.v2.expediente.indice.TipoIndice;

public interface ConverterIndiceExpedientV2 {

    /**
     * Funcionalidad que convierte un ObjetoExpedienteIndice de indiceENI modelo en TipoIndice
     * @param indice ObjetoExpedienteIndice
     * @param identificadorExpediente identificador expediente
     * @return TipoIndice
     * @throws ConverterException ConverterException
     */
    TipoIndice converterIndiceModelToEni(ObjetoExpedienteIndice indice, String identificadorExpediente)
            throws ConverterException;

}