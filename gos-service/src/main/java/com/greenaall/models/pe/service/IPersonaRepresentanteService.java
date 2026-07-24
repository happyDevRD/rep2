package com.greenaall.models.pe.service;

import java.util.List;

import com.greenaall.models.pe.entity.PersonaRepresentante;
import com.greenaall.models.pe.entity.PersonaRepresentantePK;

public interface IPersonaRepresentanteService {
	
	public PersonaRepresentante findById(PersonaRepresentantePK oPersonaEntidadPK);
	public List<PersonaRepresentante> findByIdPersoAndIdHisPerso(Long idPerso, Long idHisPerso);
	public PersonaRepresentante save(PersonaRepresentante oPersonaRepresentante);

}
