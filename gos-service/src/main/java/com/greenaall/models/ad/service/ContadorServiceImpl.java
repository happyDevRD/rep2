package com.greenaall.models.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ad.dao.ContadorDao;
import com.greenaall.models.ad.entity.Contador;

@Service
public class ContadorServiceImpl implements IContadorService{
	
	@Autowired
	private ContadorDao contadoroDao;

	@Override
	@Transactional(readOnly = true)
	public Contador findByAnnoAndModuloAndNumContaAndCodEntid(Short anno, Short modulo, Short numConta, Short codEntid) {
		Contador oContador = contadoroDao.findByAnnoAndModuloAndNumContaAndCodEntid(anno, modulo, numConta, codEntid);
		return oContador;
	}

	@Override
	public Contador save(Contador oContador) {
		return contadoroDao.save(oContador);
	}

}
