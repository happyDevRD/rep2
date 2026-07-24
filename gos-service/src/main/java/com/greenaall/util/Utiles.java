package com.greenaall.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.pe.entity.PersonaEntidad;

import es.gob.aapp.libreriaENI.model.documento.ObjetoDocumentoENI;
import es.gob.aapp.libreriaENI.model.documento.contenido.ObjetoDocumentoContenido;
import es.gob.aapp.libreriaENI.model.documento.firma.ContenidoFirmaCSV;
import es.gob.aapp.libreriaENI.model.documento.firma.FirmaENI;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatos;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoDocumentoMetadatosEstadoElaboracion;
import es.gob.aapp.libreriaENI.model.documento.metadatos.ObjetoMetadatoAdicional;
import es.gob.aapp.libreriaENI.model.expediente.ObjetoExpedienteENI;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndice;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndiceContenido;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndiceContenidoDocumentoIndizado;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndiceContenidoElementoIndizado;
import es.gob.aapp.libreriaENI.model.expediente.indice.ObjetoExpedienteIndiceContenido.TipoAsociacion;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatos;
import es.gob.aapp.libreriaENI.model.expediente.metadatos.ObjetoExpedienteMetadatosEnumeracionEstados;
import es.gob.aapp.libreriaENI.model.expediente.version.ObjetoExpedienteVersion;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoENI;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoEstadoElaboracion;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoDocumental;
import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoFirma;
import es.gob.aapp.libreriaENI.util.EnumeracionExpedienteENI;
import es.gob.aapp.model.eni.v2.expediente.indice.contenido.TipoDocumentoIndizado;
import es.gob.aapp.model.eni.v2.expediente.indice.contenido.TipoIndiceContenido;

public class Utiles {

	private static final String REG_EX_SEPARADOR = "\\s+";
	private static final String[] EXCLUIR_INICIAL = { "del", "de", "la", "los", "el", "y" };
	public static Collator oCollator = null;

	static {
		oCollator = Collator.getInstance(Locale.getDefault());
		oCollator.setStrength(Collator.PRIMARY);
	}

	public static int compara(Object[] paoObjeto1, Object[] paoObjeto2) {
		if (paoObjeto1 == null && paoObjeto2 == null) {
			return 0;
		}

		if (paoObjeto1 != null && paoObjeto2 == null) {
			return +1;
		}

		if (paoObjeto1 == null && paoObjeto2 != null) {
			return -1;
		}

		for (int i = 0; i < paoObjeto1.length && i < paoObjeto2.length; i++) {
			if (!igual(paoObjeto1[i], paoObjeto2[i])) {
				return compara(paoObjeto1[i], paoObjeto2[i]);
			}
		}

		return 0;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int compara(Object poObjeto1, Object poObjeto2) {
		if (poObjeto1 == null && poObjeto2 == null) {
			return 0;
		}

		if (poObjeto1 != null && poObjeto2 == null) {
			return +1;
		}

		if (poObjeto1 == null && poObjeto2 != null) {
			return -1;
		}

		if (poObjeto1 instanceof String && poObjeto2 instanceof String) {
			return oCollator.compare(poObjeto1, poObjeto2);
		}

		if (poObjeto1 instanceof Object[] && poObjeto2 instanceof Object[]) {
			return compara((Object[]) poObjeto1, (Object[]) poObjeto2);
		}

		if (poObjeto1 instanceof Comparable && poObjeto2 instanceof Comparable
				&& (poObjeto1.getClass().isInstance(poObjeto2) || poObjeto2.getClass().isInstance(poObjeto1))) {
			return ((Comparable) poObjeto1).compareTo((Comparable) poObjeto2);
		}

		if (poObjeto1 instanceof Number && poObjeto2 instanceof String && ((Number) poObjeto1).intValue() == 0
				&& poObjeto2.toString().trim().length() == 0
				|| poObjeto2 instanceof Number && poObjeto1 instanceof String && ((Number) poObjeto2).intValue() == 0
						&& poObjeto1.toString().trim().length() == 0) {
			return 0;
		}

		return compara(ListaDto(poObjeto1, poObjeto2.getClass()), ListaDto(poObjeto2, poObjeto1.getClass()));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object[] ListaDto(Object poObjeto, Class poClase) {
		ArrayList aLista = new ArrayList();
		Method[] aMetodos = poClase.getMethods();

		for (int i = 0; i < aMetodos.length; i++) {
			if (aMetodos[i].getName().indexOf("get") == 0 && aMetodos[i].getParameterTypes().length == 0
					&& aMetodos[i].getReturnType() != null && Modifier.isPublic(aMetodos[i].getModifiers())
					&& !Modifier.isStatic(aMetodos[i].getModifiers())) {
				try {
					Object oObjeto = poObjeto.getClass().getMethod(aMetodos[i].getName(), new Class[] {})
							.invoke(poObjeto, new Object[] {});
					aLista.add(oObjeto);
				} catch (SecurityException ex) {
				} catch (NoSuchMethodException ex) {
				} catch (InvocationTargetException ex) {
				} catch (IllegalArgumentException ex) {
				} catch (IllegalAccessException ex) {
				}
			}
		}

		Object[] oLista;
		aLista.toArray(oLista = new Object[aLista.size()]);
		return oLista;
	}

	public static boolean igual(Object poObjeto1, Object poObjeto2) {
		if ((poObjeto1 == null && poObjeto2 != null) || (poObjeto1 != null && poObjeto2 == null)) {
			return false;
		} else if (poObjeto1 != null && poObjeto2 != null && !poObjeto1.equals(poObjeto2)) {
			if (poObjeto1 instanceof String && poObjeto2 instanceof String) {
				return oCollator.compare(poObjeto1, poObjeto2) == 0;
			}

			return compara(poObjeto1, poObjeto2) == 0;
		}

		return true;
	}

	public static void parseBase64toFile(String pahtFile, String base64) throws Exception {

		File fileCopy = new File(pahtFile);
		FileOutputStream fos = new FileOutputStream(fileCopy);
		{
			byte[] contenido = Base64.getDecoder().decode(base64);
			fos.write(contenido);
			fos.close();
		}
	}

	public static boolean isArrayNoVacio(Object[] paoArray) {
		return (paoArray != null && paoArray.length > 0);
	}

	public static String ifNull(String psCadena, String psDefecto) {
		if (psCadena == null) {
			return ifNull(psDefecto);
		} else {
			return psCadena;
		}
	}

	public static String ifNull(String psCadena) {
		if (psCadena == null) {
			return "";
		} else {
			return psCadena;
		}
	}

	public static String normalizaSepa(String psCadena) {

		// Indicamos los signos de puntuación que no son válidos para SEPA

		String[] sigPunNoValidos = new String[] { "!", "\"", "#", "\\$", "%", "&", "\\*", ";", "<", "=", ">", "@",
				"\\[", "\\\\", "\\]", "\\^", "_", "`", "\\{", "\\|", "\\}", "~" };

		if (psCadena != null) {

			// Normalizamos la cadena para eliminar acentos

			psCadena = Formateador.normaliza(psCadena);

			// Sustituimos los signos de puntuación no válidos por espacios

			for (int i = 0; i < sigPunNoValidos.length; i++) {
				psCadena = psCadena.replaceAll(sigPunNoValidos[i], " ");
			}

			// Sustituimos ñ y ç

			psCadena = psCadena.replaceAll("ñ", "n");
			psCadena = psCadena.replaceAll("Ñ", "N");
			psCadena = psCadena.replaceAll("ç", "c");
			psCadena = psCadena.replaceAll("Ç", "C");
		}

		return psCadena;
	}

	@SuppressWarnings("unchecked")
	public static ObjetoExpedienteENI generaExpedienteENI(InputStream contenido, String nombreFormato,
			String identificador, String estadoElaboracion, String organo) {

		ObjetoExpedienteENI objetoExpedienteENI = new ObjetoExpedienteENI();
		ObjetoExpedienteIndice objetoExpedienteIndice = new ObjetoExpedienteIndice();
		ObjetoExpedienteIndiceContenido indiceContenido = new ObjetoExpedienteIndiceContenido();
		ObjetoExpedienteMetadatos metadatos = new ObjetoExpedienteMetadatos();
		ObjetoExpedienteVersion version = new ObjetoExpedienteVersion(1, new GregorianCalendar());
		List<FirmaENI> firmas = new ArrayList<>();
		List<ObjetoExpedienteIndiceContenidoElementoIndizado> elementoIndizado = new ArrayList<>();
		;

		indiceContenido.setFechaIndiceElectronico(new GregorianCalendar());
		indiceContenido.setTipoAsociacion(TipoAsociacion.VINCULACION);

		TipoIndiceContenido oTipoIndiceContenido = new TipoIndiceContenido();
		GregorianCalendar ahora = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
		XMLGregorianCalendar fecha;
		try {
			fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(ahora);
			oTipoIndiceContenido.setFechaIndiceElectronico(fecha);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		oTipoIndiceContenido.setId("Inicio");
		TipoDocumentoIndizado oTipoDocumentoIndizado = new TipoDocumentoIndizado();
		elementoIndizado
				.addAll((Collection<? extends ObjetoExpedienteIndiceContenidoElementoIndizado>) oTipoDocumentoIndizado);

		indiceContenido.setElementosIndizados(elementoIndizado);

		objetoExpedienteIndice.setIndiceContenido(indiceContenido);
		objetoExpedienteIndice.setFirmas(firmas);

		objetoExpedienteENI.setIndice(objetoExpedienteIndice);
		objetoExpedienteENI.setMetadatos(metadatos);
		objetoExpedienteENI.setVersion(version);

		return objetoExpedienteENI;

	}

	public static ObjetoDocumentoENI generaDocumentoENI(InputStream contenido, String nombreFormato,
			String identificador, String estadoElaboracion, String organo) {

		ObjetoDocumentoENI objetoDocumentoENI = new ObjetoDocumentoENI();

		// Cargamos el contenido
		ObjetoDocumentoContenido contenidoDocumento = new ObjetoDocumentoContenido();
		contenidoDocumento.setContenido(contenido);
		contenidoDocumento.setNombreFormato(nombreFormato);
		// Añadimos el contenido al objeto del ENI
		objetoDocumentoENI.setContenidoDocumento(contenidoDocumento);

		// Cargamos los metadatos
		ObjetoDocumentoMetadatos metadatos = new ObjetoDocumentoMetadatos();
		metadatos.setIdentificadorDocumento(identificador);
		metadatos.setVersionNTI(EnumeracionDocumentoENI.ENI_V1.value());
		metadatos.setFechaCaptura(new GregorianCalendar());

		List<String> organos = new ArrayList<>();
		organos.add(organo);
		metadatos.setOrgano(organos);

		metadatos.setOrigenCiudadanoAdministracion(false);

		// Para el estadoElaboracion
		ObjetoDocumentoMetadatosEstadoElaboracion oEstadoElaboracion = new ObjetoDocumentoMetadatosEstadoElaboracion();
		oEstadoElaboracion
				.setValorEstadoElaboracion(EnumeracionDocumentoEstadoElaboracion.fromValue(estadoElaboracion));
		metadatos.setEstadoElaboracion(oEstadoElaboracion);

		// Para el tipoDocumental
		metadatos.setTipoDocumental(EnumeracionDocumentoTipoDocumental.TD_01);

		// Se añaden los metadatos al documento ENI
		objetoDocumentoENI.setMetadatos(metadatos);
		return objetoDocumentoENI;
	}

	public static ObjetoExpedienteENI generaExpedienteENI(List<Archivo> aArchivoTarea, InputStream visualizacion,
			String identificador, String firmaCsv, String organo, Date fecIniExped, List<String> interesados,
			String serie) throws IOException {

		ObjetoExpedienteENI objetoExpedienteENI = new ObjetoExpedienteENI();

		// Cargamos el indice
		ObjetoExpedienteIndice objetoExpedienteIndice = new ObjetoExpedienteIndice();

		ObjetoExpedienteIndiceContenido objetoExpedienteIndiceContenido = new ObjetoExpedienteIndiceContenido();
		objetoExpedienteIndiceContenido.setFechaIndiceElectronico(new GregorianCalendar());

		// Elementos asociados
		for (int i = 0; i < aArchivoTarea.size(); i++) {
			ObjetoExpedienteIndiceContenidoDocumentoIndizado oeicd = new ObjetoExpedienteIndiceContenidoDocumentoIndizado();
			oeicd.setIdentificadorDocumento(aArchivoTarea.get(i).getDesDocum());
			oeicd.setValorHuella(aArchivoTarea.get(i).getHuella());
			oeicd.setFuncionResumen("CSV");
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(aArchivoTarea.get(i).getFecGenera());
			oeicd.setFechaIncorporacionExpediente(cal);
			oeicd.setOrdenDocumentoExpediente(i + 1);
			oeicd.setOrden(1);
			oeicd.setNombreNatural(aArchivoTarea.get(i).getDesDocum());
			objetoExpedienteIndiceContenido.getElementosIndizados().add(oeicd);
		}
		objetoExpedienteIndice.setIndiceContenido(objetoExpedienteIndiceContenido);

		// Cargamos la firma con el índice
		ContenidoFirmaCSV contendioFirmaEni = new ContenidoFirmaCSV();

		contendioFirmaEni.setValorCSV(firmaCsv);
		contendioFirmaEni.setRegulacionGeneracionCSV("BOE-A-2015-10566");
		FirmaENI firmaENI = new FirmaENI();
		firmaENI.setEnumeracionDocumentoTipoFirma(EnumeracionDocumentoTipoFirma.TF_01);
		firmaENI.setCsv(firmaCsv);
		firmaENI.setRegulacionCsv("BOE-A-2015-10566");
		firmaENI.setContenidoFirmaDocument(contendioFirmaEni);

		// byte[] bytes = IOUtils.toByteArray(contenidoFirma);
		// String nodofirma = IOUtils.toString(contenidoFirma, StandardCharsets.UTF_8);
		// byte[] firmaBase64 = nodofirma.getBytes();

		// Se añade como firma con certificado de base64
		// ContenidoFirmaCertificadoContenidoBinario firmaConCertificado = new
		// ContenidoFirmaCertificadoContenidoBinario();
		// firmaConCertificado.setValorBinario(firmaBase64);
		// firmaConCertificado.setMime("application/xml");
		// firmaEni.setContenidoFirmaDocument(firmaConCertificado);

		objetoExpedienteIndice.getFirmas().add(firmaENI);
		objetoExpedienteENI.setIndice(objetoExpedienteIndice);

		// Cargamos los metadatos
		ObjetoExpedienteMetadatos metadatos = new ObjetoExpedienteMetadatos();
		metadatos.setIdentificadorExpediente(identificador);
		metadatos.setVersionNTI(EnumeracionExpedienteENI.ENI_V1.value());
		metadatos.setClasificacion(serie);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(fecIniExped);
		metadatos.setFechaAperturaExpediente(cal);

		List<String> organos = new ArrayList<>();
		organos.add(organo);
		metadatos.setOrgano(organos);
		metadatos.setEstado(ObjetoExpedienteMetadatosEnumeracionEstados.E_02);
		metadatos.setInteresado(interesados);

		// Metadatos adicionales
		List<ObjetoMetadatoAdicional> aObjetoMetadatosAdicional = new ArrayList<>();
		ObjetoMetadatoAdicional oObjetoMetadatoAdicional = new ObjetoMetadatoAdicional();
		oObjetoMetadatoAdicional.setNombre("Metadato");
		oObjetoMetadatoAdicional.setTipo("tipo");
		oObjetoMetadatoAdicional.setValor("valor");
		aObjetoMetadatosAdicional.add(oObjetoMetadatoAdicional);
		metadatos.setMetadatosAdicionales(aObjetoMetadatosAdicional);

		// Se añaden los metadatos al documento ENI
		objetoExpedienteENI.setMetadatos(metadatos);

		// Visualizacion del índice
		ObjetoDocumentoContenido objetoDocumentoContenido = new ObjetoDocumentoContenido();
		objetoDocumentoContenido.setContenido(visualizacion);
		objetoDocumentoContenido.setNombreFormato("PROPERTIES");
		objetoExpedienteENI.setVisualizacionIndice(objetoDocumentoContenido);

		return objetoExpedienteENI;
	}

	public static void generaSIP(String ruta, String identificador) {
		try {
			File oArchivo = new File(ruta);
			String oRuta = oArchivo.getParent() + File.separator + identificador + ".zip";
			ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File(oRuta))));
			File oDirectorio = new File(oArchivo.getParent());
			File[] archivos = oDirectorio.listFiles();
			byte[] buffer = new byte[1024];
			for (File archivo : archivos) {
				String extension = getExtension(archivo.getName());
				if (extension.equals(".xml")) {
					ZipEntry ze2 = new ZipEntry(archivo.getName());
					zos.putNextEntry(ze2);
					FileInputStream in = new FileInputStream(archivo.getAbsolutePath());
					int len;
					while ((len = in.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
					in.close();
				}
			}
			zos.closeEntry();
			zos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getNombreFicheroSinExtension(String psRutaCompleta) {
		String sNomFiche = "";

		if (psRutaCompleta != null && !"".equals(psRutaCompleta)) {

			int iPosBarra = psRutaCompleta.lastIndexOf(GestionPropiedades.getValorPropiedad("file.separator", "\\"));

			if (iPosBarra == -1) {
				iPosBarra = psRutaCompleta.lastIndexOf("\\");
			}

			if (iPosBarra == -1) {
				iPosBarra = psRutaCompleta.lastIndexOf("/");
			}

			int iPosPunto = psRutaCompleta.lastIndexOf(".");
			int iPosFinal = psRutaCompleta.length();

			if (iPosPunto != -1 && iPosPunto > iPosBarra) {
				iPosFinal = iPosPunto;
			}

			sNomFiche = psRutaCompleta.substring(iPosBarra + 1, iPosFinal);
		}

		return sNomFiche;

	}

	public static synchronized String getCve(UUID uuid) throws Exception {

		String sContenido = new String(java.util.Base64.getEncoder().encodeToString(asByteArray(uuid)));

		sContenido = sContenido.split("=")[0]; // quitamos los = del fin de la cadena

		return sContenido;

	}

	private static byte[] asByteArray(UUID uuid) {

		long msb = uuid.getMostSignificantBits();
		long lsb = uuid.getLeastSignificantBits();
		byte[] buffer = new byte[16];

		for (int i = 0; i < 8; i++) {
			buffer[i] = (byte) (msb >>> 8 * (7 - i));
		}
		for (int i = 8; i < 16; i++) {
			buffer[i] = (byte) (lsb >>> 8 * (7 - i));
		}

		return buffer;

	}

	public static String getExtension(String pRuta) {

		String sExtension = null;
		String CADENA_VACIA = "";
		String PUNTO = ".";
		if (pRuta != null && !pRuta.equals(CADENA_VACIA)) {

			int iIndex = pRuta.lastIndexOf(PUNTO);
			if (iIndex >= 0) {
				sExtension = pRuta.substring(iIndex);
			}
		}

		if (sExtension == null) {
			sExtension = CADENA_VACIA;
		}

		return sExtension;

	}

	public static Properties cargarPropiedades(String nombreArchivo) {
		Properties prop = new Properties();
		boolean existeArchivo = new File("." + nombreArchivo).exists();

		try {
			InputStream in = null;
			if (existeArchivo) {
				in = new FileInputStream(nombreArchivo);
			}
			prop.load(in);
			in.close();
		} catch (Throwable ex) {
			System.err.println("No se han podido cargar las propiedades. " + ex.getMessage());
			return null;
		}
		return prop;
	}

	public static boolean EMail(String sDestino, String sAsunto, String sCuerpo, String sPuerto, String sServidor,
			String sRemitente, String sUsuario, String sPass, String sTarttls, String sAuth, String sSocket) {

		try {
			Session session;
			boolean bStartTls = false;
			boolean bAuth = true;
			Properties props = System.getProperties();
			int iPuerto = Integer.valueOf(sPuerto);

			if (sTarttls != null && sTarttls.equals("1")) {
				bStartTls = true;
			}

			if (sAuth != null && sAuth.equals("0")) {
				bAuth = false;
			}

			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.port", iPuerto);
			if (sSocket != null && sSocket.equals("SI")) {
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			}
			props.put("mail.smtp.starttls.enable", bStartTls);
			props.put("mail.smtp.auth", bAuth);
			props.put("mail.smtp.ssl.protocols", "TLSv1.2");
			// props.put("mail.smtp.ssl.trust", "*");

			session = Session.getDefaultInstance(props);
			final Message msg = new MimeMessage(session);

			Transport tr = session.getTransport("smtp");
			tr.connect(sServidor, sUsuario, sPass);
			msg.setFrom(new InternetAddress(sRemitente));
			msg.setSubject(sAsunto);
			msg.setSentDate(new Date());
			msg.setText(sCuerpo);
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(sDestino));
			msg.saveChanges();
			tr.sendMessage(msg, msg.getAllRecipients());
			tr.close();
			System.out.println("Correo enviado!: " + sDestino);
			return true;
		} catch (MessagingException e) {
			System.err.println("Error al enviar el correo: " + e.getMessage());
			return false;
		}
	}

	public static boolean isCadenaVacia(String cadena) {
		return isCadenaVacia(cadena, true);
	}

	public static boolean isCadenaVacia(String cadena, boolean trim) {
		return cadena == null || (trim ? cadena.trim().length() : cadena.length()) == 0;
	}

	public static String extraerIniciales(PersonaEntidad persona)
			throws NullPointerException, ArrayIndexOutOfBoundsException {
		StringBuilder sb = new StringBuilder();

		sb.append(persona.getNombre()).append(" ").append(persona.getApellido1());

		if (!isCadenaVacia(persona.getApellido2())) {
			sb.append(" ").append(persona.getApellido2());
		}

		return extraerIniciales(sb.toString());
	}

	private static boolean tieneInicialIncluible(String cadena) {
		for (String excluido : EXCLUIR_INICIAL) {
			if (excluido.equalsIgnoreCase(cadena)) {
				return false;
			}
		}

		return true;
	}

	private static String extraerIniciales(String descripcionPersona) {
		if (isCadenaVacia(descripcionPersona)) {
			return null;
		}

		StringBuilder sb = new StringBuilder();

		int posComa = descripcionPersona.indexOf(",");
		if (posComa != -1) {

			String descNombre = descripcionPersona.substring(posComa + 1);

			for (String nombre : descNombre.split(REG_EX_SEPARADOR)) {
				if (!nombre.isEmpty() && tieneInicialIncluible(nombre)) {
					sb.append(getInicial(nombre));
				}
			}

			String descApellido = descripcionPersona.substring(0, posComa);

			for (String apellido : descApellido.split(REG_EX_SEPARADOR)) {
				if (!apellido.isEmpty() && tieneInicialIncluible(apellido)) {
					sb.append(getInicial(apellido));
				}
			}
		} else {
			for (String componente : descripcionPersona.split(REG_EX_SEPARADOR)) {
				if (!componente.isEmpty() && tieneInicialIncluible(componente)) {
					sb.append(getInicial(componente));
				}
			}
		}

		return sb.toString();

	}

	private static String getInicial(String cadena) throws NullPointerException, ArrayIndexOutOfBoundsException {
		return cadena.trim().substring(0, 1).toUpperCase();
	}

	public static String digitoEmisora(String psMunicipio) {
		int iAcumulado = 0;

		for (int i = 0; psMunicipio != null && i < psMunicipio.length(); i++) {
			iAcumulado += Integer.parseInt(psMunicipio.substring(i, i + 1)) * (6 - i);
		}

		if (iAcumulado % 11 == 10) {
			return "0";
		} else {
			return Integer.valueOf(iAcumulado % 11).toString();
		}
	}

	public static String CtrReferenciaRecibo60(String psNumSocEmisora, String psNumReferencia,
			String psNumIdentificacion, BigDecimal pmImporte) {
		BigInteger mSuma = new BigInteger(psNumSocEmisora).multiply(new BigInteger("76"))
				.add(new BigInteger(psNumReferencia).multiply(new BigInteger("9")))
				.add(new BigInteger(psNumIdentificacion)
						.add(pmImporte.movePointRight(2).setScale(0, RoundingMode.HALF_UP).toBigInteger())
						.subtract(new BigInteger("1")).multiply(new BigInteger("55")))
				.mod(new BigInteger("97"));

		if (mSuma.compareTo(new BigInteger("0")) == 0) {
			return "99";
		} else {
			int resultado = BigInteger.valueOf(99)
					.subtract(new BigDecimal(mSuma).divide(new BigDecimal("97"), 2, RoundingMode.FLOOR)
							.movePointRight(2).setScale(0, RoundingMode.HALF_UP).toBigInteger())
					.intValue();
			return Formateador.numero(Integer.valueOf(resultado), true, 2);
		}
	}

	public static String ctrNum38(String psCadena) {
		String sCarContr = "";
		String sCar = "";
		int iSuma = 104;
		int iIndice = 1;
		char[] GlaNum38 = new char[103];

		if (GlaNum38[0] != (char) 0XAE) {
			rellenaNum38();
		}

		for (int i = 0; i < psCadena.length(); i++) {

			sCar = ifNull(psCadena.substring(i, i + 1));

			if (!sCar.equals("") && sCar.matches("[0-9]")) {
				iSuma += iIndice * (Integer.parseInt(sCar) + 16);
			}

			iIndice++;
		}

		int iPos = iSuma % 103;

		sCarContr = Character.valueOf(GlaNum38[iPos]).toString();

		return sCarContr;
	}
	
	public static void rellenaNum38() {
		char[] GlaNum38 = new char[103];
				
		GlaNum38[0] = (char) 0XAE;
		GlaNum38[1] = (char) 0X21;
		GlaNum38[2] = (char) 0X22;
		 GlaNum38[3] = (char) 0X23;
		 GlaNum38[4] = (char) 0X24;
		 GlaNum38[5] = (char) 0X25;
		 GlaNum38[6] = (char) 0X26;
		 GlaNum38[7] = (char) 0X27;
		 GlaNum38[8] = (char) 0X28;
		 GlaNum38[9] = (char) 0X29;
		 GlaNum38[10] = (char) 0X2A;
		 GlaNum38[11] = (char) 0X2B;
		 GlaNum38[12] = (char) 0X2C;
		 GlaNum38[13] = (char) 0X2D;
		 GlaNum38[14] = (char) 0X2E;
		 GlaNum38[15] = (char) 0X2F;
		 GlaNum38[16] = (char) 0X30;
		 GlaNum38[17] = (char) 0X31;
		 GlaNum38[18] = (char) 0X32;
		 GlaNum38[19] = (char) 0X33;
		 GlaNum38[20] = (char) 0X34;
		 GlaNum38[21] = (char) 0X35;
		 GlaNum38[22] = (char) 0X36;
		 GlaNum38[23] = (char) 0X37;
		 GlaNum38[24] = (char) 0X38;
		 GlaNum38[25] = (char) 0X39;
		 GlaNum38[26] = (char) 0X3A;
		 GlaNum38[27] = (char) 0X3B;
		 GlaNum38[28] = (char) 0X3C;
		 GlaNum38[29] = (char) 0X3D;
		 GlaNum38[30] = (char) 0X3E;
		 GlaNum38[31] = (char) 0X3F;
		 GlaNum38[32] = (char) 0X40;
		 GlaNum38[33] = (char) 0X41;
		 GlaNum38[34] = (char) 0X42;
		 GlaNum38[35] = (char) 0X43;
		 GlaNum38[36] = (char) 0X44;
		 GlaNum38[37] = (char) 0X45;
		 GlaNum38[38] = (char) 0X46;
		 GlaNum38[39] = (char) 0X47;
		 GlaNum38[40] = (char) 0X48;
		 GlaNum38[41] = (char) 0X49;
		 GlaNum38[42] = (char) 0X4A;
		 GlaNum38[43] = (char) 0X4B;
		 GlaNum38[44] = (char) 0X4C;
		 GlaNum38[45] = (char) 0X4D;
		 GlaNum38[46] = (char) 0X4E;
		 GlaNum38[47] = (char) 0X4F;
		 GlaNum38[48] = (char) 0X50;
		 GlaNum38[49] = (char) 0X51;
		 GlaNum38[50] = (char) 0X52;
		 GlaNum38[51] = (char) 0X53;
		 GlaNum38[52] = (char) 0X54;
		 GlaNum38[53] = (char) 0X55;
		 GlaNum38[54] = (char) 0X56;
		 GlaNum38[55] = (char) 0X57;
		 GlaNum38[56] = (char) 0X58;
		 GlaNum38[57] = (char) 0X59;
		 GlaNum38[58] = (char) 0X5A;
		 GlaNum38[59] = (char) 0X5B;
		 GlaNum38[60] = (char) 0X5C;
		 GlaNum38[61] = (char) 0X5D;
		 GlaNum38[62] = (char) 0X5E;
		 GlaNum38[63] = (char) 0X5F;
		 GlaNum38[64] = (char) 0X60;
		 GlaNum38[65] = (char) 0X61;
		 GlaNum38[66] = (char) 0X62;
		 GlaNum38[67] = (char) 0X63;
		 GlaNum38[68] = (char) 0X64;
		 GlaNum38[69] = (char) 0X65;
		 GlaNum38[70] = (char) 0X66;
		 GlaNum38[71] = (char) 0X67;
		 GlaNum38[72] = (char) 0X68;
		 GlaNum38[73] = (char) 0X69;
		 GlaNum38[74] = (char) 0X6A;
		 GlaNum38[75] = (char) 0X6B;
		 GlaNum38[76] = (char) 0X6C;
		 GlaNum38[77] = (char) 0X6D;
		 GlaNum38[78] = (char) 0X6E;
		 GlaNum38[79] = (char) 0X6F;
		 GlaNum38[80] = (char) 0X70;
		 GlaNum38[81] = (char) 0X71;
		 GlaNum38[82] = (char) 0X72;
		 GlaNum38[83] = (char) 0X73;
		 GlaNum38[84] = (char) 0X74;
		 GlaNum38[85] = (char) 0X75;
		 GlaNum38[86] = (char) 0X76;
		 GlaNum38[87] = (char) 0X77;
		 GlaNum38[88] = (char) 0X78;
		 GlaNum38[89] = (char) 0X79;
		 GlaNum38[90] = (char) 0X7A;
		 GlaNum38[91] = (char) 0X7B;
		 GlaNum38[92] = (char) 0X7C;
		 GlaNum38[93] = (char) 0X7D;
		 GlaNum38[94] = (char) 0XA5;
		 GlaNum38[95] = (char) 0XA6;
		 GlaNum38[96] = (char) 0XA7;
		 GlaNum38[97] = (char) 0XA8;
		 GlaNum38[98] = (char) 0XA9;
		 GlaNum38[99] = (char) 0XAA;
		 GlaNum38[100] = (char) 0XAB;
		 GlaNum38[101] = (char) 0XAC;
		 GlaNum38[102] = (char) 0XAD;
	}

}
