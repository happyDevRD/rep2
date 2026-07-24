package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.CargoFirmaDao;
import com.greenaall.models.ge.entity.CargoFirma;

import jakarta.transaction.Transactional;

@Service
public class CargoFirmaServiceImpl implements ICargoFirmaService{

	@Autowired
	private CargoFirmaDao cargoFirmaDao;
	
	@Override
	@Transactional
	public CargoFirma findById(Integer id) {
		CargoFirma oCargoFirma = cargoFirmaDao.findById(id).orElse(null);
		if(oCargoFirma == null) {
			return null;
		}
		return oCargoFirma;
	}

}
