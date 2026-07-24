package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Tramitador;

public interface TramitadorDao  extends CrudRepository<Tramitador, Long>{
	
	List<Tramitador> findByExpediente(Long expediente);
	List<Tramitador> findByUsuario(String usuario);
	
	@Query(value = "SELECT distinct(expediente) FROM ex_tramitador WHERE usuario = ?1 and posesion = 1", nativeQuery = true)
	List<Long> findByExpedientUsuario(String usuario);
	
	@Query(value = "SELECT * FROM ex_tramitador WHERE expediente = ?1 and usuario = ?2 and posesion = 1", nativeQuery = true)
	List<Tramitador> findByExpedienteAndPosesion(Long id, String usuario);
	
	@Query(value = "SELECT * FROM ex_tramitador WHERE expediente = ?1 and usuario = ?2 and estado_tramitacion = 'TRAMITANDO' and posesion = 1", nativeQuery = true)
	List<Tramitador> findByExpedienteAndPosesionAndEstado(Long id, String usuario);
	
	

}