package com.greenaall.models.ex.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.SolicitudDao;
import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;

import org.springframework.transaction.annotation.Transactional;

/**
*
* @author jmmoyano
*/

@Service
public class SolicitudServiceImpl implements ISolicitudService {

	@Autowired
    private SolicitudDao dao;
		
	@Override
	@Transactional( readOnly = true)
	public Solicitud findById(Long id) {
		Solicitud solicitud = dao.findById(id).orElse(null);
        if (solicitud == null) {
        	throw new NoDataFoundException();
        }
        return solicitud;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }

	@Transactional
	public void deleteByObject(Solicitud solicitud) { 
		 dao.deleteById(solicitud.getId());
	}

	@Override
	@Transactional
	public Solicitud save(Solicitud solicitud) {
		return dao.save(solicitud);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Solicitud> findAll() {
		return (List<Solicitud>) dao.findAll();
	}
	
	public BigDecimal max(Short ejercicio) {
		return dao.max(ejercicio);
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<Solicitud> findByDepartamento(Long departamento) {
		List<Solicitud> aSolicitud = (List<Solicitud>) dao.findByDepartamento(departamento);
		if(aSolicitud.isEmpty()) {
			return null;
		}
		return aSolicitud;
	}

	@Override
	public List<Solicitud> findByEstadoAndDepartamento(EnumEstadoSolicitud estado, Long idOrgEleme) {
		List<Solicitud> aSolicitud = (List<Solicitud>) dao.findByEstadoAndDepartamento(estado, idOrgEleme);
		if(aSolicitud.isEmpty()) {
			return null;
		}
		return aSolicitud;
	}

}
