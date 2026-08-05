package com.greenaall.te.controllers;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.te.entity.Pais;
import com.greenaall.models.te.service.PaisServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class PaisController {
	
	@Autowired
    private PaisServiceImpl service;

	@GetMapping("/pais/listar")
	public List<Pais> listar() {
		List<Pais> aPais = service.findAll();
		if (aPais == null || aPais.isEmpty()) {
			return Collections.emptyList();
		}
		return aPais;
	}
}
