package es.gob.aapp.libreriaENI.model.expediente.indice;

import java.util.ArrayList;
import java.util.List;

public class ObjetoEstructuraCarpeta {

	private String identificadorEstructura;
	private String codigoUnidadOrganica;
	private String numeroProcedimiento;

	protected List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementosIndizados;

	public List<ObjetoExpedienteIndiceContenidoElementoIndizado> getElementosIndizados() {
		if (elementosIndizados == null) {
			elementosIndizados = new ArrayList<>();
		}
		return elementosIndizados;
	}

	public void setElementosIndizados(List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementoIndizado) {
		this.elementosIndizados = elementoIndizado;
	}

	public String getIdentificadorEstructura() {
		return identificadorEstructura;
	}

	public void setIdentificadorEstructura(String identificadorEstructura) {
		this.identificadorEstructura = identificadorEstructura;
	}

	public String getCodigoUnidadOrganica() {
		return codigoUnidadOrganica;
	}

	public void setCodigoUnidadOrganica(String codigoUnidadOrganica) {
		this.codigoUnidadOrganica = codigoUnidadOrganica;
	}

	public String getNumeroProcedimiento() {
		return numeroProcedimiento;
	}

	public void setNumeroProcedimiento(String numeroProcedimiento) {
		this.numeroProcedimiento = numeroProcedimiento;
	}

}
