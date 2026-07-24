package com.greenaall.models.co.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.co.entity.Operacion;

public interface OperacionDao extends CrudRepository<Operacion, Long>{

	@Query(value = "SELECT * FROM co_operacion WHERE id_conta = 1? AND eje_opera = 2? AND num_opera > 66000000 AND num_opera < 66999999 ORDER BY num_opera", nativeQuery = true)
	List<Operacion> findMaximo(Long idConta, Short ejeOpera);
	
	
	@Query(value = "SELECT * FROM co_operacion WHERE id_conta = 1? AND eje_opera = 2? AND num_opera = 3?", nativeQuery = true)
	Operacion findByNumOpera(Long idConta, Short ejeOpera, Integer iNumOpera);
	
}
