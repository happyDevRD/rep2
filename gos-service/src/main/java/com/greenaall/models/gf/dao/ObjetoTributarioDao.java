package com.greenaall.models.gf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.ObjetoTributario;
import com.greenaall.models.gf.entity.ObjetoTributarioPK;

public interface ObjetoTributarioDao extends CrudRepository<ObjetoTributario, ObjetoTributarioPK>{
	
	@Query(value = "SELECT * FROM gf_objeto_tributario WHERE cod_entid = 1 AND reg_activ=1 AND "
			+ "id_his_tip_obj_tribu = ?1 AND id_tip_obj_tribu = ?2 AND id_his_suj_pasiv = ?3 AND id_suj_pasiv = ?4", nativeQuery = true)
	List<ObjetoTributario> findByTipObjTribuAndSujPasiv(Long idHisTipObjTribu, Long idTipObjTribu, Long idHisSujPasiv, Long idSujPasiv);
	
	@Query(value = "SELECT * FROM gf_objeto_tributario WHERE cod_entid = 1 AND reg_activ=1 AND "
			+ "id_obj_tribu = ?1 AND id_his_tip_obj_tribu = ?2 AND id_tip_obj_tribu = ?3", nativeQuery = true)
	ObjetoTributario findByIdObjTribu(Long idObjTribu, Long idHisTipObjTribu, Long idTipObjTribu);

}
