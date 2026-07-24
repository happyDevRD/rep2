package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.ReciboCabeceraDao;
import com.greenaall.models.gf.entity.ReciboCabecera;
import com.greenaall.models.gf.entity.ReciboCabeceraPK;

/**
*
* @author jmmoyano
*/

@Service
public class ReciboCabeceraServiceImpl implements IReciboCabeceraService{
	
	@Autowired
    private ReciboCabeceraDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<ReciboCabecera> findByRecibosPendientes(Long idHisPerso, Long idPerso) {
		List<ReciboCabecera> aReciboCabecera = dao.findByRecibosPendientes(idHisPerso, idPerso);
		
		if(aReciboCabecera != null && !aReciboCabecera.isEmpty()) {
			return aReciboCabecera;
		}
		return null;
	}

	@Override
	@Transactional( readOnly = true)
	public ReciboCabecera findById(ReciboCabeceraPK oReciboCabeceraPk) {
		ReciboCabecera oReciboCabecera = dao.findById(oReciboCabeceraPk).orElse(null);
        if (oReciboCabecera == null) {
        	return null;
        }
        return oReciboCabecera;
	}

	@Override
	public ReciboCabecera save(ReciboCabecera oReciboCabecera) {
		return dao.save(oReciboCabecera);
	}

	@Override
	@Transactional( readOnly = true)
	public ReciboCabecera findByIdRecibAndEjeRecib(Long idRecib, Short ejeRecib) {
		ReciboCabecera oReciboCabecera = dao.findByIdRecibAndEjeRecib(idRecib, ejeRecib);
        if (oReciboCabecera == null) {
        	return null;
        }
        return oReciboCabecera;
	}

}
