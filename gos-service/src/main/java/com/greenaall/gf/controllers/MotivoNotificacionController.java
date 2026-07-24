package com.greenaall.gf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.gf.entity.GfMotivoNotificacion;
import com.greenaall.models.gf.service.MotivoNotificacionServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class MotivoNotificacionController {
	
	@Autowired
    private MotivoNotificacionServiceImpl service;
	
	@GetMapping("/motivoNotificacion/listar")
	public List<GfMotivoNotificacion> listar() {
		List<GfMotivoNotificacion> aMotivoNotificacion = service.findAll();
		 
		if(aMotivoNotificacion == null ||aMotivoNotificacion.isEmpty()) {
			 throw new NoDataFoundException();
		}
		return aMotivoNotificacion;
	}

}
