package com.greenaall.models.rd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.rd.dao.TemaDocumentoDao;
import com.greenaall.models.rd.entity.RdTemaDocumento;

@Service
public class RdTemaDocumentoServiceImpl implements IRdTemaDocumentoService{
	
	@Autowired
	private TemaDocumentoDao TemaDocumentoDao;

	@Override
	@Transactional(readOnly = true)
	public RdTemaDocumento findById(String codTema) {
		
		RdTemaDocumento RdTemaDocumento = TemaDocumentoDao.findById(codTema).orElse(null);
		if(RdTemaDocumento == null) {
			return null;
		}
		return RdTemaDocumento;
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<RdTemaDocumento> findByIdOrgElemeAndIndActiv(Long idOrgEleme) {
		List<RdTemaDocumento> aTemaDocumento = (List<RdTemaDocumento>) TemaDocumentoDao.findByIdOrgElemeAndIndActiv(idOrgEleme);
		if(aTemaDocumento.isEmpty()) {
			return null;
		}
		return aTemaDocumento;
	}

}
