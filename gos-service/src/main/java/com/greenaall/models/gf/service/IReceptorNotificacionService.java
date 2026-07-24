package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.GfReceptorNotificacion;

public interface IReceptorNotificacionService {

	public List<GfReceptorNotificacion> findAll();
	public GfReceptorNotificacion findById(Short id);
}
