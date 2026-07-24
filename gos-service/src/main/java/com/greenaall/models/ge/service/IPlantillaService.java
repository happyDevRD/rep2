package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.Plantilla;
import com.greenaall.models.ge.entity.PlantillaPK;

public interface IPlantillaService {

	public List<Plantilla> findAll();
	public Plantilla findById(PlantillaPK oPlantillaPK);
	public List<Plantilla> findByModulo(Short modulo);
}
