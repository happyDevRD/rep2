package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.GfTarifa;

public interface ITarifaService {

	public List<GfTarifa> findAll();
	public GfTarifa findById(Long idTarif);
	public GfTarifa save(GfTarifa oTarifa);
	public List<GfTarifa> findByIdProce(Long idProce);
	public void delete(Long idTarif);
}
