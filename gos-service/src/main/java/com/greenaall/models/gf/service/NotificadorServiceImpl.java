package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.NotificadorDao;
import com.greenaall.models.gf.entity.GfNotificador;

/**
*
* @author jmmoyano
*/

@Service
public class NotificadorServiceImpl implements INotificadorService{
	
	@Autowired
    private NotificadorDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<GfNotificador> findAll() {
		return (List<GfNotificador>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public GfNotificador findById(Short id) {
		GfNotificador notificador = dao.findById(id).orElse(null);
        if (notificador == null) {
        	return null;
        }
        return notificador;
	}

}
