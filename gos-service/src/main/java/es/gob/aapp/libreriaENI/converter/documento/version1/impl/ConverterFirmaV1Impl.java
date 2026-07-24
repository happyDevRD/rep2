package es.gob.aapp.libreriaENI.converter.documento.version1.impl;


import es.gob.aapp.libreriaENI.converter.documento.version1.ConverterFirmaV1;
import es.gob.aapp.libreriaENI.exception.document.DocumentConverterException;
import es.gob.aapp.libreriaENI.exception.document.DocumentENIValidationException;
import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.firma.*;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.util.ConverterUtils;
import es.gob.aapp.libreriaENI.valide.ValideDocumentENI;
import es.gob.aapp.model.eni.v1.firma.Firmas;
import es.gob.aapp.model.eni.v1.firma.TipoFirma;
import es.gob.aapp.model.eni.v1.firma.TipoFirmasElectronicas;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service("ConverterFirmaV1")
public class ConverterFirmaV1Impl implements ConverterFirmaV1 {


    private static final Logger LOG = LoggerFactory.getLogger(ConverterFirmaV1Impl.class);


    @Override
    public List<FirmaENI> firmasEniToDocument(Firmas firmas) throws DocumentConverterException {

        // Según el ENI del documento, si no existen firmas NO deberá incluirse el nodo Firmas.
        List<FirmaENI> firmasInside = null;
        if (firmas != null) {
            firmasInside = new ArrayList<>();
            for (TipoFirmasElectronicas firmaEni : firmas.getFirma()) {
                firmasInside.add(firmaEniToDocument(firmaEni, firmas.getFirma().indexOf(firmaEni)));
            }
        }

        return firmasInside;
    }


    /**
     * Convierte las firmas del Objeto en Firmas del ENI V1
     * @param firmas listado de firmas
     * @return Firmas
     */
    @Override
    public Firmas firmasDocumentToEni(List<FirmaENI> firmas) throws DocumentConverterException {

        LOG.debug("[INI] firmasToEni");

        // Según el ENI del documento, si no existen firmas NO deberá incluirse el nodo Firmas.
        // El nodo Firmas sin ningún nodo Firma dentro es INCORRECTO.
        Firmas firmasEni = null;

        if (CollectionUtils.isNotEmpty(firmas)) {
            firmasEni = new Firmas();
            for (FirmaENI firmaENI : firmas) {
                firmasEni.getFirma().add(firmaDocumentToEni(firmaENI));
            }
        }

        LOG.debug("[FIN] firmasToEni");
        return firmasEni;
    }


    /**
     * Convierte en objetoDocumentoENI en Firmas del ENI V1
     * @param objetoDocumentoENI objetoDocumentoENI
     * @return Firmas
     * @throws IOException IOException
     * @throws DocumentENIValidationException DocumentENIValidationException
     */
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
                if (tipoFirma == TipoFirma.TF_06 || tipoFirma == TipoFirma.TF_02
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


    private TipoFirmasElectronicas firmaDocumentToEni(FirmaENI firmaENI) throws DocumentConverterException {

        LOG.debug("[INI] firmaInsideToEni");

        if(firmaENI == null) {
        	//Assert.notNull(firmaENI, "firmaENI no puede ser nulo");
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

        if(contenidoFirmaInside == null){
        	//Assert.notNull(contenidoFirmaInside, "ContenidoFirmaInside no puede ser nulo");
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


    private ContenidoFirmaDocument contenidoFirmaEniToDocument(TipoFirmasElectronicas.ContenidoFirma contenidoFirmaEni,
                                                                    TipoFirma tipoFirma) throws DocumentConverterException {

        ContenidoFirmaDocument contenidoFirmaDocument = null;

        if (contenidoFirmaEni != null && contenidoFirmaEni.getFirmaConCertificado() != null) {

            if (contenidoFirmaEni.getFirmaConCertificado().getFirmaBase64() != null) {
                ContenidoFirmaCertificadoContenidoBinario contenidoFirma = new ContenidoFirmaCertificadoContenidoBinario();
                byte[] bytesFirma = ConverterUtils
                        .base64Decode(contenidoFirmaEni.getFirmaConCertificado().getFirmaBase64());
                contenidoFirma.setValorBinario(bytesFirma);
                contenidoFirma.setMime(ConverterUtils.getMimeByTipoFirma(tipoFirma.value()));

                contenidoFirmaDocument = contenidoFirma;
            } else if (contenidoFirmaEni.getFirmaConCertificado().getSignature() != null) {
                ContenidoFirmaCertificadoDsSignature contenidoFirma = new ContenidoFirmaCertificadoDsSignature();
                try {
                    contenidoFirma.setValorBinario(ConverterUtils
                            .signatureToArrayOfBytes(contenidoFirmaEni.getFirmaConCertificado().getSignature()));
                    contenidoFirma.setMime("application/octet-stream");
                } catch (JAXBException e) {
                    throw new DocumentConverterException("Error convirtiendo el nodo ds:Signature a array de bytes", e, true);
                }
                contenidoFirmaDocument = contenidoFirma;

            } else if (contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma() != null) {
                ContenidoFirmaCertificadoReferencia contenidoFirma = new ContenidoFirmaCertificadoReferencia();
                if (contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma() instanceof String) {
                    contenidoFirma
                            .setReferenciaFirma(contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma().toString());
                } else {
                    Element e = (Element) contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma();
                    contenidoFirma.setReferenciaFirma(e.getTextContent());
                }
                contenidoFirmaDocument = contenidoFirma;
            }

        } else if (contenidoFirmaEni != null && contenidoFirmaEni.getCSV() != null) {
            ContenidoFirmaCSV contenidoFirma = new ContenidoFirmaCSV();
            contenidoFirma.setValorCSV(contenidoFirmaEni.getCSV().getValorCSV());
            contenidoFirma.setRegulacionGeneracionCSV(contenidoFirmaEni.getCSV().getRegulacionGeneracionCSV());
            contenidoFirmaDocument = contenidoFirma;
        }

        return contenidoFirmaDocument;
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

    private FirmaENI firmaEniToDocument(TipoFirmasElectronicas firmaEni, int orden) throws DocumentConverterException {
    	if(firmaEni == null) {
    		//Assert.notNull(firmaEni, "");
    		System.err.println("firmaEni no puede ser nulo");
    	}
        
        FirmaENI firmaDocument = firmaEniToDocument(firmaEni);
        firmaDocument.setOrden(orden);
        return firmaDocument;
    }

    private FirmaENI firmaEniToDocument(TipoFirmasElectronicas firmaEni) throws DocumentConverterException {
    	if(firmaEni == null) {
    		//Assert.notNull(firmaEni, "TipoFirmasElectronicas no puede ser nulo");
    		System.err.println("TipoFirmasElectronicas no puede ser nulo");
    	}
        
        FirmaENI firmaDocument = new FirmaENI();
        firmaDocument.setEnumeracionDocumentoTipoFirma(EnumeracionDocumentoTipoFirma.fromValue(firmaEni.getTipoFirma().value()));
        firmaDocument.setIdentificadorEnDocumento(firmaEni.getId());
        firmaDocument.setContenidoFirmaDocument(contenidoFirmaEniToDocument(firmaEni.getContenidoFirma(), firmaEni.getTipoFirma()));
        firmaDocument.setRef(firmaEni.getRef());
        return firmaDocument;
    }

    private TipoFirma converterFirmaToModel(EnumeracionDocumentoTipoFirma enumeracionDocumentoTipoFirma) {

        if (!enumeracionDocumentoTipoFirma.value().equals(EnumeracionDocumentoTipoFirma.SIN_FIRMAR.value())) {
            return TipoFirma.fromValue(enumeracionDocumentoTipoFirma.value());
        }

        return null;
    }

}
