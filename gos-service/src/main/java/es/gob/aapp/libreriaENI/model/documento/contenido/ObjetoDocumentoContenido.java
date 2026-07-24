package es.gob.aapp.libreriaENI.model.documento.contenido;


import java.io.InputStream;


public class ObjetoDocumentoContenido {

    // Para el Contenido
    private InputStream contenido;
    private String referencia;
    private TipoDocumentoReferenciaExterna tipoDocumentoReferenciaExterna;    // Version 2
    private String nombreFormato;
    private String mime;

    private String identificadorEnDocumento;

    public InputStream getContenido() {
        return contenido;
    }

    public void setContenido(InputStream contenido) {
        this.contenido = contenido;
    }


    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public TipoDocumentoReferenciaExterna getTipoDocumentoReferenciaExterna() {
        return tipoDocumentoReferenciaExterna;
    }

    public void setTipoDocumentoReferenciaExterna(TipoDocumentoReferenciaExterna tipoDocumentoReferenciaExterna) {
        this.tipoDocumentoReferenciaExterna = tipoDocumentoReferenciaExterna;
    }

    public String getNombreFormato() {
        return nombreFormato;
    }

    public void setNombreFormato(String nombreFormato) {
        this.nombreFormato = nombreFormato;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getIdentificadorEnDocumento() {
        return identificadorEnDocumento;
    }

    public void setIdentificadorEnDocumento(String identificadorEnDocumento) {
        this.identificadorEnDocumento = identificadorEnDocumento;
    }

}
