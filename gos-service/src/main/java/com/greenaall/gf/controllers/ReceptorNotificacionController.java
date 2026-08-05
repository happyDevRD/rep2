package com.greenaall.gf.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.gf.entity.GfReceptorNotificacion;
import com.greenaall.models.gf.service.ReceptorNotificacionServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class ReceptorNotificacionController {

	@Autowired
    private ReceptorNotificacionServiceImpl service;
	
	@GetMapping("/receptorNotificacion/listar")
	public List<GfReceptorNotificacion> listar() {
		List<GfReceptorNotificacion> aReceptorNotificacion = service.findAll();
		if (aReceptorNotificacion == null || aReceptorNotificacion.isEmpty()) {
			return Collections.emptyList();
		}
		return aReceptorNotificacion;
	}
}
