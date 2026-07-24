package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.DocumentoSolicitud;

public interface IDocumentoSolicitudService {

	public DocumentoSolicitud save(DocumentoSolicitud documentoSolicitud);
	public List<DocumentoSolicitud> findAll();
	public DocumentoSolicitud findById(Long id);
	public void deleteById(Long id);
	public List<DocumentoSolicitud> findBySolicitud(Long solicitud);
}
