package com.greenaall.models.pe.service;

import java.math.BigDecimal;

import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;

public interface IPersonaEntidadService {

	public PersonaEntidad findByNumDocum(String numDocum);
	public PersonaEntidad findById(PersonaEntidadPK oPersonaEntidadPK);
	public PersonaEntidad findByIdHisPerso(Long IdHisPerso);
	public PersonaEntidad save(PersonaEntidad oPersonaEntidad);
	public BigDecimal max();
}