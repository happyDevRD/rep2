package com.greenaall.models.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.co.dao.ContabilidadDao;
import com.greenaall.models.co.entity.Contabilidad;

/**
*
* @author jmmoyano
*/

@Service
public class ContabilidadServiceImpl implements IContabilidadService{

	@Autowired
    private ContabilidadDao dao;
	
	@Override
	public List<Contabilidad> findAll() {
		return (List<Contabilidad>) dao.findAll();
	}

	@Override
	public Contabilidad findById(Long idConta) {
		Contabilidad oContabilidad = dao.findById(idConta).orElse(null);
        if (oContabilidad == null) {
        	return null;
        }
        return oContabilidad;
	}

	@Override
	public List<Contabilidad> findByEstadAndIndAcces(Short indEstad, Short indAcces) {
		List<Contabilidad> aContabilidad = dao.findByEstadAndIndAcces(indEstad, indAcces);
        if (aContabilidad != null && !aContabilidad.isEmpty()) {
        	return aContabilidad;
        }
        return null;
	}

	@Override
	public Contabilidad findByEjeConta(Short ejeConta) {
		Contabilidad oContabilidad = dao.findByEjeConta(ejeConta);
        if (oContabilidad == null) {
        	return null;
        }
        return oContabilidad;
	}

}
