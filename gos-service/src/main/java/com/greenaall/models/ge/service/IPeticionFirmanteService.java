package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.PeticionFirmante;

public interface IPeticionFirmanteService {
	
	public PeticionFirmante save(PeticionFirmante oPeticionFirmante);
	public List<PeticionFirmante> findByIdPeticion(Long idPeticion);
}
