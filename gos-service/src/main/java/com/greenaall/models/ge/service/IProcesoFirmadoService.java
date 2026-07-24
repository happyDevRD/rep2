package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.ProcesoFirmado;

public interface IProcesoFirmadoService {
	
	public List<ProcesoFirmado> findAll();
	public ProcesoFirmado findById(Integer id);
	public List<ProcesoFirmado> findByPlantilla(String plantilla);
}
