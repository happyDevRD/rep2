package com.greenaall.models.pe.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.pe.entity.PersonaCargo;
import com.greenaall.models.pe.entity.PersonaCargoPK;

public interface PersonaCargoDao extends CrudRepository<PersonaCargo, PersonaCargoPK>{

	@Query(value = "SELECT * FROM pe_persona_cargo WHERE id_his_perso = ?1 AND id_perso = ?2", nativeQuery = true)
	PersonaCargo findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
}
