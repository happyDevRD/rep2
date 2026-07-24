package com.greenaall.rd.controllers;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NoRegistradorFoundException;
import com.greenaall.exception.NoRegistradorPermisoException;
import com.greenaall.exception.NoRegistroFoundException;
import com.greenaall.models.ad.entity.Contador;
import com.greenaall.models.ad.service.ContadorServiceImpl;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ge.entity.Entidad;
import com.greenaall.models.ge.service.EntidadServiceImpl;
import com.greenaall.models.rd.entity.RdDocumento;
import com.greenaall.models.rd.entity.RdDocumentoAnexo;
import com.greenaall.models.rd.entity.RdDocumentoInteresado;
import com.greenaall.models.rd.entity.RdRegistrador;
import com.greenaall.models.rd.entity.RdRegistradorPK;
import com.greenaall.models.rd.entity.RdRegistro;
import com.greenaall.models.rd.service.RdDocumentoAnexoServiceImpl;
import com.greenaall.models.rd.service.RdDocumentoInteresadoServiceImpl;
import com.greenaall.models.rd.service.RdDocumentoServiceImpl;
import com.greenaall.models.rd.service.RdRegistradorServiceImpl;
import com.greenaall.models.rd.service.RdRegistroServiceImpl;
import com.greenaall.rd.dto.RdDocumentoDto;

@RestController
public class RdDocumentoController {
	
	@Autowired
    private RdDocumentoServiceImpl service;
	
	@Autowired
    private RdRegistradorServiceImpl serviceRegistrador;
	
	@Autowired
    private RdRegistroServiceImpl serviceRegistro;
	
	@Autowired
    private RdDocumentoInteresadoServiceImpl serviceDocumentoInteresado;
	
	@Autowired
    private RdDocumentoAnexoServiceImpl serviceDocumentoAnexo;
	
	@Autowired
    private ContadorServiceImpl serviceContador;
	
	@Autowired
    private EntidadServiceImpl serviceEntidad;
	
	@Autowired
    private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
    private InteresadoServiceImpl serviceInteresado;
	
	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;
	
	@PostMapping("/rdDocumento/crearEntrada/{idPerso}/{idHisPerso}/{codArchi}/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public String crearEntrada(@RequestBody RdDocumento documento, @PathVariable Long idPerso, @PathVariable Long idHisPerso, 
			@PathVariable Long codArchi, @PathVariable Long idTarea) {
		
		documento.setCodEntid(Short.valueOf((short)1));
		documento.setRegActiv(Short.valueOf((short)1));
		documento.setCodMovim("A");
		documento.setFecVaria(new Date());
		documento.setFecContr(new Date());
		documento.setTipDocum(Short.valueOf((short)1));
		documento.setEstado(Short.valueOf((short)0));
		documento.setEnLibro(Short.valueOf((short)1));
		documento.setTraPeso(Short.valueOf((short)1));
		documento.setAcuse(Short.valueOf((short)1));
		documento.setTipReemb(Short.valueOf((short)0));
		documento.setPais("ES");
		documento.setIndDocRemit(Short.valueOf((short)0));
		documento.setCodPosta(Integer.valueOf((int)0));
		documento.setTipPrese(Short.valueOf((short)0));
		documento.setFecRegis(new Date());
		
		SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(new Date());
        documento.setEjeRegis(Short.parseShort(currentYear));
		
		Entidad oEntidad = serviceEntidad.findById(Short.valueOf((short)1));
		
		if(oEntidad != null) {
			documento.setCodProvi(oEntidad.getCodProvi());
			documento.setCodMunic(oEntidad.getCodMunic());
		}
		
		if(documento.getUsuContr() != null) {
			documento.setUsuRegis(documento.getUsuContr());
			RdRegistro oRegistro = serviceRegistro.findByTipRegisAndEntidad();
			if(oRegistro == null) {
				throw new NoRegistroFoundException();
			}
			documento.setCodRegis(oRegistro.getCodRegis());
			
			RdRegistradorPK oRegistradorPK = new RdRegistradorPK();
			oRegistradorPK.setCodEntid(Short.valueOf((short)1));
			oRegistradorPK.setCodRegis(oRegistro.getCodRegis());
			oRegistradorPK.setUsuario(documento.getUsuContr());
			
			RdRegistrador oRegistrador = serviceRegistrador.findById(oRegistradorPK);
			
			if(oRegistrador == null) {
				throw new NoRegistradorFoundException();
			}
			if(oRegistrador.getIndInser().equals(Short.valueOf((short)3)) 
					|| oRegistrador.getIndInser().equals(Short.valueOf((short)1)) ) {
				throw new NoRegistradorPermisoException();
			}
			
			documento.setIdRegis(oRegistrador.getIdRegis());
			documento.setIdHisRegis(oRegistrador.getIdHisRegis());
			documento.setIdRegInici(oRegistrador.getIdRegis());
			documento.setIdHisRegInici(oRegistrador.getIdHisRegis());
			
			if(documento.getEjeRegis() != null) {
				Contador oContador = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(documento.getEjeRegis(), 
						Short.valueOf((short)8), oRegistro.getNumConEntrada(), Short.valueOf((short)1));
				if(oContador != null) {
					Integer oNumRegis = (int) oContador.getValConta() + Integer.valueOf((int) 1);
					documento.setNumRegis(oNumRegis);
					oContador.setValConta(oNumRegis);
					serviceContador.save(oContador);
				}
				Contador oContadorDocmento = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf((short)0), 
						Short.valueOf((short)8), Short.valueOf((short)1), Short.valueOf((short)1));
				if(oContadorDocmento != null) {
					Integer oNumDocumento = (int) oContador.getValConta() + Integer.valueOf((int) 1);
					documento.setIdDocum(Long.valueOf(oNumDocumento.longValue()));
					oContador.setValConta(oNumDocumento);
					serviceContador.save(oContadorDocmento);
				}else {
					throw new NoDataFoundException();
				}
			}
			Integer oNumExped = Integer.valueOf(documento.getNumExped());
			Expediente oExpediente = serviceExpediente.findByEjercicioAndNumero(documento.getEjeExped(), oNumExped);
			
			if(oExpediente == null) {
				throw new NoDataFoundException();
			}
			
			List<Interesado> oInteresado = serviceInteresado.findByExpedienteAndIdHisPerso(oExpediente.getId(), idHisPerso);
			
			if(oInteresado == null) {
				throw new NoDataFoundException();
			}
			
			documento.setForNotif(oInteresado.get(0).getForNotif());
			
			RdDocumento oDocumentoNew = service.save(documento);
			TareaTramiteExpediente oTarTraExped = serviceTareaTramiteExpediente.findById(idTarea);
			oTarTraExped.setIdHisDocum(oDocumentoNew.getIdHisDocum());
			oTarTraExped.setIdDocum(oDocumentoNew.getIdDocum());
			oTarTraExped.setFecContr(new Date());
			oTarTraExped.setUsuContr(oDocumentoNew.getUsuContr());
			TareaTramiteExpediente oTarea = serviceTareaTramiteExpediente.save(oTarTraExped);
			
			BigDecimal oNumOrden = serviceDocumentoInteresado.max(Short.valueOf((short)1));
			oNumOrden = oNumOrden.add(new BigDecimal(1));
			
			RdDocumentoInteresado oDocumentoInteresado = new RdDocumentoInteresado();
			oDocumentoInteresado.setNumOrden(oNumOrden.longValue());
			oDocumentoInteresado.setIdHisDocum(oDocumentoNew.getIdHisDocum());
			oDocumentoInteresado.setIdHisInter(idHisPerso);
			oDocumentoInteresado.setIdInter(idPerso);
			oDocumentoInteresado.setIntPrinc(Short.valueOf((short)1));
			oDocumentoInteresado.setUsuContr(oDocumentoNew.getUsuContr());
			oDocumentoInteresado.setFecContr(new Date());
			
			serviceDocumentoInteresado.save(oDocumentoInteresado);
			
			if(codArchi != null) {
				RdDocumentoAnexo oDocumentoAnexo = new RdDocumentoAnexo();
				BigDecimal oNumOrdenAnexo = serviceDocumentoAnexo.max(Short.valueOf((short)1));
				oNumOrdenAnexo = oNumOrdenAnexo.add(new BigDecimal(1));
				
				oDocumentoAnexo.setNumOrden(oNumOrdenAnexo.longValue());
				oDocumentoAnexo.setIdHisDocum(oDocumentoNew.getIdHisDocum());
				oDocumentoAnexo.setTipAnexo(oTarTraExped.getTipAnexo());
				oDocumentoAnexo.setFecAnexo(new Date());
				oDocumentoAnexo.setCodArchi(codArchi);		
				oDocumentoAnexo.setDocAport(oTarTraExped.getDocAport());
				oDocumentoAnexo.setTipDocEni(oTarTraExped.getTipDocEni());
				Short documentoEni = oTarTraExped.getDocumentacion();
				
				if(documentoEni.equals(Short.valueOf((short)1))) {
					oDocumentoAnexo.setRdbDoc1(Short.valueOf((short)1));
					oDocumentoAnexo.setRdbDoc2(Short.valueOf((short)0));
					oDocumentoAnexo.setRdbDoc3(Short.valueOf((short)0));
				}else if(documentoEni.equals(Short.valueOf((short)2))){
					oDocumentoAnexo.setRdbDoc2(Short.valueOf((short)1));
					oDocumentoAnexo.setRdbDoc1(Short.valueOf((short)0));
					oDocumentoAnexo.setRdbDoc3(Short.valueOf((short)0));
				}else {
					oDocumentoAnexo.setRdbDoc3(Short.valueOf((short)1));
					oDocumentoAnexo.setRdbDoc1(Short.valueOf((short)0));
					oDocumentoAnexo.setRdbDoc2(Short.valueOf((short)0));
				}
			
				oDocumentoAnexo.setFirInsc(Short.valueOf((short)0));
				oDocumentoAnexo.setUsuContr(oDocumentoNew.getUsuContr());
				oDocumentoAnexo.setFecContr(new Date());
				
				serviceDocumentoAnexo.save(oDocumentoAnexo);
			}
			
			TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
			
			if(oTarea.getArchivo() != null) {
				oTareaHistorio.setCodArchi(oTarea.getArchivo());	
			}
			
			oTareaHistorio.setDesIndic("Entrada del documento: " + oDocumentoNew.getEjeRegis().toString()+"/"+oDocumentoNew.getNumRegis().toString());	
			oTareaHistorio.setDesTarea(oTarea.getDescripcion());
			oTareaHistorio.setFecContr(new Date());
			oTareaHistorio.setFecTarea(oTarea.getFecInicio());
			oTareaHistorio.setTarea(oTarea.getId());
			oTareaHistorio.setUsuario(oTarea.getUsuario());
			oTareaHistorio.setUsuContr(oTarea.getUsuContr());
			serviceTareaHistorico.save(oTareaHistorio);
			
			
			return oDocumentoNew.getEjeRegis().toString()+"/"+oDocumentoNew.getNumRegis().toString();
		}
		return null;
	}

	@PostMapping("/rdDocumento/crear/{idPerso}/{idHisPerso}/{codArchi}/{idTarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public String crear(@RequestBody RdDocumento documento, @PathVariable Long idPerso, @PathVariable Long idHisPerso, 
			@PathVariable Long codArchi, @PathVariable Long idTarea) {
		
		documento.setCodEntid(Short.valueOf((short)1));
		documento.setRegActiv(Short.valueOf((short)1));
		documento.setCodMovim("A");
		documento.setFecVaria(new Date());
		documento.setFecContr(new Date());
		documento.setTipDocum(Short.valueOf((short)2));
		documento.setEstado(Short.valueOf((short)0));
		documento.setEnLibro(Short.valueOf((short)1));
		documento.setTraPeso(Short.valueOf((short)1));
		documento.setAcuse(Short.valueOf((short)1));
		documento.setTipReemb(Short.valueOf((short)0));
		documento.setPais("ES");
		documento.setIndDocRemit(Short.valueOf((short)0));
		documento.setCodPosta(Integer.valueOf((int)0));
		documento.setTipPrese(Short.valueOf((short)0));
		documento.setFecRegis(new Date());
		
		SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(new Date());
        documento.setEjeRegis(Short.parseShort(currentYear));
		
		Entidad oEntidad = serviceEntidad.findById(Short.valueOf((short)1));
		
		if(oEntidad != null) {
			documento.setCodProvi(oEntidad.getCodProvi());
			documento.setCodMunic(oEntidad.getCodMunic());
		}
		
		if(documento.getUsuContr() != null) {
			documento.setUsuRegis(documento.getUsuContr());
			RdRegistro oRegistro = serviceRegistro.findByTipRegisAndEntidad();
			if(oRegistro == null) {
				throw new NoRegistroFoundException();
			}
			documento.setCodRegis(oRegistro.getCodRegis());
			
			RdRegistradorPK oRegistradorPK = new RdRegistradorPK();
			oRegistradorPK.setCodEntid(Short.valueOf((short)1));
			oRegistradorPK.setCodRegis(oRegistro.getCodRegis());
			oRegistradorPK.setUsuario(documento.getUsuContr());
			
			RdRegistrador oRegistrador = serviceRegistrador.findById(oRegistradorPK);
			
			if(oRegistrador == null) {
				throw new NoRegistradorFoundException();
			}
			if(oRegistrador.getIndInser().equals(Short.valueOf((short)3)) 
					|| oRegistrador.getIndInser().equals(Short.valueOf((short)1)) ) {
				throw new NoRegistradorPermisoException();
			}
			
			documento.setIdRegis(oRegistrador.getIdRegis());
			documento.setIdHisRegis(oRegistrador.getIdHisRegis());
			documento.setIdRegInici(oRegistrador.getIdRegis());
			documento.setIdHisRegInici(oRegistrador.getIdHisRegis());
			
			if(documento.getEjeRegis() != null) {
				Contador oContador = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(documento.getEjeRegis(), 
						Short.valueOf((short)8), oRegistro.getNumConSalida(), Short.valueOf((short)1));
				if(oContador != null) {
					Integer oNumRegis = (int) oContador.getValConta() + Integer.valueOf((int) 1);
					documento.setNumRegis(oNumRegis);
					oContador.setValConta(oNumRegis);
					serviceContador.save(oContador);
				}
				Contador oContadorDocmento = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf((short)0), 
						Short.valueOf((short)8), Short.valueOf((short)1), Short.valueOf((short)1));
				if(oContadorDocmento != null) {
					Integer oNumDocumento = (int) oContador.getValConta() + Integer.valueOf((int) 1);
					documento.setIdDocum(Long.valueOf(oNumDocumento.longValue()));
					oContador.setValConta(oNumDocumento);
					serviceContador.save(oContadorDocmento);
				}else {
					throw new NoDataFoundException();
				}
			}
			Integer oNumExped = Integer.valueOf(documento.getNumExped());
			Expediente oExpediente = serviceExpediente.findByEjercicioAndNumero(documento.getEjeExped(), oNumExped);
			
			if(oExpediente == null) {
				throw new NoDataFoundException();
			}
			
			List<Interesado> oInteresado = serviceInteresado.findByExpedienteAndIdHisPerso(oExpediente.getId(), idHisPerso);
			
			if(oInteresado == null) {
				throw new NoDataFoundException();
			}
			
			documento.setForNotif(oInteresado.get(0).getForNotif());
			
			RdDocumento oDocumentoNew = service.save(documento);
			TareaTramiteExpediente oTarTraExped = serviceTareaTramiteExpediente.findById(idTarea);
			oTarTraExped.setIdHisDocum(oDocumentoNew.getIdHisDocum());
			oTarTraExped.setIdDocum(oDocumentoNew.getIdDocum());
			oTarTraExped.setFecContr(new Date());
			oTarTraExped.setUsuContr(oDocumentoNew.getUsuContr());
			TareaTramiteExpediente oTarea = serviceTareaTramiteExpediente.save(oTarTraExped);
			
			BigDecimal oNumOrden = serviceDocumentoInteresado.max(Short.valueOf((short)1));
			oNumOrden = oNumOrden.add(new BigDecimal(1));
			
			RdDocumentoInteresado oDocumentoInteresado = new RdDocumentoInteresado();
			oDocumentoInteresado.setNumOrden(oNumOrden.longValue());
			oDocumentoInteresado.setIdHisDocum(oDocumentoNew.getIdHisDocum());
			oDocumentoInteresado.setIdHisInter(idHisPerso);
			oDocumentoInteresado.setIdInter(idPerso);
			oDocumentoInteresado.setIntPrinc(Short.valueOf((short)1));
			oDocumentoInteresado.setUsuContr(oDocumentoNew.getUsuContr());
			oDocumentoInteresado.setFecContr(new Date());
			
			serviceDocumentoInteresado.save(oDocumentoInteresado);
			
			if(codArchi != null) {
				RdDocumentoAnexo oDocumentoAnexo = new RdDocumentoAnexo();
				BigDecimal oNumOrdenAnexo = serviceDocumentoAnexo.max(Short.valueOf((short)1));
				oNumOrdenAnexo = oNumOrdenAnexo.add(new BigDecimal(1));
				
				oDocumentoAnexo.setNumOrden(oNumOrdenAnexo.longValue());
				oDocumentoAnexo.setIdHisDocum(oDocumentoNew.getIdHisDocum());
				oDocumentoAnexo.setTipAnexo(oTarTraExped.getTipAnexo());
				oDocumentoAnexo.setFecAnexo(new Date());
				oDocumentoAnexo.setCodArchi(codArchi);		
				oDocumentoAnexo.setDocAport(oTarTraExped.getDocAport());
				oDocumentoAnexo.setTipDocEni(oTarTraExped.getTipDocEni());
				Short documentoEni = oTarTraExped.getDocumentacion();
				
				if(documentoEni.equals(Short.valueOf((short)1))) {
					oDocumentoAnexo.setRdbDoc1(Short.valueOf((short)1));
					oDocumentoAnexo.setRdbDoc2(Short.valueOf((short)0));
					oDocumentoAnexo.setRdbDoc3(Short.valueOf((short)0));
				}else if(documentoEni.equals(Short.valueOf((short)2))){
					oDocumentoAnexo.setRdbDoc2(Short.valueOf((short)1));
					oDocumentoAnexo.setRdbDoc1(Short.valueOf((short)0));
					oDocumentoAnexo.setRdbDoc3(Short.valueOf((short)0));
				}else {
					oDocumentoAnexo.setRdbDoc3(Short.valueOf((short)1));
					oDocumentoAnexo.setRdbDoc1(Short.valueOf((short)0));
					oDocumentoAnexo.setRdbDoc2(Short.valueOf((short)0));
				}
			
				oDocumentoAnexo.setFirInsc(Short.valueOf((short)0));
				oDocumentoAnexo.setUsuContr(oDocumentoNew.getUsuContr());
				oDocumentoAnexo.setFecContr(new Date());
				
				serviceDocumentoAnexo.save(oDocumentoAnexo);
			}
			
			TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
			
			if(oTarea.getArchivo() != null) {
				oTareaHistorio.setCodArchi(oTarea.getArchivo());	
			}
			
			oTareaHistorio.setDesIndic("Salida del documento: " + oDocumentoNew.getEjeRegis().toString()+"/"+oDocumentoNew.getNumRegis().toString());	
			oTareaHistorio.setDesTarea(oTarea.getDescripcion());
			oTareaHistorio.setFecContr(new Date());
			oTareaHistorio.setFecTarea(oTarea.getFecInicio());
			oTareaHistorio.setTarea(oTarea.getId());
			oTareaHistorio.setUsuario(oTarea.getUsuario());
			oTareaHistorio.setUsuContr(oTarea.getUsuContr());
			serviceTareaHistorico.save(oTareaHistorio);
			
			
			return oDocumentoNew.getEjeRegis().toString()+"/"+oDocumentoNew.getNumRegis().toString();
		}
		return null;
	}
	
	@GetMapping("/rdDocumento/ver/{idHisDocum}")
	public RdDocumentoDto detalle(@PathVariable Long idHisDocum) {
		
		if(idHisDocum != null) {			
			RdDocumento oDocumentoNew = service.findByIdHisDocumAndRegActiv(idHisDocum);
			if(oDocumentoNew != null) {
				RdDocumentoDto oRdDocumentoDto = new RdDocumentoDto();
				oRdDocumentoDto.setEjeRegis(oDocumentoNew.getEjeRegis());
				oRdDocumentoDto.setNumRegis(oDocumentoNew.getNumRegis());
				oRdDocumentoDto.setFecRegis(oDocumentoNew.getFecRegis());
				oRdDocumentoDto.setExtracto(oDocumentoNew.getExtracto());				
				
				return oRdDocumentoDto;
			}
		}
		return null;
	}
}
