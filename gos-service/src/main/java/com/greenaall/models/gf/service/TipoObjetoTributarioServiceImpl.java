package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.TipoObjetoTributarioDao;
import com.greenaall.models.gf.entity.TipoObjetoTributario;
import com.greenaall.models.gf.entity.TipoObjetoTributarioPK;

/**
*
* @author jmmoyano
*/

@Service
public class TipoObjetoTributarioServiceImpl implements ITipoObjetoTributarioService {
	
	@Autowired
    private TipoObjetoTributarioDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<TipoObjetoTributario> findByModulo(Short modulo) {
		List<TipoObjetoTributario> aTipoObjetoTributario = dao.findByModulo(modulo);
		if(aTipoObjetoTributario != null && !aTipoObjetoTributario.isEmpty()) {
			return aTipoObjetoTributario;
		}		
		return  null;
	}
	
	@Override
	@Transactional(readOnly = true)
	public TipoObjetoTributario findById(TipoObjetoTributarioPK oTipoObjetoTributarioPK) {
		TipoObjetoTributario oTipoObjetoTributario = dao.findById(oTipoObjetoTributarioPK).orElse(null);
		if(oTipoObjetoTributario == null) {
			return null;
		}
		return oTipoObjetoTributario;
	}
}
