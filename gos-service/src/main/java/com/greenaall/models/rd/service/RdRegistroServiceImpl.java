package com.greenaall.models.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.rd.dao.RegistroDao;
import com.greenaall.models.rd.entity.RdRegistro;

@Service
public class RdRegistroServiceImpl implements IRdRegistroService{
	
	@Autowired
	private RegistroDao registroDao;

	@Override
	@Transactional(readOnly = true)
	public RdRegistro findByTipRegisAndEntidad() {
		RdRegistro oRegistro = (RdRegistro) registroDao.findByTipRegisAndEntidad();
		if(oRegistro == null) {
			return null;
		}
		return oRegistro;
	}

}
