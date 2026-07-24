package com.greenaall.models.ge.dto;

import java.io.Serializable;

import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.util.comun.DtoRc;

public class ProcesoFirmadoRc extends ProcesoFirmado implements Serializable, DtoRc {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8672764807644713529L;

	/**
	* Atributo de la Columna 'des_plant'
	*/
	private String desPlant;
	
	/**
	* Atributo de la Columna 'tip_plant'
	*/
	private Short tipPlant;
	
	/**
	* Método 'ProcesoFirmadoRc' Constructor de la Clase
	*/
	public ProcesoFirmadoRc() {
	}
	
	/**
	* Método 'getDesPlant' Descripción de la Plantilla
	* 
	* @return String Descripción de la Plantilla
	*/
	public final String getDesPlant() {
	return desPlant;
	}
	
	/**
	* Método 'setDesPlant' Descripción de la Plantilla
	* 
	* @param desPlant
	*            Descripción de la Plantilla
	*/
	public final void setDesPlant(String desPlant) {
	this.desPlant = desPlant;
	}
	
	/**
	* Método 'getTipPlant' Tipo de Plantilla
	* 
	* @return Short Tipo de Plantilla
	*/
	public final Short getTipPlant() {
	return tipPlant;
	}
	
	/**
	* Método 'setTipPlant' Tipo de Plantilla
	* 
	* @param tipPlant
	*            Tipo de Plantilla
	*/
	public final void setTipPlant(Short tipPlant) {
	this.tipPlant = tipPlant;
	}
	
	/**
	* Método 'equals' Compara el Objeto
	* 
	* @param _other
	*            Objeto a Comparar
	* @return boolean Si son iguales
	*/
	@Override
	public boolean equals(Object _other) {
	if (!(super.equals(_other))) {
		return false;
	}
	
	if(!(_other instanceof ProcesoFirmadoRc)){
		return false;
	}
	
	final ProcesoFirmadoRc _cast = (ProcesoFirmadoRc) _other;
	if (desPlant == null ? _cast.desPlant != desPlant : !desPlant
			.equals(_cast.desPlant)) {
		return false;
	}
	
	if (tipPlant == null ? _cast.tipPlant != tipPlant : !tipPlant
			.equals(_cast.tipPlant)) {
		return false;
	}
	
	return true;
	}
	
	/**
	* Método 'hashCode'
	* 
	* @return int HashCode
	*/
	@Override
	public int hashCode() {
	int _hashCode = super.hashCode();
	
	if (desPlant != null) {
		_hashCode = 29 * _hashCode + desPlant.hashCode();
	}
	
	if (tipPlant != null) {
		_hashCode = 29 * _hashCode + tipPlant.hashCode();
	}
	
	return _hashCode;
	}
	
	/**
	* Método 'toString' Devuelve el Objeto en Cadena de Caracteres
	* 
	* @return String Cadena de Caracteres
	*/
	@Override
	public String toString() {
	StringBuffer ret = new StringBuffer();
	
	ret.append(super.toString());
	ret.append(", desPlant='" + desPlant + "'");
	ret.append(", tipPlant='" + tipPlant + "'");
	return ret.toString();
	}
	
	/**
	* Crea un nuevo {@link ProcesoFirmadoEx} copia de este, asignándole las
	* firmas especificadas.
	* 
	* @param firmas
	*            Array de Firmas del Proceso de Firmado
	* @return El nuevo objeto {@link ProcesoFirmadoEx} creado.
	*/
	public ProcesoFirmadoEx extender(FirmaEx[] firmas) {
		ProcesoFirmadoEx nuevoProcesoFirmadoEx = new ProcesoFirmadoEx(firmas);
		
		nuevoProcesoFirmadoEx.setActivo(getActivo());
		nuevoProcesoFirmadoEx.setCodEntid(getCodEntid());
		nuevoProcesoFirmadoEx.setConDesat(getConDesat());
		nuevoProcesoFirmadoEx.setDesPlant(getDesPlant());
		nuevoProcesoFirmadoEx.setIdProFirma(getIdProFirma());
		nuevoProcesoFirmadoEx.setModulo(getModulo());
		nuevoProcesoFirmadoEx.setPlantilla(getPlantilla());
		nuevoProcesoFirmadoEx.setTipFirma(getTipFirma());
		nuevoProcesoFirmadoEx.setTipPlant(getTipPlant());
		nuevoProcesoFirmadoEx.setFecContr(getFecContr());
		nuevoProcesoFirmadoEx.setUsuContr(getUsuContr());
		
		return nuevoProcesoFirmadoEx;
	}
}