package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.CargoPersona;

public interface CargoPersonaDao extends CrudRepository<CargoPersona, Integer>{

	@Query(value = "SELECT * FROM ge_cargo_persona WHERE id_cargo = ?1", nativeQuery = true)
	List<CargoPersona> findByIdCargo(Integer idCargo);
	
}
