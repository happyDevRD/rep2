package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.ObjetoTributarioDao;
import com.greenaall.models.gf.entity.ObjetoTributario;
import com.greenaall.models.gf.entity.ObjetoTributarioPK;

/**
*
* @author jmmoyano
*/

@Service
public class ObjetoTributarioServiceImpl implements IObjetoTributarioService {
	
	@Autowired
    private ObjetoTributarioDao dao;
	
	@Override
	@Transactional
	public ObjetoTributario save(ObjetoTributario objetoTributario) {
		return dao.save(objetoTributario);
	}

	@Override
	@Transactional( readOnly = true)
	public List<ObjetoTributario> findByTipObjTribuAndSujPasiv(Long idHisTipObjTribu, Long idTipObjTribu, Long idHisSujPasiv, Long idSujPasiv) {
		
		List<ObjetoTributario> aObjetoTributario = dao.findByTipObjTribuAndSujPasiv(idHisTipObjTribu, idTipObjTribu, idHisSujPasiv, idSujPasiv);
		if(aObjetoTributario != null && !aObjetoTributario.isEmpty()) {
			return aObjetoTributario;
		}	
		
		return null;
	} 
	
	@Override
	@Transactional(readOnly = true)
	public ObjetoTributario findById(ObjetoTributarioPK oObjetoTribuarioPK) {
		ObjetoTributario oObjetoTributario = dao.findById(oObjetoTribuarioPK).orElse(null);
		if(oObjetoTributario == null) {
			return null;
		}
		return oObjetoTributario;
	}

	@Override
	@Transactional(readOnly = true)
	public ObjetoTributario findByIdObjTribu(Long idObjTribu, Long idHisTipObjTribu, Long idTipObjTribu) {
		ObjetoTributario oObjetoTributario = dao.findByIdObjTribu(idObjTribu, idHisTipObjTribu, idTipObjTribu);
		if(oObjetoTributario != null ) {
			return oObjetoTributario;
		}	
		
		return null;
	}
}
