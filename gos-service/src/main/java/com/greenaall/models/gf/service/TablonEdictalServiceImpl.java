package com.greenaall.models.gf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.gf.dao.TablonEdictalDao;
import com.greenaall.models.gf.entity.GfTablonEdictal;

/**
*
* @author jmmoyano
*/

@Service
public class TablonEdictalServiceImpl implements ITablonEdictalService{

	@Autowired
    private TablonEdictalDao dao;

	@Override
	public GfTablonEdictal save(GfTablonEdictal oTablonEdictal) {
		return dao.save(oTablonEdictal);
	}
}
