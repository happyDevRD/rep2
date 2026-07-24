package com.greenaall.models.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.co.dao.CoContadorDao;
import com.greenaall.models.co.entity.CoContador;
import com.greenaall.models.co.entity.CoContadorPK;


/**
*
* @author jmmoyano
*/

@Service
public class CoContadorServiceImpl implements ICoContadorService{
	
	@Autowired
    private CoContadorDao dao;

	@Override
	public CoContador findById(CoContadorPK oContadorPK) {
		CoContador oCoContador = dao.findById(oContadorPK).orElse(null);
        if (oCoContador == null) {
        	return null;
        }
        return oCoContador;
	}
	
	@Override
	@Transactional
	public CoContador save(CoContador oCoContador) {
		return dao.save(oCoContador);
	}
	
}
