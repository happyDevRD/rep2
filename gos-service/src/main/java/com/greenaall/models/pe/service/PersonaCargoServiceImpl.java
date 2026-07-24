package com.greenaall.models.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.pe.dao.PersonaCargoDao;
import com.greenaall.models.pe.entity.PersonaCargo;

@Service
public class PersonaCargoServiceImpl implements IPersonaCargoService{
	
	@Autowired
	private PersonaCargoDao personaCargoDao;

	@Override
	public PersonaCargo findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso) {
		PersonaCargo oPersonaCargo = personaCargoDao.findByIdHisPersoAndIdPerso(idHisPerso, idPerso);
		if(oPersonaCargo == null) {
			return null;
		}
		return oPersonaCargo;
	}

}
