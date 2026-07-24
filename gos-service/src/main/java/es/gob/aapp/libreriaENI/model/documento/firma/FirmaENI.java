package es.gob.aapp.libreriaENI.model.documento.firma;

import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;

import java.io.InputStream;

public class FirmaENI {

    // Para el tipo de firma
    private EnumeracionDocumentoTipoFirma enumeracionDocumentoTipoFirma;

    // Para el contenido de la firma
    private InputStream firma;

    protected ContenidoFirmaDocument contenidoFirmaDocument;

    private String identificadorEnDocumento;

    private String ref;

    private int orden;

    // Tipo de firma CSV
    private String csv;
    private String regulacionCsv;


    public EnumeracionDocumentoTipoFirma getEnumeracionDocumentoTipoFirma() {
        return enumeracionDocumentoTipoFirma;
    }

    public void setEnumeracionDocumentoTipoFirma(EnumeracionDocumentoTipoFirma enumeracionDocumentoTipoFirma) {
        this.enumeracionDocumentoTipoFirma = enumeracionDocumentoTipoFirma;
    }

    public InputStream getFirma() {
        return firma;
    }

    public void setFirma(InputStream firma) {
        this.firma = firma;
    }

    public ContenidoFirmaDocument getContenidoFirmaDocument() {
        return contenidoFirmaDocument;
    }

    public void setContenidoFirmaDocument(ContenidoFirmaDocument contenidoFirmaDocument) {
        this.contenidoFirmaDocument = contenidoFirmaDocument;
    }

    public String getIdentificadorEnDocumento() {
        return identificadorEnDocumento;
    }

    public void setIdentificadorEnDocumento(String identificadorEnDocumento) {
        this.identificadorEnDocumento = identificadorEnDocumento;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }

    public String getRegulacionCsv() {
        return regulacionCsv;
    }

    public void setRegulacionCsv(String regulacionCsv) {
        this.regulacionCsv = regulacionCsv;
    }

}
