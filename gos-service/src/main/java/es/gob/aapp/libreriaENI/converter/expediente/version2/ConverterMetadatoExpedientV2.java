package es.gob.aapp.libreriaENI.converter.expediente.version2;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.model.eni.v2.expediente.TipoMetadatosAdicionales;
import es.gob.aapp.model.eni.v2.expediente.metadatos.TipoMetadatos;

import java.util.List;

public interface ConverterMetadatoExpedientV2 {


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