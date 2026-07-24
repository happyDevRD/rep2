package com.greenaall.pe.notificacion;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.ErrorEnvioEmail;
import com.greenaall.exception.FaltanDatosException;
import com.greenaall.exception.NotificacionExistenteException;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.gf.entity.GfMotivoNotificacion;
import com.greenaall.models.gf.service.MotivoNotificacionServiceImpl;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.NotificacionServiceImpl;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.pe.dto.NotificacionDto;
import com.greenaall.util.Fecha;
import com.greenaall.util.Utiles;

/**
 * Casos de uso de orquestación extraídos de {@code NotificacionController}:
 * alta de una notificación asociada a una tarea de trámite, y edición de una
 * notificación existente (con el correspondiente aviso por email al
 * interesado cuando procede).
 */
@Service
public class NotificacionApplicationService {

	@Autowired
	private NotificacionServiceImpl service;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private MotivoNotificacionServiceImpl serviceMotivoNotificacion;

	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;

	@Autowired
	private InteresadoServiceImpl serviceInteresado;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;

	@Autowired
	private IArchivoService archivoService;

	public Notificacion crear(NotificacionDto notificacionDto, Long tarea) {

		TareaTramiteExpediente oTarea = serviceTareaTramiteExpediente.findById(tarea);

		if (oTarea != null && oTarea.getNotificacion() != null) {
			throw new NotificacionExistenteException();
		}

		if (notificacionDto == null) {
			throw new FaltanDatosException();
		}

		Notificacion oNotificacion = new Notificacion();

		if (notificacionDto.getBloque() != null) {
			oNotificacion.setBloque(notificacionDto.getBloque());
		}
		if (notificacionDto.getBop() != null) {
			oNotificacion.setBop(notificacionDto.getBop());
		}

		oNotificacion.setCodArchi(oTarea.getArchivo());
		byte[] fileContent;
		Archivo oArchivo = archivoService.findById(oTarea.getArchivo());
		try {
			File file = new File(oArchivo.getDesArchi());
			fileContent = Files.readAllBytes(file.toPath());
			oArchivo.setArcExpd(fileContent);
			archivoService.save(oArchivo);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (notificacionDto.getCodArchiAcuse() != null) {
			oNotificacion.setCodArchiAcuse(notificacionDto.getCodArchiAcuse());
		}
		if (notificacionDto.getCodMunic() != null) {
			oNotificacion.setCodMunic(notificacionDto.getCodMunic());
		}
		if (notificacionDto.getCodPosta() != null) {
			oNotificacion.setCodPosta(notificacionDto.getCodPosta());
		}
		if (notificacionDto.getCodProvi() != null) {
			oNotificacion.setCodProvi(notificacionDto.getCodProvi());
		}
		if (notificacionDto.getDesVial() != null) {
			oNotificacion.setDesVial(notificacionDto.getDesVial());
		}
		if (notificacionDto.getDomicilio() != null) {
			oNotificacion.setDomicilio(notificacionDto.getDomicilio());
		}
		if (notificacionDto.getEjeExped() != null) {
			oNotificacion.setEjeExped(notificacionDto.getEjeExped());
		}

		if (notificacionDto.getEjeNotif() != null) {
			BigDecimal numNotif = service.max(notificacionDto.getEjeNotif());
			if (numNotif != null && !numNotif.equals(new BigDecimal("0"))) {
				numNotif = numNotif.add(new BigDecimal("1"));
				oNotificacion.setNumNotif(Integer.valueOf(numNotif.intValue()));
			} else {
				oNotificacion.setNumNotif(Integer.valueOf((int) 1));
			}
			oNotificacion.setEjeNotif(notificacionDto.getEjeNotif());

		} else {
			Date oFechaHoy = new Date();
			SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
			String currentYear = getYearFormat.format(oFechaHoy);
			BigDecimal numNotif = service.max(Short.parseShort(currentYear));
			if (numNotif != null && !numNotif.equals(new BigDecimal("0"))) {
				numNotif = numNotif.add(new BigDecimal("1"));
				oNotificacion.setNumNotif(Integer.valueOf(numNotif.intValue()));
			} else {
				oNotificacion.setNumNotif(Integer.valueOf((int) 1));
			}
			oNotificacion.setEjeNotif(Short.parseShort(currentYear));

		}
		if (notificacionDto.getEscalera() != null) {
			oNotificacion.setEscalera(notificacionDto.getEscalera());
		}
		if (notificacionDto.getFecArchi() != null) {
			oNotificacion.setFecArchi(notificacionDto.getFecArchi());
		}
		if (notificacionDto.getFecCaduc() != null) {
			oNotificacion.setFecCaduc(notificacionDto.getFecCaduc());
		}
		if (notificacionDto.getFecEmiBop() != null) {
			oNotificacion.setFecEmiBop(notificacionDto.getFecEmiBop());
		}
		if (notificacionDto.getFecEnvio() != null) {
			oNotificacion.setFecEnvio(notificacionDto.getFecEnvio());
		}
		if (notificacionDto.getFecNotif() != null) {
			oNotificacion.setFecNotif(notificacionDto.getFecNotif());
		} else {
			oNotificacion.setFecNotif(new Date());
		}
		if (notificacionDto.getFecPubBop() != null) {
			oNotificacion.setFecPubBop(notificacionDto.getFecPubBop());
		}
		if (notificacionDto.getFecRecNotif() != null) {
			oNotificacion.setFecRecNotif(notificacionDto.getFecRecNotif());
		}
		if (notificacionDto.getFecRegistSalid() != null) {
			oNotificacion.setFecRegistSalid(notificacionDto.getFecRegistSalid());
		}
		if (notificacionDto.getForNotif() != null) {
			oNotificacion.setForNotif(notificacionDto.getForNotif());
		} else {
			Integer numExped = Integer.parseInt(notificacionDto.getNumExped());
			Expediente oExpediente = serviceExpediente.findByEjercicioAndNumero(notificacionDto.getEjeExped(), numExped);
			if (oExpediente != null) {
				List<Interesado> aInteresado = serviceInteresado.findByExpedienteAndIdHisPerso(oExpediente.getId(), notificacionDto.getIdHisPerso());
				if (aInteresado != null && aInteresado.size() > 0) {
					oNotificacion.setForNotif(aInteresado.get(0).getForNotif());
				}
			}
		}
		if (notificacionDto.getIdHisRepre() != null) {
			oNotificacion.setIdHisPerso((notificacionDto.getIdHisRepre()));
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(notificacionDto.getIdHisRepre());
			oPersonaEntidadPK.setIdPerso(notificacionDto.getIdRepre());
			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
			if (oPersonaEntidad != null && oPersonaEntidad.getCodProvi() > 0 && oPersonaEntidad.getCodMunic() > 0) {
				oNotificacion.setCodProvi(oPersonaEntidad.getCodProvi());
				oNotificacion.setCodMunic(oPersonaEntidad.getCodMunic());
				if (oNotificacion.getDomicilio() == null) {
					oNotificacion.setDomicilio(oPersonaEntidad.getDirPosta());
				}
				if (oNotificacion.getCodPosta() == null) {
					oNotificacion.setCodPosta(oPersonaEntidad.getCodPosta());
				}
			}
		} else if (notificacionDto.getIdHisPerso() != null) {
			oNotificacion.setIdHisPerso((notificacionDto.getIdHisPerso()));
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(notificacionDto.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(notificacionDto.getIdPerso());
			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
			if (oPersonaEntidad != null && oPersonaEntidad.getCodProvi() > 0 && oPersonaEntidad.getCodMunic() > 0) {
				oNotificacion.setCodProvi(oPersonaEntidad.getCodProvi());
				oNotificacion.setCodMunic(oPersonaEntidad.getCodMunic());
				if (oNotificacion.getDomicilio() == null) {
					oNotificacion.setDomicilio(oPersonaEntidad.getDirPosta());
				}
				if (oNotificacion.getCodPosta() == null) {
					oNotificacion.setCodPosta(oPersonaEntidad.getCodPosta());
				}
			}
		}
		if (notificacionDto.getIdPerso() != null) {
			oNotificacion.setIdPerso((notificacionDto.getIdPerso()));
		}
		if (notificacionDto.getLetInfer() != null) {
			oNotificacion.setLetInfer(notificacionDto.getLetInfer());
		}
		if (notificacionDto.getLocalidad() != null) {
			oNotificacion.setLocalidad(notificacionDto.getLocalidad());
		}
		if (notificacionDto.getMotNotif() != null) {
			oNotificacion.setMotNotif(notificacionDto.getMotNotif());
		}
		if (notificacionDto.getNotificador() != null && notificacionDto.getNotificador() != Short.valueOf((short) 0)) {
			oNotificacion.setNotificador(notificacionDto.getNotificador());
		}
		if (notificacionDto.getNumBop() != null) {
			oNotificacion.setNumBop(notificacionDto.getNumBop());
		}
		if (notificacionDto.getNumEnvioTeu() != null) {
			oNotificacion.setNumEnvioTeu(notificacionDto.getNumEnvioTeu());
		}

		if (notificacionDto.getNumExped() != null) {
			oNotificacion.setNumExped(notificacionDto.getNumExped());
		}
		if (notificacionDto.getNumInfer() != null) {
			oNotificacion.setNumInfer(notificacionDto.getNumInfer());
		}
		if (notificacionDto.getNumRegisSalid() != null) {
			oNotificacion.setNumRegisSalid(notificacionDto.getNumRegisSalid());
		}
		if (notificacionDto.getObservacion() != null) {
			oNotificacion.setObservacion(notificacionDto.getObservacion());
		}
		if (notificacionDto.getPlanta() != null) {
			oNotificacion.setPlanta(notificacionDto.getPlanta());
		}
		if (notificacionDto.getPortal() != null) {
			oNotificacion.setPortal(notificacionDto.getPortal());
		}
		if (notificacionDto.getPuerta() != null) {
			oNotificacion.setPuerta(notificacionDto.getPuerta());
		}
		if (notificacionDto.getReceptor() != null) {
			oNotificacion.setReceptor(notificacionDto.getReceptor());
		}

		oNotificacion.setSituacion(Short.valueOf((short) 1));

		if (notificacionDto.getTipVial() != null) {
			oNotificacion.setTipVial(notificacionDto.getTipVial());
		}
		oNotificacion.setCodEntid(Short.valueOf((short) 1));
		oNotificacion.setImpCosta(new BigDecimal("0.00"));
		oNotificacion.setTotDeuda(new BigDecimal("0.00"));

		if (oNotificacion.getBop() == null) {
			oNotificacion.setBop(Short.valueOf((short) 0));
		}
		oNotificacion.setNumEnvioTeu(Long.valueOf((long) 0));
		oNotificacion.setCodArchiAcuse(Long.valueOf((long) 0));
		oNotificacion.setModulo(Short.valueOf((short) 22));
		oNotificacion.setFecContr(new Date());

		Notificacion oNotificacionNew = service.save(oNotificacion);
		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(tarea);
		oTareaTramiteExpediente.setNotificacion(oNotificacionNew.getIdNotif());
		TareaTramiteExpediente oTareaNueva = serviceTareaTramiteExpediente.save(oTareaTramiteExpediente);

		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();

		if (oTarea.getArchivo() != null) {
			oTareaHistorio.setCodArchi(oTareaNueva.getArchivo());
		}

		oTareaHistorio.setDesIndic("Generada Notificación " + oNotificacionNew.getEjeNotif().toString() + "/" + oNotificacionNew.getNumNotif().toString());
		oTareaHistorio.setDesTarea(oTareaNueva.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTarea.getFecInicio());
		oTareaHistorio.setTarea(oTarea.getId());
		oTareaHistorio.setUsuario(oTarea.getUsuario());
		oTareaHistorio.setUsuContr(oTarea.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);

		return oNotificacionNew;
	}

	public NotificacionDto editar(Notificacion notificacion) {

		Notificacion oNotDtoNew = service.findById(notificacion.getIdNotif());
		NotificacionDto oNotifDto = new NotificacionDto();

		if (notificacion.getBloque() != null) {
			oNotDtoNew.setBloque(notificacion.getBloque());
			oNotifDto.setBloque(notificacion.getBloque());
		}
		if (notificacion.getBop() != null) {
			oNotDtoNew.setBop(notificacion.getBop());
			oNotifDto.setBop(notificacion.getBop());
			if (notificacion.getBop().equals(Short.valueOf("0"))) {
				oNotifDto.setDesBop("N/A");
			} else if (notificacion.getBop().equals(Short.valueOf("1"))) {
				oNotifDto.setDesBop("ENVIADO");
			} else if (notificacion.getBop().equals(Short.valueOf("2"))) {
				oNotifDto.setDesBop("PUBLICADO");
			} else {
				oNotifDto.setDesBop("N/A");
			}
		}
		if (notificacion.getCodArchi() != null) {
			oNotDtoNew.setCodArchi(notificacion.getCodArchi());
			oNotifDto.setCodArchi(notificacion.getCodArchi());
		}
		if (notificacion.getCodArchiAcuse() != null) {
			oNotDtoNew.setCodArchiAcuse(notificacion.getCodArchiAcuse());
			oNotifDto.setCodArchiAcuse(notificacion.getCodArchiAcuse());
		}
		if (notificacion.getCodMunic() != null) {
			oNotDtoNew.setCodMunic(notificacion.getCodMunic());
			oNotifDto.setCodMunic(notificacion.getCodMunic());
		}
		if (notificacion.getCodPosta() != null) {
			oNotDtoNew.setCodPosta(notificacion.getCodPosta());
			oNotifDto.setCodPosta(notificacion.getCodPosta());
		}
		if (notificacion.getCodProvi() != null) {
			oNotDtoNew.setCodProvi(notificacion.getCodProvi());
			oNotifDto.setCodProvi(notificacion.getCodProvi());
		}
		if (notificacion.getDesVial() != null) {
			oNotDtoNew.setDesVial(notificacion.getDesVial());
			oNotifDto.setDesVial(notificacion.getDesVial());
		}
		if (notificacion.getDomicilio() != null) {
			oNotDtoNew.setDomicilio(notificacion.getDomicilio());
			oNotifDto.setDomicilio(notificacion.getDomicilio());
		}
		if (notificacion.getEjeExped() != null) {
			oNotDtoNew.setEjeExped(notificacion.getEjeExped());
			oNotifDto.setEjeExped(notificacion.getEjeExped());
		}
		if (notificacion.getEjeNotif() != null) {
			oNotDtoNew.setEjeNotif(notificacion.getEjeNotif());
			oNotifDto.setEjeNotif(notificacion.getEjeNotif());
		}

		if (notificacion.getEscalera() != null) {
			oNotDtoNew.setEscalera(notificacion.getEscalera());
			oNotifDto.setEscalera(notificacion.getEscalera());
		}

		if (notificacion.getFecArchi() != null) {
			oNotDtoNew.setFecArchi(notificacion.getFecArchi());
			oNotifDto.setFecArchi(notificacion.getFecArchi());
		}

		if (notificacion.getFecArchi() == null && oNotDtoNew.getFecArchi() != null) {
			oNotDtoNew.setFecArchi(null);
			oNotifDto.setFecArchi(null);
		}

		if (notificacion.getFecCaduc() != null) {
			oNotDtoNew.setFecCaduc(notificacion.getFecCaduc());
			oNotifDto.setFecCaduc(notificacion.getFecCaduc());
		}

		if (notificacion.getFecCaduc() == null && oNotDtoNew.getFecCaduc() != null) {
			oNotDtoNew.setFecCaduc(null);
			oNotifDto.setFecCaduc(null);
		}

		if (notificacion.getFecEmiBop() != null) {
			oNotDtoNew.setFecEmiBop(notificacion.getFecEmiBop());
			oNotifDto.setFecEmiBop(notificacion.getFecEmiBop());
		}

		if (notificacion.getFecEmiBop() == null && oNotDtoNew.getFecEmiBop() != null) {
			oNotDtoNew.setFecEmiBop(null);
			oNotifDto.setFecEmiBop(null);
		}

		if (notificacion.getFecEnvio() != null) {
			oNotDtoNew.setFecEnvio(notificacion.getFecEnvio());
			oNotifDto.setFecEnvio(notificacion.getFecEnvio());
		}

		if (notificacion.getFecEnvio() == null && oNotDtoNew.getFecEnvio() != null) {
			oNotDtoNew.setFecEnvio(null);
			oNotifDto.setFecEnvio(null);
		}

		if (notificacion.getFecNotif() != null) {
			oNotDtoNew.setFecNotif(notificacion.getFecNotif());
			oNotifDto.setFecNotif(notificacion.getFecNotif());
		}

		/*
		 * if(notificacion.getFecNotif() == null && oNotDtoNew.getFecNotif() != null) {
		 * oNotDtoNew.setFecNotif(null); oNotifDto.setFecNotif(null); }
		 */

		if (notificacion.getFecRecNotif() != null) {
			oNotDtoNew.setFecRecNotif(notificacion.getFecRecNotif());
			oNotifDto.setFecRecNotif(notificacion.getFecRecNotif());
		}

		if (notificacion.getFecRecNotif() == null && oNotDtoNew.getFecRecNotif() != null) {
			oNotDtoNew.setFecRecNotif(null);
			oNotifDto.setFecRecNotif(null);
		}

		if (notificacion.getFecPubBop() == null && oNotDtoNew.getFecPubBop() != null) {
			oNotDtoNew.setFecPubBop(null);
			oNotifDto.setFecPubBop(null);
		}

		if (notificacion.getFecPubBop() != null) {
			oNotDtoNew.setFecPubBop(notificacion.getFecPubBop());
			oNotifDto.setFecPubBop(notificacion.getFecPubBop());

			if (notificacion.getBop() != null && notificacion.getBop().equals(Short.valueOf((short) 2))) {
				ParametroSistemaPK oParametroSistemaPk4265 = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
						"es", Short.valueOf((short) 4265));
				ParametroSistema oParametroSistema4265 = parametroSistemaService.findById(oParametroSistemaPk4265);
				if (oParametroSistema4265 != null && oParametroSistema4265.getValor() != null) {
					Date oFecha = Fecha.sumaDias(new Date(), Integer.parseInt(oParametroSistema4265.getValor().trim()));
					oNotDtoNew.setFecRecNotif(oFecha);
					oNotifDto.setFecRecNotif(oFecha);
				} else {
					oNotDtoNew.setFecRecNotif(new Date());
					oNotifDto.setFecRecNotif(new Date());
				}
			}
		}

		if (notificacion.getFecRegistSalid() != null) {
			oNotDtoNew.setFecRegistSalid(notificacion.getFecRegistSalid());
			oNotifDto.setFecRegistSalid(notificacion.getFecRegistSalid());
		}

		if (notificacion.getFecRegistSalid() == null && oNotDtoNew.getFecRegistSalid() != null) {
			oNotDtoNew.setFecRegistSalid(null);
			oNotifDto.setFecRegistSalid(null);
		}

		if (notificacion.getForNotif() != null) {
			oNotDtoNew.setForNotif(notificacion.getForNotif());
			oNotifDto.setForNotif(notificacion.getForNotif());
		}
		if (notificacion.getIdHisPerso() != null && notificacion.getIdPerso() != null) {
			oNotDtoNew.setIdHisPerso(notificacion.getIdHisPerso());
			oNotifDto.setIdHisPerso(notificacion.getIdHisPerso());
		}
		if (notificacion.getIdPerso() != null) {
			oNotDtoNew.setIdPerso(notificacion.getIdPerso());
			oNotifDto.setIdPerso(notificacion.getIdPerso());
		}
		if (notificacion.getIdNotif() != null) {
			oNotDtoNew.setIdNotif(notificacion.getIdNotif());
			oNotifDto.setIdNotif(notificacion.getIdNotif());
		}
		if (notificacion.getLetInfer() != null) {
			oNotDtoNew.setLetInfer(notificacion.getLetInfer());
			oNotifDto.setLetInfer(notificacion.getLetInfer());
		}
		if (notificacion.getLocalidad() != null) {
			oNotDtoNew.setLocalidad(notificacion.getLocalidad());
			oNotifDto.setLocalidad(notificacion.getLocalidad());
		}
		if (notificacion.getMotNotif() != null) {
			oNotDtoNew.setMotNotif(notificacion.getMotNotif());
			oNotifDto.setMotNotif(notificacion.getMotNotif());
			GfMotivoNotificacion oMotivo = serviceMotivoNotificacion.findById(notificacion.getMotNotif());
			if (oMotivo != null) {
				oNotifDto.setDesMotNotif(oMotivo.getDescripcion());
			}
		}
		if (notificacion.getNotificador() != null) {
			oNotDtoNew.setNotificador(notificacion.getNotificador());
			oNotifDto.setNotificador(notificacion.getNotificador());
		}

		if (notificacion.getNumBop() != null) {
			oNotDtoNew.setNumBop(notificacion.getNumBop());
			oNotifDto.setNumBop(notificacion.getNumBop());
		}

		if (notificacion.getNumBop() == null && oNotDtoNew.getNumBop() != null) {
			oNotDtoNew.setNumBop(null);
			oNotifDto.setNumBop(null);
		}

		if (notificacion.getNumEnvioTeu() != null) {
			oNotDtoNew.setNumEnvioTeu(notificacion.getNumEnvioTeu());
			oNotifDto.setNumEnvioTeu(notificacion.getNumEnvioTeu());
		}

		if (notificacion.getNumEnvioTeu() == null && oNotDtoNew.getNumEnvioTeu() != null) {
			oNotDtoNew.setNumEnvioTeu(null);
			oNotifDto.setNumEnvioTeu(null);
		}

		if (notificacion.getNumExped() != null) {
			oNotDtoNew.setNumExped(notificacion.getNumExped());
			oNotifDto.setNumExped(notificacion.getNumExped());
		}
		if (notificacion.getNumInfer() != null) {
			oNotDtoNew.setNumInfer(notificacion.getNumInfer());
			oNotifDto.setNumInfer(notificacion.getNumInfer());
		}
		if (notificacion.getNumNotif() != null) {
			oNotDtoNew.setNumNotif(notificacion.getNumNotif());
			oNotifDto.setNumNotif(notificacion.getNumNotif());
		}
		if (notificacion.getNumRegisSalid() != null) {
			oNotDtoNew.setNumRegisSalid(notificacion.getNumRegisSalid());
			oNotifDto.setNumRegisSalid(notificacion.getNumRegisSalid());
		}
		if (notificacion.getObservacion() != null) {
			oNotDtoNew.setObservacion(notificacion.getObservacion());
			oNotifDto.setObservacion(notificacion.getObservacion());
		}

		if (notificacion.getObservacion() == null && oNotDtoNew.getObservacion() != null) {
			oNotDtoNew.setObservacion(null);
			oNotifDto.setObservacion(null);
		}

		if (notificacion.getPlanta() != null) {
			oNotDtoNew.setPlanta(notificacion.getPlanta());
			oNotifDto.setPlanta(notificacion.getPlanta());
		}
		if (notificacion.getPortal() != null) {
			oNotDtoNew.setPortal(notificacion.getPortal());
			oNotifDto.setPortal(notificacion.getPortal());
		}
		if (notificacion.getPuerta() != null) {
			oNotDtoNew.setPuerta(notificacion.getPuerta());
			oNotifDto.setPuerta(notificacion.getPuerta());
		}
		if (notificacion.getReceptor() != null) {
			oNotDtoNew.setReceptor(notificacion.getReceptor());
			oNotifDto.setReceptor(notificacion.getReceptor());
		}

		if (notificacion.getReceptor() == null && oNotDtoNew.getReceptor() != null) {
			oNotDtoNew.setReceptor(null);
			oNotifDto.setReceptor(null);
		}

		if (notificacion.getSituacion() != null) {
			oNotDtoNew.setSituacion(notificacion.getSituacion());
			oNotifDto.setSituacion(notificacion.getSituacion());
		}
		if (notificacion.getTipVial() != null) {
			oNotDtoNew.setTipVial(notificacion.getTipVial());
			oNotifDto.setTipVial(notificacion.getTipVial());
		}
		Notificacion oNotifActualizada = service.save(oNotDtoNew);

		if (oNotifActualizada.getSituacion().equals(Short.valueOf("2"))
				&& oNotifActualizada.getForNotif().equals(Short.valueOf("1"))
				&& oNotifActualizada.getEjeExped() != null && oNotifActualizada.getNumExped() != null) {
			Integer numExped = Integer.parseInt(oNotifActualizada.getNumExped());
			Expediente oExpediente = serviceExpediente.findByEjercicioAndNumero(oNotifActualizada.getEjeExped(), numExped);
			if (oExpediente != null) {
				List<Interesado> aInteresado = serviceInteresado.findByExpedienteAndIdHisPerso(oExpediente.getId(), oNotifActualizada.getIdHisPerso());
				if (aInteresado != null && aInteresado.size() > 0) {
					if (aInteresado.get(0).getEmailNotif() != null && !aInteresado.get(0).getEmailNotif().equals("")) {
						String sServidor = null;
						String sRemitente = null;
						String sUsuario = null;
						String sPass = null;
						String sPuerto = null;
						String sTarttls = null;
						String sAuth = null;
						String sSocket = null;

						ParametroSistemaPK oParametroSistemaPk51 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 51));
						ParametroSistema oParametroSistema51 = parametroSistemaService.findById(oParametroSistemaPk51);
						if (oParametroSistema51 != null) {
							sServidor = oParametroSistema51.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 51");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk52 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 52));
						ParametroSistema oParametroSistema52 = parametroSistemaService.findById(oParametroSistemaPk52);
						if (oParametroSistema52 != null) {
							sRemitente = oParametroSistema52.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 52");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk53 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 53));
						ParametroSistema oParametroSistema53 = parametroSistemaService.findById(oParametroSistemaPk53);
						if (oParametroSistema53 != null) {
							sUsuario = oParametroSistema53.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 53");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk54 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 54));
						ParametroSistema oParametroSistema54 = parametroSistemaService.findById(oParametroSistemaPk54);
						if (oParametroSistema54 != null) {
							sPass = oParametroSistema54.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 54");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk254 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 254));
						ParametroSistema oParametroSistema254 = parametroSistemaService.findById(oParametroSistemaPk254);
						if (oParametroSistema254 != null) {
							sPuerto = oParametroSistema254.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 254");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk9273 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 9273));
						ParametroSistema oParametroSistema9273 = parametroSistemaService.findById(oParametroSistemaPk9273);
						if (oParametroSistema9273 != null) {
							sTarttls = oParametroSistema9273.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 9273");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk9274 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 9274));
						ParametroSistema oParametroSistema9274 = parametroSistemaService.findById(oParametroSistemaPk9274);
						if (oParametroSistema9274 != null) {
							sAuth = oParametroSistema9274.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 9274");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk9275 = new ParametroSistemaPK(Long.valueOf((long) 0), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 9275));
						ParametroSistema oParametroSistema9275 = parametroSistemaService.findById(oParametroSistemaPk9275);
						if (oParametroSistema9275 != null) {
							sSocket = oParametroSistema9275.getValor();
						} else {
							System.err.println("Falta el parámetro del sistema número 9275");
							throw new ErrorEnvioEmail();
						}

						ParametroSistemaPK oParametroSistemaPk19 = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 19));
						ParametroSistema oParametroSistema19 = parametroSistemaService.findById(oParametroSistemaPk19);
						String entidad = oParametroSistema19.getValor();

						ParametroSistemaPK oParametroSistemaPk9302 = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 9302));
						ParametroSistema oParametroSistema9302 = parametroSistemaService.findById(oParametroSistemaPk9302);
						String urlSede = oParametroSistema9302.getValor();

						String sAsunto = "Notificación de: Ayuntamiento de Greenaall";
						String sCuerpo = "Por el presente correo se le informa que tiene una notificación pendiente del organismo: " + entidad
								+ ". Puede acceder a ella en la carpeta de ciudadano con su certificado digital, en la dirección: " + urlSede;
						boolean envioMail = Utiles.EMail(aInteresado.get(0).getEmailNotif(), sAsunto, sCuerpo, sPuerto, sServidor,
								sRemitente, sUsuario, sPass, sTarttls, sAuth, sSocket);
						if (!envioMail) {
							throw new ErrorEnvioEmail();
						}
					} else {
						throw new FaltanDatosException();
					}
				}
			}
		}
		return oNotifDto;
	}
}
