package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.DocumentoSolicitudDao;
import com.greenaall.models.ex.entity.DocumentoSolicitud;

@Service
public class DocumentoSolicitudServiceImpl implements IDocumentoSolicitudService{

	@Autowired
    private DocumentoSolicitudDao dao;

	@Override
	@Transactional( readOnly = true)
	public DocumentoSolicitud findById(Long id) {
		DocumentoSolicitud documentoSolicitud = dao.findById(id).orElse(null);
        if (documentoSolicitud == null) {
        	throw new NoDataFoundException();
        }
        return documentoSolicitud;
	}
	
	@Override
	@Transactional( readOnly = true)
	public List<DocumentoSolicitud> findBySolicitud(Long solicitud) {
		List<DocumentoSolicitud> aDocumentoSolicitud = dao.findBySolicitud(solicitud);
        if (aDocumentoSolicitud == null) {
        	throw new NoDataFoundException();
        }
        return aDocumentoSolicitud;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
	        dao.deleteById(id);        
    }

	@Transactional
	public void deleteByObject(DocumentoSolicitud documentoSolicitud) {
		dao.deleteById(documentoSolicitud.getId());	 
	}

	@Override
	@Transactional
	public DocumentoSolicitud save(DocumentoSolicitud documentoSolicitud) {
		return dao.save(documentoSolicitud);
	}

	@Override
	@Transactional( readOnly = true)
	public List<DocumentoSolicitud> findAll() {
		return (List<DocumentoSolicitud>) dao.findAll();
	}

}
