package com.greenaall.models.co.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.co.entity.CodigoOperacion;

public interface CodigoOperacionDao  extends CrudRepository<CodigoOperacion, Long>{
	
	@Query(value = "SELECT * FROM co_codigo_operacion WHERE id_gru_cod_opera = ?1 AND ind_area = ?2 AND ind_agrup = ?3 AND signo = ?4 AND cla_opera = ?5 AND ind_tip_subsi = 0", nativeQuery = true)
	CodigoOperacion findByIdCodOpera(Long idGruCodOpera, Short indArea, Short indAgrup, Short signo, Short claOpera);

}
