package com.greenaall.models.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.rd.dao.RegistradorDao;
import com.greenaall.models.rd.entity.RdRegistrador;
import com.greenaall.models.rd.entity.RdRegistradorPK;

@Service
public class RdRegistradorServiceImpl implements IRdRegistradorService{
	
	@Autowired
	private RegistradorDao registradorDao;

	@Override
	@Transactional(readOnly = true)
	public RdRegistrador findById(RdRegistradorPK oRegistradorPK) {
		
		RdRegistrador oRdRegistrador = registradorDao.findById(oRegistradorPK).orElse(null);
		if(oRdRegistrador == null) {
			return null;
		}
		return oRdRegistrador;
		
	}
}
