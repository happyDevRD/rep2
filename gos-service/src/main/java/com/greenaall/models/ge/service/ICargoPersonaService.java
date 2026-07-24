package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.CargoPersona;

public interface ICargoPersonaService {

	public CargoPersona findById(Integer id);
	public List<CargoPersona> findByIdCargo(Integer idCargo);
}
