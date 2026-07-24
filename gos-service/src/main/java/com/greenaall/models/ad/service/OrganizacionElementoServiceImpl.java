package com.greenaall.models.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ad.dao.OrganizacionElementoDao;
import com.greenaall.models.ad.entity.OrganizacionElemento;


@Service
public class OrganizacionElementoServiceImpl implements IOrganizacionElementoService {

	@Autowired
	private OrganizacionElementoDao organizacionElementoDao;
	
	@Override
	@Transactional(readOnly = true)
	public OrganizacionElemento findById(Long id) {
		OrganizacionElemento oOrganizacionElemento = organizacionElementoDao.findById(id).orElse(null);
		if(oOrganizacionElemento == null) {
			return null;
		}
		return oOrganizacionElemento;

	}

}
