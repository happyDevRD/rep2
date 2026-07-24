package es.gob.aapp.libreriaENI.model.expediente.indice;

public abstract class ObjetoExpedienteIndiceContenidoElementoIndizado implements Comparable<ObjetoExpedienteIndiceContenidoElementoIndizado>{

	private int orden;
	
	public int getOrden(){
		return this.orden;
	}
	
	public void setOrden(int orden){
		this.orden = orden;
	}
	
	/**
	 * Devuelve >0 si el orden del argumento es menor que el del "this".
	 */
	public int compareTo (ObjetoExpedienteIndiceContenidoElementoIndizado o) {
		return this.orden - o.getOrden();		
	}
	
	@Override
	public String toString () {		
		StringBuilder sb = new StringBuilder ("ObjetoExpedienteIndiceContenidoElementoIndizado=[");
		sb.append("orden=" + orden);
		sb.append("]");
		return sb.toString();
	}
}
