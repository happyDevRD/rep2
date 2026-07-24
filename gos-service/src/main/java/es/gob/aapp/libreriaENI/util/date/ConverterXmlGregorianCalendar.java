package es.gob.aapp.libreriaENI.util.date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ConverterXmlGregorianCalendar {

	private ConverterXmlGregorianCalendar() {}

	public static XMLGregorianCalendar calendarToXmlCalendar(Calendar fecha)
			throws DatatypeConfigurationException {
		if(fecha == null){
			return null;
		}
		GregorianCalendar g = new GregorianCalendar();
		g.setTimeInMillis(fecha.getTimeInMillis());
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(g);
	}


	public static Calendar calendarToXmlCalendar(XMLGregorianCalendar fecha) 
	{
		if(fecha == null){
			return null;
		}
		return fecha.toGregorianCalendar();
	}


	/**
	 * Devuelve la cadena correspondiente a un objeto Calendar según el estándar
	 * ISO8601
	 *
	 * @param calendar calendar
	 * @return String
	 */
	public static String calendarToStringISO8601(Calendar calendar) {
		String retorno = "";
		if (calendar != null) {
			DateTime dt = new DateTime(calendar);
			DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
			retorno = dt.toString(fmt);
		}
		return retorno;
	}

}
