package es.gob.aapp.libreriaENI.converter.expediente.version1.impl;

import es.gob.aapp.libreriaENI.converter.documento.version1.impl.ConverterContenidoV1Impl;
import es.gob.aapp.libreriaENI.converter.expediente.version1.ConverterExpedientV1;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.valide.ValideExpedientENI;
import es.gob.aapp.model.eni.v1.expediente.TipoExpediente;
import es.gob.aapp.model.eni.v1.expediente.metadatos.EnumeracionEstados;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;

@Service("ConverterExpedientV1")
public class ConverterExpedientV1Impl implements ConverterExpedientV1 {


    private ConverterMetadatoExpedientV1Impl converterMetadatoExpedient = new ConverterMetadatoExpedientV1Impl();
    private ConverterIndiceExpedientV1Impl converterIndiceExpedient = new ConverterIndiceExpedientV1Impl();
    private ConverterContenidoV1Impl converterContenidoDocument = new ConverterContenidoV1Impl();


    @Override
    public ObjetoExpedienteENI converterExpedienteEniToModel(TipoExpediente expedienteEni) throws ConverterException {

        ObjetoExpedienteENI expediente = new ObjetoExpedienteENI();
        if (expedienteEni.getMetadatosExp().getIdentificador() == null) {
            throw new ConverterException("El identificador de los metadatos del expediente no puede estar vacio", true);
        }

        boolean expedienteCerrado = false;
        if (expedienteEni.getMetadatosExp().getEstado().getValue().equals(EnumeracionEstados.E_02))
            expedienteCerrado = true;


        expediente.setIndice(converterIndiceExpedient.converterIndiceEniToModel(expedienteEni.getIndice(), expedienteCerrado));

        if (expedienteEni.getVisualizacionIndice() != null) {
            expediente.setVisualizacionIndice(
                    converterContenidoDocument.contenidoEniToDocument(expedienteEni.getVisualizacionIndice()));
        }

        // Metadatos
        expediente.setMetadatos(
                converterMetadatoExpedient.converterMetadatosEniToMetadatos(expedienteEni.getMetadatosExp()));

        return expediente;
    }

    @Override
    public TipoExpediente converterExpedienteModelToEni(ObjetoExpedienteENI expediente, File fileContenido, boolean valideSign)
            throws ConverterException, IOException, ExpedientENIValidationException {

        TipoExpediente expedienteEni = new TipoExpediente();

        // Antes de convertir, validamos que el expediente sea correcto
        ValideExpedientENI.validaExpedientENI(expediente, valideSign);

        String identificador = expediente.getMetadatos().getIdentificadorExpediente();
        expedienteEni.setIndice(converterIndiceExpedient.converterIndiceModelToEni(expediente.getIndice(), identificador));
        expedienteEni.setMetadatosExp(converterMetadatoExpedient.converterMetadatosToEni(expediente.getMetadatos()));

        if (expediente.getVisualizacionIndice() != null) {
            expedienteEni.setVisualizacionIndice(
                    converterContenidoDocument.contenidoDocumentToEni(expediente.getVisualizacionIndice(), fileContenido));
        }
        return expedienteEni;
    }

}