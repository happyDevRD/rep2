package com.greenaall.pe.util;

import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.pe.dto.PersonaEntidadDto;

public class PersonaEntidadValide {


	public static PersonaEntidadDto getPersonaDto(PersonaEntidad oPersonaEntidad) {
		PersonaEntidadDto oPersonaEntidadDto = new PersonaEntidadDto();
			
		if(oPersonaEntidad.getApellido1() != null) {
			oPersonaEntidadDto.setApellido1(oPersonaEntidad.getApellido1());
		}
		
		if(oPersonaEntidad.getApellido2() != null) {
			oPersonaEntidadDto.setApellido2(oPersonaEntidad.getApellido2());
		}
		
		if(oPersonaEntidad.getCodPosta() > 0) {
			oPersonaEntidadDto.setCodPosta(oPersonaEntidad.getCodPosta());
		}
		
		if(oPersonaEntidad.getDesPerEntid() != null) {
			oPersonaEntidadDto.setDesPerEntid(oPersonaEntidad.getDesPerEntid());
		}
		
		if(oPersonaEntidad.getDirPosta() != null) {
			oPersonaEntidadDto.setDirPosta(oPersonaEntidad.getDirPosta());
		}
		
		if(oPersonaEntidad.getIdHisPerso() != null) {
			oPersonaEntidadDto.setIdHisPerso(oPersonaEntidad.getIdHisPerso());
		}
		
		if(oPersonaEntidad.getIdPerso() != null) {
			oPersonaEntidadDto.setIdPerso(oPersonaEntidad.getIdPerso());
		}
		
		if(oPersonaEntidad.getLocalidad() != null) {
			oPersonaEntidadDto.setLocalidad(oPersonaEntidad.getLocalidad());
		}
		
		if(oPersonaEntidad.getNombre() != null) {
			oPersonaEntidadDto.setNombre(oPersonaEntidad.getNombre());
		}
		
		if(oPersonaEntidad.getNumDocum() != null) {
			oPersonaEntidadDto.setNumDocum(oPersonaEntidad.getNumDocum());
		}
		
		if(oPersonaEntidad.getParticula1() != null) {
			oPersonaEntidadDto.setParticula1(oPersonaEntidad.getParticula1());
		}
		
		if(oPersonaEntidad.getParticula2() != null) {
			oPersonaEntidadDto.setParticula2(oPersonaEntidad.getParticula2());
		}
		
		if(oPersonaEntidad.getRazSocia() != null) {
			oPersonaEntidadDto.setRazSocia(oPersonaEntidad.getRazSocia());
		}
		
		if(oPersonaEntidad.getRazSocReduc() != null) {
			oPersonaEntidadDto.setRazSocReduc(oPersonaEntidad.getRazSocReduc());
		}
		
		if(oPersonaEntidad.getTipPerso() >= 0) {
			if(oPersonaEntidad.getTipPerso() == 0) {
				oPersonaEntidadDto.setTipPerso("Sin Tipo / Sin Documento");
			}else if(oPersonaEntidad.getTipPerso() == 1) {
				oPersonaEntidadDto.setTipPerso("Física");
			}else if(oPersonaEntidad.getTipPerso() == 2) {
				oPersonaEntidadDto.setTipPerso("Jurídica");
			}else if(oPersonaEntidad.getTipPerso() == 3) {
				oPersonaEntidadDto.setTipPerso("Administración");
			}else if(oPersonaEntidad.getTipPerso() == 4) {
				oPersonaEntidadDto.setTipPerso("Extranjero / Tarjeta Residencia");
			}else if(oPersonaEntidad.getTipPerso() == 5) {
				oPersonaEntidadDto.setTipPerso("Extranjero / Pasaporte");
			}
		}
		
		return oPersonaEntidadDto;
	}
}
