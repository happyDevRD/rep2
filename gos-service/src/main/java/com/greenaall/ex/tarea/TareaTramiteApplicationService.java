package com.greenaall.ex.tarea;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.ExcepcionArchivoExistente;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NoDataOrganoException;
import com.greenaall.exception.PdfException;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ad.entity.OrganizacionElemento;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.OrganizacionElementoServiceImpl;
import com.greenaall.models.ad.service.OrganizacionUsuarioServiceImpl;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.ArchivoServiceImpl;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.util.Utiles;

import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.libreriaENI.service.GenerateDocumentENI;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.util.file.DataFile;

/**
 * Casos de uso de orquestación para {@link TareaTramiteExpediente} extraídos
 * de {@code TareaTramiteExpedienteController} (creación de tareas y
 * finalización con generación de documento ENI).
 */
@Service
public class TareaTramiteApplicationService {

	@Autowired
	private TareaTramiteExpedienteServiceImpl service;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private TramiteServiceImpl serviceTramite;

	@Autowired
	private ArchivoServiceImpl archivoService;

	@Autowired
	private GenerateDocumentENI generateDocumentENI;

	@Autowired
	private OrganizacionElementoServiceImpl organizacionElementoServiceImpl;

	@Autowired
	private OrganizacionUsuarioServiceImpl serviceOrganizacionUsuario;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;

	public TareaTramiteExpediente crear(TareaTramiteExpediente tareaTramiteExpediente, String plantillaDefecto) {

		String ejeExped = null;
		String numExped = null;

		tareaTramiteExpediente.setFecContr(new Date());
		List<TareaTramiteExpediente> aTarTraExped = service.findByTramite(tareaTramiteExpediente.getTramite());
		if (aTarTraExped != null && !aTarTraExped.isEmpty()) {
			TareaTramiteExpediente oTarExpBus = aTarTraExped.get(aTarTraExped.size() - 1);
			Short num = (short) (oTarExpBus.getNumero() + Short.valueOf((short) 1));
			tareaTramiteExpediente.setNumero(num);
		} else {
			tareaTramiteExpediente.setNumero(Short.valueOf((short) 1));
		}

		Tramite oTramite = serviceTramite.findById(tareaTramiteExpediente.getTramite());

		if (oTramite != null && oTramite.getFase().equals(EnumFaseExpediente.INSTRUCCION)) {
			Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
			oExpediente.setFase(EnumFaseExpediente.INSTRUCCION);
			serviceExpediente.save(oExpediente);

		}
		Expediente oExpediente2 = serviceExpediente.findById(oTramite.getExpediente());
		ejeExped = oExpediente2.getEjercicio().toString();
		numExped = oExpediente2.getNumero().toString();

		if (tareaTramiteExpediente.getFecInicio() == null) {
			tareaTramiteExpediente.setFecInicio(new Date());
		}

		if (tareaTramiteExpediente.getDescripcion() == null) {
			tareaTramiteExpediente.setDescripcion("sin descripción");
		}

		if (tareaTramiteExpediente.getTareaProcedimiento() == null) {
			throw new NoDataFoundException();
		}

		if (tareaTramiteExpediente.getTipAnexo() == null) {
			tareaTramiteExpediente.setTipAnexo(Short.valueOf((short) 0));
		}

		if (tareaTramiteExpediente.getDocAport() == null) {
			tareaTramiteExpediente.setDocAport(Short.valueOf((short) 0));
		}

		if (tareaTramiteExpediente.getTipDocEni() == null) {
			tareaTramiteExpediente.setTipDocEni("TD99");
		}

		if (tareaTramiteExpediente.getDocumentacion() == null) {
			tareaTramiteExpediente.setDocumentacion(Short.valueOf((short) 1));
		}

		if (plantillaDefecto != null && !plantillaDefecto.equals("undefined") && !plantillaDefecto.equals("null")
				&& tareaTramiteExpediente.getArchivo() == null) {
			ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1),
					Long.valueOf((long) 0), "es", Short.valueOf((short) 9300));
			ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

			Archivo oArchivo = ArchivoValide.altaPlantilla(oParametroSistema.getValor(), ejeExped, numExped,
					plantillaDefecto);
			if (oArchivo == null) {
				throw new ExcepcionArchivoExistente();
			}
			Archivo oAchivoNuevo = archivoService.save(oArchivo);
			tareaTramiteExpediente.setArchivo(oAchivoNuevo.getCodArchi());
		}

		TareaTramiteExpediente oTareaExpedienteNuevo = service.save(tareaTramiteExpediente);

		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();

		if (oTareaExpedienteNuevo.getArchivo() != null) {
			oTareaHistorio.setCodArchi(oTareaExpedienteNuevo.getArchivo());
		}

		oTareaHistorio.setDesIndic("Creación de la Tarea: " + oTareaExpedienteNuevo.getId().toString());
		oTareaHistorio.setDesTarea(oTareaExpedienteNuevo.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTareaExpedienteNuevo.getFecInicio());
		oTareaHistorio.setTarea(oTareaExpedienteNuevo.getId());
		oTareaHistorio.setUsuario(oTareaExpedienteNuevo.getUsuario());
		oTareaHistorio.setUsuContr(oTareaExpedienteNuevo.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);

		return oTareaExpedienteNuevo;
	}

	public void finalizar(Long idTarea) {

		String refExped = null;

		if (idTarea == null) {
			throw new NoDataFoundException();
		}

		TareaTramiteExpediente oTarea = service.findById(idTarea);
		refExped = "Tarea: " + oTarea.getId().toString();

		if (oTarea.getTramite() != null) {
			Tramite oTramite = serviceTramite.findById(oTarea.getTramite());
			if (oTramite != null) {
				Expediente oExpediente = serviceExpediente.findById(oTramite.getExpediente());
				if (oExpediente != null) {
					refExped = "Exp: " + oExpediente.getEjercicio().toString() + "/"
							+ oExpediente.getNumero().toString() + ". Tarea: " + oTarea.getId().toString();
				}
			}
		}

		List<OrganizacionUsuario> oOrganizacionUsuario = serviceOrganizacionUsuario
				.findByUsuario2(oTarea.getUsuario());
		if (oOrganizacionUsuario == null) {
			throw new NoDataFoundException();
		}

		OrganizacionElemento oOrganizacionElemento = organizacionElementoServiceImpl
				.findById(oOrganizacionUsuario.get(0).getIdOrgEleme());

		if (oOrganizacionElemento == null) {
			throw new NoDataFoundException();
		}

		if (oOrganizacionElemento.getOrgano() == null) {
			throw new NoDataOrganoException();
		}

		if (oTarea.getArchivo() != null) {
			Archivo oArchivo = archivoService.findById(oTarea.getArchivo());

			String ruta = null;
			String rutaArchvio = null;
			String extension = null;
			String firmaCsv = null;
			String estadoElaboracion = null;

			if (oArchivo != null) {
				ruta = oArchivo.getDesArchiFlow();
				extension = Utiles.getExtension(ruta);
				extension = extension.substring(extension.length() - 3);
				if (!extension.equals("pdf")) {
					throw new PdfException();
				}
			} else {
				throw new NoDataFoundException();
			}

			File initialFile = new File(ruta);
			String sFileName = Utiles.getNombreFicheroSinExtension(ruta);
			rutaArchvio = initialFile.getParent();
			InputStream targetStream;

			if (oTarea.getDocumentacion() != null && oTarea.getDocumentacion().equals(Short.valueOf((short) 1))) {
				estadoElaboracion = "EE01";
			}

			if (oTarea.getDocumentacion() != null && oTarea.getDocumentacion().equals(Short.valueOf((short) 2))) {
				estadoElaboracion = "EE03";
			}

			if (oTarea.getDocumentacion() != null && oTarea.getDocumentacion().equals(Short.valueOf((short) 3))) {
				estadoElaboracion = "EE03";
			}

			if (oTarea.getDocumentacion() == null || oTarea.getTipDocEni().equals("TD99")) {
				estadoElaboracion = "EE99";
			}

			try {
				targetStream = new FileInputStream(initialFile);
				ObjetoDocumentoENI oObjetoDocENI = Utiles.generaDocumentoENI(targetStream, extension, sFileName,
						estadoElaboracion, oOrganizacionElemento.getOrgano());
				List<FirmaENI> listadoFirma = new ArrayList<>();
				FirmaENI firmaENI = new FirmaENI();
				if (oTarea.getTipDocEni().equals("TD99")) {
					firmaENI.setEnumeracionDocumentoTipoFirma(EnumeracionDocumentoTipoFirma.SIN_FIRMAR);
				} else {
					UUID uuid = UUID.randomUUID();
					String getCve = Utiles.getCve(uuid);
					firmaCsv = new String(java.util.Base64.getEncoder().encodeToString(getCve.getBytes()));
					firmaENI.setEnumeracionDocumentoTipoFirma(EnumeracionDocumentoTipoFirma.TF_01);
					firmaENI.setCsv(firmaCsv);
					firmaENI.setRegulacionCsv("BOE-A-2015-10566");
					oArchivo.setHuellaCSV(firmaCsv);
					oArchivo.setTipFiche(Short.valueOf((short) 4));
					oArchivo.setRefGesDocum(refExped);
					archivoService.save(oArchivo);
				}
				listadoFirma.add(firmaENI);
				oObjetoDocENI.setFirmas(listadoFirma);
				InputStream contenido = generateDocumentENI.generateENI(oObjetoDocENI);
				rutaArchvio = rutaArchvio + File.separator + sFileName + ".xml";
				DataFile.writePathData(contenido, new File(rutaArchvio));
				System.out.println("ObjetoDocumentoENI creado");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		oTarea.setFecFin(new Date());

		TareaTramiteExpediente oTareaExpedienteNuevo = service.save(oTarea);
		TareaHistoricoTramiteExpediente oTareaHistorio = new TareaHistoricoTramiteExpediente();

		oTareaHistorio.setCodArchi(oTareaExpedienteNuevo.getArchivo());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		oTareaHistorio.setDesIndic("Finalización de la tarea: " + sdf.format(oTareaExpedienteNuevo.getFecFin()));
		oTareaHistorio.setDesTarea(oTareaExpedienteNuevo.getDescripcion());
		oTareaHistorio.setFecContr(new Date());
		oTareaHistorio.setFecTarea(oTareaExpedienteNuevo.getFecInicio());
		oTareaHistorio.setTarea(oTareaExpedienteNuevo.getId());
		oTareaHistorio.setUsuario(oTareaExpedienteNuevo.getUsuario());
		oTareaHistorio.setUsuContr(oTareaExpedienteNuevo.getUsuContr());
		serviceTareaHistorico.save(oTareaHistorio);
	}
}
