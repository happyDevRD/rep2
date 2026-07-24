package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ex.dao.TramiteDao;
import com.greenaall.models.ex.entity.Tramite;

/**
*
* @author jmmoyano
*/

@Service
public class TramiteServiceImpl implements ITramiteService {

	@Autowired
    private TramiteDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Tramite findById(Long id) {
		Tramite tramite = dao.findById(id).orElse(null);
        if (tramite == null) {
        	return null;
        }
        return tramite;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public Tramite save(Tramite tramite) {
		return dao.save(tramite);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Tramite> findAll() {
		return (List<Tramite>) dao.findAll();
	}

	@Override
	@Transactional( readOnly = true)
	public List<Tramite> findByExpediente(Long expediente) {
		List<Tramite> aTramite = (List<Tramite>) dao.findByExpediente(expediente);
		if(aTramite.isEmpty()) {
			return null;
		}
		return aTramite;
	}

}
