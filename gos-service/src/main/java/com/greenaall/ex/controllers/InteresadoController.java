package com.greenaall.ex.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.ErrorBorradoException;
import com.greenaall.exception.InteresadoExistenteException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dto.InteresadoDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.pe.dto.PersonaEntidadDto;
import com.greenaall.pe.util.PersonaEntidadValide;

/**
*
* @author jmmoyano
*/

@RestController
public class InteresadoController {
	
	@Autowired
    private InteresadoServiceImpl service;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
    private PersonaEntidadServiceImpl servicePersonaEntidad;
	
	@Autowired
	private ProvinciaServiceImpl serviceProvincia;
	
	@Autowired
	private MunicipioServiceImpl serviceMuncipio;
	
	@PostMapping("/interesado/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Interesado crear(@RequestBody Interesado interesado) {
		List<Interesado> oInteresado = service.findByExpedienteAndIdHisPerso(interesado.getExpediente(), interesado.getIdHisPerso());
		if(oInteresado != null && !oInteresado.isEmpty()) {
			throw new InteresadoExistenteException();	
		}
		
		interesado.setFecContr(new java.util.Date());
		return service.save(interesado);
	}
	
	@GetMapping("/interesadoExp/ver/{idExped}")
	public InteresadoDto interesadoExp(@PathVariable Long idExped) {
		
		Interesado oInteresado = service.findByExpedienteAndPrincipal(idExped);
		InteresadoDto oInteresadoDto = new InteresadoDto();
		if(oInteresado != null) {
			oInteresadoDto.setExpediente(oInteresado.getExpediente());
			Expediente expediente = serviceExpediente.findById(oInteresado.getExpediente());
			if(expediente != null) {
				oInteresadoDto.setEjeExped(expediente.getEjercicio());
				oInteresadoDto.setNumExped(expediente.getNumero());
			}
			oInteresadoDto.setEmailNotif(oInteresado.getEmailNotif());
			oInteresadoDto.setTipForNotif(oInteresado.getForNotif());
			if(oInteresado.getForNotif() == Short.valueOf((short)0)) {
				oInteresadoDto.setForNotif("CORREO POSTAL");
			}else {
				oInteresadoDto.setForNotif("TELEMÁTICO");
			}
			oInteresadoDto.setId(oInteresado.getId());	
			if(oInteresado.getIdDomNotif() != null) {
				oInteresadoDto.setIdDomNotif(oInteresado.getIdDomNotif());
			}
			if(oInteresado.getIdHisDomNotif() != null) {
				oInteresadoDto.setIdHisDomNotif(oInteresado.getIdHisDomNotif());
			}
			if(oInteresado.getIdHisRepre() != null) {
				oInteresadoDto.setIdHisRepre(oInteresado.getIdHisRepre());
			}
			if(oInteresado.getIdRepre() != null) {
				oInteresadoDto.setIdRepre(oInteresado.getIdRepre());
			}
			oInteresadoDto.setPrincipal(oInteresado.getPrincipal());
			if(oInteresado.getIdHisPerso() != null && oInteresado.getIdPerso() != null) {
				PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
				oPersonaEntidadPK.setIdHisPerso(oInteresado.getIdHisPerso());
				oPersonaEntidadPK.setIdPerso(oInteresado.getIdPerso());
				PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
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
					}
					oInteresadoDto.setPerEntid(oPersonaEntidadDto);
				}
			}		
		}
		return oInteresadoDto;
		
	}
	
	@GetMapping("/interesado/ver/{id}")
	public InteresadoDto detalle(@PathVariable Long id) {
		Interesado oInteresado = service.findById(id);
		InteresadoDto oInteresadoDto = new InteresadoDto();
		if(oInteresado != null) {
			oInteresadoDto.setExpediente(oInteresado.getExpediente());
			Expediente expediente = serviceExpediente.findById(oInteresado.getExpediente());
			if(expediente != null) {
				oInteresadoDto.setEjeExped(expediente.getEjercicio());
				oInteresadoDto.setNumExped(expediente.getNumero());
			}
			oInteresadoDto.setEmailNotif(oInteresado.getEmailNotif());
			oInteresadoDto.setTipForNotif(oInteresado.getForNotif());
			if(oInteresado.getForNotif() == Short.valueOf((short)0)) {
				oInteresadoDto.setForNotif("CORREO POSTAL");
			}else {
				oInteresadoDto.setForNotif("TELEMÁTICO");
			}
			oInteresadoDto.setId(oInteresado.getId());	
			if(oInteresado.getIdDomNotif() != null) {
				oInteresadoDto.setIdDomNotif(oInteresado.getIdDomNotif());
			}
			if(oInteresado.getIdHisDomNotif() != null) {
				oInteresadoDto.setIdHisDomNotif(oInteresado.getIdHisDomNotif());
			}
			if(oInteresado.getIdHisRepre() != null) {
				oInteresadoDto.setIdHisRepre(oInteresado.getIdHisRepre());
			}
			if(oInteresado.getIdRepre() != null) {
				oInteresadoDto.setIdRepre(oInteresado.getIdRepre());
			}
			oInteresadoDto.setPrincipal(oInteresado.getPrincipal());
			if(oInteresado.getIdHisPerso() != null && oInteresado.getIdPerso() != null) {
				PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
				oPersonaEntidadPK.setIdHisPerso(oInteresado.getIdHisPerso());
				oPersonaEntidadPK.setIdPerso(oInteresado.getIdPerso());
				PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
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
					}
					oInteresadoDto.setPerEntid(oPersonaEntidadDto);
				}
			}		
		}
		return oInteresadoDto;
	}
	
	@GetMapping("/interesado/listar/{idExped}")
	public List<InteresadoDto> listarPorExpediente(@PathVariable Long idExped) {
		List<Interesado> aInteresado = service.findByExpediente(idExped);
		List<InteresadoDto> aInteresadoDto = new ArrayList<InteresadoDto>();
		if(aInteresado.isEmpty() || aInteresado == null) {
			 throw new NoDataFoundException();
		}
		
		for(int i = 0; i < aInteresado.size(); i++) {
			InteresadoDto oInteresadoDto = new InteresadoDto();
			Expediente expediente = serviceExpediente.findById(aInteresado.get(i).getExpediente());
			if(expediente != null) {
				oInteresadoDto.setEjeExped(expediente.getEjercicio());
				oInteresadoDto.setNumExped(expediente.getNumero());
			}
			
			if(aInteresado.get(i).getEmailNotif() != null) {
				oInteresadoDto.setEmailNotif(aInteresado.get(i).getEmailNotif());
			}
			
			if(aInteresado.get(i).getExpediente() != null) {
				oInteresadoDto.setExpediente(aInteresado.get(i).getExpediente());
			}
			
			if(aInteresado.get(i).getId() != null) {
				oInteresadoDto.setId(aInteresado.get(i).getId());
			}
			
			if(aInteresado.get(i).getIdDomNotif() != null) {
				oInteresadoDto.setIdDomNotif(aInteresado.get(i).getIdDomNotif());
			}
			
			if(aInteresado.get(i).getIdHisDomNotif() != null) {
				oInteresadoDto.setIdHisDomNotif(aInteresado.get(i).getIdHisDomNotif());
			}
			
			if(aInteresado.get(i).getIdHisRepre() != null) {
				oInteresadoDto.setIdHisRepre(aInteresado.get(i).getIdHisRepre());
			}
			
			if(aInteresado.get(i).getIdRepre() != null) {
				oInteresadoDto.setIdRepre(aInteresado.get(i).getIdRepre());
			}
			
			if(aInteresado.get(i).getPrincipal() > 0) {
				oInteresadoDto.setPrincipal(aInteresado.get(i).getPrincipal());
			}
			
			if(aInteresado.get(i).getForNotif() > 0) {
				oInteresadoDto.setTipForNotif(aInteresado.get(i).getForNotif());
			}
			
			if(aInteresado.get(i).getForNotif() == Short.valueOf((short)0)) {
				oInteresadoDto.setForNotif("CORREO POSTAL");
			}else {
				oInteresadoDto.setForNotif("TELEMÁTICO");
			}
			
			if(aInteresado.get(i).getIdHisPerso() != null && aInteresado.get(i).getIdPerso() != null) {
				PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
				oPersonaEntidadPK.setIdHisPerso(aInteresado.get(i).getIdHisPerso());
				oPersonaEntidadPK.setIdPerso(aInteresado.get(i).getIdPerso());
				PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
				if(oPersonaEntidad != null) {
					PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
					if(oPersonaEntidad.getCodProvi() > 0) {
						Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
						Provincia oProvincia = serviceProvincia.findById(codProvi);
						if(oProvincia != null) {
							oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
							oInteresadoDto.setDesProviInter(oProvincia.getDesProvi());
						}
						if(oPersonaEntidad.getCodMunic() > 0) {
							MunicipioPK MunicipioPK = new MunicipioPK();
							MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
							MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
							Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
							if(oMunicipio != null) {
								oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
								oInteresadoDto.setDesMunicInter(oMunicipio.getDesMunic());
							}
						}
					}
					oInteresadoDto.setPerEntid(oPersonaEntidadDto);
					oInteresadoDto.setNumDocumInter(oPersonaEntidadDto.getNumDocum());
					oInteresadoDto.setNomInter(oPersonaEntidadDto.getDesPerEntid());
					oInteresadoDto.setDirInter(oPersonaEntidadDto.getDirPosta());
				}
			}
			
			if(aInteresado.get(i).getIdHisRepre() != null && aInteresado.get(i).getIdRepre() != null) {
				PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
				oPersonaEntidadPK.setIdHisPerso(aInteresado.get(i).getIdHisRepre());
				oPersonaEntidadPK.setIdPerso(aInteresado.get(i).getIdRepre());
				PersonaEntidad oPersonaEntidadRepre = servicePersonaEntidad.findById(oPersonaEntidadPK);
				if(oPersonaEntidadRepre != null) {				
					if(oPersonaEntidadRepre.getCodProvi() > 0) {
						Long codProvi = Long.valueOf(oPersonaEntidadRepre.getCodProvi());
						Provincia oProvincia = serviceProvincia.findById(codProvi);
						if(oProvincia != null) {
							oInteresadoDto.setDesProviRepre(oProvincia.getDesProvi());
						}
						if(oPersonaEntidadRepre.getCodMunic() > 0) {
							MunicipioPK MunicipioPK = new MunicipioPK();
							MunicipioPK.setCodProvi(oPersonaEntidadRepre.getCodProvi());
							MunicipioPK.setCodMunic(oPersonaEntidadRepre.getCodMunic());
							Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
							if(oMunicipio != null) {
								oInteresadoDto.setDesMunicRepre(oMunicipio.getDesMunic());
							}
						}
					}
					oInteresadoDto.setNumDocumRepre(oPersonaEntidadRepre.getNumDocum());
					oInteresadoDto.setNomRepre(oPersonaEntidadRepre.getDesPerEntid());
					oInteresadoDto.setDirRepre(oPersonaEntidadRepre.getDirPosta());
				}
			}
			aInteresadoDto.add(oInteresadoDto);
		}
		
		return aInteresadoDto;
	}
	
	@DeleteMapping("/interesado/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		Interesado oInteresado = service.findById(id);
		if (oInteresado == null) {
	    	  throw new NoDataFoundException();	  
		}
		if(oInteresado.getPrincipal() == Short.valueOf((short)1)) {
			throw new ErrorBorradoException();
		}
		service.deleteById(id);  	
    }

}
