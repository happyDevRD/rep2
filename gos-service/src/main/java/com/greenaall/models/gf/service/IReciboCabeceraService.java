package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.ReciboCabecera;
import com.greenaall.models.gf.entity.ReciboCabeceraPK;

public interface IReciboCabeceraService {

	public List<ReciboCabecera> findByRecibosPendientes(Long idHisPerso, Long idPerso);
	public ReciboCabecera findById(ReciboCabeceraPK oReciboCabeceraPk);
	public ReciboCabecera save(ReciboCabecera oReciboCabecera);
	public ReciboCabecera findByIdRecibAndEjeRecib(Long idRecib, Short ejeRecib);
}
