package com.greenaall.models.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pe.dao.ModeloTeuDao;
import com.greenaall.models.pe.entity.ModeloTeu;

@Service
public class ModeloTeuServiceImpl implements IModeloTeuService{
	
	@Autowired
	private ModeloTeuDao modeloTeuDao;

	@Override
	@Transactional(readOnly = true)
	public ModeloTeu findById(Long idModel) {
		ModeloTeu oModeloTeu = modeloTeuDao.findById(idModel).orElse(null);
		if(oModeloTeu == null) {
			return null;
		}
		return oModeloTeu;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModeloTeu> findAll() {
		List<ModeloTeu> aMdoleoTeu = (List<ModeloTeu>) modeloTeuDao.findAll();
		if(aMdoleoTeu == null || aMdoleoTeu.isEmpty()) {
			return null;
		}
		return aMdoleoTeu;
	}

}
