package com.greenaall.models.pa.service;

import java.util.List;

import com.greenaall.models.pa.entity.Habitante;
import com.greenaall.models.pa.entity.HabitantePK;

public interface IHabitanteService {

	public List<Habitante> findByNumDocum(String numDocum);
	public Habitante findById(HabitantePK oHabitantePK);
	public Habitante save(Habitante oHabitante);
}
