package com.greenaall.ex.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.UsuarioExsitenteException;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.IOrganizacionUsuarioService;
import com.greenaall.models.ex.dto.PermisoDto;
import com.greenaall.models.ex.entity.Permiso;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.service.PermisoServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class PermisoController {
	@Autowired
    private PermisoServiceImpl service;
	
	@Autowired
    private ProcedimientoServiceImpl serviceProcedimiento;
	
	@Autowired
    private TareaProcedimientoServiceImpl TareaProcedimientoservice;
	
	@Autowired
	private IOrganizacionUsuarioService organizacionUsuarioService;
	
	@PostMapping("/permiso/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Permiso crear(@RequestBody Permiso permiso) {
		List<Permiso> oPermiso = service.findByTareaAndUsuario(permiso.getIdTarProce(), permiso.getUsuario());
		if(oPermiso != null) {
			throw new UsuarioExsitenteException();
		}
		permiso.setFecContr(new Date());
		return service.save(permiso);
	}
	
	@GetMapping("/permiso/ver/{id}")
	public Permiso detalle(@PathVariable Long id) {
		Permiso permiso = service.findById(id);
		return permiso;
	}
	
	@GetMapping("/permiso/listar/{idTarProce}")
	public List<PermisoDto> listar(@PathVariable Long idTarProce) {
		
		List<Permiso> aPermiso = service.findByIdTarProce(idTarProce);
		List<PermisoDto> aPermisoDto = new ArrayList<PermisoDto>();
		if(aPermiso != null) {
			for(int i = 0; i < aPermiso.size(); i++) {
				PermisoDto oPermisoDto = new PermisoDto();
				if(aPermiso.get(i).getId() != null) {
					oPermisoDto.setId(aPermiso.get(i).getId());
				}
				if(aPermiso.get(i).getProcedimiento() != null) {
					Procedimiento oPrecedimiento = serviceProcedimiento.findById(aPermiso.get(i).getProcedimiento());
					if(oPrecedimiento != null) {
						oPermisoDto.setDesProce(oPrecedimiento.getDescripcion());
					}
				}
				if(aPermiso.get(i).getIdTarProce() != null) {
					TareaProcedimiento oTareaPrecedimiento = TareaProcedimientoservice.findById(aPermiso.get(i).getIdTarProce());
					if(oTareaPrecedimiento != null) {
						oPermisoDto.setDesTareaProce(oTareaPrecedimiento.getDescripcion());
					}
				}
				if(aPermiso.get(i).getUsuario() != null) {
					oPermisoDto.setUsuario(aPermiso.get(i).getUsuario());
					List<OrganizacionUsuario> aOrganizacionUsuario = organizacionUsuarioService.findByUsuario2(aPermiso.get(i).getUsuario());
					if(aOrganizacionUsuario != null && !aOrganizacionUsuario.isEmpty()) {
	    				Optional<OrganizacionUsuario> oOrgUsuPrimero = aOrganizacionUsuario.stream().findFirst();
	    				if(oOrgUsuPrimero.isPresent()){
	    					oPermisoDto.setIdOrgUsuar(oOrgUsuPrimero.get().getIdOrgUsuar());
	    				}
					}
				}
				
				aPermisoDto.add(oPermisoDto);
			}
			return aPermisoDto;
		}else {
			throw new NoDataFoundException();
		}
	}
	
	@PutMapping("/permiso/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Permiso editar(@RequestBody Permiso permiso, @PathVariable Long id) {
		Permiso permisoDB = service.findById(id);
		permisoDB.setFecContr(new Date());
		permisoDB.setProcedimiento(permiso.getProcedimiento());
		permisoDB.setUsuario(permiso.getUsuario());
		permisoDB.setUsuContr(permiso.getUsuContr());
		return service.save(permisoDB);	
	}
	
	@DeleteMapping("/permiso/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		Permiso permisoDB = service.findById(id);
		if (permisoDB == null) {
    	  throw new NoDataFoundException();
    	  
		}
		service.deleteById(permisoDB.getId());
    }
}
