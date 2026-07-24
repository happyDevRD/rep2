package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.UsuarioValor;
import com.greenaall.models.ge.entity.UsuarioValorPk;

public interface UsuarioValorDao extends CrudRepository<UsuarioValor, UsuarioValorPk>{
	
	@Query(value = "SELECT * FROM ge_usuario_valor WHERE usuario = ?1 AND num_valor = ?2", nativeQuery = true)
	List<UsuarioValor> findByUsuarioAndNumValor(String usuario, Short numValor);

}
