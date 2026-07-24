package com.greenaall.pe.controllers;

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

import com.greenaall.models.pe.entity.PersonaContacto;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.service.IPersonaEntidadService;
import com.greenaall.models.pe.service.PersonaContactoServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.pe.dto.PersonaEntidadDto;
import com.greenaall.pe.util.PersonaEntidadValide;


@RestController
public class PersonaEntidadController {
	
	@Autowired
	private IPersonaEntidadService personaEntidadService;
	
	@Autowired
	private ProvinciaServiceImpl serviceProvincia;
	
	@Autowired
	private MunicipioServiceImpl serviceMuncipio;
	
	@Autowired
	private PersonaContactoServiceImpl servicePersonaContacto;
	
	@GetMapping("/personaEntidad/ver/{numDocum}")
	public PersonaEntidadDto detalle(@PathVariable String numDocum){
		
		PersonaEntidad oPersonaEntidad =  personaEntidadService.findByNumDocum(numDocum);
		
		if(oPersonaEntidad != null) {
			PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
			if(oPersonaEntidad.getCodProvi() > 0) {
				Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
				Provincia oProvincia = serviceProvincia.findById(codProvi);
				if(oProvincia != null) {
					oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
				}
				if(oPersonaEntidad.getCodMunic() > 0) {
					MunicipioPK MunicipioPK = new MunicipioPK();
					MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
					MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
					Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
					if(oMunicipio != null) {
						oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
						oPersonaEntidadDto.setCodMunic(String.valueOf(oPersonaEntidad.getCodMunic()));
						oPersonaEntidadDto.setCodProvi(String.valueOf(oPersonaEntidad.getCodProvi()));
					}
				}
				
				List<PersonaContacto> aContacto = servicePersonaContacto
						.findByIdHisPersoAndIdPerso(oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
				if (aContacto != null) {
					for (int h = 0; h < aContacto.size(); h++) {
						if (aContacto.get(h).getTipConta() != null
								&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 4))
								&& aContacto.get(h).getDatConta() != null) {
							oPersonaEntidadDto.setEmail( aContacto.get(h).getDatConta());
						}
						if (aContacto.get(h).getTipConta() != null
								&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 1))
								&& aContacto.get(h).getDatConta() != null) {
							oPersonaEntidadDto.setTelFijo(aContacto.get(h).getDatConta());

						}
						if (aContacto.get(h).getTipConta() != null
								&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 2))
								&& aContacto.get(h).getDatConta() != null) {
							oPersonaEntidadDto.setTelMovil(aContacto.get(h).getDatConta());

						}
					}
				}
								
				return oPersonaEntidadDto;
			}
		
		}
		return null;
	}
	
	@PutMapping("/personaEntidad/editar")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaEntidadDto editar(@RequestBody PersonaEntidadDto oPersonaEntidadDto) {
		
		PersonaEntidad oPersonaEntidad =  personaEntidadService.findByNumDocum(oPersonaEntidadDto.getNumDocum());
		String nombre = null;
		if(oPersonaEntidad != null) {
			
			if(oPersonaEntidadDto.getApellido1() != null) {
				oPersonaEntidad.setApellido1(oPersonaEntidadDto.getApellido1());
			}
			
			if(oPersonaEntidadDto.getApellido2() != null) {
				oPersonaEntidad.setApellido2(oPersonaEntidadDto.getApellido2());
			}
			
			if(oPersonaEntidadDto.getCodPosta() > 0) {
				oPersonaEntidad.setCodPosta(oPersonaEntidadDto.getCodPosta());
			}
			
			if(oPersonaEntidadDto.getDirPosta() != null) {
				oPersonaEntidad.setDirPosta(oPersonaEntidadDto.getDirPosta());
			}
			
			if(oPersonaEntidadDto.getLocalidad() != null) {
				oPersonaEntidad.setLocalidad(oPersonaEntidadDto.getLocalidad());
			}
			
			if(oPersonaEntidadDto.getCodMunic() != null) {
				oPersonaEntidad.setCodMunic(Short.valueOf(oPersonaEntidadDto.getCodMunic()));
			}
			
			if(oPersonaEntidadDto.getCodProvi() != null) {
				oPersonaEntidad.setCodProvi(Short.valueOf(oPersonaEntidadDto.getCodProvi()));
			}
			
			if(oPersonaEntidadDto.getNombre() != null) {
				oPersonaEntidad.setNombre(oPersonaEntidadDto.getNombre());
			}
			
			if(oPersonaEntidadDto.getNumDocum() != null) {
				oPersonaEntidad.setNumDocum(oPersonaEntidadDto.getNumDocum());
			}
			
			if(oPersonaEntidadDto.getApellido1() != null && oPersonaEntidadDto.getApellido2() != null && oPersonaEntidadDto.getNombre() != null) {
				nombre = oPersonaEntidadDto.getApellido1() + " " + oPersonaEntidadDto.getApellido2() + ", " + oPersonaEntidadDto.getNombre();
			}else if(oPersonaEntidadDto.getApellido1() != null && oPersonaEntidadDto.getApellido2() == null && oPersonaEntidadDto.getNombre() != null) {
				nombre = oPersonaEntidadDto.getApellido1() + ", " + oPersonaEntidadDto.getNombre();
			}
			if(oPersonaEntidadDto.getRazSocia() != null) {
				oPersonaEntidad.setRazSocia(oPersonaEntidadDto.getRazSocia());
				oPersonaEntidad.setDesPerEntid(oPersonaEntidadDto.getRazSocia());
			}else {
				oPersonaEntidad.setDesPerEntid(nombre);
			}
			
			personaEntidadService.save(oPersonaEntidad);
			
			List<PersonaContacto> aContacto = servicePersonaContacto
					.findByIdHisPersoAndIdPerso(oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
			
			if(aContacto != null && !aContacto.isEmpty()) {
				for (int h = 0; h < aContacto.size(); h++) {
					if (aContacto.get(h).getTipConta() != null
							&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 4))
							&& aContacto.get(h).getDatConta() != null
							&& oPersonaEntidadDto.getEmail() != null) {
						aContacto.get(h).setDatConta(oPersonaEntidadDto.getEmail());
						servicePersonaContacto.save(aContacto.get(h));
					}
					if (aContacto.get(h).getTipConta() != null
							&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 1))
							&& aContacto.get(h).getDatConta() != null
							&& oPersonaEntidadDto.getTelFijo() != null) {
						aContacto.get(h).setDatConta(oPersonaEntidadDto.getTelFijo());
						servicePersonaContacto.save(aContacto.get(h));
					}else {
						
					}
					if (aContacto.get(h).getTipConta() != null
							&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 2))
							&& aContacto.get(h).getDatConta() != null
							&& oPersonaEntidadDto.getTelMovil() != null) {
						aContacto.get(h).setDatConta(oPersonaEntidadDto.getTelMovil());
						servicePersonaContacto.save(aContacto.get(h));
					}
				}
			}else {
				if(oPersonaEntidadDto.getEmail() != null) {
					PersonaContacto oPersonaContactoNueva = new PersonaContacto();
					oPersonaContactoNueva.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
					oPersonaContactoNueva.setIdPerso(oPersonaEntidad.getIdPerso());
					oPersonaContactoNueva.setNumOrden(Short.valueOf((short) 1));
					oPersonaContactoNueva.setTipConta(Short.valueOf((short) 4));
					oPersonaContactoNueva.setDatConta(oPersonaEntidadDto.getEmail());
					oPersonaContactoNueva.setRecNotif(Short.valueOf((short) 0));
					oPersonaContactoNueva.setObservaciones("Dato procedente de iflow");
					oPersonaContactoNueva.setUsuContr(oPersonaEntidadDto.getUsuContr());
					oPersonaContactoNueva.setFecContr(new Date());
					servicePersonaContacto.save(oPersonaContactoNueva);
				}
				
				if(oPersonaEntidadDto.getTelFijo() != null) {
					PersonaContacto oPersonaContactoNueva = new PersonaContacto();
					oPersonaContactoNueva.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
					oPersonaContactoNueva.setIdPerso(oPersonaEntidad.getIdPerso());
					oPersonaContactoNueva.setNumOrden(Short.valueOf((short) 2));
					oPersonaContactoNueva.setTipConta(Short.valueOf((short) 1));
					oPersonaContactoNueva.setDatConta(oPersonaEntidadDto.getTelFijo());
					oPersonaContactoNueva.setRecNotif(Short.valueOf((short) 0));
					oPersonaContactoNueva.setObservaciones("Dato procedente de iflow");
					oPersonaContactoNueva.setUsuContr(oPersonaEntidadDto.getUsuContr());
					oPersonaContactoNueva.setFecContr(new Date());
					servicePersonaContacto.save(oPersonaContactoNueva);
				}
				
				if(oPersonaEntidadDto.getTelMovil() != null) {
					PersonaContacto oPersonaContactoNueva = new PersonaContacto();
					oPersonaContactoNueva.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
					oPersonaContactoNueva.setIdPerso(oPersonaEntidad.getIdPerso());
					oPersonaContactoNueva.setNumOrden(Short.valueOf((short) 3));
					oPersonaContactoNueva.setTipConta(Short.valueOf((short) 2));
					oPersonaContactoNueva.setDatConta(oPersonaEntidadDto.getTelMovil());
					oPersonaContactoNueva.setRecNotif(Short.valueOf((short) 0));
					oPersonaContactoNueva.setObservaciones("Dato procedente de iflow");
					oPersonaContactoNueva.setUsuContr(oPersonaEntidadDto.getUsuContr());
					oPersonaContactoNueva.setFecContr(new Date());
					servicePersonaContacto.save(oPersonaContactoNueva);
				}
			}
			
			boolean existeTel = false;
			boolean existeMov = false;
			boolean existeEmail = false;
			for (int h = 0; h < aContacto.size(); h++) {
				if(aContacto.get(h).getTipConta() != null 
						&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 1))) {
					existeTel = true;
				}
				if(aContacto.get(h).getTipConta() != null 
						&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 4))) {
					existeEmail = true;
				}
				if(aContacto.get(h).getTipConta() != null 
						&& aContacto.get(h).getTipConta().equals(Short.valueOf((short) 2))) {
					existeMov = true;
				}
			}
			
			if(!existeTel && oPersonaEntidadDto.getTelFijo() != null) {
				PersonaContacto oPersonaContactoNueva = new PersonaContacto();
				oPersonaContactoNueva.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
				oPersonaContactoNueva.setIdPerso(oPersonaEntidad.getIdPerso());
				oPersonaContactoNueva.setNumOrden(Short.valueOf((short) 2));
				oPersonaContactoNueva.setTipConta(Short.valueOf((short) 1));
				oPersonaContactoNueva.setDatConta(oPersonaEntidadDto.getTelFijo());
				oPersonaContactoNueva.setRecNotif(Short.valueOf((short) 0));
				oPersonaContactoNueva.setObservaciones("Dato procedente de iflow");
				oPersonaContactoNueva.setUsuContr(oPersonaEntidadDto.getUsuContr());
				oPersonaContactoNueva.setFecContr(new Date());
				servicePersonaContacto.save(oPersonaContactoNueva);
			}
			
			if(!existeEmail && oPersonaEntidadDto.getEmail() != null) {
				PersonaContacto oPersonaContactoNueva = new PersonaContacto();
				oPersonaContactoNueva.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
				oPersonaContactoNueva.setIdPerso(oPersonaEntidad.getIdPerso());
				oPersonaContactoNueva.setNumOrden(Short.valueOf((short) 1));
				oPersonaContactoNueva.setTipConta(Short.valueOf((short) 4));
				oPersonaContactoNueva.setDatConta(oPersonaEntidadDto.getEmail());
				oPersonaContactoNueva.setRecNotif(Short.valueOf((short) 0));
				oPersonaContactoNueva.setObservaciones("Dato procedente de iflow");
				oPersonaContactoNueva.setUsuContr(oPersonaEntidadDto.getUsuContr());
				oPersonaContactoNueva.setFecContr(new Date());
				servicePersonaContacto.save(oPersonaContactoNueva);
			}
			
			if(!existeMov && oPersonaEntidadDto.getTelMovil() != null) {
				PersonaContacto oPersonaContactoNueva = new PersonaContacto();
				oPersonaContactoNueva.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
				oPersonaContactoNueva.setIdPerso(oPersonaEntidad.getIdPerso());
				oPersonaContactoNueva.setNumOrden(Short.valueOf((short) 3));
				oPersonaContactoNueva.setTipConta(Short.valueOf((short) 2));
				oPersonaContactoNueva.setDatConta(oPersonaEntidadDto.getTelMovil());
				oPersonaContactoNueva.setRecNotif(Short.valueOf((short) 0));
				oPersonaContactoNueva.setObservaciones("Dato procedente de iflow");
				oPersonaContactoNueva.setUsuContr(oPersonaEntidadDto.getUsuContr());
				oPersonaContactoNueva.setFecContr(new Date());
				servicePersonaContacto.save(oPersonaContactoNueva);
			}
		}
		
		return oPersonaEntidadDto;
	}
}
