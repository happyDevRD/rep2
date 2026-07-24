package com.greenaall.te.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.ProvinciaServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class ProvinciaController {
	
	@Autowired
    private ProvinciaServiceImpl service;
	
	@GetMapping("/provincia/ver/{id}")
	public Provincia detalle(@PathVariable Long id) {
		Provincia provincia = service.findById(id);
		return provincia;
	}

}
