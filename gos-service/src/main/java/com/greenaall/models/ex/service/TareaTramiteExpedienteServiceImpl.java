package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.TareaTramiteExpedienteDao;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;

/**
*
* @author jmmoyano
*/

@Service
public class TareaTramiteExpedienteServiceImpl implements ITareaTramiteExpedienteService{

	@Autowired
    private TareaTramiteExpedienteDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public TareaTramiteExpediente findById(Long id) {
		TareaTramiteExpediente tareaTramiteexpediente = dao.findById(id).orElse(null);
        if (tareaTramiteexpediente == null) {
        	throw new NoDataFoundException();
        }
        return tareaTramiteexpediente;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public TareaTramiteExpediente save(TareaTramiteExpediente tareaTramiteexpediente) {
		return dao.save(tareaTramiteexpediente);
	}

	@Override
	@Transactional( readOnly = true)
	public List<TareaTramiteExpediente> findAll() {
		return (List<TareaTramiteExpediente>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<TareaTramiteExpediente> findByTramite(Long tramite) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findByTramite(tramite);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<TareaTramiteExpediente> findByUsuario(String usuario) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findByUsuario(usuario);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<TareaTramiteExpediente> findbyUsuarioAndFecFin(String usuario) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findbyUsuarioAndFecFin(usuario);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<TareaTramiteExpediente> findbyInstructor(String usuario) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findbyInstructor(usuario);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}

	@Override
	public List<TareaTramiteExpediente> findByTareaProcedimiento(Long tareaProcedimiento) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findByTareaProcedimiento(tareaProcedimiento);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}

	@Override
	public List<TareaTramiteExpediente> findByNotificacion(Long notificacion) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findByNotificacion(notificacion);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<TareaTramiteExpediente> findbyFirmado(Short firmado) {
		List<TareaTramiteExpediente> aTarTraExped = (List<TareaTramiteExpediente>) dao.findbyFirmado(firmado);
		if(aTarTraExped.isEmpty()) {
			return null;
		}
		return aTarTraExped;
	}
	
}
