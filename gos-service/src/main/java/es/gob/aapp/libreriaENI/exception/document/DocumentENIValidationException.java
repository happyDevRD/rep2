package es.gob.aapp.libreriaENI.exception.document;


/**
 * Expceción para servicios de negocio
 * 
 * @author minhap
 * 
 */
public class DocumentENIValidationException extends Exception {

	private static final long serialVersionUID = 1L;


	/**
	 * Constructor mensaje
	 *
	 * @param mensaje
	 *            mensaje
	 */
	public DocumentENIValidationException(String mensaje) {
		super(mensaje);
	}

}