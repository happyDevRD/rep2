package com.greenaall.models.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.te.dao.ProvinciaDao;
import com.greenaall.models.te.entity.Provincia;

/**
*
* @author jmmoyano
*/

@Service
public class ProvinciaServiceImpl implements IProvinciaService{

	@Autowired
    private ProvinciaDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Provincia findById(Long id) {
		Provincia provincia = dao.findById(id).orElse(null);
        if (provincia == null) {
        	throw new NoDataFoundException();
        }
        return provincia;
	}
	
}
