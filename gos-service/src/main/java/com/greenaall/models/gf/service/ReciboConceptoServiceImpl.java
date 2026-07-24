package com.greenaall.models.gf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.gf.dao.ReciboConceptoDao;
import com.greenaall.models.gf.entity.ReciboConcepto;

/**
*
* @author jmmoyano
*/

@Service
public class ReciboConceptoServiceImpl implements IReciboConceptoService{

	@Autowired
    private ReciboConceptoDao dao;
	
	@Override
	public ReciboConcepto save(ReciboConcepto oReciboCabecera) {
		return dao.save(oReciboCabecera);
	}
}
