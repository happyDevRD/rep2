package com.greenaall.models.ex.service;

import java.math.BigDecimal;
import java.util.List;

import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;

/**
*
* @author jmmoyano
*/

public interface ISolicitudService {

	public Solicitud save(Solicitud solicitud);
	public List<Solicitud> findAll();
	public List<Solicitud> findByDepartamento(Long departamento);
	public Solicitud findById(Long id);
	public void deleteById(Long id);
	public void deleteByObject(Solicitud solicitud);
	public BigDecimal max(Short ejercicio);
	public List<Solicitud> findByEstadoAndDepartamento(EnumEstadoSolicitud estado, Long idOrgEleme);
}
