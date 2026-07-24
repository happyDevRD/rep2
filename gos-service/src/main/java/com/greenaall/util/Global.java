package com.greenaall.util;

import java.util.HashMap;
import java.util.Map;

public class Global {
	// MODOS DE LA APLICACIÓN
	public static final String APP_MODO_DEBUG = "D";
	public static final String APP_MODO_MUESTRA = "M";
	public static final String APP_MODO_PRODUCCION = "P";
	public static final Map<String, String> APP_MODOS = new HashMap<String, String>();
	static {
		APP_MODOS.put("app.modo.debug", APP_MODO_DEBUG);
		APP_MODOS.put("app.modo.muestra", APP_MODO_MUESTRA);
		APP_MODOS.put("app.modo.produccion", APP_MODO_PRODUCCION);

	}

	// PLATAFORMAS DE FIRMA-VALDACIÓN
	public static final String PFV_ARROBAFIRMA_6 = "@firma6";
	public static final String PFV_SIGNATURA_E = "firma-e";
	public static final Map<String, String> PFVS = new HashMap<String, String>();
	static {
		PFVS.put("pfv.arrobafirma.6", PFV_ARROBAFIRMA_6);
		PFVS.put("pfv.signatura.e", PFV_SIGNATURA_E);

	}

	// PLATAFORMAS DE SELLADO DE TIEMPO DIGITALES
	public static final String PSD_CATCERT = "CATCert";
	public static final String PSD_TSA = "TS@";
	public static final Map<String, String> PSDS = new HashMap<String, String>();
	static {
		PSDS.put("psd.catcert", PSD_CATCERT);
		PSDS.put("psd.tsa", PSD_TSA);
	}

	// FORMATOS DE FIRMA ELECTRÓNICA
	public static final String SIGNATURE_FORMAT_CADES = "CAdES";
	public static final String SIGNATURE_FORMAT_PKCS7 = "PKCS7";
	public static final String SIGNATURE_FORMAT_CMS = "CMS";
	public static final String SIGNATURE_FORMAT_XMLDSIG = "XMLDSIG";
	public static final String SIGNATURE_FORMAT_XADES = "XADES";
	public static final String SIGNATURE_FORMAT_XADES_BES = "XADES-BES";
	public static final String SIGNATURE_FORMAT_XADES_T = "XADES-T";
	public static final Map<String, String> SIGNATURE_FORMATS = new HashMap<String, String>();
	static {
		SIGNATURE_FORMATS.put("signature.format.cades", SIGNATURE_FORMAT_CADES);
		SIGNATURE_FORMATS.put("signature.format.pkcs7", SIGNATURE_FORMAT_PKCS7);
		SIGNATURE_FORMATS.put("signature.format.cms", SIGNATURE_FORMAT_CMS);
		SIGNATURE_FORMATS.put("signature.format.xmldsig", SIGNATURE_FORMAT_XMLDSIG);
		SIGNATURE_FORMATS.put("signature.format.xades", SIGNATURE_FORMAT_XADES);
		SIGNATURE_FORMATS.put("signature.format.xades.bes", SIGNATURE_FORMAT_XADES_BES);
		SIGNATURE_FORMATS.put("signature.format.xades.t", SIGNATURE_FORMAT_XADES_T);
	}

	// ALGORITMOS HASH FIRMA ELECTRÓNICA
	public static final String HASH_ALGORITHM_MD2 = "MD2";
	public static final String HASH_ALGORITHM_MD5 = "MD5";
	public static final String HASH_ALGORITHM_SHA = "SHA";
	public static final String HASH_ALGORITHM_SHA1 = "SHA1";
	public static final String HASH_ALGORITHM_SHA256 = "SHA256";
	public static final String HASH_ALGORITHM_SHA384 = "SHA384";
	public static final String HASH_ALGORITHM_SHA512 = "SHA512";
	public static final String HASH_ALGORITHM_SHA512WITHRSA = "SHA512withRSA";
	public static final Map<String, String> HASH_ALGORITHMS = new HashMap<String, String>();
	static {
		HASH_ALGORITHMS.put("hash.algorithm.md2", HASH_ALGORITHM_MD2);
		HASH_ALGORITHMS.put("hash.algorithm.md5", HASH_ALGORITHM_MD5);
		HASH_ALGORITHMS.put("hash.algorithm.sha", HASH_ALGORITHM_SHA);
		HASH_ALGORITHMS.put("hash.algorithm.sha1", HASH_ALGORITHM_SHA1);
		HASH_ALGORITHMS.put("hash.algorithm.sha256", HASH_ALGORITHM_SHA256);
		HASH_ALGORITHMS.put("hash.algorithm.sha384", HASH_ALGORITHM_SHA384);
		HASH_ALGORITHMS.put("hash.algorithm.sha512", HASH_ALGORITHM_SHA512);
		HASH_ALGORITHMS.put("hash.algorithm.sha512withrsa", HASH_ALGORITHM_SHA512WITHRSA);
	}

	// MÉTODOS DE SEGURIDAD EN LA LLAMADA A WEB SERVICES
	/*
	 * public static final String SECURITY_NONE = "None"; public static final String
	 * SECURITY_USERNAMETOKEN = WSConstants.USERNAME_TOKEN_LN; public static final
	 * String SECURITY_BINARYSECURITYTOKEN = WSConstants.BINARY_TOKEN_LN; public
	 * static final Map<String, String> SECURITYS_WS = new HashMap<String,
	 * String>(); static { SECURITYS_WS.put("security.none", SECURITY_NONE);
	 * SECURITYS_WS.put("security.usernametoken", SECURITY_USERNAMETOKEN);
	 * SECURITYS_WS.put("security.binaryseuritytoken",
	 * SECURITY_BINARYSECURITYTOKEN); }
	 * 
	 * // TIPOS DE CODIFICACIONES PARA LAS CONTRASEÑAS DE USERNAMETOKEN public
	 * static final String SECURITY_USERNAMETOKEN_PW_DIGEST = WSConstants.PW_DIGEST;
	 * public static final String SECURITY_USERNAMETOKEN_PW_TEXT =
	 * WSConstants.PW_TEXT; public static final Map<String, String>
	 * SECURITYS_USERNAMETOKEN = new HashMap<String, String>(); static {
	 * SECURITYS_USERNAMETOKEN.put("security.usernametoke.pw.digest",
	 * SECURITY_USERNAMETOKEN_PW_DIGEST);
	 * SECURITYS_USERNAMETOKEN.put("security.usernametoken.pw.text",
	 * SECURITY_USERNAMETOKEN_PW_TEXT); }
	 */

	// PASARELAS DE PAGO DISPONIBLES
	public static final String PASARELA_PAGO_REDSYS = "redsys";
	public static final String PASARELA_PAGO_CECA = "ceca";
	public static final String PASARELA_PAGO_REDES = "redes";
	public static final Map<String, String> PASARELAS_PAGO = new HashMap<String, String>();
	static {
		PASARELAS_PAGO.put("pasarela.pago.redsys", PASARELA_PAGO_REDSYS);
		PASARELAS_PAGO.put("pasarela.pago.ceca", PASARELA_PAGO_CECA);
		PASARELAS_PAGO.put("pasarela.pago.redes", PASARELA_PAGO_REDES);
	}

	// TIPOS CONTENIDOS SEDE
	public static final byte CMS_TIPO_LIBRE = 1;
	public static final byte CMS_TIPO_TABLON = 2;
	public static final byte CMS_TIPO_PERFIL_CONTRATANTE = 3;
	public static final byte CMS_TIPO_DETALLE_PERFIL_CONTRATANTE = 4;
	public static final byte CMS_TIPO_TRAMITE = 5;
	public static final byte CMS_TIPO_BANNER = 6;
	public static final byte CMS_TIPO_GALERIA_IMAGENES = 7;
	public static final byte CMS_TIPO_GALERIA_DESCARGAS = 8;
	public static final byte CMS_TIPO_MENU = 9;
	public static final byte CMS_TIPO_GRUPO_TRAMITES = 10;
	public static final byte CMS_TIPO_CONFIGURACION = 11;

	// RUTAS PLANTILLAS SEDE
	public static final String CMS_TEMPLATE_LIBRE = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-info.jsp";
	public static final String CMS_TEMPLATE_TABLON = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-anuncio.jsp";
	public static final String CMS_TEMPLATE_PERFIL_CONTRATANTE = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-perfil-contratante.jsp";
	public static final String CMS_TEMPLATE_DETALLE_PERFIL_CONTRATANTE = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-estado_perfil-contratante.jsp";
	public static final String CMS_TEMPLATE_TRAMITE = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-tramite.jsp";
	public static final String CMS_TEMPLATE_BANNER = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-banner.jsp";
	public static final String CMS_TEMPLATE_GALERIA_IMAGENES = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-galeria-imagen.jsp";
	public static final String CMS_TEMPLATE_GALERIA_DESCARGAS = "/system/modules/es.egim.cms.<!-- proyecto -->/templates/detalle-galeria-descarga.jsp";

	// RUTAS PLANTILLAS SEDE MULTI
	public static final String CMS_TEMPLATE_MULTI = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/";
	public static final String CMS_TEMPLATE_MULTI_LIBRE = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-info.jsp";
	public static final String CMS_TEMPLATE_MULTI_TABLON = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-anuncio.jsp";
	public static final String CMS_TEMPLATE_MULTI_PERFIL_CONTRATANTE = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-perfil-contratante.jsp";
	public static final String CMS_TEMPLATE_MULTI_DETALLE_PERFIL_CONTRATANTE = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-estado_perfil-contratante.jsp";
	public static final String CMS_TEMPLATE_MULTI_TRAMITE = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-tramite.jsp";
	public static final String CMS_TEMPLATE_MULTI_BANNER = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-banner.jsp";
	public static final String CMS_TEMPLATE_MULTI_GALERIA_IMAGENES = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-galeria-imagen.jsp";
	public static final String CMS_TEMPLATE_MULTI_GALERIA_DESCARGAS = "/system/modules/es.egim.cms.multi/templates/<!-- proyecto -->/detalle-galeria-descarga.jsp";

	// RUTAS DEL CONTENIDO SEDE
	public static final String CMS_RUTA_CONTENIDO = "/<!-- proyecto -->/content/";
	public static final String CMS_RUTA_LIBRE = "/<!-- proyecto -->/content/info/";
	public static final String CMS_RUTA_TABLON = "/<!-- proyecto -->/content/tablon/";
	public static final String CMS_RUTA_PERFIL_CONTRATANTE = "/<!-- proyecto -->/content/contratante/";
	public static final String CMS_RUTA_TRAMITE = "/<!-- proyecto -->/content/tramites/";
	public static final String CMS_RUTA_GRUPO_TRAMITES = "/<!-- proyecto -->/content/tramites/grupos/";
	public static final String CMS_RUTA_BANNER = "/<!-- proyecto -->/content/banners/";
	public static final String CMS_RUTA_GALERIA_IMAGENES = "/<!-- proyecto -->/content/galerias/imagenes/";
	public static final String CMS_RUTA_GALERIA_DESCARGAS = "/<!-- proyecto -->/content/galerias/descargas/";
	public static final String CMS_RUTA_MENU = "/<!-- proyecto -->/content/menu/";
	public static final String CMS_RUTA_CONFIGURACION = "/system/modules/es.egim.cms.<!-- proyecto -->/sedes/";

	// RUTAS RECURSOS SEDE
	public static final String CMS_RUTA_IMAGEN_GALERI = "/<!-- proyecto -->/galeria/images/";
	public static final String CMS_RUTA_DOWNLOAD_GALERI = "/<!-- proyecto -->/galeria/download/";
	public static final String CMS_RUTA_DOWNLOAD_DEFECTO = "/<!-- proyecto -->/galeria/download/";
	public static final String CMS_RUTA_DOWNLOAD_TRAMITE = "/<!-- proyecto -->/galeria/download/tramite/";
	public static final String CMS_RUTA_DOWNLOAD_PERFIL = "/<!-- proyecto -->/galeria/download/pcontratante/";
	public static final String CMS_RUTA_DOWNLOAD_TABLON = "/<!-- proyecto -->/galeria/download/tablon/";
	public static final String CMS_RUTA_IMAGEN_BANNER = "/<!-- proyecto -->/galeria/images/banners/";
	public static final String CMS_RUTA_LOGOS_SEDE = "/system/modules/es.egim.cms.<!-- proyecto -->/sedes/logos/";

	// VALORES INDICES
	public static final byte CMS_INDICE_GENERAL = 1;
	public static final byte CMS_INDICE_LICITA = 2;
	public static final byte CMS_INDICE_TRAMITE = 3;
	public static final byte CMS_INDICE_GESTION_LICITA = 4;
	public static final byte CMS_INDICE_GESTION_TRAMITE = 5;

	public static final String CMS_NOMBRE_INDICE_GENERAL = "<!-- proyecto -->_<!-- idioma -->";
	public static final String CMS_NOMBRE_INDICE_LICITA = "<!-- proyecto -->_licitaciones_<!-- idioma -->";
	public static final String CMS_NOMBRE_INDICE_TRAMITE = "<!-- proyecto -->_tramites_<!-- idioma -->";
	public static final String CMS_NOMBRE_INDICE_GESTION_LICITA = "<!-- proyecto -->_gestion_licitaciones_<!-- idioma -->";
	public static final String CMS_NOMBRE_INDICE_GESTION_TRAMITE = "<!-- proyecto -->_gestion_tramites_<!-- idioma -->";

	// VALORES MENSAJES LOGS
	public static final byte LOG_FATAL = 1;
	public static final byte LOG_ERROR = 2;
	public static final byte LOG_WARN = 3;
	public static final byte LOG_INFO = 5;
	public static final byte LOG_DEBUG = 6;

	// FLOW - MÉTODOS DE COMUNICACIÓN
	public static final String FLOW_COMUNICACION_BD = "1";
	public static final String FLOW_COMUNICACION_SISTEMA_FICHERO = "2";
	public static final String FLOW_COMUNICACION_WS = "3";

	// FLOW - TIPOS DE ELEMENTOS E/S
	public static final String FLOW_TIPO_ELEMENTO_ENTRADA = "E";
	public static final String FLOW_TIPO_ELEMENTO_SALIDA = "S";

	// FLOW - TIPOS BÁSICOS
	public static final int FLOW_TIP_BAS_TEXTO = 1;
	public static final int FLOW_TIP_BAS_MEMO = 2;
	public static final int FLOW_TIP_BAS_NUMERICO = 3;
	public static final int FLOW_TIP_BAS_FECHA = 4;
	public static final int FLOW_TIP_BAS_HORA = 5;
	public static final int FLOW_TIP_BAS_MONEDA = 6;
	public static final int FLOW_TIP_BAS_SI_NO = 7;
	public static final int FLOW_TIP_BAS_URL = 8;
	public static final int FLOW_TIP_BAS_FICHERO = 9;
	public static final int FLOW_TIP_BAS_FICHERO_COMPRIMIDO = 10;
	public static final int FLOW_TIP_BAS_DOCUMENTO = 11;

	// FLOW - TIPOS DE CONTROL
	public static final int FLOW_TIP_CON_TEXT = 1;
	public static final int FLOW_TIP_CON_MEMO = 2;
	public static final int FLOW_TIP_CON_COMBO = 3;
	public static final int FLOW_TIP_CON_LISTA = 4;
	public static final int FLOW_TIP_CON_CHECK = 5;
	public static final int FLOW_TIP_CON_RADIO = 6;
	public static final int FLOW_TIP_CON_URL = 8;
	public static final int FLOW_TIP_CON_FICHERO = 9;
	public static final int FLOW_TIP_CON_SELECCION = 10;
	public static final int FLOW_TIP_CON_SELECCION_POR_JS = 11;
	public static final int FLOW_TIP_CON_FICHERO_IMAGEN = 12;
	public static final int FLOW_TIP_CON_FICHERO_OBJETO = 13;
	public static final int FLOW_TIP_CON_DOCUMENTO = 14;

	// FLOW - TIPOS DE ACCESOS A ELEMENTOS
	public static final int FLOW_TIP_ACC_LECTURA = 1;
	public static final int FLOW_TIP_ACC_MODIFICABLE = 2;
	public static final int FLOW_TIP_ACC_OBLIGATORIO = 3;
	public static final int FLOW_TIP_ACC_LECTURA_VALOR_INICIAL = 4;
	public static final int FLOW_TIP_ACC_DESHABILITADO = 5;
	public static final int FLOW_TIP_ACC_MOSTRAR = 10;
	public static final int FLOW_TIP_ACC_FILTRAR_MOSTRAR = 11;
	public static final int FLOW_TIP_ACC_FILTRAR_NO_MOSTRAR = 12;
	public static final int FLOW_TIP_ACC_FILTRO_NO_MODIFICABLE = 13;

	// FLOW - PROPIEDADES DE INFORMACION FLOW-SEDE
	public static final String FLOW_PROP_INFO_NUM_DOCU = "num_docum";
	public static final String FLOW_PROP_INFO_APELLIDO_1 = "apellido1";
	public static final String FLOW_PROP_INFO_APELLIDO_2 = "apellido2";
	public static final String FLOW_PROP_INFO_NOMBRE = "nombre";
	public static final String FLOW_PROP_INFO_NOMBRE_APELLIDOS = "nombre_apellidos";
	public static final String FLOW_PROP_INFO_APELLIDOS = "apellidos";
	public static final String FLOW_PROP_INFO_EMAIL = "email";
	public static final String FLOW_PROP_INFO_READONLY = "readonly";

	// PATRON SOLO DIGITOS
	public final static String SOLO_DIGITOS = "\\d*";

	// OPENCMS - GRUPOS DE USUARIOS
	public static final String CMS_GRUPO_GESTOR = "Gestor";
	public static final String CMS_GRUPO_ADMINISTRATORS = "Administrators";
	public static final String CMS_GRUPO_EDITOR = "Editor";
	public static final String CMS_GRUPO_CIUDADANO = "Ciudadano";

	// MÉTODOS DE LOGIN EN LA SEDE
	public static final byte SEDE_LOGIN_USER_PASSWORD = 0;
	public static final byte SEDE_LOGIN_CERT_DIG = 1;
	public static final byte SEDE_LOGIN_CLAVE = 2;

	// IDIOMA - LOCALE
	public static final String SEDE_LOCALE_ES = "es";
	public static final String SEDE_LOCALE_CA = "ca";
	public static final String SEDE_LOCALE_EN = "en";

	// TIPOS DE DOCUMENTOS DE IDENTIDAD
	public static final int DDCC_CODIFICACION_LIBRE = 0;
	public static final int DDCC_PERSONA_FISICA = 1;
	public static final int DDCC_PERSONA_JURIDICA = 2;
	public static final int DDCC_ADMINISTRACION = 3;

	// ROLES USUARIOS
	public static final Short SEDE_ROLE_CIUDADANO = 0;
	public static final Short SEDE_ROLE_GESTOR = 1;
	public static final Short SEDE_ROLE_EDITOR = 2;
	public static final Short SEDE_ROLE_ADMINISTRADOR = 3;

	// PROYECTOS POR DEFECTO EN OPENCMS
	public static final String CMS_PROJECT_NAME_ONLINE = "Online";
	public static final String CMS_PROJECT_NAME_OFFLINE = "Offline";

	// ESTADOS DE LAS NOTIFICACIONES
	public final static Short NOTIFICACION_ESTADO_PENDIENTE = Short.valueOf("0");
	public final static Short NOTIFICACION_ESTADO_LEIDA = Short.valueOf("1");
	public final static Short NOTIFICACION_ESTADO_ERROR = Short.valueOf("2");
	public final static Short NOTIFICACION_ESTADO_ENVIADA = Short.valueOf("3");

	// ESTADOS SOLICITUD USUARIOS
	public final static byte SOLICITUD_EN_PROCESO_ALTA = (byte) 1;
	public final static byte SOLICITUD_CONCEDIDA = (byte) 2;
	public final static byte SOLICITUD_DENEGADA = (byte) 3;

	// LONGITUDES MAXIMAS PARA FORMULARIOS
	public final static int MAX_SIZE = 80;
}
