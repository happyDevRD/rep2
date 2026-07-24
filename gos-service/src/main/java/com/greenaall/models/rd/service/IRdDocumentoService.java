package com.greenaall.models.rd.service;

import java.util.List;

import com.greenaall.models.rd.entity.RdDocumento;

public interface IRdDocumentoService {
	
	public RdDocumento findById(Long idHisDocum);
	public void deleteById(Long id);
	public RdDocumento save(RdDocumento oRdDocumento);
	public List<RdDocumento> findAll();
	public RdDocumento findByIdHisDocumAndRegActiv(Long idHisDocum);
}
