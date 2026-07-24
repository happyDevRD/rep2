package com.greenaall.models.ve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ve.dao.MarcaModeloDao;
import com.greenaall.models.ve.entity.MarcaModelo;


@Service
public class MarcaModeloServiceImpl implements IMarcaModeloService{
	
	@Autowired
	private MarcaModeloDao marcaModeloDao;

	@Override
	@Transactional(readOnly = true)
	public MarcaModelo findById(Integer numModel) {
		
		MarcaModelo oMarcaModelo = marcaModeloDao.findById(numModel).orElse(null);
		if(oMarcaModelo == null) {
			return null;
		}
		return oMarcaModelo;
		
	}

}
