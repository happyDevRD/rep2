package com.greenaall.models.ex.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Expediente;

public interface ExpedienteDao extends CrudRepository<Expediente, Long>{

	@Query(value = "SELECT max(numero) FROM ex_expediente WHERE ejercicio = ?1", nativeQuery = true)
	public BigDecimal max(Short ejercicio);
	
	@Query(value = "SELECT * FROM ex_expediente WHERE ejercicio = ?1 AND numero = ?2", nativeQuery = true)
	public Expediente findByEjercicioAndNumero(Short ejercicio, Integer numero);
	
	
	List<Expediente> findByInstructor(String instructor);
	
	List<Expediente> findByProcedimiento(Long idProc);
}
