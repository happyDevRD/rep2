package com.greenaall.models.rd.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.rd.dao.DocumentoAnexoDao;
import com.greenaall.models.rd.entity.RdDocumentoAnexo;

@Service
public class RdDocumentoAnexoServiceImpl implements IRdDocumentoAnexoService{
	
	@Autowired
	private DocumentoAnexoDao documentoAnexoDao;

	@Override
	public RdDocumentoAnexo save(RdDocumentoAnexo oRdDocumentoAnexo) {
		return documentoAnexoDao.save(oRdDocumentoAnexo);
	}
	
	public BigDecimal max(Short tipAnexo) {
		return documentoAnexoDao.max(tipAnexo);
	}

}
