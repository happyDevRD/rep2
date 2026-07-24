package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.GfMotivoNotificacion;

public interface IMotivoNotificacionService {
	
	public List<GfMotivoNotificacion> findAll();
	public GfMotivoNotificacion findById(Short id);

}
