package com.greenaall.models.pe.service;

import java.math.BigDecimal;
import java.util.List;

import com.greenaall.models.pe.entity.Notificacion;

public interface INotificacionService {
	
	public void deleteById(Long id);
	public Notificacion save(Notificacion oArchivo);
	public Notificacion findById(Long id);
	public List<Notificacion> findAll();
	public List<Notificacion> findByEjeExpedAndNumExped(Short ejeExped, String numExped);
	public BigDecimal max(Short ejeNotif);
}
