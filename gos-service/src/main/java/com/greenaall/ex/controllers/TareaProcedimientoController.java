package com.greenaall.ex.controllers;

import java.util.Date;
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

import com.greenaall.exception.ErrorBorradoProcedimientoException;
import com.greenaall.models.ex.entity.Permiso;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.service.PermisoServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.models.ge.service.ProcesoFirmadoServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class TareaProcedimientoController {
	
	@Autowired
    private TareaProcedimientoServiceImpl service;
	
	@Autowired
    private PermisoServiceImpl servicePermiso;
	
	@Autowired
    private TareaTramiteExpedienteServiceImpl servicioTramiteExpediente;
	
	@Autowired
	private ProcesoFirmadoServiceImpl serviceProcesoFirmado;
	
	@PostMapping("/tareaProcedimiento/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public TareaProcedimiento crear(@RequestBody TareaProcedimiento tareaProcedimiento) {
		if(tareaProcedimiento.getPlantillaDefectoModulo() == null) {
			tareaProcedimiento.setPlantillaDefectoModulo(Short.valueOf((short) 22));
		}
		if(tareaProcedimiento.getProcesoFirmadoDefecto() == null && tareaProcedimiento.getPlantillaDefecto() != null) {		
			List<ProcesoFirmado> oProcesoFirmado = serviceProcesoFirmado.findByPlantilla(tareaProcedimiento.getPlantillaDefecto()); 
			if(oProcesoFirmado != null && !oProcesoFirmado.isEmpty() && oProcesoFirmado.size() > 0) {
				tareaProcedimiento.setProcesoFirmadoDefecto(oProcesoFirmado.get(0).getIdProFirma());
			}	
		}
		tareaProcedimiento.setFecContr(new Date());
		tareaProcedimiento.setTareaAutomatica(false);
		
		return service.save(tareaProcedimiento);
	}
	
	@GetMapping("/tareaProcedimiento/ver/{id}")
	public TareaProcedimiento detalle(@PathVariable Long id) {
		TareaProcedimiento tareaProcedimiento = service.findById(id);
		return tareaProcedimiento;
	}
	
	@GetMapping("/tareaProcedimiento/listar")
	public List<TareaProcedimiento> listar() {
		List<TareaProcedimiento> aTareaProcedimiento = (List<TareaProcedimiento>) service.findAll();
		if(aTareaProcedimiento == null || aTareaProcedimiento.isEmpty()) {
			return null;
		}
		return aTareaProcedimiento;
	}
	
	@GetMapping("tareaProcedimiento/listar/{procedimiento}")
	public List<TareaProcedimiento> listarByProcedimiento(@PathVariable Long procedimiento){
		return service.findByProcedimiento(procedimiento);
	}
	
	@GetMapping("tareaProcedimiento/listar/{procedimiento}/{faseTarea}")
	public List<TareaProcedimiento> listarByProcedimiento(@PathVariable Long procedimiento, @PathVariable String faseTarea){
		return service.findByProcedimientoAndFaseTarea(procedimiento, faseTarea);
	}
	
	@PutMapping("/tareaProcedimiento/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TareaProcedimiento editar(@RequestBody TareaProcedimiento tareaProcedimiento, @PathVariable Long id) {
		TareaProcedimiento tareaProcedimientoDB = service.findById(id);
		if(tareaProcedimiento.getDescripcion() != null) {
			tareaProcedimientoDB.setDescripcion(tareaProcedimiento.getDescripcion());
		}
		if(tareaProcedimiento.getFaseTarea() != null) {
			tareaProcedimientoDB.setFaseTarea(tareaProcedimiento.getFaseTarea());
		}
		
		tareaProcedimientoDB.setFecContr(new Date());
		
		if(tareaProcedimiento.getPlantillaDefecto() != null && !tareaProcedimiento.getPlantillaDefecto().equals("0")) {
			tareaProcedimientoDB.setPlantillaDefecto(tareaProcedimiento.getPlantillaDefecto());
		}
		
		if(tareaProcedimiento.getPlantillaDefecto() != null && tareaProcedimiento.getPlantillaDefecto().equals("0")) {
			tareaProcedimientoDB.setPlantillaDefecto(null);
		}
		
		if(tareaProcedimiento.getPlazo() != null) {
			tareaProcedimientoDB.setPlazo(tareaProcedimiento.getPlazo());
		}
		
		if(tareaProcedimiento.getProcedimiento() != null) {
			tareaProcedimientoDB.setProcedimiento(tareaProcedimiento.getProcedimiento());
		}
		
		if(tareaProcedimiento.getAccion() != null) {
			tareaProcedimientoDB.setAccion(tareaProcedimiento.getAccion());
		}
		
		if(tareaProcedimiento.getProcesoFirmadoDefecto() != null && 
				!tareaProcedimiento.getProcesoFirmadoDefecto().equals(Integer.valueOf((int) 0))) {
			tareaProcedimientoDB.setProcesoFirmadoDefecto(tareaProcedimiento.getProcesoFirmadoDefecto());
		}else {
			if(tareaProcedimiento.getProcesoFirmadoDefecto() != null && tareaProcedimiento.getProcesoFirmadoDefecto().equals(Integer.valueOf((int) 0)) && tareaProcedimiento.getPlantillaDefecto() != null 
					&& !tareaProcedimiento.getPlantillaDefecto().equals("0")) {		
				List<ProcesoFirmado> oProcesoFirmado = serviceProcesoFirmado.findByPlantilla(tareaProcedimiento.getPlantillaDefecto()); 
				if(oProcesoFirmado != null && !oProcesoFirmado.isEmpty() && oProcesoFirmado.size() > 0) {
					tareaProcedimientoDB.setProcesoFirmadoDefecto(oProcesoFirmado.get(0).getIdProFirma());
				}	
			}else {
				if(tareaProcedimiento.getProcesoFirmadoDefecto() != null && tareaProcedimiento.getProcesoFirmadoDefecto().equals(Integer.valueOf((int) 0))){
					tareaProcedimientoDB.setProcesoFirmadoDefecto(null);
				}
			}
		}
		
		tareaProcedimientoDB.setTareaAutomatica(false);
		
		if(tareaProcedimiento.getTipoPlazo() != null) {
			tareaProcedimientoDB.setTipoPlazo(tareaProcedimiento.getTipoPlazo());
		}
		
		if(tareaProcedimiento.getUsuContr() != null) {
			tareaProcedimientoDB.setUsuContr(tareaProcedimiento.getUsuContr());
		}
		
		
		return service.save(tareaProcedimientoDB);	
	}
	
	@DeleteMapping("/tareaProcedimiento/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		
		TareaProcedimiento tareaProcedimientoDB = service.findById(id);
		List<TareaTramiteExpediente> aTareaTramiteExpediente = servicioTramiteExpediente.findByTareaProcedimiento(id);
		if(aTareaTramiteExpediente != null) {
			throw new ErrorBorradoProcedimientoException();
		}
		
		List<Permiso> oPermiso = servicePermiso.findByIdTarProce(tareaProcedimientoDB.getId());
		if(oPermiso != null) {
			for(int i=0; i < oPermiso.size(); i++) {
				servicePermiso.deleteById(oPermiso.get(i).getId());
			}
			
		}
		service.deleteById(tareaProcedimientoDB.getId());
    }
}
