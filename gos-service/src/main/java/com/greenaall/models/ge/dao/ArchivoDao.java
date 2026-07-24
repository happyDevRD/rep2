package com.greenaall.models.ge.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.Archivo;

/**
*
* @author jmmoyano
*/

public interface ArchivoDao extends CrudRepository<Archivo, Long> {

	@Query(value = "SELECT * FROM ge_archivo WHERE des_archi = ?1 ", nativeQuery = true)
	Archivo findByDesArchi(String desArchi);
	
}
