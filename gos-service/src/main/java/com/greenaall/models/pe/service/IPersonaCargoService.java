package com.greenaall.models.pe.service;

import com.greenaall.models.pe.entity.PersonaCargo;

public interface IPersonaCargoService {

	public PersonaCargo findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
}
