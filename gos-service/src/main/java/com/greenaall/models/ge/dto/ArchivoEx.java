package com.greenaall.models.ge.dto;

import java.io.File;
import java.io.Serializable;

import com.greenaall.models.ge.entity.Archivo;

public class ArchivoEx extends Archivo implements Serializable {

	private static final long serialVersionUID = 6770355858797353772L;

	private String desPlant;

	private transient Long idArchivoPeticion;

	private transient File ficheroReferido;


	/**
	 * Constructor por defecto
	 */
	public ArchivoEx() {
		super();
	}

	/**
	 * Constructor copia: crea un Archivo Extendido con la información de un
	 * Archivo.
	 * 
	 * @param a Archivo
	 */
	public ArchivoEx(Archivo a) {
		super(a);
	}

	/**
	 * Constructor copia.
	 * 
	 * @param a Archivo
	 */
	public ArchivoEx(ArchivoEx a) {
		this((Archivo) a);

		desPlant = a.desPlant;
		idArchivoPeticion = a.idArchivoPeticion;
		ficheroReferido = a.ficheroReferido != null ? new File(a.ficheroReferido.getPath()) : null;
	}

	/**
	 * @return the desPlant
	 */
	public String getDesPlant() {
		return desPlant;
	}

	/**
	 * @param desPlant the desPlant to set
	 */
	public void setDesPlant(String desPlant) {
		this.desPlant = desPlant;
	}

	/**
	 * Asignar el número que identifica de forma unívoca este Archivo entre varios
	 * Archivos enviados a un Proceso de Firmado. Si no se asigna dicho
	 * identificador, {@link #getIdArchivoPeticion()} devuelve el Código de Archivo.
	 * <p>
	 * <b>Nota:</b> esta propiedad está marcada como transitoria.
	 * </p>
	 * 
	 * @param idArchivoPeticion
	 */
	public void setIdArchivoPeticion(Long idArchivoPeticion) {
		this.idArchivoPeticion = idArchivoPeticion;
	}

	/**
	 * Obtener el número que identifica de forma unívoca este Archivo entre varios
	 * Archivos enviados a un Proceso de Firmado. Si no se ha asignado
	 * explícitamente, devuelve el Código de Archivo (clave primaria del DTO).
	 * <p>
	 * <b>Nota:</b> esta propiedad está marcada como transitoria.
	 * </p>
	 * 
	 * @return
	 */
	public Long getIdArchivoPeticion() {
		return idArchivoPeticion != null ? idArchivoPeticion : getCodArchi();
	}

	/**
	 * Asignar el Fichero físico al que se refiere este Archivo.
	 * <p>
	 * <b>Nota:</b> esta propiedad está marcada como transitoria.
	 * </p>
	 * 
	 * @param ficheroReferido
	 */
	public void setFicheroReferido(File ficheroReferido) {
		this.ficheroReferido = ficheroReferido;
	}

	/**
	 * Obtener el Fichero físico al que se refiere este Archivo.
	 * <p>
	 * <b>Nota:</b> esta propiedad está marcada como transitoria.
	 * </p>
	 * 
	 * @return
	 */
	public File getFicheroReferido() {
		return ficheroReferido;
	}
}
