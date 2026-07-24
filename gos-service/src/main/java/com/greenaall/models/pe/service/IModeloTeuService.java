package com.greenaall.models.pe.service;

import java.util.List;

import com.greenaall.models.pe.entity.ModeloTeu;

public interface IModeloTeuService {
	
	public ModeloTeu findById(Long idModel);
	public List<ModeloTeu> findAll();

}
