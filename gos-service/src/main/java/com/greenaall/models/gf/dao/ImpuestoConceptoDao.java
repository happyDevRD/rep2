package com.greenaall.models.gf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.ImpuestoConcepto;
import com.greenaall.models.gf.entity.ImpuestoConceptoPK;

public interface ImpuestoConceptoDao extends CrudRepository<ImpuestoConcepto, ImpuestoConceptoPK>{

	@Query(value = "SELECT * FROM gf_impuesto_concepto WHERE id_impue = ?1", nativeQuery = true)
	List<ImpuestoConcepto> findByIdImpue(Long idImpue);

}
