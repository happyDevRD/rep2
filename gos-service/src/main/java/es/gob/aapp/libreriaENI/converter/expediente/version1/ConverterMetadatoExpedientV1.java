package es.gob.aapp.libreriaENI.converter.expediente.version1;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.model.eni.v1.expediente.metadatos.TipoMetadatos;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;

import java.util.List;

public interface ConverterMetadatoExpedientV1 {


    /**
     * Convierte los metadatos del ENI a metadatos de Inside
     * @param metadatosExp metadatosExp de expedientes de version 1
     * @return ObjetoExpedienteMetadatos
     */
    ObjetoExpedienteMetadatos converterMetadatosEniToMetadatos(TipoMetadatos metadatosExp);


    /**
     * Convierte los metadatos del Expediente en MetadatosEni
     * @param metadatosInside metadatosInside
     * @return TipoMetadatos
     * @throws ConverterException ConverterException
     */
    TipoMetadatos converterMetadatosToEni(ObjetoExpedienteMetadatos metadatosInside) throws ConverterException;


    /**
     * Convierte los metadatos Adicionales a TipoMetadatosAdicionales
     * @param metadatosAdicionales metadatosAdicionales
     * @return TipoMetadatosAdicionales
     */
    TipoMetadatosAdicionales converterMetadatosAdicionalesModelToEni(List<ObjetoMetadatoAdicional> metadatosAdicionales);

}