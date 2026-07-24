package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.AtributoExpedienteDao;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.AtributoExpedientePK;

/**
*
* @author jmmoyano
*/

@Service
public class AtributoExpedienteoServiceImpl implements IAtributoExpedienteService {

	@Autowired
    private AtributoExpedienteDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public AtributoExpediente findById(AtributoExpedientePK id) {
		AtributoExpediente atributoTareaProcedimiento = dao.findById(id).orElse(null);
        if (atributoTareaProcedimiento == null) {
        	throw new NoDataFoundException();
        }
        return atributoTareaProcedimiento;
	}
	
	@Override
	@Transactional 
	public void deleteById(AtributoExpedientePK id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public AtributoExpediente save(AtributoExpediente atributoTareaProcedimiento) {
		return dao.save(atributoTareaProcedimiento);
	}

	@Override
	@Transactional( readOnly = true)
	public List<AtributoExpediente> findAll() {
		return (List<AtributoExpediente>) dao.findAll();
	}

	@Override
	public List<AtributoExpediente> findByIdExped(Long idExped) {
		
		List<AtributoExpediente> aAtributosExpediente = dao.findByIdExped(idExped);
		if(aAtributosExpediente != null && !aAtributosExpediente.isEmpty()) {
			return aAtributosExpediente;
		}
		return null;
	}

	@Override
	public AtributoExpediente findByIdGrupoAndEtiGruAtrib(Long idGrupo, String etiGruAtrib) {
		AtributoExpediente oAtributosExpediente = dao.findByIdGrupoAndEtiGruAtrib(idGrupo, etiGruAtrib);
		if(oAtributosExpediente != null ) {
			return oAtributosExpediente;
		}
		return null;
	}

}
