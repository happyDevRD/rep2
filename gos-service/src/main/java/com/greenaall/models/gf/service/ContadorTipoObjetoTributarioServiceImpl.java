package com.greenaall.models.gf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.ContadorTipoObjetoTributarioDao;
import com.greenaall.models.gf.entity.ContadorTipoObjetoTributario;

/**
*
* @author jmmoyano
*/

@Service
public class ContadorTipoObjetoTributarioServiceImpl implements IContadorTipoObjetoTributarioService{

	@Autowired
    private ContadorTipoObjetoTributarioDao dao;

	@Override
	@Transactional(readOnly = true)
	public ContadorTipoObjetoTributario findById(Long idTipObjTribu) {
		ContadorTipoObjetoTributario oContadorTipoObjetoTributario = dao.findById(idTipObjTribu).orElse(null);
		if(oContadorTipoObjetoTributario == null) {
			return null;
		}
		return oContadorTipoObjetoTributario;
	}

	@Override
	public ContadorTipoObjetoTributario save(ContadorTipoObjetoTributario oContadorTipoObjetoTributario) {
		return dao.save(oContadorTipoObjetoTributario);
	}
}
