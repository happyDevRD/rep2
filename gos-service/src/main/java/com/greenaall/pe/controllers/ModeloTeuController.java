package com.greenaall.pe.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.greenaall.exception.ErrorFicheroTeuException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.gf.entity.GfTablonEdictal;
import com.greenaall.models.gf.service.TablonEdictalServiceImpl;
import com.greenaall.models.pe.entity.ModeloTeu;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.ModeloTeuServiceImpl;
import com.greenaall.models.pe.service.NotificacionServiceImpl;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.pe.dto.FicheroTeuDto;
import com.greenaall.util.GenerarFicheroTEU;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ModeloTeuController extends WebServiceGatewaySupport{
	
	@Autowired
    private ModeloTeuServiceImpl service;
	
	@Autowired
    private ModeloTeuServiceImpl serviceModeloTeu;
	
	@Autowired
	private IParametroSistemaService parametroSistemaService;
	
	@Autowired
	private NotificacionServiceImpl notificacionService;
	
	@Autowired
	private PersonaEntidadServiceImpl personaEntidadService;
	
	@Autowired
	private TablonEdictalServiceImpl tablonEdictalService;
	
	
	@GetMapping("/modeloTeu/listar")
	public List<ModeloTeu> listar() {
		List<ModeloTeu> aModeloTeu = service.findAll();
		if(aModeloTeu == null || aModeloTeu.isEmpty()) {
			throw new NoDataFoundException();
		}
		return aModeloTeu;
	}
	
	@PostMapping("/modeloTeu/fichero")
	public void ficheroTeu(@RequestBody FicheroTeuDto ficheroTeu, HttpServletResponse response){
		GfTablonEdictal oTablonEdictal = new GfTablonEdictal();
		ModeloTeu oModeloTeu = null;
		Notificacion oNotificacion = null;
		PersonaEntidad oPersonaEntidad = null;

		oTablonEdictal.setCodEntid(Short.valueOf((short)1));
		if(ficheroTeu.getFecGener() != null) {
			oTablonEdictal.setFecGener(ficheroTeu.getFecGener());
		}
		
		if(ficheroTeu.getFecGener() != null) {
			oTablonEdictal.setFecGener(ficheroTeu.getFecGener());
		}else {
			oTablonEdictal.setFecGener(new Date());
		}
		
		if(ficheroTeu.getFecSolic() != null) {
			oTablonEdictal.setFecSolic(ficheroTeu.getFecSolic());
		}else {
			oTablonEdictal.setFecSolic(new Date());
		}
		
		if(ficheroTeu.getFecFirma() != null) {
			oTablonEdictal.setFecFirma(ficheroTeu.getFecFirma());
		}else {
			oTablonEdictal.setFecFirma(new Date());
		}
		
		if(ficheroTeu.getDescripcion() != null) {
			oTablonEdictal.setDescripcion(ficheroTeu.getDescripcion());
		}else {
			oTablonEdictal.setDescripcion("Envio TEU");
		}
		
		if(ficheroTeu.getCodDir3() != null) {
			oTablonEdictal.setCodDir3(ficheroTeu.getCodDir3());
		}else {
			String sValParam = "Sin codDir3";
			ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
					"es", Short.valueOf((short) 284));			
			ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
			if(oParametroSistema != null && oParametroSistema.getValor() != null && !oParametroSistema.getValor().equals("")) {
				oTablonEdictal.setCodDir3(oParametroSistema.getValor());
			}else {
				oTablonEdictal.setCodDir3(sValParam);
			}
			
		}
		
		if(ficheroTeu.getDesDir3() != null) {
			oTablonEdictal.setDesDir3(ficheroTeu.getDesDir3());
		}else {
			String sValParam = "Sin desDir3";
			ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
					"es", Short.valueOf((short) 19));			
			ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
			if(oParametroSistema != null && oParametroSistema.getValor() != null && !oParametroSistema.getValor().equals("")) {
				oTablonEdictal.setDesDir3(oParametroSistema.getValor());
			}else {
				oTablonEdictal.setDesDir3(sValParam);
			}
		}
		
		if(ficheroTeu.getUrl() != null) {
			oTablonEdictal.setUrl(ficheroTeu.getUrl());
		}
		
		if(ficheroTeu.getEmail() != null) {
			oTablonEdictal.setEmail(ficheroTeu.getEmail());
		}
		
		if(ficheroTeu.getForPubli() != null) {
			oTablonEdictal.setForPubli(ficheroTeu.getForPubli());
		}else {
			oTablonEdictal.setForPubli(Short.valueOf((short)1));
		}
		
		if(ficheroTeu.getDatPerso() != null) {
			oTablonEdictal.setDatPerso(ficheroTeu.getDatPerso());
		}else {
			oTablonEdictal.setDatPerso(true);
		}
		
		if(ficheroTeu.getIncLgt() != null) {
			oTablonEdictal.setIncLgt(ficheroTeu.getIncLgt());
		}else {
			oTablonEdictal.setIncLgt(true);
		}
		
		if(ficheroTeu.getTexPlura() != null) {
			oTablonEdictal.setTexPlura(ficheroTeu.getTexPlura());
		}else {
			oTablonEdictal.setTexPlura(false);
		}
		
		if(ficheroTeu.getIndMater() != null) {
			oTablonEdictal.setIndMater(ficheroTeu.getIndMater());
		}
		
		if(ficheroTeu.getProcedimiento() != null) {
			oTablonEdictal.setProcedimiento(ficheroTeu.getProcedimiento());
		}
		
		if(ficheroTeu.getIdModel() != null) {
			oTablonEdictal.setIdModel(ficheroTeu.getIdModel());
		}
		
		if(ficheroTeu.getPobFirma() != null) {
			oTablonEdictal.setPobFirma(ficheroTeu.getPobFirma());
		}else {
			String sValParam = "Sin Población";
			ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
					"es", Short.valueOf((short) 20));			
			ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
			if(oParametroSistema != null && oParametroSistema.getValor() != null && !oParametroSistema.getValor().equals("")) {
				oTablonEdictal.setPobFirma(oParametroSistema.getValor());
			}else {
				oTablonEdictal.setPobFirma(sValParam);
			}
		}
		
		if(ficheroTeu.getFirmante() != null) {
			oTablonEdictal.setFirmante(ficheroTeu.getFirmante());
		}
		
		if(ficheroTeu.getIdModel() != null) {
			oModeloTeu = serviceModeloTeu.findById(ficheroTeu.getIdModel());
			oTablonEdictal.setIdModel(oModeloTeu.getIdModel());
		}
		
		if(ficheroTeu.getIdNotif() != null) {
			oNotificacion = notificacionService.findById(ficheroTeu.getIdNotif());
			if(oNotificacion != null) {
				PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
				oPersonaEntidadPK.setIdHisPerso(oNotificacion.getIdHisPerso());
				oPersonaEntidadPK.setIdPerso(oNotificacion.getIdPerso());
				oPersonaEntidad = personaEntidadService.findById(oPersonaEntidadPK);
			}
			
		}
		GenerarFicheroTEU oGenerarTEU = new GenerarFicheroTEU();
		String ruta =  oGenerarTEU.inicializarDatos(oTablonEdictal, oModeloTeu, oNotificacion, oPersonaEntidad);
		if(ruta != null) {
			oNotificacion.setBop(Short.valueOf((short)1));
			oNotificacion.setFecEmiBop(new Date());
			oNotificacion.setFecEnvio(new Date());
			GfTablonEdictal oTE = tablonEdictalService.save(oTablonEdictal);
			oNotificacion.setNumEnvioTeu(oTE.getIdEteu());
			notificacionService.save(oNotificacion);
			
		}
		try {
			FileInputStream fis;
			fis = new FileInputStream(ruta);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + "Fichero TEU");
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new ErrorFicheroTeuException();
		}	
	}
	
}
