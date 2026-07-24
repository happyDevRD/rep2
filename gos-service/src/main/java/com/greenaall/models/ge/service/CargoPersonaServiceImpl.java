package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.CargoPersonaDao;
import com.greenaall.models.ge.entity.CargoPersona;
import jakarta.transaction.Transactional;

@Service
public class CargoPersonaServiceImpl implements ICargoPersonaService{

	@Autowired
	private CargoPersonaDao cargoPersonaDao;
	
	@Override
	@Transactional
	public CargoPersona findById(Integer id) {
		CargoPersona oCargoPersona = cargoPersonaDao.findById(id).orElse(null);
		if(oCargoPersona == null) {
			return null;
		}
		return oCargoPersona;
	}

	@Override
	public List<CargoPersona> findByIdCargo(Integer idCargo) {
		List<CargoPersona> aCargoPersona = (List<CargoPersona>) cargoPersonaDao.findByIdCargo(idCargo);
		if(aCargoPersona.isEmpty()) {
			return null;
		}
		return aCargoPersona;
	}
}
