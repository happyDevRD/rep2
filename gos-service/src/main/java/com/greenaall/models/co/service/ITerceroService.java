package com.greenaall.models.co.service;

import com.greenaall.models.co.entity.Tercero;

public interface ITerceroService {

	public Tercero findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
	public Tercero save(Tercero oTercero);
}
