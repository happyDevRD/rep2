package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.LiquidacionConcepto;

public interface ILiquidacionConceptoService {

	public LiquidacionConcepto save(LiquidacionConcepto oLiquidacionConcepto);
	public List<LiquidacionConcepto> findByIdLiqui(Long idLiqui);
}
