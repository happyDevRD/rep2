package com.greenaall.models.rd.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.rd.entity.RdRegistro;
import com.greenaall.models.rd.entity.RdRegistroPK;

public interface RegistroDao extends CrudRepository<RdRegistro, RdRegistroPK>{

	@Query(value = "SELECT * FROM rd_registro WHERE tip_regis = 1 AND entidad = 1", nativeQuery = true)
	RdRegistro findByTipRegisAndEntidad();
}
