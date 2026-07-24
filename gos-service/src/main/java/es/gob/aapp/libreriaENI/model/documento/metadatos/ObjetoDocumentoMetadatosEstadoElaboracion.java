package es.gob.aapp.libreriaENI.model.documento.metadatos;

import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoEstadoElaboracion;

import java.io.Serializable;


public class ObjetoDocumentoMetadatosEstadoElaboracion implements Cloneable, Serializable{

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

    private EnumeracionDocumentoEstadoElaboracion valorEstadoElaboracion;
    private String identificadorDocumentoOrigen;

    public EnumeracionDocumentoEstadoElaboracion getValorEstadoElaboracion() {
        return valorEstadoElaboracion;
    }

    public void setValorEstadoElaboracion(EnumeracionDocumentoEstadoElaboracion value) {
        this.valorEstadoElaboracion = value;
    }

    public String getIdentificadorDocumentoOrigen() {
        return identificadorDocumentoOrigen;
    }

    public void setIdentificadorDocumentoOrigen(String value) {
        this.identificadorDocumentoOrigen = value;
    }
    
    public Object clone () throws CloneNotSupportedException {
    	ObjetoDocumentoMetadatosEstadoElaboracion estado = (ObjetoDocumentoMetadatosEstadoElaboracion) super.clone();
		
    	estado.identificadorDocumentoOrigen = identificadorDocumentoOrigen;
    	estado.valorEstadoElaboracion = valorEstadoElaboracion;
    	return estado;
    }
    
    @Override
    public String toString () {
    	StringBuilder sb = new StringBuilder ("ObjetoDocumentoMetadatosEstadoElaboracion=[");
    	String coma = ", ";
    	
    	if (valorEstadoElaboracion == null) {
    		sb.append("valorEstadoElaboracion=null" + coma);
    	} else {
    		sb.append(valorEstadoElaboracion.toString());
    	}
    	sb.append("identificadorDocumentoOrigen=" + identificadorDocumentoOrigen);
    	
    	sb.append("]");
    	return sb.toString();
    }

}
