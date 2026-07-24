package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.PeticionFirmanteDao;
import com.greenaall.models.ge.entity.PeticionFirmante;

import jakarta.transaction.Transactional;

@Service
public class PeticionFirmanteServiceImpl implements IPeticionFirmanteService{
	
	@Autowired
	private PeticionFirmanteDao peticionFirmanteDao;

	@Override
	public PeticionFirmante save(PeticionFirmante oPeticionFirmante) {
		return peticionFirmanteDao.save(oPeticionFirmante);
	}
	
	@Override
	@Transactional
	public List<PeticionFirmante> findByIdPeticion(Long idPeticion) {
		List<PeticionFirmante> aPeticionFirma = peticionFirmanteDao.findByIdPeticion(idPeticion);
		if (aPeticionFirma == null || aPeticionFirma.isEmpty() ) {
			return null;
		}
		return aPeticionFirma;
	}

}
