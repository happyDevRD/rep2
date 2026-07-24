package es.gob.aapp.libreriaENI.model.documento.metadatos;

import java.io.Serializable;

public class ObjetoMetadatoAdicional implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	private Object valor;
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String qName) {
		this.tipo = qName;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString () {
		String coma = ", ";
		StringBuilder sb = new StringBuilder ("MetadatoAdicional[");
		sb.append("Nombre=" + nombre + coma);
		sb.append("Valor=" + valor + coma);
		sb.append("Tipo=" + tipo + coma);
		sb.append("]");
		return sb.toString();
	}

}
