package com.greenaall.ge.firma;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.greenaall.exception.ExcepcionConexionEFirma;
import com.greenaall.exception.ExcepcionInformeFirma;
import com.greenaall.exception.ExcepcionSolicitudFirmado;
import com.greenaall.ge.dto.Documento;
import com.greenaall.ge.dto.Firmante;
import com.greenaall.ge.dto.Peticion;
import com.greenaall.ge.dto.PeticionFirmaRespuesta;
import com.greenaall.ge.ef.ln.InformacionDocumento;
import com.greenaall.ge.ef.ln.RetornoEntregarPeticion;
import com.greenaall.ge.ef.ln.RetornoInsertarDocumento;
import com.greenaall.ge.ef.ln.RetornoInsertarFirmante;
import com.greenaall.ge.ef.ln.RetornoInsertarPeticion;
import com.greenaall.ge.ef.ln.RetornoObtenerFirmaDocumento;
import com.greenaall.ge.ef.ln.RetornoObtenerInformeFirma;
import com.greenaall.ge.ef.ws.EfServicioWSServiceLocator;
import com.greenaall.ge.ef.ws.EfServicioWSSoapBindingStub;
import com.greenaall.models.ge.dto.ArchivoEx;
import com.greenaall.models.ge.dto.DatosFirma;
import com.greenaall.models.ge.dto.FirmaEx;
import com.greenaall.models.ge.dto.PersonaFirmante;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.PeticionFirma;
import com.greenaall.models.ge.entity.ProcesoFirmado;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.util.Codificador;
import com.greenaall.util.Fichero;
import com.greenaall.util.Utiles;

public class ConectorEFirma {

	/**
	 * Código de Estado de e-Firma: No Enviado
	 */
	public static final Short ESTADO_NO_ENVIADO = PeticionFirma.EFIRMA_ESTADO_NO_ENVIADO;
	/**
	 * Código de Estado de e-Firma: Firmado
	 */
	public static final Short ESTADO_FIRMADO = PeticionFirma.EFIRMA_ESTADO_FIRMADO;
	/**
	 * Código de Estado de e-Firma: Pendiente de Firma
	 */
	public static final Short ESTADO_PENDIENTE = PeticionFirma.EFIRMA_ESTADO_PENDIENTE;
	/**
	 * Código de Estado de e-Firma: Devuelto (rechazado)
	 */
	public static final Short ESTADO_DEVUELTO = PeticionFirma.EFIRMA_ESTADO_DEVUELTO;

	public static final String PREFIJO_HUELLA_INFORME_FIRMA = "infFirma";
	public static final String PREFIJO_HUELLA_ARCHIVO_FIRMA = "firma";

	private String url;
	private EfServicioWSSoapBindingStub eFirmaStub;

	public ConectorEFirma(String url) {
		this.url = url;
	}

	private Usuario oUsuario;
	private Peticion peticion;

	public PeticionFirmaRespuesta firmadoAtendido(DatosFirma datosFirma, FirmaEx[] firmas, ArchivoEx[] archivos,
			Usuario usuario, Peticion peticionUsu, Short codMunicUsu, Set<String> listaEmailsContacto) throws ExcepcionSolicitudFirmado {

		/* Inicializar Cliente de SW de Consulta */
		inicializarClienteEFirma();

		peticion = peticionUsu;
		oUsuario = usuario;
		//rellenarPeticionario(peticion, oUsuario);

		//rellenarDatosFirma(datosFirma, peticion);

		//Set<String> listaEmailsContacto = new LinkedHashSet<String>();

		/* Preparar Firmantes */

		Firmante[] firmantes;
		try {
			firmantes = rellenarFirmantes(firmas, listaEmailsContacto);
		} catch (Exception e) {
			throw new ExcepcionSolicitudFirmado();
		}

		/* Preparar Documentos */
		/**
		 * Con este mapa relacionamos cada Documento enviado con el Archivo del que
		 * procede, para luego actualizar su la huella.
		 */
		Map<Documento, ArchivoEx> mapaDocumentos = new HashMap<Documento, ArchivoEx>(archivos.length + 1, 1);
		Documento[] documentos;
		try {
			documentos = rellenarDocumentos(archivos, firmantes, datosFirma.getTags(), mapaDocumentos);
			peticion.setDocumentos(documentos);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new ExcepcionSolicitudFirmado();
		}

		/* e-mail de notificación */

		if (listaEmailsContacto.size() > 0) {
			peticion.setEmailNotif(getEmailNotif(listaEmailsContacto));
		}

		/* Insertar Petición en e-Firma */
		long idPeticion = insertarPeticion(peticion);

		/* Insertar Documentos y Firmantes en la Petición */
		String huella = insertarDocumentos(idPeticion, documentos, mapaDocumentos, firmantes);

		/* Entregar la petición */
		entregarPeticion(idPeticion);

		/* Guardar estado de los archivos */

		for (Documento documento : documentos) {
			mapaDocumentos.get(documento).setEstado(Archivo.PENDIENTE_FIRMA);
		}

		return rellenarPeticionEnviada(idPeticion, datosFirma, oUsuario.getCodEntid(),
				ProcesoFirmado.TIP_FIRMA_ATENDIDA, ESTADO_PENDIENTE, huella);
	}

	private PeticionFirmaRespuesta rellenarPeticionEnviada(Long idPetPlata, DatosFirma datosFirma, Short codEntid,
			Short tipFirma, Short estadoPeticion, String huella) {
		PeticionFirmaRespuesta peticion = new PeticionFirmaRespuesta();

		peticion.setIdPetPlata(idPetPlata != null ? idPetPlata.toString() : "N/A");

		peticion.setAsunto(datosFirma.getAsunto());
		peticion.setReferencia(datosFirma.getReferencia());
		peticion.setObservaciones(datosFirma.getTexto());

		peticion.setFecPeticion(new Date());
		peticion.setFecInicio(datosFirma.getFecInicio());
		peticion.setFecFin(datosFirma.getFecFin());

		peticion.setEstado(estadoPeticion);
		peticion.setFecEstado(new Date());

		/*
		 * Con esto le decimos al Conector Plataforma que tiene que guardar los
		 * firmantes de la petición
		 */
		peticion.setEstFirmantes(ProcesoFirmado.TIP_FIRMA_ATENDIDA.equals(tipFirma) ? ESTADO_PENDIENTE
				: ESTADO_NO_ENVIADO.equals(estadoPeticion) ? ESTADO_NO_ENVIADO : ESTADO_FIRMADO);

		peticion.setPlataforma(PeticionFirma.PLATAFORMA_EFIRMA);

		peticion.setCodEntid(codEntid);
		peticion.setTipFirma(tipFirma);
		peticion .setReferencia(huella);
		peticion.setPeticionario(oUsuario.getUsuario());

		return peticion;
	}

	private void entregarPeticion(long idPeticion) throws ExcepcionSolicitudFirmado {

		RetornoEntregarPeticion resEntrega;
		try {
			resEntrega = eFirmaStub.entregarPeticion(idPeticion, oUsuario.getDesUsuario());
		} catch (Exception e) {
			System.err.println("Error insertando Petición en e-Firma");
			throw new ExcepcionSolicitudFirmado();
		}

		/* Evaluar el resultado de la entrega */

		if (resEntrega != null && resEntrega.getCodErr() != null) {
			/* La entrega devuelve un error */
			System.err.println("Error entregando la Petición a e-Firma: " + resEntrega.getDesErr());
			throw new ExcepcionSolicitudFirmado();
		}
	}

	private String insertarDocumentos(long idPeticion, Documento[] documentos, Map<Documento, ArchivoEx> mapaDocumentos,
			Firmante[] firmantes) throws ExcepcionSolicitudFirmado {

		String nombreUsuario = oUsuario.getDesUsuario();
		String huella = null;
		/* Recorrer el array de documentos a firmar */

		for (Documento documento : documentos) {
			/* Por cada uno de los documentos realizar la inserción */

			long idDocumento = insertarDocumento(idPeticion, documento, nombreUsuario);
			huella = Long.toString(idDocumento);
			/* Guardar huella del documento */
			mapaDocumentos.get(documento).setHuella(Long.toString(idDocumento));

			/* Recorrer el array de firmantes */

			for (Firmante firmante : firmantes) {

				/* Por cada uno de los firmantes realizar la inserción */

				insertarFirmante(idPeticion, idDocumento, firmante, nombreUsuario);
			}
		}
		return huella;
	}

	private long insertarFirmante(long idPeticion, long idDocumento, Firmante firmante, String nombreUsuario)
			throws ExcepcionSolicitudFirmado {

		RetornoInsertarFirmante resFirmante;

		try {
			resFirmante = eFirmaStub.insertarFirmante(idDocumento, idPeticion, firmante.getNumDocFirm(),
					firmante.getDesFirm(), firmante.getNumDocFirmSust(), firmante.getDesFirmSust(),
					firmante.getCodEntid(), nombreUsuario);
		} catch (Exception e) {
			System.err.println("Error insertando Firmante en la Petición");
			throw new ExcepcionSolicitudFirmado();
		}

		/* Evaluar el resultado de la inserción */

		if (resFirmante == null //
				|| resFirmante.getCodErr() != null //
				|| resFirmante.getIdFirmante() == 0) {
			/* La inserción del firmante devuelve un error */
			System.err.println("Error insertando Firmante en la Petición: " + resFirmante.getDesErr());
			throw new ExcepcionSolicitudFirmado();
		}

		return resFirmante.getIdFirmante();
	}

	private long insertarDocumento(long idPeticion, Documento documento, String nombreUsuario)
			throws ExcepcionSolicitudFirmado {

		RetornoInsertarDocumento resDocumento;

		try {
			resDocumento = eFirmaStub.insertarDocumento(idPeticion, documento.getTags(), documento.getDesDoc(),
					(documento.getEcm() == null ? "" : documento.getEcm()), documento.getDocEnBase64(),
					documento.getTexto(), documento.getMultifirma(), nombreUsuario);
		} catch (Exception e) {
			System.err.println("Error insertando Documento en la Petición " + e.getMessage());
			throw new ExcepcionSolicitudFirmado();
		}

		/* Evaluar el resultado de la inserción */

		if (resDocumento == null //
				|| !Utiles.isCadenaVacia(resDocumento.getCodErr()) //
				|| resDocumento.getIdDocumento() == 0) {
			/* La inserción del documento devuelve un error */
			System.err.println("Error insertando Documento en la Petición: " + resDocumento.getDesErr());
			throw new ExcepcionSolicitudFirmado();
		}

		return resDocumento.getIdDocumento();
	}

	private long insertarPeticion(Peticion peticion) throws ExcepcionSolicitudFirmado {
		/* Realizar la petición de firma */

		RetornoInsertarPeticion resPeticion;
		try {
			resPeticion = eFirmaStub.insertarPeticion((peticion.getTags() != null ? peticion.getTags() : ""),
					peticion.getNumDocRemit(), peticion.getDesRemit(), peticion.getAplicacion(),
					peticion.getEmailNotif(), peticion.getAsunto(), peticion.getTexto(), peticion.getPrioridad(),
					peticion.getFecIniFirma(), peticion.getFecFinFirma(), oUsuario.getDesUsuario(), peticion.getSalida());
		} catch (Exception e) {
			System.err.println("Error insertando Petición en e-Firma");
			throw new ExcepcionSolicitudFirmado();
		}

		/* Evaluar el resultado de la petición */

		if (resPeticion == null //
				|| !Utiles.isCadenaVacia(resPeticion.getCodErr()) //
				|| resPeticion.getIdPeticion() == 0) {
			/* La petición devuelve un error */
			System.err.println("Error insertando Petición en e-Firma:" + resPeticion.getDesErr());
			throw new ExcepcionSolicitudFirmado();
		}

		return resPeticion.getIdPeticion();
	}

	private void inicializarClienteEFirma() throws ExcepcionSolicitudFirmado {

		try {
			EfServicioWSServiceLocator eFirmaWSsl = new EfServicioWSServiceLocator();
			eFirmaWSsl.setEfServicioWSEndpointAddress(url);

			eFirmaStub = (EfServicioWSSoapBindingStub) eFirmaWSsl.getEfServicioWS();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new ExcepcionConexionEFirma();
		}
	}

	private String getEmailNotif(Set<String> listaEmailsContacto) {
		StringBuilder sb = new StringBuilder();

		Iterator<String> itListaEmails = listaEmailsContacto.iterator();

		sb.append(itListaEmails.next());

		while (itListaEmails.hasNext()) {
			sb.append(';').append(itListaEmails.next());
		}

		return sb.toString();
	}

	/*private void rellenarDatosFirma(DatosFirma datosFirma, Peticion peticion) {

		peticion.setTags(getTags(datosFirma.getTags()));

		peticion.setAplicacion("gos");

		peticion.setAsunto(getAsunto(datosFirma.getAsunto(), datosFirma.getReferencia()));
		peticion.setTexto(datosFirma.getTexto());
		peticion.setPrioridad(datosFirma.getPrioridad());

		if (datosFirma.getFecInicio() != null) {
			Calendar fecIni = Calendar.getInstance();
			fecIni.setTime(datosFirma.getFecInicio());
			peticion.setFecIniFirma(fecIni);
		}

		if (datosFirma.getFecFin() != null) {
			Calendar fecFin = Calendar.getInstance();
			fecFin.setTime(datosFirma.getFecFin());
			peticion.setFecFinFirma(fecFin);
		}
	}*/

	/*private void rellenarPeticionario(Peticion peticion, Usuario usuario) throws ExcepcionSolicitudFirmado {

		try {
			PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
			oPersonaEntidadPK.setIdHisPerso(usuario.getIdHisPerso());
			oPersonaEntidadPK.setIdPerso(usuario.getIdPerso());
			PersonaEntidad persona = servicePersonaEntidad.findById(oPersonaEntidadPK);

			if (persona == null || persona.getNumDocum() == null) {
				throw new ExcepcionSolicitudFirmado();
			}

			peticion.setNumDocRemit(persona.getNumDocum());
			peticion.setDesRemit(persona.getDesPerEntid());
		} catch (Exception e) {
			throw new ExcepcionSolicitudFirmado();
		}
	}*/

	private String getTags(String tags, Short codMunicUusar) {
		StringBuilder datosConexion = new StringBuilder();

		datosConexion.append("entidad=");
		if (oUsuario.getCodEntid() != null) {
			datosConexion.append((oUsuario.getCodEntid().toString()));
		}

		datosConexion.append("&municipio=");
		if (codMunicUusar != null) {
			datosConexion.append((codMunicUusar));
		}

		datosConexion.append("&usuario=").append(oUsuario.getUsuario()).append("&pwd=").append(oUsuario.getPassword());

		return tags != "" ? tags + "&" + datosConexion.toString() : datosConexion.toString();
	}

	private String getAsunto(String asunto, String referencia) {
		return asunto == "" ? referencia : referencia == "" ? asunto : asunto + " (ref: " + referencia + ")";
	}

	private Firmante[] rellenarFirmantes(FirmaEx[] firmas, Set<String> listaEmailsContacto) {

		List<Firmante> listaFirmantes = new ArrayList<Firmante>(firmas.length);

		/* Recorrer el array de firmantes */

		for (FirmaEx firma : firmas) {
			PersonaFirmante personaFirmante = firma.getCargo().getFirmanteDefecto();

			Firmante firmante = new Firmante();

			firmante.setNumDocFirm(personaFirmante.getNumDocum());
			firmante.setDesFirm(personaFirmante.getDesPerso());

			/* Buscar los datos de notificación */

		//	PersonaContacto emailsContacto = servicePersonaContacto.findByIdHisPersoAndIdPerso(personaFirmante.getIdHisPerso(), personaFirmante.getIdPerso());

			/* Comprobar si existen datos de correo */

	/*		if (emailsContacto != null) {
				if (Short.valueOf((short) 1).equals(emailsContacto.getRecNotif())
						&& emailsContacto.getDatConta() != null) {
					listaEmailsContacto.add(emailsContacto.getDatConta().trim().toLowerCase());
				}
			}*/

			if (oUsuario.getCodEntid() != null) {
				firmante.setCodEntid(oUsuario.getCodEntid());
			}

			listaFirmantes.add(firmante);
		}

		return listaFirmantes.toArray(new Firmante[firmas.length]);
	}

	private Documento[] rellenarDocumentos(ArchivoEx[] archivos, Firmante[] firmantes, String tags,
			Map<Documento, ArchivoEx> mapaDocumentos) {
		List<Documento> listaDocumentos = new ArrayList<Documento>(archivos.length);

		/* Recorrer el array de archivos a firmar */

		for (ArchivoEx archivo : archivos) {

			Documento documento = new Documento();

			if (archivo.getEstado() != null && !archivo.getEstado().equals(Archivo.EMITIDO)) {
				/* Estado del documento no válido para el envío a e-Firma */

				throw new ExcepcionSolicitudFirmado();
			}

			/* Recuperar los datos del documento */
			String contenidoB64;
			try {
				contenidoB64 = Codificador.codificarB64(archivo.getFicheroReferido());
				if (contenidoB64 == null) {
					throw new ExcepcionSolicitudFirmado();
				}

				documento.setDocEnBase64(contenidoB64);

				/* Extraer el nombre del documento */

				documento.setDesDoc(archivo.getFicheroReferido().getName());

				documento.setTags("codArchi=" + archivo.getCodArchi() + (tags != null ? "&" + tags : ""));

				/* Buscar los datos de la plantilla del archivo */

				if (archivo.getPlantilla() == null) {
					/* No se existe plantilla asociada */

					throw new ExcepcionSolicitudFirmado();
				}

				documento.setTexto(archivo.getDesDocum());

				if (firmantes.length > 1) {
					documento.setMultifirma((byte) 2);
				} else {
					documento.setMultifirma((byte) 0);
				}

				documento.setFirmantes(firmantes);

				listaDocumentos.add(documento);
				mapaDocumentos.put(documento, archivo);
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return listaDocumentos.toArray(new Documento[archivos.length]);
	}
	
	public File obtenerInformeFirma(String documentID) throws ExcepcionInformeFirma {
		
		inicializarClienteEFirma();
		RetornoObtenerInformeFirma respuesta;
		try {
			respuesta = eFirmaStub.getInformeFirma(Long.valueOf(documentID).longValue(), "es");
			if (respuesta == null || respuesta.getInformeB64() == null || respuesta.getCodErr() != null) {
				throw new ExcepcionInformeFirma();
			}			
			File fichero;
			try {
				fichero = Fichero.dameFicheroTemporal(".pdf");
				Codificador.decodificarB64(respuesta.getInformeB64(), fichero);
				return fichero;	
			} catch (IOException e) {
				e.printStackTrace();
				throw new ExcepcionInformeFirma();
			}		
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
			throw new ExcepcionInformeFirma();
		} catch (RemoteException e1) {
			e1.printStackTrace();
			throw new ExcepcionInformeFirma();
		}
	}
	
	public File obtenerFirma(String documentID) throws ExcepcionInformeFirma {
		
		if (documentID == null || documentID.length() <= 0) {
			return null;
		}
		inicializarClienteEFirma();
		try {
			RetornoObtenerFirmaDocumento respuesta = eFirmaStub.getFirmaDocumento(Long.valueOf(documentID).longValue());
			if (respuesta == null || respuesta.getFirmaB64() == null
					|| respuesta.getCodErr() != null) {
				throw new ExcepcionInformeFirma();
			}
			File fichero;
			try {
				fichero = Fichero.dameFicheroTemporal(".p7s");
				Codificador.decodificarB64(respuesta.getFirmaB64(), fichero);
				return fichero;
			} catch (IOException e) {
				e.printStackTrace();
				throw new ExcepcionInformeFirma();
			}			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw new ExcepcionInformeFirma();
		} catch (RemoteException e) {
			e.printStackTrace();
			throw new ExcepcionInformeFirma();
		}
	}
	
	public InformacionDocumento obtenerInformacionDocumento(long idDocum)	throws Exception {
		inicializarClienteEFirma();
		InformacionDocumento infDocumento;
		try {
			infDocumento = eFirmaStub.getInfoDocumento(idDocum);
		} catch (Exception e) {
			return null;
			//throw new ExcepcionInfDocumentacionEFirma();
		}

		return infDocumento;
	}
}
