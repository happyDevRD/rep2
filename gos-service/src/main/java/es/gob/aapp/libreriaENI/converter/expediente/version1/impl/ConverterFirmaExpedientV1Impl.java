package es.gob.aapp.libreriaENI.converter.expediente.version1.impl;


import es.gob.aapp.libreriaENI.converter.expediente.version1.ConverterFirmaExpedientV1;
import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.model.documento.firma.*;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.util.ConverterUtils;
import es.gob.aapp.model.eni.v1.firma.Firmas;
import es.gob.aapp.model.eni.v1.firma.TipoFirma;
import es.gob.aapp.model.eni.v1.firma.TipoFirmasElectronicas;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;


@Service("ConverterFirmaExpedientV1")
public class ConverterFirmaExpedientV1Impl implements ConverterFirmaExpedientV1 {


    @Override
    public List<FirmaENI> converterFirmasEniToModel(Firmas firmas) throws ConverterException {
        // Segun el ENI del documento, si no existen firmas NO deberia incluirse el nodo Firmas.
        List<FirmaENI> firmasInside = null;
        if (firmas != null) {
            firmasInside = new ArrayList<>();
            for (TipoFirmasElectronicas firmaEni : firmas.getFirma()) {
                firmasInside.add(firmaEniToInside(firmaEni, firmas.getFirma().indexOf(firmaEni)));
            }
        }

        return firmasInside;
    }

    @Override
    public Firmas converterFirmasModelToEni(List<FirmaENI> firmas) throws ConverterException {
        // Segun el ENI del documento, si no existen firmas NO deberia incluirse
        // el nodo Firmas.
        // El nodo Firmas sin ningun nodo Firma dentro es INCORRECTO.
        Firmas firmasEni = null;

        if (CollectionUtils.isNotEmpty(firmas)) {
            firmasEni = new Firmas();
            for (FirmaENI firmaEni: firmas) {
                firmasEni.getFirma().add(firmaToEni(firmaEni));
            }
        }

        return firmasEni;
    }

    private static TipoFirmasElectronicas firmaToEni(FirmaENI firmaInside)  throws ConverterException {

        if(firmaInside == null) {
        	//Assert.notNull(firmaInside, "FirmaENI no puede ser nulo");
        	System.err.println("FirmaENI no puede ser nulo");
        }
    	
    	
        TipoFirmasElectronicas firma = new TipoFirmasElectronicas();
        if (StringUtils.isNotEmpty(firmaInside.getRef())) {
            firma.setRef(firmaInside.getRef());
        }

        firma.setContenidoFirma(contenidoFirmaInsideToEni(firmaInside.getContenidoFirmaDocument()));
        firma.setId(firmaInside.getIdentificadorEnDocumento());
        firma.setTipoFirma(TipoFirma.fromValue(firmaInside.getEnumeracionDocumentoTipoFirma().value()));
        return firma;
    }

    private static FirmaENI firmaEniToInside(TipoFirmasElectronicas firmaEni, int orden) throws ConverterException {
        if(firmaEni == null) {
        	//Assert.notNull(firmaEni, "");
        	System.err.println("firmaEni no puede ser nulo");
        }
    	
        FirmaENI firmaInside = firmaEniToInside(firmaEni);
        firmaInside.setOrden(orden);
        return firmaInside;
    }

    private static FirmaENI firmaEniToInside(TipoFirmasElectronicas firmaElectronica) throws ConverterException {
        
    	if(firmaElectronica == null) {
    		//Assert.notNull(firmaElectronica, "TipoFirmasElectronicas no puede ser nulo");
    		System.err.println("TipoFirmasElectronicas no puede ser nulo");
    	}
    	
        FirmaENI firmaDocument = new FirmaENI();

        firmaDocument.setEnumeracionDocumentoTipoFirma(EnumeracionDocumentoTipoFirma.fromValue(firmaElectronica.getTipoFirma().value()));
        firmaDocument.setIdentificadorEnDocumento(firmaElectronica.getId());

        firmaDocument.setContenidoFirmaDocument(contenidoFirmaEniToInside(firmaElectronica.getContenidoFirma(),
                firmaElectronica.getTipoFirma()));
        firmaDocument.setRef(firmaElectronica.getRef());
        return firmaDocument;
    }


    private static TipoFirmasElectronicas.ContenidoFirma contenidoFirmaInsideToEni(ContenidoFirmaDocument contenidoFirmaInside)
            throws ConverterException {

        TipoFirmasElectronicas.ContenidoFirma contenidoFirmaEni = new TipoFirmasElectronicas.ContenidoFirma();

        if(contenidoFirmaInside ==  null) {
        	System.err.println("ContenidoFirmaInside no puede ser nulo");
        }
        //Assert.notNull(contenidoFirmaInside, "ContenidoFirmaInside no puede ser nulo");

        if (contenidoFirmaInside instanceof ContenidoFirmaCertificadoContenidoBinario) {
            ContenidoFirmaCertificadoContenidoBinario contenidoCertificadoBinario = (ContenidoFirmaCertificadoContenidoBinario) contenidoFirmaInside;
            TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificadoEni = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();
            firmaConCertificadoEni.setFirmaBase64(contenidoCertificadoBinario.getValorBinario());
            // No se anade en Base64
            contenidoFirmaEni.setFirmaConCertificado(firmaConCertificadoEni);
        } else if (contenidoFirmaInside instanceof ContenidoFirmaCertificadoDsSignature) {
            ContenidoFirmaCertificadoDsSignature contenidoCertificadoSignature = (ContenidoFirmaCertificadoDsSignature) contenidoFirmaInside;
            TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificadoEni = new TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado();
            try {
                firmaConCertificadoEni.setSignature(
                        ConverterUtils.arrayOfBytesToSignature(contenidoCertificadoSignature.getValorBinario()));
            } catch (JAXBException e) {
                throw new ConverterException("Error convirtiendo el contenido del Signature a SignatureType ", e);
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
            throw new ConverterException(
                    "No se como convertir una firma de tipo " + contenidoFirmaInside.getClass() + " a ENI");
        }

        return contenidoFirmaEni;
    }

    private static ContenidoFirmaDocument contenidoFirmaEniToInside(TipoFirmasElectronicas.ContenidoFirma contenidoFirmaEni,
                                                                  TipoFirma tipoFirma) throws ConverterException {
        ContenidoFirmaDocument contenidoFirmaInside = null;

        if (contenidoFirmaEni != null && contenidoFirmaEni.getFirmaConCertificado() != null) {
            if (contenidoFirmaEni.getFirmaConCertificado().getFirmaBase64() != null) {
                ContenidoFirmaCertificadoContenidoBinario contenidoFirma = new ContenidoFirmaCertificadoContenidoBinario();
                byte[] bytesFirma = ConverterUtils
                        .base64Decode(contenidoFirmaEni.getFirmaConCertificado().getFirmaBase64());
                contenidoFirma.setValorBinario(bytesFirma);
                contenidoFirma.setMime(ConverterUtils.getMimeByTipoFirma(tipoFirma.value()));

                contenidoFirmaInside = contenidoFirma;
            } else if (contenidoFirmaEni.getFirmaConCertificado().getSignature() != null) {
                ContenidoFirmaCertificadoDsSignature contenidoFirma = new ContenidoFirmaCertificadoDsSignature();
                try {
                    contenidoFirma.setValorBinario(ConverterUtils
                            .signatureToArrayOfBytes(contenidoFirmaEni.getFirmaConCertificado().getSignature()));
                    contenidoFirma.setMime("application/octet-stream");
                } catch (JAXBException e) {
                    throw new ConverterException("Error convirtiendo el nodo ds:Signature a array de bytes", e, true);
                }
                contenidoFirmaInside = contenidoFirma;

            } else if (contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma() != null) {
                ContenidoFirmaCertificadoReferencia contenidoFirma = new ContenidoFirmaCertificadoReferencia();
                if (contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma() instanceof String) {
                    contenidoFirma
                            .setReferenciaFirma(contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma().toString());
                } else {
                    Element e = (Element) contenidoFirmaEni.getFirmaConCertificado().getReferenciaFirma();
                    contenidoFirma.setReferenciaFirma(e.getTextContent());
                }
                contenidoFirmaInside = contenidoFirma;
            }

        } else if (contenidoFirmaEni != null && contenidoFirmaEni.getCSV() != null) {
            ContenidoFirmaCSV contenidoFirma = new ContenidoFirmaCSV();
            contenidoFirma.setValorCSV(contenidoFirmaEni.getCSV().getValorCSV());
            contenidoFirma.setRegulacionGeneracionCSV(contenidoFirmaEni.getCSV().getRegulacionGeneracionCSV());
            contenidoFirmaInside = contenidoFirma;
        }

        return contenidoFirmaInside;
    }
}