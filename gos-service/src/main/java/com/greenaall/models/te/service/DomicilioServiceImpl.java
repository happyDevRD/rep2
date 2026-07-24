package com.greenaall.models.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.te.dao.DomicilioDao;
import com.greenaall.models.te.entity.Domicilio;
import com.greenaall.models.te.entity.DomicilioPK;

/**
*
* @author jmmoyano
*/

@Service
public class DomicilioServiceImpl implements IDomicilioService{

	@Autowired
    private DomicilioDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Domicilio findById(DomicilioPK domicilioPK) {
		Domicilio domicilio = dao.findById(domicilioPK).orElse(null);
        if (domicilio == null) {
        	throw new NoDataFoundException();
        }
        return domicilio;
	}
}
