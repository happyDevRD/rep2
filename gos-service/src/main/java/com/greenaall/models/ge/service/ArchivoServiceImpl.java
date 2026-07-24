package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.ArchivoDao;
import com.greenaall.models.ge.entity.Archivo;

import jakarta.transaction.Transactional;

@Service
public class ArchivoServiceImpl implements IArchivoService{
	
	@Autowired
	private ArchivoDao archivoDao;

	@Override
	@Transactional
	public void deleteById(Long id) {
		archivoDao.deleteById(id);
	}
	
	@Override
	@Transactional
	public Archivo save(Archivo oArchivo) {
		return archivoDao.save(oArchivo);
	}
	
	@Override
	@Transactional
	public Archivo findById(Long id) {
		Archivo oArchivo = archivoDao.findById(id).orElse(null);
		if(oArchivo == null) {
			return null;
		}
		return oArchivo;
	}

	@Override
	@Transactional
	public Archivo findByDesArchi(String desArchi) {
		Archivo oArchivo = archivoDao.findByDesArchi(desArchi);
		if(oArchivo == null) {
			return null;
		}
		return oArchivo;
	}

}
