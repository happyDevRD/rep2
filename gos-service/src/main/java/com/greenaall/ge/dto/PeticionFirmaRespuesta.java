package com.greenaall.ge.dto;

import com.greenaall.models.ge.dto.RespuestaFirma;
import com.greenaall.models.ge.entity.PeticionFirma;

public class PeticionFirmaRespuesta extends PeticionFirma {

	private static final long serialVersionUID = 7256832100768453078L;
	/**
	 * Estado de los firmantes.
	 * <p>
	 * El Conector de la plataforma especificará este atributo al efectuar la
	 * petición de firma cuando sea necesario almacenar los firmantes.
	 * </p>
	 */
	private Short estFirmantes;

	/**
	 * Respuesta de Firmado Desatendido.
	 */
	private RespuestaFirma[] respFirmaDesatendida;

	/**
	 * Constructor por defecto.
	 */
	public PeticionFirmaRespuesta() {
	}

	/**
	 * Constructor copia que extiende una PeticionFirma con las respuestas de firma
	 * desatendida especificadas.
	 * 
	 * @param peticionFirma        PeticionFirma origen
	 * @param respFirmaDesatendida Respuestas de firma desatendida
	 */
/*	public PeticionFirmaRespuesta(PeticionFirma peticionFirma, RespuestaFirma[] respFirmaDesatendida) {
		super(peticionFirma);

		this.respFirmaDesatendida = respFirmaDesatendida;
	}*/

	/**
	 * Asignar el Estado de los firmantes.
	 * <p>
	 * El Conector de la plataforma especificará este atributo al efectuar la
	 * petición de firma cuando sea necesario almacenar los firmantes.
	 * </p>
	 * 
	 * @param estFirmantes Código de Estado de los firmantes
	 */
	public void setEstFirmantes(Short estFirmantes) {
		this.estFirmantes = estFirmantes;
	}

	/**
	 * Obtener el Estado de los firmantes.
	 * <p>
	 * El Conector de la plataforma especificará este atributo al efectuar la
	 * petición de firma cuando sea necesario almacenar los firmantes.
	 * </p>
	 * 
	 * @return El Código de Estado.
	 */
	public Short getEstFirmantes() {
		return estFirmantes;
	}

	/**
	 * Asignar la Respuesta de Firmado Desatendido.
	 * 
	 * @param respFirmaDesatendida Array de Respuestas, una por cada fichero enviado
	 *                             a firmar.
	 */
	public void setRespFirmaDesatendida(RespuestaFirma[] respFirmaDesatendida) {
		this.respFirmaDesatendida = respFirmaDesatendida;
	}

	/**
	 * Obtener la Respuesta de Firmado Desatendido.
	 * 
	 * @return Array de Respuestas, una por cada fichero enviado a firmar.
	 */
	public RespuestaFirma[] getRespFirmaDesatendida() {
		return respFirmaDesatendida;
	}
}
