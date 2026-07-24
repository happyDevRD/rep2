package com.greenaall.models.pe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.pe.entity.PersonaContacto;
import com.greenaall.models.pe.entity.PersonaContactoPK;

public interface PersonaContactoDao extends CrudRepository<PersonaContacto, PersonaContactoPK>{

	@Query(value = "SELECT * FROM pe_persona_contacto WHERE id_his_perso = ?1 AND id_perso = ?2", nativeQuery = true)
	List<PersonaContacto> findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
}
