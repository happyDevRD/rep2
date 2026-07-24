package com.greenaall.models.ge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.CertificadoDao;
import com.greenaall.models.ge.entity.Certificado;

@Service
public class CertificadoServiceImpl implements ICertificadoService{
	
	@Autowired
	private CertificadoDao certificadoDao;

	@Override
	public Certificado findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso) {
		Certificado oCertificado = certificadoDao.findByIdHisPersoAndIdPerso(idHisPerso, idPerso);
		if(oCertificado == null) {
			return null;
		}
		return oCertificado;
	}

}
