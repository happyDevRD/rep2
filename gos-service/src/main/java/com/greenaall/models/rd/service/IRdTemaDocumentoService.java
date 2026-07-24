package com.greenaall.models.rd.service;

import java.util.List;

import com.greenaall.models.rd.entity.RdTemaDocumento;

public interface IRdTemaDocumentoService {
	
	public RdTemaDocumento findById(String codTema);
	public List<RdTemaDocumento> findByIdOrgElemeAndIndActiv(Long idOrgEleme);

}
