package com.greenaall.ge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.models.ge.service.IProcesoFirmadoService;

/**
*
* @author jmmoyano
*/

@RestController
public class ProcesoFirmadoController {

	@Autowired
	private IProcesoFirmadoService procesoFirmadoService;
	
	
	@GetMapping("procesoFirmado/listar")
	public List<ProcesoFirmado> listar(){
		return procesoFirmadoService.findAll();
	}
	
	@GetMapping("procesoFirmado/listar/{plantilla}")
	public List<ProcesoFirmado> listarByPlantilla(@PathVariable String plantilla){
		return procesoFirmadoService.findByPlantilla(plantilla);
	}
	
	@GetMapping("procesoFirmado/ver/{id}")
	public ProcesoFirmado detalle(@PathVariable Integer id){
		return procesoFirmadoService.findById(id);
	}
}
