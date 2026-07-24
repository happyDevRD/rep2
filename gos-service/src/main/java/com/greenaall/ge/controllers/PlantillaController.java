package com.greenaall.ge.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.ge.entity.Plantilla;
import com.greenaall.models.ge.entity.PlantillaPK;
import com.greenaall.models.ge.service.IPlantillaService;

/**
*
* @author jmmoyano
*/

@RestController
public class PlantillaController {
	
	@Autowired
	private IPlantillaService plantillaService;
	
	
	@GetMapping("plantilla/listar")
	public List<Plantilla> listar(){
		return plantillaService.findAll();
	}
	
	@GetMapping("plantilla/listar/{modulo}")
	public List<Plantilla> listarByModulo(@PathVariable String modulo){
		return plantillaService.findByModulo(Short.valueOf(modulo));
	}
	
	@GetMapping("plantilla/ver/{plantilla}")
	public Plantilla detalle(@PathVariable String plantilla){
		PlantillaPK oPlantillaPk = new PlantillaPK(Short.valueOf((short) 22), plantilla);
		return plantillaService.findById(oPlantillaPk);
	}
}
