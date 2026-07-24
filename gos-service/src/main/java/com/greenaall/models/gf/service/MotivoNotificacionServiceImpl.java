package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.MotivoNotificacionDao;
import com.greenaall.models.gf.entity.GfMotivoNotificacion;

/**
*
* @author jmmoyano
*/

@Service
public class MotivoNotificacionServiceImpl implements IMotivoNotificacionService{
	
	@Autowired
    private MotivoNotificacionDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<GfMotivoNotificacion> findAll() {
		return (List<GfMotivoNotificacion>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public GfMotivoNotificacion findById(Short id) {
		GfMotivoNotificacion motivoNotificacion = dao.findById(id).orElse(null);
        if (motivoNotificacion == null) {
        	return null;
        }
        return motivoNotificacion;
	}
}
