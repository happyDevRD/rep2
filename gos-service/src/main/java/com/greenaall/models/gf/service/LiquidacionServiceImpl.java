package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.gf.dao.LiquidacionDao;
import com.greenaall.models.gf.entity.Liquidacion;
import jakarta.transaction.Transactional;

/**
*
* @author jmmoyano
*/

@Service
public class LiquidacionServiceImpl implements ILiquidacionService{
	
	@Autowired
    private LiquidacionDao dao;
	
	@Override
	@Transactional
	public void deleteById(Long idLiqui) {
		dao.deleteById(idLiqui);
	}
	
	@Override
	@Transactional
	public Liquidacion save(Liquidacion oLiquidacion) {
		return dao.save(oLiquidacion);
	}
	
	@Override
	@Transactional
	public Liquidacion findById(Long idLiqui) {
		Liquidacion oLiquidacion = dao.findById(idLiqui).orElse(null);
		if(oLiquidacion == null) {
			return null;
		}
		return oLiquidacion;
	}

	@Override
	@Transactional
	public List<Liquidacion> findAll() {
		List<Liquidacion> aLiquidacion = (List<Liquidacion>) dao.findAll();
		if(aLiquidacion == null || aLiquidacion.isEmpty()) {
			return null;
		}
		return aLiquidacion;
	}


}
