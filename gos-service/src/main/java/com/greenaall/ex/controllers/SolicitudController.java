package com.greenaall.ex.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.ErrorBorradoProcedimientoException;
import com.greenaall.exception.ErrorEnvioEmail;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dto.SolicitudDto;
import com.greenaall.models.ex.dto.SolicitudPersonaDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.SolicitudServiceImpl;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.models.ge.entity.UsuarioValor;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.ge.service.UsuarioServiceImpl;
import com.greenaall.models.ge.service.UsuarioValorServiceImpl;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.entity.PersonaRepresentante;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.pe.service.PersonaRepresentanteServiceImpl;
import com.greenaall.models.rd.entity.RdDocumento;
import com.greenaall.models.rd.service.RdDocumentoServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.pe.dto.PersonaEntidadDto;
import com.greenaall.pe.util.PersonaEntidadValide;
import com.greenaall.util.Utiles;

/**
 *
 * @author jmmoyano
 */

@RestController
public class SolicitudController {

	@Autowired
	private SolicitudServiceImpl service;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private RdDocumentoServiceImpl serviceRdDocumento;

	@Autowired
	private UsuarioServiceImpl serviceUsuario;

	@Autowired
	private UsuarioValorServiceImpl serviceUsuarioValor;

	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private PersonaRepresentanteServiceImpl personaRepresentateService;

	@PostMapping("/solicitud/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Solicitud crear(@RequestBody SolicitudPersonaDto solicitud) {
		BigDecimal max = service.max(solicitud.getEjercicio());
		PersonaEntidad oPersonaNueva = null;
		PersonaEntidad oPersonaRespresentanteNueva = null;
		Solicitud oSolicitudNueva = new Solicitud();

		oSolicitudNueva.setAsunto(solicitud.getAsunto());
		oSolicitudNueva.setDepartamento(solicitud.getDepartamento());
		oSolicitudNueva.setEjercicio(solicitud.getEjercicio());
		oSolicitudNueva.setEstado(solicitud.getEstado());
		oSolicitudNueva.setFecInicio(solicitud.getFecInicio());
		oSolicitudNueva.setFecContr(new Date());
		oSolicitudNueva.setUsuario(solicitud.getUsuario());
		oSolicitudNueva.setUsuContr(solicitud.getUsuContr());

		if (solicitud.getIdHisPerso() != null) {
			oSolicitudNueva.setIdHisPerso(solicitud.getIdHisPerso());
		}

		if (solicitud.getIdPerso() != null) {

			oSolicitudNueva.setIdPerso(solicitud.getIdPerso());
		}

		if (solicitud.getIdHisRepre() != null) {
			oSolicitudNueva.setIdHisRepre(solicitud.getIdHisRepre());
		}

		if (solicitud.getIdRepre() != null) {
			oSolicitudNueva.setIdRepre(solicitud.getIdRepre());
		}

		if (max != null) {
			max = max.add(new BigDecimal("1"));
		} else {
			max = new BigDecimal("1");
		}

		if (solicitud.getNumDocum() != null && solicitud.getIdHisPerso() == null) {
			oPersonaNueva = new PersonaEntidad();
			oPersonaNueva.setFecContr(new Date());
			oPersonaNueva.setFecMovim(new Date());
			oPersonaNueva.setCodMovim("A");
			oPersonaNueva.setCauMovim(Short.valueOf((short) 1));
			oPersonaNueva.setRegActiv(true);
			oPersonaNueva.setNivAcces(Short.valueOf((short) 0));
			oPersonaNueva.setDomCodif(false);
			oPersonaNueva.setExtInfNumer(Short.valueOf((short) 0));
			oPersonaNueva.setExtSupNumer(Short.valueOf((short) 0));
			BigDecimal maxPersona = servicePersonaEntidad.max();
			if (maxPersona == null) {
				maxPersona = new BigDecimal("1");
			} else {
				maxPersona = maxPersona.add(new BigDecimal("1"));
			}
			oPersonaNueva.setIdPerso(maxPersona.longValue());
			oPersonaNueva.setIdHisPerso(maxPersona.longValue());
			if (solicitud.getUsuario() != null) {
				oPersonaNueva.setUsuContr(solicitud.getUsuario());
			}
			if (solicitud.getApellido1() != null) {
				oPersonaNueva.setApellido1(solicitud.getApellido1());
			}

			if (solicitud.getApellido2() != null) {
				oPersonaNueva.setApellido2(solicitud.getApellido2());
			}

			if (solicitud.getNombre() != null) {
				oPersonaNueva.setNombre(solicitud.getNombre());
			}

			if (solicitud.getNumDocum() != null) {
				oPersonaNueva.setNumDocum(solicitud.getNumDocum());
			}

			if (solicitud.getTipPerso() != null) {
				oPersonaNueva.setTipPerso(solicitud.getTipPerso());
			}

			if (solicitud.getApellido1() != null && solicitud.getApellido2() != null && solicitud.getNombre() != null) {
				String persona = solicitud.getApellido1() + " " + solicitud.getApellido2() + " "
						+ solicitud.getNombre();
				oPersonaNueva.setDesPerEntid(persona);
			}
			if (solicitud.getApellido1() != null && solicitud.getApellido2() == null && solicitud.getNombre() != null) {
				String persona = solicitud.getApellido1() + " " + solicitud.getNombre();
				oPersonaNueva.setDesPerEntid(persona);
			}

			if (solicitud.getRazSocia() != null) {
				oPersonaNueva.setRazSocia(solicitud.getRazSocia());
				oPersonaNueva.setDesPerEntid(solicitud.getRazSocia());
			}

			if (solicitud.getDirPosta() != null) {
				oPersonaNueva.setDirPosta(solicitud.getDirPosta());
			}

			if (solicitud.getCodPosta() != 0) {
				oPersonaNueva.setCodPosta(solicitud.getCodPosta());
			}

			if (solicitud.getCodProvi() != null && solicitud.getCodProvi() > 0) {
				oPersonaNueva.setCodProvi(solicitud.getCodProvi());
			}

			if (solicitud.getCodMunic() != null && solicitud.getCodMunic() > 0) {
				String stringValue = Short.toString(solicitud.getCodMunic());
				stringValue = stringValue.substring(stringValue.length() - 3);
				Short myShort = Short.valueOf(stringValue);
				oPersonaNueva.setCodMunic(myShort);
			}

			oPersonaNueva = servicePersonaEntidad.save(oPersonaNueva);
			
			oPersonaNueva = servicePersonaEntidad.findByNumDocum(solicitud.getNumDocum());
					
			solicitud.setIdHisPerso(oPersonaNueva.getIdHisPerso());
			solicitud.setIdPerso(oPersonaNueva.getIdPerso());
		}

		if (solicitud.getIdHisRepre() != null) {
			PersonaEntidad oPersona = servicePersonaEntidad.findByIdHisPerso(solicitud.getIdHisRepre());
			if (oPersona != null) {
				solicitud.setIdHisRepre(oPersona.getIdHisPerso());
				solicitud.setIdRepre(oPersona.getIdPerso());
			}
		} else if (solicitud.getNumDocumRepre() != null) {
			oPersonaRespresentanteNueva = new PersonaEntidad();
			oPersonaRespresentanteNueva.setFecContr(new Date());
			oPersonaRespresentanteNueva.setFecMovim(new Date());
			oPersonaRespresentanteNueva.setCodMovim("A");
			oPersonaRespresentanteNueva.setCauMovim(Short.valueOf((short) 1));
			oPersonaRespresentanteNueva.setRegActiv(true);
			oPersonaRespresentanteNueva.setNivAcces(Short.valueOf((short) 0));
			oPersonaRespresentanteNueva.setDomCodif(false);
			oPersonaRespresentanteNueva.setExtInfNumer(Short.valueOf((short) 0));
			oPersonaRespresentanteNueva.setExtSupNumer(Short.valueOf((short) 0));
			BigDecimal maxPersona = servicePersonaEntidad.max();
			if (maxPersona == null) {
				maxPersona = new BigDecimal("1");
			} else {
				maxPersona = maxPersona.add(new BigDecimal("1"));
			}
			oPersonaRespresentanteNueva.setIdPerso(maxPersona.longValue());
			oPersonaRespresentanteNueva.setIdHisPerso(maxPersona.longValue());

			if (solicitud.getUsuContr() != null) {
				oPersonaRespresentanteNueva.setUsuContr(solicitud.getUsuContr());
			}
			if (solicitud.getApellido1Repre() != null) {
				oPersonaRespresentanteNueva.setApellido1(solicitud.getApellido1Repre());
			}

			if (solicitud.getApellido2Repre() != null) {
				oPersonaRespresentanteNueva.setApellido2(solicitud.getApellido2Repre());
			}

			if (solicitud.getNombreRepre() != null) {
				oPersonaRespresentanteNueva.setNombre(solicitud.getNombreRepre());
			}

			if (solicitud.getNumDocumRepre() != null) {
				oPersonaRespresentanteNueva.setNumDocum(solicitud.getNumDocumRepre());
			}

			oPersonaRespresentanteNueva.setTipPerso(Short.valueOf((short) 1));

			if (solicitud.getApellido1Repre() != null && solicitud.getApellido2Repre() != null && solicitud.getNombreRepre() != null) {
				String persona = solicitud.getApellido1Repre() + " " + solicitud.getApellido2Repre() + " "
						+ solicitud.getNombreRepre();
				oPersonaRespresentanteNueva.setDesPerEntid(persona);
			}
			if (solicitud.getApellido1Repre() != null && solicitud.getApellido2Repre() == null && solicitud.getNombreRepre() != null) {
				String persona = solicitud.getApellido1Repre() + " " + solicitud.getNombreRepre();
				oPersonaRespresentanteNueva.setDesPerEntid(persona);
			}

			if (solicitud.getDirPostaRepre() != null) {
				oPersonaRespresentanteNueva.setDirPosta(solicitud.getDirPostaRepre());
			}

			if (solicitud.getCodPostaRepre() != 0) {
				oPersonaRespresentanteNueva.setCodPosta(solicitud.getCodPostaRepre());
			}

			if (solicitud.getCodProviRepre() != null && solicitud.getCodProviRepre() > 0) {
				oPersonaRespresentanteNueva.setCodProvi(solicitud.getCodProviRepre());
			}

			if (solicitud.getCodMunicRepre() != null && solicitud.getCodMunicRepre() > 0) {
				String stringValue = Short.toString(solicitud.getCodMunicRepre());
				stringValue = stringValue.substring(stringValue.length() - 3);
				Short myShort = Short.valueOf(stringValue);
				oPersonaRespresentanteNueva.setCodMunic(myShort);
			}

			oPersonaRespresentanteNueva = servicePersonaEntidad.save(oPersonaRespresentanteNueva);
		}

		if (oPersonaRespresentanteNueva != null && oPersonaNueva != null) {
			PersonaRepresentante oPersonaRepreNueva = new PersonaRepresentante();
			oPersonaRepreNueva.setIdHisPerso(oPersonaNueva.getIdHisPerso());
			oPersonaRepreNueva.setIdPerso(oPersonaNueva.getIdPerso());
			oPersonaRepreNueva.setEstApodera(Short.valueOf((short) 2));
			oPersonaRepreNueva.setIdHisPerRepre(oPersonaRespresentanteNueva.getIdHisPerso());
			oPersonaRepreNueva.setIdPerRepre(oPersonaRespresentanteNueva.getIdPerso());
			oPersonaRepreNueva.setFecIni(new Date());
			personaRepresentateService.save(oPersonaRepreNueva);
		}

		if (oPersonaNueva != null && solicitud.getIdHisRepre() != null) {
			PersonaRepresentante oPersonaRepreNueva = new PersonaRepresentante();
			oPersonaRepreNueva.setIdHisPerso(oPersonaNueva.getIdHisPerso());
			oPersonaRepreNueva.setIdPerso(oPersonaNueva.getIdPerso());
			oPersonaRepreNueva.setEstApodera(Short.valueOf((short) 2));
			oPersonaRepreNueva.setIdHisPerRepre(solicitud.getIdHisRepre());
			oPersonaRepreNueva.setIdPerRepre(solicitud.getIdRepre());
			oPersonaRepreNueva.setFecIni(new Date());
			personaRepresentateService.save(oPersonaRepreNueva);
		}
		
		if (oPersonaRespresentanteNueva != null && oPersonaNueva == null) {
			PersonaEntidad oPersonaRepreNuevaBis = servicePersonaEntidad.findByNumDocum(oPersonaRespresentanteNueva.getNumDocum());
			PersonaRepresentante oPersonaRepreNueva = new PersonaRepresentante();
			oPersonaRepreNueva.setIdHisPerso(solicitud.getIdHisPerso());
			oPersonaRepreNueva.setIdPerso(solicitud.getIdPerso());
			oPersonaRepreNueva.setEstApodera(Short.valueOf((short) 2));
			oPersonaRepreNueva.setIdHisPerRepre(oPersonaRepreNuevaBis.getIdHisPerso());
			oPersonaRepreNueva.setIdPerRepre(oPersonaRepreNuevaBis.getIdPerso());
			oPersonaRepreNueva.setFecIni(new Date());
			personaRepresentateService.save(oPersonaRepreNueva);
		}
		
		if(oPersonaNueva == null && oPersonaRespresentanteNueva == null && solicitud.getIdHisRepre() != null) {
			PersonaRepresentante oPersonaRepreNueva = new PersonaRepresentante();
			oPersonaRepreNueva.setIdHisPerso(solicitud.getIdHisPerso());
			oPersonaRepreNueva.setIdPerso(solicitud.getIdPerso());
			oPersonaRepreNueva.setEstApodera(Short.valueOf((short) 2));
			oPersonaRepreNueva.setIdHisPerRepre(solicitud.getIdHisRepre());
			oPersonaRepreNueva.setIdPerRepre(solicitud.getIdRepre());
			oPersonaRepreNueva.setFecIni(new Date());
			personaRepresentateService.save(oPersonaRepreNueva);
		}

		if (oPersonaNueva != null) {
			oSolicitudNueva.setIdHisPerso(oPersonaNueva.getIdHisPerso());
			oSolicitudNueva.setIdPerso(oPersonaNueva.getIdPerso());
		}

		if (oPersonaRespresentanteNueva != null) {
			oSolicitudNueva.setIdHisRepre(oPersonaRespresentanteNueva.getIdHisPerso());
			oSolicitudNueva.setIdRepre(oPersonaRespresentanteNueva.getIdPerso());
		} else if (solicitud.getIdHisRepre() != null) {
			oSolicitudNueva.setIdHisRepre(solicitud.getIdHisRepre());
			oSolicitudNueva.setIdRepre(solicitud.getIdRepre());
		}

		Integer numero = max.intValue();
		oSolicitudNueva.setNumero(numero);
		return service.save(oSolicitudNueva);
	}

	@GetMapping("/solicitud/ver/{id}")
	public SolicitudDto detalle(@PathVariable Long id) {
		Solicitud solicitud = service.findById(id);
		SolicitudDto oSolDtoNew = new SolicitudDto();
		if (solicitud.getAsunto() != null) {
			oSolDtoNew.setAsunto(solicitud.getAsunto());
		}
		if (solicitud.getDepartamento() != null) {
			oSolDtoNew.setDepartamento(solicitud.getDepartamento());
		}
		if (solicitud.getEjercicio() != null) {
			oSolDtoNew.setEjercicio(solicitud.getEjercicio());
		}
		if (solicitud.getEstado() != null) {
			oSolDtoNew.setEstado(solicitud.getEstado());
		}
		if (solicitud.getExpediente() != null) {
			oSolDtoNew.setIdExpediente(solicitud.getExpediente());
			Expediente oExpediente = serviceExpediente.findById(solicitud.getExpediente());
			if (oExpediente != null) {
				oSolDtoNew.setExpediente(oExpediente);
			}
		}

		if (solicitud.getMotivoRechazo() != null) {
			oSolDtoNew.setMotivoRechazo(solicitud.getMotivoRechazo());
		}

		if (solicitud.getFecInicio() != null) {
			oSolDtoNew.setFecInicio(solicitud.getFecInicio());
		}
		if (solicitud.getId() != null) {
			oSolDtoNew.setId(solicitud.getId());
		}
		if (solicitud.getIdDocum() != null) {
			oSolDtoNew.setIdDocum(solicitud.getIdDocum());
		}
		if (solicitud.getIdHisDocum() != null) {
			oSolDtoNew.setIdHisDocum(solicitud.getIdHisDocum());
			RdDocumento oDocumento = serviceRdDocumento.findById(solicitud.getIdHisDocum());
			if (oDocumento != null) {
				String sEjeNum = oDocumento.getEjeRegis().toString() + oDocumento.getNumRegis().toString();
				oSolDtoNew.setEjeNumRegis(sEjeNum);
				oSolDtoNew.setAsuRegis(oDocumento.getExtracto());
			}
		}

		if (solicitud.getIdHisPerso() != null) {
			oSolDtoNew.setIdHisPerso(solicitud.getIdHisPerso());
		}
		if (solicitud.getIdPerso() != null) {
			oSolDtoNew.setIdPerso(solicitud.getIdPerso());
		}
		if (solicitud.getIdHisPerso() != null && solicitud.getIdPerso() != null) {
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(solicitud.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(solicitud.getIdPerso());
			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
			if (oPersonaEntidad != null) {
				PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
				if (oPersonaEntidad.getCodProvi() != null && oPersonaEntidad.getCodProvi() > 0) {
					Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
					Provincia oProvincia = serviceProvincia.findById(codProvi);
					if (oProvincia != null) {
						oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
					}
					if (oPersonaEntidad.getCodMunic() != null && oPersonaEntidad.getCodMunic() > 0) {
						MunicipioPK MunicipioPK = new MunicipioPK();
						MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
						MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
						Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
						if (oMunicipio != null) {
							oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
						}
					}
				}
				oSolDtoNew.setPersonaEntidad(oPersonaEntidadDto);
			}
		}
		if (solicitud.getIdHisRepre() != null) {
			oSolDtoNew.setIdHisRepre(solicitud.getIdHisRepre());
		}
		if (solicitud.getIdRepre() != null) {
			oSolDtoNew.setIdRepre(solicitud.getIdRepre());
		}
		if (solicitud.getNumero() != null) {
			oSolDtoNew.setNumero(solicitud.getNumero());
		}
		if (solicitud.getUsuario() != null) {
			oSolDtoNew.setUsuario(solicitud.getUsuario());
		}
		if (solicitud.getIdHisRepre() != null && solicitud.getIdRepre() != null) {
			PersonaEntidadPK oPersonaEntidad2PK = new PersonaEntidadPK();
			oPersonaEntidad2PK.setIdHisPerso(solicitud.getIdHisRepre());
			oPersonaEntidad2PK.setIdPerso(solicitud.getIdRepre());
			PersonaEntidad oPersonaEntidad2 = servicePersonaEntidad.findById(oPersonaEntidad2PK);

			if (oPersonaEntidad2 != null) {
				oSolDtoNew.setNomRepre(oPersonaEntidad2.getDesPerEntid());
			}
		}
		return oSolDtoNew;
	}

	@GetMapping("/solicitud/listar/{idOrgEleme}")
	public List<SolicitudDto> listar(@PathVariable Long idOrgEleme) {
		List<Solicitud> aSolicitud = service.findByDepartamento(idOrgEleme);
		List<SolicitudDto> aSolicitudDto = new ArrayList<SolicitudDto>();
		if(aSolicitud != null) {
			for (int i = 0; i < aSolicitud.size(); i++) {
				SolicitudDto oSolDtoNew = new SolicitudDto();
				if (aSolicitud.get(i).getAsunto() != null) {
					oSolDtoNew.setAsunto(aSolicitud.get(i).getAsunto());
				}
				if (aSolicitud.get(i).getDepartamento() != null) {
					oSolDtoNew.setDepartamento(aSolicitud.get(i).getDepartamento());
				}
				if (aSolicitud.get(i).getEjercicio() != null) {
					oSolDtoNew.setEjercicio(aSolicitud.get(i).getEjercicio());
				}
				if (aSolicitud.get(i).getEstado() != null) {
					oSolDtoNew.setEstado(aSolicitud.get(i).getEstado());
				}
				if (aSolicitud.get(i).getExpediente() != null) {
					oSolDtoNew.setIdExpediente(aSolicitud.get(i).getExpediente());
					Expediente oExpediente = serviceExpediente.findById(aSolicitud.get(i).getExpediente());
					if (oExpediente != null) {
						oSolDtoNew.setExpediente(oExpediente);
					}
				}
				if (aSolicitud.get(i).getMotivoRechazo() != null) {
					oSolDtoNew.setMotivoRechazo(aSolicitud.get(i).getMotivoRechazo());
				}
				if (aSolicitud.get(i).getFecInicio() != null) {
					oSolDtoNew.setFecInicio(aSolicitud.get(i).getFecInicio());
				}
				if (aSolicitud.get(i).getId() != null) {
					oSolDtoNew.setId(aSolicitud.get(i).getId());
				}
				if (aSolicitud.get(i).getIdDocum() != null) {
					oSolDtoNew.setIdDocum(aSolicitud.get(i).getIdDocum());
				}
				if (aSolicitud.get(i).getIdHisDocum() != null) {
					oSolDtoNew.setIdHisDocum(aSolicitud.get(i).getIdHisDocum());
					RdDocumento oDocumento = serviceRdDocumento.findById(aSolicitud.get(i).getIdHisDocum());
					if (oDocumento != null) {
						String sEjeNum = oDocumento.getEjeRegis().toString() + "/" + oDocumento.getNumRegis().toString();
						oSolDtoNew.setEjeNumRegis(sEjeNum);
						oSolDtoNew.setAsuRegis(oDocumento.getExtracto());
						oSolDtoNew.setForNotif(oDocumento.getForNotif());				}
				}

				if (aSolicitud.get(i).getIdHisPerso() != null) {
					oSolDtoNew.setIdHisPerso(aSolicitud.get(i).getIdHisPerso());
				}
				if (aSolicitud.get(i).getIdPerso() != null) {
					oSolDtoNew.setIdPerso(aSolicitud.get(i).getIdPerso());
				}
				if (aSolicitud.get(i).getIdHisPerso() != null && aSolicitud.get(i).getIdPerso() != null) {
					PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
					oPersonaEntidadPK.setIdHisPerso(aSolicitud.get(i).getIdHisPerso());
					oPersonaEntidadPK.setIdPerso(aSolicitud.get(i).getIdPerso());
					PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
					if (oPersonaEntidad != null) {
						PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
						if (oPersonaEntidad.getCodProvi() != null && oPersonaEntidad.getCodProvi() > 0) {
							Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
							Provincia oProvincia = serviceProvincia.findById(codProvi);
							if (oProvincia != null) {
								oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
							}
							if (oPersonaEntidad.getCodMunic() != null && oPersonaEntidad.getCodMunic() > 0) {
								MunicipioPK MunicipioPK = new MunicipioPK();
								MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
								MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
								Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
								if (oMunicipio != null) {
									oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
								}
							}
						}
						oSolDtoNew.setPersonaEntidad(oPersonaEntidadDto);
					}
				}
				if (aSolicitud.get(i).getIdHisRepre() != null && aSolicitud.get(i).getIdRepre() != null) {
					PersonaEntidadPK oPersonaEntidad2PK = new PersonaEntidadPK();
					oPersonaEntidad2PK.setIdHisPerso(aSolicitud.get(i).getIdHisRepre());
					oPersonaEntidad2PK.setIdPerso(aSolicitud.get(i).getIdRepre());
					PersonaEntidad oPersonaEntidad2 = servicePersonaEntidad.findById(oPersonaEntidad2PK);

					if (oPersonaEntidad2 != null) {
						oSolDtoNew.setNomRepre(oPersonaEntidad2.getDesPerEntid());
						oSolDtoNew.setDirRepre(oPersonaEntidad2.getDirPosta());
					}
				}
				if (aSolicitud.get(i).getIdHisRepre() != null) {
					oSolDtoNew.setIdHisRepre(aSolicitud.get(i).getIdHisRepre());
				}
				if (aSolicitud.get(i).getIdRepre() != null) {
					oSolDtoNew.setIdRepre(aSolicitud.get(i).getIdRepre());
				}
				if (aSolicitud.get(i).getNumero() != null) {
					oSolDtoNew.setNumero(aSolicitud.get(i).getNumero());
				}
				if (aSolicitud.get(i).getUsuario() != null) {
					oSolDtoNew.setUsuario(aSolicitud.get(i).getUsuario());
				}
				aSolicitudDto.add(oSolDtoNew);
			}
			return aSolicitudDto;
		}
		return null;
	}

	@GetMapping("/solicitud/listarPorEstado/{estado}/{idOrgEleme}")
	public List<SolicitudDto> listarPorEstado(@PathVariable String estado, @PathVariable Long idOrgEleme) {
		EnumEstadoSolicitud estadoBus = null;
		if (estado.equals("PENDIENTE")) {
			estadoBus = EnumEstadoSolicitud.PENDIENTE;
		} else if (estado.equals("ACEPTADA")) {
			estadoBus = EnumEstadoSolicitud.ACEPTADA;
		} else if (estado.equals("RECHAZADA")) {
			estadoBus = EnumEstadoSolicitud.RECHAZADA;
		}
		List<Solicitud> aSolicitud = service.findByEstadoAndDepartamento(estadoBus, idOrgEleme);
		if (aSolicitud != null && !aSolicitud.isEmpty()) {
			List<SolicitudDto> aSolicitudDto = new ArrayList<SolicitudDto>();
			for (int i = 0; i < aSolicitud.size(); i++) {
				SolicitudDto oSolDtoNew = new SolicitudDto();
				if (aSolicitud.get(i).getAsunto() != null) {
					oSolDtoNew.setAsunto(aSolicitud.get(i).getAsunto());
				}
				if (aSolicitud.get(i).getDepartamento() != null) {
					oSolDtoNew.setDepartamento(aSolicitud.get(i).getDepartamento());
				}
				if (aSolicitud.get(i).getEjercicio() != null) {
					oSolDtoNew.setEjercicio(aSolicitud.get(i).getEjercicio());
				}
				if (aSolicitud.get(i).getEstado() != null) {
					oSolDtoNew.setEstado(aSolicitud.get(i).getEstado());
				}
				if (aSolicitud.get(i).getExpediente() != null) {
					oSolDtoNew.setIdExpediente(aSolicitud.get(i).getExpediente());
					Expediente oExpediente = serviceExpediente.findById(aSolicitud.get(i).getExpediente());
					if (oExpediente != null) {
						oSolDtoNew.setExpediente(oExpediente);
					}
				}
				if (aSolicitud.get(i).getMotivoRechazo() != null) {
					oSolDtoNew.setMotivoRechazo(aSolicitud.get(i).getMotivoRechazo());
				}
				if (aSolicitud.get(i).getFecInicio() != null) {
					oSolDtoNew.setFecInicio(aSolicitud.get(i).getFecInicio());
				}
				if (aSolicitud.get(i).getId() != null) {
					oSolDtoNew.setId(aSolicitud.get(i).getId());
				}
				if (aSolicitud.get(i).getIdDocum() != null) {
					oSolDtoNew.setIdDocum(aSolicitud.get(i).getIdDocum());
				}
				if (aSolicitud.get(i).getIdHisDocum() != null) {
					oSolDtoNew.setIdHisDocum(aSolicitud.get(i).getIdHisDocum());
					RdDocumento oDocumento = serviceRdDocumento.findById(aSolicitud.get(i).getIdHisDocum());
					if (oDocumento != null) {
						String sEjeNum = oDocumento.getEjeRegis().toString() + "/"
								+ oDocumento.getNumRegis().toString();
						oSolDtoNew.setEjeNumRegis(sEjeNum);
						oSolDtoNew.setAsuRegis(oDocumento.getExtracto());
					}
				}

				if (aSolicitud.get(i).getIdHisPerso() != null) {
					oSolDtoNew.setIdHisPerso(aSolicitud.get(i).getIdHisPerso());
				}
				if (aSolicitud.get(i).getIdPerso() != null) {
					oSolDtoNew.setIdPerso(aSolicitud.get(i).getIdPerso());
				}
				if (aSolicitud.get(i).getIdHisPerso() != null && aSolicitud.get(i).getIdPerso() != null) {
					PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
					oPersonaEntidadPK.setIdHisPerso(aSolicitud.get(i).getIdHisPerso());
					oPersonaEntidadPK.setIdPerso(aSolicitud.get(i).getIdPerso());
					PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
					if (oPersonaEntidad != null) {
						PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
						if (oPersonaEntidad.getCodProvi() != null && oPersonaEntidad.getCodProvi() > 0) {
							Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
							Provincia oProvincia = serviceProvincia.findById(codProvi);
							if (oProvincia != null) {
								oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
							}
							if (oPersonaEntidad.getCodMunic() != null && oPersonaEntidad.getCodMunic() > 0) {
								MunicipioPK MunicipioPK = new MunicipioPK();
								MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
								MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
								Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
								if (oMunicipio != null) {
									oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
								}
							}
						}
						oSolDtoNew.setPersonaEntidad(oPersonaEntidadDto);
					}
				}
				if (aSolicitud.get(i).getIdHisRepre() != null && aSolicitud.get(i).getIdRepre() != null) {
					PersonaEntidadPK oPersonaEntidad2PK = new PersonaEntidadPK();
					oPersonaEntidad2PK.setIdHisPerso(aSolicitud.get(i).getIdHisRepre());
					oPersonaEntidad2PK.setIdPerso(aSolicitud.get(i).getIdRepre());
					PersonaEntidad oPersonaEntidad2 = servicePersonaEntidad.findById(oPersonaEntidad2PK);

					if (oPersonaEntidad2 != null) {
						oSolDtoNew.setNomRepre(oPersonaEntidad2.getDesPerEntid());
						oSolDtoNew.setDirRepre(oPersonaEntidad2.getDirPosta());
					}
				}
				if (aSolicitud.get(i).getIdHisRepre() != null) {
					oSolDtoNew.setIdHisRepre(aSolicitud.get(i).getIdHisRepre());
				}
				if (aSolicitud.get(i).getIdRepre() != null) {
					oSolDtoNew.setIdRepre(aSolicitud.get(i).getIdRepre());
				}
				if (aSolicitud.get(i).getNumero() != null) {
					oSolDtoNew.setNumero(aSolicitud.get(i).getNumero());
				}
				if (aSolicitud.get(i).getUsuario() != null) {
					oSolDtoNew.setUsuario(aSolicitud.get(i).getUsuario());
				}
				aSolicitudDto.add(oSolDtoNew);
			}
			return aSolicitudDto;
		}
		return null;
	}

	@PutMapping("/solicitud/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Solicitud editar(@RequestBody Solicitud solicitud, @PathVariable Long id) {
		Solicitud solicitudDB = service.findById(id);
		if (solicitud.getUsuario() != null) {
			solicitudDB.setUsuario(solicitud.getUsuario());
		}

		if (solicitud.getAsunto() != null) {
			solicitudDB.setAsunto(solicitud.getAsunto());
		}

		if (solicitud.getFecInicio() != null) {
			solicitudDB.setFecInicio(solicitud.getFecInicio());
		}

		if (solicitud.getEstado() != null) {
			solicitudDB.setEstado(solicitud.getEstado());
		}

		if (solicitud.getMotivoRechazo() != null) {
			solicitudDB.setMotivoRechazo(solicitud.getMotivoRechazo());
		}

		solicitudDB.setFecContr(new Date());

		if (solicitud.getIdHisPerso() != null) {
			solicitudDB.setIdHisPerso(solicitud.getIdHisPerso());
		}

		if (solicitud.getIdPerso() != null) {
			solicitudDB.setIdPerso(solicitud.getIdPerso());
		}

		if (solicitud.getUsuContr() != null) {
			solicitudDB.setUsuContr(solicitud.getUsuContr());
		}

		solicitudDB.setIdHisRepre(solicitud.getIdHisRepre());
		solicitudDB.setIdRepre(solicitud.getIdRepre());

		if (solicitudDB.getEstado().equals(EnumEstadoSolicitud.RECHAZADA)) {
			if (solicitudDB.getIdHisDocum() != null && solicitudDB.getIdDocum() != null) {
				RdDocumento oRdDocumento = serviceRdDocumento.findById(solicitudDB.getIdHisDocum());
				if (oRdDocumento != null) {
					oRdDocumento.setEstado(Short.valueOf((short) 7));
					Usuario oUsuario = serviceUsuario.findById(oRdDocumento.getUsuRegis());
					if (oUsuario != null) {
						List<UsuarioValor> aUsuarioValor = serviceUsuarioValor
								.findByUsuarioAndNumValor(oUsuario.getUsuario(), Short.valueOf((short) 6));
						if (aUsuarioValor != null && !aUsuarioValor.isEmpty()) {
							String sServidor = null;
							String sRemitente = null;
							String sUsuario = null;
							String sPass = null;
							String sPuerto = null;
							String sTarttls = null;
							String sAuth = null;
							String sSocket = null;

							ParametroSistemaPK oParametroSistemaPk51 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 51));
							ParametroSistema oParametroSistema51 = parametroSistemaService
									.findById(oParametroSistemaPk51);
							if (oParametroSistema51 != null) {
								sServidor = oParametroSistema51.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 51");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk52 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 52));
							ParametroSistema oParametroSistema52 = parametroSistemaService
									.findById(oParametroSistemaPk52);
							if (oParametroSistema52 != null) {
								sRemitente = oParametroSistema52.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 52");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk53 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 53));
							ParametroSistema oParametroSistema53 = parametroSistemaService
									.findById(oParametroSistemaPk53);
							if (oParametroSistema53 != null) {
								sUsuario = oParametroSistema53.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 53");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk54 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 54));
							ParametroSistema oParametroSistema54 = parametroSistemaService
									.findById(oParametroSistemaPk54);
							if (oParametroSistema54 != null) {
								sPass = oParametroSistema54.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 54");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk254 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 254));
							ParametroSistema oParametroSistema254 = parametroSistemaService
									.findById(oParametroSistemaPk254);
							if (oParametroSistema254 != null) {
								sPuerto = oParametroSistema254.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 254");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk9273 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9273));
							ParametroSistema oParametroSistema9273 = parametroSistemaService
									.findById(oParametroSistemaPk9273);
							if (oParametroSistema9273 != null) {
								sTarttls = oParametroSistema9273.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 9273");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk9274 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9274));
							ParametroSistema oParametroSistema9274 = parametroSistemaService
									.findById(oParametroSistemaPk9274);
							if (oParametroSistema9274 != null) {
								sAuth = oParametroSistema9274.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 9274");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk9275 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9275));
							ParametroSistema oParametroSistema9275 = parametroSistemaService
									.findById(oParametroSistemaPk9275);
							if (oParametroSistema9275 != null) {
								sSocket = oParametroSistema9275.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 9275");
								throw new ErrorEnvioEmail();
							}
							String sAsunto = "Rechazo del registro de entrada: " + oRdDocumento.getEjeRegis().toString()
									+ "-" + oRdDocumento.getNumRegis().toString();
							String sCuerpo = "Por el presente correo se le informa que se ha rechazado el registro de entrada: "
									+ oRdDocumento.getEjeRegis().toString() + "-"
									+ oRdDocumento.getNumRegis().toString() + ", debido al motivo: "
									+ solicitud.getMotivoRechazo();

							boolean envioMail = Utiles.EMail(aUsuarioValor.get(0).getValor(), sAsunto, sCuerpo, sPuerto,
									sServidor, sRemitente, sUsuario, sPass, sTarttls, sAuth, sSocket);
							if (!envioMail) {
								throw new ErrorEnvioEmail();
							}
						}
					}
					serviceRdDocumento.save(oRdDocumento);
				}
			}
		}

		return service.save(solicitudDB);
	}

	@DeleteMapping("/solicitud/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		Solicitud solicitudDB = service.findById(id);
		if (solicitudDB == null) {
			throw new NoDataFoundException();
		}
		if (solicitudDB.getExpediente() != null) {
			throw new ErrorBorradoProcedimientoException();
		}
		service.deleteByObject(solicitudDB);
	}
}
