package com.greenaall.pe.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.entity.PersonaRepresentante;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.pe.service.PersonaRepresentanteServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.pe.dto.PersonaEntidadDto;
import com.greenaall.pe.util.PersonaEntidadValide;

@RestController
public class PersonaRepresentateController {

	@Autowired
    private PersonaRepresentanteServiceImpl service;
	
	@Autowired
    private PersonaEntidadServiceImpl servicePersona;
	
	@Autowired
	private ProvinciaServiceImpl serviceProvincia;
	
	@Autowired
	private MunicipioServiceImpl serviceMuncipio;
	
	@GetMapping("/personaRepresentante/listar/{idPerso}/{idHisPerso}")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaEntidadDto listar(@PathVariable Long idPerso, @PathVariable Long idHisPerso) throws Exception{
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaComoCadena = sdf.format(new Date());*/
		List<PersonaRepresentante> aPersonaRepresentante = service.findByIdPersoAndIdHisPerso(idPerso, idHisPerso);
		
		if( aPersonaRepresentante == null || aPersonaRepresentante.isEmpty()) {
			 throw new NoDataFoundException();
		}
		List<PersonaEntidadDto> aPersonaEntidadDto = new ArrayList<PersonaEntidadDto>();
		for(int i = 0; i < aPersonaRepresentante.size(); i++) {
			PersonaEntidadPK oPersonaEntidadPk = new PersonaEntidadPK();
			oPersonaEntidadPk.setIdHisPerso(aPersonaRepresentante.get(i).getIdHisPerRepre());
			oPersonaEntidadPk.setIdPerso(aPersonaRepresentante.get(i).getIdPerRepre() );
			PersonaEntidad oPersonaEntidad = servicePersona.findById(oPersonaEntidadPk);
			
			if( oPersonaEntidad == null) {
				 throw new NoDataFoundException();
			}
			
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
						}
					}
					aPersonaEntidadDto.add(oPersonaEntidadDto);
				}
			}
		}
		return aPersonaEntidadDto.get(0);	
	}
}
