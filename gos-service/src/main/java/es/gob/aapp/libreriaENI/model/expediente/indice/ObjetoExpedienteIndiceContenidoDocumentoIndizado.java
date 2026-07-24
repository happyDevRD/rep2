package es.gob.aapp.libreriaENI.model.expediente.indice;


import java.util.Calendar;

public class ObjetoExpedienteIndiceContenidoDocumentoIndizado extends
		ObjetoExpedienteIndiceContenidoElementoIndizado {

	private String identificadorDocumento;

	private String nombreNatural;	// Opcional

	private String valorHuella;

	private String funcionResumen;

	private Calendar fechaIncorporacionExpediente;

	private int ordenDocumentoExpediente;

	public String getIdentificadorDocumento() {
		return identificadorDocumento;
	}

	public void setIdentificadorDocumento(String value) {
		this.identificadorDocumento = value;
	}

	public String getNombreNatural() {
		return nombreNatural;
	}

	public void setNombreNatural(String nombreNatural) {
		this.nombreNatural = nombreNatural;
	}

	public String getValorHuella() {
		return valorHuella;
	}

	public void setValorHuella(String value) {
		this.valorHuella = value;
	}

	public String getFuncionResumen() {
		return funcionResumen;
	}

	public void setFuncionResumen(String value) {
		this.funcionResumen = value;
	}

	public Calendar getFechaIncorporacionExpediente() {
		return fechaIncorporacionExpediente;
	}

	public void setFechaIncorporacionExpediente(Calendar value) {
		this.fechaIncorporacionExpediente = value;
	}

	public int getOrdenDocumentoExpediente() {
		return ordenDocumentoExpediente;
	}

	public void setOrdenDocumentoExpediente(int ordenDocumentoExpediente) {
		this.ordenDocumentoExpediente = ordenDocumentoExpediente;
	}

	@Override
	public String toString() {
		String coma = ", ";
		StringBuilder sb = new StringBuilder(
				"ObjetoExpedienteInsideIndiceContenidoDocumentoIndizado=[");
		sb.append("IdentificadorDocumento=" + identificadorDocumento + coma);
		sb.append("valorHuella=" + valorHuella + coma);
		sb.append("funcionResumen=" + funcionResumen + coma);
		sb.append("fechaIncorporacionExpediente="
				+ fechaIncorporacionExpediente + coma);
		sb.append("ordenDocumentoExpediente=" + ordenDocumentoExpediente + coma);
		sb.append(super.toString() + coma);
		sb.append("]");
		return sb.toString();
	}

}
