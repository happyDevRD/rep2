package es.gob.aapp.libreriaENI.converter.expediente.version1.impl;


import es.gob.aapp.libreriaENI.converter.expediente.version1.ConverterMetadatoExpedientV1;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatosEnumeracionEstados;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.libreriaENI.util.date.ConverterXmlGregorianCalendar;
import es.gob.aapp.model.eni.v1.expediente.metadatos.EnumeracionEstados;
import es.gob.aapp.model.eni.v1.expediente.metadatos.TipoMetadatos;
import es.gob.aapp.model.version1.metadatosAdicionales.MetadatoAdicional;
import es.gob.aapp.model.version1.metadatosAdicionales.TipoMetadatosAdicionales;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;


@Service("ConverterMetadatoExpedientV1")
public class ConverterMetadatoExpedientV1Impl implements ConverterMetadatoExpedientV1 {

    @Override
    public ObjetoExpedienteMetadatos converterMetadatosEniToMetadatos(TipoMetadatos metadatosExp) {

        //Assert.notNull(metadatosExp, "El TipoMetadatos no puede ser nulo");
        ObjetoExpedienteMetadatos metadatos = new ObjetoExpedienteMetadatos();
        metadatos.setClasificacion(metadatosExp.getClasificacion());
        if(metadatosExp.getEstado() != null && metadatosExp.getEstado().getValue() != null){
            metadatos.setEstado(ObjetoExpedienteMetadatosEnumeracionEstados.fromValue(metadatosExp.getEstado().getValue().value()));
        }
        if(metadatosExp.getFechaAperturaExpediente() != null){
            metadatos.setFechaAperturaExpediente(metadatosExp.getFechaAperturaExpediente().toGregorianCalendar());
        }
        metadatos.setIdentificadorExpediente(metadatosExp.getIdentificador());
        metadatos.setVersionNTI(metadatosExp.getVersionNTI());
        metadatos.setOrgano(metadatosExp.getOrgano());
        metadatos.setInteresado(metadatosExp.getInteresado());
        return metadatos;
    }

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
            metadatosAdicionalesXml.getMetadatoAdicional().add(converterMetadatoInsideToXml(metadatoAdicional));
        }

        return metadatosAdicionalesXml;
    }


    private static MetadatoAdicional converterMetadatoInsideToXml(ObjetoMetadatoAdicional metadatoAdicional) {
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