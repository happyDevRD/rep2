package com.greenaall.ex.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.ex.dto.TareaHistoricoTramiteExpedienteDto;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.ArchivoServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class TareaHistoricoTramiteExpedienteController {

	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl service;
	
	@Autowired
	private ArchivoServiceImpl archivoService;
	
	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTarea;
	
	@GetMapping("/tareaHistoricoTramiteExpediente/listarPorTarea/{idTarea}")
	public List<TareaHistoricoTramiteExpedienteDto> listarPorTarea(@PathVariable Long idTarea) {
		
		List<TareaHistoricoTramiteExpedienteDto> aTareaHistoricoTramiteExpedDto = new ArrayList<TareaHistoricoTramiteExpedienteDto>();
		List<TareaHistoricoTramiteExpediente> aTareaHistorico = service.findByTarea(idTarea);
		if(aTareaHistorico != null && aTareaHistorico.size() > 0) {
			for(int i = 0; i < aTareaHistorico.size(); i++) {
				TareaHistoricoTramiteExpedienteDto oTareaHistoricoDto = new TareaHistoricoTramiteExpedienteDto();
				if(aTareaHistorico.get(i).getCodArchi() != null) {
					Archivo oArchivo = archivoService.findById(aTareaHistorico.get(i).getCodArchi());
					if(oArchivo != null) {
						oTareaHistoricoDto.setArchivo(oArchivo.getCodArchi());
						if(oArchivo.getDesDocum() != null) {
							oTareaHistoricoDto.setDesArchi(oArchivo.getDesDocum());
						}
						
					}
				}
				if(aTareaHistorico.get(i).getDesIndic() != null) {
					oTareaHistoricoDto.setDesIndic(aTareaHistorico.get(i).getDesIndic());
				}
				if(aTareaHistorico.get(i).getDesTarea() != null) {
					oTareaHistoricoDto.setDesTarea(aTareaHistorico.get(i).getDesTarea());
				}
				if(aTareaHistorico.get(i).getFecTarea() != null) {
					oTareaHistoricoDto.setFecTarea(aTareaHistorico.get(i).getFecTarea());
				}
				if(aTareaHistorico.get(i).getTarea() != null) {
					oTareaHistoricoDto.setIdTarea(aTareaHistorico.get(i).getTarea());
					TareaTramiteExpediente oTarea = serviceTarea.findById(aTareaHistorico.get(i).getTarea());
					if(oTarea != null) {
						oTareaHistoricoDto.setNumTarea(oTarea.getNumero());
					}
					
				}
				if(aTareaHistorico.get(i).getUsuario() != null) {
					oTareaHistoricoDto.setUsuario(aTareaHistorico.get(i).getUsuario());
				}
				aTareaHistoricoTramiteExpedDto.add(oTareaHistoricoDto);
			}
		}
		
		return aTareaHistoricoTramiteExpedDto;
	}
}
