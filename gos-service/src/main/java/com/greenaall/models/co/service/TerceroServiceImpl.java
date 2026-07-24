package com.greenaall.models.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.co.dao.TerceroDao;
import com.greenaall.models.co.entity.Tercero;

/**
*
* @author jmmoyano
*/

@Service
public class TerceroServiceImpl implements ITerceroService{
	
	@Autowired
    private TerceroDao dao;

	@Override
	public Tercero findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso) {
		Tercero oTercero = dao.findByIdHisPersoAndIdPerso(idHisPerso, idPerso);
        if (oTercero == null) {
        	return null;
        }
        return oTercero;
	}

	@Override
	public Tercero save(Tercero oTercero) {
		return dao.save(oTercero);	
	}

}
