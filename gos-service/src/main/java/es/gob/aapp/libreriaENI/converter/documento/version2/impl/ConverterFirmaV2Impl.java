package es.gob.aapp.libreriaENI.converter.documento.version2.impl;


import es.gob.aapp.libreriaENI.converter.documento.version2.ConverterFirmaV2;
import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.firma.*;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.util.ConverterUtils;
import es.gob.aapp.libreriaENI.valide.ValideDocumentENI;
import es.gob.aapp.model.eni.v2.firma.Firmas;
import es.gob.aapp.model.eni.v2.firma.TipoFirma;
import es.gob.aapp.model.eni.v2.firma.TipoFirmasElectronicas;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;


@Service("converterFirmaV2")
public class ConverterFirmaV2Impl implements ConverterFirmaV2 {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterFirmaV2Impl.class);


    @Override
    public Firmas firmasDocumentToEni(List<FirmaENI> firmas) throws DocumentConverterException {

        LOG.debug("[INI] firmasToEni");

        // Según el ENI del documento, si no existen firmas NO deberá incluirse el nodo Firmas.
        // El nodo Firmas sin ningún nodo Firma dentro es INCORRECTO.
        Firmas firmasEni = null;

        if (CollectionUtils.isNotEmpty(firmas)) {
            firmasEni = new Firmas();
            for (FirmaENI firmaENI : firmas) {
                firmasEni.getFirma().add(firmaInsideToEni(firmaENI));
            }
        }

        LOG.debug("[FIN] firmasToEni");
        return firmasEni;
    }


    @Override
    public Firmas converterFirma(ObjetoDocumentoENI objetoDocumentoENI) throws IOException, DocumentENIValidationException {

        LOG.debug("[INI] converterFirma");

        Firmas firmas = null;

        List<FirmaENI> listadoFirma = objetoDocumentoENI.getFirmas();

        // Se comprueba que no hay ninguna firma con EnumeracionDocumentoTipoFirma "SinFirmar", al ser así, se intenta crear el documento ENI
        // sin firmar.
        if(isFirmaSinFirmar(listadoFirma)){

            // Si es un documento sin firmar, se valida para saber si es correcto.
            ValideDocumentENI.validaSinFirmarENI(objetoDocumentoENI);

        }else{

            // El documento tiene firma.
            firmas = new Firmas();

            TipoFirmasElectronicas tipoFirmasElectronicas;
            int contadorFirma = 0;
            for(FirmaENI firmaENI : listadoFirma){

                tipoFirmasElectronicas = new TipoFirmasElectronicas();
                tipoFirmasElectronicas.setId("FIRMA_"+contadorFirma);

                // Obtenemos la firma
                TipoFirma tipoFirma = converterFirmaToModel(firmaENI.getEnumeracionDocumentoTipoFirma());
                tipoFirmasElectronicas.setTipoFirma(tipoFirma);

                TipoFirmasElectronicas.ContenidoFirma contenidoFirma = new TipoFirmasElectronicas.ContenidoFirma();

                // Si es una firma CSV
                if (tipoFirma == TipoFirma.TF_01) {

                    // Se valida que los campos correspondiente se encuentren rellenos
                    ValideDocumentENI.validaFirmaCSVENI(objetoDocumentoENI);

                    TipoFirmasElectronicas.ContenidoFirma.CSV firmaConCSV = new TipoFirmasElectronicas.ContenidoFirma.CSV();
                    firmaConCSV.setRegulacionGeneracionCSV(firmaENI.getRegulacionCsv());
                    firmaConCSV.setValorCSV(firmaENI.getCsv());

                    contenidoFirma.setCSV(firmaConCSV);
                    tipoFirmasElectronicas.setContenidoFirma(contenidoFirma);
                    firmas.getFirma().add(tipoFirmasElectronicas);
                }

                // Si es una firma Pades o si es una firma XAdES_Detached
                // o si es una firma XAdES_Enveloped o si es una firma CAdES Attached/Implicit
                if (tipoFirma == TipoFirma.TF_08 || tipoFirma == TipoFirma.TF_06 || tipoFirma == TipoFirma.TF_02
                        || tipoFirma == TipoFirma.TF_03 || tipoFirma == TipoFirma.TF_05) {

                    TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificado = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();
                    firmaConCertificado.setReferenciaFirma("#CONTENIDO_DOCUMENTO");
                    contenidoFirma.setFirmaConCertificado(firmaConCertificado);

                    tipoFirmasElectronicas.setContenidoFirma(contenidoFirma);
                    firmas.getFirma().add(tipoFirmasElectronicas);
                }

                // Si es una firma Manifest
                if (tipoFirma == TipoFirma.TF_07){

                    // Se valida que los campos correspondiente se encuentren rellenos
                    ValideDocumentENI.validaFirmaTF07ENI(objetoDocumentoENI);

                    TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificado = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();

                    // Se comprueba si la firma ya esta en base64
                    byte[] contFirma = IOUtils.toByteArray( firmaENI.getFirma() );
                    firmaConCertificado.setFirmaBase64(contFirma);
                    contenidoFirma.setFirmaConCertificado(firmaConCertificado);
                    tipoFirmasElectronicas.setContenidoFirma(contenidoFirma);
                    firmas.getFirma().add(tipoFirmasElectronicas);
                }

                contadorFirma++;
            }
        }

        LOG.debug("[FIN] converterFirma");
        return firmas;
    }


    private TipoFirmasElectronicas firmaInsideToEni(FirmaENI firmaENI) throws DocumentConverterException {

        LOG.debug("[INI] firmaInsideToEni");

        if(firmaENI == null) {
        	//Assert.notNull(firmaENI, "firmaENI no puede ser nulo");
        	System.err.println("firmaENI no puede ser nulo");
        }
        

        TipoFirmasElectronicas firma = new TipoFirmasElectronicas();
        if (StringUtils.isNotEmpty(firmaENI.getRef())) {
            firma.setRef(firmaENI.getRef());
        }

        firma.setContenidoFirma(contenidoFirmaDocumentToEni(firmaENI.getContenidoFirmaDocument()));
        firma.setId(firmaENI.getIdentificadorEnDocumento());
        firma.setTipoFirma(TipoFirma.fromValue(firmaENI.getEnumeracionDocumentoTipoFirma().value()));

        LOG.debug("[FIN] firmaInsideToEni");
        return firma;
    }

    private TipoFirmasElectronicas.ContenidoFirma contenidoFirmaDocumentToEni(ContenidoFirmaDocument contenidoFirmaInside)
            throws DocumentConverterException {

        TipoFirmasElectronicas.ContenidoFirma contenidoFirmaEni = new TipoFirmasElectronicas.ContenidoFirma();

        if(contenidoFirmaInside == null) {
        	//Assert.notNull(contenidoFirmaInside, "ContenidoFirmaInside no puede ser nulo");
        	System.err.println("ContenidoFirmaInside no puede ser nulo");
        }
        

        if (contenidoFirmaInside instanceof ContenidoFirmaCertificadoContenidoBinario) {
            ContenidoFirmaCertificadoContenidoBinario contenidoCertificadoBinario = (ContenidoFirmaCertificadoContenidoBinario) contenidoFirmaInside;
            TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificadoEni = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();
            firmaConCertificadoEni.setFirmaBase64(contenidoCertificadoBinario.getValorBinario());
            // No se añade en Base64
            contenidoFirmaEni.setFirmaConCertificado(firmaConCertificadoEni);
        } else if (contenidoFirmaInside instanceof ContenidoFirmaCertificadoDsSignature) {
            ContenidoFirmaCertificadoDsSignature contenidoCertificadoSignature = (ContenidoFirmaCertificadoDsSignature) contenidoFirmaInside;
            TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificadoEni = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();
            try {
                firmaConCertificadoEni.setSignature(
                        ConverterUtils.arrayOfBytesToSignature(contenidoCertificadoSignature.getValorBinario()));
            } catch (JAXBException e) {
                throw new DocumentConverterException("Error convirtiendo el contenido del Signature a SignatureType ", e);
            }
            contenidoFirmaEni.setFirmaConCertificado(firmaConCertificadoEni);
        } else if (contenidoFirmaInside instanceof ContenidoFirmaCSV) {
            ContenidoFirmaCSV contenidoFirmaInsideCSV = (ContenidoFirmaCSV) contenidoFirmaInside;
            TipoFirmasElectronicas.ContenidoFirma.CSV csvEni = new TipoFirmasElectronicas.ContenidoFirma.CSV();
            csvEni.setValorCSV(contenidoFirmaInsideCSV.getValorCSV());
            csvEni.setRegulacionGeneracionCSV(contenidoFirmaInsideCSV.getRegulacionGeneracionCSV());
            contenidoFirmaEni.setCSV(csvEni);
        } else if (contenidoFirmaInside instanceof ContenidoFirmaCertificadoReferencia) {
            ContenidoFirmaCertificadoReferencia contenidoFirmaInsideReferencia = (ContenidoFirmaCertificadoReferencia) contenidoFirmaInside;
            TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificadoEni = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();
            firmaConCertificadoEni.setReferenciaFirma(contenidoFirmaInsideReferencia.getReferenciaFirma());
            contenidoFirmaEni.setFirmaConCertificado(firmaConCertificadoEni);
        } else {
            throw new DocumentConverterException(
                    "No sé como convertir una firma de tipo " + contenidoFirmaInside.getClass() + " a ENI");
        }

        return contenidoFirmaEni;
    }


    /*
     * Se comprueba si existe alguna firma con EnumeracionDocumentoTipoFirma "Sin_Firmar"
     * @param listadoFirma listado de firmas
     * @return boolean
     */
    private boolean isFirmaSinFirmar(List<FirmaENI> listadoFirma){

        for(FirmaENI firma : listadoFirma){

            if(firma.getEnumeracionDocumentoTipoFirma().equals(EnumeracionDocumentoTipoFirma.SIN_FIRMAR)){
                return true;
            }

        }

        return false;
    }


    private TipoFirma converterFirmaToModel(EnumeracionDocumentoTipoFirma enumeracionDocumentoTipoFirma) {

        if (!enumeracionDocumentoTipoFirma.value().equals(EnumeracionDocumentoTipoFirma.SIN_FIRMAR.value())) {
            return TipoFirma.fromValue(enumeracionDocumentoTipoFirma.value());
        }

        return null;
    }

}
