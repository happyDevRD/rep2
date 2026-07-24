package es.gob.aapp.libreriaENI.converter.expediente.version2.impl;


import es.gob.aapp.libreriaENI.converter.expediente.version2.ConverterIndiceExpedientV2;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.indice.*;
import es.gob.aapp.libreriaENI.util.date.ConverterXmlGregorianCalendar;
import es.gob.aapp.model.eni.v2.expediente.indice.TipoIndice;
import es.gob.aapp.model.eni.v2.expediente.indice.contenido.TipoCarpetaIndizada;
import es.gob.aapp.model.eni.v2.expediente.indice.contenido.TipoDocumentoIndizado;
import es.gob.aapp.model.eni.v2.expediente.indice.contenido.TipoIndiceContenido;
import org.springframework.stereotype.Service;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Collections;
import java.util.GregorianCalendar;


@Service("ConverterIndiceExpedientV2")
public class ConverterIndiceExpedientV2Impl implements ConverterIndiceExpedientV2 {


    private ConverterFirmaExpedientV2Impl converterFirmaExpedient = new ConverterFirmaExpedientV2Impl();


    @Override
    public TipoIndice converterIndiceModelToEni(ObjetoExpedienteIndice indice, String identificadorExpediente) throws ConverterException {
        TipoIndice indiceEni = new TipoIndice();
        indiceEni.setId("EXP_INDICE_" + identificadorExpediente);
        TipoIndiceContenido indiceContenido = indiceContenidoInsideToEni(indice.getIndiceContenido());
        indiceContenido.setId("EXP_INDICE_CONTENIDO" + identificadorExpediente);
        indiceEni.setIndiceContenido(indiceContenido);
        indiceEni.setFirmas(converterFirmaExpedient.converterFirmasModelToEni(indice.getFirmas()));
        return indiceEni;
    }


    private static TipoIndiceContenido indiceContenidoInsideToEni(ObjetoExpedienteIndiceContenido indiceContenido)
            throws ConverterException {

        TipoIndiceContenido contenidoIndiceEni = new TipoIndiceContenido();
        try {
            contenidoIndiceEni.setFechaIndiceElectronico(
                    ConverterXmlGregorianCalendar.calendarToXmlCalendar(indiceContenido.getFechaIndiceElectronico()));
            contenidoIndiceEni.setId(indiceContenido.getIdentificadorExpedienteAsociado());
        } catch (DatatypeConfigurationException e) {
            throw new ConverterException("No se puede convertir la fecha de indice electronico", e, true);
        }

        // ordenamos la lista por el orden de los elementos, por si alguien
        // no nos la ha dado bien
        Collections.sort(indiceContenido.getElementosIndizados(),
                new ObjetoExpedienteIndiceElementoIndizadoOrdenComparator());

        for (ObjetoExpedienteIndiceContenidoElementoIndizado elemento_indizado : indiceContenido
                .getElementosIndizados()) {
            contenidoIndiceEni.getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada()
                    .add(elementoIndizadoInsideToEni(elemento_indizado));
        }

        return contenidoIndiceEni;
    }


    private static Object elementoIndizadoInsideToEni(ObjetoExpedienteIndiceContenidoElementoIndizado elementoIndizado)
            throws ConverterException {

        if (elementoIndizado instanceof ObjetoExpedienteIndiceContenido) {
            return indiceContenidoInsideToEni((ObjetoExpedienteIndiceContenido) elementoIndizado);
        } else if (elementoIndizado instanceof ObjetoExpedienteIndiceContenidoCarpetaIndizada) {
            ObjetoExpedienteIndiceContenidoCarpetaIndizada carpetaIndizadaInside = (ObjetoExpedienteIndiceContenidoCarpetaIndizada) elementoIndizado;
            TipoCarpetaIndizada carpetaIndizadaEni = new TipoCarpetaIndizada();
            carpetaIndizadaEni.setIdentificadorCarpeta(carpetaIndizadaInside.getIdentificadorCarpeta());
            for (ObjetoExpedienteIndiceContenidoElementoIndizado hijoIndizado : carpetaIndizadaInside
                    .getElementosIndizados()) {
                carpetaIndizadaEni.getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada()
                        .add(elementoIndizadoInsideToEni(hijoIndizado));
            }
            return carpetaIndizadaEni;
        } else if (elementoIndizado instanceof ObjetoExpedienteIndiceContenidoDocumentoIndizado) {
            ObjetoExpedienteIndiceContenidoDocumentoIndizado documentoIndizado = (ObjetoExpedienteIndiceContenidoDocumentoIndizado) elementoIndizado;
            TipoDocumentoIndizado documentoIndizadoEni = new TipoDocumentoIndizado();

            if (documentoIndizado.getFechaIncorporacionExpediente() != null) {
                GregorianCalendar fechaIncorporacionExpediente = new GregorianCalendar();
                fechaIncorporacionExpediente
                        .setTimeInMillis(documentoIndizado.getFechaIncorporacionExpediente().getTimeInMillis());
                try {
                    documentoIndizadoEni.setFechaIncorporacionExpediente(
                            ConverterXmlGregorianCalendar.calendarToXmlCalendar(fechaIncorporacionExpediente));
                } catch (DatatypeConfigurationException e) {
                    throw new ConverterException(e);
                }
            }

            documentoIndizadoEni.setFuncionResumen(documentoIndizado.getFuncionResumen());
            documentoIndizadoEni.setIdentificadorDocumento(documentoIndizado.getIdentificadorDocumento());
            documentoIndizadoEni.setNombreNatural(documentoIndizado.getNombreNatural());
            documentoIndizadoEni.setValorHuella(documentoIndizado.getValorHuella());
            documentoIndizadoEni.setOrdenDocumentoExpediente(
                    Integer.toString(((ObjetoExpedienteIndiceContenidoDocumentoIndizado) elementoIndizado)
                            .getOrdenDocumentoExpediente()));
            return documentoIndizadoEni;
        } else {
            throw new ConverterException("No se como convertir un objeto de tipo " + elementoIndizado.getClass()
                    + " a un elemento indizado del Eni", false);
        }
    }

}