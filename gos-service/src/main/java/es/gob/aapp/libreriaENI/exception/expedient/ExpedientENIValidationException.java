package es.gob.aapp.libreriaENI.exception.expedient;


/**
 * Expceción para servicios de negocio
 * 
 * @author minhap
 * 
 */
public class ExpedientENIValidationException extends Exception {

	private static final long serialVersionUID = 1L;


	/**
	 * Constructor mensaje
	 *
	 * @param mensaje
	 *            mensaje
	 */
	public ExpedientENIValidationException(String mensaje) {
		super(mensaje);
	}

}