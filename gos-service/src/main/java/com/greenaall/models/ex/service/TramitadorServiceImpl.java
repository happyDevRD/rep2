package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.TramitadorDao;
import com.greenaall.models.ex.entity.Tramitador;

/**
*
* @author jmmoyano
*/

@Service
public class TramitadorServiceImpl implements ITramitadorService {

	@Autowired
    private TramitadorDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Tramitador findById(Long id) {
		Tramitador tramitador = dao.findById(id).orElse(null);
        if (tramitador == null) {
        	throw new NoDataFoundException();
        }
        return tramitador;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public Tramitador save(Tramitador tramitador) {
		return dao.save(tramitador);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Tramitador> findAll() {
		return (List<Tramitador>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<Tramitador> findByExpediente(Long expediente) {
		List<Tramitador> aTramitador = (List<Tramitador>) dao.findByExpediente(expediente);
		if(aTramitador.isEmpty()) {
			return null;
		}
		return aTramitador;
	}

	@Override
	@Transactional( readOnly = true)
	public List<Tramitador> findByUsuario(String usuario) {
		List<Tramitador> aTramitador = (List<Tramitador>) dao.findByUsuario(usuario);
		if(aTramitador.isEmpty()) {
			return null;
		}
		return aTramitador;
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<Long> findByExpedientUsuario(String usuario) {
		List<Long> aExpediente = (List<Long>) dao.findByExpedientUsuario(usuario);
		if(aExpediente.isEmpty()) {
			return null;
		}
		return aExpediente;
	}

	@Override
	public List<Tramitador> findByExpedienteAndPosesion(Long id, String usuario) {
		List<Tramitador> aTramitador = (List<Tramitador>) dao.findByExpedienteAndPosesion(id, usuario);
		if(aTramitador.isEmpty()) {
			return null;
		}
		return aTramitador;
	}

	@Override
	public List<Tramitador> findByExpedienteAndPosesionAndEstado(Long id, String usuario) {
		List<Tramitador> aTramitador = (List<Tramitador>) dao.findByExpedienteAndPosesionAndEstado(id, usuario);
		if(aTramitador.isEmpty()) {
			return null;
		}
		return aTramitador;
	}


}
