package com.greenaall.models.rd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.rd.dao.DocumentoDao;
import com.greenaall.models.rd.entity.RdDocumento;

@Service
public class RdDocumentoServiceImpl implements IRdDocumentoService{
	
	@Autowired
	private DocumentoDao documentoDao;

	@Override
	@Transactional(readOnly = true)
	public RdDocumento findById(Long idHisDocum) {
		RdDocumento oRdDocumento = documentoDao.findById(idHisDocum).orElse(null);
		if(oRdDocumento == null) {
			return null;
		}
		return oRdDocumento;	
	}
	
	@Override
	@Transactional(readOnly = true)
	public void deleteById(Long id) {
		documentoDao.deleteById(id);
	}

	@Override
	public RdDocumento save(RdDocumento oArchivo) {
		return documentoDao.save(oArchivo);
	}


	@Override
	@Transactional(readOnly = true)
	public List<RdDocumento> findAll() {
		return (List<RdDocumento>) documentoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public RdDocumento findByIdHisDocumAndRegActiv(Long idHisDocum) {
		return (RdDocumento) documentoDao.findByIdHisDocumAndRegActiv(idHisDocum);
	}

}
