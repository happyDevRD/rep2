package com.greenaall.se.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.PropuestaExistenteException;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.se.entity.SeBolsaInte;
import com.greenaall.models.se.entity.SeBolsaPuntos;
import com.greenaall.models.se.service.BolsaInteServiceImpl;
import com.greenaall.models.se.service.BolsaPuntosServiceImpl;

@RestController
public class BolsaPuntosController {
	
	@Autowired
    private BolsaPuntosServiceImpl serviceBolsaPunto;
	
	@Autowired
    private BolsaInteServiceImpl serviceBolsaInte;
	
	@Autowired
    private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
    private TramiteServiceImpl serviceTramite;
	
	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;
	
	@PostMapping("/seBolsaPuntos/crear/{idPerso}/{idHisPerso}/{codArchi}/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public void crear(@RequestBody SeBolsaPuntos bolsaPuntos, @PathVariable Long idPerso, @PathVariable Long idHisPerso, 
			@PathVariable Long codArchi, @PathVariable Long idTarea) {
		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		if(oTareaTramiteExpediente != null && oTareaTramiteExpediente.getPropuestaResolucion() != null) {
			throw new PropuestaExistenteException();
		}
		bolsaPuntos.setFecContr(new Date());
		bolsaPuntos.setCodEntid(Short.valueOf((short)1));
		bolsaPuntos.setUsuario(bolsaPuntos.getUsuContr());
		if(codArchi != null) {
			bolsaPuntos.setCodArchi(codArchi);
		}
		if(bolsaPuntos.getFecAlta() == null) {
			bolsaPuntos.setFecAlta(new Date());
		}
		bolsaPuntos.setIndTratado(Short.valueOf((short)0));
		SeBolsaPuntos oBolsaNew = serviceBolsaPunto.save(bolsaPuntos);
		
		SeBolsaInte oBolsaInte = new SeBolsaInte();
		oBolsaInte.setIdHisBolsa(oBolsaNew.getIdHisBolsa());
		oBolsaInte.setIdHisInter(idHisPerso);
		oBolsaInte.setIdInter(idPerso);
		oBolsaInte.setFecContr(new Date());
		
		serviceBolsaInte.save(oBolsaInte);
		
		TareaTramiteExpediente oTarTraExped = serviceTareaTramiteExpediente.findById(idTarea);
		oTarTraExped.setPropuestaResolucion(oBolsaNew.getIdHisBolsa());
		oTarTraExped.setFecContr(new Date());
		serviceTareaTramiteExpediente.save(oTarTraExped);
		
		Tramite oTramite = serviceTramite.findById(oTarTraExped.getTramite());
		Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
		
		oExpediente.setFase(EnumFaseExpediente.RESOLUCION);
		serviceExpediente.save(oExpediente);
		
		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
		
		if(oTarTraExped.getArchivo() != null) {
			oTareaHistorio.setCodArchi(oTarTraExped.getArchivo());	
		}
		
		oTareaHistorio.setDesIndic("Generada Bolsa de Puntos " + oBolsaNew.getIdHisBolsa().toString());	
		oTareaHistorio.setDesTarea(oTarTraExped.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTarTraExped.getFecInicio());
		oTareaHistorio.setTarea(oTarTraExped.getId());
		oTareaHistorio.setUsuario(oTarTraExped.getUsuario());
		oTareaHistorio.setUsuContr(oTarTraExped.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);
	}

}
