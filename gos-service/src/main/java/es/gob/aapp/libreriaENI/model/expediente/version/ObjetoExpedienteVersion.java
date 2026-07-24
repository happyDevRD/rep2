package es.gob.aapp.libreriaENI.model.expediente.version;

import es.gob.aapp.libreriaENI.util.date.ConverterXmlGregorianCalendar;

import java.io.Serializable;
import java.util.GregorianCalendar;


public class ObjetoExpedienteVersion implements Cloneable, Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	protected int version;
	
	private GregorianCalendar fechaVersion;
	
	private String remitidoMJU;
	
	public ObjetoExpedienteVersion(int version, GregorianCalendar fechaVersion) {
		this.version = version;
		this.fechaVersion = fechaVersion;
	}
	
	public String getRemitidoMJU() {
		return remitidoMJU;
	}

	public void setRemitidoMJU(String remitidoMJU) {
		this.remitidoMJU = remitidoMJU;
	}

	public int getVersion() {
		return version;
	}
	
	public GregorianCalendar getFechaVersion() {
		return fechaVersion;
	}

	public static ObjetoExpedienteVersion createFirstVersion() {
		return new ObjetoExpedienteVersion(1, new GregorianCalendar());
	}
	
	public static ObjetoExpedienteVersion createNextVersion(ObjetoExpedienteVersion version) {
		return new ObjetoExpedienteVersion(version.getVersion() + 1, new GregorianCalendar());
	}

	@Override
	public Object clone () throws CloneNotSupportedException{
		
		ObjetoExpedienteVersion objetoInsideVersion = (ObjetoExpedienteVersion) super.clone();
		objetoInsideVersion.version = this.version;
		objetoInsideVersion.fechaVersion = (GregorianCalendar) fechaVersion.clone();
		
		return objetoInsideVersion;
		
	}
	
	
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder ("ObjetoExpedienteVersion=[");
		String coma = ", ";
		sb.append("version=" + version + coma);
		sb.append("fechaVersion=" + ConverterXmlGregorianCalendar.calendarToStringISO8601(fechaVersion));
		sb.append("]");
		return sb.toString();
	}
}

