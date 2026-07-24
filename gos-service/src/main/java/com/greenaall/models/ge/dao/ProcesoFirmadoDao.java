package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.ProcesoFirmado;

public interface ProcesoFirmadoDao extends CrudRepository<ProcesoFirmado, Integer>{
	
	@Query(value = "SELECT * FROM ge_proceso_firmado WHERE activo=1 AND plantilla = ?1", nativeQuery = true)
	List<ProcesoFirmado> findByPlantilla(String plantilla);
}
