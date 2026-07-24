package com.greenaall.models.ge.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ge.dao.PlantillaDao;
import com.greenaall.models.ge.entity.Plantilla;
import com.greenaall.models.ge.entity.PlantillaPK;

@Service
public class PlantillaServiceImpl implements IPlantillaService{

	@Autowired
	private PlantillaDao plantillaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Plantilla> findAll() {
		return (List<Plantilla>) plantillaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Plantilla findById(PlantillaPK oPlantillaPk) {
		
		Plantilla oPlantilla = plantillaDao.findById(oPlantillaPk).orElse(null);
		if(oPlantilla == null) {
			return null;
		}
		return oPlantilla;
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Plantilla> findByModulo(Short modulo) {
		Short sModulo = Short.valueOf(modulo);
		List<Plantilla> aPlantilla = (List<Plantilla>) plantillaDao.findByModulo(sModulo);
		if(aPlantilla.isEmpty()) {
			throw new NoDataFoundException();
		}
		return aPlantilla;
	}
}
