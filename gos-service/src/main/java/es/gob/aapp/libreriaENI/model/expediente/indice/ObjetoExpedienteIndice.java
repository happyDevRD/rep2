package es.gob.aapp.libreriaENI.model.expediente.indice;


import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;

import java.util.ArrayList;
import java.util.List;

public class ObjetoExpedienteIndice {

    private ObjetoExpedienteIndiceContenido indiceContenido;

    private List<FirmaENI> firmas;

    public ObjetoExpedienteIndiceContenido getIndiceContenido() {
    	if(indiceContenido == null){
    		indiceContenido = new ObjetoExpedienteIndiceContenido();
    	}
        return indiceContenido;
    }

    public void setIndiceContenido(ObjetoExpedienteIndiceContenido indiceContenido) {
        this.indiceContenido = indiceContenido;
    }

    public List<FirmaENI> getFirmas() {
		if(firmas == null){
			firmas = new ArrayList<>();
		}
		return firmas;
    }


    public void setFirmas(List<FirmaENI> firmas) {
        this.firmas = firmas;
    }
    
    @Override
    public String toString () {
    	StringBuilder sb = new StringBuilder ("ObjetoExpedienteIndice=[");
    	String coma = ", ";
    	if (indiceContenido == null) {
    		sb.append("IndiceContenido=null" + coma);
    	} else {
    		sb.append("IndiceContenido=" + indiceContenido.toString() + coma);
    	}
    	if (firmas == null) {
    		sb.append("Firmas=null" + coma);
    	} else {
    		sb.append("Firmas=");
    		for (FirmaENI firma : firmas) {
    			sb.append(firma.toString());
    		}
    		sb.append(coma);
    	}
    	sb.append("]");
    	return sb.toString();
    }

}
