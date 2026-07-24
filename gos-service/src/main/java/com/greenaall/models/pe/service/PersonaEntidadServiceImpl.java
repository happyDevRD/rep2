package com.greenaall.models.pe.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pe.dao.PersonaEntidadDao;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;

@Service
public class PersonaEntidadServiceImpl implements IPersonaEntidadService {

	@Autowired
	private PersonaEntidadDao personaEntidadDao;
	
	@Override
	@Transactional(readOnly = true)
	public PersonaEntidad findByNumDocum(String numDocum) {
		PersonaEntidad oPersonaEntidad = personaEntidadDao.findByNumDocum(numDocum).orElse(null);
        if (oPersonaEntidad == null) {
        	return null;
        }
        return oPersonaEntidad;
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaEntidad findById(PersonaEntidadPK oPersonaEntidadPK) {
		PersonaEntidad oPersonaEntidad = personaEntidadDao.findById(oPersonaEntidadPK).orElse(null);
        if (oPersonaEntidad == null) {
        	return null;
        }
        return oPersonaEntidad;
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaEntidad findByIdHisPerso(Long IdHisPerso) {
		PersonaEntidad oPersonaEntidad = personaEntidadDao.findByIdHisPerso(IdHisPerso).orElse(null);
        if (oPersonaEntidad == null) {
        	return null;
        }
        return oPersonaEntidad;
	}
	
	@Override
	@Transactional
	public PersonaEntidad save(PersonaEntidad personaEntidad) {
		return personaEntidadDao.save(personaEntidad);
	}
	
	public BigDecimal max() {
		return personaEntidadDao.max();
	}

}
