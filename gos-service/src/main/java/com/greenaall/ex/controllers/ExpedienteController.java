package com.greenaall.ex.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.ex.util.ExpedienteValide;
import com.greenaall.inside.service.InsideEnvioService;
import com.greenaall.inside.service.InsideExpedienteEnvioService;
import com.greenaall.exception.ErrorInsertarBD;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NoFechaFinException;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ad.entity.OrganizacionElemento;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.OrganizacionElementoServiceImpl;
import com.greenaall.models.ad.service.OrganizacionUsuarioServiceImpl;
import com.greenaall.models.ex.dto.ExpedienteDto;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.DocumentoSolicitud;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.entity.Mensaje;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramitador;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.entity.enums.EnumEstadoExpediente;
import com.greenaall.models.ex.entity.enums.EnumEstadoMensaje;
import com.greenaall.models.ex.entity.enums.EnumEstadoSolicitud;
import com.greenaall.models.ex.entity.enums.EnumEstadoTramitacion;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.DocumentoSolicitudServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.ex.service.MensajeServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ex.service.SolicitudServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramitadorServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributo;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.ge.service.MetadatoGrupoAtribImpl;
import com.greenaall.models.gf.entity.GfTarifa;
import com.greenaall.models.gf.service.TarifaServiceImpl;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
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

import es.gob.aapp.libreriaENI.exception.expedient.ConverterException;
import es.gob.aapp.libreriaENI.exception.expedient.ExpedientENIValidationException;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.service.GenerateExpedientENI;
import es.gob.aapp.libreriaENI.util.file.DataFile;

/**
 *
 * @author jmmoyano
 */

@RestController
public class ExpedienteController {

	@Autowired
	private ExpedienteServiceImpl service;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private ProcedimientoServiceImpl serviceProcedimiento;

	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private InteresadoServiceImpl serviceInteresado;

	@Autowired
	private SolicitudServiceImpl serviceSolicitud;

	@Autowired
	private DocumentoSolicitudServiceImpl serviceDocumentoSolicitud;

	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;

	@Autowired
	private TareaProcedimientoServiceImpl serviceTareaProcedimiento;

	@Autowired
	private TramiteServiceImpl serviceTramite;

	@Autowired
	private TramitadorServiceImpl serviceTramitador;

	@Autowired
	private MensajeServiceImpl serviceMensaje;

	@Autowired
	private RdDocumentoServiceImpl serviceRdDocumento;

	@Autowired
	private GenerateExpedientENI generateExpedienteENI;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private IArchivoService archivoService;

	@Autowired
	private OrganizacionElementoServiceImpl organizacionElementoServiceImpl;

	@Autowired
	private OrganizacionUsuarioServiceImpl serviceOrganizacionUsuario;

	@Autowired
	private TarifaServiceImpl tarifaService;

	@Autowired
	private MetadatoGrupoAtribImpl metadatoGrupoAtributoService;

	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;
	
	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;

	@Autowired
	private InsideEnvioService insideEnvioService;

	@Autowired
	private InsideExpedienteEnvioService insideExpedienteEnvioService;

	@Value("${inside.registrar-pendiente-on-close:true}")
	private boolean registrarPendienteInsideOnClose;

	@Value("${inside.auto-envio-on-close:false}")
	private boolean autoEnvioInsideOnClose;

	@PutMapping("/expediente/devolverExpediente/{idExped}/{idOrgUsuar}/{usuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public void devolverExpediente(@PathVariable Long idExped, @PathVariable Long idOrgUsuar,
			@PathVariable String usuario) throws Exception {

		List<Tramitador> oTramitador = serviceTramitador.findByExpedienteAndPosesionAndEstado(idExped, usuario);
		if (oTramitador == null) {
			throw new NoDataFoundException();
		}
		oTramitador.get(0).setPosesion(Short.valueOf((short) 0));
		oTramitador.get(0).setEstadoTramitacion(EnumEstadoTramitacion.TRAMITADO);
		serviceTramitador.save(oTramitador.get(0));

		List<Mensaje> aMensaje = serviceMensaje.findByDestinatarioAndExpediente(idOrgUsuar, idExped);
		aMensaje.get(0).setEstado(EnumEstadoMensaje.FINALIZADO);
		aMensaje.get(0).setFecTramitacion(new Date());
		serviceMensaje.save(aMensaje.get(0));
	}
	
	@PostMapping("/expediente/crear/{email}/{forNotif}")
	@ResponseStatus(HttpStatus.CREATED)
	public Expediente crear(@RequestBody Expediente expediente, @PathVariable String email,
			@PathVariable short forNotif) throws Exception {
		expediente.setFecContr(new Date());
		BigDecimal max = service.max(expediente.getEjercicio());
		if (max == null) {
			max = new BigDecimal("1");
		} else {
			max = max.add(new BigDecimal("1"));
		}
		Integer numero = max.intValue();
		expediente.setNumero(numero);
		try {
			Expediente oExpNew = service.save(expediente);
			if (oExpNew.getSolicitud() != null) {
				Solicitud oSolicitud = serviceSolicitud.findById(oExpNew.getSolicitud());
				if (oSolicitud != null) {
					oSolicitud.setExpediente(oExpNew.getId());
					oSolicitud.setEstado(EnumEstadoSolicitud.ACEPTADA);
					if (oSolicitud.getIdHisDocum() != null && oSolicitud.getIdDocum() != null) {
						RdDocumento oRdDocumento = serviceRdDocumento.findById(oSolicitud.getIdHisDocum());
						if (oRdDocumento != null) {
							oRdDocumento.setEstado(Short.valueOf((short) 3));
							oRdDocumento.setEjeExped(oExpNew.getEjercicio());
							String numExped2 = oExpNew.getEjercicio().toString()+String.format("%8s", oExpNew.getNumero().toString()).replace(' ','0');
							oRdDocumento.setNumExped(numExped2);
							oRdDocumento.setNumExtExped(numExped2);
							oRdDocumento.setIdExped(Long.valueOf(oExpNew.getId()));
							oRdDocumento.setIdProce(Long.valueOf(oExpNew.getProcedimiento()));
							oRdDocumento.setNumExpFlow(Long.valueOf(numExped2).longValue());
							serviceRdDocumento.save(oRdDocumento);
						}
					}
					serviceSolicitud.save(oSolicitud);
					List<DocumentoSolicitud> aDocumentoSolicitud = serviceDocumentoSolicitud
							.findBySolicitud(oSolicitud.getId());
					if (aDocumentoSolicitud != null && !aDocumentoSolicitud.isEmpty()) {
						Tramite oNewTramite = new Tramite();
						oNewTramite.setDescripcion("Documentos de la solicitud " + oSolicitud.getEjercicio().toString()
								+ "/" + oSolicitud.getNumero().toString());
						oNewTramite.setFase(EnumFaseExpediente.INICIO);
						oNewTramite.setFecTramite(new Date());
						oNewTramite.setNumero(Short.valueOf((short) 1));
						oNewTramite.setExpediente(oExpNew.getId());
						oNewTramite.setUsuContr(oExpNew.getUsuContr());
						oNewTramite.setFecContr(new Date());
						Tramite oTramite = serviceTramite.save(oNewTramite);
						Tramitador oNewTramitador = new Tramitador();
						oNewTramitador.setFecAsignacion(new Date());
						oNewTramitador.setExpediente(oExpNew.getId());
						oNewTramitador.setPosesion(Short.valueOf((short) 1));
						oNewTramitador.setUsuario(oExpNew.getInstructor());
						oNewTramitador.setEstadoTramitacion(EnumEstadoTramitacion.INSTRUCTOR);
						oNewTramitador.setUsuContr(oExpNew.getUsuContr());
						oNewTramitador.setFecContr(new Date());
						Tramitador oTramitador = serviceTramitador.save(oNewTramitador);
						for (int i = 0; i < aDocumentoSolicitud.size(); i++) {
							Archivo oArchivoNuevo = archivoService.findById(aDocumentoSolicitud.get(i).getArchivo());
							File from = new File(oArchivoNuevo.getDesArchi());
							String nombreArchivoSolicitud = from.getName();
							ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9300));
							ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
							Archivo oArchivoNuevoExp = ArchivoValide.altaArchivoNuevo(oParametroSistema.getValor(),
									oExpNew.getEjercicio(), oExpNew.getNumero(), nombreArchivoSolicitud);
							archivoService.save(oArchivoNuevoExp);
							TareaTramiteExpediente oTarTraExped = new TareaTramiteExpediente();
							int num = i + 1;
							String valor = String.valueOf(num);
							Short numTarea = Short.valueOf(valor);
							oTarTraExped.setDescripcion(aDocumentoSolicitud.get(i).getDescripcion());
							oTarTraExped.setFecInicio(new Date());
							oTarTraExped.setNumero(numTarea);
							oTarTraExped.setVisible(true);
							oTarTraExped.setArchivo(oArchivoNuevoExp.getCodArchi());
							oTarTraExped.setUsuario(oExpNew.getInstructor());
							oTarTraExped.setTramite(oTramite.getId());
							oTarTraExped.setTramitador(oTramitador.getId());
							oTarTraExped.setDocAport(Short.valueOf((short) 0));
							oTarTraExped.setTipDocEni("TD99");
							oTarTraExped.setTipAnexo(Short.valueOf((short) 0));
							oTarTraExped.setDocumentacion(Short.valueOf((short) 1));
							oTarTraExped.setFirmado(Short.valueOf((short) 1));
							oTarTraExped.setUsuContr(oExpNew.getUsuContr());
							oTarTraExped.setFecContr(oExpNew.getFecContr());
							TareaProcedimiento oTarProce = serviceTareaProcedimiento
									.findByTareaAutomatica(oExpNew.getProcedimiento());
							if (oTarProce != null) {
								oTarTraExped.setTareaProcedimiento(oTarProce.getId());
								TareaTramiteExpediente oTareaNueva = serviceTareaTramiteExpediente.save(oTarTraExped);
								TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
								
								if(oTareaNueva.getArchivo() != null) {
									oTareaHistorio.setCodArchi(oTareaNueva.getArchivo());	
								}
								
								oTareaHistorio.setDesIndic("Creación de la Tarea: " + oTareaNueva.getId().toString());	
								oTareaHistorio.setDesTarea(oTareaNueva.getDescripcion());
								oTareaHistorio.setFecContr(new Date());
								oTareaHistorio.setFecTarea(oTareaNueva.getFecInicio());
								oTareaHistorio.setTarea(oTareaNueva.getId());
								oTareaHistorio.setUsuario(oTareaNueva.getUsuario());
								oTareaHistorio.setUsuContr(oTareaNueva.getUsuContr());
								serviceTareaHistorico.save(oTareaHistorio);
								
							} else {
								System.err.println("No existe tarea automática");
								throw new ErrorInsertarBD("No existe tarea automática");
							}
						}
					} else {
						Tramitador oNewTramitador = new Tramitador();
						oNewTramitador.setFecAsignacion(new Date());
						oNewTramitador.setExpediente(oExpNew.getId());
						oNewTramitador.setPosesion(Short.valueOf((short) 1));
						oNewTramitador.setUsuario(oExpNew.getInstructor());
						oNewTramitador.setEstadoTramitacion(EnumEstadoTramitacion.INSTRUCTOR);
						oNewTramitador.setUsuContr(oExpNew.getUsuContr());
						oNewTramitador.setFecContr(new Date());
						serviceTramitador.save(oNewTramitador);
					}
				}
			} else {
				Tramitador oNewTramitador = new Tramitador();
				oNewTramitador.setFecAsignacion(new Date());
				oNewTramitador.setExpediente(oExpNew.getId());
				oNewTramitador.setUsuario(oExpNew.getInstructor());
				oNewTramitador.setPosesion(Short.valueOf((short) 1));
				oNewTramitador.setEstadoTramitacion(EnumEstadoTramitacion.INSTRUCTOR);
				oNewTramitador.setUsuContr(oExpNew.getUsuContr());
				oNewTramitador.setFecContr(new Date());
				serviceTramitador.save(oNewTramitador);
			}
			Interesado oInteresado = new Interesado();
			oInteresado.setExpediente(oExpNew.getId());
			oInteresado.setIdPerso(oExpNew.getIdPerso());
			oInteresado.setIdHisPerso(oExpNew.getIdHisPerso());
			oInteresado.setIdRepre(oExpNew.getIdRepre());
			oInteresado.setIdHisRepre(oExpNew.getIdHisRepre());
			oInteresado.setForNotif(forNotif);
			oInteresado.setEmailNotif(email);
			oInteresado.setPrincipal((short) 1);
			oInteresado.setFecContr(new Date());
			oInteresado.setUsuContr(oExpNew.getUsuContr());
			serviceInteresado.save(oInteresado);

			List<GfTarifa> oTarifaBus = tarifaService.findByIdProce(oExpNew.getProcedimiento());
			if (oTarifaBus != null) {

				List<MetadatoGrupoAtributo> aAtributos = metadatoGrupoAtributoService
						.findByIdGrupo(oTarifaBus.get(0).getIdGrupo());
				if (aAtributos != null && !aAtributos.isEmpty()) {
					for (int i = 0; i < aAtributos.size(); i++) {
						AtributoExpediente oAtributoExpediente = new AtributoExpediente();
						oAtributoExpediente.setIdExped(oExpNew.getId());
						oAtributoExpediente.setFecContr(new Date());
						oAtributoExpediente.setUsuContr(oExpNew.getUsuContr());
						oAtributoExpediente.setEtiGruAtrib(aAtributos.get(i).getEtiGruAtrib());
						oAtributoExpediente.setIdGrupo(oTarifaBus.get(0).getIdGrupo());
						atributoExpedienteService.save(oAtributoExpediente);
					}

				}
			}

			return oExpNew;
		} catch (Exception e) {
			throw new ErrorInsertarBD(e.getMessage());
		}
	}

	

	@GetMapping("/expediente/ver/{id}")
	public ExpedienteDto detalle(@PathVariable Long id) {
		Expediente expediente = service.findById(id);
		ExpedienteDto aExpedienteDto = new ExpedienteDto();
		if (expediente.getEjercicio() != null) {
			aExpedienteDto.setEjercicio(expediente.getEjercicio());
		}
		if (expediente.getDepartamento() != null) {
			aExpedienteDto.setDepartamento(expediente.getDepartamento());
		}
		if (expediente.getEstado() != null) {
			aExpedienteDto.setEstado(expediente.getEstado());
		}
		if (expediente.getFase() != null) {
			aExpedienteDto.setFase(expediente.getFase());
		}
		if (expediente.getFecArchivo() != null) {
			aExpedienteDto.setFecArchivo(expediente.getFecArchivo());
		}
		if (expediente.getFecCancelacion() != null) {
			aExpedienteDto.setFecCancelacion(expediente.getFecCancelacion());
		}
		if (expediente.getFecFin() != null) {
			aExpedienteDto.setFecFin(expediente.getFecFin());
		}
		if (expediente.getFecInicio() != null) {
			aExpedienteDto.setFecInicio(expediente.getFecInicio());
		}
		if (expediente.getFormaApertura() != null) {
			aExpedienteDto.setFormaApertura(expediente.getFormaApertura());
		}
		if (expediente.getId() != null) {
			aExpedienteDto.setId(expediente.getId());
		}
		if (expediente.getInstructor() != null) {
			aExpedienteDto.setInstructor(expediente.getInstructor());
		}
		if (expediente.getNumero() != null) {
			aExpedienteDto.setNumero(expediente.getNumero());
		}
		if (expediente.getProcedimiento() != null) {
			aExpedienteDto.setIdProc(expediente.getProcedimiento());
			Procedimiento oProcedimiento = serviceProcedimiento.findById(expediente.getProcedimiento());
			if (oProcedimiento != null) {
				aExpedienteDto.setProcedimiento(oProcedimiento);
			}
		}
		if (expediente.getTitulo() != null) {
			aExpedienteDto.setTitulo(expediente.getTitulo());
		}

		if (expediente.getSolicitud() != null) {
			aExpedienteDto.setIdSolic(expediente.getSolicitud());
		}

		if (expediente.getArchivo() != null) {
			aExpedienteDto.setArchivo(expediente.getArchivo());
		}

		if (expediente.getIdHisDocum() != null && expediente.getIdDocum() != null) {
			aExpedienteDto.setIdHisDocum(expediente.getIdHisDocum());
			aExpedienteDto.setIdDocum(expediente.getIdDocum());
			RdDocumento documento = serviceRdDocumento.findById(expediente.getIdHisDocum());
			if (documento != null) {
				aExpedienteDto
						.setNumRegis(documento.getEjeRegis().toString() + "/" + documento.getNumRegis().toString());
			}
		}

		if (expediente.getIdHisPerso() != null && expediente.getIdPerso() != null) {
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(expediente.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(expediente.getIdPerso());
			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
			if (oPersonaEntidad != null) {
				PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
				if (oPersonaEntidad.getCodProvi() > 0) {
					Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
					Provincia oProvincia = serviceProvincia.findById(codProvi);
					if (oProvincia != null) {
						oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
					}
					if (oPersonaEntidad.getCodMunic() > 0) {
						MunicipioPK MunicipioPK = new MunicipioPK();
						MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
						MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
						Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
						if (oMunicipio != null) {
							oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
						}
					}
				}
				aExpedienteDto.setPersonaEntidad(oPersonaEntidadDto);
			}

			List<Interesado> oInteresado = serviceInteresado.findByExpedienteAndIdHisPerso(expediente.getId(),
					expediente.getIdHisPerso());
			if (oInteresado != null) {
				aExpedienteDto.setForNotif(oInteresado.get(0).getForNotif());
				if (aExpedienteDto.getForNotif().equals(Short.valueOf((short) 0))) {
					aExpedienteDto.setForNotifTexto("CORREO POSTAL");
				} else {
					aExpedienteDto.setForNotifTexto("TELEMÁTICA");
				}
				if (oInteresado.get(0).getEmailNotif() != null) {
					aExpedienteDto.setEmail(oInteresado.get(0).getEmailNotif());
				}
			}

			if (expediente.getIdHisRepre() != null) {
				aExpedienteDto.setIdHisRepre(expediente.getIdHisRepre());
			}

			if (expediente.getIdRepre() != null) {
				aExpedienteDto.setIdRepre(expediente.getIdRepre());
			}

			if (expediente.getIdHisRepre() != null && expediente.getIdRepre() != null) {
				PersonaEntidadPK oPersonaEntidad2PK = new PersonaEntidadPK();
				oPersonaEntidad2PK.setIdHisPerso(expediente.getIdHisRepre());
				oPersonaEntidad2PK.setIdPerso(expediente.getIdRepre());
				PersonaEntidad oPersonaEntidad2 = servicePersonaEntidad.findById(oPersonaEntidad2PK);

				if (oPersonaEntidad2 != null) {
					aExpedienteDto.setNomRepre(oPersonaEntidad2.getDesPerEntid());
				}
			}
		}

		return aExpedienteDto;
	}
	
	@GetMapping("/expediente/formaNotif/{idExped}")
	public Short formaNotif(@PathVariable Long id) {
		
		Short retorno = Short.valueOf((short) 0);
		Expediente expediente = service.findById(id);
		if(expediente != null && expediente.getIdHisDocum() != null) {
			RdDocumento documento = serviceRdDocumento.findById(expediente.getIdHisDocum());
			if(documento != null && documento.getForNotif() != null && documento.getForNotif().equals(Short.valueOf((short) 5))) {
				retorno = Short.valueOf((short) 1);
			}
		}
		return retorno;
		
	}

	@GetMapping("/expediente/listarExpediente/{tramitador}")
	public List<ExpedienteDto> listar(@PathVariable String tramitador) {

		List<Long> aTramitador = serviceTramitador.findByExpedientUsuario(tramitador);

		if (aTramitador == null || aTramitador.isEmpty()) {
			throw new NoDataFoundException();
		}
		List<ExpedienteDto> aExpedienteDto = new ArrayList<ExpedienteDto>();

		for (int i = 0; i < aTramitador.size(); i++) {
			Expediente oExpedientes = service.findById(aTramitador.get(i));
			ExpedienteDto oExpDtoNew = new ExpedienteDto();
			if (oExpedientes != null) {

				if (oExpedientes.getEjercicio() != null) {
					oExpDtoNew.setEjercicio(oExpedientes.getEjercicio());
				}
				if (oExpedientes.getDepartamento() != null) {
					oExpDtoNew.setDepartamento(oExpedientes.getDepartamento());
				}
				if (oExpedientes.getEstado() != null) {
					oExpDtoNew.setEstado(oExpedientes.getEstado());
				}
				if (oExpedientes.getFase() != null) {
					oExpDtoNew.setFase(oExpedientes.getFase());
				}
				if (oExpedientes.getFecArchivo() != null) {
					oExpDtoNew.setFecArchivo(oExpedientes.getFecArchivo());
				}
				if (oExpedientes.getFecCancelacion() != null) {
					oExpDtoNew.setFecCancelacion(oExpedientes.getFecCancelacion());
				}
				if (oExpedientes.getFecFin() != null) {
					oExpDtoNew.setFecFin(oExpedientes.getFecFin());
				}
				if (oExpedientes.getFecInicio() != null) {
					oExpDtoNew.setFecInicio(oExpedientes.getFecInicio());
				}
				if (oExpedientes.getFormaApertura() != null) {
					oExpDtoNew.setFormaApertura(oExpedientes.getFormaApertura());
				}
				if (oExpedientes.getId() != null) {
					oExpDtoNew.setId(oExpedientes.getId());
				}
				if (oExpedientes.getInstructor() != null) {
					oExpDtoNew.setInstructor(oExpedientes.getInstructor());
				}
				if (oExpedientes.getNumero() != null) {
					oExpDtoNew.setNumero(oExpedientes.getNumero());
				}
				if (oExpedientes.getProcedimiento() != null) {
					oExpDtoNew.setIdProc(oExpedientes.getProcedimiento());
					Procedimiento oProcedimiento = serviceProcedimiento.findById(oExpedientes.getProcedimiento());
					if (oProcedimiento != null) {
						oExpDtoNew.setProcedimiento(oProcedimiento);
					}
				}
				if (oExpedientes.getTitulo() != null) {
					oExpDtoNew.setTitulo(oExpedientes.getTitulo());
				}

				if (oExpedientes.getSolicitud() != null) {
					oExpDtoNew.setIdSolic(oExpedientes.getSolicitud());
				}

				if (oExpedientes.getArchivo() != null) {
					oExpDtoNew.setArchivo(oExpedientes.getArchivo());
				}

				if (oExpedientes.getIdHisDocum() != null && oExpedientes.getIdDocum() != null) {
					oExpDtoNew.setIdHisDocum(oExpedientes.getIdHisDocum());
					oExpDtoNew.setIdDocum(oExpedientes.getIdDocum());
					RdDocumento documento = serviceRdDocumento.findById(oExpedientes.getIdHisDocum());
					if (documento != null) {
						oExpDtoNew.setNumRegis(
								documento.getEjeRegis().toString() + "/" + documento.getNumRegis().toString());
					}
				}

				if (oExpedientes.getIdHisPerso() != null && oExpedientes.getIdPerso() != null) {
					PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
					oPersonaEntidadPK.setIdHisPerso(oExpedientes.getIdHisPerso());
					oPersonaEntidadPK.setIdPerso(oExpedientes.getIdPerso());
					PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
					if (oPersonaEntidad != null) {
						PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
						if (oPersonaEntidad.getCodProvi() > 0) {
							Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
							Provincia oProvincia = serviceProvincia.findById(codProvi);
							if (oProvincia != null) {
								oPersonaEntidadDto.setProvincia(oProvincia.getDesProvi());
							}
							if (oPersonaEntidad.getCodMunic() > 0) {
								MunicipioPK MunicipioPK = new MunicipioPK();
								MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
								MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
								Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
								if (oMunicipio != null) {
									oPersonaEntidadDto.setMunicipio(oMunicipio.getDesMunic());
								}
							}
						}
						oExpDtoNew.setPersonaEntidad(oPersonaEntidadDto);
						List<Interesado> oInteresado = serviceInteresado
								.findByExpedienteAndIdHisPerso(oExpedientes.getId(), oExpedientes.getIdHisPerso());
						if (oInteresado != null && !oInteresado.isEmpty()) {

							oExpDtoNew.setForNotif(oInteresado.get(0).getForNotif());
							if (oExpDtoNew.getForNotif().equals(Short.valueOf((short) 0))) {
								oExpDtoNew.setForNotifTexto("CORREO POSTAL");
							} else {
								oExpDtoNew.setForNotifTexto("TELEMÁTICA");
							}

							oExpDtoNew.setEmail(oInteresado.get(0).getEmailNotif());
						}

					}

					if (oExpedientes.getIdHisRepre() != null) {
						oExpDtoNew.setIdHisRepre(oExpedientes.getIdHisRepre());
					}

					if (oExpedientes.getIdRepre() != null) {
						oExpDtoNew.setIdRepre(oExpedientes.getIdRepre());
					}

					if (oExpedientes.getIdHisRepre() != null && oExpedientes.getIdRepre() != null) {
						PersonaEntidadPK oPersonaEntidad2PK = new PersonaEntidadPK();
						oPersonaEntidad2PK.setIdHisPerso(oExpedientes.getIdHisRepre());
						oPersonaEntidad2PK.setIdPerso(oExpedientes.getIdRepre());
						PersonaEntidad oPersonaEntidad2 = servicePersonaEntidad.findById(oPersonaEntidad2PK);

						if (oPersonaEntidad2 != null) {
							oExpDtoNew.setNomRepre(oPersonaEntidad2.getDesPerEntid());
						}
					}
				}
			}
			try {
				oExpDtoNew.setInsideEstado(insideEnvioService.obtenerEstadoResumen(oExpedientes.getId()));
			} catch (Exception e) {
				oExpDtoNew.setInsideEstado("");
			}
			aExpedienteDto.add(oExpDtoNew);
		}

		return aExpedienteDto;
	}

	@GetMapping("/expediente/listar/{idProc}")
	public List<Expediente> listarPorIdProc(@PathVariable Long idProc) {
		List<Expediente> aExpedientes = service.findAll();
		List<Expediente> aExpFitlrados = ExpedienteValide.buscarExpIdProc(idProc, aExpedientes);
		if (aExpFitlrados == null || aExpFitlrados.isEmpty()) {
			throw new NoDataFoundException();
		}
		return aExpFitlrados;
	}

	@GetMapping("/expediente/listarPorInstructor/{instructor}")
	public List<Expediente> listarPorInstructor(@PathVariable String instructor) {
		List<Expediente> aExpedientes = service.findByInstructor(instructor);
		if (aExpedientes == null || aExpedientes.isEmpty()) {
			throw new NoDataFoundException();
		}
		return aExpedientes;
	}

	@PutMapping("/expediente/cerrar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Expediente cerrar(@RequestBody ExpedienteDto expediente, @PathVariable Long id) {

		Expediente oExpediente = service.findById(id);
		List<Tramite> aTramite = serviceTramite.findByExpediente(id);
		List<Archivo> aTareaArchivo = new ArrayList<>();
		if (!aTramite.isEmpty() && aTramite != null) {
			for (int i = 0; i < aTramite.size(); i++) {
				List<TareaTramiteExpediente> aTarea = serviceTareaTramiteExpediente
						.findByTramite(aTramite.get(i).getId());
				if (!aTarea.isEmpty() && aTarea != null) {
					for (int h = 0; h < aTarea.size(); h++) {
						if (aTarea.get(h).getFecFin() == null) {
							throw new NoFechaFinException();
						}
						if (aTarea.get(h).getArchivo() != null) {
							Archivo oArchivoTareaExp = archivoService.findById(aTarea.get(h).getArchivo());
							aTareaArchivo.add(oArchivoTareaExp);
						}
					}
				}
			}
			if (!aTareaArchivo.isEmpty()) {
				ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1),
						Long.valueOf((long) 0), "es", Short.valueOf((short) 9300));
				ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
				Archivo oArchivoVisualizacion = ArchivoValide.altaArchivoVisualizacion(oParametroSistema.getValor(),
						oExpediente.getEjercicio(), oExpediente.getNumero(), aTareaArchivo);
				archivoService.save(oArchivoVisualizacion);
				oExpediente.setArchivo(oArchivoVisualizacion.getCodArchi());
				UUID uuid = UUID.randomUUID();
				String getCve, refGesDocum, firmaCsv = null;
				refGesDocum = oExpediente.getEjercicio().toString() + "/"
						+ oExpediente.getNumero().toString().toString();
				try {
					getCve = Utiles.getCve(uuid);
					firmaCsv = new String(java.util.Base64.getEncoder().encodeToString(getCve.getBytes()));
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					String rutaArchivo = oArchivoVisualizacion.getDesArchi();
					String organo = "L99999999";
					File file = new File(rutaArchivo);
					String rutaExpediente = file.getParent();
					InputStream visualizacion = new FileInputStream(file);

					List<OrganizacionUsuario> oOrganizacionUsuario = serviceOrganizacionUsuario
							.findByUsuario2(oExpediente.getInstructor());
					OrganizacionElemento oOrganizacionElemento = organizacionElementoServiceImpl
							.findById(oOrganizacionUsuario.get(0).getIdOrgEleme());
					if (oOrganizacionElemento != null && oOrganizacionElemento.getOrgano() != null) {
						organo = oOrganizacionElemento.getOrgano();
					}

					String identificador = oExpediente.getEjercicio().toString() + oExpediente.getNumero().toString();
					List<Interesado> aInteresados = serviceInteresado.findByExpediente(oExpediente.getId());
					List<String> aDocumentos = new ArrayList<>();
					if (aInteresados != null && !aInteresados.isEmpty()) {
						for (int i = 0; i < aInteresados.size(); i++) {
							PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
							oPersonaEntidadPK.setIdHisPerso(aInteresados.get(i).getIdHisPerso());
							oPersonaEntidadPK.setIdPerso(aInteresados.get(i).getIdPerso());
							PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
							if (oPersonaEntidad != null && oPersonaEntidad.getNumDocum() != null) {
								aDocumentos.add(oPersonaEntidad.getNumDocum());
							}
						}

					}
					ObjetoExpedienteENI oObjetoExpENI = Utiles.generaExpedienteENI(aTareaArchivo, visualizacion,
							identificador, firmaCsv, organo, oExpediente.getFecInicio(), aDocumentos,
							expediente.getSerieDocumental());
					InputStream contenido = generateExpedienteENI.generateENI(oObjetoExpENI);
					rutaExpediente = rutaExpediente + File.separator + identificador + ".xml";
					File expElectronico = new File(rutaExpediente);
					DataFile.writePathData(contenido, expElectronico);
					System.out.println("ObjetoDocumentoENI creado");
					Archivo oArchivoExped = new Archivo();
					oArchivoExped.setHuella(firmaCsv);
					oArchivoExped.setTipFiche(Short.valueOf((short) 4));
					oArchivoExped.setRefGesDocum(refGesDocum);
					oArchivoExped.setModulo(Short.valueOf((short) 22));
					oArchivoExped.setDesArchi(rutaExpediente);
					oArchivoExped.setDesArchiFlow(rutaExpediente);
					oArchivoExped.setTipFiche(Short.valueOf((short) 1));
					oArchivoExped.setCodProgr(Long.valueOf((long) 0));
					oArchivoExped.setDesDocum(expElectronico.getName());
					oArchivoExped.setFecGenera(new Date());
					oArchivoExped.setTipDocum(Long.valueOf((long) 1));
					oArchivoExped.setEstado(Short.valueOf((short) 1));
					oArchivoExped.setCodEntid(Short.valueOf((short) 1));
					oArchivoExped.setFecContr(new Date());
					oArchivoExped.setTipFiche(Short.valueOf((short) 4));
					archivoService.save(oArchivoExped);

					Utiles.generaSIP(rutaExpediente, identificador);
				} catch (IOException | JAXBException | ConverterException | ExpedientENIValidationException e) {
					e.printStackTrace();
				}
			}
		}

		oExpediente.setEstado(EnumEstadoExpediente.CERRADO);
		if (expediente.getFecFin() != null) {
			oExpediente.setFecFin(expediente.getFecFin());
		} else {
			oExpediente.setFecFin(new Date());
		}
		oExpediente.setFecContr(new Date());
		service.save(oExpediente);

		if (registrarPendienteInsideOnClose && !aTareaArchivo.isEmpty()) {
			try {
				insideEnvioService.registrarPendienteCierreExpediente(
						oExpediente.getId(),
						oExpediente.getInstructor());
			} catch (Exception e) {
				System.err.println("No se pudo registrar envío INSIDE pendiente: " + e.getMessage());
			}
		}

		if (autoEnvioInsideOnClose && !aTareaArchivo.isEmpty()) {
			try {
				insideExpedienteEnvioService.enviarAltaExpedienteEniXml(
						oExpediente.getId(),
						oExpediente.getInstructor());
			} catch (Exception e) {
				System.err.println("No se pudo enviar automáticamente a INSIDE tras el cierre: " + e.getMessage());
			}
		}

		return oExpediente;

	}

	@PutMapping("/expediente/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ExpedienteDto editar(@RequestBody ExpedienteDto expediente, @PathVariable Long id) {
		Expediente expedienteDB = service.findById(id);
		ExpedienteDto oExpDtoNew = new ExpedienteDto();
		if (expediente.getDepartamento() != null) {
			expedienteDB.setDepartamento(expediente.getDepartamento());
			oExpDtoNew.setDepartamento(expediente.getDepartamento());
		}

		if (expediente.getEjercicio() != null) {
			expedienteDB.setEjercicio(expediente.getEjercicio());
			oExpDtoNew.setEjercicio(expediente.getEjercicio());
		}

		if (expediente.getEstado() != null) {
			expedienteDB.setEstado(expediente.getEstado());
			oExpDtoNew.setEstado(expediente.getEstado());
		}

		if (expediente.getFase() != null) {
			expedienteDB.setFase(expediente.getFase());
			oExpDtoNew.setFase(expediente.getFase());
		}

		if (expediente.getFecArchivo() != null) {
			expedienteDB.setFecArchivo(expediente.getFecArchivo());
			oExpDtoNew.setFecArchivo(expediente.getFecArchivo());
		}

		if (expediente.getFecCancelacion() != null) {
			expedienteDB.setFecCancelacion(expediente.getFecCancelacion());
			oExpDtoNew.setFecCancelacion(expediente.getFecCancelacion());
		}

		if (expediente.getFecFin() != null) {
			expedienteDB.setFecFin(expediente.getFecFin());
			oExpDtoNew.setFecFin(expediente.getFecFin());
		}

		if (expediente.getFecInicio() != null) {
			expedienteDB.setFecInicio(expediente.getFecInicio());
			oExpDtoNew.setFecInicio(expediente.getFecInicio());
		}

		if (expediente.getFormaApertura() != null) {
			expedienteDB.setFormaApertura(expediente.getFormaApertura());
			oExpDtoNew.setFormaApertura(expediente.getFormaApertura());
		}

		if (expediente.getInstructor() != null) {
			expedienteDB.setInstructor(expediente.getInstructor());
			oExpDtoNew.setInstructor(expediente.getInstructor());
		}

		if (expediente.getNumero() != null) {
			expedienteDB.setNumero(expediente.getNumero());
			oExpDtoNew.setNumero(expediente.getNumero());
		}

		if (expediente.getProcedimiento() != null) {
			expedienteDB.setProcedimiento(expediente.getProcedimiento().getId());
			oExpDtoNew.setProcedimiento(expediente.getProcedimiento());
		}

		if (expediente.getSolicitud() != null) {
			expedienteDB.setSolicitud(expediente.getSolicitud().getId());
			oExpDtoNew.setSolicitud(expediente.getSolicitud());
		}

		if (expediente.getTitulo() != null) {
			expedienteDB.setTitulo(expediente.getTitulo());
			oExpDtoNew.setTitulo(expediente.getTitulo());
		}

		if (expediente.getInstructor() != null) {
			expedienteDB.setInstructor(expediente.getInstructor());
			oExpDtoNew.setInstructor(expediente.getInstructor());
		}

		expedienteDB.setFecContr(new Date());

		if (expediente.getUsuContr() != null) {
			expedienteDB.setUsuContr(expediente.getUsuContr());
		}

		if (expediente.getForNotif() != null || expediente.getEmail() != null) {
			List<Interesado> oInteresado = serviceInteresado.findByExpedienteAndIdHisPerso(expedienteDB.getId(),
					expedienteDB.getIdHisPerso());
			if (oInteresado != null) {
				if (expediente.getForNotif() != null) {
					oInteresado.get(0).setForNotif(expediente.getForNotif());
				}
				if (expediente.getEmail() != null) {
					oInteresado.get(0).setEmailNotif(expediente.getEmail());
				}
				serviceInteresado.save(oInteresado.get(0));
			}
		}

		if (expediente.getIdHisRepre() != null) {
			expedienteDB.setIdHisRepre(expediente.getIdHisRepre());
		}

		if (expediente.getIdRepre() != null) {
			expedienteDB.setIdRepre(expediente.getIdRepre());
		}

		if (expediente.getIdHisRepre() != null && expediente.getIdRepre() != null) {
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(expediente.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(expediente.getIdPerso());
			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);

			if (oPersonaEntidad != null) {
				oExpDtoNew.setNomRepre(oPersonaEntidad.getDesPerEntid());
			}
		}

		if (expediente.getEstado().equals(EnumEstadoExpediente.ABIERTO)) {
			expedienteDB.setFecCancelacion(null);
			expedienteDB.setFecArchivo(null);
			expedienteDB.setFecFin(null);
		}

		service.save(expedienteDB);
		return oExpDtoNew;
	}

	@DeleteMapping("/expediente/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		Expediente expedienteDB = service.findById(id);
		if (expedienteDB == null) {
			throw new NoDataFoundException();
		}
		service.deleteById(expedienteDB.getId());
	}
}
