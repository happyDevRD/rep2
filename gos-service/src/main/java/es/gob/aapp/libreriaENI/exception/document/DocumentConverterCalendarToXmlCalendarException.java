package es.gob.aapp.libreriaENI.exception.document;

public class DocumentConverterCalendarToXmlCalendarException extends DocumentConverterException {

	private static final long serialVersionUID = 1L;
	
	public DocumentConverterCalendarToXmlCalendarException(Throwable e) {
		super(e.getMessage(),e);
	}

}
