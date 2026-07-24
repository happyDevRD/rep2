package com.greenaall.ex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.ex.entity.MateriaProcedimiento;
import com.greenaall.models.ex.service.MateriaProcedimientoServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class MateriaProcedimientoController {
	
	@Autowired
    private MateriaProcedimientoServiceImpl serviceMateria;
	
	@GetMapping("/materiaProcedimiento/listar")
	public List<MateriaProcedimiento> listar() {
		
		List<MateriaProcedimiento> aMateria = serviceMateria.findAll();
		
		return aMateria;
		
	}
	
	@GetMapping("/materiaProcedimiento/ver/{id}")
	public MateriaProcedimiento detalle(@PathVariable Long id) {
		MateriaProcedimiento procedimiento = serviceMateria.findById(id);
		return procedimiento;
	}


}
