package com.greenaall.models.se.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.se.dao.TablonAnunciosDao;
import com.greenaall.models.se.entity.SeTablonAnuncios;

/**
*
* @author jmmoyano
*/

@Service
public class TablonAnunciosServiceImpl implements ITablonAnunciosService{

	@Autowired
	private TablonAnunciosDao dao;
	
	@Override
	@Transactional
	public SeTablonAnuncios save(SeTablonAnuncios oTablonAnuncios) {
		return dao.save(oTablonAnuncios);
	}
}
