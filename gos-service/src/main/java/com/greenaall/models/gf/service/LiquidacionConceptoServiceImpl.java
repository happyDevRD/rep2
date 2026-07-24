package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.LiquidacionConceptoDao;
import com.greenaall.models.gf.entity.LiquidacionConcepto;

/**
*
* @author jmmoyano
*/

@Service
public class LiquidacionConceptoServiceImpl implements ILiquidacionConceptoService{

	@Autowired
    private LiquidacionConceptoDao dao;
	
	@Override
	@Transactional
	public LiquidacionConcepto save(LiquidacionConcepto oLiquidacionConcepto) {
		return dao.save(oLiquidacionConcepto);
	}

	@Override
	@Transactional
	public List<LiquidacionConcepto> findByIdLiqui(Long idLiqui) {
		List<LiquidacionConcepto> aLiquidacionConcepto = dao.findByIdLiqui(idLiqui);
		
		if(aLiquidacionConcepto == null || aLiquidacionConcepto.isEmpty()) {
			return null;
		}
		
		return aLiquidacionConcepto;
	}
}
