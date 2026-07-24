package com.greenaall.models.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pe.dao.PersonaContactoDao;
import com.greenaall.models.pe.entity.PersonaContacto;

@Service
public class PersonaContactoServiceImpl implements IPersonaContactoService{
	
	@Autowired
	private PersonaContactoDao personaContactoDao;

	@Override
	public List<PersonaContacto> findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso) {
		List<PersonaContacto> aPersonaCargo = personaContactoDao.findByIdHisPersoAndIdPerso(idHisPerso, idPerso);
		if(aPersonaCargo == null) {
			return null;
		}
		return aPersonaCargo;
	}
	
	@Override
	@Transactional
	public PersonaContacto save(PersonaContacto oPersonaContacto) {
		return personaContactoDao.save(oPersonaContacto);
	}
}
