package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.AtributoExpedientePK;

public interface AtributoExpedienteDao extends CrudRepository<AtributoExpediente, AtributoExpedientePK> {

	List<AtributoExpediente> findByIdExped(Long idExped);
	void deleteById(AtributoExpedientePK atributoExpediente);
	
	@Query(value = "SELECT * FROM ex_atributo_expediente WHERE id_grupo = ?1 AND eti_gru_atrib = ?2", nativeQuery = true)
	AtributoExpediente findByIdGrupoAndEtiGruAtrib(Long idGrupo, String etiGruAtrib);

}
