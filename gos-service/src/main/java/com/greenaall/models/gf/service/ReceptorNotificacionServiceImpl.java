package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.ReceptorNotificacionDao;
import com.greenaall.models.gf.entity.GfReceptorNotificacion;

/**
*
* @author jmmoyano
*/

@Service
public class ReceptorNotificacionServiceImpl implements IReceptorNotificacionService{
	
	@Autowired
    private ReceptorNotificacionDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<GfReceptorNotificacion> findAll() {
		return (List<GfReceptorNotificacion>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public GfReceptorNotificacion findById(Short id) {
		GfReceptorNotificacion receptorNotificacion = dao.findById(id).orElse(null);
        if (receptorNotificacion == null) {
        	return null;
        }
        return receptorNotificacion;
	}
}
