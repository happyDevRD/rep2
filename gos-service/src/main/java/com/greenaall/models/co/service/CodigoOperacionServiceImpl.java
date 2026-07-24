package com.greenaall.models.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.co.dao.CodigoOperacionDao;
import com.greenaall.models.co.entity.CodigoOperacion;

/**
*
* @author jmmoyano
*/

@Service
public class CodigoOperacionServiceImpl implements ICodigoOperacionService{

	@Autowired
    private CodigoOperacionDao dao;

	@Override
	public CodigoOperacion findByIdCodOpera(Long idGruCodOpera, Short indArea, Short indAgrup, Short signo,
			Short claOpera) {
		CodigoOperacion oCodigoOperacion = dao.findByIdCodOpera(idGruCodOpera, indArea, indAgrup, signo, claOpera);
		if(oCodigoOperacion != null) {
			return oCodigoOperacion;
		}
		return null;
	}

	@Override
	public CodigoOperacion findById(Long idCodOpera) {
		CodigoOperacion oCodigoOperacion = dao.findById(idCodOpera).orElse(null);
        if (oCodigoOperacion == null) {
        	return null;
        }
        return oCodigoOperacion;
	}
}
