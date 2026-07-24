package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.PeticionFirmaDao;
import com.greenaall.models.ge.entity.PeticionFirma;
import jakarta.transaction.Transactional;

@Service
public class PeticionFirmaServiceImpl implements IPeticionFirmaService{

	@Autowired
	private PeticionFirmaDao peticionFirmaDao;
	
	@Override
	@Transactional
	public PeticionFirma findById(Long id) {
		
		PeticionFirma oPeticionFirma = peticionFirmaDao.findById(id).orElse(null);
		if(oPeticionFirma == null) {
			return null;
		}
		return oPeticionFirma;
	}
	
	@Override
	@Transactional
	public PeticionFirma findByIdPetPlata(String idPetPlata) {
		PeticionFirma oPeticionFirma = peticionFirmaDao.findByIdPetPlata(idPetPlata);
		if (oPeticionFirma == null) {
			return null;
		}
		return oPeticionFirma;
	}

	@Override
	public PeticionFirma save(PeticionFirma oPeticionFirma) {
		return peticionFirmaDao.save(oPeticionFirma);
	}
}
