package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.TareaProcedimiento;

public interface TareaProcedimientoDao extends CrudRepository<TareaProcedimiento, Long>{

	@Query(value = "SELECT * FROM ex_tarea_procedimiento WHERE procedimiento = ?1 ORDER BY id ASC", nativeQuery = true)
	List<TareaProcedimiento> findByProcedimiento(Long procedimiento);
	
	@Query(value = "SELECT * FROM ex_tarea_procedimiento WHERE tarea_automatica = true AND procedimiento = ?1 ORDER BY id ASC", nativeQuery = true)
	TareaProcedimiento findByTareaAutomatica(Long procedimiento);
	
	@Query(value = "SELECT * FROM ex_tarea_procedimiento WHERE tarea_automatica = false AND procedimiento = ?1 AND fase_tarea = ?2 ORDER BY id ASC", nativeQuery = true)
	List<TareaProcedimiento> findByProcedimientoAndFaseTarea(Long procedimiento, String faseTarea);
	
}
