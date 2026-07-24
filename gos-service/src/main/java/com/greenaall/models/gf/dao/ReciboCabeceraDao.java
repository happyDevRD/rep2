package com.greenaall.models.gf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.ReciboCabecera;
import com.greenaall.models.gf.entity.ReciboCabeceraPK;

public interface ReciboCabeceraDao extends CrudRepository<ReciboCabecera, ReciboCabeceraPK>{

	
	@Query(value = "SELECT * FROM gf_recibo_cabecera WHERE reg_activ = 1 AND cod_movim <> 'B'"
			+ " AND cod_entid = 1 AND est_recib IN (1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,30,32,35,37,40)"
			+ " AND id_his_perso = ?1 AND id_perso = ?2", nativeQuery = true)
	List<ReciboCabecera> findByRecibosPendientes(Long idHisPerso, Long idPerso);
	
	@Query(value = "SELECT * FROM gf_recibo_cabecera WHERE reg_activ = 1 AND cod_movim <> 'B'"
			+ " AND cod_entid = 1 AND id_recib = ?1 AND eje_recib = ?2", nativeQuery = true)
	ReciboCabecera findByIdRecibAndEjeRecib(Long idRecib, Short ejeRecib);

}
