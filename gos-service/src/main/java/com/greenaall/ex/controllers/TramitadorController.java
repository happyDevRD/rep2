package com.greenaall.ex.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dto.TramitadorDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Mensaje;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramitador;
import com.greenaall.models.ex.entity.enums.EnumEstadoMensaje;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramitadorServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class TramitadorController {
	
	@Autowired
    private TramitadorServiceImpl service;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
    private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;
		
	@PostMapping("/tramitador/crear/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tramitador crear(@RequestBody Tramitador tramitador, @PathVariable Long idTarea) {
		tramitador.setFecContr(new java.util.Date());
		tramitador.setPosesion(Short.valueOf((short) 0));
		Tramitador oTramitadorNew = service.save(tramitador);
		TareaTramiteExpediente oTarTraExped = serviceTareaTramiteExpediente.findById(idTarea);
		oTarTraExped.setUsuario(tramitador.getUsuario());
		oTarTraExped.setTramitador(oTramitadorNew.getId());
		oTarTraExped.setUsuContr(tramitador.getUsuContr());
		oTarTraExped.setFecContr(new java.util.Date());
		serviceTareaTramiteExpediente.save(oTarTraExped);	
		return oTramitadorNew;
	}
	
	@PostMapping("/tramitador/tomarPosesion/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tramitador tomarPosesion(@RequestBody Tramitador tramitador, @PathVariable Long idTarea) {
		tramitador.setFecContr(new java.util.Date());
		tramitador.setPosesion(Short.valueOf((short) 0));
		Tramitador oTramitadorNew = service.save(tramitador);
		TareaTramiteExpediente oTarTraExped = serviceTareaTramiteExpediente.findById(idTarea);
		oTarTraExped.setUsuario(tramitador.getUsuario());
		oTarTraExped.setTramitador(oTramitadorNew.getId());
		oTarTraExped.setUsuContr(tramitador.getUsuContr());
		oTarTraExped.setFecContr(new java.util.Date());
		serviceTareaTramiteExpediente.save(oTarTraExped);
		Mensaje oMensaje = new Mensaje();
		oMensaje.setEstado(EnumEstadoMensaje.TRAMITANDO);
		oMensaje.setFecEnvio(new Date());
		oMensaje.setDescripcion(null);
		
		return oTramitadorNew;
	}
	
	@PostMapping("/tramitador/asignar/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tramitador asignar(@RequestBody Tramitador tramitador, @PathVariable Long idTarea) {
		tramitador.setFecContr(new java.util.Date());
		tramitador.setPosesion(Short.valueOf((short) 0));
		Tramitador oTramitadorNew = service.save(tramitador);
		TareaTramiteExpediente oTarTraExped = serviceTareaTramiteExpediente.findById(idTarea);
		oTarTraExped.setUsuario(tramitador.getUsuario());
		oTarTraExped.setTramitador(oTramitadorNew.getId());
		oTarTraExped.setUsuContr(tramitador.getUsuContr());
		oTarTraExped.setFecContr(new java.util.Date());
		serviceTareaTramiteExpediente.save(oTarTraExped);
		Mensaje oMensaje = new Mensaje();
		oMensaje.setEstado(EnumEstadoMensaje.PENDIENTE);
		oMensaje.setFecEnvio(new Date());
		oMensaje.setDescripcion(null);
		
		
		return oTramitadorNew;
	}
	
	@GetMapping("/tramitador/ver/{id}")
	public TramitadorDto detalle(@PathVariable Long id) {
		Tramitador oTramitador = service.findById(id);
		TramitadorDto oTramitadorDto = new TramitadorDto();
		if(oTramitador != null) {
			Expediente expediente = serviceExpediente.findById(oTramitador.getExpediente());
			if(expediente != null) {
				oTramitadorDto.setEjeExped(expediente.getEjercicio());
				oTramitadorDto.setNumExped(expediente.getNumero());
			}
			oTramitadorDto.setPosesion(oTramitador.getPosesion());
			oTramitadorDto.setEstadoTramitacion(oTramitador.getEstadoTramitacion());
			oTramitadorDto.setExpediente(oTramitador.getExpediente());
			oTramitadorDto.setFecAsignacion(oTramitador.getFecAsignacion());
			oTramitadorDto.setId(oTramitador.getId());
			oTramitadorDto.setUsuario(oTramitador.getUsuario());
		}
		return oTramitadorDto;
	}
	
	@GetMapping("/tramitador/listar/{idExped}")
	public List<Tramitador> listarPorExpediente(@PathVariable Long idExped) {
		List<Tramitador> aTramitador = service.findByExpediente(idExped);
		if(aTramitador.isEmpty() || aTramitador == null) {
			 throw new NoDataFoundException();
		}
		return aTramitador;
	}
	
	@DeleteMapping("/tramitador/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		Tramitador oTramitador = service.findById(id);
		if (oTramitador == null) {
	    	  throw new NoDataFoundException();	  
		}
		service.deleteById(id);  	
    }

}
