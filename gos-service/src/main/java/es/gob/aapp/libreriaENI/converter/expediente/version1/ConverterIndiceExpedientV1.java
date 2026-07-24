package es.gob.aapp.libreriaENI.converter.expediente.version1;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndice;
import es.gob.aapp.model.eni.v1.expediente.indice.TipoIndice;

public interface ConverterIndiceExpedientV1 {


    /**
     * Funcionalidad que convierte TipoInside en ObjetoExpedienteIndice del modelo
     * @param indiceEni TipoIndice
     * @param expedienteCerrado boolean si el expediente es cerrado
     * @return ObjetoExpedienteIndice
     * @throws ConverterException ConverterException
     */
    ObjetoExpedienteIndice converterIndiceEniToModel(TipoIndice indiceEni, boolean expedienteCerrado)
            throws ConverterException;


    /**
     * Funcionalidad que convierte un ObjetoExpedienteIndice de indiceENI modelo en TipoIndice
     * @param indice ObjetoExpedienteIndice
     * @param identificadorExpediente identificador del Expediente
     * @return TipoIndice
     * @throws ConverterException ConverterException
     */
    TipoIndice converterIndiceModelToEni(ObjetoExpedienteIndice indice, String identificadorExpediente)
            throws ConverterException;

}