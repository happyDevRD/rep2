package com.greenaall.models.co.service;

import java.util.List;

import com.greenaall.models.co.entity.Operacion;

public interface IOperacionService {

	public Operacion save(Operacion oOperacion);
	public Operacion findById(Long idOpera);
	public List<Operacion> findMaximo(Long idConta, Short ejeOpera);
	public Operacion findByNumOpera(Long idConta, Short ejeOpera, Integer iNumOpera);
}
