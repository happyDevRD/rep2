package es.gob.aapp.libreriaENI.converter.expediente.version1;


import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.model.eni.v1.firma.Firmas;

import java.util.List;

public interface ConverterFirmaExpedientV1 {

    /**
     * Funcionalidad que convierte Firmas en un listado de FirmaENI modelo
     * @param firmas Firmas
     * @return List<FirmaENI>
     * @throws ConverterException ConverterException
     */
    List<FirmaENI> converterFirmasEniToModel(Firmas firmas) throws ConverterException;

    /**
     * Funcionalidad que convierte un listado de FirmaENI modelo en Firmas
     * @param firmas List<FirmaENI>
     * @return Firmas
     * @throws ConverterException ConverterException
     */
    Firmas converterFirmasModelToEni(List<FirmaENI> firmas) throws ConverterException;

}