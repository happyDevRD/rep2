package es.gob.aapp.libreriaENI.converter.expediente.version2;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.model.eni.v2.firma.Firmas;

import java.util.List;

public interface ConverterFirmaExpedientV2 {

    /**
     * Funcionalidad que convierte Firmas en un listado de FirmaENI modelo
     * @param firmas firmas
     * @return List<FirmaENI> listado de firmaENI
     * @throws ConverterException ConverterException
     */
    List<FirmaENI> converterFirmasEniToModel(Firmas firmas) throws ConverterException;


    /**
     * Funcionalidad que convierte un listado de FirmaENI modelo en Firmas
     * @param firmas firmasENI
     * @return Firmas
     * @throws ConverterException ConverterException
     */
    Firmas converterFirmasModelToEni(List<FirmaENI> firmas) throws ConverterException;

}