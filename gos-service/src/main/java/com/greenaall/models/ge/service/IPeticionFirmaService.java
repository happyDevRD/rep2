package com.greenaall.models.ge.service;

import com.greenaall.models.ge.entity.PeticionFirma;

public interface IPeticionFirmaService {

	public PeticionFirma findById(Long id);
	public PeticionFirma save(PeticionFirma oPeticionFirma);
	public PeticionFirma findByIdPetPlata(String idPetPlata);
}
