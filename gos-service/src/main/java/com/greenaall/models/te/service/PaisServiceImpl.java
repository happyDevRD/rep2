package com.greenaall.models.te.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.te.dao.PaisDao;
import com.greenaall.models.te.entity.Pais;

@Service
public class PaisServiceImpl implements IPaisService {

	@Autowired
    private PaisDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public List<Pais> findAll() {
		return (List<Pais>) dao.findAll();
	}
}
