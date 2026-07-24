package com.greenaall.ex.controllers;

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

import com.greenaall.exception.ErrorMailDestinatarioException;
import com.greenaall.exception.FaltanDatosException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NoDescripcionException;
import com.greenaall.exception.TramitadorPoseeException;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.OrganizacionUsuarioServiceImpl;
import com.greenaall.models.ex.dto.MensajeDto;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Mensaje;
import com.greenaall.models.ex.entity.Tramitador;
import com.greenaall.models.ex.entity.enums.EnumEstadoMensaje;
import com.greenaall.models.ex.entity.enums.EnumEstadoTramitacion;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.MensajeServiceImpl;
import com.greenaall.models.ex.service.TramitadorServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class MensajeController {
	
	@Autowired
    private MensajeServiceImpl serviceMensaje;
	
	@Autowired
    private OrganizacionUsuarioServiceImpl serviceOrgUsuario;
	
	@Autowired
	private TramitadorServiceImpl serviceTramitador;
	
	@Autowired
    private OrganizacionUsuarioServiceImpl serviceOrganizacionUsuario;
	
	@Autowired
    private ExpedienteServiceImpl serviceExpediente;
	
	@GetMapping("/mensaje/listarPorEstadoDestinatario/{estado}/{idOrgUsuar}")
	public List<MensajeDto> listarEnviados(@PathVariable String eatado, @PathVariable Long idOrgUsuar) {
		List<Mensaje> aMensajes = serviceMensaje.findByEstadoAndDestinatario(eatado, idOrgUsuar);
		List<MensajeDto> aMensajeDto = new ArrayList<MensajeDto>();
		
		if(aMensajes == null || aMensajes.isEmpty()) {
			 return aMensajeDto;
		}
		
		for(int i = 0; i < aMensajes.size(); i++) {
			MensajeDto oMensajeDtoNew = new MensajeDto();
			if(aMensajes.get(i).getDescripcion() != null) {
				oMensajeDtoNew.setDescripcion(aMensajes.get(i).getDescripcion());
			}
			
			if(aMensajes.get(i).getEstado() != null) {
				oMensajeDtoNew.setEstado(aMensajes.get(i).getEstado());
			}
			
			if(aMensajes.get(i).getDescripcionRechazo() != null) {
				oMensajeDtoNew.setDescripcionRechazo(aMensajes.get(i).getDescripcionRechazo());
			}
			
			if(aMensajes.get(i).getFecEnvio() != null) {
				oMensajeDtoNew.setFecEnvio(aMensajes.get(i).getFecEnvio());
			}
			
			if(aMensajes.get(i).getFecEnvio() != null) {
				oMensajeDtoNew.setFecEnvio(aMensajes.get(i).getFecEnvio());
			}
			
			if(aMensajes.get(i).getFecLectura() != null) {
				oMensajeDtoNew.setFecLectura(aMensajes.get(i).getFecLectura());
			}
			
			if(aMensajes.get(i).getFecRechazo() != null) {
				oMensajeDtoNew.setFecRechazo(aMensajes.get(i).getFecRechazo());
			}
			
			if(aMensajes.get(i).getFecTramitacion() != null) {
				oMensajeDtoNew.setFecTramitacion(aMensajes.get(i).getFecTramitacion());
			}
			
			if(aMensajes.get(i).getIdExped() != null) {
				oMensajeDtoNew.setIdExped(aMensajes.get(i).getIdExped());
			}
			
			if(aMensajes.get(i).getDestinatario() != null) {
				OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(aMensajes.get(i).getDestinatario());
				if(oOrgUsuar != null) {
					oMensajeDtoNew.setNomDesti(oOrgUsuar.getUsuario());
				}
			}
			
			if(aMensajes.get(i).getRemitente() != null) {
				OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(aMensajes.get(i).getRemitente());
				if(oOrgUsuar != null) {
					oMensajeDtoNew.setNomRemit(null);
				}
			}
			
			if(aMensajes.get(i).getId() != null) {
				oMensajeDtoNew.setId(aMensajes.get(i).getId());
			}
			
			aMensajeDto.add(oMensajeDtoNew);
		}
		
		return aMensajeDto;	
	}
	
	@GetMapping("/mensaje/listarEnviados/{idOrgUsuar}")
	public List<MensajeDto> listarEnviados(@PathVariable Long idOrgUsuar) {
		
		List<Mensaje> aMensajes = serviceMensaje.findByRemitente(idOrgUsuar);
		List<MensajeDto> aMensajeDto = new ArrayList<MensajeDto>();
		
		if(aMensajes == null || aMensajes.isEmpty()) {
			 return aMensajeDto;
		}
		
		for(int i = 0; i < aMensajes.size(); i++) {
			MensajeDto oMensajeDtoNew = new MensajeDto();
			if(aMensajes.get(i).getDescripcion() != null) {
				oMensajeDtoNew.setDescripcion(aMensajes.get(i).getDescripcion());
			}
			
			if(aMensajes.get(i).getEstado() != null) {
				oMensajeDtoNew.setEstado(aMensajes.get(i).getEstado());
			}
			
			if(aMensajes.get(i).getDescripcionRechazo() != null) {
				oMensajeDtoNew.setDescripcionRechazo(aMensajes.get(i).getDescripcionRechazo());
			}
			
			if(aMensajes.get(i).getFecEnvio() != null) {
				oMensajeDtoNew.setFecEnvio(aMensajes.get(i).getFecEnvio());
			}
			
			if(aMensajes.get(i).getFecEnvio() != null) {
				oMensajeDtoNew.setFecEnvio(aMensajes.get(i).getFecEnvio());
			}
			
			if(aMensajes.get(i).getFecLectura() != null) {
				oMensajeDtoNew.setFecLectura(aMensajes.get(i).getFecLectura());
			}
			
			if(aMensajes.get(i).getFecRechazo() != null) {
				oMensajeDtoNew.setFecRechazo(aMensajes.get(i).getFecRechazo());
			}
			
			if(aMensajes.get(i).getFecTramitacion() != null) {
				oMensajeDtoNew.setFecTramitacion(aMensajes.get(i).getFecTramitacion());
			}
			
			if(aMensajes.get(i).getIdExped() != null) {
				oMensajeDtoNew.setIdExped(aMensajes.get(i).getIdExped());
			}
			
			if(aMensajes.get(i).getDestinatario() != null) {
				OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(aMensajes.get(i).getDestinatario());
				if(oOrgUsuar != null) {
					oMensajeDtoNew.setNomDesti(oOrgUsuar.getUsuario());
				}
			}
			
			if(aMensajes.get(i).getRemitente() != null) {
				OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(aMensajes.get(i).getRemitente());
				if(oOrgUsuar != null) {
					oMensajeDtoNew.setNomRemit(null);
				}
			}
			
			if(aMensajes.get(i).getId() != null) {
				oMensajeDtoNew.setId(aMensajes.get(i).getId());
			}
			
			aMensajeDto.add(oMensajeDtoNew);
		}
		
		return aMensajeDto;	
	}
	
	@GetMapping("/mensaje/listarRecibidos/{idOrgUsuar}")
	public List<MensajeDto> listarRecibidos(@PathVariable Long idOrgUsuar) {
		
		List<Mensaje> aMensajes = serviceMensaje.findByDestinatario(idOrgUsuar);
		List<MensajeDto> aMensajeDto = new ArrayList<MensajeDto>();
		
		if(aMensajes == null || aMensajes.isEmpty()) {
			 return aMensajeDto;
		}
		
		for(int i = 0; i < aMensajes.size(); i++) {
			MensajeDto oMensajeDtoNew = new MensajeDto();
			if(aMensajes.get(i).getDescripcion() != null) {
				oMensajeDtoNew.setDescripcion(aMensajes.get(i).getDescripcion());
			}
			
			if(aMensajes.get(i).getEstado() != null) {
				oMensajeDtoNew.setEstado(aMensajes.get(i).getEstado());
			}
			
			if(aMensajes.get(i).getDescripcionRechazo() != null) {
				oMensajeDtoNew.setDescripcionRechazo(aMensajes.get(i).getDescripcionRechazo());
			}
			
			if(aMensajes.get(i).getFecEnvio() != null) {
				oMensajeDtoNew.setFecEnvio(aMensajes.get(i).getFecEnvio());
			}
			
			if(aMensajes.get(i).getFecEnvio() != null) {
				oMensajeDtoNew.setFecEnvio(aMensajes.get(i).getFecEnvio());
			}
			
			if(aMensajes.get(i).getFecLectura() != null) {
				oMensajeDtoNew.setFecLectura(aMensajes.get(i).getFecLectura());
			}
			
			if(aMensajes.get(i).getFecRechazo() != null) {
				oMensajeDtoNew.setFecRechazo(aMensajes.get(i).getFecRechazo());
			}
			
			if(aMensajes.get(i).getFecTramitacion() != null) {
				oMensajeDtoNew.setFecTramitacion(aMensajes.get(i).getFecTramitacion());
			}
			
			if(aMensajes.get(i).getDestinatario() != null) {
				OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(aMensajes.get(i).getDestinatario());
				if(oOrgUsuar != null) {
					oMensajeDtoNew.setNomDesti(oOrgUsuar.getUsuario());
				}
			}
			
			if(aMensajes.get(i).getRemitente() != null) {
				OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(aMensajes.get(i).getRemitente());
				if(oOrgUsuar != null) {
					oMensajeDtoNew.setNomRemit(oOrgUsuar.getUsuario());
				}
			}
			
			if(aMensajes.get(i).getId() != null) {
				oMensajeDtoNew.setId(aMensajes.get(i).getId());
			}
			
			if(aMensajes.get(i).getIdExped() != null) {
				oMensajeDtoNew.setIdExped(aMensajes.get(i).getIdExped());
			}
			
			aMensajeDto.add(oMensajeDtoNew);
		}
		
		return aMensajeDto;	
	}
	
	@PostMapping("/mensaje/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Mensaje crear(@RequestBody MensajeDto mensajeDto) {
		
		OrganizacionUsuario oOrganizacionUsuario;
		List<Tramitador> oTramitadorBus;
		
		if(mensajeDto.getDestinatario() != null && mensajeDto.getUsuContr() != null && mensajeDto.getDestinatario().equals( mensajeDto.getUsuContr()))  {
			throw new ErrorMailDestinatarioException();
		}
		
		if(mensajeDto.getDestinatario() != null && mensajeDto.getIdExped() != null)  {
			Expediente oExpediente = serviceExpediente.findById(mensajeDto.getIdExped());
			if(oExpediente != null && oExpediente.getInstructor().equals(mensajeDto.getDestinatario())) {
				throw new ErrorMailDestinatarioException();
			}
		}
		
		if(mensajeDto.getDestinatario() != null) {
			oOrganizacionUsuario =  serviceOrganizacionUsuario.findById(mensajeDto.getDestinatario());
		}else {
			throw new FaltanDatosException();
		}
		
		if(mensajeDto.getIdExped() != null && oOrganizacionUsuario.getUsuario() != null) {
			oTramitadorBus = serviceTramitador.findByExpedienteAndPosesionAndEstado(mensajeDto.getIdExped(), oOrganizacionUsuario.getUsuario());
		}else {
			throw new FaltanDatosException();
		}
		
		if(oTramitadorBus != null && !oTramitadorBus.isEmpty()) {
			throw new TramitadorPoseeException();
		}
		
		Mensaje mensaje = new Mensaje();
		
		if(mensajeDto.getDescripcion() != null) {
			mensaje.setDescripcion(mensajeDto.getDescripcion());
		}else {
			throw new NoDescripcionException();
		}
		
		if(mensajeDto.getDescripcionRechazo() != null) {
			mensaje.setDescripcionRechazo(mensajeDto.getDescripcionRechazo());
		}		
		
		if(mensajeDto.getFecEnvio() != null) {
			mensaje.setFecEnvio(mensajeDto.getFecEnvio());
		}
		
		if(mensajeDto.getFecEnvio() != null) {
			mensaje.setFecEnvio(mensajeDto.getFecEnvio());
		}
		
		if(mensajeDto.getFecLectura() != null) {
			mensaje.setFecLectura(mensajeDto.getFecLectura());
		}
		
		if(mensajeDto.getFecRechazo() != null) {
			mensaje.setFecRechazo(mensajeDto.getFecRechazo());
		}
		
		if(mensajeDto.getFecTramitacion() != null) {
			mensaje.setFecTramitacion(mensajeDto.getFecTramitacion());
		}
		
		if(mensajeDto.getIdExped() != null) {
			/*TareaTramiteExpediente oTarTraExp = serviceTareaTramiteExpediente.findById(mensajeDto.getIdTarea());
			if(oTarTraExp != null) {
				mensaje.setRemitente(oTarTraExp.getTramitador());
			}*/
			mensaje.setIdExped(mensajeDto.getIdExped());
		}
		
		if(mensajeDto.getRemitente() != null) {
			mensaje.setRemitente(mensajeDto.getRemitente());
		}
		
		if(mensajeDto.getDestinatario() != null) {
			mensaje.setDestinatario(mensajeDto.getDestinatario());
		}
		
		mensaje.setFecContr(new java.util.Date());
		
		if(mensajeDto.getEstado() != null) {
			mensaje.setEstado(mensajeDto.getEstado());
		}else {
			mensaje.setEstado(EnumEstadoMensaje.PENDIENTE);
		}
		
		serviceMensaje.save(mensaje);
		
		return mensaje;
	}
	
	@DeleteMapping("/mensaje/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		Mensaje mensaje = serviceMensaje.findById(id);
		if (mensaje == null) {
    	  throw new NoDataFoundException();
    	  
		}
		serviceMensaje.deleteById(mensaje.getId());
    }
	
	@PutMapping("/mensaje/tramitar/{idMensaje}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mensaje tramitar(@PathVariable Long idMensaje) {
				
		Mensaje mensajeDB = serviceMensaje.findById(idMensaje);
		mensajeDB.setFecContr(new Date());
		mensajeDB.setEstado(EnumEstadoMensaje.TRAMITANDO);
		mensajeDB.setFecTramitacion(new Date());
		if(mensajeDB.getFecLectura() == null) {
			mensajeDB.setFecLectura(new Date());
		}
		
		OrganizacionUsuario oOrganizacionUsuario =  serviceOrganizacionUsuario.findById(mensajeDB.getDestinatario());
		
		Tramitador oTramitador = new Tramitador();
		oTramitador.setPosesion(Short.valueOf((short)1));
		oTramitador.setEstadoTramitacion(EnumEstadoTramitacion.TRAMITANDO);
		oTramitador.setExpediente(mensajeDB.getIdExped());
		oTramitador.setFecAsignacion(new Date());
		oTramitador.setFecContr(new Date());
		oTramitador.setUsuario(oOrganizacionUsuario.getUsuario());
		oTramitador.setUsuContr(oOrganizacionUsuario.getUsuario());
		serviceTramitador.save(oTramitador);
		
		return serviceMensaje.save(mensajeDB);
	}
	
	
	@PutMapping("/mensaje/rechazar/{idMensaje}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mensaje rechazar(@RequestBody MensajeDto mensajeDto, @PathVariable Long idMensaje) {
		
		Mensaje mensajeDB = serviceMensaje.findById(idMensaje);
		mensajeDB.setFecContr(new Date());
		mensajeDB.setEstado(EnumEstadoMensaje.RECHAZADO);
		mensajeDB.setDescripcionRechazo(mensajeDto.getDescripcionRechazo());
		mensajeDB.setFecRechazo(new Date());
		if(mensajeDB.getFecLectura() == null) {
			mensajeDB.setFecLectura(new Date());
		}
		return serviceMensaje.save(mensajeDB);
	}
	
	@PutMapping("/mensaje/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mensaje editar(@RequestBody MensajeDto mensaje, @PathVariable Long id) {
		Mensaje mensajeDB = serviceMensaje.findById(id);
		mensajeDB.setFecContr(new Date());
		
		if(mensaje.getDescripcion() != null) {
			mensajeDB.setDescripcion(mensaje.getDescripcion());
		}
		
		if(mensaje.getDescripcionRechazo() != null) {
			mensajeDB.setDescripcionRechazo(mensaje.getDescripcionRechazo());
		}
		
		if(mensaje.getDestinatario() != null) {
			mensajeDB.setDestinatario(mensaje.getDestinatario());
		}
		
		if(mensaje.getEstado() != null) {
			mensajeDB.setEstado(mensaje.getEstado());
		}
		
		if(mensaje.getFecEnvio() != null) {
			mensajeDB.setFecEnvio(mensaje.getFecEnvio());
		}
		
		if(mensaje.getFecLectura() != null) {
			mensajeDB.setFecLectura(mensaje.getFecLectura());
		}
		
		if(mensaje.getFecRechazo() != null) {
			mensajeDB.setFecRechazo(mensaje.getFecRechazo());
		}
		
		if(mensaje.getFecTramitacion() != null) {
			mensajeDB.setFecTramitacion(mensaje.getFecTramitacion());
		}
		
		if(mensaje.getFecTramitacion() != null) {
			mensajeDB.setFecTramitacion(mensaje.getFecTramitacion());
		}
		
		if(mensaje.getFecTramitacion() != null) {
			mensajeDB.setFecTramitacion(mensaje.getFecTramitacion());
		}
		
		if(mensaje.getIdExped() != null) {
			mensajeDB.setIdExped(mensaje.getIdExped());
		}
		
		if(mensaje.getRemitente() != null) {
			mensajeDB.setRemitente(mensaje.getRemitente());
		}
		
		if(mensaje.getUsuContr() != null) {
			mensajeDB.setUsuContr(mensaje.getUsuContr());
		}
		
		if(mensaje.getEstado() != null) {
			mensajeDB.setEstado(mensaje.getEstado());
		}
		
		return serviceMensaje.save(mensajeDB);	
	}
	
	@GetMapping("/mensaje/ver/{id}")
	public MensajeDto detalle(@PathVariable Long id) {
		Mensaje mensaje = serviceMensaje.findById(id);
		
		if (mensaje == null) {
			throw new NoDataFoundException();    	  
		}
		
		MensajeDto oMensajeDtoNew = new MensajeDto();
		
		if(mensaje.getDescripcion() != null) {
			oMensajeDtoNew.setDescripcion(mensaje.getDescripcion());
		}
		
		if(mensaje.getEstado() != null) {
			oMensajeDtoNew.setEstado(mensaje.getEstado());
		}
		
		if(mensaje.getDescripcionRechazo() != null) {
			oMensajeDtoNew.setDescripcionRechazo(mensaje.getDescripcionRechazo());
		}
		
		if(mensaje.getFecEnvio() != null) {
			oMensajeDtoNew.setFecEnvio(mensaje.getFecEnvio());
		}
		
		if(mensaje.getFecEnvio() != null) {
			oMensajeDtoNew.setFecEnvio(mensaje.getFecEnvio());
		}
		
		if(mensaje.getFecLectura() != null) {
			oMensajeDtoNew.setFecLectura(mensaje.getFecLectura());
		}
		
		if(mensaje.getFecRechazo() != null) {
			oMensajeDtoNew.setFecRechazo(mensaje.getFecRechazo());
		}
		
		if(mensaje.getFecTramitacion() != null) {
			oMensajeDtoNew.setFecTramitacion(mensaje.getFecTramitacion());
		}
		
		if(mensaje.getDestinatario() != null) {
			OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(mensaje.getDestinatario());
			if(oOrgUsuar != null) {
				oMensajeDtoNew.setNomDesti(oOrgUsuar.getUsuario());
			}
		}
		
		if(mensaje.getRemitente() != null) {
			OrganizacionUsuario oOrgUsuar = serviceOrgUsuario.findById(mensaje.getRemitente());
			if(oOrgUsuar != null) {
				oMensajeDtoNew.setNomRemit(null);
			}
		}
		
		if(mensaje.getId() != null) {
			oMensajeDtoNew.setId(mensaje.getId());
		}
		
		return oMensajeDtoNew;
	}

}
