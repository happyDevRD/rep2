package com.greenaall.models.pe.service;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.pe.dao.NotificacionDao;
import com.greenaall.models.pe.entity.Notificacion;

@Service
public class NotificacionServiceImpl implements INotificacionService{

	@Autowired
	private NotificacionDao notificacionDao;
	
	@Override
	public void deleteById(Long id) {
		notificacionDao.deleteById(id);
	}

	@Override
	public Notificacion save(Notificacion oArchivo) {
		return notificacionDao.save(oArchivo);
	}

	@Override
	public Notificacion findById(Long id) {
		Notificacion oNotificacion = notificacionDao.findById(id).orElse(null);
		if(oNotificacion == null) {
			return null;
		}
		return oNotificacion;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Notificacion> findAll() {
		return (List<Notificacion>) notificacionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Notificacion> findByEjeExpedAndNumExped(Short ejeExped, String numExped) {
		List<Notificacion> aNotificacion = (List<Notificacion>) notificacionDao.findByEjeExpedAndNumExped(ejeExped, numExped);
		if(aNotificacion.isEmpty()) {
			return null;
		}
		return aNotificacion;
	}
	
	public BigDecimal max(Short ejeNotif) {
		return notificacionDao.max(ejeNotif);
	}

}
