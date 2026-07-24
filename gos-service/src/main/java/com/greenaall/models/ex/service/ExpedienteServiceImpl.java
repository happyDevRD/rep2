package com.greenaall.models.ex.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.ExpedienteDao;
import com.greenaall.models.ex.entity.Expediente;

/**
*
* @author jmmoyano
*/

@Service
public class ExpedienteServiceImpl implements IExpedienteService {

	@Autowired
    private ExpedienteDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Expediente findById(Long id) {
		Expediente expediente = dao.findById(id).orElse(null);
        if (expediente == null) {
        	throw new NoDataFoundException();
        }
        return expediente;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public Expediente save(Expediente expediente) {
		return dao.save(expediente);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Expediente> findAll() {
		return (List<Expediente>) dao.findAll();
	}
	
	public BigDecimal max(Short ejercicio) {
		return dao.max(ejercicio);
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<Expediente> findByInstructor(String instructor) {
		List<Expediente> aExpediente = (List<Expediente>) dao.findByInstructor(instructor);
		if(aExpediente.isEmpty()) {
			return null;
		}
		return aExpediente;
	}

	@Override
	@Transactional( readOnly = true)
	public Expediente findByEjercicioAndNumero(Short ejercicio, Integer numero) {
		Expediente oExpediente = dao.findByEjercicioAndNumero(ejercicio, numero);
		if(oExpediente == null) {
			return null;
		}
		return oExpediente;
	}

	@Override
	@Transactional( readOnly = true)
	public List<Expediente> findByProcedimiento(Long idProc) {
		List<Expediente> aExpediente = (List<Expediente>) dao.findByProcedimiento(idProc);
		if(aExpediente.isEmpty()) {
			return null;
		}
		return aExpediente;
	}
}
