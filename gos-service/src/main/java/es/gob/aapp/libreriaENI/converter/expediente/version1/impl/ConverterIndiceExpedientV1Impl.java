package es.gob.aapp.libreriaENI.converter.expediente.version1.impl;


import es.gob.aapp.libreriaENI.converter.expediente.version1.ConverterIndiceExpedientV1;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.indice.*;
import es.gob.aapp.libreriaENI.util.date.ConverterXmlGregorianCalendar;
import es.gob.aapp.model.eni.v1.expediente.indice.TipoIndice;
import es.gob.aapp.model.eni.v1.expediente.indice.contenido.TipoCarpetaIndizada;
import es.gob.aapp.model.eni.v1.expediente.indice.contenido.TipoDocumentoIndizado;
import es.gob.aapp.model.eni.v1.expediente.indice.contenido.TipoIndiceContenido;
import org.springframework.stereotype.Service;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;


@Service("ConverterIndiceExpedientV1")
public class ConverterIndiceExpedientV1Impl implements ConverterIndiceExpedientV1 {


    private ConverterFirmaExpedientV1Impl converterFirmaExpedient = new ConverterFirmaExpedientV1Impl();

    @Override
    public ObjetoExpedienteIndice converterIndiceEniToModel(TipoIndice indiceEni, boolean expedienteCerrado) throws ConverterException {
        ObjetoExpedienteIndice indice = new ObjetoExpedienteIndice();
        indice.setFirmas(converterFirmaExpedient.converterFirmasEniToModel(indiceEni.getFirmas()));

        indice.setIndiceContenido(contenidoEniToInside(indiceEni.getIndiceContenido(), expedienteCerrado));
        return indice;
    }

    @Override
    public TipoIndice converterIndiceModelToEni(ObjetoExpedienteIndice indice, String identificadorExpediente)
            throws ConverterException {
        TipoIndice indiceEni = new TipoIndice();
        indiceEni.setId("EXP_INDICE_" + identificadorExpediente);
        TipoIndiceContenido indiceContenido = indiceContenidoInsideToEni(indice.getIndiceContenido());
        indiceContenido.setId("EXP_INDICE_CONTENIDO" + identificadorExpediente);
        indiceEni.setIndiceContenido(indiceContenido);
        indiceEni.setFirmas(converterFirmaExpedient.converterFirmasModelToEni(indice.getFirmas()));
        return indiceEni;
    }


    private static ObjetoExpedienteIndiceContenido contenidoEniToInside(TipoIndiceContenido indiceContenido, boolean expedienteCerrado)
            throws ConverterException {

        ObjetoExpedienteIndiceContenido contenido = new ObjetoExpedienteIndiceContenido();

        List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementosIndizados = new ArrayList<>();

        int orden = 1;

        for (Object elementoIndizadoEni : indiceContenido.getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada()) {
            ObjetoExpedienteIndiceContenidoElementoIndizado elementoIndizadoInside = elementoIndizadoEniToInside(elementoIndizadoEni, expedienteCerrado);
            elementoIndizadoInside.setOrden(orden++);
            elementosIndizados.add(elementoIndizadoInside);
        }
        contenido.setElementosIndizados(elementosIndizados);
        contenido.setFechaIndiceElectronico(indiceContenido.getFechaIndiceElectronico().toGregorianCalendar());
        return contenido;
    }


    private static ObjetoExpedienteIndiceContenidoElementoIndizado elementoIndizadoEniToInside(Object elementoIndizadoEni,
                                                                                                     boolean expedienteCerrado) throws ConverterException {
        ObjetoExpedienteIndiceContenidoElementoIndizado elemento;
        if (elementoIndizadoEni instanceof TipoDocumentoIndizado) {
            TipoDocumentoIndizado documentoIndizadoEni = (TipoDocumentoIndizado) elementoIndizadoEni;
            ObjetoExpedienteIndiceContenidoDocumentoIndizado documentoIndizado = new ObjetoExpedienteIndiceContenidoDocumentoIndizado();
            documentoIndizado.setFechaIncorporacionExpediente(
                    compruebaNoNuloNiValorNull(documentoIndizadoEni.getFechaIncorporacionExpediente() + "")
                            ? ConverterXmlGregorianCalendar
                            .calendarToXmlCalendar(documentoIndizadoEni.getFechaIncorporacionExpediente())
                            : null);
            documentoIndizado.setFuncionResumen(documentoIndizadoEni.getFuncionResumen());
            documentoIndizado.setIdentificadorDocumento(documentoIndizadoEni.getIdentificadorDocumento());
            documentoIndizado.setValorHuella(documentoIndizadoEni.getValorHuella());
            documentoIndizado
                    .setOrdenDocumentoExpediente(compruebaNoNuloNiValorNull(documentoIndizadoEni.getOrdenDocumentoExpediente())
                            ? Integer.parseInt(documentoIndizadoEni.getOrdenDocumentoExpediente()) : 0);
            elemento = documentoIndizado;
        } else if (elementoIndizadoEni instanceof TipoCarpetaIndizada) {
            int contadorCarpeta = 1;
            TipoCarpetaIndizada carpetaIndizadaEni = (TipoCarpetaIndizada) elementoIndizadoEni;
            ObjetoExpedienteIndiceContenidoCarpetaIndizada carpetaIndizada = new ObjetoExpedienteIndiceContenidoCarpetaIndizada();
            List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementosIndizados = new ArrayList<>();
            for (Object hijoIndizadoEni : carpetaIndizadaEni.getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada()) {
                ObjetoExpedienteIndiceContenidoElementoIndizado elementoIndizadoInside =
                        elementoIndizadoEniToInside(hijoIndizadoEni, expedienteCerrado);
                elementoIndizadoInside.setOrden(contadorCarpeta++);
                elementosIndizados.add(elementoIndizadoInside);
            }
            carpetaIndizada.setElementosIndizados(elementosIndizados);
            carpetaIndizada.setIdentificadorCarpeta(carpetaIndizadaEni.getIdentificadorCarpeta());
            elemento = carpetaIndizada;
        } else if (elementoIndizadoEni instanceof TipoIndiceContenido) {
            int contadorIndiceContenido = 1;
            TipoIndiceContenido indiceIndizadoEni = (TipoIndiceContenido) elementoIndizadoEni;
            ObjetoExpedienteIndiceContenido indiceIndizado = new ObjetoExpedienteIndiceContenido();
            List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementosIndizados = new ArrayList<>();
            for (Object hijoIndizadoEni : indiceIndizadoEni.getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada()) {
                ObjetoExpedienteIndiceContenidoElementoIndizado elementoIndizadoInside =
                        elementoIndizadoEniToInside(hijoIndizadoEni, expedienteCerrado);
                elementoIndizadoInside.setOrden(contadorIndiceContenido++);
                elementosIndizados.add(elementoIndizadoInside);
            }
            indiceIndizado.setElementosIndizados(elementosIndizados);
            indiceIndizado.setFechaIndiceElectronico(
                    ConverterXmlGregorianCalendar.calendarToXmlCalendar(indiceIndizadoEni.getFechaIndiceElectronico()));
            indiceIndizado.setIdentificadorExpedienteAsociado(indiceIndizadoEni.getId());
            if (!expedienteCerrado)
                indiceIndizado.setTipoAsociacion(ObjetoExpedienteIndiceContenido.TipoAsociacion.VINCULACION);
            elemento = indiceIndizado;
        } else {
            throw new ConverterException("Tipo de elemento no valido " + elementoIndizadoEni.getClass().toString(), false);
        }

        return elemento;
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


    private static boolean compruebaNoNuloNiValorNull(String valor) {
        return valor != null && !valor.equals("null");
    }
}