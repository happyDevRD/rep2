package es.gob.aapp.libreriaENI.model.expediente.indice;


public class ObjetoExpedienteIndiceContenidoCarpetaIndizada extends ObjetoExpedienteIndiceContenidoElementoContenedorElementos {


    private String identificadorCarpeta;

    private String descripcion; // Opction version 2

    public String getIdentificadorCarpeta() {
        return identificadorCarpeta;
    }

    public void setIdentificadorCarpeta(String value) {
        this.identificadorCarpeta = value;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
	public String toString () {
		String coma = ", ";
		StringBuilder sb = new StringBuilder ("ObjetoExpedienteInsideIndiceContenidoCarpetaIndizada=[");
		sb.append("identificadorCarpeta=" + identificadorCarpeta + coma);
        sb.append("descripcion=" + descripcion + coma);
		sb.append(super.toString());
		sb.append("]");
		return sb.toString();		
	}

}
