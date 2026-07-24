package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.DiaFestivo;
import com.greenaall.models.ge.entity.DiaFestivoPK;


public interface DiaFestivoDao extends CrudRepository<DiaFestivo, DiaFestivoPK>{
	
	@Query(value = "SELECT * FROM ge_dia_festivo WHERE cod_entid = 1 AND fec_festi>=?1 AND fec_festi<=?2", nativeQuery = true)
	List<DiaFestivo> findByFecFesti(String fechaIncio, String fechaFin);

}
