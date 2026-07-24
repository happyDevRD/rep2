package com.greenaall.models.gf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.ConceptoDao;
import com.greenaall.models.gf.entity.Concepto;

/**
*
* @author jmmoyano
*/

@Service
public class ConceptoServiceImpl implements IConceptoService{

	@Autowired
    private ConceptoDao dao;

	@Override
	@Transactional(readOnly = true)
	public Concepto findById(String codConce) {
		Concepto oConcepto = dao.findById(codConce).orElse(null);
		if(oConcepto == null) {
			return null;
		}
		return oConcepto;
	}
}
