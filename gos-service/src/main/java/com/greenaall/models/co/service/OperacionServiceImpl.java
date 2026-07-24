package com.greenaall.models.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.co.dao.OperacionDao;
import com.greenaall.models.co.entity.Operacion;

/**
*
* @author jmmoyano
*/

@Service
public class OperacionServiceImpl implements IOperacionService{
	
	@Autowired
    private OperacionDao dao;

	@Override
	public Operacion save(Operacion oOperacion) {
		return dao.save(oOperacion);
	}

	@Override
	public Operacion findById(Long idOpera) {
		Operacion oOperacion = dao.findById(idOpera).orElse(null);
        if (oOperacion == null) {
        	return null;
        }
        return oOperacion;
	}

	@Override
	public List<Operacion> findMaximo(Long idConta, Short ejeOpera) {
		List<Operacion> aOperacion = dao.findMaximo(idConta, ejeOpera);
        if (aOperacion != null && !aOperacion.isEmpty()) {
        	return aOperacion;
        }
        return null;
	}

	@Override
	public Operacion findByNumOpera(Long idConta, Short ejeOpera, Integer iNumOpera) {
		Operacion oOperacion = dao.findByNumOpera(idConta, ejeOpera, iNumOpera);
        if (oOperacion == null) {
        	return null;
        }
        return oOperacion;
	}

}
