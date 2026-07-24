package com.greenaall.models.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.co.dao.JusGastoDao;
import com.greenaall.models.co.entity.JusGasto;


/**
*
* @author jmmoyano
*/

@Service
public class JusGastoServiceImpl implements IJusGastoService {

	@Autowired
    private JusGastoDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public JusGasto findById(Long idJusGasto) {
		JusGasto oJusGasto = dao.findById(idJusGasto).orElse(null);
        if (oJusGasto == null) {
        	return null;
        }
        return oJusGasto;
	}
	
	@Override
	@Transactional
	public JusGasto save(JusGasto oJusGasto) {
		return dao.save(oJusGasto);
	}

	@Override
	@Transactional( readOnly = true)
	public List<JusGasto> findAll() {
		return (List<JusGasto>) dao.findAll();
	}
}
