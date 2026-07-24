package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.GfNotificador;

public interface INotificadorService {
	
	public List<GfNotificador> findAll();
	public GfNotificador findById(Short id);

}
