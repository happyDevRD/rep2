package es.gob.aapp.libreriaENI.exception.document;

public class DocumentConverterException extends Exception{
	
	private static final String DESC_PREFIX = " ";

	private static final long serialVersionUID = -4020485130028170415L;
	
	private boolean reportable;

	/**
	 * Error al realizar una conversión entre objetos del modelo
	 * 
	 * @param descripcion	La descripción del error
	 * @param e				La causa del error
	 */
	public DocumentConverterException(String descripcion, Throwable e) {
		super(DESC_PREFIX + descripcion,e);
		if(e instanceof DocumentConverterException){
			this.reportable = ((DocumentConverterException) e).isReportable();
		} else {
			reportable = false;
		}
	}
	
	/**
	 * Error al realizar una conversión entre objetos del modelo
	 * 
	 * @param descripcion la causa del error
	 */
	public DocumentConverterException(String descripcion) {
		super(DESC_PREFIX + descripcion);
		reportable = false;
	}
		
	/**
	 * Error al realizar una conversión entre objetos del modelo
	 * 
	 * @param t	la causa del error
	 */
	public DocumentConverterException(Throwable t) {
		super(DESC_PREFIX ,t);
		if(t instanceof DocumentConverterException){
			this.reportable = ((DocumentConverterException) t).isReportable();
		} else {
			reportable = false;
		}
	}

	/**
	 * Error al realizar una conversión entre objetos del modelo
	 * 
	 * @param descripcion	La descripción del error
	 * @param reportable	Si el error puede ser notificado (no es de indole interna)
	 */
	public DocumentConverterException(String descripcion, boolean reportable) {
		super(DESC_PREFIX + descripcion);
		this.reportable = reportable;
	}
	
	public DocumentConverterException(String descripcion, Throwable t, boolean reportable) {
		super (DESC_PREFIX + descripcion, t);
		this.reportable = reportable;
	}

	/**
	 * Indica si el error puede ser notificado (no es de indole interna)
	 * @return boolean
	 */
	public boolean isReportable() {
		return reportable;
	}


}
