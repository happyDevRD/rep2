package com.greenaall.gf.controllers;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.ObjetoTributarioBajaException;
import com.greenaall.gf.dto.ObjetoTributarioDto;
import com.greenaall.models.ad.entity.Contador;
import com.greenaall.models.ad.service.ContadorServiceImpl;
import com.greenaall.models.gf.entity.ObjetoTributario;
import com.greenaall.models.gf.entity.ObjetoTributarioPK;
import com.greenaall.models.gf.entity.TipoObjetoTributario;
import com.greenaall.models.gf.entity.TipoObjetoTributarioPK;
import com.greenaall.models.gf.service.IObjetoTributarioService;
import com.greenaall.models.gf.service.ITipoObjetoTributarioService;
import com.greenaall.models.pe.entity.DomiciliacionBancaria;
import com.greenaall.models.pe.entity.DomiciliacionBancariaPK;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.service.IDomiciliacionBancariaService;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.te.entity.Domicilio;
import com.greenaall.models.te.entity.DomicilioPK;
import com.greenaall.models.te.service.IDomicilioService;
import com.greenaall.util.Clonador;

@RestController
public class ObjetoTributarioController {
	
	@Autowired
	private ITipoObjetoTributarioService tipoObjetoTributarioService;
	
	@Autowired
	private IObjetoTributarioService objetoTributarioService;
	
	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;
	
	@Autowired
	private IDomicilioService domicilioService;
	
	@Autowired
	private IDomiciliacionBancariaService domiciliacionBancariaService;
	
	@Autowired
    private ContadorServiceImpl serviceContador;
	
	@PutMapping("/objetoTributario/baja")
	@ResponseStatus(HttpStatus.CREATED)
	public ObjetoTributarioDto baja(@RequestBody ObjetoTributarioDto objetoTributarioDto) throws Exception{
		
		ObjetoTributarioPK oObjetoTribuarioPK = new ObjetoTributarioPK();
		oObjetoTribuarioPK.setIdHisObjTribu(objetoTributarioDto.getIdHisObjTribu());
		oObjetoTribuarioPK.setIdObjTribu(objetoTributarioDto.getIdObjTribu());
		
		ObjetoTributario oObjetoTributarioBus = objetoTributarioService.findById(oObjetoTribuarioPK);	
		
		if(oObjetoTributarioBus != null && oObjetoTributarioBus.getCodMovim().equals("B")) {
			throw new ObjetoTributarioBajaException();
		}
		
		ObjetoTributario oObjetoTribuarioNuevo = (ObjetoTributario) Clonador.deepCopy(oObjetoTributarioBus);
		oObjetoTributarioBus.setRegActiv(Short.valueOf((short) 0));
		objetoTributarioService.save(oObjetoTributarioBus);
		
		if(objetoTributarioDto.getObservaciones() != null) {
			oObjetoTribuarioNuevo.setObservaciones(objetoTributarioDto.getObservaciones());
		}
		
		oObjetoTribuarioNuevo.setCodMovim("B");
		oObjetoTribuarioNuevo.setCodCauMovim(Short.valueOf((short) 1));
		oObjetoTribuarioNuevo.setFecMovim(new Date());
		oObjetoTribuarioNuevo.setIdHisObjTribu(null);
		
		objetoTributarioService.save(oObjetoTribuarioNuevo);
		
		return objetoTributarioDto;
		
	}
	
	@PutMapping("/objetoTributario/editar")
	@ResponseStatus(HttpStatus.CREATED)
	public ObjetoTributarioDto editar(@RequestBody ObjetoTributarioDto objetoTributarioDto) throws Exception{
		
		ObjetoTributarioDto oObjetoTributarioDtoNuevo = new ObjetoTributarioDto();
		
		ObjetoTributarioPK oObjetoTribuarioPK = new ObjetoTributarioPK();
		oObjetoTribuarioPK.setIdHisObjTribu(objetoTributarioDto.getIdHisObjTribu());
		oObjetoTribuarioPK.setIdObjTribu(objetoTributarioDto.getIdObjTribu());
		
		ObjetoTributario oObjetoTributarioBus = objetoTributarioService.findById(oObjetoTribuarioPK);	
		ObjetoTributario oObjetoTribuarioNuevo = (ObjetoTributario) Clonador.deepCopy(oObjetoTributarioBus);
		
		oObjetoTributarioBus.setRegActiv(Short.valueOf((short) 0));
		objetoTributarioService.save(oObjetoTributarioBus);
		
		if(objetoTributarioDto.getDesObjTribu() != null) {
			oObjetoTribuarioNuevo.setDesObjTribu(objetoTributarioDto.getDesObjTribu());
		}
		
		if(objetoTributarioDto.getDomBanca() != null) {
			DomiciliacionBancaria oDomiciliacionBancaria = new DomiciliacionBancaria();
			oDomiciliacionBancaria.setIdHisPerso(oObjetoTribuarioNuevo.getIdHisSujPasiv());
			oDomiciliacionBancaria.setIdPerso(oObjetoTribuarioNuevo.getIdSujPasiv());
			oDomiciliacionBancaria.setFecMovim(new Date());
			oDomiciliacionBancaria.setCodMovim("A");
			oDomiciliacionBancaria.setCauMovim(Short.valueOf((short) 1));
			oDomiciliacionBancaria.setIdHisTitul(oObjetoTribuarioNuevo.getIdHisSujPasiv());
			oDomiciliacionBancaria.setIdTitul(oObjetoTribuarioNuevo.getIdSujPasiv());
			oDomiciliacionBancaria.setTipCuent(Short.valueOf((short) 1));
			oDomiciliacionBancaria.setDesDomBanca("C.C.C.: " + objetoTributarioDto.getDomBanca());
			oDomiciliacionBancaria.setCodEntid(Short.valueOf(objetoTributarioDto.getDomBanca().substring(4, 8)));
			oDomiciliacionBancaria.setCodSucur(Short.valueOf(objetoTributarioDto.getDomBanca().substring(8, 12)));
			oDomiciliacionBancaria.setDigContr(Short.valueOf(objetoTributarioDto.getDomBanca().substring(12,14)));
			oDomiciliacionBancaria.setCodCuent(new BigDecimal(objetoTributarioDto.getDomBanca().substring(14)));
			oDomiciliacionBancaria.setIban(objetoTributarioDto.getDomBanca());
			oDomiciliacionBancaria.setCodExclu(Short.valueOf((short) 1));
			
			Calendar oCalendar = Calendar.getInstance();
			oCalendar.setTime(new Date());
			int anno = oCalendar.get(Calendar.YEAR);
			
			Contador oContadorRefDomic = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf((short) 0), 
					Short.valueOf((short)34), Short.valueOf((short)7), Short.valueOf((short)0));
			
			if(oContadorRefDomic != null) {
				Integer oValor = (int) oContadorRefDomic.getValConta() + Integer.valueOf((int) 1);
				oDomiciliacionBancaria.setRefDomic(Long.valueOf((long)oValor));
				oObjetoTribuarioNuevo.setRefDomic(Long.valueOf((long)oValor));
				oContadorRefDomic.setValConta(oValor);
				serviceContador.save(oContadorRefDomic);
			}
			
			Contador oContadorOrden = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf((short) anno), 
					Short.valueOf((short)20), Short.valueOf((short)5), Short.valueOf((short)1));
			
			if(oContadorOrden != null) {
				Integer oValor = (int) oContadorOrden.getValConta() + Integer.valueOf((int) 1);
				oDomiciliacionBancaria.setEjeOrden(Integer.valueOf((int) anno));
				oDomiciliacionBancaria.setNumOrden(oValor);
				oContadorOrden.setValConta(oValor);
				serviceContador.save(oContadorOrden);
			}
			
			DomiciliacionBancaria oDomiciliacionNueva = domiciliacionBancariaService.save(oDomiciliacionBancaria);
			oObjetoTribuarioNuevo.setIdHisDomBanca(oDomiciliacionNueva.getIdHisDomBanca());
			oObjetoTribuarioNuevo.setIdDomBanca(oDomiciliacionNueva.getIdDomBanca());
			
		}
		
		return oObjetoTributarioDtoNuevo;
	}
	
	@GetMapping("/objetoTributario/ver/{idHisTipObjTribu}/{idTipObjTribu}/{numDocum}")
	public ObjetoTributarioDto detalle(@PathVariable Long idHisTipObjTribu, @PathVariable Long idTipObjTribu, @PathVariable String numDocum){
					
		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findByNumDocum(numDocum);
		ObjetoTributarioDto oObjetoTributarioDto = new ObjetoTributarioDto();
		
		if (oPersonaEntidad != null) {
			
			List<ObjetoTributario> aObjetoTributario = objetoTributarioService.findByTipObjTribuAndSujPasiv(idHisTipObjTribu, idTipObjTribu, oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
			
			if(aObjetoTributario != null && !aObjetoTributario.isEmpty()) {
				
				TipoObjetoTributarioPK oTipoObjetoTributarioPK = new TipoObjetoTributarioPK();
				oTipoObjetoTributarioPK.setIdHisTipObjTribu(idHisTipObjTribu);
				oTipoObjetoTributarioPK.setIdTipObjTribu(idTipObjTribu);
				
				TipoObjetoTributario oTipoObjetoTributario = tipoObjetoTributarioService.findById(oTipoObjetoTributarioPK);
				
				if(oTipoObjetoTributario != null) {
					oObjetoTributarioDto.setTipoObjetoTributario(oTipoObjetoTributario.getDesTipObjTribu());
				}
				
				oObjetoTributarioDto.setDesObjTribu(aObjetoTributario.get(0).getDesObjTribu());
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String sFechaAlta = sdf.format(aObjetoTributario.get(0).getFecAlta());
				String sFechaMov = sdf.format(aObjetoTributario.get(0).getFecMovim());
				
				oObjetoTributarioDto.setFecAlta(sFechaAlta);
				oObjetoTributarioDto.setFecMovim(sFechaMov);
				
				if(aObjetoTributario.get(0).getCodMovim().equals("A")) {
					oObjetoTributarioDto.setCodMovim("ALTA");					
				}else if(aObjetoTributario.get(0).getCodMovim().equals("B")) {
					oObjetoTributarioDto.setCodMovim("BAJA");
				}else if(aObjetoTributario.get(0).getCodMovim().equals("M")) {
					oObjetoTributarioDto.setCodMovim("MODIFICACIÓN");
				}
				
				oObjetoTributarioDto.setNumDocum(oPersonaEntidad.getNumDocum());
				oObjetoTributarioDto.setDesPerEntid(oPersonaEntidad.getDesPerEntid());
				oObjetoTributarioDto.setDomFiscal(oPersonaEntidad.getDirPosta());
				oObjetoTributarioDto.setIdHisObjTribu(aObjetoTributario.get(0).getIdHisObjTribu());
				oObjetoTributarioDto.setIdObjTribu(aObjetoTributario.get(0).getIdObjTribu());
				
				oObjetoTributarioDto.setIdHisTipObjTribu(aObjetoTributario.get(0).getIdHisTipObjTribu());
				oObjetoTributarioDto.setIdTipObjTribu(aObjetoTributario.get(0).getIdTipObjTribu());
				
				oObjetoTributarioDto.setIdHisPerso(aObjetoTributario.get(0).getIdHisSujPasiv());
				oObjetoTributarioDto.setIdPerso(aObjetoTributario.get(0).getIdSujPasiv());
				
				if(aObjetoTributario.get(0).getObservaciones() != null) {
					oObjetoTributarioDto.setObservaciones(aObjetoTributario.get(0).getObservaciones());
				}
				
				if(aObjetoTributario.get(0).getIdHisDomic() != null && aObjetoTributario.get(0).getIdDomic() != null) {					
					DomicilioPK oDomicilioPK = new DomicilioPK();
					oDomicilioPK.setIdHisDomic(aObjetoTributario.get(0).getIdHisDomic());
					oDomicilioPK.setIdDomic(aObjetoTributario.get(0).getIdDomic());
					
					Domicilio oDomicilio = domicilioService.findById(oDomicilioPK);
					
					if(oDomicilio != null) {
						oObjetoTributarioDto.setDomObjTribu(oDomicilio.getDirPosta());
					}
				}
				
				if(aObjetoTributario.get(0).getIdHisDomBanca() != null && aObjetoTributario.get(0).getIdDomBanca() != null) {
					DomiciliacionBancariaPK oDomiciliacionBancariaPK = new DomiciliacionBancariaPK();
					oDomiciliacionBancariaPK.setIdHisDomBanca(aObjetoTributario.get(0).getIdHisDomBanca());
					oDomiciliacionBancariaPK.setIdDomBanca(aObjetoTributario.get(0).getIdDomBanca());
					
					DomiciliacionBancaria oDomiciliacionBancaria = domiciliacionBancariaService.findById(oDomiciliacionBancariaPK);
					
					if(oDomiciliacionBancaria != null) {
						oObjetoTributarioDto.setDomBanca(oDomiciliacionBancaria.getIban());
					}
				}
			}else {
				throw new NoDataFoundException();
			}
		}
		
		return oObjetoTributarioDto;
		
	}

}
