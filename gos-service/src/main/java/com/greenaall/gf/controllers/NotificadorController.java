package com.greenaall.gf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.gf.entity.GfNotificador;
import com.greenaall.models.gf.service.NotificadorServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class NotificadorController {
	
	@Autowired
    private NotificadorServiceImpl service;
	
	@GetMapping("/notificador/listar")
	public List<GfNotificador> listar() {
		List<GfNotificador> aNotificador = service.findAll();
		 
		if(aNotificador == null || aNotificador.isEmpty()) {
			 throw new NoDataFoundException();
		}
		return aNotificador;
	}

}
