package com.greenaall.models.co.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.co.entity.Tercero;

public interface TerceroDao  extends CrudRepository<Tercero, Long>{
	
	@Query(value = "SELECT * FROM co_tercero WHERE id_his_perso = ?1 AND id_perso = ?2", nativeQuery = true)
	Tercero findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);

}
