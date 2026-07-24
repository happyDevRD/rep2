package com.greenaall.models.pe.dao;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.Query;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;

public interface PersonaEntidadDao extends CrudRepository<PersonaEntidad, PersonaEntidadPK>{

	Optional<PersonaEntidad> findByNumDocum(String numDocum);
	
	Optional<PersonaEntidad> findByIdHisPerso(Long IdHisPerso);
	
	@Query(value = "SELECT max(id_perso) FROM pe_persona_entidad", nativeQuery = true)
	BigDecimal max();
}
