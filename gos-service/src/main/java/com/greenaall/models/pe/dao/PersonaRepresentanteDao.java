package com.greenaall.models.pe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.pe.entity.PersonaRepresentante;
import com.greenaall.models.pe.entity.PersonaRepresentantePK;

public interface PersonaRepresentanteDao extends CrudRepository<PersonaRepresentante, PersonaRepresentantePK>{
	
	@Query(value = "SELECT * FROM pe_persona_representante WHERE id_perso = ?1 AND id_his_perso = ?2 AND est_apodera = 2", nativeQuery = true)
	List<PersonaRepresentante> findByIdPersoAndIdHisPerso(Long idPerso, Long idHisPerso);

}
