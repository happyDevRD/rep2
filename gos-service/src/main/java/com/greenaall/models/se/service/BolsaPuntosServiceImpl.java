package com.greenaall.models.se.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.se.dao.BolsaPuntosDao;
import com.greenaall.models.se.entity.SeBolsaPuntos;

/**
*
* @author jmmoyano
*/

@Service
public class BolsaPuntosServiceImpl implements IBolsaPuntosService{
	
	@Autowired
    private BolsaPuntosDao dao;

	@Override
	@Transactional
	public SeBolsaPuntos save(SeBolsaPuntos oBolsaPuntos) {
		return dao.save(oBolsaPuntos);
	}

}
