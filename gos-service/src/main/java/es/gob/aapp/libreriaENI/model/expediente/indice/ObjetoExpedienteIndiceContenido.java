package es.gob.aapp.libreriaENI.model.expediente.indice;

import java.util.Calendar;

public class ObjetoExpedienteIndiceContenido extends ObjetoExpedienteIndiceContenidoElementoContenedorElementos{

	public enum TipoAsociacion{
		VINCULACION,
		IMPORTACION
	}
	
	private Calendar fechaIndiceElectronico;

	private String identificadorExpedienteAsociado;

	private TipoAsociacion tipoAsociacion;
    
	public Calendar getFechaIndiceElectronico() {
        return fechaIndiceElectronico;
    }

    public void setFechaIndiceElectronico(Calendar value) {
        this.fechaIndiceElectronico = value;
    }
    
	public String getIdentificadorExpedienteAsociado() {
		return identificadorExpedienteAsociado;
	}

	public void setIdentificadorExpedienteAsociado(
			String identificadorExpedienteAsociado) {
		this.identificadorExpedienteAsociado = identificadorExpedienteAsociado;
	}

	public TipoAsociacion getTipoAsociacion() {
		return tipoAsociacion;
	}

	public void setTipoAsociacion(TipoAsociacion tipoAsociacion) {
		this.tipoAsociacion = tipoAsociacion;
	}
	
	@Override
	public String toString () {		
		StringBuilder sb = new StringBuilder ("ObjetoExpedienteIndiceContenido=[");
		String coma = ", ";
		sb.append("fechaIndiceElectronico=" + fechaIndiceElectronico + coma);
		sb.append("identificadorExpedienteAsociado=" + identificadorExpedienteAsociado + coma);
		sb.append("tipoAsociacion=" + tipoAsociacion + coma);		
		sb.append(super.toString() + coma);
		sb.append("]");
		return sb.toString();
	}
	

}
