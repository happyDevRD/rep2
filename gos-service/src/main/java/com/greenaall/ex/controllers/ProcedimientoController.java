package com.greenaall.ex.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.greenaall.ex.util.ExpedienteValide;
import com.greenaall.exception.ErrorBorradoProcedimientoException;
import com.greenaall.exception.ErrorInsertarBD;
import com.greenaall.exception.MetadatoGrupoError;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.ProcedimientoDescripcionError;
import com.greenaall.models.ex.dto.ProcedimientoDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.MateriaProcedimiento;
import com.greenaall.models.ex.entity.Permiso;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.entity.enums.EnumTipoPlazoTarea;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.MateriaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.PermisoServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ge.entity.MetadatoGrupo;
import com.greenaall.models.ge.service.MetadatoGrupoServiceImpl;
import com.greenaall.models.gf.entity.GfTarifa;
import com.greenaall.models.gf.service.TarifaServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class ProcedimientoController {
	
	@Autowired
    private ProcedimientoServiceImpl service;
	
	@Autowired
    private TareaProcedimientoServiceImpl serviceTareaProcedimiento;
	
	@Autowired
    private PermisoServiceImpl servicePermiso;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
    private MetadatoGrupoServiceImpl serviceMetadatoGrupo;
	
	@Autowired
    private TarifaServiceImpl serviceTarifa;
	
	@Autowired
    private MateriaProcedimientoServiceImpl serviceMateria;
	
	@PostMapping("/procedimiento/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Procedimiento crear(@RequestBody Procedimiento procedimiento) throws Exception{
		MetadatoGrupo oMetadatoGrupoBus = serviceMetadatoGrupo.findByCodGrupo(procedimiento.getSiglas());
		if(oMetadatoGrupoBus != null) {
			throw new MetadatoGrupoError(oMetadatoGrupoBus.getCodGrupo());
		}
		
		List<Procedimiento> aProcedimiento = service.findByDescripcion(procedimiento.getDescripcion());
		if(!aProcedimiento.isEmpty()) {
			throw new ProcedimientoDescripcionError();
		}
		
		Procedimiento oProcNuevo;		
		
		if(procedimiento.getFecContr() == null) {
			procedimiento.setFecContr(new Date());
		}
		if(procedimiento.getIdMatProce() == null) {
			procedimiento.setIdMatProce(Long.valueOf((long) 1));
		}
		if(procedimiento.getModalidad() == null) {
			procedimiento.setModalidad(Long.valueOf((long) 4));
		}
		try {
			oProcNuevo = service.save(procedimiento);
			
			MetadatoGrupo oMetadatoGrupo = new MetadatoGrupo();
			oMetadatoGrupo.setCodGrupo(oProcNuevo.getSiglas());
			
			if(oProcNuevo.getDescripcion().length() > 50) {
				oMetadatoGrupo.setDesGrupo(oProcNuevo.getDescripcion().substring(0, 49));
			}else {
				oMetadatoGrupo.setDesGrupo(oProcNuevo.getDescripcion());
			}
			
			oMetadatoGrupo.setFecContr(new Date());
			oMetadatoGrupo.setUsuContr(oProcNuevo.getUsuContr());
			MetadatoGrupo oMetadatoGrupoNuevo = serviceMetadatoGrupo.save(oMetadatoGrupo);
			
			Date fechaHoy = new Date();
			SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
			String currentYear = getYearFormat.format(fechaHoy);
			int ano = Integer.valueOf(currentYear) - 2;
			String anoInicial = Integer.toString(ano);
			DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			Date fecIni = formateador.parse("01/01/" + anoInicial);
			Date fecFin = formateador.parse("31/12/" + currentYear);
			
			TareaProcedimiento oTarProce = new TareaProcedimiento();
			oTarProce.setDescripcion("Tarea inicial automática");
			oTarProce.setFaseTarea(EnumFaseExpediente.INICIO);
			oTarProce.setPlazo(Short.valueOf((short) 0));
			oTarProce.setTareaAutomatica(true);
			oTarProce.setTipoPlazo(EnumTipoPlazoTarea.SINPLAZO);
			oTarProce.setProcedimiento(oProcNuevo.getId());
			oTarProce.setUsuContr(oProcNuevo.getUsuContr());
			oTarProce.setFecContr(new Date());
			serviceTareaProcedimiento.save(oTarProce);
	
			GfTarifa oTarifa = new GfTarifa();
			oTarifa.setCodEntid(Short.valueOf((short) 1));
			oTarifa.setCodTarif(oProcNuevo.getSiglas());
			
			if(oProcNuevo.getDescripcion().length() > 100) {
				oTarifa.setDesTarif(oProcNuevo.getDescripcion().substring(0, 99));
			}else {
				oTarifa.setDesTarif(oProcNuevo.getDescripcion());
			}		
			
			oTarifa.setIdProce(oProcNuevo.getId());
			oTarifa.setIdGrupo(oMetadatoGrupoNuevo.getIdGrupo());
			oTarifa.setFecInici(new java.sql.Date(new Date().getTime()));
			oTarifa.setFecInici(new java.sql.Date(fecIni.getTime()));
			oTarifa.setFecFinal(new java.sql.Date(fecFin.getTime()));
			oTarifa.setFecContr(new Date());
			oTarifa.setUsuContr(oProcNuevo.getUsuContr());
			serviceTarifa.save(oTarifa);
			
			
		}catch (Exception e){
			throw new ErrorInsertarBD(e.getMessage());
		}
		return oProcNuevo;
		
	}
	
	@GetMapping("/procedimiento/ver/{id}")
	public Procedimiento detalle(@PathVariable Long id) {
		Procedimiento procedimiento = service.findById(id);
		return procedimiento;
	}
	
	@GetMapping("/procedimiento/listar")
	public List<ProcedimientoDto> listar() {
		List<Procedimiento> aProcedimientos = service.findAll();
		if(aProcedimientos.isEmpty() || aProcedimientos == null) {
			 throw new NoDataFoundException();
		}
		
		List<ProcedimientoDto> oProcDto = new ArrayList<ProcedimientoDto>();
		
		for(int i = 0; i < aProcedimientos.size(); i++) {
			ProcedimientoDto oPrcoDtoNew = new ProcedimientoDto();
			
			if(aProcedimientos.get(i).getCodigoSia() != null) {
				oPrcoDtoNew.setCodigoSia(aProcedimientos.get(i).getCodigoSia());
			}
			
			if(aProcedimientos.get(i).getDepartamento() != null) {
				oPrcoDtoNew.setDepartamento(aProcedimientos.get(i).getDepartamento());
				oPrcoDtoNew.setDesEleme(aProcedimientos.get(i).getDepartamento().getDesEleme());
			}
			
			if(aProcedimientos.get(i).getDescripcion() != null) {
				oPrcoDtoNew.setDescripcion(aProcedimientos.get(i).getDescripcion());
			}
			
			if(aProcedimientos.get(i).getFecContr() != null) {
				oPrcoDtoNew.setFecContr(aProcedimientos.get(i).getFecContr());
			}
			
			if(aProcedimientos.get(i).getId() != null) {
				oPrcoDtoNew.setId(aProcedimientos.get(i).getId());
			}
			
			if(aProcedimientos.get(i).getSiglas() != null) {
				oPrcoDtoNew.setSiglas(aProcedimientos.get(i).getSiglas());
			}
			
			if(aProcedimientos.get(i).getIdMatProce() != null) {
				oPrcoDtoNew.setIdMatProce(aProcedimientos.get(i).getIdMatProce());
				MateriaProcedimiento materia = serviceMateria.findById(aProcedimientos.get(i).getIdMatProce());
				oPrcoDtoNew.setDesMateria(materia.getDescripcion());
			}
			if(aProcedimientos.get(i).getModalidad() != null) {
				oPrcoDtoNew.setModalidad(aProcedimientos.get(i).getModalidad());
			}
			if(aProcedimientos.get(i).getUsuContr() != null) {
				oPrcoDtoNew.setUsuContr(aProcedimientos.get(i).getUsuContr());
			}
			oProcDto.add(oPrcoDtoNew);
		}
		
		return oProcDto;
		/*return service.findAll().stream().map(procedimiento -> {
			return procedimiento;
		}).collect(Collectors.toList());*/
	}
	
	@GetMapping("/procedimiento/listar/{idOrgEleme}")
	public List<ProcedimientoDto> listarPorIdOrgEleme(@PathVariable Long idOrgEleme) {
		List<ProcedimientoDto> aProcedimientos = listar();		
		List<ProcedimientoDto> aProcFitlrados = ExpedienteValide.buscarPorIdOrgEleme(aProcedimientos, idOrgEleme); 
		if(aProcFitlrados == null ||aProcFitlrados.isEmpty()) {
			 throw new NoDataFoundException();
		}
		
		return aProcFitlrados;
	}
	
	@PutMapping("/procedimiento/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Procedimiento editar(@RequestBody Procedimiento procedimiento, @PathVariable Long id) {
		Procedimiento procedimientoDB = service.findById(id);
		if(procedimiento.getCodigoSia() != null) {
			procedimientoDB.setCodigoSia(procedimiento.getCodigoSia());
		}
		if(procedimiento.getDepartamento() != null) {
			procedimientoDB.setDepartamento(procedimiento.getDepartamento());
		}
		if(procedimiento.getDescripcion()!= null) {
			procedimientoDB.setDescripcion(procedimiento.getDescripcion());
		}
		if(procedimiento.getFecContr()!= null) {
			procedimientoDB.setFecContr(procedimiento.getFecContr());
		}else {
			procedimientoDB.setFecContr(new Date());
		}
		if(procedimiento.getIdMatProce()!= null) {
			procedimientoDB.setIdMatProce(procedimiento.getIdMatProce());
		}
		if(procedimiento.getModalidad()!= null) {
			procedimientoDB.setModalidad(procedimiento.getModalidad());
		}		
		if(procedimiento.getUsuContr() != null) {
			procedimientoDB.setUsuContr(procedimiento.getUsuContr());
		}
		
		return service.save(procedimientoDB);	
	}
	
	@DeleteMapping("/procedimiento/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		List<Expediente> aExpedientes = serviceExpediente.findByProcedimiento(id);
		if(aExpedientes == null || aExpedientes.isEmpty()) {
			Procedimiento procedimientoDB = service.findById(id);
			if (procedimientoDB == null) {
				throw new NoDataFoundException();  
			}
			
			List<TareaProcedimiento> aTareaProcedimiento = serviceTareaProcedimiento.findByProcedimiento(id);
			
			if(aTareaProcedimiento != null) {
				for(int i=0; i < aTareaProcedimiento.size(); i++){
					List<Permiso> aPermiso = servicePermiso.findByIdTarProce(aTareaProcedimiento.get(i).getId());
					if(aPermiso != null) {
						for(int j=0; j < aPermiso.size();j++) {
							servicePermiso.deleteById(aPermiso.get(j).getId());
						}
					}	
				}
				for(int i=0; i < aTareaProcedimiento.size(); i++){
					serviceTareaProcedimiento.deleteById(aTareaProcedimiento.get(i).getId());
				}
			}
			List<GfTarifa> oTarifaBus = serviceTarifa.findByIdProce(procedimientoDB.getId());
			if(oTarifaBus != null && !oTarifaBus.isEmpty()) {
				for(int i=0; i < oTarifaBus.size(); i++) {
					serviceTarifa.delete(oTarifaBus.get(i).getIdTarif());
					serviceMetadatoGrupo.deleteById(oTarifaBus.get(i).getIdGrupo());		
				}
			}
			
			service.deleteById(procedimientoDB.getId());
		}else {
			throw new ErrorBorradoProcedimientoException();
		}
    }
	
	public List<Expediente> listarExpedientes() {
		List<Expediente> aExpedientes = serviceExpediente.findAll();
		if(aExpedientes.isEmpty() || aExpedientes == null) {
			 throw new NoDataFoundException();
		}
		return aExpedientes;
	}
	
	public List<TareaProcedimiento> listarTareaProc() {
		List<TareaProcedimiento> aTareaProcedimiento = serviceTareaProcedimiento.findAll();
		if(aTareaProcedimiento.isEmpty() || aTareaProcedimiento == null) {
			 throw new NoDataFoundException();
		}
		return aTareaProcedimiento;
	}
	
	public  List<Permiso> listarPermisoProc() {
		List<Permiso> permisoProcedimiento = servicePermiso.findAll();
		if(permisoProcedimiento.isEmpty() || permisoProcedimiento == null) {
			 throw new NoDataFoundException();
		}
		return permisoProcedimiento;
	}
}
