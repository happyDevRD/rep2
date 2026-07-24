package es.gob.aapp.libreriaENI.service.impl;


import es.gob.aapp.libreriaENI.converter.expediente.version1.impl.ConverterMetadatoExpedientV1Impl;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.logic.converter.expediente.ConverterExpedient;
import es.gob.aapp.libreriaENI.logic.marshaller.JAXBMarshallerExpedient;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.service.GenerateExpedientENI;
import es.gob.aapp.libreriaENI.util.Converter;
import es.gob.aapp.libreriaENI.util.EnumeracionExpedienteENI;
import es.gob.aapp.libreriaENI.util.XMLUtils;
import es.gob.aapp.libreriaENI.util.file.DataFile;
import es.gob.aapp.libreriaENI.util.file.TemporaryFileInputStream;
import es.gob.aapp.model.eni.v1.expediente.TipoExpediente;
import es.gob.aapp.model.version1.expedienteAdicionales.TipoExpedienteInsideConMAdicionales;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


@Service
public class GenerateExpedientENIImpl implements GenerateExpedientENI {


    private static final Logger LOG = LoggerFactory.getLogger(GenerateExpedientENIImpl.class);

    private static final String NTI_OBLIGATORIO = "La Versión NTI del expediente es obligatorio.";

    @Override
    public InputStream generateENI(ObjetoExpedienteENI objetoExpedienteENI)
            throws IOException, JAXBException, ConverterException, ExpedientENIValidationException {

        LOG.debug("[INI] generateENI");

        File ficheroENI = null;
        EnumeracionExpedienteENI versionENI = getVersionENI(objetoExpedienteENI);
        switch(versionENI) {

            case ENI_V1:

                LOG.info("Se genera el ENI de la versión 1");
                ficheroENI = generateENIV1(objetoExpedienteENI);

                break;

            case ENI_V2:

                LOG.info("Se genera el ENI de la versión 2");
                ficheroENI = generateENIV2(objetoExpedienteENI);

                break;

                default:
                    LOG.error("No hay versión ENI.");

        }

        // 2. Convertimos el contenido en inputStream
        LOG.debug("[FIN] generateENI");
        return new TemporaryFileInputStream(ficheroENI);
    }

    @Override
    public File generateENIToFile(ObjetoExpedienteENI objetoExpedienteENI) throws IOException, JAXBException, ConverterException, ExpedientENIValidationException {
        LOG.debug("[INI] generateENIToFile");

        File ficheroENI = null;
        EnumeracionExpedienteENI versionENI = getVersionENI(objetoExpedienteENI);
        switch(versionENI) {

            case ENI_V1:

                LOG.info("Se genera el ENI de la versión 1");
                ficheroENI = generateENIV1(objetoExpedienteENI);

                break;

            case ENI_V2:

                LOG.info("Se genera el ENI de la versión 2");
                ficheroENI = generateENIV2(objetoExpedienteENI);

                break;

            default:
                LOG.error("No hay versión ENI");

        }

        // 2. Convertimos el contenido en inputStream
        LOG.debug("[FIN] generateENIToFIle");
        return ficheroENI;
    }

    @Override
    public String getIndiceExpediente(ObjetoExpedienteENI objetoExpedienteENI)
            throws ExpedientENIValidationException, IOException, ConverterException, JAXBException {

        LOG.debug("[INI] getIndiceExpediente");

        // Generamos el tipoExpediente
        Object tipoExpediente = ConverterExpedient.expedienteModelToEni(objetoExpedienteENI, null, false);

        EnumeracionExpedienteENI versionENI = getVersionENI(objetoExpedienteENI);
        String data = null;
        switch(versionENI) {

            case ENI_V1:

                TipoExpediente tipoExpedienteV1 = (TipoExpediente) tipoExpediente;
                tipoExpedienteV1.getIndice().setFirmas(null);
                data = JAXBMarshallerExpedient.marshallDataExpedient(
                        tipoExpedienteV1, EnumeracionExpedienteENI.ENI_V1.value());

                break;

            case ENI_V2:

                es.gob.aapp.model.eni.v2.expediente.TipoExpediente tipoExpedienteV2 =
                        (es.gob.aapp.model.eni.v2.expediente.TipoExpediente) tipoExpediente;
                tipoExpedienteV2.getIndice().setFirmas(null);
                data = JAXBMarshallerExpedient.marshallDataExpedient(
                        tipoExpedienteV2, EnumeracionExpedienteENI.ENI_V2.value());

                break;

            default:
                LOG.error("No hay versión ENI");

        }

        LOG.debug("[FIN] getIndiceExpediente");
        if(StringUtils.isNotEmpty(data)) {
            return XMLUtils.incluirNamespacesParaValidarFirma(data, objetoExpedienteENI.getMetadatos().getVersionNTI());
        }

        return data;
    }


    private EnumeracionExpedienteENI getVersionENI (ObjetoExpedienteENI objetoExpedienteENI) throws ExpedientENIValidationException {
        try {
            return EnumeracionExpedienteENI.fromValue( XMLUtils.getVersionNTI(objetoExpedienteENI) );
        }catch(IllegalArgumentException e){
            throw new ExpedientENIValidationException(NTI_OBLIGATORIO);
        }
    }


    private File generateENIV1(ObjetoExpedienteENI objetoExpedienteENI) throws JAXBException, IOException, ConverterException, ExpedientENIValidationException {

        TipoExpedienteInsideConMAdicionales tExpAdi = new TipoExpedienteInsideConMAdicionales();
        ConverterMetadatoExpedientV1Impl converterMetadatoExpedient = new ConverterMetadatoExpedientV1Impl();

        // 1. Convertimos el expediente a TipoDocumentoInsideConMAdicionales
        TipoExpediente tipoExpedienteV1 = ConverterExpedient.expedienteModelToEni(
                objetoExpedienteENI, null, true);

        tExpAdi.setExpediente(tipoExpedienteV1);
        tExpAdi.setMetadatosAdicionales(
                converterMetadatoExpedient.converterMetadatosAdicionalesModelToEni(objetoExpedienteENI.getMetadatos().getMetadatosAdicionales())
        );

        // Realizamos el Marshaller
        String data;
        if (tExpAdi.getMetadatosAdicionales() != null
                && CollectionUtils.isNotEmpty(tExpAdi.getMetadatosAdicionales().getMetadatoAdicional())) {

            data = JAXBMarshallerExpedient.marshallDataExpedient(
                    tExpAdi, objetoExpedienteENI.getMetadatos().getVersionNTI());

        }else{
            data = JAXBMarshallerExpedient.marshallDataExpedient(
                    tExpAdi.getExpediente(), objetoExpedienteENI.getMetadatos().getVersionNTI());

        }

        // Para validar la firma recoger solo el ns7:expediente sin metadatosadicionales
        String dataConFirmaSinIdentar = JAXBMarshallerExpedient.marshallDataExpedient(
                tExpAdi.getExpediente(), objetoExpedienteENI.getMetadatos().getVersionNTI());

        // sustituye el nodo <ns7:expediente por el dataConFirmaSinIdentar que esta sin identar y bien formado
        data = XMLUtils.construirExpedienteENIValido(data, dataConFirmaSinIdentar, objetoExpedienteENI.getMetadatos().getVersionNTI());

        // Se realiza la transformacion de cambio firmabase64 a dsSignature(se comenta porque usamos csv)
        byte[] expedienteENI = Converter.convertFirmaBase64toDSSignature(data.getBytes(StandardCharsets.UTF_8));

        // se crea un fichero temporal para formar el ENI
        File file = DataFile.createTempFile(tExpAdi.getExpediente().getMetadatosExp().getIdentificador());
        FileUtils.writeByteArrayToFile(file, expedienteENI);

        return file;
    }

    private File generateENIV2(ObjetoExpedienteENI objetoExpedienteENI)
            throws JAXBException, IOException, ConverterException, ExpedientENIValidationException {

        // 1. Convertimos el expediente
        es.gob.aapp.model.eni.v2.expediente.TipoExpediente tipoExpedienteV2 = ConverterExpedient.expedienteModelToEni(
                objetoExpedienteENI, null, true);

        // 2. Realizamos el Marshaller
        String data = JAXBMarshallerExpedient.marshallDataExpedient(
                tipoExpedienteV2, objetoExpedienteENI.getMetadatos().getVersionNTI());

        // Para validar la firma recoger solo el ns7:expediente sin metadatosadicionales
        String dataConFirmaSinIdentar = JAXBMarshallerExpedient.marshallDataExpedient(
                tipoExpedienteV2, objetoExpedienteENI.getMetadatos().getVersionNTI());

        // sustituye el nodo <ns7:expediente por el dataConFirmaSinIdentar que esta sin identar y bien formado
        data = XMLUtils.construirExpedienteENIValido(
                data,
                dataConFirmaSinIdentar,
                objetoExpedienteENI.getMetadatos().getVersionNTI());

        // Se realiza la transformacion de cambio firmabase64 a dsSignature
        byte[] expedienteENI = Converter.convertFirmaBase64toDSSignature(data.getBytes(StandardCharsets.UTF_8));

        // se crea un fichero temporal para formar el ENI
        File file = DataFile.createTempFile(tipoExpedienteV2.getMetadatosExp().getIdentificador());
        FileUtils.writeByteArrayToFile(file, expedienteENI);

        return file;
    }
}
