package com.greenaall.se.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.se.entity.SeTablonAnuncios;
import com.greenaall.models.se.service.TablonAnunciosServiceImpl;

@RestController
public class TablonAnunciosController {
	
	@Autowired
    private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
    private TramiteServiceImpl serviceTramite;
	
	@Autowired
    private TablonAnunciosServiceImpl serviceTablonAnuncios;
	
	@Autowired
	private IArchivoService archivoService;
	
	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;
	
	@PostMapping("/seTablonAnuncios/crear/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public void crear(@RequestBody SeTablonAnuncios oTablonAnuncios, @PathVariable Long idTarea) {
		
		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		Tramite oTramite = serviceTramite.findById(oTareaTramiteExpediente.getTramite());
		Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
		
		oTablonAnuncios.setEjeExped(oExpediente.getEjercicio());
		oTablonAnuncios.setNumExped(oExpediente.getNumero());
		oTablonAnuncios.setCodEntid(Short.valueOf((short)1));
		oTablonAnuncios.setFecContr(new Date());
		if(oTablonAnuncios.getUsuContr() != null) {
			oTablonAnuncios.setUsuContr(oTablonAnuncios.getUsuContr());
		}
		oTablonAnuncios.setCodArchi(oTareaTramiteExpediente.getArchivo());
		SeTablonAnuncios oTablon = serviceTablonAnuncios.save(oTablonAnuncios);
		oTareaTramiteExpediente.setIdAnunc(oTablon.getIdAnunc());
		TareaTramiteExpediente oTarea = serviceTareaTramiteExpediente.save(oTareaTramiteExpediente);
		
		Archivo oArchivoNuevo = archivoService.findById(oTareaTramiteExpediente.getArchivo());
		if(oArchivoNuevo != null && oArchivoNuevo.getArcExpd() == null) {
			Archivo oArchivoModif = ArchivoValide.insertarArcExpd(oArchivoNuevo);
			archivoService.save(oArchivoModif);
		}
		
		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
		
		if(oTarea.getArchivo() != null) {
			oTareaHistorio.setCodArchi(oTarea.getArchivo());	
		}
		
		oTareaHistorio.setDesIndic("Generado Tablón de Anuncios " + oTablon.getIdAnunc().toString());	
		oTareaHistorio.setDesTarea(oTarea.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTarea.getFecInicio());
		oTareaHistorio.setTarea(oTarea.getId());
		oTareaHistorio.setUsuario(oTarea.getUsuario());
		oTareaHistorio.setUsuContr(oTarea.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);
	}

}
