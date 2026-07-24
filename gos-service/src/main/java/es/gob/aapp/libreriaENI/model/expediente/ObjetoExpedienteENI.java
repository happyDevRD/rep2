package es.gob.aapp.libreriaENI.model.expediente;


import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndice;
import es.gob.aapp.libreriaENI.model.expediente.justicia.ObjectRespuestaEnvioJusticia;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.model.expediente.version.ObjetoExpedienteVersion;
import es.gob.aapp.libreriaENI.model.expediente.version.ObjetoVersionable;

import java.util.ArrayList;
import java.util.List;


public class ObjetoExpedienteENI implements ObjetoVersionable {

    private ObjetoExpedienteIndice indice;

    private ObjetoDocumentoContenido visualizacionIndice;

    private ObjetoExpedienteVersion version;

    private List<ObjectRespuestaEnvioJusticia> objectRespuestaEnvioJusticiaLista;

    private ObjetoExpedienteMetadatos metadatos;

    public List<ObjectRespuestaEnvioJusticia> getObjectRespuestaEnvioJusticiaLista() {
        if (this.objectRespuestaEnvioJusticiaLista == null) {
            this.objectRespuestaEnvioJusticiaLista = new ArrayList<>();
        }
        return objectRespuestaEnvioJusticiaLista;
    }

    public void setObjectRespuestaEnvioJusticiaLista(List<ObjectRespuestaEnvioJusticia> objectInsideRespuestaEnvioJusticiaLista) {
        this.objectRespuestaEnvioJusticiaLista = objectInsideRespuestaEnvioJusticiaLista;
    }

    public ObjetoExpedienteIndice getIndice() {
        if(indice == null){
            indice = new ObjetoExpedienteIndice();
        }
        return indice;
    }

    public void setIndice(ObjetoExpedienteIndice value) {
        this.indice = value;
    }

    public ObjetoDocumentoContenido getVisualizacionIndice() {
        return visualizacionIndice;
    }

    public void setVisualizacionIndice(ObjetoDocumentoContenido visualizacionIndice) {
        this.visualizacionIndice = visualizacionIndice;
    }

    @Override
    public ObjetoExpedienteVersion getVersion() {
        return version;
    }

    @Override
    public void setVersion(ObjetoExpedienteVersion version) {
        this.version = version;
    }

    public ObjetoExpedienteMetadatos getMetadatos() {
        return metadatos;
    }

    public void setMetadatos(ObjetoExpedienteMetadatos metadatos) {
        this.metadatos = metadatos;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder ("ObjetoExpedienteENI=[");
        String coma = ", ";
        sb.append(super.toString());

        if (version == null) {
            sb.append("version=null" + coma);
        } else {
            sb.append("version=" + this.version.toString() + coma);
        }

        if (indice == null) {
            sb.append("indice=null" + coma);
        } else {
            sb.append("indice=" + indice.toString() + coma);
        }
        if (this.visualizacionIndice == null) {
            sb.append("visualizacionIndice=null" + coma);
        } else {
            sb.append("visualizacionIndice=" + visualizacionIndice.toString());
        }
        sb.append("]");
        return sb.toString();
    }


}
