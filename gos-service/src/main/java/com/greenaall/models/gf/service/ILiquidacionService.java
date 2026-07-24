package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.Liquidacion;

public interface ILiquidacionService {
	
	public Liquidacion findById(Long idLiqui);
	public Liquidacion save(Liquidacion liquidacion);
	public List<Liquidacion> findAll();
	public void deleteById(Long idLiqui);

}
