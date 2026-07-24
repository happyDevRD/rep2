package com.greenaall.co.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.co.entity.CoContador;
import com.greenaall.models.co.entity.CoContadorPK;
import com.greenaall.models.co.entity.CodigoOperacion;
import com.greenaall.models.co.entity.Contabilidad;
import com.greenaall.models.co.entity.Operacion;
import com.greenaall.models.co.entity.Tercero;
import com.greenaall.models.co.service.CoContadorServiceImpl;
import com.greenaall.models.co.service.CodigoOperacionServiceImpl;
import com.greenaall.models.co.service.ContabilidadServiceImpl;
import com.greenaall.models.co.service.OperacionServiceImpl;
import com.greenaall.models.co.service.TerceroServiceImpl;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.service.InteresadoServiceImpl;

/**
 *
 * @author jmmoyano
 */

@RestController
public class OperacionController {

	@Autowired
	private OperacionServiceImpl serviceOperacion;

	@Autowired
	private InteresadoServiceImpl serviceInteresado;

	@Autowired
	private TerceroServiceImpl serviceTercero;

	@Autowired
	private ContabilidadServiceImpl serviceContabilidad;

	@Autowired
	private CodigoOperacionServiceImpl serviceCodigoOperacion;
	
	@Autowired
    private CoContadorServiceImpl serviceCoContador;

	@PostMapping("/operacion/crear/{idExped}")
	@ResponseStatus(HttpStatus.CREATED)
	public Operacion crear(@RequestBody Operacion oOperacion, @PathVariable Long idExped) throws Exception {

		Interesado oInteresado = serviceInteresado.findByExpedienteAndPrincipal(idExped);

		Tercero oTercero = serviceTercero.findByIdHisPersoAndIdPerso(oInteresado.getIdHisPerso(),
				oInteresado.getIdPerso());

		if (oTercero != null) {
			oOperacion.setIdTerce(oTercero.getIdTerce());
		} else {
			Tercero oTerceroNuevo = new Tercero();
			oTerceroNuevo.setIdHisPerso(oInteresado.getIdHisPerso());
			oTerceroNuevo.setIdPerso(oInteresado.getIdPerso());
			oTerceroNuevo.setCodEntid(Short.valueOf((short) 1));
			oTerceroNuevo.setCodTipTerce(Short.valueOf((short) 1));
			oTerceroNuevo.setCodSecInsti(Short.valueOf((short) 0));
			Tercero oTerceroGrabar = serviceTercero.save(oTerceroNuevo);
			oOperacion.setIdTerce(oTerceroGrabar.getIdTerce());
		}

		oOperacion.setCodEntid(Short.valueOf((short) 1));

		Contabilidad oContabilidad = serviceContabilidad.findById(oOperacion.getIdConta());
		oOperacion.setEjeOpera(oContabilidad.getEjeConta());

		CodigoOperacion oCodigoOperacion = serviceCodigoOperacion.findById(oOperacion.getIdCodOpera());
		Integer numOpera = dameNumOpera(oCodigoOperacion, oContabilidad, oOperacion);
		oOperacion.setNumOpera(numOpera);
		oOperacion.setNatDerObl(Short.valueOf((short) 0));
		oOperacion.setOficina(Short.valueOf((short) 1));
		oOperacion.setTipExacc(Short.valueOf((short) 0));
		oOperacion.setRecFinan(Short.valueOf((short) 0));
		oOperacion.setNumDocum(Short.valueOf((short) 1));
		oOperacion.setIndCtrInter(Short.valueOf((short) 0));
		oOperacion.setEstado(Short.valueOf((short) 0));
		oOperacion.setFiaMetal(Short.valueOf((short) 0));
		oOperacion.setFecContr(new Date());
		
		Operacion oOperacionNueva = serviceOperacion.save(oOperacion);
				
		return oOperacionNueva;
	}

	public Integer dameNumOpera(CodigoOperacion oCodOpe, Contabilidad oConta, Operacion dto) {
		
		Integer iNumOpera = null;
        Short shContador = Short.valueOf("0");
        Long lValInici = null;
        boolean bFactResulta = false;

        switch (oCodOpe.getIndArea().shortValue()) {
          case 1: // Área: Ingresos
            switch (oCodOpe.getIndAgrup().shortValue()) {
              case 0: // Agrupación: Corriente
                shContador = Short.valueOf("1");
                lValInici = Long.valueOf("11000001");
                break;
              case 1: // Agrupación: Cerrados
                if (oCodOpe.getIndTipSubsi().shortValue() == 4) {
                  shContador = Short.valueOf("1");
                  lValInici = Long.valueOf("11000001");
                  break;
                } else {
                  shContador = Short.valueOf("2");
                  lValInici = Long.valueOf("15000001");
                  break;
                }
              case 10: // Agrupación: Posteriores
                shContador = Short.valueOf("3");
                lValInici = Long.valueOf("18000001");
                break;
            }

            break;
          case 2: // Área: Gastos
            switch (oCodOpe.getIndAgrup().shortValue()) {
              case 0: // Agrupación: Corriente
                shContador = Short.valueOf("4");
                lValInici = Long.valueOf("22000001");
                break;
              case 1: // Agrupación: Cerrados
                if (oCodOpe.getIndTipSubsi().shortValue() == 4) {
                  shContador = Short.valueOf("4");
                  lValInici = Long.valueOf("22000001");
                  break;
                } else {
                  shContador = Short.valueOf("5");
                  lValInici = Long.valueOf("26000001");
                  break;
                }
              case 10: // Agrupación: Posteriores
                shContador = Short.valueOf("6");
                lValInici = Long.valueOf("28000001");
                break;
            }

            break;
          case 3: // Área: No Presupuestaria
            shContador = Short.valueOf("7");
            lValInici = Long.valueOf("33000001");
            break;
          case 4: // Área: No Presupuestaria
            shContador = Short.valueOf("8");
            lValInici = Long.valueOf("44000001");
            break;
          case 5: // Área: No Presupuestaria
            shContador = Short.valueOf("9");
            lValInici = Long.valueOf("55000001");
            break;
          case 6: // Área: Justificante Gastos
            shContador = Short.valueOf("10");
            lValInici = Long.valueOf("66000001");
            // Vemos si el eje_opera de la factura es anterior al eje_conta. Si es así 
            // hay que buscar la contabilidad de ese ejercicio. Si existe dicha contabilidad
            // se actualizará el contador de esa contabilidad, si no existiera la contabilidad
            // habría que hacer una búsqueda de justificantes en la contabilidad actual de ese ejercicio
            // y asignarle el máximo que hubiera más uno.            
            if (oConta.getEjeConta().intValue() > dto.getEjeOpera().intValue()) {
          	  bFactResulta = true;
            }
            break;
        }

        if (bFactResulta) {
        	// hay que buscar la contabilidad de ese ejercicio. Si existe dicha contabilidad
            // se actualizará el contador de esa contabilidad, si no existiera la contabilidad
            // habría que hacer una búsqueda de justificantes en la contabilidad actual de ese ejercicio
            // y asignarle el máximo que hubiera más uno. 
        	Contabilidad oContaEjeOpe = serviceContabilidad.findByEjeConta(dto.getEjeOpera());
        	
        	// La condición "oContaEjeOpe.getEjeConta().intValue() > 2006" es porque la contablidad preinstalada
        	// tiene ejercicio 2006 y esa no tiene contadores. (esijad es bastante posterior)
        	if (oContaEjeOpe != null && oContaEjeOpe.getEjeConta().intValue() > 2006) {
        		CoContadorPK oContadorPK = new CoContadorPK();
        		oContadorPK.setIdConta(oContaEjeOpe.getIdConta());
        		oContadorPK.setNumConta(shContador);
        		oContadorPK.setEjeConta(dto.getEjeOpera());	
        		
        		CoContador oCocontador = serviceCoContador.findById(oContadorPK);
        		
        		if(oCocontador != null) {
        			Long valor = oCocontador.getValConta() +1;
        			oCocontador.setValConta(valor);
        			iNumOpera = valor.intValue();
        			serviceCoContador.save(oCocontador);
        		}else {
        			CoContador oCocontadorNuevo = new CoContador();
        			oCocontadorNuevo.setIdConta(oContaEjeOpe.getIdConta());
        			oCocontadorNuevo.setEjeConta(oContaEjeOpe.getEjeConta());
        			oCocontadorNuevo.setDesConta("OPERACIÓN");
        			oCocontadorNuevo.setNumConta(shContador);
        			oCocontadorNuevo.setValConta(lValInici);
        			oCocontadorNuevo.setUsuContr("gos");
        			oCocontadorNuevo.setFecContr(new Date());
        			serviceCoContador.save(oCocontadorNuevo);
        			iNumOpera = lValInici.intValue();;
        		}
        		        	        
        	    return iNumOpera;
        	    
        	} else {
        		// Buscamos el número máximo de facturas de ese ejercicio.
        		List<Operacion> aOperaciones = serviceOperacion.findMaximo(oConta.getIdConta(), dto.getEjeOpera());
    
        		if (aOperaciones != null && aOperaciones.size() > 0) {
        			iNumOpera = Integer.valueOf(aOperaciones.get(aOperaciones.size() -1).getNumOpera().intValue() + 1);
        			return iNumOpera;
        		} else {
        			iNumOpera = Integer.valueOf(String.valueOf(lValInici));
        			return iNumOpera;
        		}
        	}
        } else {
        	Operacion oOperacion = dto;        	
        	while (oOperacion != null) {
        		CoContadorPK oContadorPK = new CoContadorPK();
        		oContadorPK.setIdConta(oConta.getIdConta());
        		oContadorPK.setNumConta(shContador);
        		oContadorPK.setEjeConta(dto.getEjeOpera());	
        		
        		CoContador oCocontador = serviceCoContador.findById(oContadorPK);
        		
        		if(oCocontador != null) {
        			Long valor = oCocontador.getValConta() +1;
        			oCocontador.setValConta(valor);
        			serviceCoContador.save(oCocontador);
        			iNumOpera = valor.intValue();
        		}else {
        			CoContador oCocontadorNuevo = new CoContador();
        			oCocontadorNuevo.setIdConta(oConta.getIdConta());
        			oCocontadorNuevo.setEjeConta(dto.getEjeOpera());
        			oCocontadorNuevo.setDesConta("OPERACIÓN");
        			oCocontadorNuevo.setNumConta(shContador);
        			oCocontadorNuevo.setValConta(lValInici);
        			oCocontadorNuevo.setUsuContr("gos");
        			oCocontadorNuevo.setFecContr(new Date());
        			serviceCoContador.save(oCocontadorNuevo);
        			iNumOpera = lValInici.intValue();
        		}
        		
        		oOperacion = serviceOperacion.findByNumOpera(dto.getIdConta(), dto.getEjeOpera(), iNumOpera);
   		
        	}
        	return iNumOpera;
        }
      }
}
