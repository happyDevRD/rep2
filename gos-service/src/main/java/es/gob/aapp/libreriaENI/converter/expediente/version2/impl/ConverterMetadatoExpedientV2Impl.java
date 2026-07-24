package es.gob.aapp.libreriaENI.converter.expediente.version2.impl;


import es.gob.aapp.libreriaENI.converter.expediente.version2.ConverterMetadatoExpedientV2;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.libreriaENI.util.date.ConverterXmlGregorianCalendar;
import es.gob.aapp.model.eni.v2.expediente.MetadatoAdicional;
import es.gob.aapp.model.eni.v2.expediente.TipoMetadatosAdicionales;
import es.gob.aapp.model.eni.v2.expediente.metadatos.EnumeracionEstados;
import es.gob.aapp.model.eni.v2.expediente.metadatos.TipoMetadatos;
import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;


@Service("ConverterMetadatoExpedientV2")
public class ConverterMetadatoExpedientV2Impl implements ConverterMetadatoExpedientV2 {


    @Override
    public TipoMetadatos converterMetadatosToEni(ObjetoExpedienteMetadatos metadatosExpediente) throws ConverterException {
        //Assert.notNull(metadatosExpediente, "ObjetoExpedienteMetadatos no puede ser nulo");
        TipoMetadatos metadatos = new TipoMetadatos();
        metadatos.setClasificacion(metadatosExpediente.getClasificacion());
        TipoMetadatos.Estado estado = new TipoMetadatos.Estado();
        estado.setValue(EnumeracionEstados.fromValue(metadatosExpediente.getEstado().value()));
        metadatos.setEstado(estado);
        try {
            metadatos.setFechaAperturaExpediente(ConverterXmlGregorianCalendar.calendarToXmlCalendar(metadatosExpediente.getFechaAperturaExpediente()));
        } catch (DatatypeConfigurationException e) {
            throw new ConverterException("No se puede convertir la fecha: " + metadatosExpediente.getFechaAperturaExpediente(), e, true);
        }
        metadatos.setId("EXP_" + metadatosExpediente.getIdentificadorExpediente() + "_METADATOS");
        metadatos.setIdentificador(metadatosExpediente.getIdentificadorExpediente());
        metadatos.setVersionNTI(metadatosExpediente.getVersionNTI());
        metadatos.getInteresado().addAll(metadatosExpediente.getInteresado());
        metadatos.getOrgano().addAll(metadatosExpediente.getOrgano());

        return metadatos;
    }

    @Override
    public TipoMetadatosAdicionales converterMetadatosAdicionalesModelToEni(List<ObjetoMetadatoAdicional> metadatosAdicionales)
    {
        TipoMetadatosAdicionales metadatosAdicionalesXml = new TipoMetadatosAdicionales();
        for (ObjetoMetadatoAdicional metadatoAdicional : metadatosAdicionales) {
            metadatosAdicionalesXml.getMetadatoAdicional().add(metadatoInsideToXml(metadatoAdicional));
        }

        return metadatosAdicionalesXml;
    }


    private static MetadatoAdicional metadatoInsideToXml(ObjetoMetadatoAdicional metadatoAdicional) {
        MetadatoAdicional metadatoAdicionalXml = new MetadatoAdicional();
        metadatoAdicionalXml.setNombre(metadatoAdicional.getNombre());
        if(metadatoAdicional.getTipo()!=null)
            metadatoAdicionalXml.setTipo(metadatoAdicional.getTipo());
        else{
            metadatoAdicionalXml.setTipo("string");
        }
        metadatoAdicionalXml.setValor(metadatoAdicional.getValor());
        return metadatoAdicionalXml;
    }

}