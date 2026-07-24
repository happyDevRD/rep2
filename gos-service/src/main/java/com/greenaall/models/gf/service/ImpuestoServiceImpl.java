package com.greenaall.models.gf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.gf.dao.ImpuestoDao;
import com.greenaall.models.gf.entity.Impuesto;

import jakarta.transaction.Transactional;

@Service
public class ImpuestoServiceImpl implements IImpuestoService {
	
	@Autowired
	private ImpuestoDao impuestoDao;

	@Override
	@Transactional
	public Impuesto findById(Long idImpue) {
		Impuesto oImpuesto = impuestoDao.findById(idImpue).orElse(null);
		if(oImpuesto == null) {
			return null;
		}
		return oImpuesto;
	}

}
