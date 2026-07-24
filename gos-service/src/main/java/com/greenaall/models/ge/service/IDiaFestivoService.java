package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.DiaFestivo;
import com.greenaall.models.ge.entity.DiaFestivoPK;

public interface IDiaFestivoService {
	
	public List<DiaFestivo> findAll();
	public DiaFestivo findById(DiaFestivoPK oPlantillaPK);
	public List<DiaFestivo> findByFecFesti(String fechaIncio, String fechaFin);

}
