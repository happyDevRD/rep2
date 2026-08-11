package com.greenaall.archive.dto;

public class ArchiveGenerarSipRequestDto {

	// WSGenerateSIPRequestMtom.identificadorArchivoDestino (Centro de Archivo)
	private String identificadorArchivoDestino;

	// WSSipMtom
	private String zipBase64;
	private String mime = "application/zip";
	private String huellaDigital;
	private String algoritmoHuella = "MD5";

	// WSMetadataExpedient
	private String clasificacion;
	private String fechaApertura;
	private String fechaFin;
	private String organoExpediente;
	private String interesado;

	// WSMetadataDocument
	private String origen;
	private String estadoElaboracion;
	private String tipoDocumental;
	private String organoDocumento;
	private String fechaCaptura;

	public String getIdentificadorArchivoDestino() {
		return identificadorArchivoDestino;
	}

	public void setIdentificadorArchivoDestino(String identificadorArchivoDestino) {
		this.identificadorArchivoDestino = identificadorArchivoDestino;
	}

	public String getZipBase64() {
		return zipBase64;
	}

	public void setZipBase64(String zipBase64) {
		this.zipBase64 = zipBase64;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public String getHuellaDigital() {
		return huellaDigital;
	}

	public void setHuellaDigital(String huellaDigital) {
		this.huellaDigital = huellaDigital;
	}

	public String getAlgoritmoHuella() {
		return algoritmoHuella;
	}

	public void setAlgoritmoHuella(String algoritmoHuella) {
		this.algoritmoHuella = algoritmoHuella;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getOrganoExpediente() {
		return organoExpediente;
	}

	public void setOrganoExpediente(String organoExpediente) {
		this.organoExpediente = organoExpediente;
	}

	public String getInteresado() {
		return interesado;
	}

	public void setInteresado(String interesado) {
		this.interesado = interesado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getEstadoElaboracion() {
		return estadoElaboracion;
	}

	public void setEstadoElaboracion(String estadoElaboracion) {
		this.estadoElaboracion = estadoElaboracion;
	}

	public String getTipoDocumental() {
		return tipoDocumental;
	}

	public void setTipoDocumental(String tipoDocumental) {
		this.tipoDocumental = tipoDocumental;
	}

	public String getOrganoDocumento() {
		return organoDocumento;
	}

	public void setOrganoDocumento(String organoDocumento) {
		this.organoDocumento = organoDocumento;
	}

	public String getFechaCaptura() {
		return fechaCaptura;
	}

	public void setFechaCaptura(String fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}
}
