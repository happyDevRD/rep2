package com.greenaall.models.co.service;

import java.util.List;

import com.greenaall.models.co.entity.Contabilidad;

public interface IContabilidadService {
	
	public List<Contabilidad> findAll();
	public Contabilidad findById(Long idConta);
	public List<Contabilidad> findByEstadAndIndAcces(Short indEstad, Short indAcces);
	public Contabilidad findByEjeConta(Short ejeConta);

}
