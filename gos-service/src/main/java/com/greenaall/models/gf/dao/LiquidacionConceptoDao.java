package com.greenaall.models.gf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.LiquidacionConcepto;
import com.greenaall.models.gf.entity.LiquidacionConceptoPK;

public interface LiquidacionConceptoDao extends CrudRepository<LiquidacionConcepto, LiquidacionConceptoPK>{

	@Query(value = "SELECT * FROM gf_liquidacion_concepto WHERE id_liqui = ?1", nativeQuery = true)
	List<LiquidacionConcepto> findByIdLiqui(Long idLiqui);

}
