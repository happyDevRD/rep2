package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ex.dao.InteresadoDao;
import com.greenaall.models.ex.entity.Interesado;

/**
*
* @author jmmoyano
*/

@Service
public class InteresadoServiceImpl implements IInteresadoService {

	@Autowired
    private InteresadoDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Interesado findById(Long id) {
		Interesado interesado = dao.findById(id).orElse(null);
        if (interesado == null) {
        	return null;
        }
        return interesado;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public Interesado save(Interesado interesado) {
		return dao.save(interesado);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Interesado> findAll() {
		return (List<Interesado>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<Interesado> findByExpediente(Long expediente) {
		List<Interesado> aInteresado = (List<Interesado>) dao.findByExpediente(expediente);
		if(aInteresado == null || aInteresado.isEmpty()) {
			return null;
		}
		return aInteresado;
	}

	@Override
	@Transactional( readOnly = true)
	public List<Interesado> findByExpedienteAndIdHisPerso(Long expediente, Long idHisPerso) {
		List<Interesado> aInteresado = dao.findByExpedienteAndIdHisPerso(expediente, idHisPerso);
		if(aInteresado == null || aInteresado.isEmpty()) {
			return null;
		}
		return aInteresado;
	}

	@Override
	@Transactional( readOnly = true)
	public Interesado findByExpedienteAndPrincipal(Long expediente) {
		Interesado interesado = dao.findByExpedienteAndPrincipal(expediente);
        if (interesado == null) {
        	return null;
        }
        return interesado;
	}


}
