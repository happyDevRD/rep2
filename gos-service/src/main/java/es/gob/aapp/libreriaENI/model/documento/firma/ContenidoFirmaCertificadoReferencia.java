package es.gob.aapp.libreriaENI.model.documento.firma;

public class ContenidoFirmaCertificadoReferencia extends ContenidoFirmaCertificado {

	 /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
		
		
	private String referenciaFirma;

	public String getReferenciaFirma() {
		return referenciaFirma;
	}

	public void setReferenciaFirma(String referenciaFirma) {
		this.referenciaFirma = referenciaFirma;
	}
	
	@Override
	public String toString () {		
		StringBuilder sb = new StringBuilder ("ContenidoFirmaCertificadoReferencia=[");
		sb.append("referenciaFirma=" + referenciaFirma);		
		sb.append("]");
		return sb.toString();
	}
}
