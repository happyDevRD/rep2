package com.greenaall.models.co.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.co.entity.Contabilidad;

public interface ContabilidadDao extends CrudRepository<Contabilidad, Long>{

	@Query(value = "SELECT * FROM co_contabilidad WHERE ind_estad = ?1 AND ind_acces = ?2 AND cod_entid = 1", nativeQuery = true)
	List<Contabilidad> findByEstadAndIndAcces(Short indEstad, Short indAcces);
	
	@Query(value = "SELECT * FROM co_contabilidad WHERE cod_entid = 1 AND eje_conta = ?1", nativeQuery = true)
	Contabilidad findByEjeConta(Short ejeConta);
}
