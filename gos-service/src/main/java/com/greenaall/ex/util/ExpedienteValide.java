package com.greenaall.ex.util;

import java.util.ArrayList;
import java.util.List;

import com.greenaall.models.ex.dto.ProcedimientoDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Permiso;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.TareaProcedimiento;


public class ExpedienteValide {
	
	public static List<ProcedimientoDto> buscarPorIdOrgEleme(List<ProcedimientoDto> aProcedimientos, Long idOrgElemen) {
		
		List<ProcedimientoDto> aProcFiltrados = new ArrayList<ProcedimientoDto>();
		for(int i=0; i < aProcedimientos.size(); i++){
			if(aProcedimientos.get(i).getDepartamento().getIdOrgEleme().equals(idOrgElemen)) {
				aProcFiltrados.add(aProcedimientos.get(i));
			}
		}
		
		return aProcFiltrados; 
		
	}
	
	public static Long dameMaximoProcedimiento(List<Procedimiento> aProcedimientos) {
		
		Procedimiento oProcedimiento = aProcedimientos.get(aProcedimientos.size() -1 );
		return oProcedimiento.getId();
		
	}
	
	public static List<Expediente> buscarExpIdProc(Long idProc, List<Expediente> aExpedientes) {
		List<Expediente> aExpFiltrados = new ArrayList<Expediente>();
		for(int i=0; i < aExpedientes.size(); i++){
			if(aExpedientes.get(i).getProcedimiento().equals(idProc)) {
				aExpFiltrados.add(aExpedientes.get(i));
			}
		}
		return aExpFiltrados; 
	}
	
	public static List<TareaProcedimiento> buscarTareaProcIdProc(Long idProc, List<TareaProcedimiento> aTareaExp) {
		List<TareaProcedimiento> aTareaProcFiltrados = new ArrayList<TareaProcedimiento>();
		for(int i=0; i < aTareaExp.size(); i++){
			if(aTareaExp.get(i).getId().equals(idProc)) {
				aTareaProcFiltrados.add(aTareaExp.get(i));
			}
		}
		return aTareaProcFiltrados; 
	}
	
	public static List<Permiso> buscarPermisoIdProc(Long idProc, List<Permiso> aPersmisoProc) {
		List<Permiso> aPermisoProcFiltrados = new ArrayList<Permiso>();
		for(int i=0; i < aPersmisoProc.size(); i++){
			if(aPersmisoProc.get(i).getProcedimiento().equals(idProc)) {
				aPermisoProcFiltrados.add(aPersmisoProc.get(i));
			}
		}
		return aPermisoProcFiltrados; 
	}
}
