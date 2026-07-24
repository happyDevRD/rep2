package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Procedimiento;

public interface ProcedimientoDao extends CrudRepository<Procedimiento, Long>{
	
	@Query(value = "SELECT * FROM ex_procedimiento WHERE descripcion = ?1", nativeQuery = true)
	List<Procedimiento> findByDescripcion(String descripcion);
}
