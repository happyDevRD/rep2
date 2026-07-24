package com.greenaall.ge.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.greenaall.exception.ErrorEnvioEmail;
import com.greenaall.exception.ErrorGenerarMetadatosException;
import com.greenaall.exception.ExcepcionArchivoExistente;
import com.greenaall.exception.ExcepcionDocumentoEnEfirma;
import com.greenaall.exception.ExcepcionNoExisteParametroSistema;
import com.greenaall.exception.ExcepcionObtenerIdPeticion;
import com.greenaall.exception.ExcepcionSolicitudFirmado;
import com.greenaall.exception.FicheroNoSoportadoException;
import com.greenaall.exception.FirmaExistenteException;
import com.greenaall.exception.NoCertificadoFoundException;
import com.greenaall.exception.NoDNIUsuarioFoundException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.exception.NoFicheroPdfException;
import com.greenaall.exception.NoFileException;
import com.greenaall.exception.NoFirmafException;
import com.greenaall.exception.NoPersonaCargoFoundException;
import com.greenaall.ge.archivo.ArchivoApplicationService;
import com.greenaall.ge.dto.ArchivoDto;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.ge.dto.IndiceENI;
import com.greenaall.ge.dto.MetadatosENI;
import com.greenaall.ge.ef.ln.InformacionDocumento;
import com.greenaall.ge.firma.ConectorEFirma;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.SolicitudServiceImpl;
import com.greenaall.models.ex.service.TareaHistoricoTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;
import com.greenaall.models.ge.dto.DatosFirma;
import com.greenaall.models.ge.dto.DatosFirmaDto;
import com.greenaall.models.ge.dto.PersonaFirmante;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.CargoFirma;
import com.greenaall.models.ge.entity.CargoPersona;
import com.greenaall.models.ge.entity.Certificado;
import com.greenaall.models.ge.entity.Firma;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.entity.PeticionFirma;
import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.models.ge.service.CargoFirmaServiceImpl;
import com.greenaall.models.ge.service.CargoPersonaServiceImpl;
import com.greenaall.models.ge.service.FirmaServiceImpl;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.ge.service.ICertificadoService;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.ge.service.IUsuarioService;
import com.greenaall.models.ge.service.ProcesoFirmadoServiceImpl;
import com.greenaall.models.pe.entity.PersonaCargo;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.IPersonaCargoService;
import com.greenaall.models.pe.service.IPersonaEntidadService;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.util.Cadena;
import com.greenaall.util.Codificador;
import com.greenaall.util.ConvertirPDF;
import com.greenaall.util.Fecha;
import com.greenaall.util.Fichero;
import com.greenaall.util.FirmaServidor;
import com.greenaall.util.Formateador;
import com.greenaall.util.Utiles;

import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jmmoyano
 */

@RestController
public class ArchivoController {

	@Autowired
	private IArchivoService archivoService;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IPersonaEntidadService personaEntidadService;

	@Autowired
	private ICertificadoService certficadoService;

	@Autowired
	private IPersonaCargoService personaCargoService;

	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;

	@Autowired
	private TramiteServiceImpl serviceTramite;

	@Autowired
	private SolicitudServiceImpl serviceSolicitud;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private ProcesoFirmadoServiceImpl serviceProcesoFirmado;

	@Autowired
	private TareaProcedimientoServiceImpl serviceTareaProcedimietno;

	@Autowired
	private FirmaServiceImpl serviceFirma;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private CargoFirmaServiceImpl serviceCargoFirma;

	@Autowired
	private CargoPersonaServiceImpl serviceCargoPersona;

	@Autowired
	private TareaHistoricoTramiteExpedienteServiceImpl serviceTareaHistorico;

	@Autowired
	private ArchivoApplicationService archivoApplicationService;

	@GetMapping("/archivo/descarga/{id}")
	public void download(@PathVariable Long id, @PathVariable String usuario, @PathVariable String departamento,
			@PathVariable Long idTarea, HttpServletResponse response) throws Exception {

		Archivo oArchivo = archivoService.findById(id);
		if (oArchivo != null) {
			File file = new File(oArchivo.getDesArchiFlow());
			FileInputStream fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();
		} else {
			throw new NoDataFoundException();
		}
	}

	@GetMapping("/archivo/descargaSolicitud/{id}")
	public void downloadSolicitud(@PathVariable Long id, HttpServletResponse response) throws Exception {

		Archivo oArchivo = archivoService.findById(id);
		String sIdSolic = null;
		String ejercicio = null;
		String numero = null;
		String nombreArchivo = null;
		if (oArchivo != null) {
			if (oArchivo.getDesArchiFlow() == null) {
				if (oArchivo.getRefGesDocum() != null) {
					sIdSolic = oArchivo.getRefGesDocum();
					Long idSolic = Long.parseLong(sIdSolic);
					Solicitud oSolicitud = serviceSolicitud.findById(idSolic);
					if (oSolicitud != null) {
						ejercicio = oSolicitud.getEjercicio().toString();
						numero = oSolicitud.getNumero().toString();
					}
				}
				if (oArchivo.getDesDocum() != null) {
					nombreArchivo = oArchivo.getDesDocum();
				}

				String ruta = dameRutaServidor(1, ejercicio, numero, nombreArchivo);

				if (oArchivo.getArcExpd() != null) {
					byte[] byteLeidos = oArchivo.getArcExpd();
					IOUtils.write(byteLeidos, new FileOutputStream(ruta));
					oArchivo.setDesArchiFlow(ruta);
					archivoService.save(oArchivo);
				}

			}
			File file = new File(oArchivo.getDesArchiFlow());
			FileInputStream fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();
		} else {
			throw new NoDataFoundException();
		}
	}

	@GetMapping("/archivo/descargaTarea/{id}/{usuario}")
	public void downloadTarea(@PathVariable Long id, @PathVariable String  usuario, HttpServletResponse response) throws Exception {

		Archivo oArchivo = archivoService.findById(id);
		Etiquetas oEtiquetas = archivoApplicationService.getEtiquetas(usuario, oArchivo);
		String sIdTarea = null;
		String ejercicio = null;
		String numero = null;
		String nombreArchivo = null;
		if (oArchivo != null) {
			if (oArchivo.getDesArchiFlow() == null) {
				if (oArchivo.getRefGesDocum() != null) {
					sIdTarea = oArchivo.getRefGesDocum();
					Long idTarea = Long.parseLong(sIdTarea);
					TareaTramiteExpediente oTarea = serviceTareaTramiteExpediente.findById(idTarea);
					
					if (oTarea != null) {
						Tramite oTramte = serviceTramite.findById(oTarea.getTramite());
						if (oTramte != null) {
							Expediente oExpediente = serviceExpediente.findById(oTramte.getExpediente());
							if (oExpediente != null) {
								ejercicio = oExpediente.getEjercicio().toString();
								numero = oExpediente.getNumero().toString();
							}
						}
					}
				}
				if (oArchivo.getDesDocum() != null) {
					nombreArchivo = oArchivo.getDesDocum();
				}

				String ruta = dameRutaServidor(2, ejercicio, numero, nombreArchivo);

				if (oArchivo.getArcExpd() != null) {
					byte[] byteLeidos = oArchivo.getArcExpd();
					IOUtils.write(byteLeidos, new FileOutputStream(ruta));
					oArchivo.setDesArchiFlow(ruta);
					archivoService.save(oArchivo);
				}
			} 

			Boolean fusion = null;
			String extension = Utiles.getExtension(oArchivo.getDesDocum());
			if (extension.equals(".docx") || extension.equals(".doc")) {
				fusion = ArchivoValide.fusionDocumentoDOC(oArchivo.getDesArchiFlow(), oEtiquetas);
				if (!fusion) {
					System.err.println("Se ha producido un error en la fusión DOC");
				}
			} else if (extension.equals(".odt") || extension.equals(".sxw")) {
				ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1),
						Long.valueOf((long) 0), "es", Short.valueOf((short) 9307));
				ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
				fusion = ArchivoValide.fusionDocumentoODT(oArchivo.getDesArchiFlow(), oEtiquetas,
						oParametroSistema.getValor());
				if (!fusion) {
					System.err.println("Se ha producido un error en la fusión ODF");
				}
			}

			File file = new File(oArchivo.getDesArchiFlow());
			FileInputStream fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();

		} else {
			throw new NoDataFoundException();
		}
	}

	@GetMapping("/archivo/descargaInfoDocElec/{id}")
	public void descargaInfoDocElec(@PathVariable Long id, HttpServletResponse response) throws Exception {

		Archivo oArchivo = archivoService.findById(id);
		String sRuta = null;
		if (oArchivo != null) {
			String extension = Utiles.getExtension(oArchivo.getDesArchiFlow());
			sRuta = oArchivo.getDesArchiFlow();
			if (extension.equals(".pdf")) {
				sRuta = sRuta.replace(".pdf", ".xml");
			} else if (extension.equals(".doc")) {
				sRuta = sRuta.replace(".doc", ".xml");
			} else if (extension.equals(".docx")) {
				sRuta = sRuta.replace(".docx", ".xml");
			}

			File file = new File(sRuta);
			if (!file.exists()) {
				throw new NoFileException();
			}
			FileInputStream fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();
		} else {
			throw new NoDataFoundException();
		}
	}

	@GetMapping("/archivo/verIndice/{id}")
	public List<IndiceENI> verIndice(@PathVariable Long id, HttpServletResponse response) throws Exception {

		Expediente oExpediente = serviceExpediente.findById(id);
		if (oExpediente.getArchivo() != null) {
			Archivo oArchivo = archivoService.findById(oExpediente.getArchivo());
			List<IndiceENI> aIndiceENI = new ArrayList<>();
			Properties oPropiedades = new Properties(System.getProperties());
			FileInputStream oFicPropi = new FileInputStream(oArchivo.getDesArchi());
			oPropiedades.load(oFicPropi);
			oFicPropi.close();

			String sTotal = oPropiedades.getProperty("Total");
			int number = Integer.parseInt(sTotal);
			for (int i = 0; i < number; i++) {
				IndiceENI oIndiceENI = new IndiceENI();
				String numberAsString = Integer.toString(i + 1);
				String sCodArchi = oPropiedades.getProperty("Archivo" + numberAsString);
				String sHuella = oPropiedades.getProperty("Huella" + numberAsString);
				String sNombre = oPropiedades.getProperty("Nombre" + numberAsString);
				oIndiceENI.setArchivo(sCodArchi);
				oIndiceENI.setHuella(sHuella);
				oIndiceENI.setNombre(sNombre);
				aIndiceENI.add(oIndiceENI);
			}
			return aIndiceENI;
		}
		return null;
	}

	@GetMapping("/archivo/verMetadatos/{codArchi}")
	public MetadatosENI verMetadatos(@PathVariable Long codArchi, HttpServletResponse response) throws Exception {

		Archivo oArchivo = archivoService.findById(codArchi);
		String sRuta = null;
		MetadatosENI oMetadatosENI = new MetadatosENI();

		if (oArchivo != null) {
			String extension = Utiles.getExtension(oArchivo.getDesArchiFlow());
			sRuta = oArchivo.getDesArchiFlow();
			if (extension.equals(".pdf")) {
				sRuta = sRuta.replace(".pdf", ".xml");
			} else if (extension.equals(".doc")) {
				sRuta = sRuta.replace(".doc", ".xml");
			} else if (extension.equals(".docx")) {
				sRuta = sRuta.replace(".docx", ".xml");
			} else {
				throw new FicheroNoSoportadoException();
			}
			try {
				File file = new File(sRuta);
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document document = db.parse(file);
				document.getDocumentElement().normalize();
				System.out.println("Root Element :" + document.getDocumentElement().getNodeName());
				NodeList nList = document.getElementsByTagName("ns2:metadatos");
				for (int temp = 0; temp < nList.getLength(); temp++) {
					Node nNode = nList.item(temp);
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						oMetadatosENI.setVersionNTI(
								eElement.getElementsByTagName("ns2:VersionNTI").item(0).getTextContent());
						oMetadatosENI.setIdentificador(
								eElement.getElementsByTagName("ns2:Identificador").item(0).getTextContent());
						oMetadatosENI.setOrgano(eElement.getElementsByTagName("ns2:Organo").item(0).getTextContent());
						oMetadatosENI.setFecCaptura(
								eElement.getElementsByTagName("ns2:FechaCaptura").item(0).getTextContent());
						String origen = eElement.getElementsByTagName("ns2:OrigenCiudadanoAdministracion").item(0)
								.getTextContent();
						if (origen.equals("false")) {
							oMetadatosENI.setOrigen("0");
						} else {
							oMetadatosENI.setOrigen("1");
						}
						String tipoENI = eElement.getElementsByTagName("ns2:TipoDocumental").item(0).getTextContent();
						switch (tipoENI) {
						case "TD01":
							oMetadatosENI.setTipDocum("TD01 - Resolución");
							break;
						case "TD02":
							oMetadatosENI.setTipDocum("TD02 - Acuerdo");
							break;
						case "TD03":
							oMetadatosENI.setTipDocum("TD03 - Contrato");
							break;
						case "TD04":
							oMetadatosENI.setTipDocum("TD04 - Convenio");
							break;
						case "TD05":
							oMetadatosENI.setTipDocum("TD05 - Declaración");
							break;
						case "TD06":
							oMetadatosENI.setTipDocum("TD06 - Comunicación");
							break;
						case "TD07":
							oMetadatosENI.setTipDocum("TD07 - Notificación");
							break;
						case "TD08":
							oMetadatosENI.setTipDocum("TD08 - Publicación");
							break;
						case "TD09":
							oMetadatosENI.setTipDocum("TD09 - Acuse de recibo");
							break;
						case "TD10":
							oMetadatosENI.setTipDocum("TD10 - Acta");
							break;
						case "TD11":
							oMetadatosENI.setTipDocum("TD11 - Certificado");
							break;
						case "TD12":
							oMetadatosENI.setTipDocum("TD12 - Diligencia");
							break;
						case "TD13":
							oMetadatosENI.setTipDocum("TD13 - Informe");
							break;
						case "TD14":
							oMetadatosENI.setTipDocum("TD14 - Solicitud");
							break;
						case "TD15":
							oMetadatosENI.setTipDocum("TD15 - Denuncia");
							break;
						case "TD16":
							oMetadatosENI.setTipDocum("TD16 - Alegación");
							break;
						case "TD17":
							oMetadatosENI.setTipDocum("TD17 - Recursos");
							break;
						case "TD18":
							oMetadatosENI.setTipDocum("TD18 - Comunicación ciudadano");
							break;
						case "TD19":
							oMetadatosENI.setTipDocum("TD19 - Factura");
							break;
						case "TD20":
							oMetadatosENI.setTipDocum("TD20 - Otros incautados");
							break;
						default:
							oMetadatosENI.setTipDocum("TD99 - Otros");
						}
					}
				}
				NodeList nList2 = document.getElementsByTagName("ns2:EstadoElaboracion");
				for (int temp = 0; temp < nList2.getLength(); temp++) {
					Node nNode = nList2.item(temp);
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						String estado = eElement.getElementsByTagName("ns2:ValorEstadoElaboracion").item(0)
								.getTextContent();
						switch (estado) {
						case "EE01":
							oMetadatosENI.setEstado("EE01 - Original");
							break;
						case "EE02":
							oMetadatosENI.setEstado("EE02 - Copia electrónica auténtica con cambio de formato");
							break;
						case "EE03":
							oMetadatosENI.setEstado("EE03 - Copia electrónica auténtica de documento papel");
							break;
						case "EE04":
							oMetadatosENI.setEstado("EE04 - Copia electrónica parcial auténtica");
							break;
						default:
							oMetadatosENI.setEstado("ED99 - Otros");
						}
					}
				}
				return oMetadatosENI;
			} catch (Exception spe) {
				System.err.println(spe.getMessage());
				throw new ErrorGenerarMetadatosException();
			}
		}
		return null;
	}

	@PostMapping("/archivo/carga")
	@ResponseStatus(HttpStatus.CREATED)
	public Long crear(@RequestBody ArchivoDto archivoDto) {

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 9300));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
		int tipo = 2;
		Archivo oArchivo = ArchivoValide.altaArchivo(archivoDto.getsFichero64(), oParametroSistema.getValor(),
				archivoDto.getEjeExped(), archivoDto.getNumExped(), archivoDto.getsNomFiche(), tipo);
		if (oArchivo == null) {
			throw new ExcepcionArchivoExistente();
		}
		oArchivo.setUsuContr(archivoDto.getUsuContr());
		Archivo oArchivoNew = archivoService.save(oArchivo);

		return oArchivoNew.getCodArchi();
	}

	@GetMapping("/archivo/firmantes/{usuario}/{idTarea}")
	public List<PersonaFirmante> firmantesEF(@PathVariable String usuario, @PathVariable Long idTarea)
			throws Exception {

		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimietno
				.findById(oTareaTramiteExpediente.getTareaProcedimiento());
		if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
			System.err.println("La tarea del procedimiento no tiene proceso firmado");
			throw new ExcepcionSolicitudFirmado();
		}

		ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
		if (oProcesoFirmado == null) {
			System.err.println("No existe proceso firmado");
			throw new ExcepcionSolicitudFirmado();
		}

		if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
			System.err.println("Es firma desatendida");
			throw new ExcepcionSolicitudFirmado();
		}

		List<Firma> aFirma = serviceFirma.findByIdProFirma(oProcesoFirmado.getIdProFirma());

		if (aFirma == null || aFirma.isEmpty()) {
			System.err.println("No existe firma");
			throw new ExcepcionSolicitudFirmado();
		}

		List<PersonaFirmante> aFirmantes = new ArrayList<PersonaFirmante>();

		for (int i = 0; i < aFirma.size(); i++) {
			CargoFirma oCargoFirma = serviceCargoFirma.findById(aFirma.get(i).getIdCargo());
			List<CargoPersona> aCargoPersona = serviceCargoPersona
					.findByIdCargo(Integer.valueOf((oCargoFirma.getCodCargo())));

			if (aCargoPersona == null) {
				System.err.println("No hay cargo persona para el cargo firmante para la firma");
				throw new ExcepcionSolicitudFirmado();
			}

			PersonaFirmante firmanteDefecto = new PersonaFirmante();

			if (aCargoPersona.get(0).getSuplencia().equals(Short.valueOf((short) 0))
					&& aCargoPersona.get(0).getIdHisTitular() != null) {
				PersonaEntidadPK oPersonaEntidadTituPK = new PersonaEntidadPK();
				oPersonaEntidadTituPK.setIdHisPerso(aCargoPersona.get(0).getIdHisTitular());
				oPersonaEntidadTituPK.setIdPerso(aCargoPersona.get(0).getIdTitular());
				PersonaEntidad oPersonaEntidadTitu = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
				firmanteDefecto.setDesPerso(oPersonaEntidadTitu.getDesPerEntid());
				firmanteDefecto.setNumDocum(oPersonaEntidadTitu.getNumDocum());
				firmanteDefecto.setIdHisPerso(aCargoPersona.get(0).getIdHisTitular());
				firmanteDefecto.setIdPerso(aCargoPersona.get(0).getIdTitular());
				if (oCargoFirma != null && oCargoFirma.getCarPlata() != null) {
					firmanteDefecto.setCargo(oCargoFirma.getCarPlata());
				} else {
					firmanteDefecto.setCargo("SIN CARGO DEFINIDO");
				}
			} else if (aCargoPersona.get(0).getSuplencia().equals(Short.valueOf((short) 1))
					&& aCargoPersona.get(0).getIdHisSuple() != null) {
				PersonaEntidadPK oPersonaEntidadSuplePK = new PersonaEntidadPK();
				oPersonaEntidadSuplePK.setIdHisPerso(aCargoPersona.get(0).getIdHisSuple());
				oPersonaEntidadSuplePK.setIdPerso(aCargoPersona.get(0).getIdSuple());
				PersonaEntidad oPersonaEntidadSuple = servicePersonaEntidad.findById(oPersonaEntidadSuplePK);
				firmanteDefecto.setDesPerso(oPersonaEntidadSuple.getDesPerEntid());
				firmanteDefecto.setNumDocum(oPersonaEntidadSuple.getNumDocum());
				firmanteDefecto.setIdHisPerso(aCargoPersona.get(0).getIdHisSuple());
				firmanteDefecto.setIdPerso(aCargoPersona.get(0).getIdSuple());
				if (oCargoFirma != null && oCargoFirma.getCarPlata() != null) {
					firmanteDefecto.setCargo(oCargoFirma.getCarPlata());
				} else {
					firmanteDefecto.setCargo("SIN CARGO DEFINIDO");
				}
			}
			aFirmantes.add(firmanteDefecto);
		}
		return aFirmantes;
	}

	@GetMapping("/archivo/tipoFirma/{idTarea}")
	public String tipoFirma(@PathVariable Long idTarea) throws Exception {

		String tipoFirma = "ATENDIDA";
		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		TareaProcedimiento oTareaProcedimiento = serviceTareaProcedimietno
				.findById(oTareaTramiteExpediente.getTareaProcedimiento());
		if (oTareaProcedimiento.getProcesoFirmadoDefecto() == null) {
			System.err.println("La tarea del procedimiento no tiene proceso firmado");
			throw new ExcepcionSolicitudFirmado();
		}
		ProcesoFirmado oProcesoFirmado = serviceProcesoFirmado.findById(oTareaProcedimiento.getProcesoFirmadoDefecto());
		if (oProcesoFirmado == null) {
			System.err.println("No existe proceso firmado");
			throw new ExcepcionSolicitudFirmado();
		}

		if (!oProcesoFirmado.getTipFirma().equals(Short.valueOf((short) 1))) {
			tipoFirma = "DESATENDIDA";
		}

		return tipoFirma;
	}

	@GetMapping("/archivo/infDocumento/{usuario}/{idTarea}")
	public InformacionDocumento infoDocumento(@PathVariable String usuario, @PathVariable Long idTarea)
			throws Exception {
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}

		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		Archivo oArchivo = archivoService.findById(oTareaTramiteExpediente.getArchivo());

		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		long idDocum = Long.valueOf(Long.valueOf(oArchivo.getHuella()).longValue());

		InformacionDocumento infDocumento = oConectorEF.obtenerInformacionDocumento(idDocum);

		return infDocumento;
	}

	@PostMapping("/archivo/firmaEF/{usuario}/{idTarea}")
	public PeticionFirma envioEFirma(@RequestBody DatosFirmaDto datosFirmaDto, @PathVariable String usuario,
			@PathVariable Long idTarea) throws Exception {
		return archivoApplicationService.envioEFirma(datosFirmaDto, usuario, idTarea);
	}

	@GetMapping("/archivo/obtenerInformeFirma/{usuario}/{idTarea}")
	public void obtenerInformeFirma(@PathVariable String usuario, @PathVariable Long idTarea,
			HttpServletResponse response) throws Exception {

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}

		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		Archivo oArchivo = archivoService.findById(oTareaTramiteExpediente.getArchivo());

		if (oArchivo.getIdPeticion() == null) {
			System.err.println("El archivo no tiene petición de firmado");
			throw new ExcepcionObtenerIdPeticion();
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		File respuesta = oConectorEF.obtenerInformeFirma(oArchivo.getHuella());

		FileInputStream fis = new FileInputStream(respuesta);
		response.setContentType("application/force-download");
		response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
		OutputStream os = response.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		fis.close();

	}

	@GetMapping("/archivo/obtenerFirma/{usuario}/{idTarea}")
	public void obtenerFirma(@PathVariable String usuario, @PathVariable Long idTarea, HttpServletResponse response)
			throws Exception {

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 250));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema == null || oParametroSistema.getValor().equals("")) {
			System.err.println("Falta el parámetro del sistema número 250");
			throw new ExcepcionNoExisteParametroSistema("250");
		}

		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		Archivo oArchivo = archivoService.findById(oTareaTramiteExpediente.getArchivo());

		if (oArchivo.getIdPeticion() == null) {
			System.err.println("El archivo no tiene petición de firmado");
			throw new ExcepcionObtenerIdPeticion();
		}
		ConectorEFirma oConectorEF = new ConectorEFirma(oParametroSistema.getValor());

		File respuesta = oConectorEF.obtenerFirma(oArchivo.getHuella());

		FileInputStream fis = new FileInputStream(respuesta);
		response.setContentType("application/force-download");
		response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
		OutputStream os = response.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		fis.close();

	}

	@GetMapping("/archivo/firma/{codArchi}/{usuario}/{idTarea}")
	public void downloadArchivoFirma(@PathVariable Long codArchi, @PathVariable String usuario,
			@PathVariable Long idTarea, HttpServletResponse response) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("config");
		String ciudad = rb.getString("Ciudad");
		String rutaCertificado = rb.getString("Certificado");
		String sPasswordCertificado = null;
		String urlVerificador = rb.getString("Verificador");
		String nombreFirmante = null;
		String cargoFirmante = null;
		String archivoFirmado = null;

		Archivo oArchivo = archivoService.findById(codArchi);
		Usuario oUsuario = usuarioService.findById(usuario);

		if (oUsuario != null && oUsuario.getIdHisPerso() != null) {
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(oUsuario.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(oUsuario.getIdPerso());
			PersonaEntidad oPersona = personaEntidadService.findById(oPersonaEntidadPK);
			if (oPersona != null) {
				Certificado oCertificado = certficadoService.findByIdHisPersoAndIdPerso(oPersona.getIdHisPerso(),
						oPersona.getIdPerso());
				if (oCertificado == null) {
					throw new NoCertificadoFoundException();
				}
				rutaCertificado = rutaCertificado + File.separator + oPersona.getNumDocum() + ".pfx";
				sPasswordCertificado = Codificador.decrypt(oCertificado.getPassword());
				nombreFirmante = oPersona.getDesPerEntid();

				PersonaCargo oPersonaCargo = personaCargoService.findByIdHisPersoAndIdPerso(oPersona.getIdHisPerso(),
						oPersona.getIdPerso());
				if (oPersonaCargo == null) {
					throw new NoPersonaCargoFoundException();
				}
				cargoFirmante = oPersonaCargo.getDescripcion();

			}
		} else {
			throw new NoDNIUsuarioFoundException();
		}
		TareaTramiteExpediente oTareaTramiteExpediente = serviceTareaTramiteExpediente.findById(idTarea);
		if (oArchivo != null) {
			String ext = Fichero.dameExtension(oArchivo.getDesArchiFlow());
			if (!ext.equals("pdf")) {
				throw new NoFicheroPdfException();
			}
			String sTipoFirma = "2";
			DatosFirma datosFirma = new DatosFirma();
			datosFirma.setAsunto(cargoFirmante);
			datosFirma.setTexto(nombreFirmante);
			try {
				archivoFirmado = FirmaServidor.firmaServidor(datosFirma, rutaCertificado, sPasswordCertificado, ciudad,
						sTipoFirma, urlVerificador, oArchivo.getDesArchiFlow());
			} catch (Exception e) {
				e.printStackTrace();
				if (e.getMessage().equals("El documento ya tiene una firma.")) {
					if (oTareaTramiteExpediente.getFirmado() != null
							&& oTareaTramiteExpediente.getFirmado().equals(Short.valueOf((short) 0))) {
						oTareaTramiteExpediente.setFirmado(Short.valueOf((short) 1));
						serviceTareaTramiteExpediente.save(oTareaTramiteExpediente);
					} else if (oTareaTramiteExpediente.getFirmado() == null) {
						oTareaTramiteExpediente.setFirmado(Short.valueOf((short) 1));
						serviceTareaTramiteExpediente.save(oTareaTramiteExpediente);
					}
					throw new FirmaExistenteException();
				}
			}
			if (archivoFirmado == null) {
				throw new NoFirmafException();
			}
			File file = new File(oArchivo.getDesArchiFlow());

			Path FROM = Paths.get(archivoFirmado);
			Path TO = Paths.get(oArchivo.getDesArchiFlow());
			CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING,
					StandardCopyOption.COPY_ATTRIBUTES };
			Files.copy(FROM, TO, options);

			FileInputStream fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + oArchivo.getDesDocum());
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();

			oTareaTramiteExpediente.setFirmado(Short.valueOf((short) 1));
			serviceTareaTramiteExpediente.save(oTareaTramiteExpediente);
		} else {
			throw new NoDataFoundException();
		}
	}

	private String dameRutaServidor(int tipo, String ejercicio, String numero, String nombreArchivo) {
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 9300));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		String sInstalacion = oParametroSistema.getValor();
		String tipoArchivo;
		String ruta;

		if (tipo == 1) {
			tipoArchivo = "solicitud";
		} else {
			tipoArchivo = "expediente";
		}

		if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\") || sInstalacion.equals("c:\\iflow")
				|| sInstalacion.equals("c:\\iflow\\")) {
			ruta = "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio + "\\" + numero + "\\";
			String rutaV = "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio;
			File odirRutaV = new File(rutaV);
			if (!odirRutaV.exists()) {
				odirRutaV.mkdirs();
			}
		} else if (sInstalacion.equals("C:\\Greenaall\\iflow\\") || sInstalacion.equals("C:\\Greenaall\\iflow")
				|| sInstalacion.equals("c:\\Greenaall\\iflow\\") || sInstalacion.equals("c:\\Greenaall\\iflow")) {
			ruta = "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio + "\\" + numero.toString()
					+ "\\";
			String rutaV = "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio;
			File odirRutaV = new File(rutaV);
			if (!odirRutaV.exists()) {
				odirRutaV.mkdirs();
			}
		} else {
			ruta = "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio + "/" + numero + "/" + tipoArchivo + "/";
			String rutaV = "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio;
			File odirRutaV = new File(rutaV);
			if (!odirRutaV.exists()) {
				odirRutaV.mkdirs();
			}
		}

		File odirRuta = new File(ruta);

		if (!odirRuta.exists()) {
			odirRuta.mkdirs();
		}
		ruta = ruta + nombreArchivo;

		File oArchivoNew = new File(ruta);

		if (!oArchivoNew.exists()) {
			try {
				oArchivoNew.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return ruta;
	}

}
