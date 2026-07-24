package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ex.dao.TareaHistoricoTramiteExpedienteDao;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;

/**
*
* @author jmmoyano
*/

@Service
public class TareaHistoricoTramiteExpedienteServiceImpl implements ITareaHistoricoTramiteExpedienteService {

	@Autowired
    private TareaHistoricoTramiteExpedienteDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public TareaHistoricoTramiteExpediente findById(Long id) {
		TareaHistoricoTramiteExpediente tareaHistoricoTramiteexpediente = dao.findById(id).orElse(null);
        if (tareaHistoricoTramiteexpediente == null) {
        	return null;
        }
        return tareaHistoricoTramiteexpediente;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public TareaHistoricoTramiteExpediente save(TareaHistoricoTramiteExpediente tareaHistoricoTramiteexpediente) {
		return dao.save(tareaHistoricoTramiteexpediente);
	}

	@Override
	@Transactional( readOnly = true)
	public List<TareaHistoricoTramiteExpediente> findAll() {
		return (List<TareaHistoricoTramiteExpediente>) dao.findAll();
	}

	@Override
	@Transactional( readOnly = true)
	public List<TareaHistoricoTramiteExpediente> findByTarea(Long idTarea) {
		List<TareaHistoricoTramiteExpediente> aTareas = dao.findByTarea(idTarea);
		if(aTareas != null && !aTareas.isEmpty()) {
			return aTareas;
		}
		return null;
	}
}
