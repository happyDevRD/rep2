package com.greenaall.rd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.rd.entity.RdTemaDocumento;
import com.greenaall.models.rd.service.RdTemaDocumentoServiceImpl;

@RestController
public class RdTemaDocumentoController {
	
	@Autowired
    private RdTemaDocumentoServiceImpl service;
	
	@GetMapping("/temaDocumento/listar/{idOrgEleme}")
	public List<RdTemaDocumento> listar(@PathVariable Long idOrgEleme) {
		
		List<RdTemaDocumento> aTemaDocumento = service.findByIdOrgElemeAndIndActiv(idOrgEleme);
		if(aTemaDocumento == null) {
			return java.util.Collections.emptyList();
		}
		return aTemaDocumento;
	}
	
	@GetMapping("/temaDocumento/ver/{codTema}")
	public RdTemaDocumento ver(@PathVariable String codTema) {
		
		RdTemaDocumento oTemaDocumento = service.findById(codTema);
		if(oTemaDocumento == null) {
			throw new NoDataFoundException();
		}
		return oTemaDocumento;
	}

}
