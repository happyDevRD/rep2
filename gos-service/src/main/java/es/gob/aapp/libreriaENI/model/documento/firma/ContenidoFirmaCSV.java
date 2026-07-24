package es.gob.aapp.libreriaENI.model.documento.firma;

public class ContenidoFirmaCSV extends ContenidoFirmaDocument {

	 /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	protected String valorCSV;

	protected String regulacionGeneracionCSV;

	public String getValorCSV() {
	    return valorCSV;
	}
	
	public void setValorCSV(String value) {
	    this.valorCSV = value;
	}
	
	public String getRegulacionGeneracionCSV() {
	    return regulacionGeneracionCSV;
	}
	
	public void setRegulacionGeneracionCSV(String value) {
	    this.regulacionGeneracionCSV = value;
	}
	
	@Override
	public Object clone () throws CloneNotSupportedException {
	 	ContenidoFirmaCSV csv = (ContenidoFirmaCSV) super.clone();
		csv.regulacionGeneracionCSV = regulacionGeneracionCSV;
		csv.valorCSV = valorCSV;
		return csv;
	}
	
	@Override
	public String toString () {
		String coma = ", ";
		StringBuilder sb = new StringBuilder ("ContenidoFirmaCSV=[");
		sb.append("valorCSV=" + valorCSV + coma);
		sb.append("regulacionGeneracionCSV=" + regulacionGeneracionCSV);
		sb.append("]");
		
		return sb.toString();
	}

}