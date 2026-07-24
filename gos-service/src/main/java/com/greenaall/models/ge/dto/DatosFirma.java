package com.greenaall.models.ge.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

public class DatosFirma implements Serializable{

	private static final long serialVersionUID = -1030245605091531136L;
	/* Constantes de Prioridad */

	/** Constante de Prioridad: Prioridad Baja */
	public static Byte PRIORIDAD_BAJA = 0;
	/** Constante de Prioridad: Prioridad Media */
	public static Byte PRIORIDAD_MEDIA = 1;
	/** Constante de Prioridad: Prioridad Alta */
	public static Byte PRIORIDAD_ALTA = 2;
	/** Constante de Prioridad: Prioridad por Defecto (Media) */
	public static Byte PRIORIDAD_DEFAULT = PRIORIDAD_MEDIA;

	/**
	 * Propiedad que almacena el asunto de la firma
	 */
	private String asunto;

	/**
	 * Propiedad que almacena el texto de la firma
	 */
	private String texto;

	/**
	 * Propiedad que alamcena la fecha de inicio de la firma
	 */
	private java.util.Date fecInicio;

	/**
	 * Propiedad que almacena la fecha de fin de la firma
	 */
	private java.util.Date fecFin;

	/**
	 * Propiedad que almacena la prioridad de la firma
	 */
	private Byte prioridad;

	/**
	 * Propiedad que almacena las etiquetas de búsqueda de la firma
	 */
	private String tags;

	private String referencia;

	public ProcesoFirmadoEx procesoFirmado;

	/**
	 * Constructor por Defecto.
	 * 
	 * Crea un DatosFirma vacío.
	 */
	public DatosFirma() {
	}

	/**
	 * Construye un DatosFirma con el asunto y referencia especificados, y el
	 * resto de campos con valores por defecto:
	 * <ul>
	 * <li>Fecha Inicio: día presente</li>
	 * <li>Fecha Fin: día siguiente</li>
	 * <li>Prioridad: {@link DatosFirma#PRIORIDAD_DEFAULT}</li>
	 * </ul>
	 * 
	 * @param asunto
	 * @param referencia
	 */
	public DatosFirma(String asunto, String referencia) {
		this(asunto, referencia, null);
	}

	/**
	 * Construye un DatosFirma con el asunto, referencia y procesoFirmado
	 * especificados, y el resto de campos con valores por defecto:
	 * <ul>
	 * <li>Fecha Inicio: día presente</li>
	 * <li>Prioridad: {@link DatosFirma#PRIORIDAD_DEFAULT}</li>
	 * </ul>
	 * 
	 * @param asunto
	 * @param referencia
	 * @param procesoFirmado
	 */
	public DatosFirma(String asunto, String referencia,
			ProcesoFirmadoEx procesoFirmado) {
		this.procesoFirmado = procesoFirmado;
		this.asunto = asunto;
		this.referencia = referencia;

		this.prioridad = PRIORIDAD_DEFAULT;
		Calendar hoy = Calendar.getInstance();
		this.fecInicio = hoy.getTime();
		// hoy.add(Calendar.DAY_OF_MONTH, 1);
		// this.fecFin = hoy.getTime();
	}

	/**
	 * Constructor copia.
	 * 
	 * @param datosFirma
	 */
	public DatosFirma(DatosFirma datosFirma) {
		asunto = datosFirma.asunto;
		texto = datosFirma.texto;
		fecInicio = datosFirma.fecInicio == null ? null : new Date(
				datosFirma.fecInicio.getTime());
		fecFin = datosFirma.fecFin == null ? null : new Date(
				datosFirma.fecFin.getTime());
		prioridad = datosFirma.prioridad;
		tags = datosFirma.tags;
		referencia = datosFirma.referencia;
		procesoFirmado = datosFirma.procesoFirmado;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecInicio() {
		return fecInicio;
	}

	public void setFecInicio(Date fecInicio) {
		this.fecInicio = fecInicio;
	}

	public Date getFecFin() {
		return fecFin;
	}

	public void setFecFin(Date fecFin) {
		this.fecFin = fecFin;
	}

	public Byte getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Byte prioridad) {
		this.prioridad = prioridad;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public final String getReferencia() {
		return referencia;
	}

	public final void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public final ProcesoFirmadoEx getProcesoFirmado() {
		return procesoFirmado;
	}

	public final void setProcesoFirmado(ProcesoFirmadoEx procesoFirmado) {
		this.procesoFirmado = procesoFirmado;
	}
}
