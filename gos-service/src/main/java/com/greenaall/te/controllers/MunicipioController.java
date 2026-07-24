package com.greenaall.te.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.service.MunicipioServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class MunicipioController {
	
	@Autowired
    private MunicipioServiceImpl service;
	
	@GetMapping("/municipio/ver/{codProvi}/{codMunic}")
	public Municipio detalle(@PathVariable Short codProvi, @PathVariable Short codMunic) {
		MunicipioPK oMunicipioPK = new MunicipioPK();
		oMunicipioPK.setCodProvi(codProvi);
		oMunicipioPK.setCodMunic(codMunic);
		Municipio municipiio = service.findById(oMunicipioPK);
		return municipiio;
	}

}
