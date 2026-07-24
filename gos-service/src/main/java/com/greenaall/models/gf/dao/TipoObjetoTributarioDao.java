package com.greenaall.models.gf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.TipoObjetoTributario;
import com.greenaall.models.gf.entity.TipoObjetoTributarioPK;


public interface TipoObjetoTributarioDao extends CrudRepository<TipoObjetoTributario, TipoObjetoTributarioPK>{
	
	@Query(value = "SELECT * FROM gf_tipo_objeto_tributario WHERE cod_entid = 1 AND reg_activ=1 AND modulo = ?1 ORDER BY cod_tip_obj_tribu ASC", nativeQuery = true)
	List<TipoObjetoTributario> findByModulo(Short modulo);

}
