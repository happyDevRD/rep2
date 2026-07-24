package com.greenaall.co.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.co.entity.Contabilidad;
import com.greenaall.models.co.service.ContabilidadServiceImpl;

@RestController
public class ContabilidadController {

	@Autowired
    private ContabilidadServiceImpl serviceContabilidad;
	
	@GetMapping("/contabilidad/listaContOperativa")
	public List<Contabilidad> listaContOperativa() {
		
		List<Contabilidad> aContabilidad = serviceContabilidad.findByEstadAndIndAcces(Short.valueOf((short) 1), Short.valueOf((short) 1));
		if(aContabilidad == null) {
			throw new NoDataFoundException();
		}
		
		return aContabilidad;
	}

}
