package com.greenaall.models.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pe.dao.DomiciliacionBancariaDao;
import com.greenaall.models.pe.entity.DomiciliacionBancaria;
import com.greenaall.models.pe.entity.DomiciliacionBancariaPK;

@Service
public class DomiciliacionBancariaServiceImpl implements IDomiciliacionBancariaService{

	@Autowired
	private DomiciliacionBancariaDao domiciliacionBancariaDao;

	@Override
	@Transactional(readOnly = true)
	public DomiciliacionBancaria findById(DomiciliacionBancariaPK oDomiciliacionBancariaPK) {
		
		DomiciliacionBancaria oDomiciliacionBancaria = domiciliacionBancariaDao.findById(oDomiciliacionBancariaPK).orElse(null);
		if(oDomiciliacionBancaria == null) {
			return null;
		}
		return oDomiciliacionBancaria;
	
	}
	
	@Override
	@Transactional
	public DomiciliacionBancaria save(DomiciliacionBancaria oDomiciliacionBancaria) {
		return domiciliacionBancariaDao.save(oDomiciliacionBancaria);
	}
}
