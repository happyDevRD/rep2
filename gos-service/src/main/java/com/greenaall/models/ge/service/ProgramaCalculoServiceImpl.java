package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.ProgramaCalculoDao;
import com.greenaall.models.ge.entity.ProgramaCalculo;

import jakarta.transaction.Transactional;

@Service
public class ProgramaCalculoServiceImpl implements IProgramaCalculoService{
	
	@Autowired
	private ProgramaCalculoDao programaCalculoDao;

	@Override
	@Transactional
	public ProgramaCalculo findById(String codProgr) {
		ProgramaCalculo oProgramaCalculo = programaCalculoDao.findById(codProgr).orElse(null);
		if(oProgramaCalculo == null) {
			return null;
		}
		return oProgramaCalculo;
	}

}
