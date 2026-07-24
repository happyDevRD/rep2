package es.gob.aapp.libreriaENI.model.documento;


import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import java.util.List;

public class ObjetoDocumentoENI {

    // Para el Contenido
    private ObjetoDocumentoContenido contenidoDocumento;

    // Listado de Firmas
    private List<FirmaENI> firmas;

    // Para los Metadatos
    private ObjetoDocumentoMetadatos metadatos;


    public ObjetoDocumentoContenido getContenidoDocumento() {
        return contenidoDocumento;
    }

    public void setContenidoDocumento(ObjetoDocumentoContenido contenidoDocumento) {
        this.contenidoDocumento = contenidoDocumento;
    }

    public List<FirmaENI> getFirmas() {
        return firmas;
    }

    public void setFirmas(List<FirmaENI> firmas) {
        this.firmas = firmas;
    }

    public ObjetoDocumentoMetadatos getMetadatos() {
        if (this.metadatos == null) {
            this.metadatos = new ObjetoDocumentoMetadatos();
        }
        return metadatos;
    }

    public void setMetadatos(ObjetoDocumentoMetadatos metadatos) {
        this.metadatos = metadatos;
    }

}
