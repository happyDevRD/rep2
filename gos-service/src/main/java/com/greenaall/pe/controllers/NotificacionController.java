package com.greenaall.pe.controllers;

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

import com.greenaall.pe.notificacion.NotificacionApplicationService;
import com.greenaall.pe.util.NotificacionSituacionUtil;
import com.greenaall.exception.ErrorBorradoNotificacionException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.gf.entity.GfMotivoNotificacion;
import com.greenaall.models.gf.entity.GfNotificador;
import com.greenaall.models.gf.entity.GfReceptorNotificacion;
import com.greenaall.models.gf.service.MotivoNotificacionServiceImpl;
import com.greenaall.models.gf.service.NotificadorServiceImpl;
import com.greenaall.models.gf.service.ReceptorNotificacionServiceImpl;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.NotificacionServiceImpl;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.pe.dto.NotificacionDto;
import com.greenaall.pe.dto.PersonaEntidadDto;
import com.greenaall.pe.util.PersonaEntidadValide;

@RestController
public class NotificacionController {

	@Autowired
	private NotificacionServiceImpl service;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private MotivoNotificacionServiceImpl serviceMotivoNotificacion;

	@Autowired
	private NotificadorServiceImpl serviceNotificador;

	@Autowired
	private ReceptorNotificacionServiceImpl serviceReceptorNotificacion;

	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;

	@Autowired
	private TramiteServiceImpl serviceTramite;

	@Autowired
	private NotificacionApplicationService notificacionApplicationService;

	@PostMapping("/notificacion/crear/{tarea}")
	@ResponseStatus(HttpStatus.CREATED)
	public Notificacion crear(@RequestBody NotificacionDto notificacionDto, @PathVariable Long tarea) {
		return notificacionApplicationService.crear(notificacionDto, tarea);
	}

	@GetMapping("/notificacion/ver/{id}")
	public NotificacionDto detalle(@PathVariable Long id) {
		Notificacion notificacion = service.findById(id);
		NotificacionDto oNotDtoNew = new NotificacionDto();

		List<TareaTramiteExpediente> oTarea = serviceTareaTramiteExpediente
				.findByNotificacion(notificacion.getIdNotif());

		if (oTarea != null) {
			oNotDtoNew.setIdTarea(oTarea.get(0).getId());
			oNotDtoNew.setNumTarea(oTarea.get(0).getNumero());
			Tramite oTramte = serviceTramite.findById(oTarea.get(0).getTramite());
			if (oTramte != null) {
				oNotDtoNew.setIdTramite(oTramte.getId());
				oNotDtoNew.setDesTramite(oTramte.getDescripcion());
			}
		}

		if (notificacion.getBloque() != null) {
			oNotDtoNew.setBloque(notificacion.getBloque());
		}
		if (notificacion.getBop() != null) {
			oNotDtoNew.setBop(notificacion.getBop());
			if(notificacion.getBop().equals(Short.valueOf("0"))) {
				oNotDtoNew.setDesBop("N/A");
			}else if(notificacion.getBop().equals(Short.valueOf("1"))) {
				oNotDtoNew.setDesBop("ENVIADO");
			}else if(notificacion.getBop().equals(Short.valueOf("2"))) {
				oNotDtoNew.setDesBop("PUBLICADO");
			}else {
				oNotDtoNew.setDesBop("N/A");
			}
		}
		if (notificacion.getCodArchi() != null) {
			oNotDtoNew.setCodArchi(notificacion.getCodArchi());
		}
		if (notificacion.getCodArchiAcuse() != null) {
			oNotDtoNew.setCodArchiAcuse(notificacion.getCodArchiAcuse());
		}
		if (notificacion.getCodMunic() != null) {
			oNotDtoNew.setCodMunic(notificacion.getCodMunic());
		}
		if (notificacion.getCodPosta() != null) {
			oNotDtoNew.setCodPosta(notificacion.getCodPosta());
		}
		if (notificacion.getCodProvi() != null) {
			oNotDtoNew.setCodProvi(notificacion.getCodProvi());
		}
		if (notificacion.getDesVial() != null) {
			oNotDtoNew.setDesVial(notificacion.getDesVial());
		}
		if (notificacion.getDomicilio() != null) {
			oNotDtoNew.setDomicilio(notificacion.getDomicilio());
		}
		if (notificacion.getEjeExped() != null) {
			oNotDtoNew.setEjeExped(notificacion.getEjeExped());
		}
		if (notificacion.getEjeNotif() != null) {
			oNotDtoNew.setEjeNotif(notificacion.getEjeNotif());
		}
		if (notificacion.getEscalera() != null) {
			oNotDtoNew.setEscalera(notificacion.getEscalera());
		}
		if (notificacion.getFecArchi() != null) {
			oNotDtoNew.setFecArchi(notificacion.getFecArchi());
		}
		if (notificacion != null) {
			oNotDtoNew.setFecCaduc(notificacion.getFecCaduc());
		}
		if (notificacion.getFecEmiBop() != null) {
			oNotDtoNew.setFecEmiBop(notificacion.getFecEmiBop());
		}
		if (notificacion.getFecEnvio() != null) {
			oNotDtoNew.setFecEnvio(notificacion.getFecEnvio());
		}
		if (notificacion.getFecNotif() != null) {
			oNotDtoNew.setFecNotif(notificacion.getFecNotif());
		}
		if (notificacion.getFecPubBop() != null) {
			oNotDtoNew.setFecPubBop(notificacion.getFecPubBop());
		}
		if (notificacion.getFecRecNotif() != null) {
			oNotDtoNew.setFecRecNotif(notificacion.getFecRecNotif());
		}
		if (notificacion.getFecRegistSalid() != null) {
			oNotDtoNew.setFecRegistSalid(notificacion.getFecRegistSalid());
		}
		if (notificacion.getForNotif() != null) {
			oNotDtoNew.setForNotif(notificacion.getForNotif());
		}
		if (notificacion.getIdHisPerso() != null && notificacion.getIdPerso() != null) {
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(notificacion.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(notificacion.getIdPerso());
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
				oNotDtoNew.setNumDocum(oPersonaEntidadDto.getNumDocum());
				oNotDtoNew.setDesPerEntid(oPersonaEntidadDto.getDesPerEntid());
				oNotDtoNew.setPersonaEntidad(oPersonaEntidadDto);
			}
		}
		if (notificacion.getIdNotif() != null) {
			oNotDtoNew.setIdNotif(notificacion.getIdNotif());
		}
		if (notificacion.getLetInfer() != null) {
			oNotDtoNew.setLetInfer(notificacion.getLetInfer());
		}
		if (notificacion.getLocalidad() != null) {
			oNotDtoNew.setLocalidad(notificacion.getLocalidad());
		}
		if (notificacion.getMotNotif() != null) {
			oNotDtoNew.setMotNotif(notificacion.getMotNotif());
			GfMotivoNotificacion oMotivoNotificacion = serviceMotivoNotificacion.findById(notificacion.getMotNotif());
			oNotDtoNew.setDesMotNotif(oMotivoNotificacion.getDescripcion());
		}
		if (notificacion.getNotificador() != null) {
			oNotDtoNew.setNotificador(notificacion.getNotificador());
			GfNotificador oNotificador = serviceNotificador.findById(notificacion.getNotificador());
			oNotDtoNew.setDesNotificador(oNotificador.getDescripcion());
		}
		if (notificacion.getNumBop() != null) {
			oNotDtoNew.setNumBop(notificacion.getNumBop());
		}
		if (notificacion.getNumEnvioTeu() != null) {
			oNotDtoNew.setNumEnvioTeu(notificacion.getNumEnvioTeu());
		}
		if (notificacion.getNumExped() != null) {
			oNotDtoNew.setNumExped(notificacion.getNumExped());
		}
		if (notificacion.getNumInfer() != null) {
			oNotDtoNew.setNumInfer(notificacion.getNumInfer());
		}
		if (notificacion.getNumNotif() != null) {
			oNotDtoNew.setNumNotif(notificacion.getNumNotif());
		}
		if (notificacion.getNumRegisSalid() != null) {
			oNotDtoNew.setNumRegisSalid(notificacion.getNumRegisSalid());
		}
		if (notificacion.getObservacion() != null) {
			oNotDtoNew.setObservacion(notificacion.getObservacion());
		}
		if (notificacion.getPlanta() != null) {
			oNotDtoNew.setPlanta(notificacion.getPlanta());
		}
		if (notificacion.getPortal() != null) {
			oNotDtoNew.setPortal(notificacion.getPortal());
		}
		if (notificacion.getPuerta() != null) {
			oNotDtoNew.setPuerta(notificacion.getPuerta());
		}
		if (notificacion.getReceptor() != null) {
			oNotDtoNew.setReceptor(notificacion.getReceptor());
			GfReceptorNotificacion oReceptorNotificacion = serviceReceptorNotificacion
					.findById(notificacion.getReceptor());
			if(oReceptorNotificacion != null && oReceptorNotificacion.getDescripcion() != null) {
				oNotDtoNew.setDesReceptor(oReceptorNotificacion.getDescripcion());
			}	
		}
		if (notificacion.getSituacion() != null) {
			oNotDtoNew.setSituacion(notificacion.getSituacion());
			oNotDtoNew.setDesSituacion(NotificacionSituacionUtil.descripcionSituacion(notificacion.getSituacion()));
		}
		if (notificacion.getTipVial() != null) {
			oNotDtoNew.setTipVial(notificacion.getTipVial());
		}

		if (notificacion.getEjeNotif() != null && notificacion.getNumNotif() != null) {
			String notificacionTxt = notificacion.getEjeNotif().toString() + "/"
					+ notificacion.getNumNotif().toString();
			oNotDtoNew.setNotificacion(notificacionTxt);
		}

		return oNotDtoNew;
	}

	@GetMapping("/notificacion/listar/{ejeExped}/{numExped}")
	public List<NotificacionDto> listar(@PathVariable Short ejeExped, @PathVariable String numExped) {

		List<Notificacion> aNotificacion = service.findByEjeExpedAndNumExped(ejeExped, numExped);

		if (aNotificacion == null || aNotificacion.isEmpty()) {
			return new ArrayList<NotificacionDto>();
		}

		List<NotificacionDto> aNotificacionDto = new ArrayList<NotificacionDto>();

		for (int i = 0; i < aNotificacion.size(); i++) {

			List<TareaTramiteExpediente> oTarea = serviceTareaTramiteExpediente
					.findByNotificacion(aNotificacion.get(i).getIdNotif());

			NotificacionDto oNotDtoNew = new NotificacionDto();

			if (oTarea != null) {
				oNotDtoNew.setIdTarea(oTarea.get(0).getId());
				oNotDtoNew.setNumTarea(oTarea.get(0).getNumero());
				Tramite oTramte = serviceTramite.findById(oTarea.get(0).getTramite());
				if (oTramte != null) {
					oNotDtoNew.setIdTramite(oTramte.getId());
					oNotDtoNew.setDesTramite(oTramte.getDescripcion());
				}
			}

			if (aNotificacion.get(i).getBloque() != null) {
				oNotDtoNew.setBloque(aNotificacion.get(i).getBloque());
			}
			if (aNotificacion.get(i).getBop() != null) {
				oNotDtoNew.setBop(aNotificacion.get(i).getBop());
				if(aNotificacion.get(i).getBop().equals(Short.valueOf("0"))) {
					oNotDtoNew.setDesBop("N/A");
				}else if(aNotificacion.get(i).getBop().equals(Short.valueOf("1"))) {
					oNotDtoNew.setDesBop("ENVIADO");
				}else if(aNotificacion.get(i).getBop().equals(Short.valueOf("2"))) {
					oNotDtoNew.setDesBop("PUBLICADO");
				}else {
					oNotDtoNew.setDesBop("N/A");
				}
			}
			if (aNotificacion.get(i).getCodArchi() != null) {
				oNotDtoNew.setCodArchi(aNotificacion.get(i).getCodArchi());
			}
			if (aNotificacion.get(i).getCodArchiAcuse() != null) {
				oNotDtoNew.setCodArchiAcuse(aNotificacion.get(i).getCodArchiAcuse());
			}
			if (aNotificacion.get(i).getCodMunic() != null) {
				oNotDtoNew.setCodMunic(aNotificacion.get(i).getCodMunic());
			}
			if (aNotificacion.get(i).getCodPosta() != null) {
				oNotDtoNew.setCodPosta(aNotificacion.get(i).getCodPosta());
			}
			if (aNotificacion.get(i).getCodProvi() != null) {
				oNotDtoNew.setCodProvi(aNotificacion.get(i).getCodProvi());
			}
			if (aNotificacion.get(i).getDesVial() != null) {
				oNotDtoNew.setDesVial(aNotificacion.get(i).getDesVial());
			}
			if (aNotificacion.get(i).getDomicilio() != null) {
				oNotDtoNew.setDomicilio(aNotificacion.get(i).getDomicilio());
			}
			if (aNotificacion.get(i).getEjeExped() != null) {
				oNotDtoNew.setEjeExped(aNotificacion.get(i).getEjeExped());
			}
			if (aNotificacion.get(i).getEjeNotif() != null) {
				oNotDtoNew.setEjeNotif(aNotificacion.get(i).getEjeNotif());
			}
			if (aNotificacion.get(i).getEscalera() != null) {
				oNotDtoNew.setEscalera(aNotificacion.get(i).getEscalera());
			}
			if (aNotificacion.get(i).getFecArchi() != null) {
				oNotDtoNew.setFecArchi(aNotificacion.get(i).getFecArchi());
			}
			if (aNotificacion.get(i).getFecCaduc() != null) {
				oNotDtoNew.setFecCaduc(aNotificacion.get(i).getFecCaduc());
			}
			if (aNotificacion.get(i).getFecEmiBop() != null) {
				oNotDtoNew.setFecEmiBop(aNotificacion.get(i).getFecEmiBop());
			}
			if (aNotificacion.get(i).getFecEnvio() != null) {
				oNotDtoNew.setFecEnvio(aNotificacion.get(i).getFecEnvio());
			}
			if (aNotificacion.get(i).getFecNotif() != null) {
				oNotDtoNew.setFecNotif(aNotificacion.get(i).getFecNotif());
			}
			if (aNotificacion.get(i).getFecPubBop() != null) {
				oNotDtoNew.setFecPubBop(aNotificacion.get(i).getFecPubBop());
			}
			if (aNotificacion.get(i).getFecRecNotif() != null) {
				oNotDtoNew.setFecRecNotif(aNotificacion.get(i).getFecRecNotif());
			}
			if (aNotificacion.get(i).getFecRegistSalid() != null) {
				oNotDtoNew.setFecRegistSalid(aNotificacion.get(i).getFecRegistSalid());
			}
			if (aNotificacion.get(i).getForNotif() != null) {
				oNotDtoNew.setForNotif(aNotificacion.get(i).getForNotif());
			}
			if (aNotificacion.get(i).getIdHisPerso() != null && aNotificacion.get(i).getIdPerso() != null) {
				PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
				oPersonaEntidadPK.setIdHisPerso(aNotificacion.get(i).getIdHisPerso());
				oPersonaEntidadPK.setIdPerso(aNotificacion.get(i).getIdPerso());
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
					oNotDtoNew.setNumDocum(oPersonaEntidadDto.getNumDocum());
					oNotDtoNew.setDesPerEntid(oPersonaEntidadDto.getDesPerEntid());
					oNotDtoNew.setPersonaEntidad(oPersonaEntidadDto);
				}
			}
			if (aNotificacion.get(i).getIdNotif() != null) {
				oNotDtoNew.setIdNotif(aNotificacion.get(i).getIdNotif());
			}
			if (aNotificacion.get(i).getLetInfer() != null) {
				oNotDtoNew.setLetInfer(aNotificacion.get(i).getLetInfer());
			}
			if (aNotificacion.get(i).getLocalidad() != null) {
				oNotDtoNew.setLocalidad(aNotificacion.get(i).getLocalidad());
			}
			if (aNotificacion.get(i).getMotNotif() != null) {
				oNotDtoNew.setMotNotif(aNotificacion.get(i).getMotNotif());
				GfMotivoNotificacion oMotivoNotificacion = serviceMotivoNotificacion.findById(aNotificacion.get(i).getMotNotif());
				if(oMotivoNotificacion != null && oMotivoNotificacion.getDescripcion() != null) {
					oNotDtoNew.setDesMotNotif(oMotivoNotificacion.getDescripcion());
				}
				
			}
			if (aNotificacion.get(i).getNotificador() != null) {
				oNotDtoNew.setNotificador(aNotificacion.get(i).getNotificador());
				GfNotificador oNotificador = serviceNotificador.findById(aNotificacion.get(i).getNotificador());
				if(oNotificador != null && oNotificador.getDescripcion() != null) {
					oNotDtoNew.setDesNotificador(oNotificador.getDescripcion());
				}
			}
			if (aNotificacion.get(i).getNumBop() != null) {
				oNotDtoNew.setNumBop(aNotificacion.get(i).getNumBop());
			}
			if (aNotificacion.get(i).getNumEnvioTeu() != null) {
				oNotDtoNew.setNumEnvioTeu(aNotificacion.get(i).getNumEnvioTeu());
			}
			if (aNotificacion.get(i).getNumExped() != null) {
				oNotDtoNew.setNumExped(aNotificacion.get(i).getNumExped());
			}
			if (aNotificacion.get(i).getNumInfer() != null) {
				oNotDtoNew.setNumInfer(aNotificacion.get(i).getNumInfer());
			}
			if (aNotificacion.get(i).getNumNotif() != null) {
				oNotDtoNew.setNumNotif(aNotificacion.get(i).getNumNotif());
			}
			if (aNotificacion.get(i).getNumRegisSalid() != null) {
				oNotDtoNew.setNumRegisSalid(aNotificacion.get(i).getNumRegisSalid());
			}
			if (aNotificacion.get(i).getObservacion() != null) {
				oNotDtoNew.setObservacion(aNotificacion.get(i).getObservacion());
			}
			if (aNotificacion.get(i).getPlanta() != null) {
				oNotDtoNew.setPlanta(aNotificacion.get(i).getPlanta());
			}
			if (aNotificacion.get(i).getPortal() != null) {
				oNotDtoNew.setPortal(aNotificacion.get(i).getPortal());
			}
			if (aNotificacion.get(i).getPuerta() != null) {
				oNotDtoNew.setPuerta(aNotificacion.get(i).getPuerta());
			}
			if (aNotificacion.get(i).getReceptor() != null) {
				oNotDtoNew.setReceptor(aNotificacion.get(i).getReceptor());
				GfReceptorNotificacion oReceptorNotificacion = serviceReceptorNotificacion
						.findById(aNotificacion.get(i).getReceptor());
				if(oReceptorNotificacion != null && oReceptorNotificacion.getDescripcion() != null) {
					oNotDtoNew.setDesReceptor(oReceptorNotificacion.getDescripcion());
				}			
			}
			if (aNotificacion.get(i).getSituacion() != null) {
				oNotDtoNew.setSituacion(aNotificacion.get(i).getSituacion());
				oNotDtoNew.setDesSituacion(
						NotificacionSituacionUtil.descripcionSituacion(aNotificacion.get(i).getSituacion()));
			}
			if (aNotificacion.get(i).getTipVial() != null) {
				oNotDtoNew.setTipVial(aNotificacion.get(i).getTipVial());
			}

			if (aNotificacion.get(i).getEjeNotif() != null && aNotificacion.get(i).getNumNotif() != null) {
				String notificacionTxt = aNotificacion.get(i).getEjeNotif().toString() + "/"
						+ aNotificacion.get(i).getNumNotif().toString();
				oNotDtoNew.setNotificacion(notificacionTxt);
			}

			aNotificacionDto.add(oNotDtoNew);
		}
		return aNotificacionDto;
	}

	@PutMapping("/notificacion/editar/")
	@ResponseStatus(HttpStatus.CREATED)
	public NotificacionDto editar(@RequestBody Notificacion notificacion) {
		return notificacionApplicationService.editar(notificacion);
	}

	@DeleteMapping("/notificacion/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		Notificacion oNotificacion = service.findById(id);
		if (oNotificacion == null) {
			throw new NoDataFoundException();
		}
		if (!oNotificacion.getSituacion().equals(Short.valueOf("1"))) {
			throw new ErrorBorradoNotificacionException();
		}
		service.deleteById(oNotificacion.getIdNotif());
		List<TareaTramiteExpediente> aTareaTramite = serviceTareaTramiteExpediente.findByNotificacion(id);
		if(aTareaTramite != null && aTareaTramite.size()>0) {
			aTareaTramite.get(0).setNotificacion(null);
			aTareaTramite.get(0).setFecContr(new Date());
			serviceTareaTramiteExpediente.save(aTareaTramite.get(0));
		}
	}

}
