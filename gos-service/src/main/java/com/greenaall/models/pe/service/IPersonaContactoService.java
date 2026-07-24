package com.greenaall.models.pe.service;

import java.util.List;

import com.greenaall.models.pe.entity.PersonaContacto;

public interface IPersonaContactoService {

	public List<PersonaContacto> findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
	public PersonaContacto save(PersonaContacto oPersonaContacto);
}
