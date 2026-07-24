package com.greenaall.models.ex.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;


public interface SolicitudDao extends CrudRepository<Solicitud, Long>{
	
	@Query(value = "SELECT max(numero) FROM ex_solicitud WHERE ejercicio = ?1", nativeQuery = true)
	public BigDecimal max(Short ejercicio);
	
	List<Solicitud> findByDepartamento(Long departamento);
	
	List<Solicitud> findByEstadoAndDepartamento(EnumEstadoSolicitud estado, Long idOrgEleme);
}
