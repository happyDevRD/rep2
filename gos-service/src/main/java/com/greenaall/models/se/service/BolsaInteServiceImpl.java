package com.greenaall.models.se.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.se.dao.BolsaInteDao;
import com.greenaall.models.se.entity.SeBolsaInte;

/**
*
* @author jmmoyano
*/

@Service
public class BolsaInteServiceImpl implements IBolsaInteService{

	@Autowired
	private BolsaInteDao dao;
	
	@Override
	@Transactional
	public SeBolsaInte save(SeBolsaInte oBolsaInte) {
		return dao.save(oBolsaInte);
	}

}

