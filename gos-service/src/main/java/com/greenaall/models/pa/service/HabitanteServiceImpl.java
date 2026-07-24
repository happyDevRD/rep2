package com.greenaall.models.pa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pa.dao.HabitanteDao;
import com.greenaall.models.pa.entity.Habitante;
import com.greenaall.models.pa.entity.HabitantePK;

@Service
public class HabitanteServiceImpl implements IHabitanteService{
	
	@Autowired
	private HabitanteDao habitanteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Habitante> findByNumDocum(String numDocum) {
		
		List<Habitante> aHbitante = habitanteDao.findByNumDocum(numDocum);
		
		if(aHbitante != null) {
			return aHbitante;
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Habitante findById(HabitantePK oHabitantePK) {
		
		Habitante oHabitante = habitanteDao.findById(oHabitantePK).orElse(null);
		if(oHabitante == null) {
			return null;
		}
		return oHabitante;
		
	}
	
	@Override
	@Transactional
	public Habitante save(Habitante oHabitante) {
		return habitanteDao.save(oHabitante);
	}
	
}
