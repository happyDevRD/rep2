package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.ImpuestoConceptoDao;
import com.greenaall.models.gf.entity.ImpuestoConcepto;
import com.greenaall.models.gf.entity.ImpuestoConceptoPK;

/**
*
* @author jmmoyano
*/

@Service
public class ImpuestoConceptoServiceImpl implements IImpuestoConceptoService{
	
	@Autowired
    private ImpuestoConceptoDao dao;

	@Override
	@Transactional(readOnly = true)
	public ImpuestoConcepto findById(ImpuestoConceptoPK oImpuestoConceptoPK) {
		ImpuestoConcepto oImpuestoConcepto = dao.findById(oImpuestoConceptoPK).orElse(null);
		if(oImpuestoConcepto == null) {
			return null;
		}
		return oImpuestoConcepto;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ImpuestoConcepto> findByIdImpue(Long idImpue) {
		List<ImpuestoConcepto> aImpuestoConcepto = dao.findByIdImpue(idImpue);
		if(aImpuestoConcepto == null || aImpuestoConcepto.isEmpty()) {
			return null;
		}
		return aImpuestoConcepto;
	}

}
