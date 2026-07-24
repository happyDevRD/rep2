package com.greenaall.ex.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.ErrorBorradoException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NoInstructorFoundException;
import com.greenaall.models.ex.dto.TramiteDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class TramiteController {
	
	@Autowired
	private TramiteServiceImpl serviceTramite;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;
	
	
	@PostMapping("/tramite/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Tramite crear(@RequestBody Tramite tramite) {
		tramite.setFecContr(new java.util.Date());
		List<Tramite> aTramites = serviceTramite.findByExpediente(tramite.getExpediente());
		if(aTramites != null && !aTramites.isEmpty()) {
			int numero = aTramites.size();
			numero += 1;
			tramite.setNumero(Short.valueOf((short)numero));
		} else {
			tramite.setNumero(Short.valueOf((short)1));
		}
		return serviceTramite.save(tramite);
	}
	
	@PutMapping("/tramite/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tramite editar(@RequestBody Tramite tramite, @PathVariable Long id) {
		
		Tramite oTramite = serviceTramite.findById(id);
		if(oTramite == null ) {
			 throw new NoDataFoundException();
		}
		if(tramite.getDescripcion() != null) {
			oTramite.setDescripcion(tramite.getDescripcion());
		}
		if(tramite.getExpediente() != null) {
			oTramite.setExpediente(tramite.getExpediente());
		}
		if(tramite.getFase() != null) {
			oTramite.setFase(tramite.getFase());
		}
		if(tramite.getFecTramite() != null) {
			oTramite.setFecTramite(tramite.getFecTramite());
		}
		if(tramite.getNumero() != null) {
			oTramite.setNumero(tramite.getNumero());
		}
		if(tramite.getUsuContr() != null) {
			oTramite.setUsuContr(tramite.getUsuContr());
		}
		
		oTramite.setFecContr(new java.util.Date());
		serviceTramite.save(oTramite);	
		return oTramite;		
	}
	
	@GetMapping("/tramite/ver/{id}")
	public TramiteDto detalle(@PathVariable Long id) {
		Tramite tramite = serviceTramite.findById(id);
		TramiteDto oTramiteDto = new TramiteDto();
		Expediente expediente = serviceExpediente.findById(tramite.getExpediente());
		
		if(expediente != null) {
			oTramiteDto.setEjeExped(expediente.getEjercicio());
			oTramiteDto.setNumExped(expediente.getNumero());
		}
		
		if(tramite.getDescripcion() != null) {
			oTramiteDto.setDescripcion(tramite.getDescripcion());
		}
		
		if(tramite.getExpediente() != null) {
			oTramiteDto.setExpediente(tramite.getExpediente());
		}
		
		if(tramite.getFase() != null) {
			oTramiteDto.setFase(tramite.getFase());
		}
		
		if(tramite.getFecTramite() != null) {
			oTramiteDto.setFecTramite(tramite.getFecTramite());
		}
		
		if(tramite.getId() != null) {
			oTramiteDto.setId(tramite.getId());
		}
		
		if(tramite.getNumero() != null) {
			oTramiteDto.setNumero(tramite.getNumero());
		}
		
		return oTramiteDto;
	}
	
	@GetMapping("/tramite/listar/{idExped}")
	public List<Tramite> listarPorExpediente(@PathVariable Long idExped) {
		Expediente oExpediente = serviceExpediente.findById(idExped);
		if(oExpediente != null && oExpediente.getInstructor() == null) {
			throw new NoInstructorFoundException();
		}
	
		List<Tramite> aTramites = serviceTramite.findByExpediente(idExped);
		if(aTramites == null || aTramites.isEmpty() ) {
			 throw new NoDataFoundException();
		}
		return aTramites;
	}
	
	@DeleteMapping("/tramite/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		Tramite oTramites = serviceTramite.findById(id);
		if (oTramites == null) {
	    	  throw new NoDataFoundException();	  
		}
		List<TareaTramiteExpediente> aTareaTramiteExped = serviceTareaTramiteExpediente.findByTramite(id);
		if (aTareaTramiteExped == null) {
			serviceTramite.deleteById(id);  
		}else {
			throw new ErrorBorradoException();
		}	
    }
}
