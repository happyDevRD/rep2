package com.greenaall.models.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pe.dao.PersonaRepresentanteDao;
import com.greenaall.models.pe.entity.PersonaRepresentante;
import com.greenaall.models.pe.entity.PersonaRepresentantePK;

@Service
public class PersonaRepresentanteServiceImpl implements IPersonaRepresentanteService {
	
	@Autowired
	private PersonaRepresentanteDao personaRepresentateDao;

	@Override
	@Transactional(readOnly = true)
	public PersonaRepresentante findById(PersonaRepresentantePK oPersonaEntidadPK) {
		
		PersonaRepresentante oPersonaRepresentante = personaRepresentateDao.findById(oPersonaEntidadPK).orElse(null);
		if(oPersonaRepresentante == null) {
			return null;
		}
		return oPersonaRepresentante;
	
	
	}

	@Override
	@Transactional(readOnly = true)
	public List<PersonaRepresentante> findByIdPersoAndIdHisPerso(Long idPerso, Long idHisPerso) {
		List<PersonaRepresentante> aPersonaRepresentate = (List<PersonaRepresentante>) personaRepresentateDao.findByIdPersoAndIdHisPerso(idPerso, idHisPerso);
		if(aPersonaRepresentate.isEmpty()) {
			return null;
		}
		return aPersonaRepresentate;
	}
	

	@Override
	@Transactional
	public PersonaRepresentante save(PersonaRepresentante personaRepresentante) {
		return personaRepresentateDao.save(personaRepresentante);
	}

}
