package es.gob.aapp.libreriaENI.model.documento.firma;

public abstract class ContenidoFirmaCertificadoAlmacenable extends ContenidoFirmaCertificado{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	protected byte[] valorBinario;
	protected String mime;
	protected String identificadorRepositorio;
	
	public String getIdentificadorRepositorio() {
		return identificadorRepositorio;
	}

	public void setIdentificadorRepositorio(String identificadorRepositorio) {
		this.identificadorRepositorio = identificadorRepositorio;
	}

	public byte[] getValorBinario() {
		return valorBinario;
	}

	public void setValorBinario(byte[] valorBinario) {
		this.valorBinario = valorBinario;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}
	
	@Override
	public String toString() {
		String coma = ", ";
		StringBuilder sb = new StringBuilder ("ContenidoFirmaCertificadoAlmacenable=[");
		sb.append("identificadorRepositorio=" + identificadorRepositorio + coma);
		sb.append("mime=" + mime + coma);
		if (valorBinario == null) {
			sb.append("valorBinario=null");
		} else {
			sb.append("valorBinario=[...bytes...]");
		}		
		sb.append("]");
		return sb.toString();
	}


}