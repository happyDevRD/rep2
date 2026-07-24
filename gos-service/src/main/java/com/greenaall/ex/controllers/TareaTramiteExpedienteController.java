package com.greenaall.ex.controllers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

import com.greenaall.ex.tarea.TareaTramiteApplicationService;
import com.greenaall.exception.ExcepcionDocumentoEnEfirma;
import com.greenaall.exception.ExcepcionNoExisteParametroSistema;
import com.greenaall.exception.ExcepcionSolicitudFirmado;
import com.greenaall.exception.FirmaExistenteException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NotificacionException;
import com.greenaall.exception.PropuestaResolucionException;
import com.greenaall.exception.RegistroSalidaException;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.ge.ef.ln.InformacionDocumento;
import com.greenaall.ge.firma.ConectorEFirma;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ex.dto.TareaTramiteExpedienteDto;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.entity.enums.EnumTipoPlazoTarea;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.DiaFestivo;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.entity.PeticionFirma;
import com.greenaall.models.ge.entity.PeticionFirmante;
import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.models.ge.service.ArchivoServiceImpl;
import com.greenaall.models.ge.service.DiaFestivoServiceImpl;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.ge.service.IUsuarioService;
import com.greenaall.models.ge.service.PeticionFirmaServiceImpl;
import com.greenaall.models.ge.service.PeticionFirmanteServiceImpl;
import com.greenaall.models.ge.service.ProcesoFirmadoServiceImpl;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.IPersonaEntidadService;
import com.greenaall.models.pe.service.NotificacionServiceImpl;
import com.greenaall.models.rd.entity.RdDocumento;
import com.greenaall.models.rd.service.RdDocumentoServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.util.Cadena;
import com.greenaall.util.ConvertirPDF;
import com.greenaall.util.DiaHabil;
import com.greenaall.util.Fecha;
import com.greenaall.util.Formateador;
import com.greenaall.util.Utiles;

/**
 *
 * @author jmmoyano
 */

@RestController
public class TareaTramiteExpedienteController {

	@Autowired
	private TareaTramiteExpedienteServiceImpl service;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private TramiteServiceImpl serviceTramite;

	@Autowired
	private RdDocumentoServiceImpl serviceRdDocumento;

	@Autowired
	private ArchivoServiceImpl archivoService;

	@Autowired
	private DiaFestivoServiceImpl serviceDiaFestivo;

	@Autowired
	private TareaProcedimientoServiceImpl serviceTareaProcedimiento;

	@Autowired
	private NotificacionServiceImpl serviceNotificacion;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private ProcesoFirmadoServiceImpl serviceProcesoFirmado;
	
	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private ProcedimientoServiceImpl serviceProcedimiento;

	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;
	
	@Autowired
	private IPersonaEntidadService servicePersonaEntidad;
	
	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;
	
	@Autowired
	private PeticionFirmaServiceImpl servicePeticionFirma;
	
	@Autowired
	private PeticionFirmanteServiceImpl servicePeticionFirmante;
	
	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private TareaTramiteApplicationService tareaTramiteApplicationService;

	@DeleteMapping("/tareaTramiteExpediente/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		TareaTramiteExpediente tareaTramiteExpediente = service.findById(id);
		if (tareaTramiteExpediente == null) {
			throw new NoDataFoundException();
		}
		Archivo oArchivoBuscar = archivoService.findById(tareaTramiteExpediente.getArchivo());
		if(oArchivoBuscar != null && oArchivoBuscar.getIdPeticion() != null) {
			throw new ExcepcionDocumentoEnEfirma(oArchivoBuscar.getIdPeticion().toString());
		}
		if (tareaTramiteExpediente.getFirmado() == Short.valueOf((short) 1)) {
			throw new FirmaExistenteException();
		}
		if (tareaTramiteExpediente.getNotificacion() != null) {
			throw new NotificacionException();
		}
		if (tareaTramiteExpediente.getIdHisDocum() != null) {
			throw new RegistroSalidaException();
		}
		if (tareaTramiteExpediente.getPropuestaResolucion() != null) {
			throw new PropuestaResolucionException();
		}

		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
		
		oTareaHistorio.setCodArchi(tareaTramiteExpediente.getArchivo());
		oTareaHistorio.setDesIndic("Borrado de Tarea");	
		oTareaHistorio.setDesTarea(tareaTramiteExpediente.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(tareaTramiteExpediente.getFecInicio());
		oTareaHistorio.setTarea(tareaTramiteExpediente.getId());
		oTareaHistorio.setUsuario(tareaTramiteExpediente.getUsuario());
		oTareaHistorio.setUsuContr(tareaTramiteExpediente.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);
		
		service.deleteById(tareaTramiteExpediente.getId());
	}

	@PostMapping("/tareaTramiteExpediente/crear/{plantillaDefecto}")
	@ResponseStatus(HttpStatus.CREATED)
	public TareaTramiteExpediente crear(@RequestBody TareaTramiteExpediente tareaTramiteExpediente, @PathVariable String plantillaDefecto) {
		return tareaTramiteApplicationService.crear(tareaTramiteExpediente, plantillaDefecto);
	}

	@PutMapping("/tareaTramiteExpediente/finalizar/{idTarea}")
	public void finalizar(@PathVariable Long idTarea) {
		tareaTramiteApplicationService.finalizar(idTarea);
	}
	
	@PostMapping("/tareaTramiteExpediente/convertirPDF/{usuario}/{idTarea}")
	public String convetirPDF(@PathVariable String usuario, @PathVariable Long idTarea) {
		
		TareaTramiteExpediente oTareaTramiteExpediente = service.findById(idTarea);
		Archivo oArchivoBuscar = archivoService.findById(oTareaTramiteExpediente.getArchivo());
		Etiquetas oEtiquetas = getEtiquetas(usuario, oArchivoBuscar);
		String extension = Utiles.getExtension(oArchivoBuscar.getDesDocum());
		Boolean fusion = null;
		if (extension.equals(".docx") || extension.equals(".odt") || extension.equals(".doc") || extension.equals(".sxw")) {
			if (extension.equals(".docx") || extension.equals(".doc")) {
				fusion = ArchivoValide.fusionDocumentoDOC(oArchivoBuscar.getDesArchiFlow(), oEtiquetas);
				if (!fusion) {
					System.err.println("Se ha producido un error en la fusión ODF");
				}
			}
			if (extension.equals(".odt") || extension.equals(".sxw")) {
				ParametroSistemaPK oParametroSistema2Pk = new ParametroSistemaPK(Long.valueOf((long) 1),
						Long.valueOf((long) 0), "es", Short.valueOf((short) 9307));
				ParametroSistema oParametroSistema2 = parametroSistemaService.findById(oParametroSistema2Pk);
				fusion = ArchivoValide.fusionDocumentoODT(oArchivoBuscar.getDesArchiFlow(), oEtiquetas,
						oParametroSistema2.getValor());
				if (!fusion) {
					System.err.println("Se ha producido un error en la fusión ODF");
				}
			}
			String ruta = ConvertirPDF.convertirPDF(oArchivoBuscar.getDesArchiFlow(), extension);
			
			Archivo oArchivoNuevo = new Archivo();
			if (oArchivoBuscar.getHuella() != null) {
				oArchivoNuevo.setHuella(oArchivoBuscar.getHuella());
			}
			oArchivoNuevo.setTipFiche(Short.valueOf((short) 4));
			if (oArchivoBuscar.getRefGesDocum() != null) {
				oArchivoNuevo.setRefGesDocum(oArchivoBuscar.getRefGesDocum());
			}

			oArchivoNuevo.setModulo(Short.valueOf((short) 22));
			oArchivoNuevo.setDesArchi(ruta);
			oArchivoNuevo.setDesArchiFlow(ruta);
			oArchivoNuevo.setTipFiche(Short.valueOf((short) 1));
			oArchivoNuevo.setCodProgr(Long.valueOf((long) 0));
			File oFileNuevo = new File(ruta);
			oArchivoNuevo.setDesDocum(oFileNuevo.getName());
			oArchivoNuevo.setFecGenera(new Date());
			oArchivoNuevo.setTipDocum(Long.valueOf((long) 1));
			oArchivoNuevo.setEstado(Short.valueOf((short) 1));
			oArchivoNuevo.setCodEntid(Short.valueOf((short) 1));
			oArchivoNuevo.setFecContr(new Date());
			oArchivoNuevo.setTipFiche(Short.valueOf((short) 4));
			Archivo oArchivo = archivoService.save(oArchivoNuevo);
			
			oTareaTramiteExpediente.setArchivo(oArchivo.getCodArchi());
			oTareaTramiteExpediente.setFecContr(new Date());
			oTareaTramiteExpediente.setUsuContr(usuario);
			
			TareaTramiteExpediente oTareaExpedienteNuevo = service.save(oTareaTramiteExpediente);
			TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
			
			oTareaHistorio.setCodArchi(oTareaExpedienteNuevo.getArchivo());
			oTareaHistorio.setDesIndic("Conversión a PDF. Archvio original: " + oArchivoBuscar.getCodArchi().toString());	
			oTareaHistorio.setDesTarea(oTareaExpedienteNuevo.getDescripcion());
			oTareaHistorio.setFecContr(new Date());
			oTareaHistorio.setFecTarea(oTareaExpedienteNuevo.getFecInicio());
			oTareaHistorio.setTarea(oTareaExpedienteNuevo.getId());
			oTareaHistorio.setUsuario(oTareaExpedienteNuevo.getUsuario());
			oTareaHistorio.setUsuContr(oTareaExpedienteNuevo.getUsuContr());
			serviceTareaHistorico.save(oTareaHistorio);
			
			
		}
		
		return "OK";
	}
	
	@GetMapping("/tareaTramiteExpediente/listarPorExpediente/{expediente}")
	public List<TareaTramiteExpedienteDto> listarPorExpediente(@PathVariable Long expediente) {

		String tipoFirma = null;
		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";
		int dias = 0;
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();

		List<Tramite> aTramite = serviceTramite.findByExpediente(expediente);
		List<DiaFestivo> aDiaFestivo = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);

		if (aTramite != null && !aTramite.isEmpty()) {
			for (int h = 0; h < aTramite.size(); h++) {
				List<TareaTramiteExpediente> aTareaTramiteExped = service.findByTramite(aTramite.get(h).getId());
				if (aTareaTramiteExped != null && !aTareaTramiteExped.isEmpty()) {
					for (int i = 0; i < aTareaTramiteExped.size(); i++) {
						TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();

						if (aTareaTramiteExped.get(i).getArchivo() != null) {
							oTareaTramiteExpDTO.setArchivo(aTareaTramiteExped.get(i).getArchivo());
							Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
							if (oArchivo != null) {
								File oFile = new File(oArchivo.getDesArchi());
								if (oFile.exists()) {
									String nombreFichero = oFile.getName();
									oTareaTramiteExpDTO.setNombreArchivo(nombreFichero);
								} else if (oArchivo.getDesDocum() != null) {
									oTareaTramiteExpDTO.setNombreArchivo(oArchivo.getDesDocum());
								} else {
									oTareaTramiteExpDTO.setNombreArchivo("Error al buscar el archivo");
								}
								if(oArchivo.getRefGesDocum() == null) {
									oArchivo.setRefGesDocum(aTareaTramiteExped.get(i).getId().toString());
									archivoService.save(oArchivo);
								}
							}
						}

						if (aTareaTramiteExped.get(i).getDescripcion() != null) {
							oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
						}

						if (aTareaTramiteExped.get(i).getDocAport() != null) {
							oTareaTramiteExpDTO.setDocAport(aTareaTramiteExped.get(i).getDocAport());
						}

						if (aTareaTramiteExped.get(i).getDocumentacion() != null) {
							oTareaTramiteExpDTO.setDocumentacion(aTareaTramiteExped.get(i).getDocumentacion());
						}

						if (aTareaTramiteExped.get(i).getFecFin() != null) {
							oTareaTramiteExpDTO.setFecFin(aTareaTramiteExped.get(i).getFecFin());
						}

						if (aTareaTramiteExped.get(i).getFecInicio() != null) {
							oTareaTramiteExpDTO.setFecInicio(aTareaTramiteExped.get(i).getFecInicio());
						}

						if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
							tipoFirma = "ATENDIDA";
							TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimiento
									.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());
							if (oTareaProcedimiento != null && !oTareaProcedimiento.getTareaAutomatica()) {
								if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
									System.err.println("La tarea del procedimiento no tiene proceso firmado");
									// throw new ExcepcionSolicitudFirmado();
								} else {
									ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado
											.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
									if (oProcesoFirmado == null) {
										System.err.println("No existe proceso firmado");
										throw new ExcepcionSolicitudFirmado();
									} else if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
										tipoFirma = "DESATENDIDA";
									}
								}
							}
						}

						if (aTareaTramiteExped.get(i).getArchivo() != null && tipoFirma.equals("ATENDIDA")) {
							Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
							long idDocum = 0;
							boolean resultado = false;
							if (oArchivo.getHuella() != null) {
								try {
									try {
										Long.parseLong(oArchivo.getHuella());
										resultado = true;
									} catch (NumberFormatException excepcion) {
										System.err.println(excepcion.getMessage());
									}
									if (resultado) {
										idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());
									} else {
										oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
									}

								} catch (NumberFormatException e) {
									System.err.println(e.getMessage());
									e.printStackTrace();
									oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
								}
								InformacionDocumento infDocumento;
								try {
									if (resultado) {
										infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);
										if (infDocumento != null) {
											short val = infDocumento.getEstado();
											if (val == 3) {
												oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 1));
												if (aTareaTramiteExped.get(i).getFirmado() != null && aTareaTramiteExped
														.get(i).getFirmado().equals(Short.valueOf((short) 0))) {
													aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
													service.save(aTareaTramiteExped.get(i));
												} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
													aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
													service.save(aTareaTramiteExped.get(i));
												}
											} else {
												oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
												if (aTareaTramiteExped.get(i).getFirmado() != null && aTareaTramiteExped
														.get(i).getFirmado().equals(Short.valueOf((short) 1))) {
													aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
													service.save(aTareaTramiteExped.get(i));
												} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
													aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
													service.save(aTareaTramiteExped.get(i));
												}
											}
										}
									}
								} catch (Exception e) {
									System.err.println(e.getMessage());
									e.printStackTrace();
								}
							} else {
								oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
							}
						} else {
							oTareaTramiteExpDTO.setFirmado(aTareaTramiteExped.get(i).getFirmado());
						}

						if (aTareaTramiteExped.get(i).getFirmante() != null) {
							oTareaTramiteExpDTO.setFirmante(aTareaTramiteExped.get(i).getFirmante());
						}

						if (aTareaTramiteExped.get(i).getId() != null) {
							oTareaTramiteExpDTO.setId(aTareaTramiteExped.get(i).getId());
						}

						if (aTareaTramiteExped.get(i).getIdDocum() != null) {
							oTareaTramiteExpDTO.setIdDocum(aTareaTramiteExped.get(i).getIdDocum());
						}

						if (aTareaTramiteExped.get(i).getIdHisDocum() != null) {
							oTareaTramiteExpDTO.setIdHisDocum(aTareaTramiteExped.get(i).getIdHisDocum());
							RdDocumento oRdDocumento = serviceRdDocumento
									.findById(aTareaTramiteExped.get(i).getIdHisDocum());
							if (oRdDocumento != null) {
								oTareaTramiteExpDTO.setNumRegis(oRdDocumento.getEjeRegis().toString() + "/"
										+ oRdDocumento.getNumRegis().toString());
							}
						}

						if (aTareaTramiteExped.get(i).getNotificacion() != null) {
							oTareaTramiteExpDTO.setNotificacion(aTareaTramiteExped.get(i).getNotificacion());
							Notificacion oNotificacion = serviceNotificacion
									.findById(aTareaTramiteExped.get(i).getNotificacion());
							if (oNotificacion != null) {
								String notificacionTxt = oNotificacion.getEjeNotif().toString() + "/"
										+ oNotificacion.getNumNotif().toString();
								oTareaTramiteExpDTO.setEjeNumNotif(notificacionTxt);
							}
						}

						if (aTareaTramiteExped.get(i).getNumero() != null) {
							oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
						}

						if (aTareaTramiteExped.get(i).getPropuestaResolucion() != null) {
							oTareaTramiteExpDTO
									.setPropuestaResolucion(aTareaTramiteExped.get(i).getPropuestaResolucion());
						}

						if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
							oTareaTramiteExpDTO
									.setTareaProcedimiento(aTareaTramiteExped.get(i).getTareaProcedimiento());
						}

						if (aTareaTramiteExped.get(i).getTipAnexo() != null) {
							oTareaTramiteExpDTO.setTipAnexo(aTareaTramiteExped.get(i).getTipAnexo());
						}

						if (aTareaTramiteExped.get(i).getTipDocEni() != null) {
							oTareaTramiteExpDTO.setTipDocEni(aTareaTramiteExped.get(i).getTipDocEni());
						}

						if (aTareaTramiteExped.get(i).getTramitador() != null) {
							oTareaTramiteExpDTO.setTramitador(aTareaTramiteExped.get(i).getTramitador());
						}

						if (aTareaTramiteExped.get(i).getTramite() != null) {
							oTareaTramiteExpDTO.setTramite(aTareaTramiteExped.get(i).getTramite());
							oTareaTramiteExpDTO.setDesTramite(aTramite.get(h).getDescripcion());
						}

						if (aTareaTramiteExped.get(i).getUsuario() != null) {
							oTareaTramiteExpDTO.setUsuario(aTareaTramiteExped.get(i).getUsuario());
						}

						if (aTareaTramiteExped.get(i).getUsuContr() != null) {
							oTareaTramiteExpDTO.setUsuContr(aTareaTramiteExped.get(i).getUsuContr());
						}

						if (aTareaTramiteExped.get(i).getIdAnunc() != null) {
							oTareaTramiteExpDTO.setIdAnunc(aTareaTramiteExped.get(i).getIdAnunc());
						}

						if (aTareaTramiteExped.get(i).getVisible()) {
							oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
						} else {
							oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
						}

						if (aTareaTramiteExped != null && aTareaTramiteExped.get(i).getFecInicio() != null) {

							TareaProcedimiento oTareaProcedimeinto = serviceTareaProcedimiento
									.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());

							if (oTareaProcedimeinto != null && (oTareaProcedimeinto.getPlazo() == null
									|| oTareaProcedimeinto.getPlazo() == null)) {
								throw new NoDataFoundException();
							}
							if (oTareaProcedimeinto.getTipoPlazo() == null) {
								oTareaProcedimeinto.setTipoPlazo(EnumTipoPlazoTarea.SINPLAZO);
							}
							if (!oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SINPLAZO)) {
								if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SEMANAS)) {
									dias = oTareaProcedimeinto.getPlazo() * 7;
								} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.MESES)) {
									dias = oTareaProcedimeinto.getPlazo() * 30;
								} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.ANOS)) {
									dias = oTareaProcedimeinto.getPlazo() * 360;
								} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.DIAS)) {
									dias = oTareaProcedimeinto.getPlazo() * 1;
								}
							}

							if (aDiaFestivo != null && !aDiaFestivo.isEmpty()) {
								try {
									Date oFecha = new Date();
									String color = "VERDE";
									oFecha = DiaHabil.dameFechaHabil(aTareaTramiteExped.get(i).getFecInicio(), false,
											dias, false, aDiaFestivo);
									if (oFecha == null) {
										oFecha = new Date();
									}
									SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
									String fechaTope = sdf.format(oFecha);

									int diferencia = Fecha.diferenciaFechaDias(oFechaHoy, oFecha);

									if (diferencia >= 7 && diferencia <= 10) {
										color = "AMARILLO";
									} else if (diferencia < 7) {
										color = "ROJO";
									}
									oTareaTramiteExpDTO.setColor(color);
									if (aTareaTramiteExped.get(i).getFecFin() != null
											|| oTareaProcedimeinto.getTareaAutomatica()) {
										oTareaTramiteExpDTO.setColor("VERDE");
									}
									oTareaTramiteExpDTO.setFecPlazo(fechaTope);
								} catch (Exception e) {
									throw new NoDataFoundException();
								}
							}
							aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
						}
					}
				}
			}
		} else {
			throw new NoDataFoundException();
		}

		return aTareaTramiteExpedDto;
	}

	@GetMapping("/tareaTramiteExpediente/listarTareasPendientesPorUsuario/{usuario}")
	public List<TareaTramiteExpedienteDto> listarPorUsuarioFecFin(@PathVariable String usuario) {
		String tipoFirma = null;
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		List<TareaTramiteExpediente> aTareaTramiteExped = service.findbyUsuarioAndFecFin(usuario);
		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();

		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";
		int dias = 0;

		if (aTareaTramiteExped == null || aTareaTramiteExped.isEmpty()) {
			throw new NoDataFoundException();
		}
		List<DiaFestivo> aDiaFestivo = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);

		for (int i = 0; i < aTareaTramiteExped.size(); i++) {
			TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();
			
			if (aTareaTramiteExped.get(i).getTramite() != null) {
				Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
				Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
				oTareaTramiteExpDTO.setEjeExped(oExpediente.getEjercicio());
				oTareaTramiteExpDTO.setNumExped(oExpediente.getNumero());
				oTareaTramiteExpDTO.setTitulo(oExpediente.getTitulo());
			}
			
			if (aTareaTramiteExped.get(i).getArchivo() != null) {
				oTareaTramiteExpDTO.setArchivo(aTareaTramiteExped.get(i).getArchivo());
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				if (oArchivo != null) {
					File oFile = new File(oArchivo.getDesArchi());
					if (oFile.exists()) {
						String nombreFichero = oFile.getName();
						oTareaTramiteExpDTO.setNombreArchivo(nombreFichero);
					} else if (oArchivo.getDesDocum() != null) {
						oTareaTramiteExpDTO.setNombreArchivo(oArchivo.getDesDocum());
					} else {
						oTareaTramiteExpDTO.setNombreArchivo("Error al buscar el archivo");
					}
				}
			}

			if (aTareaTramiteExped.get(i).getDescripcion() != null) {
				oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
			}

			if (aTareaTramiteExped.get(i).getDocAport() != null) {
				oTareaTramiteExpDTO.setDocAport(aTareaTramiteExped.get(i).getDocAport());
			}

			if (aTareaTramiteExped.get(i).getDocumentacion() != null) {
				oTareaTramiteExpDTO.setDocumentacion(aTareaTramiteExped.get(i).getDocumentacion());
			}

			if (aTareaTramiteExped.get(i).getFecFin() != null) {
				oTareaTramiteExpDTO.setFecFin(aTareaTramiteExped.get(i).getFecFin());
			}

			if (aTareaTramiteExped.get(i).getFecInicio() != null) {
				oTareaTramiteExpDTO.setFecInicio(aTareaTramiteExped.get(i).getFecInicio());
			}

			if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
				tipoFirma = "ATENDIDA";
				TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimiento
						.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());
				if (oTareaProcedimiento != null && !oTareaProcedimiento.getTareaAutomatica()) {
					if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
						System.err.println("La tarea del procedimiento no tiene proceso firmado");
						// throw new ExcepcionSolicitudFirmado();
					} else {
						ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado
								.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
						if (oProcesoFirmado == null) {
							System.err.println("No existe proceso firmado");
							throw new ExcepcionSolicitudFirmado();
						} else if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
							tipoFirma = "DESATENDIDA";
						}
					}
				}
			}

			if (aTareaTramiteExped.get(i).getArchivo() != null && tipoFirma.equals("ATENDIDA")) {
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				long idDocum = 0;
				boolean resultado;
				if (oArchivo.getHuella() != null) {
					try {
						Integer.parseInt(oArchivo.getHuella());
						resultado = true;
					} catch (NumberFormatException excepcion) {
						resultado = false;
					}

					try {
						if (resultado) {
							idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());
						}
					} catch (NumberFormatException e) {
						System.err.println(e.getMessage());
						e.printStackTrace();
						oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
					}
					InformacionDocumento infDocumento;
					try {
						if (resultado) {
							infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);
							if (infDocumento != null) {
								short val = infDocumento.getEstado();
								if (val == 3) {
									oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 1));
									if (aTareaTramiteExped.get(i).getFirmado() != null && aTareaTramiteExped.get(i)
											.getFirmado().equals(Short.valueOf((short) 0))) {
										aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
										service.save(aTareaTramiteExped.get(i));
									} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
										aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
										service.save(aTareaTramiteExped.get(i));
									}
								} else {
									oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
									if (aTareaTramiteExped.get(i).getFirmado() != null && aTareaTramiteExped.get(i)
											.getFirmado().equals(Short.valueOf((short) 1))) {
										aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
										service.save(aTareaTramiteExped.get(i));
									} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
										aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
										service.save(aTareaTramiteExped.get(i));
									}
								}
							}
						}
					} catch (Exception e) {
						System.err.println(e.getMessage());
						e.printStackTrace();
					}
				} else {
					oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
				}
			} else {
				oTareaTramiteExpDTO.setFirmado(aTareaTramiteExped.get(i).getFirmado());
			}

			if (aTareaTramiteExped.get(i).getFirmante() != null) {
				oTareaTramiteExpDTO.setFirmante(aTareaTramiteExped.get(i).getFirmante());
			}

			if (aTareaTramiteExped.get(i).getId() != null) {
				oTareaTramiteExpDTO.setId(aTareaTramiteExped.get(i).getId());
			}

			if (aTareaTramiteExped.get(i).getIdDocum() != null) {
				oTareaTramiteExpDTO.setIdDocum(aTareaTramiteExped.get(i).getIdDocum());
			}

			if (aTareaTramiteExped.get(i).getIdHisDocum() != null) {
				oTareaTramiteExpDTO.setIdHisDocum(aTareaTramiteExped.get(i).getIdHisDocum());
				RdDocumento oRdDocumento = serviceRdDocumento.findById(aTareaTramiteExped.get(i).getIdHisDocum());
				if (oRdDocumento != null) {
					oTareaTramiteExpDTO.setNumRegis(
							oRdDocumento.getEjeRegis().toString() + "/" + oRdDocumento.getNumRegis().toString());
				}
			}

			if (aTareaTramiteExped.get(i).getNotificacion() != null) {
				oTareaTramiteExpDTO.setNotificacion(aTareaTramiteExped.get(i).getNotificacion());
				Notificacion oNotificacion = serviceNotificacion.findById(aTareaTramiteExped.get(i).getNotificacion());
				if (oNotificacion != null) {
					String notificacionTxt = oNotificacion.getEjeNotif().toString() + "/"
							+ oNotificacion.getNumNotif().toString();
					oTareaTramiteExpDTO.setEjeNumNotif(notificacionTxt);
				}
			}

			if (aTareaTramiteExped.get(i).getNumero() != null) {
				oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
			}

			if (aTareaTramiteExped.get(i).getPropuestaResolucion() != null) {
				oTareaTramiteExpDTO.setPropuestaResolucion(aTareaTramiteExped.get(i).getPropuestaResolucion());
			}

			if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
				oTareaTramiteExpDTO.setTareaProcedimiento(aTareaTramiteExped.get(i).getTareaProcedimiento());
			}

			if (aTareaTramiteExped.get(i).getTipAnexo() != null) {
				oTareaTramiteExpDTO.setTipAnexo(aTareaTramiteExped.get(i).getTipAnexo());
			}

			if (aTareaTramiteExped.get(i).getTipDocEni() != null) {
				oTareaTramiteExpDTO.setTipDocEni(aTareaTramiteExped.get(i).getTipDocEni());
			}

			if (aTareaTramiteExped.get(i).getTramitador() != null) {
				oTareaTramiteExpDTO.setTramitador(aTareaTramiteExped.get(i).getTramitador());
			}

			if (aTareaTramiteExped.get(i).getTramite() != null) {
				oTareaTramiteExpDTO.setTramite(aTareaTramiteExped.get(i).getTramite());
				Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
				if (oTramite != null) {
					oTareaTramiteExpDTO.setDesTramite(oTramite.getDescripcion());
				}
			}

			if (aTareaTramiteExped.get(i).getUsuario() != null) {
				oTareaTramiteExpDTO.setUsuario(aTareaTramiteExped.get(i).getUsuario());
			}

			if (aTareaTramiteExped.get(i).getUsuContr() != null) {
				oTareaTramiteExpDTO.setUsuContr(aTareaTramiteExped.get(i).getUsuContr());
			}

			if (aTareaTramiteExped.get(i).getIdAnunc() != null) {
				oTareaTramiteExpDTO.setIdAnunc(aTareaTramiteExped.get(i).getIdAnunc());
			}

			if (aTareaTramiteExped.get(i).getVisible()) {
				oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
			} else {
				oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
			}

			if (aTareaTramiteExped != null && aTareaTramiteExped.get(i).getFecInicio() != null) {

				TareaProcedimiento oTareaProcedimeinto = serviceTareaProcedimiento
						.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());

				if (oTareaProcedimeinto != null
						&& (oTareaProcedimeinto.getPlazo() == null || oTareaProcedimeinto.getPlazo() == null)) {
					throw new NoDataFoundException();
				}
				if (oTareaProcedimeinto.getTipoPlazo() == null) {
					oTareaProcedimeinto.setTipoPlazo(EnumTipoPlazoTarea.SINPLAZO);
				}
				if (!oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SINPLAZO)) {
					if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SEMANAS)) {
						dias = oTareaProcedimeinto.getPlazo() * 7;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.MESES)) {
						dias = oTareaProcedimeinto.getPlazo() * 30;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.ANOS)) {
						dias = oTareaProcedimeinto.getPlazo() * 360;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.DIAS)) {
						dias = oTareaProcedimeinto.getPlazo() * 1;
					}
				}

				if (aDiaFestivo != null && !aDiaFestivo.isEmpty()) {
					try {
						Date oFecha = new Date();
						String color = "VERDE";
						oFecha = DiaHabil.dameFechaHabil(aTareaTramiteExped.get(i).getFecInicio(), false, dias, false,
								aDiaFestivo);
						if (oFecha == null) {
							oFecha = new Date();
						}
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String fechaTope = sdf.format(oFecha);
						oTareaTramiteExpDTO.setFecFinPlazo(oFecha);
						int diferencia = Fecha.diferenciaFechaDias(oFechaHoy, oFecha);

						if (diferencia >= 7 && diferencia <= 10) {
							color = "AMARILLO";
						} else if (diferencia < 7) {
							color = "ROJO";
						}
						oTareaTramiteExpDTO.setColor(color);
						if (aTareaTramiteExped.get(i).getFecFin() != null || oTareaProcedimeinto.getTareaAutomatica()) {
							oTareaTramiteExpDTO.setColor("VERDE");
						}
						oTareaTramiteExpDTO.setFecPlazo(fechaTope);
					} catch (Exception e) {
						throw new NoDataFoundException();
					}
				}
				aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
			} else {
				throw new NoDataFoundException();
			}
		}

		Collections.sort(aTareaTramiteExpedDto, new Comparator<Object>() {
			public final int compare(Object o1, Object o2) {
				return (o1 == null || o2 == null) ? 0
						: Utiles.compara(new Object[] { ((TareaTramiteExpedienteDto) o1).getFecFinPlazo() },
								new Object[] { ((TareaTramiteExpedienteDto) o2).getFecFinPlazo() });
			}
		});

		return aTareaTramiteExpedDto;
	}

	@GetMapping("/tareaTramiteExpediente/porInstructor/{instructor}")
	public List<TareaTramiteExpedienteDto> listarPorInstructorFecFin(@PathVariable String instructor) {
		String tipoFirma = null;
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		List<TareaTramiteExpediente> aTareaTramiteExped = service.findbyInstructor(instructor);
		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();

		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";
		int dias = 0;

		if (aTareaTramiteExped == null || aTareaTramiteExped.isEmpty()) {
			throw new NoDataFoundException();
		}
		List<DiaFestivo> aDiaFestivo = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);

		for (int i = 0; i < aTareaTramiteExped.size(); i++) {
			TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();

			if (aTareaTramiteExped.get(i).getArchivo() != null) {
				oTareaTramiteExpDTO.setArchivo(aTareaTramiteExped.get(i).getArchivo());
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				if (oArchivo != null) {
					File oFile = new File(oArchivo.getDesArchi());
					if (oFile.exists()) {
						String nombreFichero = oFile.getName();
						oTareaTramiteExpDTO.setNombreArchivo(nombreFichero);
					} else if (oArchivo.getDesDocum() != null) {
						oTareaTramiteExpDTO.setNombreArchivo(oArchivo.getDesDocum());
					} else {
						oTareaTramiteExpDTO.setNombreArchivo("Error al buscar el archivo");
					}
				}
			}

			if (aTareaTramiteExped.get(i).getDescripcion() != null) {
				oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
			}

			if (aTareaTramiteExped.get(i).getDocAport() != null) {
				oTareaTramiteExpDTO.setDocAport(aTareaTramiteExped.get(i).getDocAport());
			}

			if (aTareaTramiteExped.get(i).getDocumentacion() != null) {
				oTareaTramiteExpDTO.setDocumentacion(aTareaTramiteExped.get(i).getDocumentacion());
			}

			if (aTareaTramiteExped.get(i).getFecFin() != null) {
				oTareaTramiteExpDTO.setFecFin(aTareaTramiteExped.get(i).getFecFin());
			}

			if (aTareaTramiteExped.get(i).getFecInicio() != null) {
				oTareaTramiteExpDTO.setFecInicio(aTareaTramiteExped.get(i).getFecInicio());
			}

			if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
				tipoFirma = "ATENDIDA";
				TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimiento
						.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());
				if (oTareaProcedimiento != null && !oTareaProcedimiento.getTareaAutomatica()) {
					if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
						System.err.println("La tarea del procedimiento no tiene proceso firmado");
						// throw new ExcepcionSolicitudFirmado();
					} else {
						ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado
								.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
						if (oProcesoFirmado == null) {
							System.err.println("No existe proceso firmado");
							throw new ExcepcionSolicitudFirmado();
						} else if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
							tipoFirma = "DESATENDIDA";
						}
					}
				}
			}

			if (aTareaTramiteExped.get(i).getArchivo() != null && tipoFirma.equals("ATENDIDA")) {
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				long idDocum = 0;
				InformacionDocumento infDocumento = null;
				if (oArchivo.getHuella() != null) {
					if (isLong(oArchivo.getHuella())) {
						idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());
						try {
							infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);
						} catch (Exception e) {
							System.err.println(e.getMessage());
							e.printStackTrace();
						}
					} else {
						oTareaTramiteExpDTO.setFirmado(aTareaTramiteExped.get(i).getFirmado());
						//oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
					}
					try {
						if (infDocumento != null) {
							short val = infDocumento.getEstado();
							if (val == 3) {
								oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 1));
								if (aTareaTramiteExped.get(i).getFirmado() != null
										&& aTareaTramiteExped.get(i).getFirmado().equals(Short.valueOf((short) 0))) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
									service.save(aTareaTramiteExped.get(i));
								} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
									service.save(aTareaTramiteExped.get(i));
								}
							} else {
								oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
								if (aTareaTramiteExped.get(i).getFirmado() != null
										&& aTareaTramiteExped.get(i).getFirmado().equals(Short.valueOf((short) 1))) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
									service.save(aTareaTramiteExped.get(i));
								} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
									service.save(aTareaTramiteExped.get(i));
								}
							}
						}
					} catch (Exception e) {
						System.err.println(e.getMessage());
						e.printStackTrace();
					}
				} else {
					oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
				}
			} else {
				oTareaTramiteExpDTO.setFirmado(aTareaTramiteExped.get(i).getFirmado());
			}

			if (aTareaTramiteExped.get(i).getFirmante() != null) {
				oTareaTramiteExpDTO.setFirmante(aTareaTramiteExped.get(i).getFirmante());
			}

			if (aTareaTramiteExped.get(i).getId() != null) {
				oTareaTramiteExpDTO.setId(aTareaTramiteExped.get(i).getId());
			}

			if (aTareaTramiteExped.get(i).getIdDocum() != null) {
				oTareaTramiteExpDTO.setIdDocum(aTareaTramiteExped.get(i).getIdDocum());
			}

			if (aTareaTramiteExped.get(i).getIdHisDocum() != null) {
				oTareaTramiteExpDTO.setIdHisDocum(aTareaTramiteExped.get(i).getIdHisDocum());
				RdDocumento oRdDocumento = serviceRdDocumento.findById(aTareaTramiteExped.get(i).getIdHisDocum());
				if (oRdDocumento != null) {
					oTareaTramiteExpDTO.setNumRegis(
							oRdDocumento.getEjeRegis().toString() + "/" + oRdDocumento.getNumRegis().toString());
				}
			}

			if (aTareaTramiteExped.get(i).getNotificacion() != null) {
				oTareaTramiteExpDTO.setNotificacion(aTareaTramiteExped.get(i).getNotificacion());
				Notificacion oNotificacion = serviceNotificacion.findById(aTareaTramiteExped.get(i).getNotificacion());
				if (oNotificacion != null) {
					String notificacionTxt = oNotificacion.getEjeNotif().toString() + "/"
							+ oNotificacion.getNumNotif().toString();
					oTareaTramiteExpDTO.setEjeNumNotif(notificacionTxt);
				}
			}

			if (aTareaTramiteExped.get(i).getNumero() != null) {
				oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
			}

			if (aTareaTramiteExped.get(i).getPropuestaResolucion() != null) {
				oTareaTramiteExpDTO.setPropuestaResolucion(aTareaTramiteExped.get(i).getPropuestaResolucion());
			}

			if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
				oTareaTramiteExpDTO.setTareaProcedimiento(aTareaTramiteExped.get(i).getTareaProcedimiento());
			}

			if (aTareaTramiteExped.get(i).getTipAnexo() != null) {
				oTareaTramiteExpDTO.setTipAnexo(aTareaTramiteExped.get(i).getTipAnexo());
			}

			if (aTareaTramiteExped.get(i).getTipDocEni() != null) {
				oTareaTramiteExpDTO.setTipDocEni(aTareaTramiteExped.get(i).getTipDocEni());
			}

			if (aTareaTramiteExped.get(i).getTramitador() != null) {
				oTareaTramiteExpDTO.setTramitador(aTareaTramiteExped.get(i).getTramitador());
			}

			if (aTareaTramiteExped.get(i).getTramite() != null) {
				oTareaTramiteExpDTO.setTramite(aTareaTramiteExped.get(i).getTramite());
				Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
				if (oTramite != null) {
					oTareaTramiteExpDTO.setDesTramite(oTramite.getDescripcion());
					if (oTramite.getExpediente() != null) {
						Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
						if (oExpediente != null) {
							oTareaTramiteExpDTO.setEjeExped(oExpediente.getEjercicio());
							oTareaTramiteExpDTO.setNumExped(oExpediente.getNumero());
							oTareaTramiteExpDTO.setTitulo(oExpediente.getTitulo());
						}
					}

				}
			}

			if (aTareaTramiteExped.get(i).getUsuario() != null) {
				oTareaTramiteExpDTO.setUsuario(aTareaTramiteExped.get(i).getUsuario());
			}

			if (aTareaTramiteExped.get(i).getUsuContr() != null) {
				oTareaTramiteExpDTO.setUsuContr(aTareaTramiteExped.get(i).getUsuContr());
			}

			if (aTareaTramiteExped.get(i).getIdAnunc() != null) {
				oTareaTramiteExpDTO.setIdAnunc(aTareaTramiteExped.get(i).getIdAnunc());
			}

			if (aTareaTramiteExped.get(i).getVisible()) {
				oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
			} else {
				oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
			}

			if (aTareaTramiteExped != null && aTareaTramiteExped.get(i).getFecInicio() != null) {

				TareaProcedimiento oTareaProcedimeinto = serviceTareaProcedimiento
						.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());

				if (oTareaProcedimeinto != null
						&& (oTareaProcedimeinto.getPlazo() == null || oTareaProcedimeinto.getPlazo() == null)) {
					throw new NoDataFoundException();
				}
				if (oTareaProcedimeinto.getTipoPlazo() == null) {
					oTareaProcedimeinto.setTipoPlazo(EnumTipoPlazoTarea.SINPLAZO);
				}
				if (!oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SINPLAZO)) {
					if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SEMANAS)) {
						dias = oTareaProcedimeinto.getPlazo() * 7;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.MESES)) {
						dias = oTareaProcedimeinto.getPlazo() * 30;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.ANOS)) {
						dias = oTareaProcedimeinto.getPlazo() * 360;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.DIAS)) {
						dias = oTareaProcedimeinto.getPlazo() * 1;
					}
				}

				if (aDiaFestivo != null && !aDiaFestivo.isEmpty()) {
					try {
						Date oFecha = new Date();
						String color = "VERDE";
						oFecha = DiaHabil.dameFechaHabil(aTareaTramiteExped.get(i).getFecInicio(), false, dias, false,
								aDiaFestivo);
						if (oFecha == null) {
							oFecha = new Date();
						}
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String fechaTope = sdf.format(oFecha);
						oTareaTramiteExpDTO.setFecFinPlazo(oFecha);
						int diferencia = Fecha.diferenciaFechaDias(oFechaHoy, oFecha);

						if (diferencia >= 7 && diferencia <= 10) {
							color = "AMARILLO";
						} else if (diferencia < 7) {
							color = "ROJO";
						}
						oTareaTramiteExpDTO.setColor(color);
						if (aTareaTramiteExped.get(i).getFecFin() != null || oTareaProcedimeinto.getTareaAutomatica()) {
							oTareaTramiteExpDTO.setColor("VERDE");
						}
						oTareaTramiteExpDTO.setFecPlazo(fechaTope);
					} catch (Exception e) {
						throw new NoDataFoundException();
					}
				}
				aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
			} else {
				throw new NoDataFoundException();
			}
		}

		Collections.sort(aTareaTramiteExpedDto, new Comparator<Object>() {
			public final int compare(Object o1, Object o2) {
				return (o1 == null || o2 == null) ? 0
						: Utiles.compara(new Object[] { ((TareaTramiteExpedienteDto) o1).getFecFinPlazo() },
								new Object[] { ((TareaTramiteExpedienteDto) o2).getFecFinPlazo() });
			}
		});

		return aTareaTramiteExpedDto;

	}
	
	@GetMapping("/tareaTramiteExpediente/listarFirmaPendiente/{usuario}")
	public List<TareaTramiteExpedienteDto> listarPorFirmaPediente(@PathVariable String usuario) {
		Usuario oUsuario = usuarioService.findById(usuario);
		PersonaEntidad oPersonaEntidad = null;
		if(oUsuario != null && oUsuario.getIdHisPerso() != null) {
			PersonaEntidadPK oPersonaEntidadTituPK = new PersonaEntidadPK();
			oPersonaEntidadTituPK.setIdHisPerso(oUsuario.getIdHisPerso());
			oPersonaEntidadTituPK.setIdPerso(oUsuario.getIdPerso());
			oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
		}
		
		List<TareaTramiteExpediente> aTareaTramiteExped = service.findbyFirmado(Short.valueOf((short) 0));
		if (aTareaTramiteExped.isEmpty() || aTareaTramiteExped == null) {
			throw new NoDataFoundException();
		}
		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();
		
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());
		
		for(int i=0;i < aTareaTramiteExped.size(); i++) {
			if (aTareaTramiteExped.get(i).getArchivo() != null) {
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				long idDocum = 0;
				if (oArchivo.getHuella() != null && isLong(oArchivo.getHuella())) {
					idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());
					InformacionDocumento infDocumento;
					PeticionFirma oPeticionFirma = servicePeticionFirma.findByIdPetPlata(String.valueOf(idDocum));
					if(oPeticionFirma != null) {
						List<PeticionFirmante> aPeticionFirma = servicePeticionFirmante.findByIdPeticion(oPeticionFirma.getIdPeticion());
						if(aPeticionFirma != null && !aPeticionFirma.isEmpty()) {
							try {
								infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);
								if (infDocumento != null) {
									short val = infDocumento.getEstado();
									if (val != 3 && oPersonaEntidad.getNumDocum().equals(aPeticionFirma.get(0).getIdentificador())) {
										TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();
										oTareaTramiteExpDTO.setFirmante(aPeticionFirma.get(0).getDesFirmante());
										oTareaTramiteExpDTO.setId(infDocumento.getIdPeticion());
										oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
										oTareaTramiteExpDTO.setNombreArchivo(infDocumento.getDesDoc());
										oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
										if (aTareaTramiteExped.get(i).getTramite() != null) {
											Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
											Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
											oTareaTramiteExpDTO.setEjeExped(oExpediente.getEjercicio());
											oTareaTramiteExpDTO.setNumExped(oExpediente.getNumero());
											oTareaTramiteExpDTO.setTitulo(oExpediente.getTitulo());
										}
										aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
									}
								}
							} catch (Exception e) {
								System.err.println(e.getMessage());
								e.printStackTrace();
							}
						}
					}
					
				} 
			} 
		}
		return aTareaTramiteExpedDto;
	}
	
	@GetMapping("/tareaTramiteExpediente/listarFirmaPendienteTerceros/{usuario}")
	public List<TareaTramiteExpedienteDto> listarFirmaPendienteTerceros(@PathVariable String usuario) {

		List<TareaTramiteExpediente> aTareaTramiteExped = service.findByUsuario(usuario);
		if (aTareaTramiteExped.isEmpty() || aTareaTramiteExped == null) {
			throw new NoDataFoundException();
		}
		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();
		
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());
		
		for(int i=0;i < aTareaTramiteExped.size(); i++) {
			if (aTareaTramiteExped.get(i).getArchivo() != null) {
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				long idDocum = 0;
				if (oArchivo.getHuella() != null && isLong(oArchivo.getHuella())) {
					idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());
					InformacionDocumento infDocumento;
					PeticionFirma oPeticionFirma = servicePeticionFirma.findByIdPetPlata(String.valueOf(idDocum));
					if(oPeticionFirma != null) {
						List<PeticionFirmante> aPeticionFirma = servicePeticionFirmante.findByIdPeticion(oPeticionFirma.getIdPeticion());
						if(aPeticionFirma != null && !aPeticionFirma.isEmpty()) {
							try {
								infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);
								if (infDocumento != null) {
									short val = infDocumento.getEstado();
									if (val != 3) {
										TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();
										oTareaTramiteExpDTO.setFirmante(aPeticionFirma.get(0).getDesFirmante());
										oTareaTramiteExpDTO.setId(infDocumento.getIdPeticion());
										oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
										oTareaTramiteExpDTO.setNombreArchivo(infDocumento.getDesDoc());
										oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
										if (aTareaTramiteExped.get(i).getTramite() != null) {
											Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
											Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
											oTareaTramiteExpDTO.setEjeExped(oExpediente.getEjercicio());
											oTareaTramiteExpDTO.setNumExped(oExpediente.getNumero());
											oTareaTramiteExpDTO.setTitulo(oExpediente.getTitulo());
										}
										aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
									}
								}
							} catch (Exception e) {
								System.err.println(e.getMessage());
								e.printStackTrace();
							}
						}
					}
					
				} 
			} 
		}
		return aTareaTramiteExpedDto;
	}
	
	@GetMapping("/tareaTramiteExpediente/listarNotificacionPendiente/{usuario}")
	public List<TareaTramiteExpedienteDto> listarPorNotificacionPediente(@PathVariable String usuario) {
		
		List<TareaTramiteExpediente> aTareaTramiteExped = service.findByUsuario(usuario);
		if (aTareaTramiteExped.isEmpty() || aTareaTramiteExped == null) {
			throw new NoDataFoundException();
		}
		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();
		for(int i = 0; i < aTareaTramiteExped.size(); i++) {
			if(aTareaTramiteExped.get(i).getNotificacion() != null) {
				Notificacion oNotificacion = serviceNotificacion.findById(aTareaTramiteExped.get(i).getNotificacion());
				if (oNotificacion != null && (oNotificacion.getSituacion().equals(Short.valueOf((short) 2))
						|| oNotificacion.getSituacion().equals(Short.valueOf((short) 4)))) {
					TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();
					oTareaTramiteExpDTO.setId(aTareaTramiteExped.get(i).getId());
					oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
					oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
					oTareaTramiteExpDTO.setNotificacion(aTareaTramiteExped.get(i).getNotificacion());
					if (aTareaTramiteExped.get(i).getTramite() != null) {
						Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
						Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
						oTareaTramiteExpDTO.setEjeExped(oExpediente.getEjercicio());
						oTareaTramiteExpDTO.setNumExped(oExpediente.getNumero());
						oTareaTramiteExpDTO.setTitulo(oExpediente.getTitulo());
					}
					aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
				}
			}
		}
		return aTareaTramiteExpedDto;
	}

	@GetMapping("/tareaTramiteExpediente/listar/{tramite}")
	public List<TareaTramiteExpedienteDto> listarPorTramite(@PathVariable Long tramite) {
		String tipoFirma = null;
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		List<TareaTramiteExpediente> aTareaTramiteExped = service.findByTramite(tramite);
		List<TareaTramiteExpedienteDto> aTareaTramiteExpedDto = new ArrayList<TareaTramiteExpedienteDto>();

		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";
		int dias = 0;

		if (aTareaTramiteExped == null || aTareaTramiteExped.isEmpty()) {
			throw new NoDataFoundException();
		}
		List<DiaFestivo> aDiaFestivo = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);

		/*
		 * if(aDiaFestivo == null) { throw new NoFestivosFoundException(); }
		 */

		for (int i = 0; i < aTareaTramiteExped.size(); i++) {
			TareaTramiteExpedienteDto oTareaTramiteExpDTO = new TareaTramiteExpedienteDto();

			if (aTareaTramiteExped.get(i).getArchivo() != null) {
				oTareaTramiteExpDTO.setArchivo(aTareaTramiteExped.get(i).getArchivo());
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				if (oArchivo != null) {
					File oFile = new File(oArchivo.getDesArchi());
					if (oFile.exists()) {
						String nombreFichero = oFile.getName();
						oTareaTramiteExpDTO.setNombreArchivo(nombreFichero);
					} else if (oArchivo.getDesDocum() != null) {
						oTareaTramiteExpDTO.setNombreArchivo(oArchivo.getDesDocum());
					} else {
						oTareaTramiteExpDTO.setNombreArchivo("Error al buscar el archivo");
					}
					if(oArchivo.getRefGesDocum() == null) {
						oArchivo.setRefGesDocum(aTareaTramiteExped.get(i).getId().toString());
						archivoService.save(oArchivo);
					}
				}
			}

			if (aTareaTramiteExped.get(i).getDescripcion() != null) {
				oTareaTramiteExpDTO.setDescripcion(aTareaTramiteExped.get(i).getDescripcion());
			}

			if (aTareaTramiteExped.get(i).getDocAport() != null) {
				oTareaTramiteExpDTO.setDocAport(aTareaTramiteExped.get(i).getDocAport());
			}

			if (aTareaTramiteExped.get(i).getDocumentacion() != null) {
				oTareaTramiteExpDTO.setDocumentacion(aTareaTramiteExped.get(i).getDocumentacion());
			}

			if (aTareaTramiteExped.get(i).getFecFin() != null) {
				oTareaTramiteExpDTO.setFecFin(aTareaTramiteExped.get(i).getFecFin());
			}

			if (aTareaTramiteExped.get(i).getFecInicio() != null) {
				oTareaTramiteExpDTO.setFecInicio(aTareaTramiteExped.get(i).getFecInicio());
			}

			if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
				tipoFirma = "ATENDIDA";
				TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimiento
						.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());
				if (oTareaProcedimiento != null && !oTareaProcedimiento.getTareaAutomatica()) {
					if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
						System.err.println("La tarea del procedimiento no tiene proceso firmado");
						// throw new ExcepcionSolicitudFirmado();
					} else {
						ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado
								.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
						if (oProcesoFirmado == null) {
							System.err.println("No existe proceso firmado");
							throw new ExcepcionSolicitudFirmado();
						} else if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
							tipoFirma = "DESATENDIDA";
						}
					}
				}
			}

			if (aTareaTramiteExped.get(i).getArchivo() != null && tipoFirma.equals("ATENDIDA")) {
				Archivo oArchivo = archivoService.findById(aTareaTramiteExped.get(i).getArchivo());
				long idDocum = 0;
				if (oArchivo.getHuella() != null && isLong(oArchivo.getHuella())) {
					idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());
					InformacionDocumento infDocumento;
					try {
						infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);
						if (infDocumento != null) {
							short val = infDocumento.getEstado();
							if (val == 3) {
								oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 1));
								if (aTareaTramiteExped.get(i).getFirmado() != null
										&& aTareaTramiteExped.get(i).getFirmado().equals(Short.valueOf((short) 0))) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
									service.save(aTareaTramiteExped.get(i));
								} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 1));
									service.save(aTareaTramiteExped.get(i));
								}
							} else {
								oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
								if (aTareaTramiteExped.get(i).getFirmado() != null
										&& aTareaTramiteExped.get(i).getFirmado().equals(Short.valueOf((short) 1))) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
									service.save(aTareaTramiteExped.get(i));
								} else if (aTareaTramiteExped.get(i).getFirmado() == null) {
									aTareaTramiteExped.get(i).setFirmado(Short.valueOf((short) 0));
									service.save(aTareaTramiteExped.get(i));
								}
							}
						}
					} catch (Exception e) {
						System.err.println(e.getMessage());
						e.printStackTrace();
					}
				} else if(aTareaTramiteExped.get(i).getFecFin() != null && 	oArchivo.getIdPeticion() != null) {	
					oTareaTramiteExpDTO.setFirmado(aTareaTramiteExped.get(i).getFirmado());
				} else {
					oTareaTramiteExpDTO.setFirmado(Short.valueOf((short) 0));
				}
			} else {
				oTareaTramiteExpDTO.setFirmado(aTareaTramiteExped.get(i).getFirmado());
			}

			if (aTareaTramiteExped.get(i).getFirmante() != null) {
				oTareaTramiteExpDTO.setFirmante(aTareaTramiteExped.get(i).getFirmante());
			}

			if (aTareaTramiteExped.get(i).getId() != null) {
				oTareaTramiteExpDTO.setId(aTareaTramiteExped.get(i).getId());
			}

			if (aTareaTramiteExped.get(i).getIdDocum() != null) {
				oTareaTramiteExpDTO.setIdDocum(aTareaTramiteExped.get(i).getIdDocum());
			}

			if (aTareaTramiteExped.get(i).getIdHisDocum() != null) {
				oTareaTramiteExpDTO.setIdHisDocum(aTareaTramiteExped.get(i).getIdHisDocum());
				RdDocumento oRdDocumento = serviceRdDocumento.findById(aTareaTramiteExped.get(i).getIdHisDocum());
				if (oRdDocumento != null) {
					oTareaTramiteExpDTO.setNumRegis(
							oRdDocumento.getEjeRegis().toString() + "/" + oRdDocumento.getNumRegis().toString());
				}
			}

			if (aTareaTramiteExped.get(i).getNotificacion() != null) {
				oTareaTramiteExpDTO.setNotificacion(aTareaTramiteExped.get(i).getNotificacion());
				Notificacion oNotificacion = serviceNotificacion.findById(aTareaTramiteExped.get(i).getNotificacion());
				if (oNotificacion != null) {
					String notificacionTxt = oNotificacion.getEjeNotif().toString() + "/"
							+ oNotificacion.getNumNotif().toString();
					oTareaTramiteExpDTO.setEjeNumNotif(notificacionTxt);
				}
			}

			if (aTareaTramiteExped.get(i).getNumero() != null) {
				oTareaTramiteExpDTO.setNumero(aTareaTramiteExped.get(i).getNumero());
			}

			if (aTareaTramiteExped.get(i).getPropuestaResolucion() != null) {
				oTareaTramiteExpDTO.setPropuestaResolucion(aTareaTramiteExped.get(i).getPropuestaResolucion());
			}

			if (aTareaTramiteExped.get(i).getTareaProcedimiento() != null) {
				oTareaTramiteExpDTO.setTareaProcedimiento(aTareaTramiteExped.get(i).getTareaProcedimiento());
			}

			if (aTareaTramiteExped.get(i).getTipAnexo() != null) {
				oTareaTramiteExpDTO.setTipAnexo(aTareaTramiteExped.get(i).getTipAnexo());
			}

			if (aTareaTramiteExped.get(i).getTipDocEni() != null) {
				oTareaTramiteExpDTO.setTipDocEni(aTareaTramiteExped.get(i).getTipDocEni());
			}

			if (aTareaTramiteExped.get(i).getTramitador() != null) {
				oTareaTramiteExpDTO.setTramitador(aTareaTramiteExped.get(i).getTramitador());
			}

			if (aTareaTramiteExped.get(i).getTramite() != null) {
				oTareaTramiteExpDTO.setTramite(aTareaTramiteExped.get(i).getTramite());
				Tramite oTramite = serviceTramite.findById(aTareaTramiteExped.get(i).getTramite());
				if (oTramite != null) {
					oTareaTramiteExpDTO.setDesTramite(oTramite.getDescripcion());
				}
			}

			if (aTareaTramiteExped.get(i).getUsuario() != null) {
				oTareaTramiteExpDTO.setUsuario(aTareaTramiteExped.get(i).getUsuario());
			}

			if (aTareaTramiteExped.get(i).getUsuContr() != null) {
				oTareaTramiteExpDTO.setUsuContr(aTareaTramiteExped.get(i).getUsuContr());
			}

			if (aTareaTramiteExped.get(i).getIdAnunc() != null) {
				oTareaTramiteExpDTO.setIdAnunc(aTareaTramiteExped.get(i).getIdAnunc());
			}

			if (aTareaTramiteExped.get(i).getVisible()) {
				oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
			} else {
				oTareaTramiteExpDTO.setVisible(aTareaTramiteExped.get(i).getVisible());
			}

			if (aTareaTramiteExped != null && aTareaTramiteExped.get(i).getFecInicio() != null) {

				TareaProcedimiento oTareaProcedimeinto = serviceTareaProcedimiento
						.findById(aTareaTramiteExped.get(i).getTareaProcedimiento());

				if (oTareaProcedimeinto != null
						&& (oTareaProcedimeinto.getPlazo() == null || oTareaProcedimeinto.getPlazo() == null)) {
					throw new NoDataFoundException();
				}
				if (oTareaProcedimeinto.getTipoPlazo() == null) {
					oTareaProcedimeinto.setTipoPlazo(EnumTipoPlazoTarea.SINPLAZO);
				}
				if (!oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SINPLAZO)) {
					if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SEMANAS)) {
						dias = oTareaProcedimeinto.getPlazo() * 7;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.MESES)) {
						dias = oTareaProcedimeinto.getPlazo() * 30;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.ANOS)) {
						dias = oTareaProcedimeinto.getPlazo() * 360;
					} else if (oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.DIAS)) {
						dias = oTareaProcedimeinto.getPlazo() * 1;
					}
				}

				if (aDiaFestivo != null && !aDiaFestivo.isEmpty()) {
					try {
						Date oFecha = new Date();
						String color = "VERDE";
						oFecha = DiaHabil.dameFechaHabil(aTareaTramiteExped.get(i).getFecInicio(), false, dias, false,
								aDiaFestivo);
						if (oFecha == null) {
							oFecha = new Date();
						}
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String fechaTope = sdf.format(oFecha);

						int diferencia = Fecha.diferenciaFechaDias(oFechaHoy, oFecha);

						if (diferencia >= 7 && diferencia <= 10) {
							color = "AMARILLO";
						} else if (diferencia < 7) {
							color = "ROJO";
						}
						oTareaTramiteExpDTO.setColor(color);
						if (aTareaTramiteExped.get(i).getFecFin() != null || oTareaProcedimeinto.getTareaAutomatica()) {
							oTareaTramiteExpDTO.setColor("VERDE");
						}
						oTareaTramiteExpDTO.setFecPlazo(fechaTope);
					} catch (Exception e) {
						throw new NoDataFoundException();
					}
				}
				aTareaTramiteExpedDto.add(oTareaTramiteExpDTO);
			} else {
				throw new NoDataFoundException();
			}
		}

		return aTareaTramiteExpedDto;
	}

	@GetMapping("/tareaTramiteExpediente/listarUsuario/{usuario}")
	public List<TareaTramiteExpediente> listarPorUsuario(@PathVariable String usuario) {
		List<TareaTramiteExpediente> aTareaTramiteExped = service.findByUsuario(usuario);
		if (aTareaTramiteExped.isEmpty() || aTareaTramiteExped == null) {
			throw new NoDataFoundException();
		}
		List<TareaTramiteExpediente> aTareaTramiteExpedFiltrados = new ArrayList<TareaTramiteExpediente>();
		;
		for (int i = 0; i < aTareaTramiteExped.size(); i++) {
			if (aTareaTramiteExped.get(i).getFecFin() != null) {
				aTareaTramiteExpedFiltrados.add(aTareaTramiteExped.get(i));
			}
		}
		return aTareaTramiteExped;
	}

	@PutMapping("/tareaTramiteExpediente/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TareaTramiteExpedienteDto editar(@RequestBody TareaTramiteExpediente tarTraExped, @PathVariable Long id) {
		TareaTramiteExpediente oTraExpExped = service.findById(id);
		TareaTramiteExpedienteDto oTraExpDto = new TareaTramiteExpedienteDto();
		String modificacion = "Campo modificado:";;

		if (tarTraExped.getVisible() != null) {
			oTraExpExped.setVisible(tarTraExped.getVisible());
			oTraExpDto.setVisible(tarTraExped.getVisible());
			modificacion = modificacion + " visible ";
		}

		if (tarTraExped.getArchivo() != null) {
			oTraExpExped.setArchivo(tarTraExped.getArchivo());
			oTraExpDto.setArchivo(tarTraExped.getArchivo());
			Archivo oArchivo = archivoService.findById(tarTraExped.getArchivo());
			if (oArchivo != null) {
				File oFile = new File(oArchivo.getDesArchi());
				if (oFile.exists()) {
					String nombreFichero = oFile.getName();
					oTraExpDto.setNombreArchivo(nombreFichero);
				} else if (oArchivo.getDesDocum() != null) {
					oTraExpDto.setNombreArchivo(oArchivo.getDesDocum());
				} else {
					oTraExpDto.setNombreArchivo("Error al buscar el archivo");
				}
			}
			modificacion = modificacion + " archivo ";
		}

		if (tarTraExped.getDescripcion() != null) {
			oTraExpExped.setDescripcion(tarTraExped.getDescripcion());
			oTraExpDto.setDescripcion(tarTraExped.getDescripcion());
			modificacion = modificacion + " descripción ";
		}
		
		if (tarTraExped.getAccion() != null) {
			oTraExpExped.setAccion(tarTraExped.getAccion());
			oTraExpDto.setAccion(tarTraExped.getAccion());
			modificacion = modificacion + " acción ";
		}

		if (tarTraExped.getFecFin() != null) {
			oTraExpExped.setFecFin(tarTraExped.getFecFin());
			oTraExpDto.setFecFin(tarTraExped.getFecFin());
			modificacion = modificacion + " fecha fin ";
		}

		if (tarTraExped.getFecInicio() != null) {
			oTraExpExped.setFecInicio(tarTraExped.getFecInicio());
			oTraExpDto.setFecInicio(tarTraExped.getFecInicio());
			modificacion = modificacion + " fecha inciio ";
		}

		if (tarTraExped.getFirmante() != null) {
			oTraExpExped.setFirmante(tarTraExped.getFirmante());
			oTraExpDto.setFirmante(tarTraExped.getFirmante());
			modificacion = modificacion + " firmante ";
		}

		if (tarTraExped.getId() != null) {
			oTraExpExped.setId(tarTraExped.getId());
			oTraExpDto.setId(tarTraExped.getId());
			modificacion = modificacion + " id ";
		}

		if (tarTraExped.getIdHisDocum() != null) {
			oTraExpExped.setIdHisDocum(tarTraExped.getIdHisDocum());
			oTraExpDto.setIdHisDocum(tarTraExped.getIdHisDocum());
			RdDocumento oRdDocumento = serviceRdDocumento.findById(tarTraExped.getIdHisDocum());
			if (oRdDocumento != null) {
				oTraExpDto.setNumRegis(
						oRdDocumento.getEjeRegis().toString() + "/" + oRdDocumento.getNumRegis().toString());
			}
			modificacion = modificacion + " registro documento: " + oRdDocumento.getEjeRegis().toString() + "/" + oRdDocumento.getNumRegis().toString();
		}

		if (tarTraExped.getIdDocum() != null) {
			oTraExpExped.setIdDocum(tarTraExped.getIdDocum());
			oTraExpDto.setIdDocum(tarTraExped.getIdDocum());
		}

		if (tarTraExped.getNumero() != null) {
			oTraExpExped.setNumero(tarTraExped.getNumero());
			oTraExpDto.setNumero(tarTraExped.getNumero());
			modificacion = modificacion + " numero ";
		}

		if (tarTraExped.getNotificacion() != null) {
			oTraExpExped.setNotificacion(tarTraExped.getNotificacion());
			oTraExpDto.setNotificacion(tarTraExped.getNotificacion());
			Notificacion oNotificacion = serviceNotificacion.findById(tarTraExped.getNotificacion());
			if (oNotificacion != null) {
				String notificacionTxt = oNotificacion.getEjeNotif().toString() + "/"
						+ oNotificacion.getNumNotif().toString();
				oTraExpDto.setEjeNumNotif(notificacionTxt);
				modificacion = modificacion + " notificación " + notificacionTxt;
			}
		}

		if (tarTraExped.getFirmado() != null) {
			oTraExpExped.setFirmado(tarTraExped.getFirmado());
			oTraExpDto.setFirmado(tarTraExped.getFirmado());
			modificacion = modificacion + " firmado ";
		}

		if (tarTraExped.getPropuestaResolucion() != null) {
			oTraExpExped.setPropuestaResolucion(tarTraExped.getPropuestaResolucion());
			oTraExpDto.setPropuestaResolucion(tarTraExped.getPropuestaResolucion());
			modificacion = modificacion + " propuesta resolución " + tarTraExped.getPropuestaResolucion().toString();
		}

		if (tarTraExped.getTareaProcedimiento() != null) {
			oTraExpExped.setTareaProcedimiento(tarTraExped.getTareaProcedimiento());
			oTraExpDto.setTareaProcedimiento(tarTraExped.getTareaProcedimiento());
			modificacion = modificacion + " tarea procedimiento ";
		}

		if (tarTraExped.getTramitador() != null) {
			oTraExpExped.setTramitador(tarTraExped.getTramitador());
			oTraExpDto.setTramitador(tarTraExped.getTramitador());
			modificacion = modificacion + " tramitador ";
		}

		if (tarTraExped.getUsuario() != null) {
			oTraExpExped.setUsuario(tarTraExped.getUsuario());
			oTraExpDto.setUsuario(tarTraExped.getUsuario());
			modificacion = modificacion + " usuario ";
		}

		if (tarTraExped.getIdAnunc() != null) {
			oTraExpExped.setIdAnunc(tarTraExped.getIdAnunc());
			oTraExpDto.setIdAnunc(tarTraExped.getIdAnunc());
			modificacion = modificacion + " tablón anuncion " + tarTraExped.getIdAnunc().toString();
		}

		if (tarTraExped.getUsuContr() != null) {
			oTraExpExped.setUsuContr(tarTraExped.getUsuContr());
			oTraExpDto.setUsuContr(tarTraExped.getUsuContr());
		}

		if (tarTraExped.getTipAnexo() != null) {
			oTraExpExped.setTipAnexo(tarTraExped.getTipAnexo());
			oTraExpDto.setTipAnexo(tarTraExped.getTipAnexo());
			modificacion = modificacion + " tipo anexo ";
		}

		if (tarTraExped.getDocAport() != null) {
			oTraExpExped.setDocAport(tarTraExped.getDocAport());
			oTraExpDto.setDocAport(tarTraExped.getDocAport());
			modificacion = modificacion + " documentación aportada ";
		}

		if (tarTraExped.getTipDocEni() != null) {
			oTraExpExped.setTipDocEni(tarTraExped.getTipDocEni());
			oTraExpDto.setTipDocEni(tarTraExped.getTipDocEni());
			modificacion = modificacion + " tipo documento ENI ";
		}

		if (tarTraExped.getDocumentacion() != null) {
			oTraExpExped.setDocumentacion(tarTraExped.getDocumentacion());
			oTraExpDto.setDocumentacion(tarTraExped.getDocumentacion());
			modificacion = modificacion + " documentación ";
		}


		oTraExpExped.setFecContr(new Date());
		
		
		TareaTramiteExpediente oTareaExpedienteNuevo = service.save(oTraExpExped);
		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();
		
		oTareaHistorio.setCodArchi(oTareaExpedienteNuevo.getArchivo());
		oTareaHistorio.setDesIndic("Modificación Tarea: " + modificacion);	
		oTareaHistorio.setDesTarea(oTareaExpedienteNuevo.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTareaExpedienteNuevo.getFecInicio());
		oTareaHistorio.setTarea(oTareaExpedienteNuevo.getId());
		oTareaHistorio.setUsuario(oTareaExpedienteNuevo.getUsuario());
		oTareaHistorio.setUsuContr(oTareaExpedienteNuevo.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);

		return oTraExpDto;
	}

	@GetMapping("/tareaTramiteExpediente/ver/{id}")
	public TareaTramiteExpedienteDto detalle(@PathVariable Long id) {
		TareaTramiteExpediente tarTraExped = service.findById(id);
		TareaTramiteExpedienteDto oTraExpDto = new TareaTramiteExpedienteDto();

		if (tarTraExped.getVisible() != null) {
			oTraExpDto.setVisible(tarTraExped.getVisible());
		}

		if (tarTraExped.getArchivo() != null) {
			oTraExpDto.setArchivo(tarTraExped.getArchivo());
		}

		if (tarTraExped.getDescripcion() != null) {
			oTraExpDto.setDescripcion(tarTraExped.getDescripcion());
		}

		if (tarTraExped.getFecFin() != null) {
			oTraExpDto.setFecFin(tarTraExped.getFecFin());
		}

		if (tarTraExped.getFecInicio() != null) {
			oTraExpDto.setFecInicio(tarTraExped.getFecInicio());
		}

		if (tarTraExped.getFirmante() != null) {
			oTraExpDto.setFirmante(tarTraExped.getFirmante());
		}

		if (tarTraExped.getId() != null) {
			oTraExpDto.setId(tarTraExped.getId());
		}

		if (tarTraExped.getIdHisDocum() != null) {
			oTraExpDto.setIdHisDocum(tarTraExped.getIdHisDocum());
			RdDocumento oRdDocumento = serviceRdDocumento.findById(tarTraExped.getIdHisDocum());
			if (oRdDocumento != null) {
				oTraExpDto.setNumRegis(
						oRdDocumento.getEjeRegis().toString() + "/" + oRdDocumento.getNumRegis().toString());
			}
		}

		if (tarTraExped.getIdDocum() != null) {
			oTraExpDto.setIdDocum(tarTraExped.getIdDocum());
		}

		if (tarTraExped.getNumero() != null) {
			oTraExpDto.setNumero(tarTraExped.getNumero());
		}

		if (tarTraExped.getPropuestaResolucion() != null) {
			oTraExpDto.setPropuestaResolucion(tarTraExped.getPropuestaResolucion());
		}

		if (tarTraExped.getNotificacion() != null) {
			oTraExpDto.setNotificacion(tarTraExped.getNotificacion());
		}

		if (tarTraExped.getIdAnunc() != null) {
			oTraExpDto.setIdAnunc(tarTraExped.getIdAnunc());
		}

		if (tarTraExped.getFirmado() != null) {
			oTraExpDto.setFirmado(tarTraExped.getFirmado());
		}

		if (tarTraExped.getTareaProcedimiento() != null) {
			oTraExpDto.setTareaProcedimiento(tarTraExped.getTareaProcedimiento());
		}

		if (tarTraExped.getTramitador() != null) {
			oTraExpDto.setTramitador(tarTraExped.getTramitador());
		}

		if (tarTraExped.getUsuario() != null) {
			oTraExpDto.setUsuario(tarTraExped.getUsuario());
		}

		if (tarTraExped.getUsuContr() != null) {
			oTraExpDto.setUsuContr(tarTraExped.getUsuContr());
		}

		return oTraExpDto;
	}

	public boolean isLong(String numero) {
		try {
			Long.parseLong(numero);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public Etiquetas getEtiquetas(String Usuario, Archivo oArchivo) {

		Etiquetas oEtiquetas = new Etiquetas();
		Locale oLocale = Locale.of("es", "ES");

		oEtiquetas.setNomAyto(getValParam(Short.valueOf((short) 19)));
		oEtiquetas.setCiudad(getValParam(Short.valueOf((short) 20)));
		oEtiquetas.setCpAyto(getValParam(Short.valueOf((short) 36)));
		oEtiquetas.setDomAyto(getValParam(Short.valueOf((short) 47)));
		oEtiquetas.setTtoAyto(getValParam(Short.valueOf((short) 21)));
		oEtiquetas.setNomAlcal(getValParam(Short.valueOf((short) 22)));
		oEtiquetas.setNomSecre(getValParam(Short.valueOf((short) 23)));
		oEtiquetas.setNomIntev(getValParam(Short.valueOf((short) 24)));
		oEtiquetas.setNomTesor(getValParam(Short.valueOf((short) 25)));
		oEtiquetas.setFirma01(getValParam(Short.valueOf((short) 26)));
		oEtiquetas.setFirma02(getValParam(Short.valueOf((short) 27)));
		oEtiquetas.setFirma03(getValParam(Short.valueOf((short) 28)));
		oEtiquetas.setFirma04(getValParam(Short.valueOf((short) 29)));
		oEtiquetas.setFirma05(getValParam(Short.valueOf((short) 264)));
		oEtiquetas.setFirma06(getValParam(Short.valueOf((short) 275)));

		oEtiquetas.setFecEmisi(Fecha.formatear(new Date(), Formateador.FECHA_CORTA, oLocale));
		oEtiquetas.setDiaEmisi(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_DIA, oLocale), 2, true, true));
		oEtiquetas.setDiaSemEmisi(Fecha.formatear(new Date(), Formateador.LETRA_DIA, oLocale));
		oEtiquetas.setMesEmisi(Fecha.formatear(new Date(), Formateador.LETRA_MES, oLocale));
		oEtiquetas.setAnoEmisi(Cadena.padCadena(Fecha.formatear(new Date(), Formateador.AÑO, oLocale), 4, true, true));

		oEtiquetas.setFecha(Fecha.formatear(new Date(), Formateador.FECHA_CORTA, oLocale));
		oEtiquetas.setFecDiaNumer(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_DIA, oLocale), 2, true, true));
		oEtiquetas.setFecMesNumer(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_MES, oLocale), 2, true, true));
		oEtiquetas
				.setFecAnoNumer(Cadena.padCadena(Fecha.formatear(new Date(), Formateador.AÑO, oLocale), 4, true, true));

		oEtiquetas.setFecAnoDosDigit(Fecha.formatear(new Date(), Formateador.AÑO_CORTO, oLocale));
		oEtiquetas.setFecDiaLetra(Fecha.formatear(new Date(), Formateador.LETRA_DIA, oLocale));
		oEtiquetas.setFecMesLetra(Fecha.formatear(new Date(), Formateador.LETRA_MES, oLocale));
		// oEtiquetas.setFecAnoLetra(Fecha.devuelveAnoLetra(new Date()));

		oEtiquetas.setUsuario("gos");

		if (oArchivo.getRefGesDocum() != null && isLong(oArchivo.getRefGesDocum())) {
			String sIdTarea = oArchivo.getRefGesDocum();
			Long idTarea = Long.parseLong(sIdTarea);
			TareaTramiteExpediente oTarea = service.findById(idTarea);
			oEtiquetas.setDesTarea(oTarea.getDescripcion());
			if (oTarea != null) {
				oEtiquetas.setDesTarea(oTarea.getDescripcion());
				Tramite oTramte = serviceTramite.findById(oTarea.getTramite());
				if (oTramte != null) {
					Expediente oExpediente = serviceExpediente.findById(oTramte.getExpediente());
					if (oExpediente != null) {
						List<AtributoExpediente> aAtributos = atributoExpedienteService
								.findByIdExped(oExpediente.getId());
						if (aAtributos != null && !aAtributos.isEmpty()) {
							if(aAtributos.size() == 1) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
							}else if(aAtributos.size() == 2) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
							}else if(aAtributos.size() == 3) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
							}else if(aAtributos.size() == 4) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
							}else if(aAtributos.size() == 5) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
								oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
								oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
							}else if(aAtributos.size() == 6) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
								oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
								oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
								oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
								oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
							}else if(aAtributos.size() == 7) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
								oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
								oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
								oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
								oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
								oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
								oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
							}else if(aAtributos.size() == 8) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
								oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
								oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
								oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
								oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
								oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
								oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
								oEtiquetas.setEtiAtr08(aAtributos.get(7).getEtiGruAtrib());
								oEtiquetas.setValAtr08(aAtributos.get(7).getValor());
							}else if(aAtributos.size() == 9) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
								oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
								oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
								oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
								oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
								oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
								oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
								oEtiquetas.setEtiAtr08(aAtributos.get(7).getEtiGruAtrib());
								oEtiquetas.setValAtr08(aAtributos.get(7).getValor());
								oEtiquetas.setEtiAtr09(aAtributos.get(8).getEtiGruAtrib());
								oEtiquetas.setValAtr09(aAtributos.get(8).getValor());
							}else if(aAtributos.size() == 10) {
								oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
								oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
								oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
								oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
								oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
								oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
								oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
								oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
								oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
								oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
								oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
								oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
								oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
								oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
								oEtiquetas.setEtiAtr08(aAtributos.get(7).getEtiGruAtrib());
								oEtiquetas.setValAtr08(aAtributos.get(7).getValor());
								oEtiquetas.setEtiAtr09(aAtributos.get(8).getEtiGruAtrib());
								oEtiquetas.setValAtr09(aAtributos.get(8).getValor());
								oEtiquetas.setEtiAtr10(aAtributos.get(9).getEtiGruAtrib());
								oEtiquetas.setValAtr10(aAtributos.get(9).getValor());
							}							
						}

						Procedimiento oProcedimiento = serviceProcedimiento.findById(oExpediente.getProcedimiento());
						if (oProcedimiento != null) {
							oEtiquetas.setDesProce(oProcedimiento.getDescripcion());
							oEtiquetas.setDepartamento(oProcedimiento.getDepartamento().getDesEleme());
						}
						oEtiquetas.setEjeExped(oExpediente.getEjercicio().toString());
						oEtiquetas.setNumExped(oExpediente.getNumero().toString());
						oEtiquetas.setDesExped(oExpediente.getTitulo());
						PersonaEntidadPK oPersonaEntidadTituPK = new PersonaEntidadPK();
						oPersonaEntidadTituPK.setIdHisPerso(oExpediente.getIdHisPerso());
						oPersonaEntidadTituPK.setIdPerso(oExpediente.getIdPerso());
						PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
						if (oPersonaEntidad != null) {
							oEtiquetas.setNomInter(oPersonaEntidad.getDesPerEntid());
							oEtiquetas.setNumDocInter(oPersonaEntidad.getNumDocum());
							oEtiquetas.setDomInter(oPersonaEntidad.getDirPosta());
							oEtiquetas.setCopInter(String.valueOf(oPersonaEntidad.getCodPosta()));
							if (oPersonaEntidad.getCodProvi() > 0) {
								Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
								Provincia oProvincia = serviceProvincia.findById(codProvi);
								if (oProvincia != null) {
									oEtiquetas.setProInter(oProvincia.getDesProvi());
								}
								if (oPersonaEntidad.getCodMunic() > 0) {
									MunicipioPK MunicipioPK = new MunicipioPK();
									MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
									MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
									Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
									if (oMunicipio != null) {
										oEtiquetas.setMunInter(oMunicipio.getDesMunic());
									}
								}
							}
						}
						if (oExpediente.getIdHisRepre() != null && oExpediente.getIdRepre() != null) {
							PersonaEntidadPK oPersonaEntidadReprePK = new PersonaEntidadPK();
							oPersonaEntidadReprePK.setIdHisPerso(oExpediente.getIdHisRepre());
							oPersonaEntidadReprePK.setIdPerso(oExpediente.getIdRepre());
							PersonaEntidad oPersonaEntidadRepre = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
							if (oPersonaEntidadRepre != null) {
								oEtiquetas.setNomInter(oPersonaEntidadRepre.getDesPerEntid());
								oEtiquetas.setNumDocInter(oPersonaEntidadRepre.getNumDocum());
								oEtiquetas.setDomInter(oPersonaEntidadRepre.getDirPosta());
								oEtiquetas.setCopInter(String.valueOf(oPersonaEntidadRepre.getCodPosta()));
								if (oPersonaEntidadRepre.getCodProvi() > 0) {
									Long codProvi = Long.valueOf(oPersonaEntidadRepre.getCodProvi());
									Provincia oProvincia = serviceProvincia.findById(codProvi);
									if (oProvincia != null) {
										oEtiquetas.setProInter(oProvincia.getDesProvi());
									}
									if (oPersonaEntidad.getCodMunic() > 0) {
										MunicipioPK MunicipioPK = new MunicipioPK();
										MunicipioPK.setCodProvi(oPersonaEntidadRepre.getCodProvi());
										MunicipioPK.setCodMunic(oPersonaEntidadRepre.getCodMunic());
										Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
										if (oMunicipio != null) {
											oEtiquetas.setMunInter(oMunicipio.getDesMunic());
										}
									}
								}
							}
						}
					}
				}
			}
		}

		return oEtiquetas;

	}

	public String getValParam(Short numValor) {

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) numValor));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema != null && oParametroSistema.getValor() != null) {
			return oParametroSistema.getValor();
		}

		return null;
	}

}
