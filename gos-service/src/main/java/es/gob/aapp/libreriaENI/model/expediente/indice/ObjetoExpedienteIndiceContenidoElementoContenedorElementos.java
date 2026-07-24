package es.gob.aapp.libreriaENI.model.expediente.indice;


import java.util.ArrayList;
import java.util.List;

public abstract class ObjetoExpedienteIndiceContenidoElementoContenedorElementos extends ObjetoExpedienteIndiceContenidoElementoIndizado {

    private List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementosIndizados;
  
    
    public List<ObjetoExpedienteIndiceContenidoElementoIndizado> getElementosIndizados() {
    	if(elementosIndizados == null){
    		elementosIndizados = new ArrayList<>();
    	}
		return elementosIndizados;
	}

	public void setElementosIndizados(
			List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementoIndizado) {
		this.elementosIndizados = elementoIndizado;
	}
	
	@Override
	public String toString () {		
		StringBuilder sb = new StringBuilder ("ObjetoExpedienteIndiceContenidoElementoContenedorElementos=[");
		String coma = ", ";
		sb.append(super.toString() + coma);
		if (elementosIndizados == null) {
			sb.append("ElementosIndizados=null");
		} else {
			sb.append("ElementosIndizados=");
			for (ObjetoExpedienteIndiceContenidoElementoIndizado elemento : elementosIndizados) {
				sb.append(elemento.toString() + coma);
			}
		}
		sb.append("]");
		return sb.toString();		
	}

}
