package com.greenaall.co.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.co.entity.CoContador;
import com.greenaall.models.co.entity.CoContadorPK;
import com.greenaall.models.co.entity.Contabilidad;
import com.greenaall.models.co.entity.JusGasto;
import com.greenaall.models.co.entity.Tercero;
import com.greenaall.models.co.service.CoContadorServiceImpl;
import com.greenaall.models.co.service.ContabilidadServiceImpl;
import com.greenaall.models.co.service.JusGastoServiceImpl;
import com.greenaall.models.co.service.TerceroServiceImpl;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.service.InteresadoServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class JusGastoController {
	
	@Autowired
    private JusGastoServiceImpl serviceJusGasto;
	
	@Autowired
    private CoContadorServiceImpl serviceCoContador;
	
	@Autowired
    private ContabilidadServiceImpl serviceContabilidad;
	
	@Autowired
	private InteresadoServiceImpl serviceInteresado;
	
	@Autowired
	private TerceroServiceImpl serviceTercero;

	@PostMapping("/jusGasto/crear/{idExped}")
	@ResponseStatus(HttpStatus.CREATED)
	public JusGasto crear(@RequestBody JusGasto oJusGasto, @PathVariable Long idExped) throws Exception {
		
		Interesado oInteresado = serviceInteresado.findByExpedienteAndPrincipal(idExped);
		
		oJusGasto.setEstado(Short.valueOf((short) 0));
		
		Contabilidad oContabildiad = serviceContabilidad.findById(oJusGasto.getIdConta());
		oJusGasto.setEjeJusGasto(oContabildiad.getEjeConta());
		
		CoContadorPK oContadorPK = new CoContadorPK();
		oContadorPK.setIdConta(oContabildiad.getIdConta());
		oContadorPK.setNumConta(Short.valueOf((short) 10));
		oContadorPK.setEjeConta(oContabildiad.getEjeConta());	
		
		CoContador oCocontador = serviceCoContador.findById(oContadorPK);
		
		if(oCocontador != null) {
			Long valor = oCocontador.getValConta() +1;
			oCocontador.setValConta(valor);
			oJusGasto.setNumJusGasto(valor.intValue());
			serviceCoContador.save(oCocontador);
		}else {
			CoContador oCocontadorNuevo = new CoContador();
			oCocontadorNuevo.setIdConta(oContabildiad.getIdConta());
			oCocontadorNuevo.setNumConta(Short.valueOf((short) 10));
			oCocontadorNuevo.setEjeConta(oContabildiad.getEjeConta());
			oCocontadorNuevo.setDesConta("OPERACIÓN (REGISTRO FACTURAS)");
			oCocontadorNuevo.setNumConta(Short.valueOf((short) 8));
			oCocontadorNuevo.setValConta(Long.valueOf("66000001"));
			oCocontadorNuevo.setUsuContr("gos");
			oCocontadorNuevo.setFecContr(new Date());
			serviceCoContador.save(oCocontadorNuevo);
			oJusGasto.setNumJusGasto(oCocontadorNuevo.getValConta().intValue());
		}
		
		Tercero oTercero = serviceTercero.findByIdHisPersoAndIdPerso(oInteresado.getIdHisPerso(), oInteresado.getIdPerso());
		
		if(oTercero != null) {
			oJusGasto.setIdTerce(oTercero.getIdTerce());
		}else {
			Tercero oTerceroNuevo = new Tercero();
			oTerceroNuevo.setIdHisPerso(oInteresado.getIdHisPerso());
			oTerceroNuevo.setIdPerso(oInteresado.getIdPerso());
			oTerceroNuevo.setCodEntid(Short.valueOf((short) 1));
			oTerceroNuevo.setCodTipTerce(Short.valueOf((short) 1));
			oTerceroNuevo.setCodSecInsti(Short.valueOf((short) 0));
			Tercero oTerceroGrabar = serviceTercero.save(oTerceroNuevo);
			oJusGasto.setIdTerce(oTerceroGrabar.getIdTerce());
		}
		oJusGasto.setInd413(Short.valueOf((short) 0));
		oJusGasto.setIndFace(Short.valueOf((short) 0));
		oJusGasto.setFecContr(new Date());
		serviceJusGasto.save(oJusGasto);
		return oJusGasto;
	}
}
