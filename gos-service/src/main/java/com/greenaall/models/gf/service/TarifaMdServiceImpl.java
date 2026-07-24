package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.TarifaMdDao;
import com.greenaall.models.gf.entity.GfTarifaMd;
import com.greenaall.models.gf.entity.GfTarifaMdPK;

/**
*
* @author jmmoyano
*/

@Service
public class TarifaMdServiceImpl implements ITarifaMdService{

	@Autowired
    private TarifaMdDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<GfTarifaMd> findAll() {
		return (List<GfTarifaMd>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public GfTarifaMd findById(GfTarifaMdPK id) {
		GfTarifaMd aTarifaMd = dao.findById(id).orElse(null);
        if (aTarifaMd == null) {
        	return null;
        }
        return aTarifaMd;
	}
}
