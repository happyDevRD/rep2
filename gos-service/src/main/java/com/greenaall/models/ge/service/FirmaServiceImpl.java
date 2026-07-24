package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ge.dao.FirmaDao;
import com.greenaall.models.ge.entity.Firma;

@Service
public class FirmaServiceImpl implements IFirmaService{
	
	@Autowired
	private FirmaDao firmaDao;
	
	@Override
	@Transactional(readOnly = true)
	public Firma findById(Integer id) {
		Firma oFirma = firmaDao.findById(id).orElse(null);
		if(oFirma == null) {
			return null;
		}
		return oFirma;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Firma> findByIdProFirma(Integer idProFirma) {
		List<Firma> aProcesoFirmado = (List<Firma>) firmaDao.findByIdProFirma(idProFirma);
		if(aProcesoFirmado.isEmpty()) {
			return null;
		}
		return aProcesoFirmado;
	}

}
