package com.greenaall.models.rd.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.rd.dao.DocumentoInteresadoDao;
import com.greenaall.models.rd.entity.RdDocumentoInteresado;

@Service
public class RdDocumentoInteresadoServiceImpl implements IRdDocumentoInteresadoService{
	
	@Autowired
	private DocumentoInteresadoDao documentoInteresadoDao;

	@Override
	public RdDocumentoInteresado save(RdDocumentoInteresado oRdDocumentoInteresado) {
		return documentoInteresadoDao.save(oRdDocumentoInteresado);
	}
	
	public BigDecimal max(Short intPrinc) {
		return documentoInteresadoDao.max(intPrinc);
	}

}
