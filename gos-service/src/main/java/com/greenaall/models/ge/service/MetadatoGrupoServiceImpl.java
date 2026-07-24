package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.MetadatoGrupoDao;
import com.greenaall.models.ge.entity.MetadatoGrupo;

import jakarta.transaction.Transactional;

@Service
public class MetadatoGrupoServiceImpl implements IMetadatoGrupoService{
	
	@Autowired
	private MetadatoGrupoDao metadatoGrupoDao;

	@Override
	@Transactional
	public void deleteById(Long id) {
		metadatoGrupoDao.deleteById(id);
	}

	@Override
	@Transactional
	public MetadatoGrupo save(MetadatoGrupo oMetadatoGrupo) {
		return metadatoGrupoDao.save(oMetadatoGrupo);
	}

	@Override
	@Transactional
	public MetadatoGrupo findById(Long id) {
		MetadatoGrupo oMetadatoGrupo = metadatoGrupoDao.findById(id).orElse(null);
		if(oMetadatoGrupo == null) {
			return null;
		}
		return oMetadatoGrupo;
	}
	
	@Override
	@Transactional
	public MetadatoGrupo findByCodGrupo(String codGrupo) {
		MetadatoGrupo oMetadatoGrupo = metadatoGrupoDao.findByCodGrupo(codGrupo);
		if(oMetadatoGrupo == null) {
			return null;
		}
		return oMetadatoGrupo;
	}

}
