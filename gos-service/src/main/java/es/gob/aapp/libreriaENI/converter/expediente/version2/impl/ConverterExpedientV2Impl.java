package es.gob.aapp.libreriaENI.converter.expediente.version2.impl;

import es.gob.aapp.libreriaENI.converter.documento.version2.impl.ConverterContenidoV2Impl;
import es.gob.aapp.libreriaENI.converter.expediente.version2.ConverterExpedientV2;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.valide.ValideExpedientENI;
import es.gob.aapp.model.eni.v2.expediente.TipoExpediente;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service("ConverterExpedientV2")
public class ConverterExpedientV2Impl implements ConverterExpedientV2 {

    private ConverterMetadatoExpedientV2Impl converterMetadatoExpedient = new ConverterMetadatoExpedientV2Impl();
    private ConverterIndiceExpedientV2Impl converterIndiceExpedient = new ConverterIndiceExpedientV2Impl();
    private ConverterContenidoV2Impl converterContenidoDocument = new ConverterContenidoV2Impl();


    @Override
    public TipoExpediente converterExpedienteModelToEni(ObjetoExpedienteENI expediente, File fileContenido, boolean valideSign)
            throws ConverterException, IOException, ExpedientENIValidationException {

        TipoExpediente expedienteEni = new TipoExpediente();

        // Antes de convertir, validamos que el expediente sea correcto
        ValideExpedientENI.validaExpedientENI(expediente, valideSign);

        String identificador = expediente.getMetadatos().getIdentificadorExpediente();

        // Indice
        expedienteEni.setIndice(
                converterIndiceExpedient.converterIndiceModelToEni(expediente.getIndice(), identificador));

        // Metadatos
        expedienteEni.setMetadatosExp(
                converterMetadatoExpedient.converterMetadatosToEni(expediente.getMetadatos()));

        // Metadatos Adicionales
        if (CollectionUtils.isNotEmpty(expediente.getMetadatos().getMetadatosAdicionales())) {
            expedienteEni.setMetadatosAdicionales(
                    converterMetadatoExpedient.converterMetadatosAdicionalesModelToEni(
                            expediente.getMetadatos().getMetadatosAdicionales())
            );
        }

        // Visualizacion
        if (expediente.getVisualizacionIndice() != null) {
            expedienteEni.setVisualizacionIndice(
                    converterContenidoDocument.contenidoDocumentToEni(expediente.getVisualizacionIndice(), fileContenido));
        }

        return expedienteEni;
    }

}