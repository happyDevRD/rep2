package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ge.dao.ParametroSistemaDao;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;


@Service
public class ParametroSistemaServiceImpl implements IParametroSistemaService{
	
	@Autowired
	private ParametroSistemaDao parametroSistemaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ParametroSistema> findAll() {
		return (List<ParametroSistema>) parametroSistemaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ParametroSistema findById(ParametroSistemaPK oParametroSistemaPk) {
		
		ParametroSistema oParametroSistema = parametroSistemaDao.findById(oParametroSistemaPk).orElse(null);
		if(oParametroSistema == null) {
			return null;
		}
		return oParametroSistema;

	}

}
