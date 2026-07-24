package es.gob.aapp.libreriaENI.model.expediente.metadatos;

import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.libreriaENI.util.Converter;
import es.gob.aapp.libreriaENI.util.date.ConverterXmlGregorianCalendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class ObjetoExpedienteMetadatos {

	 /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

    private String identificadorExpediente;

	protected String versionNTI;

    protected List<String> organo;

    private Calendar fechaAperturaExpediente;

    private String clasificacion;

    protected ObjetoExpedienteMetadatosEnumeracionEstados estado;

    private List<String> interesado;

    // Para los Metadatos Adicionales
    private List<ObjetoMetadatoAdicional> metadatosAdicionales;


    public String getIdentificadorExpediente() {
        return identificadorExpediente;
    }

    public void setIdentificadorExpediente(String identificadorExpediente) {
        this.identificadorExpediente = identificadorExpediente;
    }

    public String getVersionNTI() {
        return versionNTI;
    }

    public void setVersionNTI(String value) {
        this.versionNTI = value;
    }

    public List<String> getOrgano() {
    	if(this.organo == null){
    		this.organo = new ArrayList<>();
    	}
        return this.organo;
    }
    
    public void setOrgano(List<String> organo) {
         this.organo = organo;
    }

    public Calendar getFechaAperturaExpediente() {
        return fechaAperturaExpediente;
    }

    public void setFechaAperturaExpediente(Calendar calendar) {
        this.fechaAperturaExpediente = calendar;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String value) {
        this.clasificacion = value;
    }

    public ObjetoExpedienteMetadatosEnumeracionEstados getEstado() {
        return estado;
    }

    public void setEstado(ObjetoExpedienteMetadatosEnumeracionEstados value) {
        this.estado = value;
    }

    public List<String> getInteresado() {
    	if(this.interesado == null){
    		this.interesado = new ArrayList<>();
    	}
        return this.interesado;
    }
    
    public void setInteresado(List<String> interesados) {
    	this.interesado = interesados;
    }

    public List<ObjetoMetadatoAdicional> getMetadatosAdicionales() {
        if (this.metadatosAdicionales == null) {
            this.metadatosAdicionales = new ArrayList<>();
        }
        return metadatosAdicionales;
    }

    public void setMetadatosAdicionales(List<ObjetoMetadatoAdicional> metadatosAdicionales) {
        this.metadatosAdicionales = metadatosAdicionales;
    }

    @Override
    public Object clone () throws CloneNotSupportedException {
    	ObjetoExpedienteMetadatos objetoExpedienteInsideMetadatos = (ObjetoExpedienteMetadatos) super.clone();
    	
    	objetoExpedienteInsideMetadatos.versionNTI = versionNTI;
    	objetoExpedienteInsideMetadatos.identificadorExpediente = identificadorExpediente;
    	objetoExpedienteInsideMetadatos.getOrgano().addAll(organo);
    	if (fechaAperturaExpediente != null) {
    		objetoExpedienteInsideMetadatos.fechaAperturaExpediente = (GregorianCalendar) fechaAperturaExpediente.clone();
    	}
    	objetoExpedienteInsideMetadatos.clasificacion = clasificacion;
    	objetoExpedienteInsideMetadatos.estado = estado;
    	
    	return objetoExpedienteInsideMetadatos;
    }
    
    @Override
    public String toString () {
    	String coma = ", ";
    	StringBuilder sb = new StringBuilder ("ObjetoExpedienteInsideMetadatos=[");    	
		sb.append("Clasificacion=" + this.clasificacion + coma);
		sb.append("VersionNTI=" + this.versionNTI + coma);
		sb.append("Estado=" + this.estado + coma);
		sb.append("Fecha Apertura Exp=" + ConverterXmlGregorianCalendar.calendarToStringISO8601(this.fechaAperturaExpediente) + coma);
		sb.append("Organo=" + Converter.listaToString(this.organo) + coma);
		sb.append("Interesado=" + Converter.listaToString(this.interesado) + coma);
		sb.append(super.toString());
		sb.append("]");
		return sb.toString();
    }


   
}
