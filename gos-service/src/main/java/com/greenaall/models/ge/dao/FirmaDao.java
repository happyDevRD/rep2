package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.Firma;

public interface FirmaDao extends CrudRepository<Firma, Integer>{

	@Query(value = "SELECT * FROM ge_firma WHERE id_pro_firma = ?1", nativeQuery = true)
	List<Firma> findByIdProFirma(Integer idProFirma);
}
