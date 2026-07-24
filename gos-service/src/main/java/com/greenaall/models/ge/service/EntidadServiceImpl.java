package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.EntidadDao;
import com.greenaall.models.ge.entity.Entidad;
import jakarta.transaction.Transactional;

@Service
public class EntidadServiceImpl implements IEntidadService{
	
	@Autowired
	private EntidadDao entidadDao;

	@Override
	@Transactional
	public Entidad findById(Short codEntid) {
		
		Entidad oCodEntid = entidadDao.findById(codEntid).orElse(null);
		if(oCodEntid == null) {
			return null;
		}
		return oCodEntid;
	
	}

}
