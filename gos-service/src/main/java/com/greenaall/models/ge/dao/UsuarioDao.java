package com.greenaall.models.ge.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, String> {

	@Query(value = "SELECT * FROM ge_usuario WHERE id_his_perso = ?1 AND id_perso = ?2", nativeQuery = true)
	Usuario findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
}
