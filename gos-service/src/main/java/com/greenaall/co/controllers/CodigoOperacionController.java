package com.greenaall.co.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.co.entity.CodigoOperacion;
import com.greenaall.models.co.entity.Contabilidad;
import com.greenaall.models.co.service.CodigoOperacionServiceImpl;
import com.greenaall.models.co.service.ContabilidadServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class CodigoOperacionController {
	
	@Autowired
    private CodigoOperacionServiceImpl serviceCodigoOperacion;
	
	@Autowired
    private ContabilidadServiceImpl serviceContabilidad;
	
	@GetMapping("/codigoOperacion/obtenerIdCodOpera/{idConta}/{indArea}/{indAgrup}/{signo}/{claOpera}")
	public Long obtenerIdCodOpera(@PathVariable Long idConta, @PathVariable Short indArea, @PathVariable Short indAgrup, @PathVariable Short signo, @PathVariable Short claOpera) {
		
		Contabilidad oContabilidad = serviceContabilidad.findById(idConta);
		CodigoOperacion oCodigoOperacion = serviceCodigoOperacion.findByIdCodOpera(oContabilidad.getIdGruCodOpera(), indArea, indAgrup, signo, claOpera);
		
		if(oCodigoOperacion == null) {
			throw new NoDataFoundException();
		}
		
		return oCodigoOperacion.getIdCodOpera();
	}

}
