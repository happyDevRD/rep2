package com.greenaall.models.ad.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ad.entity.Contador;
import com.greenaall.models.ad.entity.ContadorPK;

public interface ContadorDao extends CrudRepository<Contador, ContadorPK>{

	@Query(value = "SELECT * FROM ad_contador WHERE anno = ?1 AND modulo = ?2 AND num_conta = ?3 AND cod_entid = ?4", nativeQuery = true)
	Contador findByAnnoAndModuloAndNumContaAndCodEntid(Short anno, Short modulo, Short numConta, Short codEntid);
}
