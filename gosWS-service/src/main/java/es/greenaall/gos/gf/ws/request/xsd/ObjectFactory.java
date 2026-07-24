
package es.greenaall.gos.gf.ws.request.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import es.greenaall.gos.gf.dto.xsd.NotificacionWs;
import es.greenaall.gos.gf.dto.xsd.ReciboCabeceraWs;
import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import es.greenaall.gos.pe.dto.ws.xsd.PersonaEntidadRequest;
import es.greenaall.gos.ur.ws.request.xsd.DomicilioRequest;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.gf.ws.request.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgenteRequestCodAgent_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codAgent");
    private final static QName _AgenteRequestPass_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "pass");
    private final static QName _OperacionRequestClave_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "clave");
    private final static QName _OperacionRequestFecOperaFin_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecOperaFin");
    private final static QName _OperacionRequestFecOperaInici_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecOperaInici");
    private final static QName _OperacionRequestIdConta_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idConta");
    private final static QName _TipoObjetoTributarioRequestCodTipObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codTipObjTribu");
    private final static QName _TipoObjetoTributarioRequestDesTipObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desTipObjTribu");
    private final static QName _TipoObjetoTributarioRequestFecFinWeb_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecFinWeb");
    private final static QName _TipoObjetoTributarioRequestFecIniWeb_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecIniWeb");
    private final static QName _TipoObjetoTributarioRequestIdHisTipObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisTipObjTribu");
    private final static QName _TipoObjetoTributarioRequestIdTipObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idTipObjTribu");
    private final static QName _TipoObjetoTributarioRequestInfo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "info");
    private final static QName _TipoObjetoTributarioRequestModulo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "modulo");
    private final static QName _TipoObjetoTributarioRequestVisWeb_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "visWeb");
    private final static QName _VehiculoRequestIdHisObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisObjTribu");
    private final static QName _VehiculoRequestIdHisPerso_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisPerso");
    private final static QName _VehiculoRequestIdHisVehic_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisVehic");
    private final static QName _VehiculoRequestIdObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idObjTribu");
    private final static QName _VehiculoRequestIdPerso_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idPerso");
    private final static QName _VehiculoRequestIdVehic_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idVehic");
    private final static QName _VehiculoRequestMatricula_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "matricula");
    private final static QName _VehiculoRequestNumDocum_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numDocum");
    private final static QName _UrbanaRequestIdFinca_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idFinca");
    private final static QName _UrbanaRequestIdHisFinca_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisFinca");
    private final static QName _RusticaRequestIdHisParce_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisParce");
    private final static QName _RusticaRequestIdParce_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idParce");
    private final static QName _ObjetoTributarioMdRequestIdGrupo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idGrupo");
    private final static QName _LpoRequestIdHisInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisInter");
    private final static QName _LpoRequestIdInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idInter");
    private final static QName _LpoRequestIdOcupa_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idOcupa");
    private final static QName _IaeRequestIdActiv_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idActiv");
    private final static QName _IaeRequestIdHisActiv_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisActiv");
    private final static QName _IaeRequestIdHisSujPasiv_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisSujPasiv");
    private final static QName _IaeRequestIdSujPasiv_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idSujPasiv");
    private final static QName _SepulturaRequestIdHisSepul_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisSepul");
    private final static QName _SepulturaRequestIdSepul_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idSepul");
    private final static QName _AbonadoRequestIdAbona_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idAbona");
    private final static QName _AbonadoRequestIdHisAbona_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisAbona");
    private final static QName _MetadatoRequestEtiGruAtrib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "etiGruAtrib");
    private final static QName _MetadatoRequestIdTarif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idTarif");
    private final static QName _MetadatoRequestValor_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "valor");
    private final static QName _MetadatoGrupoAtribRequestDesGruAtrib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desGruAtrib");
    private final static QName _MetadatoGrupoAtribRequestFiltrable_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "filtrable");
    private final static QName _MetadatoGrupoAtribRequestIdAtrib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idAtrib");
    private final static QName _MetadatoGrupoAtribRequestModificable_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "modificable");
    private final static QName _MetadatoGrupoAtribRequestNumOrdPanta_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numOrdPanta");
    private final static QName _MetadatoGrupoAtribRequestRequerido_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "requerido");
    private final static QName _MetadatoGrupoAtribRequestReservado_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "reservado");
    private final static QName _MetadatoGrupoAtribRequestValInici_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "valInici");
    private final static QName _MetadatoGrupoAtribRequestValMaxim_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "valMaxim");
    private final static QName _MetadatoGrupoAtribRequestValMinim_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "valMinim");
    private final static QName _MetadatoGrupoAtribRequestVisible_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "visible");
    private final static QName _ReciboRequestEjeRecib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "ejeRecib");
    private final static QName _ReciboRequestIdHisRecib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idHisRecib");
    private final static QName _ReciboRequestIdRecib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idRecib");
    private final static QName _ReciboRequestNumRecib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numRecib");
    private final static QName _ObjetoTributarioRequestDesObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desObjTribu");
    private final static QName _ObjetoTributarioRequestNumObjTribu_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numObjTribu");
    private final static QName _LiquidacionRequestEjeLiqui_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "ejeLiqui");
    private final static QName _LiquidacionRequestIdLiqui_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idLiqui");
    private final static QName _LiquidacionRequestTipLiqui_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipLiqui");
    private final static QName _JusGastosRequestFecJusExtFin_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecJusExtFin");
    private final static QName _JusGastosRequestFecJusExtInici_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecJusExtInici");
    private final static QName _FacturaRequestIdJusGasto_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idJusGasto");
    private final static QName _FacturaRequestIdTerce_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idTerce");
    private final static QName _AplicacionRequestIndAgrup_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "indAgrup");
    private final static QName _AplicacionRequestIndArea_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "indArea");
    private final static QName _AplicacionRequestIndTipAplic_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "indTipAplic");
    private final static QName _VolanteImagenRequestDesImagen_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desImagen");
    private final static QName _VolanteImagenRequestFichero64_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fichero64");
    private final static QName _VolanteImagenRequestVolante_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "volante");
    private final static QName _VolanteRequestApellido1_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "apellido1");
    private final static QName _VolanteRequestApellido2_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "apellido2");
    private final static QName _VolanteRequestCodAgent2_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codAgent2");
    private final static QName _VolanteRequestCodVehNoCodif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codVehNoCodif");
    private final static QName _VolanteRequestDesVehNoCodif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desVehNoCodif");
    private final static QName _VolanteRequestFecIncid_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecIncid");
    private final static QName _VolanteRequestFirmada_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "firmada");
    private final static QName _VolanteRequestInfraccion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "infraccion");
    private final static QName _VolanteRequestLugar_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "lugar");
    private final static QName _VolanteRequestNombre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "nombre");
    private final static QName _VolanteRequestRazSocial_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "razSocial");
    private final static QName _VolanteRequestTipInfra_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipInfra");
    private final static QName _VolanteRequestVehNoCodif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "vehNoCodif");
    private final static QName _VehiculoDGTRequestBastidor_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "bastidor");
    private final static QName _VehiculoDGTRequestDireccionDGT_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "direccionDGT");
    private final static QName _VehiculoDGTRequestMarca_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "marca");
    private final static QName _VehiculoDGTRequestModelo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "modelo");
    private final static QName _VehiculoDGTRequestMunicipioDGT_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "municipioDGT");
    private final static QName _VehiculoDGTRequestNombreCompleto_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "nombreCompleto");
    private final static QName _VehiculoDGTRequestProvinciaDGT_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "provinciaDGT");
    private final static QName _VehiculoDGTRequestTipDocum_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipDocum");
    private final static QName _VehiculoDGTRequestTipVehic_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipVehic");
    private final static QName _NotificacionRequestCodArchi_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codArchi");
    private final static QName _NotificacionRequestCodArchiAcuse_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codArchiAcuse");
    private final static QName _NotificacionRequestEjeNotif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "ejeNotif");
    private final static QName _NotificacionRequestIdNotif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idNotif");
    private final static QName _NotificacionRequestNumNotif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numNotif");
    private final static QName _NotificacionRequestSituacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "situacion");
    private final static QName _ArchivoRequestEstado_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "estado");
    private final static QName _ArchivoRequestModPerte_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "modPerte");
    private final static QName _ArchivoRequestNombreFichero_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "nombreFichero");
    private final static QName _ArchivoRequestTipFiche_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipFiche");
    private final static QName _ValidarUsuarioGosRequestDatosConexion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "datosConexion");
    private final static QName _ValidarUsuarioGosRequestUsuario_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "usuario");
    private final static QName _ValidaAgentePoliciaRequestAgente_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "agente");
    private final static QName _FicheroTeuRequestCodDir3_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codDir3");
    private final static QName _FicheroTeuRequestCodEntid_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codEntid");
    private final static QName _FicheroTeuRequestDatPerso_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "datPerso");
    private final static QName _FicheroTeuRequestDesDir3_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desDir3");
    private final static QName _FicheroTeuRequestDescripcion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "descripcion");
    private final static QName _FicheroTeuRequestEmail_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "email");
    private final static QName _FicheroTeuRequestFecFirma_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecFirma");
    private final static QName _FicheroTeuRequestFecGener_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecGener");
    private final static QName _FicheroTeuRequestFecSolic_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecSolic");
    private final static QName _FicheroTeuRequestFirmante_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "firmante");
    private final static QName _FicheroTeuRequestForPubli_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "forPubli");
    private final static QName _FicheroTeuRequestIdModel_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idModel");
    private final static QName _FicheroTeuRequestIncLgt_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "incLgt");
    private final static QName _FicheroTeuRequestIndMater_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "indMater");
    private final static QName _FicheroTeuRequestPobFirma_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "pobFirma");
    private final static QName _FicheroTeuRequestProcedimiento_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "procedimiento");
    private final static QName _FicheroTeuRequestTexPlura_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "texPlura");
    private final static QName _FicheroTeuRequestUrl_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "url");
    private final static QName _EnvioCorreoRequestCorInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "corInter");
    private final static QName _EnvioCorreoRequestDesCentr_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desCentr");
    private final static QName _EnvioCorreoRequestDocumento_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "documento");
    private final static QName _EnvioCorreoRequestFecCita_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecCita");
    private final static QName _EnvioCorreoRequestHorCita_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "horCita");
    private final static QName _DesconexionAutoLiquidacioneRequestIdAuto_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idAuto");
    private final static QName _ConsultaTipoObjetoTributarioRequestTipoObjetoTributario_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipoObjetoTributario");
    private final static QName _ConsultaTerritorioRequestCodMunic_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codMunic");
    private final static QName _ConsultaTerritorioRequestCodProvi_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codProvi");
    private final static QName _ConsultaRecibosRequestObjetoTributario_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "objetoTributario");
    private final static QName _ConsultaRecibosRequestRecibo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "recibo");
    private final static QName _ConsultaRecibosRequestSujetoPasivo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "sujetoPasivo");
    private final static QName _ConsultaProcedimientosRequestIdMatProce_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idMatProce");
    private final static QName _ConsultaProcedimientosRequestIdOrgEleme_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idOrgEleme");
    private final static QName _ConsultaOrdenanzaFiscalRequestTipNorma_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipNorma");
    private final static QName _ConsultaOperacionesRequestOperacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "operacion");
    private final static QName _ConsultaObjetosTributariosRequestOtroSujeto_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "otroSujeto");
    private final static QName _ConsultaObjetoVehiculoRequestVehiculo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "vehiculo");
    private final static QName _ConsultaObjetoUrbanaRequestFinca_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "finca");
    private final static QName _ConsultaObjetoRusticaRequestParcela_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "parcela");
    private final static QName _ConsultaObjetoPlusvaliaRequestPlusvalia_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "plusvalia");
    private final static QName _ConsultaObjetoPlusRequestPlus_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "plus");
    private final static QName _ConsultaObjetoMultaRequestDenuncia_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "denuncia");
    private final static QName _ConsultaObjetoMdRequestObjetoMd_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "objetoMd");
    private final static QName _ConsultaObjetoLpoRequestOcupacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "ocupacion");
    private final static QName _ConsultaObjetoIcioRequestObra_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "obra");
    private final static QName _ConsultaObjetoIaeRequestActividad_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "actividad");
    private final static QName _ConsultaObjetoCementerioRequestSepultura_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "sepultura");
    private final static QName _ConsultaObjetoAguaRequestAbonado_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "abonado");
    private final static QName _ConsultaNotificacionesRequestDomicilio_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "domicilio");
    private final static QName _ConsultaNotificacionesRequestNotificacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "notificacion");
    private final static QName _ConsultaNotificacionesRequestNotificado_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "notificado");
    private final static QName _ConsultaMetadatosRequestMetadatoTarifa_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "metadatoTarifa");
    private final static QName _ConsultaMetadatosGrupoAtribRequestMetadatoGrupoAtrib_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "metadatoGrupoAtrib");
    private final static QName _ConsultaLiquidacionesRequestLiquidacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "liquidacion");
    private final static QName _ConsultaLiquidacionesRequestPropietario_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "propietario");
    private final static QName _ConsultaJustificantesGastosRequestJusGastos_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "jusGastos");
    private final static QName _ConsultaInfraccionesRequestApartado_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "apartado");
    private final static QName _ConsultaInfraccionesRequestArticulo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "articulo");
    private final static QName _ConsultaInfraccionesRequestOpcion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "opcion");
    private final static QName _ConsultaFestivosRequestIndTipFesti_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "indTipFesti");
    private final static QName _ConsultaFacturaRequestFactura_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "factura");
    private final static QName _ConsultaTramitacionRequestIdExped_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idExped");
    private final static QName _ConsultaCitaInternetRequestIdCita_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idCita");
    private final static QName _ConsultaCentrosRequestIdCentr_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idCentr");
    private final static QName _ConsultaCentrosHorarioRequestFecha_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecha");
    private final static QName _ConsultaAutoLiquidacionRequestSesion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "sesion");
    private final static QName _ConsultaArchivoRequestArchivo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "archivo");
    private final static QName _ConsultaAplicacionesRequestAplicacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "aplicacion");
    private final static QName _AltaRegistroRequestCve_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "cve");
    private final static QName _AltaRegistroRequestDesProce_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desProce");
    private final static QName _AltaRegistroRequestEjeExped_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "ejeExped");
    private final static QName _AltaRegistroRequestExtracto_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "extracto");
    private final static QName _AltaRegistroRequestForNotif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "forNotif");
    private final static QName _AltaRegistroRequestNumExped_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numExped");
    private final static QName _AltaRegistroRequestObsFichero_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "obsFichero");
    private final static QName _AltaRegistroRequestObservaciones_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "observaciones");
    private final static QName _AltaRegistroRequestOficina_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "oficina");
    private final static QName _AltaRegistroRequestTema_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tema");
    private final static QName _CobroContabilidadRequestIdAutol_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idAutol");
    private final static QName _CobroContabilidadRequestOrdinal_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "ordinal");
    private final static QName _CobroContabilidadRequestTipoObjeto_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipoObjeto");
    private final static QName _CobroContabilidadRequestTipoTercero_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipoTercero");
    private final static QName _AltaCitaInternetRequestMovInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "movInter");
    private final static QName _AltaCitaInternetRequestTelInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "telInter");
    private final static QName _ActualizarReciboRequestReciboCabecera_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "reciboCabecera");
    private final static QName _ActualizarReciboInternetRequestAutorizacion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "autorizacion");
    private final static QName _ActualizarReciboInternetRequestStatus_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "status");
    private final static QName _ActualizarNotificacionRequestNotificacionRequest_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "notificacionRequest");
    private final static QName _GenerarVolanteImagenRequestVolanteImagen_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "volanteImagen");
    private final static QName _GenerarReciboRequestIdImpue_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idImpue");
    private final static QName _GenerarReciboRequestImpPrinc_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "impPrinc");
    private final static QName _GenerarReciboRequestNomPadro_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "nomPadro");
    private final static QName _GenerarNotificacionRequestCodPosta_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codPosta");
    private final static QName _GenerarNotificacionRequestDesVial_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "desVial");
    private final static QName _GenerarNotificacionRequestFecNotif_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecNotif");
    private final static QName _GenerarNotificacionRequestLocalidad_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "localidad");
    private final static QName _GenerarNotificacionRequestNumInfer_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "numInfer");
    private final static QName _GenerarNotificacionRequestPlanta_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "planta");
    private final static QName _GenerarNotificacionRequestPuerta_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "puerta");
    private final static QName _GenerarNotificacionRequestTipVial_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tipVial");
    private final static QName _AutoliquidacionInternetRequestCodigoObjetoTributario_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codigoObjetoTributario");
    private final static QName _AutoliquidacionInternetRequestCodigoTipoObjetoTributario_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codigoTipoObjetoTributario");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestCodPostaInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codPostaInter");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestCodPostaRepre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "codPostaRepre");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestCorreo_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "correo");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestDirInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "dirInter");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestDirRepre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "dirRepre");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestDniCifRepre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "dniCifRepre");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestFecProceso_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fecProceso");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestImporte_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "importe");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestMovil_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "movil");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestMunInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "munInter");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestMunRepre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "munRepre");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestNombreRepre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "nombreRepre");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestOrden_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "orden");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestProInter_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "proInter");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestProRepre_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "proRepre");
    private final static QName _AutoliquidacionesInternetRecaudacionRequestTelefono_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "telefono");
    private final static QName _GenerarArchivoRequestFichero_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "fichero");
    private final static QName _RespuestaActualizacionRequestIdDoc_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idDoc");
    private final static QName _RespuestaActualizacionRequestIdPeticion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "idPeticion");
    private final static QName _RespuestaActualizacionRequestTagsDoc_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tagsDoc");
    private final static QName _RespuestaActualizacionRequestTagsPeticion_QNAME = new QName("http://request.ws.gf.gos.greenaall.es/xsd", "tagsPeticion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.gf.ws.request.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaActualizacionRequest }
     * 
     */
    public RespuestaActualizacionRequest createRespuestaActualizacionRequest() {
        return new RespuestaActualizacionRequest();
    }

    /**
     * Create an instance of {@link GenerarArchivoRequest }
     * 
     */
    public GenerarArchivoRequest createGenerarArchivoRequest() {
        return new GenerarArchivoRequest();
    }

    /**
     * Create an instance of {@link AutoliquidacionesInternetRecaudacionRequest }
     * 
     */
    public AutoliquidacionesInternetRecaudacionRequest createAutoliquidacionesInternetRecaudacionRequest() {
        return new AutoliquidacionesInternetRecaudacionRequest();
    }

    /**
     * Create an instance of {@link AutoliquidacionInternetRequest }
     * 
     */
    public AutoliquidacionInternetRequest createAutoliquidacionInternetRequest() {
        return new AutoliquidacionInternetRequest();
    }

    /**
     * Create an instance of {@link GenerarNotificacionRequest }
     * 
     */
    public GenerarNotificacionRequest createGenerarNotificacionRequest() {
        return new GenerarNotificacionRequest();
    }

    /**
     * Create an instance of {@link GenerarObjetoTributarioMdRequest }
     * 
     */
    public GenerarObjetoTributarioMdRequest createGenerarObjetoTributarioMdRequest() {
        return new GenerarObjetoTributarioMdRequest();
    }

    /**
     * Create an instance of {@link GenerarObjetoTributarioRequest }
     * 
     */
    public GenerarObjetoTributarioRequest createGenerarObjetoTributarioRequest() {
        return new GenerarObjetoTributarioRequest();
    }

    /**
     * Create an instance of {@link GenerarReciboRequest }
     * 
     */
    public GenerarReciboRequest createGenerarReciboRequest() {
        return new GenerarReciboRequest();
    }

    /**
     * Create an instance of {@link GenerarVehiculoRequest }
     * 
     */
    public GenerarVehiculoRequest createGenerarVehiculoRequest() {
        return new GenerarVehiculoRequest();
    }

    /**
     * Create an instance of {@link GenerarVolanteRequest }
     * 
     */
    public GenerarVolanteRequest createGenerarVolanteRequest() {
        return new GenerarVolanteRequest();
    }

    /**
     * Create an instance of {@link GenerarVolanteImagenRequest }
     * 
     */
    public GenerarVolanteImagenRequest createGenerarVolanteImagenRequest() {
        return new GenerarVolanteImagenRequest();
    }

    /**
     * Create an instance of {@link ActualizarNotificacionRequest }
     * 
     */
    public ActualizarNotificacionRequest createActualizarNotificacionRequest() {
        return new ActualizarNotificacionRequest();
    }

    /**
     * Create an instance of {@link ActualizarReciboInternet2Request }
     * 
     */
    public ActualizarReciboInternet2Request createActualizarReciboInternet2Request() {
        return new ActualizarReciboInternet2Request();
    }

    /**
     * Create an instance of {@link ActualizarReciboInternetRequest }
     * 
     */
    public ActualizarReciboInternetRequest createActualizarReciboInternetRequest() {
        return new ActualizarReciboInternetRequest();
    }

    /**
     * Create an instance of {@link ActualizarReciboRequest }
     * 
     */
    public ActualizarReciboRequest createActualizarReciboRequest() {
        return new ActualizarReciboRequest();
    }

    /**
     * Create an instance of {@link ActualizarReciboPTRequest }
     * 
     */
    public ActualizarReciboPTRequest createActualizarReciboPTRequest() {
        return new ActualizarReciboPTRequest();
    }

    /**
     * Create an instance of {@link AltaCitaInternetRequest }
     * 
     */
    public AltaCitaInternetRequest createAltaCitaInternetRequest() {
        return new AltaCitaInternetRequest();
    }

    /**
     * Create an instance of {@link CobroContabilidadRequest }
     * 
     */
    public CobroContabilidadRequest createCobroContabilidadRequest() {
        return new CobroContabilidadRequest();
    }

    /**
     * Create an instance of {@link AltaRegistroRequest }
     * 
     */
    public AltaRegistroRequest createAltaRegistroRequest() {
        return new AltaRegistroRequest();
    }

    /**
     * Create an instance of {@link AnularCitaInternetRequest }
     * 
     */
    public AnularCitaInternetRequest createAnularCitaInternetRequest() {
        return new AnularCitaInternetRequest();
    }

    /**
     * Create an instance of {@link AutoLiquidacionInternetHRequest }
     * 
     */
    public AutoLiquidacionInternetHRequest createAutoLiquidacionInternetHRequest() {
        return new AutoLiquidacionInternetHRequest();
    }

    /**
     * Create an instance of {@link ConsultaAplicacionesRequest }
     * 
     */
    public ConsultaAplicacionesRequest createConsultaAplicacionesRequest() {
        return new ConsultaAplicacionesRequest();
    }

    /**
     * Create an instance of {@link ConsultaArchivoRequest }
     * 
     */
    public ConsultaArchivoRequest createConsultaArchivoRequest() {
        return new ConsultaArchivoRequest();
    }

    /**
     * Create an instance of {@link ConsultaAutoLiquidacionInternetRequest }
     * 
     */
    public ConsultaAutoLiquidacionInternetRequest createConsultaAutoLiquidacionInternetRequest() {
        return new ConsultaAutoLiquidacionInternetRequest();
    }

    /**
     * Create an instance of {@link ConsultaAutoLiquidacionRequest }
     * 
     */
    public ConsultaAutoLiquidacionRequest createConsultaAutoLiquidacionRequest() {
        return new ConsultaAutoLiquidacionRequest();
    }

    /**
     * Create an instance of {@link ConsultaCentrosHorarioRequest }
     * 
     */
    public ConsultaCentrosHorarioRequest createConsultaCentrosHorarioRequest() {
        return new ConsultaCentrosHorarioRequest();
    }

    /**
     * Create an instance of {@link ConsultaCentrosRequest }
     * 
     */
    public ConsultaCentrosRequest createConsultaCentrosRequest() {
        return new ConsultaCentrosRequest();
    }

    /**
     * Create an instance of {@link ConsultaCitaInternetRequest }
     * 
     */
    public ConsultaCitaInternetRequest createConsultaCitaInternetRequest() {
        return new ConsultaCitaInternetRequest();
    }

    /**
     * Create an instance of {@link ConsultaTramitacionRequest }
     * 
     */
    public ConsultaTramitacionRequest createConsultaTramitacionRequest() {
        return new ConsultaTramitacionRequest();
    }

    /**
     * Create an instance of {@link ConsultaFacturaRequest }
     * 
     */
    public ConsultaFacturaRequest createConsultaFacturaRequest() {
        return new ConsultaFacturaRequest();
    }

    /**
     * Create an instance of {@link ConsultaFestivosRequest }
     * 
     */
    public ConsultaFestivosRequest createConsultaFestivosRequest() {
        return new ConsultaFestivosRequest();
    }

    /**
     * Create an instance of {@link ConsultaInfraccionesRequest }
     * 
     */
    public ConsultaInfraccionesRequest createConsultaInfraccionesRequest() {
        return new ConsultaInfraccionesRequest();
    }

    /**
     * Create an instance of {@link ConsultaJustificantesGastosRequest }
     * 
     */
    public ConsultaJustificantesGastosRequest createConsultaJustificantesGastosRequest() {
        return new ConsultaJustificantesGastosRequest();
    }

    /**
     * Create an instance of {@link ConsultaLiquidacionesRequest }
     * 
     */
    public ConsultaLiquidacionesRequest createConsultaLiquidacionesRequest() {
        return new ConsultaLiquidacionesRequest();
    }

    /**
     * Create an instance of {@link ConsultaModalidadProcedimientosRequest }
     * 
     */
    public ConsultaModalidadProcedimientosRequest createConsultaModalidadProcedimientosRequest() {
        return new ConsultaModalidadProcedimientosRequest();
    }

    /**
     * Create an instance of {@link ConsultaMetadatosGrupoAtribRequest }
     * 
     */
    public ConsultaMetadatosGrupoAtribRequest createConsultaMetadatosGrupoAtribRequest() {
        return new ConsultaMetadatosGrupoAtribRequest();
    }

    /**
     * Create an instance of {@link ConsultaMetadatosRequest }
     * 
     */
    public ConsultaMetadatosRequest createConsultaMetadatosRequest() {
        return new ConsultaMetadatosRequest();
    }

    /**
     * Create an instance of {@link ConsultaNotificacionesRequest }
     * 
     */
    public ConsultaNotificacionesRequest createConsultaNotificacionesRequest() {
        return new ConsultaNotificacionesRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoAguaRequest }
     * 
     */
    public ConsultaObjetoAguaRequest createConsultaObjetoAguaRequest() {
        return new ConsultaObjetoAguaRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoCementerioRequest }
     * 
     */
    public ConsultaObjetoCementerioRequest createConsultaObjetoCementerioRequest() {
        return new ConsultaObjetoCementerioRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoIaeRequest }
     * 
     */
    public ConsultaObjetoIaeRequest createConsultaObjetoIaeRequest() {
        return new ConsultaObjetoIaeRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoIcioRequest }
     * 
     */
    public ConsultaObjetoIcioRequest createConsultaObjetoIcioRequest() {
        return new ConsultaObjetoIcioRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoLpoRequest }
     * 
     */
    public ConsultaObjetoLpoRequest createConsultaObjetoLpoRequest() {
        return new ConsultaObjetoLpoRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoMdRequest }
     * 
     */
    public ConsultaObjetoMdRequest createConsultaObjetoMdRequest() {
        return new ConsultaObjetoMdRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoMultaRequest }
     * 
     */
    public ConsultaObjetoMultaRequest createConsultaObjetoMultaRequest() {
        return new ConsultaObjetoMultaRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoPlusRequest }
     * 
     */
    public ConsultaObjetoPlusRequest createConsultaObjetoPlusRequest() {
        return new ConsultaObjetoPlusRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoPlusvaliaRequest }
     * 
     */
    public ConsultaObjetoPlusvaliaRequest createConsultaObjetoPlusvaliaRequest() {
        return new ConsultaObjetoPlusvaliaRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoRusticaRequest }
     * 
     */
    public ConsultaObjetoRusticaRequest createConsultaObjetoRusticaRequest() {
        return new ConsultaObjetoRusticaRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoUrbanaRequest }
     * 
     */
    public ConsultaObjetoUrbanaRequest createConsultaObjetoUrbanaRequest() {
        return new ConsultaObjetoUrbanaRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetoVehiculoRequest }
     * 
     */
    public ConsultaObjetoVehiculoRequest createConsultaObjetoVehiculoRequest() {
        return new ConsultaObjetoVehiculoRequest();
    }

    /**
     * Create an instance of {@link ConsultaObjetosTributariosRequest }
     * 
     */
    public ConsultaObjetosTributariosRequest createConsultaObjetosTributariosRequest() {
        return new ConsultaObjetosTributariosRequest();
    }

    /**
     * Create an instance of {@link ConsultaOperacionesRequest }
     * 
     */
    public ConsultaOperacionesRequest createConsultaOperacionesRequest() {
        return new ConsultaOperacionesRequest();
    }

    /**
     * Create an instance of {@link ConsultaOrdenanzaFiscalRequest }
     * 
     */
    public ConsultaOrdenanzaFiscalRequest createConsultaOrdenanzaFiscalRequest() {
        return new ConsultaOrdenanzaFiscalRequest();
    }

    /**
     * Create an instance of {@link ConsultaProcedimientosRequest }
     * 
     */
    public ConsultaProcedimientosRequest createConsultaProcedimientosRequest() {
        return new ConsultaProcedimientosRequest();
    }

    /**
     * Create an instance of {@link ConsultaRecibosRequest }
     * 
     */
    public ConsultaRecibosRequest createConsultaRecibosRequest() {
        return new ConsultaRecibosRequest();
    }

    /**
     * Create an instance of {@link ConsultaTerritorioRequest }
     * 
     */
    public ConsultaTerritorioRequest createConsultaTerritorioRequest() {
        return new ConsultaTerritorioRequest();
    }

    /**
     * Create an instance of {@link ConsultaTipoObjetoTributarioRequest }
     * 
     */
    public ConsultaTipoObjetoTributarioRequest createConsultaTipoObjetoTributarioRequest() {
        return new ConsultaTipoObjetoTributarioRequest();
    }

    /**
     * Create an instance of {@link ConsultaVehiculosRequest }
     * 
     */
    public ConsultaVehiculosRequest createConsultaVehiculosRequest() {
        return new ConsultaVehiculosRequest();
    }

    /**
     * Create an instance of {@link DescargarArchivoServidorRequest }
     * 
     */
    public DescargarArchivoServidorRequest createDescargarArchivoServidorRequest() {
        return new DescargarArchivoServidorRequest();
    }

    /**
     * Create an instance of {@link DesconexionAutoLiquidacioneRequest }
     * 
     */
    public DesconexionAutoLiquidacioneRequest createDesconexionAutoLiquidacioneRequest() {
        return new DesconexionAutoLiquidacioneRequest();
    }

    /**
     * Create an instance of {@link EnvioCorreoRequest }
     * 
     */
    public EnvioCorreoRequest createEnvioCorreoRequest() {
        return new EnvioCorreoRequest();
    }

    /**
     * Create an instance of {@link FicheroTeuRequest }
     * 
     */
    public FicheroTeuRequest createFicheroTeuRequest() {
        return new FicheroTeuRequest();
    }

    /**
     * Create an instance of {@link ValidaAgentePoliciaRequest }
     * 
     */
    public ValidaAgentePoliciaRequest createValidaAgentePoliciaRequest() {
        return new ValidaAgentePoliciaRequest();
    }

    /**
     * Create an instance of {@link ValidarUsuarioGosRequest }
     * 
     */
    public ValidarUsuarioGosRequest createValidarUsuarioGosRequest() {
        return new ValidarUsuarioGosRequest();
    }

    /**
     * Create an instance of {@link ArchivoRequest }
     * 
     */
    public ArchivoRequest createArchivoRequest() {
        return new ArchivoRequest();
    }

    /**
     * Create an instance of {@link NotificacionRequest }
     * 
     */
    public NotificacionRequest createNotificacionRequest() {
        return new NotificacionRequest();
    }

    /**
     * Create an instance of {@link VehiculoDGTRequest }
     * 
     */
    public VehiculoDGTRequest createVehiculoDGTRequest() {
        return new VehiculoDGTRequest();
    }

    /**
     * Create an instance of {@link VolanteRequest }
     * 
     */
    public VolanteRequest createVolanteRequest() {
        return new VolanteRequest();
    }

    /**
     * Create an instance of {@link VolanteImagenRequest }
     * 
     */
    public VolanteImagenRequest createVolanteImagenRequest() {
        return new VolanteImagenRequest();
    }

    /**
     * Create an instance of {@link AplicacionRequest }
     * 
     */
    public AplicacionRequest createAplicacionRequest() {
        return new AplicacionRequest();
    }

    /**
     * Create an instance of {@link FacturaRequest }
     * 
     */
    public FacturaRequest createFacturaRequest() {
        return new FacturaRequest();
    }

    /**
     * Create an instance of {@link JusGastosRequest }
     * 
     */
    public JusGastosRequest createJusGastosRequest() {
        return new JusGastosRequest();
    }

    /**
     * Create an instance of {@link LiquidacionRequest }
     * 
     */
    public LiquidacionRequest createLiquidacionRequest() {
        return new LiquidacionRequest();
    }

    /**
     * Create an instance of {@link ObjetoTributarioRequest }
     * 
     */
    public ObjetoTributarioRequest createObjetoTributarioRequest() {
        return new ObjetoTributarioRequest();
    }

    /**
     * Create an instance of {@link ReciboRequest }
     * 
     */
    public ReciboRequest createReciboRequest() {
        return new ReciboRequest();
    }

    /**
     * Create an instance of {@link MetadatoGrupoAtribRequest }
     * 
     */
    public MetadatoGrupoAtribRequest createMetadatoGrupoAtribRequest() {
        return new MetadatoGrupoAtribRequest();
    }

    /**
     * Create an instance of {@link MetadatoRequest }
     * 
     */
    public MetadatoRequest createMetadatoRequest() {
        return new MetadatoRequest();
    }

    /**
     * Create an instance of {@link AbonadoRequest }
     * 
     */
    public AbonadoRequest createAbonadoRequest() {
        return new AbonadoRequest();
    }

    /**
     * Create an instance of {@link SepulturaRequest }
     * 
     */
    public SepulturaRequest createSepulturaRequest() {
        return new SepulturaRequest();
    }

    /**
     * Create an instance of {@link IaeRequest }
     * 
     */
    public IaeRequest createIaeRequest() {
        return new IaeRequest();
    }

    /**
     * Create an instance of {@link IcioRequest }
     * 
     */
    public IcioRequest createIcioRequest() {
        return new IcioRequest();
    }

    /**
     * Create an instance of {@link LpoRequest }
     * 
     */
    public LpoRequest createLpoRequest() {
        return new LpoRequest();
    }

    /**
     * Create an instance of {@link ObjetoTributarioMdRequest }
     * 
     */
    public ObjetoTributarioMdRequest createObjetoTributarioMdRequest() {
        return new ObjetoTributarioMdRequest();
    }

    /**
     * Create an instance of {@link DenunciaRequest }
     * 
     */
    public DenunciaRequest createDenunciaRequest() {
        return new DenunciaRequest();
    }

    /**
     * Create an instance of {@link PlusRequest }
     * 
     */
    public PlusRequest createPlusRequest() {
        return new PlusRequest();
    }

    /**
     * Create an instance of {@link PlusvaliaRequest }
     * 
     */
    public PlusvaliaRequest createPlusvaliaRequest() {
        return new PlusvaliaRequest();
    }

    /**
     * Create an instance of {@link RusticaRequest }
     * 
     */
    public RusticaRequest createRusticaRequest() {
        return new RusticaRequest();
    }

    /**
     * Create an instance of {@link UrbanaRequest }
     * 
     */
    public UrbanaRequest createUrbanaRequest() {
        return new UrbanaRequest();
    }

    /**
     * Create an instance of {@link VehiculoRequest }
     * 
     */
    public VehiculoRequest createVehiculoRequest() {
        return new VehiculoRequest();
    }

    /**
     * Create an instance of {@link TipoObjetoTributarioRequest }
     * 
     */
    public TipoObjetoTributarioRequest createTipoObjetoTributarioRequest() {
        return new TipoObjetoTributarioRequest();
    }

    /**
     * Create an instance of {@link OperacionRequest }
     * 
     */
    public OperacionRequest createOperacionRequest() {
        return new OperacionRequest();
    }

    /**
     * Create an instance of {@link AgenteRequest }
     * 
     */
    public AgenteRequest createAgenteRequest() {
        return new AgenteRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codAgent", scope = AgenteRequest.class)
    public JAXBElement<String> createAgenteRequestCodAgent(String value) {
        return new JAXBElement<String>(_AgenteRequestCodAgent_QNAME, String.class, AgenteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "pass", scope = AgenteRequest.class)
    public JAXBElement<String> createAgenteRequestPass(String value) {
        return new JAXBElement<String>(_AgenteRequestPass_QNAME, String.class, AgenteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "clave", scope = OperacionRequest.class)
    public JAXBElement<Short> createOperacionRequestClave(Short value) {
        return new JAXBElement<Short>(_OperacionRequestClave_QNAME, Short.class, OperacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecOperaFin", scope = OperacionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createOperacionRequestFecOperaFin(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperacionRequestFecOperaFin_QNAME, XMLGregorianCalendar.class, OperacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecOperaInici", scope = OperacionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createOperacionRequestFecOperaInici(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperacionRequestFecOperaInici_QNAME, XMLGregorianCalendar.class, OperacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idConta", scope = OperacionRequest.class)
    public JAXBElement<Long> createOperacionRequestIdConta(Long value) {
        return new JAXBElement<Long>(_OperacionRequestIdConta_QNAME, Long.class, OperacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codTipObjTribu", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<String> createTipoObjetoTributarioRequestCodTipObjTribu(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioRequestCodTipObjTribu_QNAME, String.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desTipObjTribu", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<String> createTipoObjetoTributarioRequestDesTipObjTribu(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioRequestDesTipObjTribu_QNAME, String.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecFinWeb", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<XMLGregorianCalendar> createTipoObjetoTributarioRequestFecFinWeb(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TipoObjetoTributarioRequestFecFinWeb_QNAME, XMLGregorianCalendar.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecIniWeb", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<XMLGregorianCalendar> createTipoObjetoTributarioRequestFecIniWeb(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TipoObjetoTributarioRequestFecIniWeb_QNAME, XMLGregorianCalendar.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisTipObjTribu", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<Long> createTipoObjetoTributarioRequestIdHisTipObjTribu(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioRequestIdHisTipObjTribu_QNAME, Long.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idTipObjTribu", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<Long> createTipoObjetoTributarioRequestIdTipObjTribu(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioRequestIdTipObjTribu_QNAME, Long.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "info", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<String> createTipoObjetoTributarioRequestInfo(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioRequestInfo_QNAME, String.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "modulo", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<Short> createTipoObjetoTributarioRequestModulo(Short value) {
        return new JAXBElement<Short>(_TipoObjetoTributarioRequestModulo_QNAME, Short.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "visWeb", scope = TipoObjetoTributarioRequest.class)
    public JAXBElement<Short> createTipoObjetoTributarioRequestVisWeb(Short value) {
        return new JAXBElement<Short>(_TipoObjetoTributarioRequestVisWeb_QNAME, Short.class, TipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = VehiculoRequest.class)
    public JAXBElement<Long> createVehiculoRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = VehiculoRequest.class)
    public JAXBElement<Long> createVehiculoRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisVehic", scope = VehiculoRequest.class)
    public JAXBElement<Long> createVehiculoRequestIdHisVehic(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisVehic_QNAME, Long.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = VehiculoRequest.class)
    public JAXBElement<Long> createVehiculoRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = VehiculoRequest.class)
    public JAXBElement<Long> createVehiculoRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idVehic", scope = VehiculoRequest.class)
    public JAXBElement<Long> createVehiculoRequestIdVehic(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdVehic_QNAME, Long.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "matricula", scope = VehiculoRequest.class)
    public JAXBElement<String> createVehiculoRequestMatricula(String value) {
        return new JAXBElement<String>(_VehiculoRequestMatricula_QNAME, String.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = VehiculoRequest.class)
    public JAXBElement<String> createVehiculoRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, VehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idFinca", scope = UrbanaRequest.class)
    public JAXBElement<Long> createUrbanaRequestIdFinca(Long value) {
        return new JAXBElement<Long>(_UrbanaRequestIdFinca_QNAME, Long.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisFinca", scope = UrbanaRequest.class)
    public JAXBElement<Long> createUrbanaRequestIdHisFinca(Long value) {
        return new JAXBElement<Long>(_UrbanaRequestIdHisFinca_QNAME, Long.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = UrbanaRequest.class)
    public JAXBElement<Long> createUrbanaRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = UrbanaRequest.class)
    public JAXBElement<Long> createUrbanaRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = UrbanaRequest.class)
    public JAXBElement<Long> createUrbanaRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = UrbanaRequest.class)
    public JAXBElement<Long> createUrbanaRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = UrbanaRequest.class)
    public JAXBElement<String> createUrbanaRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, UrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = RusticaRequest.class)
    public JAXBElement<Long> createRusticaRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisParce", scope = RusticaRequest.class)
    public JAXBElement<Long> createRusticaRequestIdHisParce(Long value) {
        return new JAXBElement<Long>(_RusticaRequestIdHisParce_QNAME, Long.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = RusticaRequest.class)
    public JAXBElement<Long> createRusticaRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = RusticaRequest.class)
    public JAXBElement<Long> createRusticaRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idParce", scope = RusticaRequest.class)
    public JAXBElement<Long> createRusticaRequestIdParce(Long value) {
        return new JAXBElement<Long>(_RusticaRequestIdParce_QNAME, Long.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = RusticaRequest.class)
    public JAXBElement<Long> createRusticaRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = RusticaRequest.class)
    public JAXBElement<String> createRusticaRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, RusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = PlusvaliaRequest.class)
    public JAXBElement<Long> createPlusvaliaRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, PlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = PlusvaliaRequest.class)
    public JAXBElement<Long> createPlusvaliaRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, PlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = PlusvaliaRequest.class)
    public JAXBElement<Long> createPlusvaliaRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, PlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = PlusvaliaRequest.class)
    public JAXBElement<Long> createPlusvaliaRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, PlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = PlusvaliaRequest.class)
    public JAXBElement<String> createPlusvaliaRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, PlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = PlusRequest.class)
    public JAXBElement<Long> createPlusRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, PlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = PlusRequest.class)
    public JAXBElement<Long> createPlusRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, PlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = PlusRequest.class)
    public JAXBElement<Long> createPlusRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, PlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = PlusRequest.class)
    public JAXBElement<Long> createPlusRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, PlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = PlusRequest.class)
    public JAXBElement<String> createPlusRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, PlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = DenunciaRequest.class)
    public JAXBElement<Long> createDenunciaRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, DenunciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = DenunciaRequest.class)
    public JAXBElement<Long> createDenunciaRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, DenunciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = DenunciaRequest.class)
    public JAXBElement<Long> createDenunciaRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, DenunciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = DenunciaRequest.class)
    public JAXBElement<Long> createDenunciaRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, DenunciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = DenunciaRequest.class)
    public JAXBElement<String> createDenunciaRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, DenunciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idGrupo", scope = ObjetoTributarioMdRequest.class)
    public JAXBElement<Long> createObjetoTributarioMdRequestIdGrupo(Long value) {
        return new JAXBElement<Long>(_ObjetoTributarioMdRequestIdGrupo_QNAME, Long.class, ObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = ObjetoTributarioMdRequest.class)
    public JAXBElement<Long> createObjetoTributarioMdRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, ObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = ObjetoTributarioMdRequest.class)
    public JAXBElement<Long> createObjetoTributarioMdRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, ObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisInter", scope = LpoRequest.class)
    public JAXBElement<Long> createLpoRequestIdHisInter(Long value) {
        return new JAXBElement<Long>(_LpoRequestIdHisInter_QNAME, Long.class, LpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = LpoRequest.class)
    public JAXBElement<Long> createLpoRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, LpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idInter", scope = LpoRequest.class)
    public JAXBElement<Long> createLpoRequestIdInter(Long value) {
        return new JAXBElement<Long>(_LpoRequestIdInter_QNAME, Long.class, LpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = LpoRequest.class)
    public JAXBElement<Long> createLpoRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, LpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idOcupa", scope = LpoRequest.class)
    public JAXBElement<Long> createLpoRequestIdOcupa(Long value) {
        return new JAXBElement<Long>(_LpoRequestIdOcupa_QNAME, Long.class, LpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = LpoRequest.class)
    public JAXBElement<String> createLpoRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, LpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = IcioRequest.class)
    public JAXBElement<Long> createIcioRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, IcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = IcioRequest.class)
    public JAXBElement<Long> createIcioRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, IcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = IcioRequest.class)
    public JAXBElement<Long> createIcioRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, IcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = IcioRequest.class)
    public JAXBElement<Long> createIcioRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, IcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = IcioRequest.class)
    public JAXBElement<String> createIcioRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, IcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idActiv", scope = IaeRequest.class)
    public JAXBElement<Long> createIaeRequestIdActiv(Long value) {
        return new JAXBElement<Long>(_IaeRequestIdActiv_QNAME, Long.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisActiv", scope = IaeRequest.class)
    public JAXBElement<Long> createIaeRequestIdHisActiv(Long value) {
        return new JAXBElement<Long>(_IaeRequestIdHisActiv_QNAME, Long.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = IaeRequest.class)
    public JAXBElement<Long> createIaeRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisSujPasiv", scope = IaeRequest.class)
    public JAXBElement<Long> createIaeRequestIdHisSujPasiv(Long value) {
        return new JAXBElement<Long>(_IaeRequestIdHisSujPasiv_QNAME, Long.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = IaeRequest.class)
    public JAXBElement<Long> createIaeRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idSujPasiv", scope = IaeRequest.class)
    public JAXBElement<Long> createIaeRequestIdSujPasiv(Long value) {
        return new JAXBElement<Long>(_IaeRequestIdSujPasiv_QNAME, Long.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = IaeRequest.class)
    public JAXBElement<String> createIaeRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, IaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = SepulturaRequest.class)
    public JAXBElement<Long> createSepulturaRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = SepulturaRequest.class)
    public JAXBElement<Long> createSepulturaRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisSepul", scope = SepulturaRequest.class)
    public JAXBElement<Long> createSepulturaRequestIdHisSepul(Long value) {
        return new JAXBElement<Long>(_SepulturaRequestIdHisSepul_QNAME, Long.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = SepulturaRequest.class)
    public JAXBElement<Long> createSepulturaRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = SepulturaRequest.class)
    public JAXBElement<Long> createSepulturaRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idSepul", scope = SepulturaRequest.class)
    public JAXBElement<Long> createSepulturaRequestIdSepul(Long value) {
        return new JAXBElement<Long>(_SepulturaRequestIdSepul_QNAME, Long.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = SepulturaRequest.class)
    public JAXBElement<String> createSepulturaRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, SepulturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAbona", scope = AbonadoRequest.class)
    public JAXBElement<Long> createAbonadoRequestIdAbona(Long value) {
        return new JAXBElement<Long>(_AbonadoRequestIdAbona_QNAME, Long.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisAbona", scope = AbonadoRequest.class)
    public JAXBElement<Long> createAbonadoRequestIdHisAbona(Long value) {
        return new JAXBElement<Long>(_AbonadoRequestIdHisAbona_QNAME, Long.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = AbonadoRequest.class)
    public JAXBElement<Long> createAbonadoRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = AbonadoRequest.class)
    public JAXBElement<Long> createAbonadoRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = AbonadoRequest.class)
    public JAXBElement<Long> createAbonadoRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = AbonadoRequest.class)
    public JAXBElement<Long> createAbonadoRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = AbonadoRequest.class)
    public JAXBElement<String> createAbonadoRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, AbonadoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "etiGruAtrib", scope = MetadatoRequest.class)
    public JAXBElement<String> createMetadatoRequestEtiGruAtrib(String value) {
        return new JAXBElement<String>(_MetadatoRequestEtiGruAtrib_QNAME, String.class, MetadatoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idGrupo", scope = MetadatoRequest.class)
    public JAXBElement<Long> createMetadatoRequestIdGrupo(Long value) {
        return new JAXBElement<Long>(_ObjetoTributarioMdRequestIdGrupo_QNAME, Long.class, MetadatoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idTarif", scope = MetadatoRequest.class)
    public JAXBElement<Long> createMetadatoRequestIdTarif(Long value) {
        return new JAXBElement<Long>(_MetadatoRequestIdTarif_QNAME, Long.class, MetadatoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "valor", scope = MetadatoRequest.class)
    public JAXBElement<String> createMetadatoRequestValor(String value) {
        return new JAXBElement<String>(_MetadatoRequestValor_QNAME, String.class, MetadatoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desGruAtrib", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<String> createMetadatoGrupoAtribRequestDesGruAtrib(String value) {
        return new JAXBElement<String>(_MetadatoGrupoAtribRequestDesGruAtrib_QNAME, String.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "etiGruAtrib", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<String> createMetadatoGrupoAtribRequestEtiGruAtrib(String value) {
        return new JAXBElement<String>(_MetadatoRequestEtiGruAtrib_QNAME, String.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "filtrable", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestFiltrable(Short value) {
        return new JAXBElement<Short>(_MetadatoGrupoAtribRequestFiltrable_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAtrib", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Long> createMetadatoGrupoAtribRequestIdAtrib(Long value) {
        return new JAXBElement<Long>(_MetadatoGrupoAtribRequestIdAtrib_QNAME, Long.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idGrupo", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Long> createMetadatoGrupoAtribRequestIdGrupo(Long value) {
        return new JAXBElement<Long>(_ObjetoTributarioMdRequestIdGrupo_QNAME, Long.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "modificable", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestModificable(Short value) {
        return new JAXBElement<Short>(_MetadatoGrupoAtribRequestModificable_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numOrdPanta", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestNumOrdPanta(Short value) {
        return new JAXBElement<Short>(_MetadatoGrupoAtribRequestNumOrdPanta_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "requerido", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestRequerido(Short value) {
        return new JAXBElement<Short>(_MetadatoGrupoAtribRequestRequerido_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "reservado", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestReservado(Short value) {
        return new JAXBElement<Short>(_MetadatoGrupoAtribRequestReservado_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "valInici", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<String> createMetadatoGrupoAtribRequestValInici(String value) {
        return new JAXBElement<String>(_MetadatoGrupoAtribRequestValInici_QNAME, String.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "valMaxim", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<String> createMetadatoGrupoAtribRequestValMaxim(String value) {
        return new JAXBElement<String>(_MetadatoGrupoAtribRequestValMaxim_QNAME, String.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "valMinim", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<String> createMetadatoGrupoAtribRequestValMinim(String value) {
        return new JAXBElement<String>(_MetadatoGrupoAtribRequestValMinim_QNAME, String.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "visWeb", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestVisWeb(Short value) {
        return new JAXBElement<Short>(_TipoObjetoTributarioRequestVisWeb_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "visible", scope = MetadatoGrupoAtribRequest.class)
    public JAXBElement<Short> createMetadatoGrupoAtribRequestVisible(Short value) {
        return new JAXBElement<Short>(_MetadatoGrupoAtribRequestVisible_QNAME, Short.class, MetadatoGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeRecib", scope = ReciboRequest.class)
    public JAXBElement<Short> createReciboRequestEjeRecib(Short value) {
        return new JAXBElement<Short>(_ReciboRequestEjeRecib_QNAME, Short.class, ReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = ReciboRequest.class)
    public JAXBElement<Long> createReciboRequestIdHisRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdHisRecib_QNAME, Long.class, ReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idRecib", scope = ReciboRequest.class)
    public JAXBElement<Long> createReciboRequestIdRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdRecib_QNAME, Long.class, ReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numRecib", scope = ReciboRequest.class)
    public JAXBElement<Integer> createReciboRequestNumRecib(Integer value) {
        return new JAXBElement<Integer>(_ReciboRequestNumRecib_QNAME, Integer.class, ReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desObjTribu", scope = ObjetoTributarioRequest.class)
    public JAXBElement<String> createObjetoTributarioRequestDesObjTribu(String value) {
        return new JAXBElement<String>(_ObjetoTributarioRequestDesObjTribu_QNAME, String.class, ObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = ObjetoTributarioRequest.class)
    public JAXBElement<Long> createObjetoTributarioRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, ObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = ObjetoTributarioRequest.class)
    public JAXBElement<Long> createObjetoTributarioRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, ObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numObjTribu", scope = ObjetoTributarioRequest.class)
    public JAXBElement<Long> createObjetoTributarioRequestNumObjTribu(Long value) {
        return new JAXBElement<Long>(_ObjetoTributarioRequestNumObjTribu_QNAME, Long.class, ObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeLiqui", scope = LiquidacionRequest.class)
    public JAXBElement<Short> createLiquidacionRequestEjeLiqui(Short value) {
        return new JAXBElement<Short>(_LiquidacionRequestEjeLiqui_QNAME, Short.class, LiquidacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idLiqui", scope = LiquidacionRequest.class)
    public JAXBElement<Long> createLiquidacionRequestIdLiqui(Long value) {
        return new JAXBElement<Long>(_LiquidacionRequestIdLiqui_QNAME, Long.class, LiquidacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipLiqui", scope = LiquidacionRequest.class)
    public JAXBElement<Short> createLiquidacionRequestTipLiqui(Short value) {
        return new JAXBElement<Short>(_LiquidacionRequestTipLiqui_QNAME, Short.class, LiquidacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecJusExtFin", scope = JusGastosRequest.class)
    public JAXBElement<XMLGregorianCalendar> createJusGastosRequestFecJusExtFin(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JusGastosRequestFecJusExtFin_QNAME, XMLGregorianCalendar.class, JusGastosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecJusExtInici", scope = JusGastosRequest.class)
    public JAXBElement<XMLGregorianCalendar> createJusGastosRequestFecJusExtInici(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JusGastosRequestFecJusExtInici_QNAME, XMLGregorianCalendar.class, JusGastosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idConta", scope = JusGastosRequest.class)
    public JAXBElement<Long> createJusGastosRequestIdConta(Long value) {
        return new JAXBElement<Long>(_OperacionRequestIdConta_QNAME, Long.class, JusGastosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = FacturaRequest.class)
    public JAXBElement<Long> createFacturaRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, FacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idJusGasto", scope = FacturaRequest.class)
    public JAXBElement<Long> createFacturaRequestIdJusGasto(Long value) {
        return new JAXBElement<Long>(_FacturaRequestIdJusGasto_QNAME, Long.class, FacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = FacturaRequest.class)
    public JAXBElement<Long> createFacturaRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, FacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idTerce", scope = FacturaRequest.class)
    public JAXBElement<Long> createFacturaRequestIdTerce(Long value) {
        return new JAXBElement<Long>(_FacturaRequestIdTerce_QNAME, Long.class, FacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = FacturaRequest.class)
    public JAXBElement<String> createFacturaRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, FacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idConta", scope = AplicacionRequest.class)
    public JAXBElement<Long> createAplicacionRequestIdConta(Long value) {
        return new JAXBElement<Long>(_OperacionRequestIdConta_QNAME, Long.class, AplicacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "indAgrup", scope = AplicacionRequest.class)
    public JAXBElement<Short> createAplicacionRequestIndAgrup(Short value) {
        return new JAXBElement<Short>(_AplicacionRequestIndAgrup_QNAME, Short.class, AplicacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "indArea", scope = AplicacionRequest.class)
    public JAXBElement<Short> createAplicacionRequestIndArea(Short value) {
        return new JAXBElement<Short>(_AplicacionRequestIndArea_QNAME, Short.class, AplicacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "indTipAplic", scope = AplicacionRequest.class)
    public JAXBElement<Short> createAplicacionRequestIndTipAplic(Short value) {
        return new JAXBElement<Short>(_AplicacionRequestIndTipAplic_QNAME, Short.class, AplicacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desImagen", scope = VolanteImagenRequest.class)
    public JAXBElement<String> createVolanteImagenRequestDesImagen(String value) {
        return new JAXBElement<String>(_VolanteImagenRequestDesImagen_QNAME, String.class, VolanteImagenRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fichero64", scope = VolanteImagenRequest.class)
    public JAXBElement<String> createVolanteImagenRequestFichero64(String value) {
        return new JAXBElement<String>(_VolanteImagenRequestFichero64_QNAME, String.class, VolanteImagenRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "volante", scope = VolanteImagenRequest.class)
    public JAXBElement<String> createVolanteImagenRequestVolante(String value) {
        return new JAXBElement<String>(_VolanteImagenRequestVolante_QNAME, String.class, VolanteImagenRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido1", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestApellido1(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido1_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido2", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestApellido2(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido2_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codAgent", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestCodAgent(String value) {
        return new JAXBElement<String>(_AgenteRequestCodAgent_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codAgent2", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestCodAgent2(String value) {
        return new JAXBElement<String>(_VolanteRequestCodAgent2_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codVehNoCodif", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestCodVehNoCodif(String value) {
        return new JAXBElement<String>(_VolanteRequestCodVehNoCodif_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desVehNoCodif", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestDesVehNoCodif(String value) {
        return new JAXBElement<String>(_VolanteRequestDesVehNoCodif_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecIncid", scope = VolanteRequest.class)
    public JAXBElement<XMLGregorianCalendar> createVolanteRequestFecIncid(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VolanteRequestFecIncid_QNAME, XMLGregorianCalendar.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "firmada", scope = VolanteRequest.class)
    public JAXBElement<Short> createVolanteRequestFirmada(Short value) {
        return new JAXBElement<Short>(_VolanteRequestFirmada_QNAME, Short.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "infraccion", scope = VolanteRequest.class)
    public JAXBElement<Short> createVolanteRequestInfraccion(Short value) {
        return new JAXBElement<Short>(_VolanteRequestInfraccion_QNAME, Short.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "lugar", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestLugar(String value) {
        return new JAXBElement<String>(_VolanteRequestLugar_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "matricula", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestMatricula(String value) {
        return new JAXBElement<String>(_VehiculoRequestMatricula_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombre", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestNombre(String value) {
        return new JAXBElement<String>(_VolanteRequestNombre_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "razSocial", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestRazSocial(String value) {
        return new JAXBElement<String>(_VolanteRequestRazSocial_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipInfra", scope = VolanteRequest.class)
    public JAXBElement<Short> createVolanteRequestTipInfra(Short value) {
        return new JAXBElement<Short>(_VolanteRequestTipInfra_QNAME, Short.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "vehNoCodif", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestVehNoCodif(String value) {
        return new JAXBElement<String>(_VolanteRequestVehNoCodif_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "volante", scope = VolanteRequest.class)
    public JAXBElement<String> createVolanteRequestVolante(String value) {
        return new JAXBElement<String>(_VolanteImagenRequestVolante_QNAME, String.class, VolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido1", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestApellido1(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido1_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido2", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestApellido2(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido2_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "bastidor", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestBastidor(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestBastidor_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "direccionDGT", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestDireccionDGT(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestDireccionDGT_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "marca", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestMarca(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestMarca_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "matricula", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestMatricula(String value) {
        return new JAXBElement<String>(_VehiculoRequestMatricula_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "modelo", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestModelo(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestModelo_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "municipioDGT", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestMunicipioDGT(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestMunicipioDGT_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombre", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestNombre(String value) {
        return new JAXBElement<String>(_VolanteRequestNombre_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombreCompleto", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestNombreCompleto(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestNombreCompleto_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "provinciaDGT", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestProvinciaDGT(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestProvinciaDGT_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipDocum", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestTipDocum(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestTipDocum_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipVehic", scope = VehiculoDGTRequest.class)
    public JAXBElement<String> createVehiculoDGTRequestTipVehic(String value) {
        return new JAXBElement<String>(_VehiculoDGTRequestTipVehic_QNAME, String.class, VehiculoDGTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codArchi", scope = NotificacionRequest.class)
    public JAXBElement<Long> createNotificacionRequestCodArchi(Long value) {
        return new JAXBElement<Long>(_NotificacionRequestCodArchi_QNAME, Long.class, NotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codArchiAcuse", scope = NotificacionRequest.class)
    public JAXBElement<Long> createNotificacionRequestCodArchiAcuse(Long value) {
        return new JAXBElement<Long>(_NotificacionRequestCodArchiAcuse_QNAME, Long.class, NotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeNotif", scope = NotificacionRequest.class)
    public JAXBElement<Short> createNotificacionRequestEjeNotif(Short value) {
        return new JAXBElement<Short>(_NotificacionRequestEjeNotif_QNAME, Short.class, NotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idNotif", scope = NotificacionRequest.class)
    public JAXBElement<Long> createNotificacionRequestIdNotif(Long value) {
        return new JAXBElement<Long>(_NotificacionRequestIdNotif_QNAME, Long.class, NotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numNotif", scope = NotificacionRequest.class)
    public JAXBElement<Integer> createNotificacionRequestNumNotif(Integer value) {
        return new JAXBElement<Integer>(_NotificacionRequestNumNotif_QNAME, Integer.class, NotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "situacion", scope = NotificacionRequest.class)
    public JAXBElement<Short> createNotificacionRequestSituacion(Short value) {
        return new JAXBElement<Short>(_NotificacionRequestSituacion_QNAME, Short.class, NotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codArchi", scope = ArchivoRequest.class)
    public JAXBElement<Long> createArchivoRequestCodArchi(Long value) {
        return new JAXBElement<Long>(_NotificacionRequestCodArchi_QNAME, Long.class, ArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "estado", scope = ArchivoRequest.class)
    public JAXBElement<Short> createArchivoRequestEstado(Short value) {
        return new JAXBElement<Short>(_ArchivoRequestEstado_QNAME, Short.class, ArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "modPerte", scope = ArchivoRequest.class)
    public JAXBElement<Short> createArchivoRequestModPerte(Short value) {
        return new JAXBElement<Short>(_ArchivoRequestModPerte_QNAME, Short.class, ArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombreFichero", scope = ArchivoRequest.class)
    public JAXBElement<String> createArchivoRequestNombreFichero(String value) {
        return new JAXBElement<String>(_ArchivoRequestNombreFichero_QNAME, String.class, ArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipDocum", scope = ArchivoRequest.class)
    public JAXBElement<Long> createArchivoRequestTipDocum(Long value) {
        return new JAXBElement<Long>(_VehiculoDGTRequestTipDocum_QNAME, Long.class, ArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipFiche", scope = ArchivoRequest.class)
    public JAXBElement<Short> createArchivoRequestTipFiche(Short value) {
        return new JAXBElement<Short>(_ArchivoRequestTipFiche_QNAME, Short.class, ArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ValidarUsuarioGosRequest.class)
    public JAXBElement<DatosConexion> createValidarUsuarioGosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ValidarUsuarioGosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "pass", scope = ValidarUsuarioGosRequest.class)
    public JAXBElement<String> createValidarUsuarioGosRequestPass(String value) {
        return new JAXBElement<String>(_AgenteRequestPass_QNAME, String.class, ValidarUsuarioGosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "usuario", scope = ValidarUsuarioGosRequest.class)
    public JAXBElement<String> createValidarUsuarioGosRequestUsuario(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosRequestUsuario_QNAME, String.class, ValidarUsuarioGosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgenteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgenteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "agente", scope = ValidaAgentePoliciaRequest.class)
    public JAXBElement<AgenteRequest> createValidaAgentePoliciaRequestAgente(AgenteRequest value) {
        return new JAXBElement<AgenteRequest>(_ValidaAgentePoliciaRequestAgente_QNAME, AgenteRequest.class, ValidaAgentePoliciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ValidaAgentePoliciaRequest.class)
    public JAXBElement<DatosConexion> createValidaAgentePoliciaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ValidaAgentePoliciaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codDir3", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestCodDir3(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestCodDir3_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codEntid", scope = FicheroTeuRequest.class)
    public JAXBElement<Short> createFicheroTeuRequestCodEntid(Short value) {
        return new JAXBElement<Short>(_FicheroTeuRequestCodEntid_QNAME, Short.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datPerso", scope = FicheroTeuRequest.class)
    public JAXBElement<Boolean> createFicheroTeuRequestDatPerso(Boolean value) {
        return new JAXBElement<Boolean>(_FicheroTeuRequestDatPerso_QNAME, Boolean.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = FicheroTeuRequest.class)
    public JAXBElement<DatosConexion> createFicheroTeuRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desDir3", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestDesDir3(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestDesDir3_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestDescripcion(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestDescripcion_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "email", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestEmail(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestEmail_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecFirma", scope = FicheroTeuRequest.class)
    public JAXBElement<XMLGregorianCalendar> createFicheroTeuRequestFecFirma(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FicheroTeuRequestFecFirma_QNAME, XMLGregorianCalendar.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecGener", scope = FicheroTeuRequest.class)
    public JAXBElement<XMLGregorianCalendar> createFicheroTeuRequestFecGener(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FicheroTeuRequestFecGener_QNAME, XMLGregorianCalendar.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecSolic", scope = FicheroTeuRequest.class)
    public JAXBElement<XMLGregorianCalendar> createFicheroTeuRequestFecSolic(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FicheroTeuRequestFecSolic_QNAME, XMLGregorianCalendar.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "firmante", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestFirmante(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestFirmante_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "forPubli", scope = FicheroTeuRequest.class)
    public JAXBElement<Short> createFicheroTeuRequestForPubli(Short value) {
        return new JAXBElement<Short>(_FicheroTeuRequestForPubli_QNAME, Short.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idModel", scope = FicheroTeuRequest.class)
    public JAXBElement<Long> createFicheroTeuRequestIdModel(Long value) {
        return new JAXBElement<Long>(_FicheroTeuRequestIdModel_QNAME, Long.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idNotif", scope = FicheroTeuRequest.class)
    public JAXBElement<Long> createFicheroTeuRequestIdNotif(Long value) {
        return new JAXBElement<Long>(_NotificacionRequestIdNotif_QNAME, Long.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "incLgt", scope = FicheroTeuRequest.class)
    public JAXBElement<Boolean> createFicheroTeuRequestIncLgt(Boolean value) {
        return new JAXBElement<Boolean>(_FicheroTeuRequestIncLgt_QNAME, Boolean.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "indMater", scope = FicheroTeuRequest.class)
    public JAXBElement<Short> createFicheroTeuRequestIndMater(Short value) {
        return new JAXBElement<Short>(_FicheroTeuRequestIndMater_QNAME, Short.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "pobFirma", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestPobFirma(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestPobFirma_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "procedimiento", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestProcedimiento(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestProcedimiento_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "texPlura", scope = FicheroTeuRequest.class)
    public JAXBElement<Boolean> createFicheroTeuRequestTexPlura(Boolean value) {
        return new JAXBElement<Boolean>(_FicheroTeuRequestTexPlura_QNAME, Boolean.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "url", scope = FicheroTeuRequest.class)
    public JAXBElement<String> createFicheroTeuRequestUrl(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestUrl_QNAME, String.class, FicheroTeuRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "corInter", scope = EnvioCorreoRequest.class)
    public JAXBElement<String> createEnvioCorreoRequestCorInter(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestCorInter_QNAME, String.class, EnvioCorreoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = EnvioCorreoRequest.class)
    public JAXBElement<DatosConexion> createEnvioCorreoRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, EnvioCorreoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desCentr", scope = EnvioCorreoRequest.class)
    public JAXBElement<String> createEnvioCorreoRequestDesCentr(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestDesCentr_QNAME, String.class, EnvioCorreoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "documento", scope = EnvioCorreoRequest.class)
    public JAXBElement<String> createEnvioCorreoRequestDocumento(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestDocumento_QNAME, String.class, EnvioCorreoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecCita", scope = EnvioCorreoRequest.class)
    public JAXBElement<String> createEnvioCorreoRequestFecCita(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestFecCita_QNAME, String.class, EnvioCorreoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "horCita", scope = EnvioCorreoRequest.class)
    public JAXBElement<String> createEnvioCorreoRequestHorCita(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestHorCita_QNAME, String.class, EnvioCorreoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = DesconexionAutoLiquidacioneRequest.class)
    public JAXBElement<DatosConexion> createDesconexionAutoLiquidacioneRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, DesconexionAutoLiquidacioneRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAuto", scope = DesconexionAutoLiquidacioneRequest.class)
    public JAXBElement<String> createDesconexionAutoLiquidacioneRequestIdAuto(String value) {
        return new JAXBElement<String>(_DesconexionAutoLiquidacioneRequestIdAuto_QNAME, String.class, DesconexionAutoLiquidacioneRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = DesconexionAutoLiquidacioneRequest.class)
    public JAXBElement<String> createDesconexionAutoLiquidacioneRequestIdHisRecib(String value) {
        return new JAXBElement<String>(_ReciboRequestIdHisRecib_QNAME, String.class, DesconexionAutoLiquidacioneRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idRecib", scope = DesconexionAutoLiquidacioneRequest.class)
    public JAXBElement<String> createDesconexionAutoLiquidacioneRequestIdRecib(String value) {
        return new JAXBElement<String>(_ReciboRequestIdRecib_QNAME, String.class, DesconexionAutoLiquidacioneRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codArchi", scope = DescargarArchivoServidorRequest.class)
    public JAXBElement<Long> createDescargarArchivoServidorRequestCodArchi(Long value) {
        return new JAXBElement<Long>(_NotificacionRequestCodArchi_QNAME, Long.class, DescargarArchivoServidorRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = DescargarArchivoServidorRequest.class)
    public JAXBElement<DatosConexion> createDescargarArchivoServidorRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, DescargarArchivoServidorRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaVehiculosRequest.class)
    public JAXBElement<DatosConexion> createConsultaVehiculosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaVehiculosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "matricula", scope = ConsultaVehiculosRequest.class)
    public JAXBElement<String> createConsultaVehiculosRequestMatricula(String value) {
        return new JAXBElement<String>(_VehiculoRequestMatricula_QNAME, String.class, ConsultaVehiculosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = ConsultaVehiculosRequest.class)
    public JAXBElement<String> createConsultaVehiculosRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, ConsultaVehiculosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaTipoObjetoTributarioRequest.class)
    public JAXBElement<DatosConexion> createConsultaTipoObjetoTributarioRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaTipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipoObjetoTributario", scope = ConsultaTipoObjetoTributarioRequest.class)
    public JAXBElement<TipoObjetoTributarioRequest> createConsultaTipoObjetoTributarioRequestTipoObjetoTributario(TipoObjetoTributarioRequest value) {
        return new JAXBElement<TipoObjetoTributarioRequest>(_ConsultaTipoObjetoTributarioRequestTipoObjetoTributario_QNAME, TipoObjetoTributarioRequest.class, ConsultaTipoObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codMunic", scope = ConsultaTerritorioRequest.class)
    public JAXBElement<Short> createConsultaTerritorioRequestCodMunic(Short value) {
        return new JAXBElement<Short>(_ConsultaTerritorioRequestCodMunic_QNAME, Short.class, ConsultaTerritorioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codProvi", scope = ConsultaTerritorioRequest.class)
    public JAXBElement<Short> createConsultaTerritorioRequestCodProvi(Short value) {
        return new JAXBElement<Short>(_ConsultaTerritorioRequestCodProvi_QNAME, Short.class, ConsultaTerritorioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaTerritorioRequest.class)
    public JAXBElement<DatosConexion> createConsultaTerritorioRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaTerritorioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaRecibosRequest.class)
    public JAXBElement<DatosConexion> createConsultaRecibosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaRecibosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "objetoTributario", scope = ConsultaRecibosRequest.class)
    public JAXBElement<ObjetoTributarioRequest> createConsultaRecibosRequestObjetoTributario(ObjetoTributarioRequest value) {
        return new JAXBElement<ObjetoTributarioRequest>(_ConsultaRecibosRequestObjetoTributario_QNAME, ObjetoTributarioRequest.class, ConsultaRecibosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "recibo", scope = ConsultaRecibosRequest.class)
    public JAXBElement<ReciboRequest> createConsultaRecibosRequestRecibo(ReciboRequest value) {
        return new JAXBElement<ReciboRequest>(_ConsultaRecibosRequestRecibo_QNAME, ReciboRequest.class, ConsultaRecibosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "sujetoPasivo", scope = ConsultaRecibosRequest.class)
    public JAXBElement<PersonaEntidadRequest> createConsultaRecibosRequestSujetoPasivo(PersonaEntidadRequest value) {
        return new JAXBElement<PersonaEntidadRequest>(_ConsultaRecibosRequestSujetoPasivo_QNAME, PersonaEntidadRequest.class, ConsultaRecibosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaProcedimientosRequest.class)
    public JAXBElement<DatosConexion> createConsultaProcedimientosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaProcedimientosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaProcedimientosRequest.class)
    public JAXBElement<String> createConsultaProcedimientosRequestDescripcion(String value) {
        return new JAXBElement<String>(_FicheroTeuRequestDescripcion_QNAME, String.class, ConsultaProcedimientosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idMatProce", scope = ConsultaProcedimientosRequest.class)
    public JAXBElement<Long> createConsultaProcedimientosRequestIdMatProce(Long value) {
        return new JAXBElement<Long>(_ConsultaProcedimientosRequestIdMatProce_QNAME, Long.class, ConsultaProcedimientosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idOrgEleme", scope = ConsultaProcedimientosRequest.class)
    public JAXBElement<Long> createConsultaProcedimientosRequestIdOrgEleme(Long value) {
        return new JAXBElement<Long>(_ConsultaProcedimientosRequestIdOrgEleme_QNAME, Long.class, ConsultaProcedimientosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaOrdenanzaFiscalRequest.class)
    public JAXBElement<DatosConexion> createConsultaOrdenanzaFiscalRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaOrdenanzaFiscalRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipNorma", scope = ConsultaOrdenanzaFiscalRequest.class)
    public JAXBElement<Short> createConsultaOrdenanzaFiscalRequestTipNorma(Short value) {
        return new JAXBElement<Short>(_ConsultaOrdenanzaFiscalRequestTipNorma_QNAME, Short.class, ConsultaOrdenanzaFiscalRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaOperacionesRequest.class)
    public JAXBElement<DatosConexion> createConsultaOperacionesRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaOperacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "operacion", scope = ConsultaOperacionesRequest.class)
    public JAXBElement<OperacionRequest> createConsultaOperacionesRequestOperacion(OperacionRequest value) {
        return new JAXBElement<OperacionRequest>(_ConsultaOperacionesRequestOperacion_QNAME, OperacionRequest.class, ConsultaOperacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetosTributariosRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetosTributariosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetosTributariosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "objetoTributario", scope = ConsultaObjetosTributariosRequest.class)
    public JAXBElement<ObjetoTributarioRequest> createConsultaObjetosTributariosRequestObjetoTributario(ObjetoTributarioRequest value) {
        return new JAXBElement<ObjetoTributarioRequest>(_ConsultaRecibosRequestObjetoTributario_QNAME, ObjetoTributarioRequest.class, ConsultaObjetosTributariosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "otroSujeto", scope = ConsultaObjetosTributariosRequest.class)
    public JAXBElement<PersonaEntidadRequest> createConsultaObjetosTributariosRequestOtroSujeto(PersonaEntidadRequest value) {
        return new JAXBElement<PersonaEntidadRequest>(_ConsultaObjetosTributariosRequestOtroSujeto_QNAME, PersonaEntidadRequest.class, ConsultaObjetosTributariosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "sujetoPasivo", scope = ConsultaObjetosTributariosRequest.class)
    public JAXBElement<PersonaEntidadRequest> createConsultaObjetosTributariosRequestSujetoPasivo(PersonaEntidadRequest value) {
        return new JAXBElement<PersonaEntidadRequest>(_ConsultaRecibosRequestSujetoPasivo_QNAME, PersonaEntidadRequest.class, ConsultaObjetosTributariosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipoObjetoTributario", scope = ConsultaObjetosTributariosRequest.class)
    public JAXBElement<TipoObjetoTributarioRequest> createConsultaObjetosTributariosRequestTipoObjetoTributario(TipoObjetoTributarioRequest value) {
        return new JAXBElement<TipoObjetoTributarioRequest>(_ConsultaTipoObjetoTributarioRequestTipoObjetoTributario_QNAME, TipoObjetoTributarioRequest.class, ConsultaObjetosTributariosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoVehiculoRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoVehiculoRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoVehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "vehiculo", scope = ConsultaObjetoVehiculoRequest.class)
    public JAXBElement<VehiculoRequest> createConsultaObjetoVehiculoRequestVehiculo(VehiculoRequest value) {
        return new JAXBElement<VehiculoRequest>(_ConsultaObjetoVehiculoRequestVehiculo_QNAME, VehiculoRequest.class, ConsultaObjetoVehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoUrbanaRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoUrbanaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoUrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrbanaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UrbanaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "finca", scope = ConsultaObjetoUrbanaRequest.class)
    public JAXBElement<UrbanaRequest> createConsultaObjetoUrbanaRequestFinca(UrbanaRequest value) {
        return new JAXBElement<UrbanaRequest>(_ConsultaObjetoUrbanaRequestFinca_QNAME, UrbanaRequest.class, ConsultaObjetoUrbanaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoRusticaRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoRusticaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoRusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RusticaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RusticaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "parcela", scope = ConsultaObjetoRusticaRequest.class)
    public JAXBElement<RusticaRequest> createConsultaObjetoRusticaRequestParcela(RusticaRequest value) {
        return new JAXBElement<RusticaRequest>(_ConsultaObjetoRusticaRequestParcela_QNAME, RusticaRequest.class, ConsultaObjetoRusticaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoPlusvaliaRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoPlusvaliaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoPlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusvaliaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlusvaliaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "plusvalia", scope = ConsultaObjetoPlusvaliaRequest.class)
    public JAXBElement<PlusvaliaRequest> createConsultaObjetoPlusvaliaRequestPlusvalia(PlusvaliaRequest value) {
        return new JAXBElement<PlusvaliaRequest>(_ConsultaObjetoPlusvaliaRequestPlusvalia_QNAME, PlusvaliaRequest.class, ConsultaObjetoPlusvaliaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoPlusRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoPlusRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoPlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlusRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "plus", scope = ConsultaObjetoPlusRequest.class)
    public JAXBElement<PlusRequest> createConsultaObjetoPlusRequestPlus(PlusRequest value) {
        return new JAXBElement<PlusRequest>(_ConsultaObjetoPlusRequestPlus_QNAME, PlusRequest.class, ConsultaObjetoPlusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoMultaRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoMultaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoMultaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DenunciaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DenunciaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "denuncia", scope = ConsultaObjetoMultaRequest.class)
    public JAXBElement<DenunciaRequest> createConsultaObjetoMultaRequestDenuncia(DenunciaRequest value) {
        return new JAXBElement<DenunciaRequest>(_ConsultaObjetoMultaRequestDenuncia_QNAME, DenunciaRequest.class, ConsultaObjetoMultaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoMdRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoMdRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioMdRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioMdRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "objetoMd", scope = ConsultaObjetoMdRequest.class)
    public JAXBElement<ObjetoTributarioMdRequest> createConsultaObjetoMdRequestObjetoMd(ObjetoTributarioMdRequest value) {
        return new JAXBElement<ObjetoTributarioMdRequest>(_ConsultaObjetoMdRequestObjetoMd_QNAME, ObjetoTributarioMdRequest.class, ConsultaObjetoMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoLpoRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoLpoRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoLpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LpoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LpoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ocupacion", scope = ConsultaObjetoLpoRequest.class)
    public JAXBElement<LpoRequest> createConsultaObjetoLpoRequestOcupacion(LpoRequest value) {
        return new JAXBElement<LpoRequest>(_ConsultaObjetoLpoRequestOcupacion_QNAME, LpoRequest.class, ConsultaObjetoLpoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoIcioRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoIcioRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoIcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IcioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IcioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "obra", scope = ConsultaObjetoIcioRequest.class)
    public JAXBElement<IcioRequest> createConsultaObjetoIcioRequestObra(IcioRequest value) {
        return new JAXBElement<IcioRequest>(_ConsultaObjetoIcioRequestObra_QNAME, IcioRequest.class, ConsultaObjetoIcioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IaeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IaeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "actividad", scope = ConsultaObjetoIaeRequest.class)
    public JAXBElement<IaeRequest> createConsultaObjetoIaeRequestActividad(IaeRequest value) {
        return new JAXBElement<IaeRequest>(_ConsultaObjetoIaeRequestActividad_QNAME, IaeRequest.class, ConsultaObjetoIaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoIaeRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoIaeRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoIaeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoCementerioRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoCementerioRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoCementerioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SepulturaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SepulturaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "sepultura", scope = ConsultaObjetoCementerioRequest.class)
    public JAXBElement<SepulturaRequest> createConsultaObjetoCementerioRequestSepultura(SepulturaRequest value) {
        return new JAXBElement<SepulturaRequest>(_ConsultaObjetoCementerioRequestSepultura_QNAME, SepulturaRequest.class, ConsultaObjetoCementerioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbonadoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbonadoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "abonado", scope = ConsultaObjetoAguaRequest.class)
    public JAXBElement<AbonadoRequest> createConsultaObjetoAguaRequestAbonado(AbonadoRequest value) {
        return new JAXBElement<AbonadoRequest>(_ConsultaObjetoAguaRequestAbonado_QNAME, AbonadoRequest.class, ConsultaObjetoAguaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaObjetoAguaRequest.class)
    public JAXBElement<DatosConexion> createConsultaObjetoAguaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaObjetoAguaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaNotificacionesRequest.class)
    public JAXBElement<DatosConexion> createConsultaNotificacionesRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaNotificacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomicilioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DomicilioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "domicilio", scope = ConsultaNotificacionesRequest.class)
    public JAXBElement<DomicilioRequest> createConsultaNotificacionesRequestDomicilio(DomicilioRequest value) {
        return new JAXBElement<DomicilioRequest>(_ConsultaNotificacionesRequestDomicilio_QNAME, DomicilioRequest.class, ConsultaNotificacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "notificacion", scope = ConsultaNotificacionesRequest.class)
    public JAXBElement<NotificacionRequest> createConsultaNotificacionesRequestNotificacion(NotificacionRequest value) {
        return new JAXBElement<NotificacionRequest>(_ConsultaNotificacionesRequestNotificacion_QNAME, NotificacionRequest.class, ConsultaNotificacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "notificado", scope = ConsultaNotificacionesRequest.class)
    public JAXBElement<PersonaEntidadRequest> createConsultaNotificacionesRequestNotificado(PersonaEntidadRequest value) {
        return new JAXBElement<PersonaEntidadRequest>(_ConsultaNotificacionesRequestNotificado_QNAME, PersonaEntidadRequest.class, ConsultaNotificacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaMetadatosRequest.class)
    public JAXBElement<DatosConexion> createConsultaMetadatosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaMetadatosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadatoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MetadatoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "metadatoTarifa", scope = ConsultaMetadatosRequest.class)
    public JAXBElement<MetadatoRequest> createConsultaMetadatosRequestMetadatoTarifa(MetadatoRequest value) {
        return new JAXBElement<MetadatoRequest>(_ConsultaMetadatosRequestMetadatoTarifa_QNAME, MetadatoRequest.class, ConsultaMetadatosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaMetadatosGrupoAtribRequest.class)
    public JAXBElement<DatosConexion> createConsultaMetadatosGrupoAtribRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaMetadatosGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadatoGrupoAtribRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MetadatoGrupoAtribRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "metadatoGrupoAtrib", scope = ConsultaMetadatosGrupoAtribRequest.class)
    public JAXBElement<MetadatoGrupoAtribRequest> createConsultaMetadatosGrupoAtribRequestMetadatoGrupoAtrib(MetadatoGrupoAtribRequest value) {
        return new JAXBElement<MetadatoGrupoAtribRequest>(_ConsultaMetadatosGrupoAtribRequestMetadatoGrupoAtrib_QNAME, MetadatoGrupoAtribRequest.class, ConsultaMetadatosGrupoAtribRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaModalidadProcedimientosRequest.class)
    public JAXBElement<DatosConexion> createConsultaModalidadProcedimientosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaModalidadProcedimientosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idMatProce", scope = ConsultaModalidadProcedimientosRequest.class)
    public JAXBElement<Long> createConsultaModalidadProcedimientosRequestIdMatProce(Long value) {
        return new JAXBElement<Long>(_ConsultaProcedimientosRequestIdMatProce_QNAME, Long.class, ConsultaModalidadProcedimientosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaLiquidacionesRequest.class)
    public JAXBElement<DatosConexion> createConsultaLiquidacionesRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaLiquidacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LiquidacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "liquidacion", scope = ConsultaLiquidacionesRequest.class)
    public JAXBElement<LiquidacionRequest> createConsultaLiquidacionesRequestLiquidacion(LiquidacionRequest value) {
        return new JAXBElement<LiquidacionRequest>(_ConsultaLiquidacionesRequestLiquidacion_QNAME, LiquidacionRequest.class, ConsultaLiquidacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "objetoTributario", scope = ConsultaLiquidacionesRequest.class)
    public JAXBElement<ObjetoTributarioRequest> createConsultaLiquidacionesRequestObjetoTributario(ObjetoTributarioRequest value) {
        return new JAXBElement<ObjetoTributarioRequest>(_ConsultaRecibosRequestObjetoTributario_QNAME, ObjetoTributarioRequest.class, ConsultaLiquidacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "propietario", scope = ConsultaLiquidacionesRequest.class)
    public JAXBElement<PersonaEntidadRequest> createConsultaLiquidacionesRequestPropietario(PersonaEntidadRequest value) {
        return new JAXBElement<PersonaEntidadRequest>(_ConsultaLiquidacionesRequestPropietario_QNAME, PersonaEntidadRequest.class, ConsultaLiquidacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "recibo", scope = ConsultaLiquidacionesRequest.class)
    public JAXBElement<ReciboRequest> createConsultaLiquidacionesRequestRecibo(ReciboRequest value) {
        return new JAXBElement<ReciboRequest>(_ConsultaRecibosRequestRecibo_QNAME, ReciboRequest.class, ConsultaLiquidacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaJustificantesGastosRequest.class)
    public JAXBElement<DatosConexion> createConsultaJustificantesGastosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaJustificantesGastosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JusGastosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JusGastosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "jusGastos", scope = ConsultaJustificantesGastosRequest.class)
    public JAXBElement<JusGastosRequest> createConsultaJustificantesGastosRequestJusGastos(JusGastosRequest value) {
        return new JAXBElement<JusGastosRequest>(_ConsultaJustificantesGastosRequestJusGastos_QNAME, JusGastosRequest.class, ConsultaJustificantesGastosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apartado", scope = ConsultaInfraccionesRequest.class)
    public JAXBElement<String> createConsultaInfraccionesRequestApartado(String value) {
        return new JAXBElement<String>(_ConsultaInfraccionesRequestApartado_QNAME, String.class, ConsultaInfraccionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "articulo", scope = ConsultaInfraccionesRequest.class)
    public JAXBElement<String> createConsultaInfraccionesRequestArticulo(String value) {
        return new JAXBElement<String>(_ConsultaInfraccionesRequestArticulo_QNAME, String.class, ConsultaInfraccionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaInfraccionesRequest.class)
    public JAXBElement<DatosConexion> createConsultaInfraccionesRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaInfraccionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "opcion", scope = ConsultaInfraccionesRequest.class)
    public JAXBElement<String> createConsultaInfraccionesRequestOpcion(String value) {
        return new JAXBElement<String>(_ConsultaInfraccionesRequestOpcion_QNAME, String.class, ConsultaInfraccionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipInfra", scope = ConsultaInfraccionesRequest.class)
    public JAXBElement<Short> createConsultaInfraccionesRequestTipInfra(Short value) {
        return new JAXBElement<Short>(_VolanteRequestTipInfra_QNAME, Short.class, ConsultaInfraccionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaFestivosRequest.class)
    public JAXBElement<DatosConexion> createConsultaFestivosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaFestivosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "indTipFesti", scope = ConsultaFestivosRequest.class)
    public JAXBElement<Short> createConsultaFestivosRequestIndTipFesti(Short value) {
        return new JAXBElement<Short>(_ConsultaFestivosRequestIndTipFesti_QNAME, Short.class, ConsultaFestivosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaFacturaRequest.class)
    public JAXBElement<DatosConexion> createConsultaFacturaRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaFacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacturaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "factura", scope = ConsultaFacturaRequest.class)
    public JAXBElement<FacturaRequest> createConsultaFacturaRequestFactura(FacturaRequest value) {
        return new JAXBElement<FacturaRequest>(_ConsultaFacturaRequestFactura_QNAME, FacturaRequest.class, ConsultaFacturaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaTramitacionRequest.class)
    public JAXBElement<DatosConexion> createConsultaTramitacionRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaTramitacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idExped", scope = ConsultaTramitacionRequest.class)
    public JAXBElement<Integer> createConsultaTramitacionRequestIdExped(Integer value) {
        return new JAXBElement<Integer>(_ConsultaTramitacionRequestIdExped_QNAME, Integer.class, ConsultaTramitacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = ConsultaTramitacionRequest.class)
    public JAXBElement<Long> createConsultaTramitacionRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, ConsultaTramitacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = ConsultaTramitacionRequest.class)
    public JAXBElement<Long> createConsultaTramitacionRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, ConsultaTramitacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaCitaInternetRequest.class)
    public JAXBElement<DatosConexion> createConsultaCitaInternetRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "documento", scope = ConsultaCitaInternetRequest.class)
    public JAXBElement<String> createConsultaCitaInternetRequestDocumento(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestDocumento_QNAME, String.class, ConsultaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idCita", scope = ConsultaCitaInternetRequest.class)
    public JAXBElement<Long> createConsultaCitaInternetRequestIdCita(Long value) {
        return new JAXBElement<Long>(_ConsultaCitaInternetRequestIdCita_QNAME, Long.class, ConsultaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaCentrosRequest.class)
    public JAXBElement<DatosConexion> createConsultaCentrosRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaCentrosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idCentr", scope = ConsultaCentrosRequest.class)
    public JAXBElement<Long> createConsultaCentrosRequestIdCentr(Long value) {
        return new JAXBElement<Long>(_ConsultaCentrosRequestIdCentr_QNAME, Long.class, ConsultaCentrosRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaCentrosHorarioRequest.class)
    public JAXBElement<DatosConexion> createConsultaCentrosHorarioRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaCentrosHorarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecha", scope = ConsultaCentrosHorarioRequest.class)
    public JAXBElement<String> createConsultaCentrosHorarioRequestFecha(String value) {
        return new JAXBElement<String>(_ConsultaCentrosHorarioRequestFecha_QNAME, String.class, ConsultaCentrosHorarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idCentr", scope = ConsultaCentrosHorarioRequest.class)
    public JAXBElement<Long> createConsultaCentrosHorarioRequestIdCentr(Long value) {
        return new JAXBElement<Long>(_ConsultaCentrosRequestIdCentr_QNAME, Long.class, ConsultaCentrosHorarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaAutoLiquidacionRequest.class)
    public JAXBElement<DatosConexion> createConsultaAutoLiquidacionRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaAutoLiquidacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAuto", scope = ConsultaAutoLiquidacionRequest.class)
    public JAXBElement<Long> createConsultaAutoLiquidacionRequestIdAuto(Long value) {
        return new JAXBElement<Long>(_DesconexionAutoLiquidacioneRequestIdAuto_QNAME, Long.class, ConsultaAutoLiquidacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "sesion", scope = ConsultaAutoLiquidacionRequest.class)
    public JAXBElement<String> createConsultaAutoLiquidacionRequestSesion(String value) {
        return new JAXBElement<String>(_ConsultaAutoLiquidacionRequestSesion_QNAME, String.class, ConsultaAutoLiquidacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaAutoLiquidacionInternetRequest.class)
    public JAXBElement<DatosConexion> createConsultaAutoLiquidacionInternetRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaAutoLiquidacionInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = ConsultaAutoLiquidacionInternetRequest.class)
    public JAXBElement<String> createConsultaAutoLiquidacionInternetRequestIdHisRecib(String value) {
        return new JAXBElement<String>(_ReciboRequestIdHisRecib_QNAME, String.class, ConsultaAutoLiquidacionInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idRecib", scope = ConsultaAutoLiquidacionInternetRequest.class)
    public JAXBElement<String> createConsultaAutoLiquidacionInternetRequestIdRecib(String value) {
        return new JAXBElement<String>(_ReciboRequestIdRecib_QNAME, String.class, ConsultaAutoLiquidacionInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArchivoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "archivo", scope = ConsultaArchivoRequest.class)
    public JAXBElement<ArchivoRequest> createConsultaArchivoRequestArchivo(ArchivoRequest value) {
        return new JAXBElement<ArchivoRequest>(_ConsultaArchivoRequestArchivo_QNAME, ArchivoRequest.class, ConsultaArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaArchivoRequest.class)
    public JAXBElement<DatosConexion> createConsultaArchivoRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AplicacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "aplicacion", scope = ConsultaAplicacionesRequest.class)
    public JAXBElement<AplicacionRequest> createConsultaAplicacionesRequestAplicacion(AplicacionRequest value) {
        return new JAXBElement<AplicacionRequest>(_ConsultaAplicacionesRequestAplicacion_QNAME, AplicacionRequest.class, ConsultaAplicacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ConsultaAplicacionesRequest.class)
    public JAXBElement<DatosConexion> createConsultaAplicacionesRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ConsultaAplicacionesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = AutoLiquidacionInternetHRequest.class)
    public JAXBElement<DatosConexion> createAutoLiquidacionInternetHRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, AutoLiquidacionInternetHRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = AutoLiquidacionInternetHRequest.class)
    public JAXBElement<String> createAutoLiquidacionInternetHRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, AutoLiquidacionInternetHRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = AnularCitaInternetRequest.class)
    public JAXBElement<DatosConexion> createAnularCitaInternetRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, AnularCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idCita", scope = AnularCitaInternetRequest.class)
    public JAXBElement<Long> createAnularCitaInternetRequestIdCita(Long value) {
        return new JAXBElement<Long>(_ConsultaCitaInternetRequestIdCita_QNAME, Long.class, AnularCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido1", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestApellido1(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido1_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido2", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestApellido2(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido2_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "cve", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestCve(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestCve_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = AltaRegistroRequest.class)
    public JAXBElement<DatosConexion> createAltaRegistroRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desProce", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestDesProce(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestDesProce_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeExped", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestEjeExped(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestEjeExped_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "extracto", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestExtracto(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestExtracto_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fichero64", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestFichero64(String value) {
        return new JAXBElement<String>(_VolanteImagenRequestFichero64_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "forNotif", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestForNotif(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestForNotif_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombre", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestNombre(String value) {
        return new JAXBElement<String>(_VolanteRequestNombre_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombreFichero", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestNombreFichero(String value) {
        return new JAXBElement<String>(_ArchivoRequestNombreFichero_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numExped", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestNumExped(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestNumExped_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "obsFichero", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestObsFichero(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestObsFichero_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "observaciones", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestObservaciones(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestObservaciones_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "oficina", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestOficina(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestOficina_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "razSocial", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestRazSocial(String value) {
        return new JAXBElement<String>(_VolanteRequestRazSocial_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "sesion", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestSesion(String value) {
        return new JAXBElement<String>(_ConsultaAutoLiquidacionRequestSesion_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tema", scope = AltaRegistroRequest.class)
    public JAXBElement<String> createAltaRegistroRequestTema(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestTema_QNAME, String.class, AltaRegistroRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = CobroContabilidadRequest.class)
    public JAXBElement<DatosConexion> createCobroContabilidadRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAutol", scope = CobroContabilidadRequest.class)
    public JAXBElement<Long> createCobroContabilidadRequestIdAutol(Long value) {
        return new JAXBElement<Long>(_CobroContabilidadRequestIdAutol_QNAME, Long.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idConta", scope = CobroContabilidadRequest.class)
    public JAXBElement<Long> createCobroContabilidadRequestIdConta(Long value) {
        return new JAXBElement<Long>(_OperacionRequestIdConta_QNAME, Long.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = CobroContabilidadRequest.class)
    public JAXBElement<Long> createCobroContabilidadRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = CobroContabilidadRequest.class)
    public JAXBElement<Long> createCobroContabilidadRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numDocum", scope = CobroContabilidadRequest.class)
    public JAXBElement<String> createCobroContabilidadRequestNumDocum(String value) {
        return new JAXBElement<String>(_VehiculoRequestNumDocum_QNAME, String.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ordinal", scope = CobroContabilidadRequest.class)
    public JAXBElement<Short> createCobroContabilidadRequestOrdinal(Short value) {
        return new JAXBElement<Short>(_CobroContabilidadRequestOrdinal_QNAME, Short.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipoObjeto", scope = CobroContabilidadRequest.class)
    public JAXBElement<String> createCobroContabilidadRequestTipoObjeto(String value) {
        return new JAXBElement<String>(_CobroContabilidadRequestTipoObjeto_QNAME, String.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipoTercero", scope = CobroContabilidadRequest.class)
    public JAXBElement<Short> createCobroContabilidadRequestTipoTercero(Short value) {
        return new JAXBElement<Short>(_CobroContabilidadRequestTipoTercero_QNAME, Short.class, CobroContabilidadRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido1", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestApellido1(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido1_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "apellido2", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestApellido2(String value) {
        return new JAXBElement<String>(_VolanteRequestApellido2_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "corInter", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestCorInter(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestCorInter_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = AltaCitaInternetRequest.class)
    public JAXBElement<DatosConexion> createAltaCitaInternetRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "documento", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestDocumento(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestDocumento_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecCita", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestFecCita(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestFecCita_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "horCita", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestHorCita(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestHorCita_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idCentr", scope = AltaCitaInternetRequest.class)
    public JAXBElement<Long> createAltaCitaInternetRequestIdCentr(Long value) {
        return new JAXBElement<Long>(_ConsultaCentrosRequestIdCentr_QNAME, Long.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "movInter", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestMovInter(String value) {
        return new JAXBElement<String>(_AltaCitaInternetRequestMovInter_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombre", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestNombre(String value) {
        return new JAXBElement<String>(_VolanteRequestNombre_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "telInter", scope = AltaCitaInternetRequest.class)
    public JAXBElement<String> createAltaCitaInternetRequestTelInter(String value) {
        return new JAXBElement<String>(_AltaCitaInternetRequestTelInter_QNAME, String.class, AltaCitaInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ActualizarReciboPTRequest.class)
    public JAXBElement<DatosConexion> createActualizarReciboPTRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ActualizarReciboPTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeRecib", scope = ActualizarReciboPTRequest.class)
    public JAXBElement<Short> createActualizarReciboPTRequestEjeRecib(Short value) {
        return new JAXBElement<Short>(_ReciboRequestEjeRecib_QNAME, Short.class, ActualizarReciboPTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = ActualizarReciboPTRequest.class)
    public JAXBElement<Long> createActualizarReciboPTRequestIdHisRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdHisRecib_QNAME, Long.class, ActualizarReciboPTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numRecib", scope = ActualizarReciboPTRequest.class)
    public JAXBElement<Integer> createActualizarReciboPTRequestNumRecib(Integer value) {
        return new JAXBElement<Integer>(_ReciboRequestNumRecib_QNAME, Integer.class, ActualizarReciboPTRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ActualizarReciboRequest.class)
    public JAXBElement<DatosConexion> createActualizarReciboRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ActualizarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "reciboCabecera", scope = ActualizarReciboRequest.class)
    public JAXBElement<ReciboCabeceraWs> createActualizarReciboRequestReciboCabecera(ReciboCabeceraWs value) {
        return new JAXBElement<ReciboCabeceraWs>(_ActualizarReciboRequestReciboCabecera_QNAME, ReciboCabeceraWs.class, ActualizarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "autorizacion", scope = ActualizarReciboInternetRequest.class)
    public JAXBElement<String> createActualizarReciboInternetRequestAutorizacion(String value) {
        return new JAXBElement<String>(_ActualizarReciboInternetRequestAutorizacion_QNAME, String.class, ActualizarReciboInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ActualizarReciboInternetRequest.class)
    public JAXBElement<DatosConexion> createActualizarReciboInternetRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ActualizarReciboInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = ActualizarReciboInternetRequest.class)
    public JAXBElement<Long> createActualizarReciboInternetRequestIdHisRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdHisRecib_QNAME, Long.class, ActualizarReciboInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idRecib", scope = ActualizarReciboInternetRequest.class)
    public JAXBElement<Long> createActualizarReciboInternetRequestIdRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdRecib_QNAME, Long.class, ActualizarReciboInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "status", scope = ActualizarReciboInternetRequest.class)
    public JAXBElement<String> createActualizarReciboInternetRequestStatus(String value) {
        return new JAXBElement<String>(_ActualizarReciboInternetRequestStatus_QNAME, String.class, ActualizarReciboInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ActualizarReciboInternet2Request.class)
    public JAXBElement<DatosConexion> createActualizarReciboInternet2RequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ActualizarReciboInternet2Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAuto", scope = ActualizarReciboInternet2Request.class)
    public JAXBElement<Long> createActualizarReciboInternet2RequestIdAuto(Long value) {
        return new JAXBElement<Long>(_DesconexionAutoLiquidacioneRequestIdAuto_QNAME, Long.class, ActualizarReciboInternet2Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = ActualizarReciboInternet2Request.class)
    public JAXBElement<Long> createActualizarReciboInternet2RequestIdHisRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdHisRecib_QNAME, Long.class, ActualizarReciboInternet2Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idRecib", scope = ActualizarReciboInternet2Request.class)
    public JAXBElement<Long> createActualizarReciboInternet2RequestIdRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdRecib_QNAME, Long.class, ActualizarReciboInternet2Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = ActualizarNotificacionRequest.class)
    public JAXBElement<DatosConexion> createActualizarNotificacionRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, ActualizarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "notificacionRequest", scope = ActualizarNotificacionRequest.class)
    public JAXBElement<NotificacionWs> createActualizarNotificacionRequestNotificacionRequest(NotificacionWs value) {
        return new JAXBElement<NotificacionWs>(_ActualizarNotificacionRequestNotificacionRequest_QNAME, NotificacionWs.class, ActualizarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarVolanteImagenRequest.class)
    public JAXBElement<DatosConexion> createGenerarVolanteImagenRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarVolanteImagenRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolanteImagenRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolanteImagenRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "volanteImagen", scope = GenerarVolanteImagenRequest.class)
    public JAXBElement<VolanteImagenRequest> createGenerarVolanteImagenRequestVolanteImagen(VolanteImagenRequest value) {
        return new JAXBElement<VolanteImagenRequest>(_GenerarVolanteImagenRequestVolanteImagen_QNAME, VolanteImagenRequest.class, GenerarVolanteImagenRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarVolanteRequest.class)
    public JAXBElement<DatosConexion> createGenerarVolanteRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarVolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolanteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolanteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "volante", scope = GenerarVolanteRequest.class)
    public JAXBElement<VolanteRequest> createGenerarVolanteRequestVolante(VolanteRequest value) {
        return new JAXBElement<VolanteRequest>(_VolanteImagenRequestVolante_QNAME, VolanteRequest.class, GenerarVolanteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarVehiculoRequest.class)
    public JAXBElement<DatosConexion> createGenerarVehiculoRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarVehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoDGTRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculoDGTRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "vehiculo", scope = GenerarVehiculoRequest.class)
    public JAXBElement<VehiculoDGTRequest> createGenerarVehiculoRequestVehiculo(VehiculoDGTRequest value) {
        return new JAXBElement<VehiculoDGTRequest>(_ConsultaObjetoVehiculoRequestVehiculo_QNAME, VehiculoDGTRequest.class, GenerarVehiculoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarReciboRequest.class)
    public JAXBElement<DatosConexion> createGenerarReciboRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = GenerarReciboRequest.class)
    public JAXBElement<Long> createGenerarReciboRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = GenerarReciboRequest.class)
    public JAXBElement<Long> createGenerarReciboRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idImpue", scope = GenerarReciboRequest.class)
    public JAXBElement<Long> createGenerarReciboRequestIdImpue(Long value) {
        return new JAXBElement<Long>(_GenerarReciboRequestIdImpue_QNAME, Long.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = GenerarReciboRequest.class)
    public JAXBElement<Long> createGenerarReciboRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = GenerarReciboRequest.class)
    public JAXBElement<Long> createGenerarReciboRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "impPrinc", scope = GenerarReciboRequest.class)
    public JAXBElement<BigDecimal> createGenerarReciboRequestImpPrinc(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GenerarReciboRequestImpPrinc_QNAME, BigDecimal.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nomPadro", scope = GenerarReciboRequest.class)
    public JAXBElement<String> createGenerarReciboRequestNomPadro(String value) {
        return new JAXBElement<String>(_GenerarReciboRequestNomPadro_QNAME, String.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "observaciones", scope = GenerarReciboRequest.class)
    public JAXBElement<String> createGenerarReciboRequestObservaciones(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestObservaciones_QNAME, String.class, GenerarReciboRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<DatosConexion> createGenerarObjetoTributarioRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desObjTribu", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<String> createGenerarObjetoTributarioRequestDesObjTribu(String value) {
        return new JAXBElement<String>(_ObjetoTributarioRequestDesObjTribu_QNAME, String.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisTipObjTribu", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioRequestIdHisTipObjTribu(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioRequestIdHisTipObjTribu_QNAME, Long.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idTipObjTribu", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioRequestIdTipObjTribu(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioRequestIdTipObjTribu_QNAME, Long.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "observaciones", scope = GenerarObjetoTributarioRequest.class)
    public JAXBElement<String> createGenerarObjetoTributarioRequestObservaciones(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestObservaciones_QNAME, String.class, GenerarObjetoTributarioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarObjetoTributarioMdRequest.class)
    public JAXBElement<DatosConexion> createGenerarObjetoTributarioMdRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "etiGruAtrib", scope = GenerarObjetoTributarioMdRequest.class)
    public JAXBElement<String> createGenerarObjetoTributarioMdRequestEtiGruAtrib(String value) {
        return new JAXBElement<String>(_MetadatoRequestEtiGruAtrib_QNAME, String.class, GenerarObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idGrupo", scope = GenerarObjetoTributarioMdRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioMdRequestIdGrupo(Long value) {
        return new JAXBElement<Long>(_ObjetoTributarioMdRequestIdGrupo_QNAME, Long.class, GenerarObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisObjTribu", scope = GenerarObjetoTributarioMdRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioMdRequestIdHisObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisObjTribu_QNAME, Long.class, GenerarObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idObjTribu", scope = GenerarObjetoTributarioMdRequest.class)
    public JAXBElement<Long> createGenerarObjetoTributarioMdRequestIdObjTribu(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdObjTribu_QNAME, Long.class, GenerarObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "valor", scope = GenerarObjetoTributarioMdRequest.class)
    public JAXBElement<String> createGenerarObjetoTributarioMdRequestValor(String value) {
        return new JAXBElement<String>(_MetadatoRequestValor_QNAME, String.class, GenerarObjetoTributarioMdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codEntid", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Short> createGenerarNotificacionRequestCodEntid(Short value) {
        return new JAXBElement<Short>(_FicheroTeuRequestCodEntid_QNAME, Short.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codMunic", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Short> createGenerarNotificacionRequestCodMunic(Short value) {
        return new JAXBElement<Short>(_ConsultaTerritorioRequestCodMunic_QNAME, Short.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codPosta", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Integer> createGenerarNotificacionRequestCodPosta(Integer value) {
        return new JAXBElement<Integer>(_GenerarNotificacionRequestCodPosta_QNAME, Integer.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codProvi", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Short> createGenerarNotificacionRequestCodProvi(Short value) {
        return new JAXBElement<Short>(_ConsultaTerritorioRequestCodProvi_QNAME, Short.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarNotificacionRequest.class)
    public JAXBElement<DatosConexion> createGenerarNotificacionRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "desVial", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestDesVial(String value) {
        return new JAXBElement<String>(_GenerarNotificacionRequestDesVial_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "domicilio", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestDomicilio(String value) {
        return new JAXBElement<String>(_ConsultaNotificacionesRequestDomicilio_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeExped", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Short> createGenerarNotificacionRequestEjeExped(Short value) {
        return new JAXBElement<Short>(_AltaRegistroRequestEjeExped_QNAME, Short.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecNotif", scope = GenerarNotificacionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createGenerarNotificacionRequestFecNotif(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GenerarNotificacionRequestFecNotif_QNAME, XMLGregorianCalendar.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "forNotif", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Short> createGenerarNotificacionRequestForNotif(Short value) {
        return new JAXBElement<Short>(_AltaRegistroRequestForNotif_QNAME, Short.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Long> createGenerarNotificacionRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Long> createGenerarNotificacionRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "localidad", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestLocalidad(String value) {
        return new JAXBElement<String>(_GenerarNotificacionRequestLocalidad_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "notificacion", scope = GenerarNotificacionRequest.class)
    public JAXBElement<NotificacionRequest> createGenerarNotificacionRequestNotificacion(NotificacionRequest value) {
        return new JAXBElement<NotificacionRequest>(_ConsultaNotificacionesRequestNotificacion_QNAME, NotificacionRequest.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numExped", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestNumExped(String value) {
        return new JAXBElement<String>(_AltaRegistroRequestNumExped_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numInfer", scope = GenerarNotificacionRequest.class)
    public JAXBElement<Short> createGenerarNotificacionRequestNumInfer(Short value) {
        return new JAXBElement<Short>(_GenerarNotificacionRequestNumInfer_QNAME, Short.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "planta", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestPlanta(String value) {
        return new JAXBElement<String>(_GenerarNotificacionRequestPlanta_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "puerta", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestPuerta(String value) {
        return new JAXBElement<String>(_GenerarNotificacionRequestPuerta_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipVial", scope = GenerarNotificacionRequest.class)
    public JAXBElement<String> createGenerarNotificacionRequestTipVial(String value) {
        return new JAXBElement<String>(_GenerarNotificacionRequestTipVial_QNAME, String.class, GenerarNotificacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codigoObjetoTributario", scope = AutoliquidacionInternetRequest.class)
    public JAXBElement<String> createAutoliquidacionInternetRequestCodigoObjetoTributario(String value) {
        return new JAXBElement<String>(_AutoliquidacionInternetRequestCodigoObjetoTributario_QNAME, String.class, AutoliquidacionInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codigoTipoObjetoTributario", scope = AutoliquidacionInternetRequest.class)
    public JAXBElement<String> createAutoliquidacionInternetRequestCodigoTipoObjetoTributario(String value) {
        return new JAXBElement<String>(_AutoliquidacionInternetRequestCodigoTipoObjetoTributario_QNAME, String.class, AutoliquidacionInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = AutoliquidacionInternetRequest.class)
    public JAXBElement<DatosConexion> createAutoliquidacionInternetRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, AutoliquidacionInternetRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codEntid", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Short> createAutoliquidacionesInternetRecaudacionRequestCodEntid(Short value) {
        return new JAXBElement<Short>(_FicheroTeuRequestCodEntid_QNAME, Short.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codPostaInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Integer> createAutoliquidacionesInternetRecaudacionRequestCodPostaInter(Integer value) {
        return new JAXBElement<Integer>(_AutoliquidacionesInternetRecaudacionRequestCodPostaInter_QNAME, Integer.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codPostaRepre", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Integer> createAutoliquidacionesInternetRecaudacionRequestCodPostaRepre(Integer value) {
        return new JAXBElement<Integer>(_AutoliquidacionesInternetRecaudacionRequestCodPostaRepre_QNAME, Integer.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "corInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestCorInter(String value) {
        return new JAXBElement<String>(_EnvioCorreoRequestCorInter_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "correo", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestCorreo(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestCorreo_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<DatosConexion> createAutoliquidacionesInternetRecaudacionRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "dirInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestDirInter(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestDirInter_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "dirRepre", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestDirRepre(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestDirRepre_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "dniCifRepre", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestDniCifRepre(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestDniCifRepre_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "ejeRecib", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Short> createAutoliquidacionesInternetRecaudacionRequestEjeRecib(Short value) {
        return new JAXBElement<Short>(_ReciboRequestEjeRecib_QNAME, Short.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "estado", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Short> createAutoliquidacionesInternetRecaudacionRequestEstado(Short value) {
        return new JAXBElement<Short>(_ArchivoRequestEstado_QNAME, Short.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecProceso", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createAutoliquidacionesInternetRecaudacionRequestFecProceso(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AutoliquidacionesInternetRecaudacionRequestFecProceso_QNAME, XMLGregorianCalendar.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idAuto", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Long> createAutoliquidacionesInternetRecaudacionRequestIdAuto(Long value) {
        return new JAXBElement<Long>(_DesconexionAutoLiquidacioneRequestIdAuto_QNAME, Long.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisPerso", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Long> createAutoliquidacionesInternetRecaudacionRequestIdHisPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdHisPerso_QNAME, Long.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idHisRecib", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Long> createAutoliquidacionesInternetRecaudacionRequestIdHisRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdHisRecib_QNAME, Long.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idImpue", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Long> createAutoliquidacionesInternetRecaudacionRequestIdImpue(Long value) {
        return new JAXBElement<Long>(_GenerarReciboRequestIdImpue_QNAME, Long.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPerso", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Long> createAutoliquidacionesInternetRecaudacionRequestIdPerso(Long value) {
        return new JAXBElement<Long>(_VehiculoRequestIdPerso_QNAME, Long.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idRecib", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Long> createAutoliquidacionesInternetRecaudacionRequestIdRecib(Long value) {
        return new JAXBElement<Long>(_ReciboRequestIdRecib_QNAME, Long.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "importe", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<BigDecimal> createAutoliquidacionesInternetRecaudacionRequestImporte(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AutoliquidacionesInternetRecaudacionRequestImporte_QNAME, BigDecimal.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "modPerte", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Short> createAutoliquidacionesInternetRecaudacionRequestModPerte(Short value) {
        return new JAXBElement<Short>(_ArchivoRequestModPerte_QNAME, Short.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "movInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestMovInter(String value) {
        return new JAXBElement<String>(_AltaCitaInternetRequestMovInter_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "movil", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestMovil(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestMovil_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "munInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestMunInter(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestMunInter_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "munRepre", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestMunRepre(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestMunRepre_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "nombreRepre", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestNombreRepre(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestNombreRepre_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "numRecib", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<Integer> createAutoliquidacionesInternetRecaudacionRequestNumRecib(Integer value) {
        return new JAXBElement<Integer>(_ReciboRequestNumRecib_QNAME, Integer.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "orden", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestOrden(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestOrden_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "proInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestProInter(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestProInter_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "proRepre", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestProRepre(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestProRepre_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "sesion", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestSesion(String value) {
        return new JAXBElement<String>(_ConsultaAutoLiquidacionRequestSesion_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "telInter", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestTelInter(String value) {
        return new JAXBElement<String>(_AltaCitaInternetRequestTelInter_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "telefono", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestTelefono(String value) {
        return new JAXBElement<String>(_AutoliquidacionesInternetRecaudacionRequestTelefono_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tipoObjeto", scope = AutoliquidacionesInternetRecaudacionRequest.class)
    public JAXBElement<String> createAutoliquidacionesInternetRecaudacionRequestTipoObjeto(String value) {
        return new JAXBElement<String>(_CobroContabilidadRequestTipoObjeto_QNAME, String.class, AutoliquidacionesInternetRecaudacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArchivoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "archivo", scope = GenerarArchivoRequest.class)
    public JAXBElement<ArchivoRequest> createGenerarArchivoRequestArchivo(ArchivoRequest value) {
        return new JAXBElement<ArchivoRequest>(_ConsultaArchivoRequestArchivo_QNAME, ArchivoRequest.class, GenerarArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "codEntid", scope = GenerarArchivoRequest.class)
    public JAXBElement<Short> createGenerarArchivoRequestCodEntid(Short value) {
        return new JAXBElement<Short>(_FicheroTeuRequestCodEntid_QNAME, Short.class, GenerarArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = GenerarArchivoRequest.class)
    public JAXBElement<DatosConexion> createGenerarArchivoRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, GenerarArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fichero", scope = GenerarArchivoRequest.class)
    public JAXBElement<String> createGenerarArchivoRequestFichero(String value) {
        return new JAXBElement<String>(_GenerarArchivoRequestFichero_QNAME, String.class, GenerarArchivoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "datosConexion", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<DatosConexion> createRespuestaActualizacionRequestDatosConexion(DatosConexion value) {
        return new JAXBElement<DatosConexion>(_ValidarUsuarioGosRequestDatosConexion_QNAME, DatosConexion.class, RespuestaActualizacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "estado", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<Short> createRespuestaActualizacionRequestEstado(Short value) {
        return new JAXBElement<Short>(_ArchivoRequestEstado_QNAME, Short.class, RespuestaActualizacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "fecha", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<XMLGregorianCalendar> createRespuestaActualizacionRequestFecha(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConsultaCentrosHorarioRequestFecha_QNAME, XMLGregorianCalendar.class, RespuestaActualizacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idDoc", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<Long> createRespuestaActualizacionRequestIdDoc(Long value) {
        return new JAXBElement<Long>(_RespuestaActualizacionRequestIdDoc_QNAME, Long.class, RespuestaActualizacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "idPeticion", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<Long> createRespuestaActualizacionRequestIdPeticion(Long value) {
        return new JAXBElement<Long>(_RespuestaActualizacionRequestIdPeticion_QNAME, Long.class, RespuestaActualizacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tagsDoc", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<String> createRespuestaActualizacionRequestTagsDoc(String value) {
        return new JAXBElement<String>(_RespuestaActualizacionRequestTagsDoc_QNAME, String.class, RespuestaActualizacionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.gf.gos.greenaall.es/xsd", name = "tagsPeticion", scope = RespuestaActualizacionRequest.class)
    public JAXBElement<String> createRespuestaActualizacionRequestTagsPeticion(String value) {
        return new JAXBElement<String>(_RespuestaActualizacionRequestTagsPeticion_QNAME, String.class, RespuestaActualizacionRequest.class, value);
    }

}
