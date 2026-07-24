package com.greenaall.models.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.te.dao.MunicipioDao;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;

/**
*
* @author jmmoyano
*/

@Service
public class MunicipioServiceImpl implements IMunicipioService{

	@Autowired
    private MunicipioDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Municipio findById(MunicipioPK municipioPK) {
		Municipio municipio = dao.findById(municipioPK).orElse(null);
        if (municipio == null) {
        	throw new NoDataFoundException();
        }
        return municipio;
	}
}
